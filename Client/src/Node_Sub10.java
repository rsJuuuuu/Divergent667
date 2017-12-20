/* Node_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub10 extends Node
{
	protected int anInt7076;
	protected int anInt7077;
	protected int anInt7078;
	static int anInt7079;
	protected int anInt7080;
	static String aString7081 = "";
	protected int anInt7082;
	static int anInt7083;
	protected int anInt7084;
	protected int anInt7085;
	static int anInt7086;
	protected Node_Sub45_Sub1 aNode_Sub45_Sub1_7087;
	protected int anInt7088;
	static int anInt7089;
	protected int anInt7090;
	protected int anInt7091;
	protected int anInt7092;
	protected int anInt7093;
	protected Class240 aClass240_7094;
	protected Node_Sub9_Sub2 aNode_Sub9_Sub2_7095;
	protected int anInt7096;
	static int anInt7097;
	protected Node_Sub6 aNode_Sub6_7098;
	protected int anInt7099;
	protected int anInt7100;
	protected int anInt7101;
	protected int anInt7102;
	
	static final void method2537(int i, boolean bool) {
		anInt7097++;
		int i_0_ = Class174.clientCycle - Node_Sub15_Sub4.anInt9801;
		if (bool == false) {
			if ((i_0_ ^ 0xffffffff) <= -101) {
				Class367.anInt4541 = Class368.anInt4551 = -1;
				Class320_Sub22.anInt8415 = 1;
			} else {
				int i_1_ = (int) Class257.aFloat3243;
				if (Class200_Sub1.anInt5145 >> 8 > i_1_) {
					i_1_ = Class200_Sub1.anInt5145 >> 8;
				}
				if (Plane.aBooleanArray3401[4] && i_1_ < 128 + Class262_Sub3.anIntArray7713[4]) {
					i_1_ = Class262_Sub3.anIntArray7713[4] - -128;
				}
				int i_2_ = 0x3fff & (int) Node_Sub12.aFloat5450 + Node_Sub36_Sub1.anInt10040;
				Node_Sub23.method2624(i_1_, (i_1_ >> 3) * 3 + 600 << 2, i, 127, Mobile_Sub4.anInt10987, i_2_, Class25.anInt444, Node_Sub38_Sub7.method2809(CacheNode_Sub20_Sub1.myPlayerPlane, -29754, Class295.myPlayer.anInt5940, Class295.myPlayer.anInt5934) - 200);
				float f = 1.0F - (float) ((100 - i_0_) * ((100 + -i_0_) * (-i_0_ + 100))) / 1000000.0F;
				Class98.anInt5061 = (int) ((float) Class328_Sub1.anInt8501 + (float) (-Class328_Sub1.anInt8501 + Class98.anInt5061) * f);
				Class190.anInt2331 = (int) ((float) (Class190.anInt2331 + -Node_Sub38_Sub12.anInt10228) * f + (float) Node_Sub38_Sub12.anInt10228);
				anInt7079 = (int) (f * (float) (-Class320_Sub17.anInt8371 + anInt7079) + (float) Class320_Sub17.anInt8371);
				OutcommingPacket.anInt4050 = (int) ((float) (-Class179.anInt2127 + OutcommingPacket.anInt4050) * f + (float) Class179.anInt2127);
				int i_3_ = -Class123.anInt1568 + Class170.anInt2053;
				if ((i_3_ ^ 0xffffffff) < -8193) {
					i_3_ -= 16384;
				} else if (i_3_ < -8192) {
					i_3_ += 16384;
				}
				Class170.anInt2053 = (int) ((float) Class123.anInt1568 + (float) i_3_ * f);
				Class170.anInt2053 &= 0x3fff;
			}
		}
	}
	
	public static void method2538(byte b) {
		aString7081 = null;
	}
	
	static final void method2539(Index class302, int i) {
		if (i >= -127) {
			aString7081 = null;
		}
		anInt7086++;
		Class173.aClass302_2090 = class302;
	}
	
	static final void method2540(Class52 class52) {
		Class132.aClass52_1673 = class52;
	}
	
	Node_Sub10() {
		/* empty */
	}
	
	final void method2541(int i) {
		aNode_Sub9_Sub2_7095 = null;
		anInt7089++;
		aClass240_7094 = null;
		aNode_Sub45_Sub1_7087 = null;
		aNode_Sub6_7098 = null;
	}
}
