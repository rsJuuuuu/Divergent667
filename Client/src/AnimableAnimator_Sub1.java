/* AnimableAnimator_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class AnimableAnimator_Sub1 extends AnimableAnimator
{
	static int anInt9090 = 0;
	static Index aClass302_9091;
	static int anInt9092;
	static int anInt9093 = 1405;
	protected int anInt9094;
	
	public static void method255(byte b) {
		aClass302_9091 = null;
		if (b >= -85) {
			anInt9090 = -80;
		}
	}
	
	AnimableAnimator_Sub1(Animable animable) {
		super(animable, false);
	}
	
	static final void method256(boolean bool, int i, Node_Sub9_Sub1 node_sub9_sub1) {
		anInt9092++;
		AnimableAnimator.aClass42_5498.method441(i ^ 0x2890, node_sub9_sub1);
		if (bool) {
			Class320_Sub9.method3717(AnimableAnimator.aClass42_5498, Class78.aClass302_1033, Class148.aClass302_1827, Class218.aClass302_2563, i + 311506859, node_sub9_sub1);
		}
		if (i != 1405) {
			method255((byte) 54);
		}
	}
}
