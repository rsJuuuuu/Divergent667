/* Class177 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class177
{
	private int[] anIntArray2107;
	private int anInt2108 = 2;
	protected int anInt2109;
	private int[] anIntArray2110;
	protected int anInt2111;
	protected int anInt2112;
	private int anInt2113;
	private int anInt2114;
	private int anInt2115;
	private int anInt2116;
	private int anInt2117;
	
	final void method1807(BufferedStream buffer) {
		anInt2108 = buffer.readUnsignedByte();
		anIntArray2107 = new int[anInt2108];
		anIntArray2110 = new int[anInt2108];
		for (int i = 0; i < anInt2108; i++) {
			anIntArray2107[i] = buffer.readUnsignedShort();
			anIntArray2110[i] = buffer.readUnsignedShort();
		}
	}
	
	final void method1808() {
		anInt2115 = 0;
		anInt2113 = 0;
		anInt2117 = 0;
		anInt2114 = 0;
		anInt2116 = 0;
	}
	
	final int method1809(int i) {
		if (anInt2116 >= anInt2115) {
			anInt2114 = anIntArray2110[anInt2113++] << 15;
			if (anInt2113 >= anInt2108) {
				anInt2113 = anInt2108 - 1;
			}
			anInt2115 = (int) ((double) anIntArray2107[anInt2113] / 65536.0 * (double) i);
			if (anInt2115 > anInt2116) {
				anInt2117 = ((anIntArray2110[anInt2113] << 15) - anInt2114) / (anInt2115 - anInt2116);
			}
		}
		anInt2114 += anInt2117;
		anInt2116++;
		return anInt2114 - anInt2117 >> 15;
	}
	
	final void method1810(BufferedStream buffer) {
		anInt2112 = buffer.readUnsignedByte();
		anInt2109 = buffer.readInt();
		anInt2111 = buffer.readInt();
		method1807(buffer);
	}
	
	public Class177() {
		anIntArray2107 = new int[2];
		anIntArray2110 = new int[2];
		anIntArray2107[0] = 0;
		anIntArray2107[1] = 65535;
		anIntArray2110[0] = 0;
		anIntArray2110[1] = 65535;
	}
}
