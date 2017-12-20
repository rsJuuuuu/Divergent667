/* a - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class a implements Interface3
{
	private oa anOa4983;
	protected long nativeid;
	protected Runnable aRunnable4984;
	private i[] anIArray4985 = new i[7];
	private i[] anIArray4986 = new i[7];
	
	private final native void na(long l, GraphicsToolkit graphicstoolkit, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_);
	
	private final native void O(long l, GraphicsToolkit graphicstoolkit, int[] is, int[] is_6_, int[] is_7_, short[] ses, int i);
	
	private final native void Z(long l, long l_8_, int i, int i_9_, int i_10_);
	
	final void method142() {
		aRunnable4984 = Thread.currentThread();
		method148();
	}
	
	private final native void f(long l, long l_11_, long l_12_, int[] is, int i, int i_13_);
	
	public final void w(boolean bool) {
		E(nativeid, bool);
	}
	
	final void method143(Plane plane, int i, int i_14_) {
		H(nativeid, ((t) plane).nativeid, i, i_14_);
	}
	
	private final native void r(long l, long l_15_, long l_16_, int i, int i_17_, int i_18_, boolean bool);
	
	private final native void ta(long l, long l_19_, int i, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, boolean[][] bools);
	
	final DrawableModel method144(i var_i, byte b, int i, boolean bool) {
		boolean bool_26_ = false;
		i var_i_27_;
		i var_i_28_;
		if (b > 0 && b <= 7) {
			var_i_28_ = anIArray4985[b - 1];
			var_i_27_ = anIArray4986[b - 1];
			bool_26_ = true;
		} else {
			var_i_27_ = var_i_28_ = new i(anOa4983);
		}
		var_i.ZA(var_i_27_, var_i_28_, i, bool_26_, bool);
		var_i_27_.aClass300Array4987 = var_i.aClass300Array4987;
		var_i_27_.aClass218Array4990 = var_i.aClass218Array4990;
		return var_i_27_;
	}
	
	final void method145(GraphicsToolkit graphicstoolkit, int[] is, int[] is_29_, int[] is_30_, short[] ses, int i) {
		O(nativeid, graphicstoolkit, is, is_29_, is_30_, ses, i);
	}
	
	final boolean method146(DrawableModel drawablemodel, int i, int i_31_, Class336 class336, boolean bool, int i_32_) {
		return n(nativeid, ((i) drawablemodel).nativeid, i, i_31_, ((ja) class336).nativeid, bool, i_32_);
	}
	
	private final native void H(long l, long l_33_, int i, int i_34_);
	
	protected final void finalize() {
		if (nativeid != 0L) {
			Class164.method1739(0, this);
		}
	}
	
	private final native void UA(long l, long l_35_, long l_36_, int[] is, int i);
	
	final void method147(Plane plane, int i, int i_37_, int i_38_) {
		Z(nativeid, ((t) plane).nativeid, i, i_37_, i_38_);
	}
	
	private final void method148() {
		M(nativeid);
	}
	
	final void method149(DrawableModel drawablemodel, Class336 class336, int[] is, int i) {
		UA(nativeid, ((i) drawablemodel).nativeid, ((ja) class336).nativeid, is, i);
	}
	
	final void method150(DrawableModel drawablemodel, Class336 class336, int[] is, int i, int i_39_) {
		f(nativeid, ((i) drawablemodel).nativeid, ((ja) class336).nativeid, is, i, i_39_);
	}
	
	final void method151(DrawableModel drawablemodel, DrawableModel drawablemodel_40_, int i, int i_41_, int i_42_, boolean bool) {
		r(nativeid, ((i) drawablemodel).nativeid, ((i) drawablemodel_40_).nativeid, i, i_41_, i_42_, bool);
	}
	
	private final native boolean n(long l, long l_43_, int i, int i_44_, long l_45_, boolean bool, int i_46_);
	
	private final native void E(long l, boolean bool);
	
	final boolean method152(DrawableModel drawablemodel, int i, int i_47_, Class336 class336, boolean bool) {
		return R(nativeid, ((i) drawablemodel).nativeid, i, i_47_, ((ja) class336).nativeid, bool);
	}
	
	private final void method153() {
		W(nativeid);
	}
	
	private final native void e(long l, long l_48_, int[] is, long l_49_);
	
	private final native void HA(long l, GraphicsToolkit graphicstoolkit, int i, int i_50_);
	
	a(oa var_oa, int i, int i_51_) {
		anOa4983 = var_oa;
		for (int i_52_ = 0; i_52_ < 7; i_52_++) {
			anIArray4986[i_52_] = new i(anOa4983);
			anIArray4985[i_52_] = new i(anOa4983);
		}
		HA(nativeid, var_oa, i, i_51_);
	}
	
	final void method154(Plane plane, int i, int i_53_, int i_54_, int i_55_, int i_56_, int i_57_, int i_58_, boolean[][] bools) {
		ta(nativeid, ((t) plane).nativeid, i, i_53_, i_54_, i_55_, i_56_, i_57_, i_58_, bools);
	}
	
	private final native boolean R(long l, long l_59_, int i, int i_60_, long l_61_, boolean bool);
	
	private final native void W(long l);
	
	private final native void M(long l);
	
	final void method155() {
		aRunnable4984 = null;
		method153();
	}
	
	final void method156(DrawableModel drawablemodel, int[] is, Class336 class336) {
		e(nativeid, ((i) drawablemodel).nativeid, is, ((ja) class336).nativeid);
	}
	
	final void method157(GraphicsToolkit graphicstoolkit, int i, int i_62_, int i_63_, int i_64_, int i_65_, int i_66_, int i_67_) {
		na(nativeid, graphicstoolkit, i, i_62_, i_63_, i_64_, i_65_, i_66_, i_67_);
	}
}
