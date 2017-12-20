/* Class201_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

public class Class201_Sub1 extends Class201
{
	private ByteBuffer aByteBuffer6909;
	
	final void method2021(byte[] bs, int i) {
		aByteBuffer6909 = ByteBuffer.allocateDirect(bs.length);
		aByteBuffer6909.position(i);
		aByteBuffer6909.put(bs);
	}
	
	Class201_Sub1() {
		/* empty */
	}
	
	final byte[] method2020(byte b, int i, int i_0_) {
		byte[] bs = new byte[i];
		aByteBuffer6909.position(i_0_);
		aByteBuffer6909.get(bs, 0, i);
		@SuppressWarnings("unused")
		int i_1_ = 75 % ((b - 44) / 45);
		return bs;
	}
	
	final byte[] method2022(byte b) {
		byte[] bs = new byte[aByteBuffer6909.capacity()];
		aByteBuffer6909.position(0);
		if (b < 73) {
			aByteBuffer6909 = null;
		}
		aByteBuffer6909.get(bs);
		return bs;
	}
}
