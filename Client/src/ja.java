/* ja - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ja extends Class336 implements Interface3
{
	protected long nativeid;
	
	private final native void XA(long l, int i, int i_0_, int i_1_, int[] is);
	
	final void method3854(int i, int i_2_, int i_3_) {
		FA(nativeid, i, i_2_, i_3_);
	}
	
	final void method3864(int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		P(nativeid, i, i_4_, i_5_, i_6_, i_7_, i_8_);
	}
	
	private final native void l(long l, long l_9_);
	
	private final native void m(long l, int i);
	
	private final native void VA(long l, int i);
	
	final void method3867(int i, int i_10_, int i_11_, int[] is) {
		XA(nativeid, i, i_10_, i_11_, is);
	}
	
	private final native void a(long l, int i, int i_12_, int i_13_);
	
	final void method3861(int i) {
		NA(nativeid, i);
	}
	
	public final void w(boolean bool) {
		AA(nativeid, bool);
	}
	
	final void method3862() {
		u(nativeid);
	}
	
	private final native void J(long l, int i);
	
	private final native void P(long l, int i, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_);
	
	final void method3868(int i) {
		za(nativeid, i);
	}
	
	private final native void la();
	
	private final native void b(long l, int i, int i_19_, int i_20_, int[] is);
	
	private final native void AA(long l, boolean bool);
	
	final void method3853(int i, int i_21_, int i_22_, int[] is) {
		b(nativeid, i, i_21_, i_22_, is);
	}
	
	final void method3865(int i) {
		VA(nativeid, i);
	}
	
	final void method3856(int i) {
		m(nativeid, i);
	}
	
	final void method3857(Class336 class336) {
		l(nativeid, ((ja) class336).nativeid);
	}
	
	protected final void finalize() {
		if (nativeid != 0L) {
			Class164.method1739(0, this);
		}
	}
	
	final void method3859(int i) {
		J(nativeid, i);
	}
	
	final void method3869(int i, int i_23_, int i_24_, int[] is) {
		va(nativeid, i, i_23_, i_24_, is);
	}
	
	final void method3863(int i, int i_25_, int i_26_) {
		a(nativeid, i, i_25_, i_26_);
	}
	
	private final native void FA(long l, int i, int i_27_, int i_28_);
	
	final Class336 method3858() {
		ja var_ja_29_ = new ja();
		var_ja_29_.method3857(this);
		return var_ja_29_;
	}
	
	private final native void za(long l, int i);
	
	final void method3860(int i) {
		t(nativeid, i);
	}
	
	private final native void w(long l, int[] is);
	
	final void method3855(int[] is) {
		w(nativeid, is);
	}
	
	private final native void va(long l, int i, int i_30_, int i_31_, int[] is);
	
	private final native void NA(long l, int i);
	
	ja() {
		la();
	}
	
	private final native void t(long l, int i);
	
	private final native void u(long l);
}
