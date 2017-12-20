/* h - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class h extends Class52 implements Interface3
{
	protected long nativeid;
	
	public final native void w(boolean bool);
	
	final void method526(char c, int i, int i_0_, int i_1_, boolean bool, aa var_aa, int i_2_, int i_3_) {
		NA(c, i, i_0_, i_1_, bool, var_aa, i_2_, i_3_);
	}
	
	private final native void JA(oa var_oa, ya var_ya, byte[][] bs, int[] is, int[] is_4_, int[] is_5_, int[] is_6_);
	
	h(oa var_oa, ya var_ya, Class357 class357, Class383[] class383s, GLSprite[] glsprites) {
		super(var_oa, class357);
		byte[][] bs = new byte[class383s.length][];
		int[] is = new int[class383s.length];
		int[] is_7_ = new int[class383s.length];
		int[] is_8_ = new int[class383s.length];
		int[] is_9_ = new int[class383s.length];
		for (int i = 0; i < class383s.length; i++) {
			bs[i] = class383s[i].aByteArray4903;
			is[i] = class383s[i].anInt4897;
			is_7_[i] = class383s[i].anInt4900;
			is_8_[i] = class383s[i].anInt4902;
			is_9_[i] = class383s[i].anInt4898;
		}
		JA(var_oa, var_ya, bs, is, is_7_, is_8_, is_9_);
	}
	
	final native void fa(char c, int i, int i_10_, int i_11_, boolean bool);
	
	private final native void NA(char c, int i, int i_12_, int i_13_, boolean bool, aa var_aa, int i_14_, int i_15_);
	
	protected final void finalize() {
		if (nativeid != 0L) {
			Class164.method1739(0, this);
		}
	}
}
