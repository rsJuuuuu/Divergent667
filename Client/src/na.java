/* na - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class na extends aa implements Interface3
{
	protected long nativeid;
	
	protected final void finalize() {
		if (nativeid != 0L) {
			Class164.method1739(0, this);
		}
	}
	
	na(oa var_oa, ya var_ya, int i, int i_0_, int[] is, int[] is_1_) {
		ma(var_oa, var_ya, i, i_0_, is, is_1_);
	}
	
	private final native void ma(oa var_oa, ya var_ya, int i, int i_2_, int[] is, int[] is_3_);
	
	public final native void w(boolean bool);
}
