/* Animable_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Animable_Sub1 extends Animable
{
	static int anInt9095;
	static int anInt9096;
	static int anInt9097;
	static int anInt9098;
	static int anInt9099;
	static int anInt9100;
	static int anInt9101 = -1;
	protected short aShort9102;
	static int anInt9103;
	static int anInt9104;
	static boolean aBoolean9105;
	
	static final void method824(byte b) {
		Client.anInt5471++;
		if (b <= 21) {
			aBoolean9105 = false;
		}
		anInt9104++;
		Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Class239.aClass318_2929, Class218.aClass123_2566.anIsaacCipher1571);
		node_sub13.aPacket7113.writeInt(Class175.anInt2097);
		Class218.aClass123_2566.sendPacket(127, node_sub13);
	}
	
	final boolean method815(byte b, GraphicsToolkit graphicstoolkit) {
		anInt9100++;
		if (b != 59) {
			aShort9102 = (short) -95;
		}
		return Class313.method3649(true, anInt5940 >> Class36.anInt549, aByte5931, anInt5934 >> Class36.anInt549);
	}
	
	static final void method825(byte b) {
		anInt9099++;
		if (b != -68) {
			method825((byte) 32);
		}
		if (Class235_Sub1.anInterface16Array8978 != null) {
			Interface16[] interface16s = Class235_Sub1.anInterface16Array8978;
			for (int i = 0; (i ^ 0xffffffff) > (interface16s.length ^ 0xffffffff); i++) {
				Interface16 interface16 = interface16s[i];
				interface16.method62(1939);
			}
		}
	}
	
	final boolean method806(int i) {
		anInt9095++;
		if (i != 0) {
			return false;
		}
		return Class139.aBooleanArrayArray1730[Node_Sub9_Sub1.anInt9656 + ((anInt5934 >> Class36.anInt549) - Class216.anInt2551)][Node_Sub9_Sub1.anInt9656 + (-EntityNode_Sub7.anInt6013 + (anInt5940 >> Class36.anInt549))];
	}
	
	static final void method826(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		anInt9097++;
		if (i_0_ != -1) {
			method824((byte) -108);
		}
		Animable_Sub3.method919(i_6_, 512, i_5_, i, i_1_, false, 0);
	}
	
	Animable_Sub1(int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		plane = (byte) i_10_;
		anInt5937 = i_8_;
		anInt5940 = i_9_;
		aShort9102 = (short) i_12_;
		aByte5931 = (byte) i_11_;
		anInt5934 = i;
	}
	
	final int method819(Node_Sub29[] node_sub29s, int i) {
		anInt9103++;
		if (i != 1) {
			aShort9102 = (short) -111;
		}
		return this.method808(i ^ ~0x59ee, node_sub29s, anInt5940 >> Class36.anInt549, anInt5934 >> Class36.anInt549);
	}
}
