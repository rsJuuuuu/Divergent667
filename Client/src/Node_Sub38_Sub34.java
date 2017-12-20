/* Node_Sub38_Sub34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub38_Sub34 extends Node_Sub38
{
	static int anInt10442;
	static Class353 aClass353_10443 = new Class353(Settings.SERVER_NAME.toLowerCase(), Settings.SERVER_NAME, 0);
	static int anInt10444;
	static byte aByte10445;
	static int anInt10446;
	static int anInt10447 = -1;
	
	public Node_Sub38_Sub34() {
		super(0, true);
	}
	
	private final int method2900(int i, int i_0_, int i_1_) {
		anInt10442++;
		int i_2_ = i_1_ + 57 * i_0_;
		i_2_ = i_2_ << 1 ^ i_2_;
		if (i >= -95) {
			return 89;
		}
		return 4096 - (1376312589 + (15731 * (i_2_ * i_2_) - -789221) * i_2_ & 0x7fffffff) / 262144;
	}
	
	final int[] method2775(int i, int i_3_) {
		anInt10444++;
		int[] is = aClass146_7460.method1645(27356, i_3_);
		if (i <= 107) {
			method2901(null, false);
		}
		if (aClass146_7460.aBoolean1819) {
			int i_4_ = Node_Sub25_Sub1.anIntArray9941[i_3_];
			for (int i_5_ = 0; i_5_ < Class339_Sub7.anInt8728; i_5_++)
				is[i_5_] = method2900(-102, i_4_, CacheNode_Sub3.anIntArray9442[i_5_]) % 4096;
		}
		return is;
	}
	
	static final Class244[] method2901(SignLink signlink, boolean bool) {
		anInt10446++;
		if (!signlink.method3640(122)) {
			return new Class244[0];
		}
		Class241 class241 = signlink.method3634((byte) 25);
		while (class241.anInt2953 == 0)
			Class262_Sub22.method3208(10L, false);
		if ((class241.anInt2953 ^ 0xffffffff) == -3) {
			return new Class244[0];
		}
		int[] is = (int[]) class241.anObject2956;
		Class244[] class244s = new Class244[is.length >> 2];
		for (int i = 0; class244s.length > i; i++) {
			Class244 class244 = new Class244();
			class244s[i] = class244;
			class244.anInt3084 = is[i << 2];
			class244.anInt3078 = is[(i << 2) + 1];
			class244.anInt3079 = is[(i << 2) + 2];
			class244.anInt3077 = is[3 + (i << 2)];
		}
		if (bool != true) {
			return null;
		}
		return class244s;
	}
	
	public static void method2902(byte b) {
		if (b <= 118) {
			method2901(null, true);
		}
		aClass353_10443 = null;
	}
}
