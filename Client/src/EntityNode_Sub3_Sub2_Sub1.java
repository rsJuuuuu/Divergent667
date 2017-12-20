/* EntityNode_Sub3_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class EntityNode_Sub3_Sub2_Sub1 extends EntityNode_Sub3_Sub2
{
	private short aShort11020;
	private short aShort11021;
	private short aShort11022;
	private int anInt11023;
	private short aShort11024;
	private short aShort11025;
	private short aShort11026;
	protected EntityNode_Sub7 anEntityNode_Sub7_11027;
	private int anInt11028;
	
	private final void method947() {
		int i = anEntityNode_Sub7_11027.anEntityNode_Sub4_6009.anInt5974;
		if (anEntityNode_Sub7_11027.anEntityNode_Sub4_6009.anEntityNode_Sub3_Sub2_Sub1Array5970[i] != null) {
			anEntityNode_Sub7_11027.anEntityNode_Sub4_6009.anEntityNode_Sub3_Sub2_Sub1Array5970[i].method951();
		}
		anEntityNode_Sub7_11027.anEntityNode_Sub4_6009.anEntityNode_Sub3_Sub2_Sub1Array5970[i] = this;
		aShort11020 = (short) anEntityNode_Sub7_11027.anEntityNode_Sub4_6009.anInt5974;
		anEntityNode_Sub7_11027.anEntityNode_Sub4_6009.anInt5974 = i + 1 & 0x1fff;
		anEntityNode_Sub7_11027.aClass103_6006.method1110(false, this);
	}
	
	final void method948(long l, int i) {
		aShort11026 -= i;
		if (aShort11026 <= 0) {
			method951();
		} else {
			int i_0_ = anInt9174 >> 12;
			int i_1_ = anInt9171 >> 12;
			int i_2_ = anInt9173 >> 12;
			EntityNode_Sub4 entitynode_sub4 = anEntityNode_Sub7_11027.anEntityNode_Sub4_6009;
			Class355 class355 = anEntityNode_Sub7_11027.aClass355_6011;
			if (class355.anInt4409 != 0) {
				if (aShort11022 - aShort11026 <= class355.anInt4387) {
					int i_3_ = (anInt9176 >> 8 & 0xff00) + (anInt11023 >> 16 & 0xff) + class355.anInt4422 * i;
					int i_4_ = (anInt9176 & 0xff00) + (anInt11023 >> 8 & 0xff) + class355.anInt4410 * i;
					int i_5_ = (anInt9176 << 8 & 0xff00) + (anInt11023 & 0xff) + class355.anInt4405 * i;
					if (i_3_ < 0) {
						i_3_ = 0;
					} else if (i_3_ > 65535) {
						i_3_ = 65535;
					}
					if (i_4_ < 0) {
						i_4_ = 0;
					} else if (i_4_ > 65535) {
						i_4_ = 65535;
					}
					if (i_5_ < 0) {
						i_5_ = 0;
					} else if (i_5_ > 65535) {
						i_5_ = 65535;
					}
					anInt9176 &= ~0xffffff;
					anInt9176 |= ((i_3_ & 0xff00) << 8) + (i_4_ & 0xff00) + ((i_5_ & 0xff00) >> 8);
					anInt11023 &= ~0xffffff;
					anInt11023 |= ((i_3_ & 0xff) << 16) + ((i_4_ & 0xff) << 8) + (i_5_ & 0xff);
				}
				if (aShort11022 - aShort11026 <= class355.anInt4416) {
					int i_6_ = (anInt9176 >> 16 & 0xff00) + (anInt11023 >> 24 & 0xff) + class355.anInt4364 * i;
					if (i_6_ < 0) {
						i_6_ = 0;
					} else if (i_6_ > 65535) {
						i_6_ = 65535;
					}
					anInt9176 &= 0xffffff;
					anInt9176 |= (i_6_ & 0xff00) << 16;
					anInt11023 &= 0xffffff;
					anInt11023 |= (i_6_ & 0xff) << 24;
				}
			}
			if (class355.anInt4413 != -1 && aShort11022 - aShort11026 <= class355.anInt4384) {
				anInt11028 += class355.anInt4368 * i;
			}
			if (class355.anInt4419 != -1 && aShort11022 - aShort11026 <= class355.anInt4398) {
				anInt9172 += class355.anInt4399 * i;
			}
			double d = (double) aShort11021;
			double d_7_ = (double) aShort11025;
			double d_8_ = (double) aShort11024;
			boolean bool = false;
			if (class355.anInt4380 == 1) {
				int i_9_ = i_0_ - anEntityNode_Sub7_11027.aClass143_6005.anInt1767;
				int i_10_ = i_1_ - anEntityNode_Sub7_11027.aClass143_6005.anInt1776;
				int i_11_ = i_2_ - anEntityNode_Sub7_11027.aClass143_6005.anInt1769;
				int i_12_ = (int) Math.sqrt((double) (i_9_ * i_9_ + i_10_ * i_10_ + i_11_ * i_11_)) >> 2;
				long l_13_ = (long) (class355.anInt4404 * i_12_ * i);
				anInt11028 -= (long) anInt11028 * l_13_ >> 18;
			} else if (class355.anInt4380 == 2) {
				int i_14_ = i_0_ - anEntityNode_Sub7_11027.aClass143_6005.anInt1767;
				int i_15_ = i_1_ - anEntityNode_Sub7_11027.aClass143_6005.anInt1776;
				int i_16_ = i_2_ - anEntityNode_Sub7_11027.aClass143_6005.anInt1769;
				int i_17_ = i_14_ * i_14_ + i_15_ * i_15_ + i_16_ * i_16_;
				long l_18_ = (long) (class355.anInt4404 * i_17_ * i);
				anInt11028 -= (long) anInt11028 * l_18_ >> 28;
			}
			if (class355.anIntArray4362 != null) {
				Node node = entitynode_sub4.aClass312_5976.aNode3958;
				for (Node node_19_ = node.aNode2800; node_19_ != node; node_19_ = node_19_.aNode2800) {
					CacheNode_Sub5 cachenode_sub5 = (CacheNode_Sub5) node_19_;
					Class249 class249 = cachenode_sub5.aClass249_9473;
					if (class249.anInt3160 != 1) {
						boolean bool_20_ = false;
						for (int i_21_ = 0; i_21_ < class355.anIntArray4362.length; i_21_++) {
							if (class355.anIntArray4362[i_21_] == class249.anInt3158) {
								bool_20_ = true;
								break;
							}
						}
						if (bool_20_) {
							double d_22_ = (double) (i_0_ - cachenode_sub5.anInt9475);
							double d_23_ = (double) (i_1_ - cachenode_sub5.anInt9471);
							double d_24_ = (double) (i_2_ - cachenode_sub5.anInt9468);
							double d_25_ = d_22_ * d_22_ + d_23_ * d_23_ + d_24_ * d_24_;
							if (!(d_25_ > (double) class249.aLong3156)) {
								double d_26_ = Math.sqrt(d_25_);
								if (d_26_ == 0.0) {
									d_26_ = 1.0;
								}
								double d_27_ = (d_22_ * (double) cachenode_sub5.anInt9472 + d_23_ * (double) class249.anInt3166 + d_24_ * (double) cachenode_sub5.anInt9470) * 65535.0 / ((double) class249.anInt3164 * d_26_);
								if (!(d_27_ < (double) class249.anInt3152)) {
									double d_28_ = 0.0;
									if (class249.anInt3163 == 1) {
										d_28_ = d_26_ / 16.0 * (double) class249.anInt3148;
									} else if (class249.anInt3163 == 2) {
										d_28_ = d_26_ / 16.0 * (d_26_ / 16.0) * (double) class249.anInt3148;
									}
									if (class249.anInt3162 == 0) {
										if (class249.anInt3155 == 0) {
											d += ((double) cachenode_sub5.anInt9472 - d_28_) * (double) i;
											d_7_ += ((double) class249.anInt3166 - d_28_) * (double) i;
											d_8_ += ((double) cachenode_sub5.anInt9470 - d_28_) * (double) i;
											bool = true;
										} else {
											anInt9174 += ((double) cachenode_sub5.anInt9472 - d_28_) * (double) i;
											anInt9171 += ((double) class249.anInt3166 - d_28_) * (double) i;
											anInt9173 += ((double) cachenode_sub5.anInt9470 - d_28_) * (double) i;
										}
									} else {
										double d_29_ = d_22_ / d_26_ * (double) class249.anInt3164;
										double d_30_ = d_23_ / d_26_ * (double) class249.anInt3164;
										double d_31_ = d_24_ / d_26_ * (double) class249.anInt3164;
										if (class249.anInt3155 == 0) {
											d += d_29_ * (double) i;
											d_7_ += d_30_ * (double) i;
											d_8_ += d_31_ * (double) i;
											bool = true;
										} else {
											anInt9174 += d_29_ * (double) i;
											anInt9171 += d_30_ * (double) i;
											anInt9173 += d_31_ * (double) i;
										}
									}
								}
							}
						}
					}
				}
			}
			if (class355.anIntArray4371 != null) {
				for (int i_32_ = 0; i_32_ < class355.anIntArray4371.length; i_32_++) {
					CacheNode_Sub5 cachenode_sub5 = (CacheNode_Sub5) Node_Sub41.aClass114_7519.method1157((long) class355.anIntArray4371[i_32_], 1);
					while (cachenode_sub5 != null) {
						Class249 class249 = cachenode_sub5.aClass249_9473;
						double d_33_ = (double) (i_0_ - cachenode_sub5.anInt9475);
						double d_34_ = (double) (i_1_ - cachenode_sub5.anInt9471);
						double d_35_ = (double) (i_2_ - cachenode_sub5.anInt9468);
						double d_36_ = d_33_ * d_33_ + d_34_ * d_34_ + d_35_ * d_35_;
						if (d_36_ > (double) class249.aLong3156) {
							cachenode_sub5 = (CacheNode_Sub5) Node_Sub41.aClass114_7519.method1158(-1);
						} else {
							double d_37_ = Math.sqrt(d_36_);
							if (d_37_ == 0.0) {
								d_37_ = 1.0;
							}
							double d_38_ = (d_33_ * (double) cachenode_sub5.anInt9472 + d_34_ * (double) class249.anInt3166 + d_35_ * (double) cachenode_sub5.anInt9470) * 65535.0 / ((double) class249.anInt3164 * d_37_);
							if (d_38_ < (double) class249.anInt3152) {
								cachenode_sub5 = (CacheNode_Sub5) Node_Sub41.aClass114_7519.method1158(-1);
							} else {
								double d_39_ = 0.0;
								if (class249.anInt3163 == 1) {
									d_39_ = d_37_ / 16.0 * (double) class249.anInt3148;
								} else if (class249.anInt3163 == 2) {
									d_39_ = d_37_ / 16.0 * (d_37_ / 16.0) * (double) class249.anInt3148;
								}
								if (class249.anInt3162 == 0) {
									if (class249.anInt3155 == 0) {
										d += ((double) cachenode_sub5.anInt9472 - d_39_) * (double) i;
										d_7_ += ((double) class249.anInt3166 - d_39_) * (double) i;
										d_8_ += ((double) cachenode_sub5.anInt9470 - d_39_) * (double) i;
										bool = true;
									} else {
										anInt9174 += ((double) cachenode_sub5.anInt9472 - d_39_) * (double) i;
										anInt9171 += ((double) class249.anInt3166 - d_39_) * (double) i;
										anInt9173 += ((double) cachenode_sub5.anInt9470 - d_39_) * (double) i;
									}
								} else {
									double d_40_ = d_33_ / d_37_ * (double) class249.anInt3164;
									double d_41_ = d_34_ / d_37_ * (double) class249.anInt3164;
									double d_42_ = d_35_ / d_37_ * (double) class249.anInt3164;
									if (class249.anInt3155 == 0) {
										d += d_40_ * (double) i;
										d_7_ += d_41_ * (double) i;
										d_8_ += d_42_ * (double) i;
										bool = true;
									} else {
										anInt9174 += d_40_ * (double) i;
										anInt9171 += d_41_ * (double) i;
										anInt9173 += d_42_ * (double) i;
									}
								}
								cachenode_sub5 = (CacheNode_Sub5) Node_Sub41.aClass114_7519.method1158(-1);
							}
						}
					}
				}
			}
			if (class355.anIntArray4414 != null) {
				if (class355.anIntArray4352 == null) {
					class355.anIntArray4352 = new int[class355.anIntArray4414.length];
					for (int i_43_ = 0; i_43_ < class355.anIntArray4414.length; i_43_++) {
						Class320_Sub1.method3680(1, class355.anIntArray4414[i_43_]);
						class355.anIntArray4352[i_43_] = ((Node_Sub32) Class269.aHashTable3465.method1518(3512, (long) class355.anIntArray4414[i_43_])).anInt7381;
					}
				}
				for (int i_44_ = 0; i_44_ < class355.anIntArray4352.length; i_44_++) {
					Class249 class249 = Class198.aClass249Array2428[class355.anIntArray4352[i_44_]];
					if (class249.anInt3155 == 0) {
						d += (double) (class249.anInt3157 * i);
						d_7_ += (double) (class249.anInt3166 * i);
						d_8_ += (double) (class249.anInt3150 * i);
						bool = true;
					} else {
						anInt9174 += class249.anInt3157 * i;
						anInt9171 += class249.anInt3166 * i;
						anInt9173 += class249.anInt3150 * i;
					}
				}
			}
			if (bool) {
				while (d > 32767.0 || d_7_ > 32767.0 || d_8_ > 32767.0 || d < -32767.0 || d_7_ < -32767.0 || d_8_ < -32767.0) {
					d /= 2.0;
					d_7_ /= 2.0;
					d_8_ /= 2.0;
					anInt11028 <<= 1;
				}
				aShort11021 = (short) (int) d;
				aShort11025 = (short) (int) d_7_;
				aShort11024 = (short) (int) d_8_;
			}
			anInt9174 += ((long) aShort11021 * (long) (anInt11028 << 2) >> 23) * (long) i;
			anInt9171 += ((long) aShort11025 * (long) (anInt11028 << 2) >> 23) * (long) i;
			anInt9173 += ((long) aShort11024 * (long) (anInt11028 << 2) >> 23) * (long) i;
		}
	}
	
	final void method949(GraphicsToolkit graphicstoolkit, long l) {
		int i = anInt9174 >> 12 + Class36.anInt549;
		int i_45_ = anInt9173 >> 12 + Class36.anInt549;
		int i_46_ = anInt9171 >> 12;
		if (i_46_ > 0 || i_46_ < -262144 || i < 0 || i >= Class328.anInt4115 || i_45_ < 0 || i_45_ >= Node_Sub50.anInt7623) {
			method951();
		} else {
			EntityNode_Sub4 entitynode_sub4 = anEntityNode_Sub7_11027.anEntityNode_Sub4_6009;
			Class355 class355 = anEntityNode_Sub7_11027.aClass355_6011;
			Plane[] planes = Class320_Sub10.aPlaneArray8300;
			int i_47_ = entitynode_sub4.anInt5979;
			Class261 class261 = Class175.aClass261ArrayArrayArray2099[entitynode_sub4.anInt5979][i][i_45_];
			if (class261 != null) {
				i_47_ = class261.aByte3311;
			}
			int i_48_ = planes[i_47_].method3251(i_45_, i, (byte) -118);
			int i_49_;
			if (i_47_ < Class159.anInt1995 - 1) {
				i_49_ = planes[i_47_ + 1].method3251(i_45_, i, (byte) -118);
			} else {
				i_49_ = i_48_ - (8 << Class36.anInt549);
			}
			if (class355.aBoolean4406) {
				if (class355.anInt4407 == -1 && i_46_ > i_48_) {
					method951();
					return;
				}
				if (class355.anInt4407 >= 0 && i_46_ > planes[class355.anInt4407].method3251(i_45_, i, (byte) -118)) {
					method951();
					return;
				}
				if (class355.anInt4374 == -1 && i_46_ < i_49_) {
					method951();
					return;
				}
				if (class355.anInt4374 >= 0 && i_46_ < planes[class355.anInt4374 + 1].method3251(i_45_, i, (byte) -118)) {
					method951();
					return;
				}
			}
			int i_50_;
			for (i_50_ = Class159.anInt1995 - 1; i_50_ > 0 && i_46_ > planes[i_50_].method3251(i_45_, i, (byte) -118); i_50_--) {
				/* empty */
			}
			if (class355.aBoolean4354 && i_50_ == 0 && i_46_ > planes[0].method3251(i_45_, i, (byte) -118)) {
				method951();
			} else if (i_50_ == Class159.anInt1995 - 1 && planes[i_50_].method3251(i_45_, i, (byte) -118) - i_46_ > 8 << Class36.anInt549) {
				method951();
			} else {
				class261 = Class175.aClass261ArrayArrayArray2099[i_50_][i][i_45_];
				if (class261 == null) {
					if (i_50_ == 0 || Class175.aClass261ArrayArrayArray2099[0][i][i_45_] == null) {
						class261 = Class175.aClass261ArrayArrayArray2099[0][i][i_45_] = new Class261(0);
					}
					boolean bool = Class175.aClass261ArrayArrayArray2099[0][i][i_45_].aClass261_3310 != null;
					if (i_50_ == 3 && bool) {
						method951();
						return;
					}
					for (int i_51_ = 1; i_51_ <= i_50_; i_51_++) {
						if (Class175.aClass261ArrayArrayArray2099[i_51_][i][i_45_] == null) {
							class261 = Class175.aClass261ArrayArrayArray2099[i_51_][i][i_45_] = new Class261(i_51_);
							if (bool) {
								class261.aByte3311++;
							}
						}
					}
				}
				if (class355.aBoolean4355) {
					int i_52_ = anInt9174 >> 12;
					int i_53_ = anInt9173 >> 12;
					if (class261.anAnimable_Sub2_3314 != null) {
						Class171 class171 = class261.anAnimable_Sub2_3314.method809(graphicstoolkit, -105);
						if (class171 != null && class171.method1795(i_46_, (byte) 119, i_53_, i_52_)) {
							method951();
							return;
						}
					}
					if (class261.anAnimable_Sub2_3308 != null) {
						Class171 class171 = class261.anAnimable_Sub2_3308.method809(graphicstoolkit, -120);
						if (class171 != null && class171.method1795(i_46_, (byte) 120, i_53_, i_52_)) {
							method951();
							return;
						}
					}
					if (class261.anAnimable_Sub1_3317 != null) {
						Class171 class171 = class261.anAnimable_Sub1_3317.method809(graphicstoolkit, -109);
						if (class171 != null && class171.method1795(i_46_, (byte) 107, i_53_, i_52_)) {
							method951();
							return;
						}
					}
					for (Class256 class256 = class261.aClass256_3312; class256 != null; class256 = class256.aClass256_3238) {
						Class171 class171 = class256.aMobile3239.method809(graphicstoolkit, -117);
						if (class171 != null && class171.method1795(i_46_, (byte) 119, i_53_, i_52_)) {
							method951();
							return;
						}
					}
				}
				entitynode_sub4.aClass198_5977.aClass87_2429.method1012(127, this);
			}
		}
	}
	
	EntityNode_Sub3_Sub2_Sub1(EntityNode_Sub7 entitynode_sub7, int i, int i_54_, int i_55_, int i_56_, int i_57_, int i_58_, int i_59_, int i_60_, int i_61_, int i_62_, int i_63_, boolean bool, boolean bool_64_) {
		anEntityNode_Sub7_11027 = entitynode_sub7;
		anInt9174 = i << 12;
		anInt9171 = i_54_ << 12;
		anInt9173 = i_55_ << 12;
		anInt9176 = i_61_;
		aShort11022 = aShort11026 = (short) i_60_;
		anInt9172 = i_62_;
		anInt9177 = i_63_;
		aBoolean9169 = bool_64_;
		aShort11021 = (short) i_56_;
		aShort11025 = (short) i_57_;
		aShort11024 = (short) i_58_;
		anInt11028 = i_59_;
		aByte9170 = anEntityNode_Sub7_11027.aClass300_6003.aByte3768;
		method947();
	}
	
	final void method950(EntityNode_Sub7 entitynode_sub7, int i, int i_65_, int i_66_, int i_67_, int i_68_, int i_69_, int i_70_, int i_71_, int i_72_, int i_73_, int i_74_, boolean bool, boolean bool_75_) {
		anEntityNode_Sub7_11027 = entitynode_sub7;
		anInt9174 = i << 12;
		anInt9171 = i_65_ << 12;
		anInt9173 = i_66_ << 12;
		anInt9176 = i_72_;
		aShort11022 = aShort11026 = (short) i_71_;
		anInt9172 = i_73_;
		anInt9177 = i_74_;
		aBoolean9169 = bool_75_;
		aShort11021 = (short) i_67_;
		aShort11025 = (short) i_68_;
		aShort11024 = (short) i_69_;
		anInt11028 = i_70_;
		aByte9170 = anEntityNode_Sub7_11027.aClass300_6003.aByte3768;
		method947();
	}
	
	final void method951() {
		anEntityNode_Sub7_11027.anEntityNode_Sub4_6009.anEntityNode_Sub3_Sub2_Sub1Array5970[aShort11020] = null;
		Class284.anEntityNode_Sub3_Sub2_Sub1Array3596[Packet.anInt9386] = this;
		Packet.anInt9386 = Packet.anInt9386 + 1 & 0x3ff;
		this.method803(false);
		this.method937(true);
	}
}
