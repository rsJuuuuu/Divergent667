/* j - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class j extends GLSprite implements Interface3
{
	protected long nativeid;
	
	final void method1188(float f, float f_0_, float f_1_, float f_2_, float f_3_, float f_4_, int i, aa var_aa, int i_5_, int i_6_) {
		UA(nativeid, f, f_0_, f_1_, f_2_, f_3_, f_4_, i, ((na) var_aa).nativeid, i_5_, i_6_);
	}
	
	final void method1184(int i, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_) {
		RA(nativeid, i, i_7_, i_8_, i_9_, i_10_, i_11_, i_12_, i_13_);
	}
	
	final int getYOffset() {
		return I(nativeid);
	}
	
	private final native void A(long l, int i, int i_14_, int i_15_, int i_16_);
	
	public final void w(boolean bool) {
		R(nativeid, bool);
	}
	
	private final native void h(oa var_oa, int i, int i_17_, int i_18_, int i_19_, boolean bool);
	
	private final native void V(long l, int i, int i_20_, long l_21_, int i_22_, int i_23_);
	
	final void method1183(int i, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_) {
		P(nativeid, i, i_24_, i_25_, i_26_, i_27_, i_28_, i_29_);
	}
	
	final void method1187(int[] is) {
		CA(nativeid, is);
	}
	
	private final native void RA(long l, int i, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_);
	
	private final native void b(long l, float f, float f_37_, float f_38_, float f_39_, float f_40_, float f_41_, int i, int i_42_, int i_43_, int i_44_);
	
	private final native int JA(long l);
	
	private final native void ma(oa var_oa, int[] is, byte[] bs, byte[] bs_45_, int i, int i_46_, int i_47_, int i_48_);
	
	private final native void N(long l, int i, int i_49_, int i_50_);
	
	private final native int M(long l);
	
	final int method1193() {
		return M(nativeid);
	}
	
	protected final void finalize() {
		if (nativeid != 0L) {
			Class164.method1739(0, this);
		}
	}
	
	final void method1194(float f, float f_51_, float f_52_, float f_53_, float f_54_, float f_55_, int i, int i_56_, int i_57_, int i_58_) {
		b(nativeid, f, f_51_, f_52_, f_53_, f_54_, f_55_, i, i_56_, i_57_, i_58_);
	}
	
	private final native void ua(oa var_oa, int[] is, int i, int i_59_, int i_60_, int i_61_, boolean bool);
	
	private final native int wa(long l);
	
	private final native void P(long l, int i, int i_62_, int i_63_, int i_64_, int i_65_, int i_66_, int i_67_);
	
	private final native void R(long l, boolean bool);
	
	final int method1197() {
		return wa(nativeid);
	}
	
	final void method1191(int i, int i_68_, int i_69_, int i_70_, int i_71_) {
		W(nativeid, i, i_68_, i_69_, i_70_, i_71_);
	}
	
	final void method1178(int i, int i_72_, int i_73_, int i_74_) {
		A(nativeid, i, i_72_, i_73_, i_74_);
	}
	
	private final native void CA(long l, int[] is);
	
	final void method1195(int i, int i_75_, int i_76_, int i_77_, int i_78_, int i_79_) {
		YA(nativeid, i, i_75_, i_76_, i_77_, i_78_, i_79_);
	}
	
	private final native void EA(oa var_oa, int i, int i_80_);
	
	private final native void UA(long l, float f, float f_81_, float f_82_, float f_83_, float f_84_, float f_85_, int i, long l_86_, int i_87_, int i_88_);
	
	private final native void YA(long l, int i, int i_89_, int i_90_, int i_91_, int i_92_, int i_93_);
	
	final int method1186() {
		return JA(nativeid);
	}
	
	final void method1190(int i, int i_94_, int i_95_) {
		N(nativeid, i, i_94_, i_95_);
	}
	
	final void method1189(int i, int i_96_, aa var_aa, int i_97_, int i_98_) {
		V(nativeid, i, i_96_, ((na) var_aa).nativeid, i_97_, i_98_);
	}
	
	j(oa var_oa, int i, int i_99_) {
		EA(var_oa, i, i_99_);
	}
	
	private final native int I(long l);
	
	private final native void W(long l, int i, int i_100_, int i_101_, int i_102_, int i_103_);
	
	j(oa var_oa, int[] is, int i, int i_104_, int i_105_, int i_106_, boolean bool) {
		ua(var_oa, is, i, i_104_, i_105_, i_106_, bool);
	}
	
	j(oa var_oa, int[] is, byte[] bs, byte[] bs_107_, int i, int i_108_, int i_109_, int i_110_) {
		ma(var_oa, is, bs, bs_107_, i, i_108_, i_109_, i_110_);
	}
	
	j(oa var_oa, int i, int i_111_, int i_112_, int i_113_, boolean bool) {
		h(var_oa, i, i_111_, i_112_, i_113_, bool);
	}
}
