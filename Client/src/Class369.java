/* Class369 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class369
{
	protected int anInt4552;
	static int anInt4553;
	static int anInt4554;
	static boolean aBoolean4555 = false;
	protected int anInt4556;
	protected int anInt4557;
	static int anInt4558;
	static int anInt4559;
	protected int anInt4560;
	static int anInt4561;
	private int anInt4562;
	protected int anInt4563;
	static int anInt4564;
	static int anInt4565;
	
	final void method4082(byte b) {
		Class262_Sub19.method3200(anInt4552, -1, Class248.anIntArray3145[anInt4556], anInt4560, anInt4557, anInt4556, anInt4563, false);
		if (b >= -77) {
			anInt4556 = -125;
		}
		anInt4558++;
	}
	
	static final int method4083(boolean bool) {
		if (bool != false) {
			aBoolean4555 = false;
		}
		anInt4565++;
		return Node_Sub38_Sub23.anInt10347;
	}
	
	static final void method4084(byte b) {
		for (int i = 0; Class23.anInt434 > i; i++) {
			Class78 class78 = Node_Sub38_Sub19.aClass78Array10284[i];
			if (class78.aByte1027 == 3) {
				if (class78.aNode_Sub9_Sub2_1025 == null) {
					class78.anInt1022 = -2147483648;
				} else {
					Class176.aNode_Sub9_Sub3_2106.method2514(class78.aNode_Sub9_Sub2_1025);
				}
			}
		}
		if (b == -95) {
			anInt4553++;
		}
	}
	
	static final boolean method4085(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		anInt4561++;
		if ((0x2 & CacheNode_Sub11.aByteArrayArrayArray9550[i_0_][i_2_][i]) != 0) {
			return true;
		}
		if ((CacheNode_Sub11.aByteArrayArrayArray9550[i_3_][i_2_][i] & 0x10) != 0) {
			return false;
		}
        return (Class374.method4113(i, -1145, i_2_, i_3_) ^ 0xffffffff) == (i_1_ ^ 0xffffffff);
    }
	
	static final void method4086(int i, int i_4_, int i_5_, int[] is, int i_6_) {
		anInt4554++;
		i_5_--;
		if (i_6_ != 0) {
			method4084((byte) 88);
		}
		int i_7_ = -7 + --i;
		while ((i_7_ ^ 0xffffffff) < (i_5_ ^ 0xffffffff)) {
			is[++i_5_] = i_4_;
			is[++i_5_] = i_4_;
			is[++i_5_] = i_4_;
			is[++i_5_] = i_4_;
			is[++i_5_] = i_4_;
			is[++i_5_] = i_4_;
			is[++i_5_] = i_4_;
			is[++i_5_] = i_4_;
		}
		while (i > i_5_)
			is[++i_5_] = i_4_;
	}
	
	final void method4087(int i, int i_8_, byte b, int i_9_, int i_10_) {
		anInt4564++;
		Class262_Sub19.method3200(i_8_, anInt4562, Class248.anIntArray3145[anInt4556], i, i_10_, anInt4556, i_9_, false);
		anInt4563 = i_9_;
		anInt4552 = i_8_;
		anInt4557 = i_10_;
		anInt4560 = i;
		if (b != 46) {
			aBoolean4555 = true;
		}
	}
	
	Class369(BufferedStream buffer) {
		anInt4562 = buffer.method2183();
		anInt4556 = buffer.readUnsignedByte();
	}
}
