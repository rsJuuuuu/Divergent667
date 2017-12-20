/* n - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class n extends Class52 implements Interface3
{
	protected long nativeid;
	
	final native void fa(char c, int i, int i_0_, int i_1_, boolean bool);
	
	private final native void PA(char c, int i, int i_2_, int i_3_, boolean bool, aa var_aa, int i_4_, int i_5_);
	
	n(oa var_oa, ya var_ya, Class357 class357, Class383[] class383s, GLSprite[] glsprites) {
		super(var_oa, class357);
		byte[][] bs = new byte[class383s.length][];
		int[] is = new int[class383s.length];
		int[] is_6_ = new int[class383s.length];
		int[] is_7_ = new int[class383s.length];
		int[] is_8_ = new int[class383s.length];
		for (int i = 0; i < class383s.length; i++) {
			bs[i] = class383s[i].aByteArray4903;
			is[i] = class383s[i].anInt4897;
			is_6_[i] = class383s[i].anInt4900;
			is_7_[i] = class383s[i].anInt4902;
			is_8_[i] = class383s[i].anInt4898;
		}
		S(var_oa, var_ya, bs, class383s[0].anIntArray4904, is, is_6_, is_7_, is_8_);
	}
	
	private final native void S(oa var_oa, ya var_ya, byte[][] bs, int[] is, int[] is_9_, int[] is_10_, int[] is_11_, int[] is_12_);
	
	public final native void w(boolean bool);
	
	final void method526(char c, int i, int i_13_, int i_14_, boolean bool, aa var_aa, int i_15_, int i_16_) {
		PA(c, i, i_13_, i_14_, bool, var_aa, i_15_, i_16_);
	}
	
	protected final void finalize() {
		if (nativeid != 0L) {
			Class164.method1739(0, this);
		}
	}
}
