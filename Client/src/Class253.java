/* Class253 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class253
{
	protected String aString3191;
	protected int anInt3192 = Class232.method2139(-1313);
	static long[] aLongArray3193 = new long[32];
	protected int anInt3194;
	protected String aString3195;
	static int anInt3196;
	protected String aString3197;
	protected String aString3198;
	protected int anInt3199;
	protected int anInt3200;
	static int anInt3201 = -1;
	static int anInt3202;
	static int anInt3203;
	protected int anInt3204;
	protected String aString3205;
	
	static final boolean method3103(int i, int i_0_, int i_1_) {
		anInt3196++;
		if (i_0_ >= -114) {
			aLongArray3193 = null;
		}
		return Class219.method2094(i, i_1_, -41) & Class125.method1529(2048, i_1_, i);
	}
	
	final void method3104(int i, int i_2_, String string, String string_3_, int i_4_, String string_5_, boolean bool, String string_6_, String string_7_) {
		anInt3192 = Class232.method2139(-1313);
		anInt3203++;
		aString3205 = string;
		aString3197 = string_6_;
		anInt3194 = Class174.clientCycle;
		aString3195 = string_3_;
		aString3198 = string_5_;
		aString3191 = string_7_;
		if (bool == false) {
			anInt3199 = i_4_;
			anInt3200 = i;
			anInt3204 = i_2_;
		}
	}
	
	static final boolean method3105(int i, byte b) {
		anInt3202++;
		@SuppressWarnings("unused")
		int i_8_ = 76 % ((b - 24) / 34);
        return !((i ^ 0xffffffff) != -4 && i != 7 && i != 9 && (i ^ 0xffffffff) != -12);
    }
	
	public static void method3106(byte b) {
		aLongArray3193 = null;
		if (b != -33) {
			method3105(-101, (byte) 63);
		}
	}
	
	Class253(int i, int i_9_, String string, String string_10_, String string_11_, String string_12_, int i_13_, String string_14_) {
		anInt3204 = i_9_;
		anInt3200 = i_13_;
		aString3197 = string_12_;
		aString3198 = string_10_;
		aString3205 = string;
		anInt3194 = Class174.clientCycle;
		anInt3199 = i;
		aString3191 = string_11_;
		aString3195 = string_14_;
	}
}
