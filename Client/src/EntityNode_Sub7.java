/* EntityNode_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class EntityNode_Sub7 extends EntityNode
{
	static int anInt5997;
	private int anInt5998 = 0;
	private long aLong5999;
	static int anInt6000;
	static int anInt6001;
	static int anInt6002;
	protected Class300 aClass300_6003;
	protected int anInt6004;
	protected Class143 aClass143_6005;
	protected Class103 aClass103_6006;
	static int anInt6007;
	static IncommingPacket aClass192_6008 = new IncommingPacket(116, -1);
	protected EntityNode_Sub4 anEntityNode_Sub4_6009;
	static int anInt6010;
	protected Class355 aClass355_6011;
	protected boolean aBoolean6012 = false;
	static int anInt6013;
	private Class143 aClass143_6014;
	private int anInt6015;
	private int anInt6016;
	private int anInt6017;
	private int anInt6018;
	private int anInt6019;
	private boolean aBoolean6020;
	private int anInt6021;
	private int anInt6022;
	
	static final void method973(byte b, Player player, int i, int i_0_) {
		anInt5997++;
		int[] is = new int[4];
		Class311.method3604(is, 0, is.length, i_0_);
		Class352.method4011(is, i, false, player, -110);
		if (b != 75) {
			method979(-123);
		}
	}
	
	final void method974(int i, byte b, boolean bool, long l, GraphicsToolkit graphicstoolkit) {
		if (!aBoolean6012) {
			if ((aClass355_6011.anInt4379 ^ 0xffffffff) < (Node_Sub39.anInt7498 ^ 0xffffffff)) {
				bool = false;
			} else if (Class94.anIntArray1247[Node_Sub39.anInt7498] >= CacheNode_Sub12.anInt9555) {
				if (!aBoolean6020) {
					if ((aClass355_6011.anInt4411 ^ 0xffffffff) != 0) {
						int i_1_ = (int) (-aLong5999 + l);
						if (aClass355_6011.aBoolean4390 || aClass355_6011.anInt4411 >= i_1_) {
							i_1_ %= aClass355_6011.anInt4411;
						} else {
							bool = false;
						}
						if (!aClass355_6011.aBoolean4375 && i_1_ < aClass355_6011.anInt4361) {
							bool = false;
						}
						if (aClass355_6011.aBoolean4375 && (aClass355_6011.anInt4361 ^ 0xffffffff) >= (i_1_ ^ 0xffffffff)) {
							bool = false;
						}
					}
				} else {
					bool = false;
				}
			} else {
				bool = false;
			}
		} else {
			bool = false;
		}
		anInt6007++;
		if (bool) {
			Class228.anInt2719++;
			int i_2_ = (aClass143_6005.anInt1774 + (aClass143_6005.anInt1777 + aClass143_6005.anInt1779)) / 3;
			int i_3_ = (aClass143_6005.anInt1765 + aClass143_6005.anInt1778 + aClass143_6005.anInt1781) / 3;
			int i_4_ = (aClass143_6005.anInt1775 + aClass143_6005.anInt1766 - -aClass143_6005.anInt1772) / 3;
			if ((i_2_ ^ 0xffffffff) != (aClass143_6005.anInt1767 ^ 0xffffffff) || i_3_ != aClass143_6005.anInt1776 || (aClass143_6005.anInt1769 ^ 0xffffffff) != (i_4_ ^ 0xffffffff)) {
				aClass143_6005.anInt1776 = i_3_;
				aClass143_6005.anInt1769 = i_4_;
				aClass143_6005.anInt1767 = i_2_;
				int i_5_ = -aClass143_6005.anInt1777 + aClass143_6005.anInt1779;
				int i_6_ = aClass143_6005.anInt1781 - aClass143_6005.anInt1778;
				int i_7_ = aClass143_6005.anInt1775 - aClass143_6005.anInt1766;
				int i_8_ = -aClass143_6005.anInt1777 + aClass143_6005.anInt1774;
				int i_9_ = aClass143_6005.anInt1765 + -aClass143_6005.anInt1778;
				int i_10_ = aClass143_6005.anInt1772 - aClass143_6005.anInt1766;
				anInt6022 = i_5_ * i_9_ + -(i_6_ * i_8_);
				anInt6018 = i_6_ * i_10_ - i_7_ * i_9_;
				for (anInt6021 = -(i_10_ * i_5_) + i_8_ * i_7_; (anInt6018 ^ 0xffffffff) < -32768 || (anInt6021 ^ 0xffffffff) < -32768 || (anInt6022 ^ 0xffffffff) < -32768 || anInt6018 < -32767 || anInt6021 < -32767 || (anInt6022 ^ 0xffffffff) > 32766; anInt6021 >>= 1) {
					anInt6022 >>= 1;
					anInt6018 >>= 1;
				}
				int i_11_ = (int) Math.sqrt((double) (anInt6018 * anInt6018 - (-(anInt6021 * anInt6021) + -(anInt6022 * anInt6022))));
				if (i_11_ <= 0) {
					i_11_ = 1;
				}
				anInt6021 = anInt6021 * 32767 / i_11_;
				anInt6018 = anInt6018 * 32767 / i_11_;
				anInt6022 = anInt6022 * 32767 / i_11_;
				if (aClass355_6011.aShort4369 > 0 || (aClass355_6011.aShort4382 ^ 0xffffffff) < -1) {
					int i_12_ = (int) (2607.5945876176133 * Math.atan2((double) anInt6022, (double) anInt6018));
					int i_13_ = (int) (Math.atan2((double) anInt6021, Math.sqrt((double) (anInt6018 * anInt6018 + anInt6022 * anInt6022))) * 2607.5945876176133);
					anInt6016 = aClass355_6011.aShort4369 + -aClass355_6011.aShort4357;
					anInt6015 = -(anInt6016 >> 1) + (aClass355_6011.aShort4357 + i_12_);
					anInt6017 = -aClass355_6011.aShort4386 + aClass355_6011.aShort4382;
					anInt6019 = -(anInt6017 >> 1) + (aClass355_6011.aShort4386 + i_13_);
				}
			}
			anInt5998 += (int) (((double) aClass355_6011.anInt4424 + Math.random() * (double) (-aClass355_6011.anInt4424 + aClass355_6011.anInt4381)) * (double) i);
			if (anInt5998 > 63) {
				int i_14_ = anInt5998 >> 6;
				anInt5998 &= 0x3f;
				for (int i_15_ = 0; (i_14_ ^ 0xffffffff) < (i_15_ ^ 0xffffffff); i_15_++) {
					int i_16_;
					int i_17_;
					int i_18_;
					if (aClass355_6011.aShort4369 > 0 || aClass355_6011.aShort4382 > 0) {
						int i_19_ = (int) ((double) anInt6016 * Math.random()) + anInt6015;
						i_19_ &= 0x3fff;
						int i_20_ = Class335.anIntArray4167[i_19_];
						int i_21_ = Class335.anIntArray4165[i_19_];
						int i_22_ = anInt6019 + (int) ((double) anInt6017 * Math.random());
						i_22_ &= 0x1fff;
						int i_23_ = Class335.anIntArray4167[i_22_];
						int i_24_ = Class335.anIntArray4165[i_22_];
						int i_25_ = 13;
						i_16_ = i_21_ * i_23_ >> i_25_;
						i_18_ = -1 * (i_24_ << 1);
						i_17_ = i_23_ * i_20_ >> i_25_;
					} else {
						i_16_ = anInt6018;
						i_17_ = anInt6022;
						i_18_ = anInt6021;
					}
					float f = (float) Math.random();
					float f_26_ = (float) Math.random();
					if (f_26_ + f > 1.0F) {
						f = 1.0F - f;
						f_26_ = 1.0F - f_26_;
					}
					float f_27_ = -f_26_ - f + 1.0F;
					int i_28_ = (int) ((float) aClass143_6005.anInt1774 * f_27_ + ((float) aClass143_6005.anInt1779 * f_26_ + f * (float) aClass143_6005.anInt1777));
					int i_29_ = (int) ((float) aClass143_6005.anInt1781 * f_26_ + f * (float) aClass143_6005.anInt1778 + f_27_ * (float) aClass143_6005.anInt1765);
					int i_30_ = (int) ((float) aClass143_6005.anInt1766 * f + (float) aClass143_6005.anInt1775 * f_26_ + f_27_ * (float) aClass143_6005.anInt1772);
					int i_31_ = (int) (f_27_ * (float) aClass143_6014.anInt1774 + ((float) aClass143_6014.anInt1779 * f_26_ + (float) aClass143_6014.anInt1777 * f));
					int i_32_ = (int) (f_27_ * (float) aClass143_6014.anInt1765 + (f_26_ * (float) aClass143_6014.anInt1781 + f * (float) aClass143_6014.anInt1778));
					int i_33_ = (int) (f_26_ * (float) aClass143_6014.anInt1775 + (float) aClass143_6014.anInt1766 * f + (float) aClass143_6014.anInt1772 * f_27_);
					int i_34_ = -i_31_ + i_28_;
					int i_35_ = i_29_ - i_32_;
					int i_36_ = i_30_ + -i_33_;
					int i_37_ = (int) ((double) i_34_ * Math.random() + (double) i_31_);
					int i_38_ = (int) ((double) i_32_ + (double) i_35_ * Math.random());
					int i_39_ = (int) ((double) i_33_ + Math.random() * (double) i_36_);
					int i_40_ = (int) (Math.random() * (double) (aClass355_6011.anInt4367 - aClass355_6011.anInt4377)) + aClass355_6011.anInt4377;
					int i_41_ = (int) (Math.random() * (double) (aClass355_6011.anInt4388 + -aClass355_6011.anInt4401)) + aClass355_6011.anInt4401;
					int i_42_ = (int) (Math.random() * (double) (aClass355_6011.anInt4408 + -aClass355_6011.anInt4360)) + aClass355_6011.anInt4360;
					int i_43_;
					if (aClass355_6011.aBoolean4391) {
						double d = Math.random();
						i_43_ = (int) ((double) aClass355_6011.anInt4389 + (double) aClass355_6011.anInt4402 * d) | ((int) ((double) aClass355_6011.anInt4403 + d * (double) aClass355_6011.anInt4400) << 8 | (int) ((double) aClass355_6011.anInt4383 + (double) aClass355_6011.anInt4420 * d) << 16) | (int) (Math.random() * (double) aClass355_6011.anInt4349 + (double) aClass355_6011.anInt4394) << 24;
					} else {
						i_43_ = (int) ((double) aClass355_6011.anInt4389 + Math.random() * (double) aClass355_6011.anInt4402) | ((int) ((double) aClass355_6011.anInt4403 + Math.random() * (double) aClass355_6011.anInt4400) << 8 | (int) (Math.random() * (double) aClass355_6011.anInt4420 + (double) aClass355_6011.anInt4383) << 16) | (int) ((double) aClass355_6011.anInt4394 + (double) aClass355_6011.anInt4349 * Math.random()) << 24;
					}
					int i_44_ = aClass355_6011.anInt4393;
					if (!graphicstoolkit.x() && !aClass355_6011.aBoolean4350) {
						i_44_ = -1;
					}
					if (Animable_Sub3_Sub1.anInt11012 == Packet.anInt9386) {
						@SuppressWarnings("unused")
						EntityNode_Sub3_Sub2_Sub1 entitynode_sub3_sub2_sub1 = new EntityNode_Sub3_Sub2_Sub1(this, i_37_, i_38_, i_39_, i_16_, i_18_, i_17_, i_40_, i_41_, i_43_, i_42_, i_44_, aClass355_6011.aBoolean4373, aClass355_6011.aBoolean4365);
					} else {
						EntityNode_Sub3_Sub2_Sub1 entitynode_sub3_sub2_sub1 = Class284.anEntityNode_Sub3_Sub2_Sub1Array3596[Animable_Sub3_Sub1.anInt11012];
						Animable_Sub3_Sub1.anInt11012 = 1 + Animable_Sub3_Sub1.anInt11012 & 0x3ff;
						entitynode_sub3_sub2_sub1.method950(this, i_37_, i_38_, i_39_, i_16_, i_18_, i_17_, i_40_, i_41_, i_43_, i_42_, i_44_, aClass355_6011.aBoolean4373, aClass355_6011.aBoolean4365);
					}
				}
			}
		}
		if (!aClass143_6005.method1625(81, aClass143_6014)) {
			Class143 class143 = aClass143_6014;
			aClass143_6014 = aClass143_6005;
			aClass143_6005 = class143;
			aClass143_6005.anInt1772 = aClass300_6003.anInt3771;
			aClass143_6005.anInt1774 = aClass300_6003.anInt3761;
			aClass143_6005.anInt1781 = aClass300_6003.anInt3756;
			aClass143_6005.anInt1779 = aClass300_6003.anInt3766;
			aClass143_6005.anInt1766 = aClass300_6003.anInt3753;
			aClass143_6005.anInt1778 = aClass300_6003.anInt3751;
			aClass143_6005.anInt1775 = aClass300_6003.anInt3758;
			aClass143_6005.anInt1776 = aClass143_6014.anInt1776;
			aClass143_6005.anInt1769 = aClass143_6014.anInt1769;
			aClass143_6005.anInt1777 = aClass300_6003.anInt3769;
			aClass143_6005.anInt1767 = aClass143_6014.anInt1767;
			aClass143_6005.anInt1765 = aClass300_6003.anInt3752;
		}
		anInt6004 = 0;
		if (b == 19) {
			for (EntityNode_Sub3_Sub2_Sub1 entitynode_sub3_sub2_sub1 = (EntityNode_Sub3_Sub2_Sub1) aClass103_6006.method1113((byte) 105); entitynode_sub3_sub2_sub1 != null; entitynode_sub3_sub2_sub1 = (EntityNode_Sub3_Sub2_Sub1) aClass103_6006.method1108(b ^ 0x60)) {
				entitynode_sub3_sub2_sub1.method948(l, i);
				anInt6004++;
			}
			Class280.anInt3570 += anInt6004;
		}
	}
	
	public static void method975(boolean bool) {
		if (bool != true) {
			method979(41);
		}
		aClass192_6008 = null;
	}
	
	final void method976(long l, GraphicsToolkit graphicstoolkit, int i) {
		anInt6000++;
		for (EntityNode_Sub3_Sub2_Sub1 entitynode_sub3_sub2_sub1 = (EntityNode_Sub3_Sub2_Sub1) aClass103_6006.method1113((byte) 116); entitynode_sub3_sub2_sub1 != null; entitynode_sub3_sub2_sub1 = (EntityNode_Sub3_Sub2_Sub1) aClass103_6006.method1108(98))
			entitynode_sub3_sub2_sub1.method949(graphicstoolkit, l);
		if (i != 0) {
			aClass143_6014 = null;
		}
	}
	
	final void method977(byte b) {
		aClass143_6005.anInt1781 = aClass300_6003.anInt3756;
		aClass143_6005.anInt1772 = aClass300_6003.anInt3771;
		aClass143_6005.anInt1774 = aClass300_6003.anInt3761;
		aClass143_6005.anInt1778 = aClass300_6003.anInt3751;
		aClass143_6005.anInt1779 = aClass300_6003.anInt3766;
		aClass143_6005.anInt1766 = aClass300_6003.anInt3753;
		if (b <= 60) {
			anInt6022 = 60;
		}
		anInt6010++;
		aClass143_6005.anInt1775 = aClass300_6003.anInt3758;
		aClass143_6005.anInt1777 = aClass300_6003.anInt3769;
		aClass143_6005.anInt1765 = aClass300_6003.anInt3752;
		if (aClass143_6005.anInt1779 != aClass143_6005.anInt1777 || aClass143_6005.anInt1774 != aClass143_6005.anInt1779 || aClass143_6005.anInt1778 != aClass143_6005.anInt1781 || (aClass143_6005.anInt1781 ^ 0xffffffff) != (aClass143_6005.anInt1765 ^ 0xffffffff) || (aClass143_6005.anInt1766 ^ 0xffffffff) != (aClass143_6005.anInt1775 ^ 0xffffffff) || aClass143_6005.anInt1772 != aClass143_6005.anInt1775) {
			if (aBoolean6020) {
				aClass143_6014.anInt1778 = aClass143_6005.anInt1778;
				aClass143_6014.anInt1766 = aClass143_6005.anInt1766;
				aClass143_6014.anInt1777 = aClass143_6005.anInt1777;
				aClass143_6014.anInt1781 = aClass143_6005.anInt1781;
				aClass143_6014.anInt1775 = aClass143_6005.anInt1775;
				aClass143_6014.anInt1765 = aClass143_6005.anInt1765;
				aClass143_6014.anInt1772 = aClass143_6005.anInt1772;
				aBoolean6020 = false;
				aClass143_6014.anInt1774 = aClass143_6005.anInt1774;
				aClass143_6014.anInt1779 = aClass143_6005.anInt1779;
			}
		} else {
			aBoolean6020 = true;
		}
	}
	
	static final void method978(int i, int i_45_) {
		anInt6002++;
		CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(3, 7, (long) i_45_);
		cachenode_sub2.method2291((byte) 121);
		if (i > -42) {
			method975(false);
		}
	}
	
	static final void method979(int i) {
		Class304.method3544(255, -1, 89);
		anInt6001++;
		if (i != 17285) {
			anInt6013 = 66;
		}
	}
	
	EntityNode_Sub7(GraphicsToolkit graphicstoolkit, Class300 class300, EntityNode_Sub4 entitynode_sub4, long l) {
		aClass143_6005 = new Class143();
		aClass143_6014 = new Class143();
		aBoolean6020 = false;
		aClass300_6003 = class300;
		aLong5999 = l;
		anEntityNode_Sub4_6009 = entitynode_sub4;
		aClass355_6011 = aClass300_6003.method3495(99999999);
		if (!graphicstoolkit.x() && (aClass355_6011.anInt4353 ^ 0xffffffff) != 0) {
			aClass355_6011 = NpcDefinition.method3008((byte) 55, aClass355_6011.anInt4353);
		}
		aClass103_6006 = new Class103();
		anInt5998 += Math.random() * 64.0;
		method977((byte) 86);
		aClass143_6014.anInt1779 = aClass143_6005.anInt1779;
		aClass143_6014.anInt1778 = aClass143_6005.anInt1778;
		aClass143_6014.anInt1775 = aClass143_6005.anInt1775;
		aClass143_6014.anInt1765 = aClass143_6005.anInt1765;
		aClass143_6014.anInt1781 = aClass143_6005.anInt1781;
		aClass143_6014.anInt1772 = aClass143_6005.anInt1772;
		aClass143_6014.anInt1766 = aClass143_6005.anInt1766;
		aClass143_6014.anInt1774 = aClass143_6005.anInt1774;
		aClass143_6014.anInt1777 = aClass143_6005.anInt1777;
	}
}
