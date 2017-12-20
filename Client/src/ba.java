/* ba - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ba extends r implements Interface3
{
	protected long nativeid;
	
	public final native void w(boolean bool);
	
	protected final void finalize() {
		if (nativeid != 0L) {
			Class164.method1739(0, this);
		}
	}
	
	ba(oa var_oa) {
		/* empty */
	}
}
