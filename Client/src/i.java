/* i - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class i extends DrawableModel implements Interface3
{
	protected Class300[] aClass300Array4987;
	private ya aYa4988;
	private oa anOa4989;
	protected long nativeid;
	protected Class218[] aClass218Array4990;
	
	final native void p(int i, int i_0_, Plane plane, Plane plane_1_, int i_2_, int i_3_, int i_4_);
	
	final native void LA(int i);
	
	final native void ia(short s, short s_5_);
	
	final native int ua();
	
	final native boolean F();
	
	final native int fa();
	
	final void method629() {
		if (anOa4989.anInt5013 > 1) {
			synchronized (this) {
				while (aBoolean914) {
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				aBoolean914 = true;
			}
		}
	}
	
	final native void C(int i);
	
	final native void k(int i);
	
	final boolean method621(int i, int i_6_, Class336 class336, boolean bool, int i_7_, int i_8_) {
		return anOa4989.C().method146(this, i, i_6_, class336, bool, i_8_);
	}
	
	final void method636(byte b, byte[] bs) {
		throw new RuntimeException();
	}
	
	final void method626(int i, int i_9_, int i_10_, int i_11_) {
		/* empty */
	}
	
	final native void I(int i, int[] is, int i_12_, int i_13_, int i_14_, boolean bool, int i_15_, int[] is_16_);
	
	final void method637(int i, int[] is, int i_17_, int i_18_, int i_19_, int i_20_, boolean bool) {
		l(nativeid, i, is, i_17_, i_18_, i_19_, i_20_, bool);
	}
	
	final void method630(Class336 class336, int i, boolean bool) {
		J(((ja) class336).nativeid, i, bool);
	}
	
	final boolean method624(int i, int i_21_, Class336 class336, boolean bool, int i_22_) {
		return anOa4989.C().method152(this, i, i_21_, class336, bool);
	}
	
	final native int RA();
	
	final native int da();
	
	final native void a(int i);
	
	final native int V();
	
	private final native void J(long l, int i, boolean bool);
	
	final native int na();
	
	final native void P(int i, int i_23_, int i_24_, int i_25_);
	
	final void method614(Class336 class336) {
		method652(oa.anIntArray4994, class336);
		int i = 0;
		if (aClass300Array4987 != null) {
			for (int i_26_ = 0; i_26_ < aClass300Array4987.length; i_26_++) {
				Class300 class300 = aClass300Array4987[i_26_];
				class300.anInt3769 = oa.anIntArray4994[i++];
				class300.anInt3751 = oa.anIntArray4994[i++];
				class300.anInt3753 = oa.anIntArray4994[i++];
				class300.anInt3766 = oa.anIntArray4994[i++];
				class300.anInt3756 = oa.anIntArray4994[i++];
				class300.anInt3758 = oa.anIntArray4994[i++];
				class300.anInt3761 = oa.anIntArray4994[i++];
				class300.anInt3752 = oa.anIntArray4994[i++];
				class300.anInt3771 = oa.anIntArray4994[i++];
			}
		}
		if (aClass218Array4990 != null) {
			for (int i_27_ = 0; i_27_ < aClass218Array4990.length; i_27_++) {
				Class218 class218 = aClass218Array4990[i_27_];
				Class218 class218_28_ = class218;
				if (class218.aClass218_2561 != null) {
					class218_28_ = class218.aClass218_2561;
				}
				if (class218.aClass336_2562 != null) {
					class218.aClass336_2562.method3857(class336);
				} else {
					class218.aClass336_2562 = class336.method3858();
				}
				class218_28_.anInt2559 = oa.anIntArray4994[i++];
				class218_28_.anInt2557 = oa.anIntArray4994[i++];
				class218_28_.anInt2556 = oa.anIntArray4994[i++];
			}
		}
	}
	
	private final native void R(oa var_oa, ya var_ya, int i, int i_29_, int[] is, int[] is_30_, int[] is_31_, int[] is_32_, short[] ses, int i_33_, short[] ses_34_, short[] ses_35_, short[] ses_36_, byte[] bs, byte[] bs_37_, byte[] bs_38_, byte[] bs_39_, short[] ses_40_, short[] ses_41_, int[] is_42_, byte b, short[] ses_43_, int i_44_, byte[] bs_45_, short[] ses_46_, short[] ses_47_, short[] ses_48_, int[] is_49_, int[] is_50_, int[] is_51_, byte[] bs_52_, byte[] bs_53_, int[] is_54_, int[] is_55_, int[] is_56_, int[] is_57_, int i_58_, int i_59_, int i_60_, int i_61_, int i_62_, int i_63_, int[] is_64_);
	
	public final native void w(boolean bool);
	
	final Class218[] method618() {
		return aClass218Array4990;
	}
	
	final native int G();
	
	final native void H(int i, int i_65_, int i_66_);
	
	private final native void l(long l, int i, int[] is, int i_67_, int i_68_, int i_69_, int i_70_, boolean bool);
	
	final byte[] method627() {
		throw new RuntimeException();
	}
	
	final native void aa(short s, short s_71_);
	
	final native void wa();
	
	final void method617() {
		/* empty */
	}
	
	final native int HA();
	
	final native r ba(r var_r);
	
	final native void FA(int i);
	
	final void method622(Class336 class336, EntityNode_Sub5 entitynode_sub5, int i, int i_72_) {
		if (entitynode_sub5 == null) {
			anOa4989.C().method150(this, class336, null, i, i_72_);
		} else {
			oa.anIntArray5003[5] = 0;
			anOa4989.C().method150(this, class336, oa.anIntArray5003, i, i_72_);
			entitynode_sub5.anInt5985 = oa.anIntArray5003[0];
			entitynode_sub5.anInt5986 = oa.anIntArray5003[1];
			entitynode_sub5.anInt5982 = oa.anIntArray5003[2];
			entitynode_sub5.anInt5984 = oa.anIntArray5003[3];
			entitynode_sub5.anInt5983 = oa.anIntArray5003[4];
			entitynode_sub5.aBoolean5987 = oa.anIntArray5003[5] != 0;
		}
	}
	
	final native boolean r();
	
	private final void method652(int[] is, Class336 class336) {
		anOa4989.C().method156(this, is, class336);
	}
	
	final void method632() {
		if (anOa4989.anInt5013 > 1) {
			synchronized (this) {
				aBoolean914 = false;
				this.notifyAll();
			}
		}
	}
	
	final native void ZA(i var_i_73_, i var_i_74_, int i, boolean bool, boolean bool_75_);
	
	final native boolean NA();
	
	final native int WA();
	
	final native void s(int i);
	
	final DrawableModel method633(byte b, int i, boolean bool) {
		return anOa4989.C().method144(this, b, i, bool);
	}
	
	protected final void finalize() {
		if (nativeid != 0L) {
			Class164.method1739(0, this);
		}
	}
	
	final native int EA();
	
	final boolean method612() {
		return true;
	}
	
	final native void O(int i, int i_76_, int i_77_);
	
	final void method611(Class336 class336, EntityNode_Sub5 entitynode_sub5, int i) {
		if (entitynode_sub5 == null) {
			anOa4989.C().method149(this, class336, null, i);
		} else {
			oa.anIntArray5003[5] = 0;
			anOa4989.C().method149(this, class336, oa.anIntArray5003, i);
			entitynode_sub5.anInt5985 = oa.anIntArray5003[0];
			entitynode_sub5.anInt5986 = oa.anIntArray5003[1];
			entitynode_sub5.anInt5982 = oa.anIntArray5003[2];
			entitynode_sub5.anInt5984 = oa.anIntArray5003[3];
			entitynode_sub5.anInt5983 = oa.anIntArray5003[4];
			entitynode_sub5.aBoolean5987 = oa.anIntArray5003[5] != 0;
		}
	}
	
	final native int ma();
	
	private final native void oa(oa var_oa);
	
	final native void v();
	
	final native void VA(int i);
	
	final void method619(DrawableModel drawablemodel, int i, int i_78_, int i_79_, boolean bool) {
		anOa4989.C().method151(this, drawablemodel, i, i_78_, i_79_, bool);
	}
	
	final Class300[] method620() {
		return aClass300Array4987;
	}
	
	i(oa var_oa, ya var_ya, Model model, int i, int i_80_, int i_81_, int i_82_) {
		anOa4989 = var_oa;
		aYa4988 = var_ya;
		aClass300Array4987 = model.aClass300Array2590;
		aClass218Array4990 = model.aClass218Array2620;
		int i_83_ = model.aClass300Array2590 == null ? 0 : model.aClass300Array2590.length;
		int i_84_ = model.aClass218Array2620 == null ? 0 : model.aClass218Array2620.length;
		int i_85_ = 0;
		int[] is = new int[i_83_ * 3 + i_84_];
		for (int i_86_ = 0; i_86_ < i_83_; i_86_++) {
			is[i_85_++] = aClass300Array4987[i_86_].anInt3764;
			is[i_85_++] = aClass300Array4987[i_86_].anInt3757;
			is[i_85_++] = aClass300Array4987[i_86_].anInt3754;
		}
		for (int i_87_ = 0; i_87_ < i_84_; i_87_++)
			is[i_85_++] = aClass218Array4990[i_87_].anInt2554;
		int i_88_ = model.aClass17Array2621 == null ? 0 : model.aClass17Array2621.length;
		int[] is_89_ = new int[i_88_ * 8];
		int i_90_ = 0;
		for (int i_91_ = 0; i_91_ < i_88_; i_91_++) {
			Class17 class17 = model.aClass17Array2621[i_91_];
			Class352 class352 = Class215.method2067(0, class17.anInt279);
			is_89_[i_90_++] = class17.anInt273;
			is_89_[i_90_++] = class352.anInt4334;
			is_89_[i_90_++] = class352.anInt4326;
			is_89_[i_90_++] = class352.anInt4330;
			is_89_[i_90_++] = class352.anInt4336;
			is_89_[i_90_++] = class352.anInt4324;
			is_89_[i_90_++] = class352.aBoolean4325 ? -1 : 0;
		}
		for (int i_92_ = 0; i_92_ < i_88_; i_92_++) {
			Class17 class17 = model.aClass17Array2621[i_92_];
			is_89_[i_90_++] = class17.anInt274;
		}
		R(anOa4989, aYa4988, model.anInt2599, model.anInt2573, model.anIntArray2616, model.anIntArray2576, model.anIntArray2574, model.anIntArray2598, model.aShortArray2582, model.anInt2572, model.aShortArray2600, model.aShortArray2583, model.aShortArray2589, model.aByteArray2594, model.aByteArray2607, model.aByteArray2622, model.aByteArray2610, model.aShortArray2580, model.aShortArray2587, model.anIntArray2602, model.aByte2619, model.aShortArray2575, model.anInt2611, model.aByteArray2586, model.aShortArray2613, model.aShortArray2577, model.aShortArray2604, model.anIntArray2603, model.anIntArray2588, model.anIntArray2593, model.aByteArray2609, model.aByteArray2585, model.anIntArray2617, model.anIntArray2615, model.anIntArray2584, is, i_83_, i_84_, i, i_80_, i_81_, i_82_, is_89_);
	}
	
	i(oa var_oa) {
		anOa4989 = var_oa;
		aYa4988 = null;
		oa(var_oa);
	}
}
