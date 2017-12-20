/* oa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;

public class oa extends GraphicsToolkit implements Interface3
{
	private Class312 aClass312_4991;
	private boolean aBoolean4992;
	protected long nativeid = 0L;
	private static int[] anIntArray4993 = new int[Math.max(Math.max(104, 20), 24573)];
	static int[] anIntArray4994;
	private static int[] anIntArray4995;
	private static int[] anIntArray4996 = anIntArray4993;
	private static int[] anIntArray4997;
	private ya aYa4998;
	private static int[] anIntArray4999;
	private static float[] aFloatArray5000;
	private static byte[] aByteArray5001;
	private static short[] aShortArray5002;
	static int[] anIntArray5003;
	private Class336 aClass336_5004;
	private static float[] aFloatArray5005;
	private Class336 aClass336_5006;
	private HashTable aHashTable5007;
	private int anInt5008;
	private p aP5009;
	private int anInt5010;
	private a[] anAArray5011;
	private boolean aBoolean5012;
	protected int anInt5013;
	
	private final native void d(int i);
	
	final native int[] Y();
	
	final void a(Class270 class270) {
		/* empty */
	}
	
	final native void f(int i, int i_0_);
	
	public oa(java.awt.Canvas canvas, d var_d, int i, int i_1_) {
		super(var_d);
		aBoolean4992 = false;
		aClass312_4991 = new Class312();
		anInt5008 = 4096;
		anInt5010 = 4096;
		aHashTable5007 = new HashTable(4);
		aBoolean5012 = false;
		do {
			try {
				if (!Node_Sub38_Sub2.method2793(1, "sw3d")) {
					throw new RuntimeException("");
				}
				Class164.method1741(-1);
				MA(aD1543, 0, 0);
				Class110.method1132(0, true, false);
				aBoolean5012 = true;
				aClass336_5004 = new ja();
				a(new ja());
				j(1);
				k(0);
				if (canvas == null) {
					break;
				}
				b(canvas, i, i_1_);
				a(canvas);
			} catch (Throwable throwable) {
				this.method1233(-7751);
				throw new RuntimeException();
			}
			break;
		} while (false);
	}
	
	final native void ra(int i, int i_2_, int i_3_, int i_4_);
	
	final void e(int i) {
		Class164.method1740(-9630);
		d(i);
		for (ya var_ya = (ya) aClass312_4991.method3613(65280); var_ya != null; var_ya = (ya) aClass312_4991.method3620(16776960))
			var_ya.r();
	}
	
	final GLSprite a(int[] is, int i, int i_5_, int i_6_, int i_7_, boolean bool) {
		return new j(this, is, i, i_5_, i_6_, i_7_, false);
	}
	
	final boolean a() {
		return false;
	}
	
	final void j(int i) {
		anInt5013 = i;
		anAArray5011 = new a[anInt5013];
		for (int i_8_ = 0; i_8_ < anInt5013; i_8_++)
			anAArray5011[i_8_] = new a(this, anInt5008, anInt5010);
	}
	
	final int e() {
		return 4;
	}
	
	private final native void MA(d var_d, int i, int i_9_);
	
	private final void a(Class198 class198, boolean bool) {
		int i = 0;
		int i_10_ = 0;
		int i_11_ = 0;
		int i_12_ = 0;
		int i_13_ = 0;
		for (EntityNode_Sub3_Sub2 entitynode_sub3_sub2 = (EntityNode_Sub3_Sub2) class198.aClass87_2429.method1015(0); entitynode_sub3_sub2 != null; entitynode_sub3_sub2 = (EntityNode_Sub3_Sub2) class198.aClass87_2429.method1014(true)) {
			anIntArray4996[i++] = entitynode_sub3_sub2.anInt9174;
			anIntArray4996[i++] = entitynode_sub3_sub2.anInt9171;
			anIntArray4996[i++] = entitynode_sub3_sub2.anInt9173;
			anIntArray4999[i_10_++] = entitynode_sub3_sub2.anInt9176;
			aShortArray5002[i_12_++] = (short) entitynode_sub3_sub2.anInt9177;
			anIntArray4995[i_11_++] = entitynode_sub3_sub2.anInt9172;
			if (bool) {
				aByteArray5001[i_13_++] = entitynode_sub3_sub2.aByte9170;
			}
		}
	}
	
	final Interface4 a(int i, int i_14_) {
		return a(i, i_14_, false);
	}
	
	final void a(java.awt.Canvas canvas) {
		if (canvas != null) {
			p var_p = (p) aHashTable5007.method1518(3512, (long) canvas.hashCode());
			aP5009 = var_p;
			t(var_p);
		} else {
			aP5009 = null;
			t(null);
		}
	}
	
	final native int E();
	
	final void a(java.awt.Canvas canvas, int i, int i_15_) {
		p var_p = (p) aHashTable5007.method1518(3512, (long) canvas.hashCode());
		var_p.method2768(canvas, i, i_15_);
		if (canvas != null && canvas == aP5009.aCanvas5018) {
			a(canvas);
		}
	}
	
	final int c(int i, int i_16_) {
		return i | i_16_;
	}
	
	private final native void FA();
	
	final void a(int i, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_) {
		/* empty */
	}
	
	final Class52 a(Class357 class357, Class383[] class383s, boolean bool) {
		int[] is = new int[class383s.length];
		int[] is_25_ = new int[class383s.length];
		boolean bool_26_ = false;
		for (int i = 0; i < class383s.length; i++) {
			is[i] = class383s[i].anInt4897;
			is_25_[i] = class383s[i].anInt4900;
			if (class383s[i].aByteArray4905 != null) {
				bool_26_ = true;
			}
		}
		if (bool) {
			if (bool_26_) {
				throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
			}
			return new h(this, aYa4998, class357, class383s, null);
		}
		if (bool_26_) {
			throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
		}
		return new n(this, aYa4998, class357, class383s, null);
	}
	
	final void c(int i) {
		anAArray5011[i].method155();
	}
	
	final Class270 a(Class270 class270, Class270 class270_27_, float f, Class270 class270_28_) {
		return null;
	}
	
	final void a(int i, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_) {
		C().method157(this, i, i_29_, i_30_, i_31_, i_32_, i_33_, i_34_);
	}
	
	final boolean k() {
		return true;
	}
	
	final void a(za var_za) {
		aYa4998 = (ya) var_za;
		va(var_za);
	}
	
	final boolean w() {
		return false;
	}
	
	final void v() {
		a(aP5009.aCanvas5018);
	}
	
	final native int M();
	
	final native void H(int i, int i_35_, int i_36_, int[] is);
	
	final void j() {
		/* empty */
	}
	
	final boolean m() {
		return false;
	}
	
	final native int r(int i, int i_37_, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_);
	
	final void b(boolean bool) {
		/* empty */
	}
	
	final void b(int i) {
		anInt5008 = anInt5010 = i;
		if (anInt5013 > 1) {
			throw new IllegalStateException("No MT");
		}
		j(anInt5013);
		k(0);
	}
	
	final Node_Sub29 a(int i, int i_43_, int i_44_, int i_45_, int i_46_, float f) {
		return new Node_Sub29_Sub3(i, i_43_, i_44_, i_45_, i_46_, f);
	}
	
	final native void KA(int i, int i_47_, int i_48_, int i_49_);
	
	private final boolean c(short s) {
		synchronized (this) {
			Class91 class91 = aD1543.method10(s, -8217);
			if (class91 == null) {
				return false;
			}
			AA(s, class91.aShort1221, class91.anInt1226, class91.aByte1214, class91.aByte1213, class91.anInt1206, class91.aBoolean1204, class91.aByte1225, class91.aByte1217, class91.aByte1211, class91.aByte1203, class91.aBoolean1223, class91.aBoolean1205, class91.aBoolean1222, class91.aBoolean1212, class91.aBoolean1210, class91.aByte1207, class91.aBoolean1215, class91.aBoolean1216, class91.anInt1202);
		}
		return true;
	}
	
	final native void F(int i, int i_50_);
	
	final void b(java.awt.Canvas canvas) {
		if (aP5009.aCanvas5018 == canvas) {
			a((java.awt.Canvas) null);
		}
		p var_p = (p) aHashTable5007.method1518(3512, (long) canvas.hashCode());
		if (var_p != null) {
			var_p.method2160((byte) 112);
			var_p.method2771();
		}
	}
	
	final void a(int i, int i_51_, int i_52_, int i_53_, int i_54_, int i_55_, aa var_aa, int i_56_, int i_57_) {
		Z(i, i_51_, i_52_, i_53_, i_54_, i_55_, var_aa, i_56_, i_57_);
	}
	
	final boolean s() {
		return true;
	}
	
	final void a(int i, int i_58_, int i_59_, int i_60_) {
		/* empty */
	}
	
	final native int JA(int i, int i_61_, int i_62_, int i_63_, int i_64_, int i_65_);
	
	final void d(int i, int i_66_, int i_67_, int i_68_, int i_69_, int i_70_) {
		U(i, i_66_, i_67_, i_69_, i_70_);
		U(i, i_66_ + i_68_ - 1, i_67_, i_69_, i_70_);
		P(i, i_66_ + 1, i_68_ - 1, i_69_, i_70_);
		P(i + i_67_ - 1, i_66_ + 1, i_68_ - 1, i_69_, i_70_);
	}
	
	final native void DA(int i, int i_71_, int i_72_, int i_73_);
	
	final za a(int i) {
		ya var_ya = new ya(this, i);
		aClass312_4991.method3625((byte) -54, var_ya);
		return var_ya;
	}
	
	private final native void AA(short s, short s_74_, int i, byte b, byte b_75_, int i_76_, boolean bool, byte b_77_, byte b_78_, byte b_79_, byte b_80_, boolean bool_81_, boolean bool_82_, boolean bool_83_, boolean bool_84_, boolean bool_85_, byte b_86_, boolean bool_87_, boolean bool_88_, int i_89_);
	
	final void k(int i) {
		anAArray5011[i].method142();
	}
	
	final native int i();
	
	final boolean p() {
		return true;
	}
	
	final void a(int[] is) {
		Dimension dimension = aP5009.aCanvas5018.getSize();
		is[0] = dimension.width;
		is[1] = dimension.height;
	}
	
	final native void ZA(int i, float f, float f_90_, float f_91_, float f_92_, float f_93_);
	
	final void q() {
		/* empty */
	}
	
	final void a(int i, int i_94_, int i_95_, int i_96_, int i_97_, int i_98_, aa var_aa, int i_99_, int i_100_, int i_101_, int i_102_, int i_103_) {
		/* empty */
	}
	
	final native void za(int i, int i_104_, int i_105_, int i_106_, int i_107_);
	
	final native void HA(int i, int i_108_, int i_109_, int i_110_, int[] is);
	
	final native void Q(int i, int i_111_, int i_112_, int i_113_, int i_114_, int i_115_, byte[] bs, int i_116_, int i_117_);
	
	final native void X(int i);
	
	final void d() {
		/* empty */
	}
	
	final native void da(int i, int i_118_, int i_119_, int[] is);
	
	final void a(Interface6 interface6) {
		wa var_wa = (wa) interface6;
		n(var_wa.aJ5050.nativeid, var_wa.aXa5052.nativeid);
	}
	
	final void a(int i, int i_120_, int i_121_, int i_122_, int i_123_, int i_124_, int i_125_, int i_126_, int i_127_, int i_128_, int i_129_, int i_130_, int i_131_) {
		/* empty */
	}
	
	final boolean o() {
		return false;
	}
	
	final boolean x() {
		return true;
	}
	
	final boolean z() {
		return true;
	}
	
	final DrawableModel a(Model model, int i, int i_132_, int i_133_, int i_134_) {
		return new i(this, aYa4998, model, i, i_132_, i_133_, i_134_);
	}
	
	final void b(java.awt.Canvas canvas, int i, int i_135_) {
		p var_p = (p) aHashTable5007.method1518(3512, (long) canvas.hashCode());
		if (var_p == null) {
			try {
				Class<?> var_class = Class.forName("java.awt.Canvas");
				Method method = var_class.getMethod("setIgnoreRepaint", Boolean.TYPE);
				method.invoke(canvas, Boolean.TRUE);
			} catch (Exception exception) {
				/* empty */
			}
			var_p = new p(this, canvas, i, i_135_);
			aHashTable5007.method1515((long) canvas.hashCode(), var_p, -124);
		} else if (var_p.anInt5015 != i || var_p.anInt5016 != i_135_) {
			var_p.method2768(canvas, i, i_135_);
		}
	}
	
	final native void b(int i, int i_136_, int i_137_, int i_138_, double d);
	
	public final native void w(boolean bool);
	
	final aa a(int i, int i_139_, int[] is, int[] is_140_) {
		return new na(this, aYa4998, i, i_139_, is, is_140_);
	}
	
	final Renderer c() {
		return new Renderer(0, "SSE", 1, "CPU", 0L);
	}
	
	final boolean t() {
		return false;
	}
	
	final Class336 y() {
		return new ja();
	}
	
	final GLSprite a(int i, int i_141_, int i_142_, int i_143_, boolean bool) {
		return new j(this, i, i_141_, i_142_, i_143_, !bool);
	}
	
	final boolean l() {
		return true;
	}
	
	private final native void n(long l, long l_144_);
	
	final void h() {
		/* empty */
	}
	
	final GLSprite a(int i, int i_145_, boolean bool) {
		return new j(this, i, i_145_);
	}
	
	final void a(int i, int i_146_, int i_147_, int i_148_, int i_149_, int i_150_) {
		wa(i, i_146_, i_147_, i_148_, i_149_, i_150_);
	}
	
	private final native void ma(long l);
	
	final native void ya();
	
	final a C() {
		for (int i = 0; i < anInt5013; i++) {
			if (anAArray5011[i].aRunnable4984 == Thread.currentThread()) {
				return anAArray5011[i];
			}
		}
		return null;
	}
	
	final native void pa();
	
	final native void xa(float f);
	
	final native void L(int i, int i_151_, int i_152_);
	
	private final native void wa(int i, int i_153_, int i_154_, int i_155_, int i_156_, int i_157_);
	
	private final boolean WA(short s) {
		synchronized (aD1543) {
			if (!aD1543.method7(9900, s)) {
				return false;
			}
			Class91 class91 = aD1543.method10(s, -8217);
			if (class91 == null) {
				return false;
			}
			int[] is;
			if (class91.anInt1226 != 2) {
				is = aD1543.method11(128, true, 128, s, (byte) 0, 0.7F);
			} else {
				is = aD1543.method8(0.7F, s, 128, false, true, 128);
			}
			CA(s, is, class91.aShort1221, class91.anInt1226, class91.aByte1214, class91.aByte1213, class91.anInt1206, class91.aBoolean1204, class91.aByte1225, class91.aByte1217, class91.aByte1211, class91.aByte1203, class91.aBoolean1223, class91.aBoolean1205, class91.aBoolean1222, class91.aBoolean1212, class91.aBoolean1210, class91.aByte1207, class91.aBoolean1215, class91.aBoolean1216, class91.anInt1202);
		}
		return true;
	}
	
	private final native void CA(short s, int[] is, short s_158_, int i, byte b, byte b_159_, int i_160_, boolean bool, byte b_161_, byte b_162_, byte b_163_, byte b_164_, boolean bool_165_, boolean bool_166_, boolean bool_167_, boolean bool_168_, boolean bool_169_, byte b_170_, boolean bool_171_, boolean bool_172_, int i_173_);
	
	final Class270 c(int i, int i_174_, int i_175_, int i_176_, int i_177_, int i_178_) {
		return null;
	}
	
	protected final synchronized void finalize() {
		this.method1233(-7751);
		if (nativeid != 0L) {
			Class164.method1739(0, this);
		}
	}
	
	final void f(int i) {
		throw new IllegalStateException();
	}
	
	final void a(int i, Node_Sub29[] node_sub29s) {
		int i_179_ = 0;
		for (int i_180_ = 0; i_180_ < i; i_180_++) {
			anIntArray4997[i_179_++] = node_sub29s[i_180_].method2705(32311);
			anIntArray4997[i_179_++] = node_sub29s[i_180_].method2704(30);
			anIntArray4997[i_179_++] = node_sub29s[i_180_].method2708(27433);
			anIntArray4997[i_179_++] = node_sub29s[i_180_].method2711(126);
			aFloatArray5000[i_180_] = node_sub29s[i_180_].method2707(1);
			anIntArray4997[i_179_++] = node_sub29s[i_180_].method2710((byte) -118);
		}
		N(i, anIntArray4997, aFloatArray5000);
	}
	
	private final native void t(p var_p);
	
	final int b(int i, int i_181_) {
		int i_182_ = i & 0xfffff;
		int i_183_ = i_181_ & 0xfffff;
		return i_182_ & i_183_ ^ i_183_;
	}
	
	final void a(Rectangle[] rectangles, int i, int i_184_, int i_185_) throws Exception_Sub1 {
		if (aP5009 == null) {
			throw new IllegalStateException("off");
		}
		aP5009.method2770(rectangles, i, i_184_, i_185_);
	}
	
	final Plane a(int i, int i_186_, int[][] is, int[][] is_187_, int i_188_, int i_189_, int i_190_) {
		return new t(this, aYa4998, i, i_186_, is, is_187_, i_188_, i_189_, i_190_);
	}
	
	final Class336 n() {
		return aClass336_5006;
	}
	
	private final Object OA() {
		return new ba(this);
	}
	
	final native void U(int i, int i_191_, int i_192_, int i_193_, int i_194_);
	
	final native int I();
	
	final native void EA(int i, int i_195_, int i_196_, int i_197_);
	
	final native int[] na(int i, int i_198_, int i_199_, int i_200_);
	
	final native void K(int[] is);
	
	final void a(Class198 class198, int i) {
		a(class198, false);
		C().method145(this, anIntArray4996, anIntArray4999, anIntArray4995, aShortArray5002, class198.aClass87_2429.method1013(125));
	}
	
	final native void T(int i, int i_201_, int i_202_, int i_203_);
	
	final void a(Class336 class336) {
		aClass336_5006 = class336;
		ma(((ja) class336).nativeid);
	}
	
	final void a(Class198 class198) {
		if (class198.aClass87_2429.method1013(119) != 0) {
			a(class198, false);
			C().method145(this, anIntArray4996, anIntArray4999, anIntArray4995, aShortArray5002, class198.aClass87_2429.method1013(124));
		}
	}
	
	final native void P(int i, int i_204_, int i_205_, int i_206_, int i_207_);
	
	final GLSprite a(Class383 class383, boolean bool) {
		j var_j = new j(this, class383.anIntArray4904, class383.aByteArray4903, class383.aByteArray4905, 0, class383.anInt4897, class383.anInt4897, class383.anInt4900);
		var_j.method1178(class383.anInt4902, class383.anInt4898, class383.anInt4901, class383.anInt4899);
		return var_j;
	}
	
	private final void g() {
		System.gc();
		System.runFinalization();
		Class164.method1740(-9630);
	}
	
	final void f() {
		/* empty */
	}
	
	final void e(int i, int i_208_) throws Exception_Sub1 {
		if (aP5009 == null) {
			throw new IllegalStateException("off");
		}
		aP5009.method2767(i, i_208_);
	}
	
	private final native void N(int i, int[] is, float[] fs);
	
	final boolean b() {
		return true;
	}
	
	private final native void Z(int i, int i_209_, int i_210_, int i_211_, int i_212_, int i_213_, aa var_aa, int i_214_, int i_215_);
	
	final void a(float f, float f_216_, float f_217_) {
		/* empty */
	}
	
	final void u() {
		if (!aBoolean4992) {
			anAArray5011 = null;
			aP5009 = null;
			aYa4998 = null;
			aClass336_5004 = null;
			aHashTable5007.method1517(false);
			for (ya var_ya = (ya) aClass312_4991.method3613(65280); var_ya != null; var_ya = (ya) aClass312_4991.method3620(16776960))
				var_ya.ga();
			aClass312_4991.method3614(-601);
			FA();
			if (aBoolean5012) {
				Class160.method1727(false, (byte) 104, true);
				aBoolean5012 = false;
			}
			g();
			Class164.method1743(-1);
			aBoolean4992 = true;
		}
	}
	
	final boolean r() {
		return true;
	}
	
	final Interface20 d(int i, int i_218_) {
		return new xa(i, i_218_);
	}
	
	final native void la();
	
	private final native void va(za var_za);
	
	final native void C(boolean bool);
	
	final native void aa(int i, int i_219_, int i_220_, int i_221_, int i_222_, int i_223_);
	
	final boolean B() {
		return true;
	}
	
	final Interface6 a(Interface4 interface4, Interface20 interface20) {
		return new wa(this, (j) interface4, (xa) interface20);
	}
	
	final Class336 A() {
		return aClass336_5004;
	}
	
	final native int XA();
	
	final native void A(int i, aa var_aa, int i_224_, int i_225_);
	
	final native void GA(int i);
	
	final void a(boolean bool) {
		/* empty */
	}
	
	static {
		anIntArray4995 = new int[8191];
		anIntArray4997 = anIntArray4993;
		anIntArray4999 = new int[8191];
		anIntArray4994 = anIntArray4993;
		aByteArray5001 = new byte[8191];
		aShortArray5002 = new short[8191];
		anIntArray5003 = new int[6];
		aFloatArray5005 = new float[20];
		aFloatArray5000 = aFloatArray5005;
	}
}
