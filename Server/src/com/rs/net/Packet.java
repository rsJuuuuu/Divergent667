package com.rs.net;

/**
 * Immutable packet object.
 * @author Graham
 *
 */
public final class Packet {

	public enum Size {
		Fixed(0), 
		VariableByte(1), 
		VariableShort(2);
		
		private final int size;

		Size(int size) {
			this.size = size;
		}
		
		public int size() {
			return size;
		} 
	}

    /**
	 * The ID of the packet
	 */
	private int pID;
	/**
	 * The length of the payload
	 */
	private int pLength;
	/**
	 * The payload
	 */
	private byte[] pData;
	/**
	 * The current index into the payload buffer for reading
	 */
	private int caret = 0;

	private static Size size = Size.Fixed;

	public static int GSize(){
		
		return size.size();
	}

	public Packet(int opcode, Size size, byte[] data) {
		this.pID = opcode;
		Packet.size = size;
		this.pData = data;
		this.pLength = data.length;
	}

	/**
	 * Checks if this packet is considered to be a bare packet, which
	 * means that it does not include the standard packet header (ID
	 * and length values).
	 *
	 * @return Whether this packet is a bare packet
	 */
	public boolean isBare() {
		return pID == -1;
	}

	public Size getSize() {
		return size;
	}

	/**
	 * Returns the packet ID.
	 *
	 * @return The packet ID
	 */
	public int getId() {
		return pID;
	}

	/**
	 * Returns the length of the payload of this packet.
	 *
	 * @return The length of the packet's payload
	 */
	public int getLength() {
		return pLength;
	}

	/**
	 * Returns the entire payload data of this packet.
	 *
	 * @return The payload <code>byte</code> array
	 */
	public byte[] getData() {
		return pData;
	}

	/**
	 * Returns the remaining payload data of this packet.
	 *
	 * @return The payload <code>byte</code> array
	 */
	public byte[] getRemainingData() {
		byte[] data = new byte[pLength - caret];
        System.arraycopy(pData, 0 + caret, data, 0, data.length);
		caret += data.length;
		return data;

	}

	/**
	 * Reads the next <code>byte</code> from the payload.
	 *
	 * @return A <code>byte</code>
	 */
	public byte readByte() {
		return pData[caret++];
	}

	/**
	 * Reads the next <code>short</code> from the payload.
	 *
	 * @return A <code>short</code>
	 */
	public short readShort() {
		return (short) ((short) ((pData[caret++] & 0xff) << 8) | (short) (pData[caret++] & 0xff));
	}

	public int readLEShortA() {
		int i = ((pData[caret++] - 128 & 0xff)) + ((pData[caret++] & 0xff) << 8);
		if(i > 32767)
			i -= 0x10000;
		return i;
	}

	public int readLEShort() {
		int i = ((pData[caret++] & 0xff)) + ((pData[caret++] & 0xff) << 8);
		if(i > 32767)
			i -= 0x10000;
		return i;
	}

	/**
	 * Reads the next <code>int</code> from the payload.
	 *
	 * @return An <code>int</code>
	 */
	public int readInt() {
		return ((pData[caret++] & 0xff) << 24)
		| ((pData[caret++] & 0xff) << 16)
		| ((pData[caret++] & 0xff) << 8)
		| (pData[caret++] & 0xff);
	}

	public int readLEInt() {
		return (pData[caret++] & 0xff)
		| ((pData[caret++] & 0xff) << 8)
		| ((pData[caret++] & 0xff) << 16)
		| ((pData[caret++] & 0xff) << 24);
	}

	public int readInt1() {
		return ((pData[caret++] & 0xff) << 8)
		| (pData[caret++] & 0xff)
		| ((pData[caret++] & 0xff) << 24)
		| ((pData[caret++] & 0xff) << 16);
	}

	public int readInt2() {
		return ((pData[caret++] & 0xff) << 16) 
		| ((pData[caret++] & 0xff) << 24) 
		| (pData[caret++] & 0xff) 
		| ((pData[caret++] & 0xff) << 8);
	}

	/**
	 * Reads the next <code>long</code> from the payload.
	 *
	 * @return A <code>long</code>
	 */
	public long readLong() {
		return ((long) (pData[caret++] & 0xff) << 56)
		| ((long) (pData[caret++] & 0xff) << 48)
		| ((long) (pData[caret++] & 0xff) << 40)
		| ((long) (pData[caret++] & 0xff) << 32)
		| ((long) (pData[caret++] & 0xff) << 24)
		| ((long) (pData[caret++] & 0xff) << 16)
		| ((long) (pData[caret++] & 0xff) << 8)
		| ((pData[caret++] & 0xff));
	}

	/**
	 * Reads the string which is formed by the unread portion
	 * of the payload.
	 *
	 * @return A <code>String</code>
	 */
	public String readString() {
		return readString(pLength - caret);
	}

	public String readRS2String() {
		int start = caret;
		while (pData[caret++] != 0) ;
		return new String(pData, start, caret - start - 1);
	}

	public void readBytes(byte[] buf, int off, int len) {
		for(int i=0; i<len; i++) {
			buf[off+i] = pData[caret++];
		}
	}

	/**
	 * Reads a string of the specified length from the payload.
	 *
	 * @param length The length of the string to be read
	 * @return A <code>String</code>
	 */
	public String readString(int length) {
		String rv = new String(pData, caret, length);
		caret += length;
		return rv;
	}

	/**
	 * Skips the specified number of bytes in the payload.
	 *
	 * @param x The number of bytes to be skipped
	 */
	public void skip(int x) {
		caret += x;
	}


	public int remaining() {
		return pData.length - caret;
	}

	/**
	 * Returns this packet in string form.
	 *
	 * @return A <code>String</code> representing this packet
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[id=" + pID + ",len=" + pLength + ",data=0x");
		for(int x = 0;x < pLength;x++) {
			sb.append(byteToHex(pData[x], true));
		}
		sb.append("]");
		return sb.toString();
	}

	private static String byteToHex(byte b, boolean forceLeadingZero) {
		StringBuilder out = new StringBuilder();
		int ub = b & 0xff;
		if(ub / 16 > 0 || forceLeadingZero)
			out.append(hex[ub / 16]);
		out.append(hex[ub % 16]);
		return out.toString();
	}

	private static final char[] hex = "0123456789ABCDEF".toCharArray();

	public int readShortA() {
		caret += 2;
		return ((pData[caret-2]&0xFF)<<8)+(pData[caret-1]-128&0xFF);
	}
	public Packet readSkip(int length) {
		caret += length;
		return this;
	}
	public byte readByteC() {
		return (byte) -readByte();
	}

	public byte readByteS() {
		return (byte) (128 - readByte());
	}

	public byte readByteA() {
		return (byte) (readByte() + 128);
	}

	public Packet rewind() {
		caret = 0;
		return this;
	}

}
