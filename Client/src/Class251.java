/* Class251 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class251
{
	static int anInt3180;
	static int anInt3181;
	protected int anInt3182;
	static int anInt3183;
	static int anInt3184;
	static int anInt3185;
	static int anInt3186;
	static int anInt3187;
	
	static final void method3097(Actor actor, int i) {
		if (actor instanceof Npc) {
			Npc npc = (Npc) actor;
			if (npc.aNpcDefinition11122 != null) {
				Class352.drawNPCOptions((Class295.myPlayer.plane ^ 0xffffffff) != (npc.plane ^ 0xffffffff), npc);
			}
		} else if (actor instanceof Player) {
			Player player = (Player) actor;
			Class223.drawPlayerOptions(player.plane != Class295.myPlayer.plane, player, -15052);
		}
		anInt3181++;
		if (i >= -80) {
			method3101(54, (byte) 109);
		}
	}
	
	public final String toString() {
		anInt3180++;
		throw new IllegalStateException();
	}
	
	static final int method3098(boolean bool) {
		anInt3184++;
		if ((double) Class20.aFloat329 == 3.0) {
			return 37;
		}
		if ((double) Class20.aFloat329 == 4.0) {
			return 50;
		}
		if ((double) Class20.aFloat329 == 6.0) {
			return 75;
		}
		if (bool != true) {
			method3097(null, -110);
		}
		if ((double) Class20.aFloat329 == 8.0) {
			return 100;
		}
		return 200;
	}
	
	static final void method3099(byte b, int i, int i_0_, int i_1_, int i_2_, int[] is, int[] is_3_, int i_4_, int i_5_, int[] is_6_, boolean bool, boolean bool_7_, int i_8_, int[] is_9_, byte[][][] bs, int[] is_10_, int i_11_, int i_12_) {
		anInt3183++;
		if (Class320_Sub20.anInt8397 != -1) {
			int[] is_13_ = Class44.aGraphicsToolkit668.Y();
			int i_14_ = is_13_[0];
			int i_15_ = is_13_[1];
			int i_16_ = is_13_[2];
			int i_17_ = is_13_[3];
			int i_18_ = i_16_;
			int i_19_ = i_17_;
			if ((Class320_Sub20.anInt8397 ^ 0xffffffff) == -2) {
				i_19_ = (int) ((double) Class148.anInt1825 * (double) i_17_ / (double) Class303.anInt3831);
				i_18_ = (int) ((double) Class148.anInt1825 * (double) i_16_ / (double) Class303.anInt3831);
			}
			if (!Class194_Sub1.aBoolean6892) {
				if ((Class320_Sub20.anInt8397 ^ 0xffffffff) == -2) {
					Class169_Sub3.method1782(127);
				}
				int i_20_ = -Class186.anInt2261 + i;
				int i_21_ = i_1_ + -Class82.anInt1111;
				int i_22_ = -MainFile.anInt148 + i_0_;
				int i_23_ = (int) ((Class195.aDouble2401 * (double) i_22_ + (SeekableFile.aDouble3883 * (double) i_21_ + Class363.aDouble4509 * (double) i_20_)) * (double) i_18_ / (double) i_8_);
				int i_24_ = (int) (((double) i_22_ * Class326.aDouble4108 + ((double) i_21_ * FileOnDisk.aDouble1318 + (double) i_20_ * Animable_Sub2_Sub1.aDouble10631)) * (double) i_19_ / (double) i_8_);
				double d = Class320_Sub6.aDouble8262 * (double) i_20_ + (double) i_21_ * Class165.aDouble2028 + Class282.aDouble3585 * (double) i_22_;
				int i_25_ = -Class319.anInt4057 + (i_23_ + Node_Sub23_Sub1.anInt9929);
				int i_26_ = -Class312.anInt3977 + (i_24_ + Class372.anInt4600);
				int i_27_ = i_25_ + Animable_Sub1_Sub2.anInt10668;
				int i_28_ = Class148.anInt1825 + i_26_;
				if (i_25_ >= 0 && i_26_ >= 0 && (CacheNode_Sub15.anInt9589 ^ 0xffffffff) <= (i_27_ ^ 0xffffffff) && i_28_ <= Class303.anInt3831 || (Class320_Sub20.anInt8397 ^ 0xffffffff) == -3) {
					if (Class320_Sub20.anInt8397 == 2) {
						Class346.aDouble4277 = -d;
					}
					Class166.anInt5100 = i_26_;
					Node_Sub38_Sub1.anInt10075 = i_25_;
				} else if ((i_27_ ^ 0xffffffff) >= -1 || (i_28_ ^ 0xffffffff) >= -1 || CacheNode_Sub15.anInt9589 <= i_25_ || Class303.anInt3831 <= i_26_) {
					Class194_Sub1.aBoolean6892 = true;
				} else {
					int i_29_ = i_25_ - Node_Sub23_Sub1.anInt9929;
					int i_30_ = i_26_ - Class372.anInt4600;
					int i_31_ = 0;
					int i_32_ = 0;
					int i_33_ = 0;
					int i_34_ = 0;
					double d_35_ = 0.0;
					if (Class320_Sub20.anInt8397 != 0) {
						if (Class320_Sub20.anInt8397 == 1) {
							i_34_ = i_30_ / aa_Sub3.anInt5493;
							i_33_ = i_29_ / StandardSprite.anInt8946;
							i_32_ = i_34_ * aa_Sub3.anInt5493;
							i_31_ = StandardSprite.anInt8946 * i_33_;
							d_35_ = (double) (i_29_ * i_31_ - -(i_32_ * i_30_)) * (d + Class346.aDouble4277) / (double) (i_30_ * i_30_ + i_29_ * i_29_);
						}
					} else {
						i_31_ = i_29_;
						i_32_ = i_30_;
						d_35_ = d + Class346.aDouble4277;
					}
					d_35_ = -d_35_;
					int i_36_ = 0;
					int i_37_ = 0;
					int i_38_ = 0;
					int i_39_ = 0;
					int i_40_ = 0;
					int i_41_ = 0;
					int i_42_;
					int i_43_;
					int i_44_;
					int i_45_;
					if ((i_31_ ^ 0xffffffff) <= -1) {
						i_43_ = CacheNode_Sub15.anInt9589 - i_31_;
						i_42_ = 0;
						i_45_ = i_31_;
						i_44_ = i_43_;
						if ((Class320_Sub20.anInt8397 ^ 0xffffffff) == -2) {
							i_40_ = i_33_;
							i_38_ = Class117.anInt1479 - i_33_;
						}
					} else {
						i_42_ = -i_31_;
						i_43_ = i_31_ + CacheNode_Sub15.anInt9589;
						i_44_ = 0;
						i_45_ = i_42_;
						if ((Class320_Sub20.anInt8397 ^ 0xffffffff) == -2) {
							i_38_ = 0;
							i_40_ = -i_33_;
						}
					}
					int i_46_;
					int i_47_;
					int i_48_;
					int i_49_;
					int i_50_;
					int i_51_;
					if ((i_32_ ^ 0xffffffff) > -1) {
						i_47_ = -i_32_;
						i_51_ = 0;
						i_46_ = Class303.anInt3831 - -i_32_;
						i_50_ = i_47_;
						i_48_ = i_50_;
						i_49_ = i_46_;
						if ((Class320_Sub20.anInt8397 ^ 0xffffffff) == -2) {
							i_36_ = 0;
							i_37_ = -i_34_;
							i_39_ = i_37_;
							i_41_ = Class290_Sub11.anInt8181 - -i_34_;
						}
					} else {
						i_46_ = Class303.anInt3831 - i_32_;
						i_47_ = 0;
						if ((Class320_Sub20.anInt8397 ^ 0xffffffff) == -2) {
							i_39_ = 0;
							i_37_ = i_34_;
							i_36_ = Class290_Sub11.anInt8181 + -i_34_;
							i_41_ = i_36_;
						}
						i_48_ = 0;
						i_49_ = i_46_;
						i_50_ = i_32_;
						i_51_ = i_46_;
					}
					Class103 class103 = Class7.aClass179_157.aClass103_2124;
					for (EntityNode_Sub6 entitynode_sub6 = (EntityNode_Sub6) class103.method1113((byte) 115); entitynode_sub6 != null; entitynode_sub6 = (EntityNode_Sub6) class103.method1108(109)) {
						EntityNode_Sub5[] entitynode_sub5s = entitynode_sub6.anEntityNode_Sub5Array5995;
						boolean bool_52_ = true;
						for (int i_53_ = 0; entitynode_sub5s.length > i_53_; i_53_++) {
							EntityNode_Sub5 entitynode_sub5 = entitynode_sub5s[i_53_];
							int i_54_ = entitynode_sub5.anInt5985;
							int i_55_ = entitynode_sub5.anInt5986;
							int i_56_ = entitynode_sub5.anInt5982;
							int i_57_ = entitynode_sub5.anInt5984;
							int i_58_ = entitynode_sub5.anInt5983;
							entitynode_sub5.anInt5986 = i_55_ = -i_32_ + i_55_;
							entitynode_sub5.anInt5984 = i_57_ = -i_32_ + i_57_;
							entitynode_sub5.anInt5985 = i_54_ = -i_31_ + i_54_;
							entitynode_sub5.anInt5982 = i_56_ = -i_31_ + i_56_;
							if (bool_52_) {
								int i_59_ = -i_58_ + ((i_54_ ^ 0xffffffff) <= (i_56_ ^ 0xffffffff) ? i_56_ : i_54_);
								if ((CacheNode_Sub15.anInt9589 ^ 0xffffffff) <= (i_59_ ^ 0xffffffff)) {
									int i_60_ = -i_58_ + (i_55_ < i_57_ ? i_55_ : i_57_);
									if (i_60_ <= Class303.anInt3831) {
										int i_61_ = (i_54_ < i_56_ ? i_56_ : i_54_) - -i_58_;
										if (i_61_ >= 0) {
											int i_62_ = ((i_55_ ^ 0xffffffff) <= (i_57_ ^ 0xffffffff) ? i_55_ : i_57_) - -i_58_;
											if ((i_62_ ^ 0xffffffff) <= -1) {
												bool_52_ = false;
											}
										}
									}
								}
							}
						}
						if (bool_52_) {
							entitynode_sub6.method803(false);
							Class148.method1650(i_12_ + -1, entitynode_sub6);
						}
					}
					if ((Class320_Sub20.anInt8397 ^ 0xffffffff) == -1) {
						Class44.aGraphicsToolkit668.a(Node_Sub15_Sub9.anInterface6_9843);
					}
					Class44.aGraphicsToolkit668.F(-i_31_, -i_32_);
					Class44.aGraphicsToolkit668.b(i_42_, i_47_, i_43_, i_46_, d_35_);
					Node_Sub38_Sub11.method2826(true, Class346.aDouble4277 + d_35_);
					Class320_Sub10.aDouble8299 = d_35_ + Class346.aDouble4277;
					if ((Class320_Sub20.anInt8397 ^ 0xffffffff) == -2) {
						Class320_Sub16.anInt8361 = -Class312.anInt3977 + (i_15_ + -i_32_);
						Node_Sub38_Sub20.anInt10298 = i_18_;
						Class349.anInt4305 = i_19_;
						Class186.anInt2250 = -i_31_ + (-Class319.anInt4057 + i_14_);
						Class44.aGraphicsToolkit668.DA(Class186.anInt2250, Class320_Sub16.anInt8361, Node_Sub38_Sub20.anInt10298, Class349.anInt4305);
					} else {
						Class349.anInt4305 = i_19_;
						Class320_Sub16.anInt8361 = -i_32_ + i_15_ + Class372.anInt4600 - Class312.anInt3977;
						Class186.anInt2250 = -i_31_ + -Class319.anInt4057 + Node_Sub23_Sub1.anInt9929 + i_14_;
						Node_Sub38_Sub20.anInt10298 = i_18_;
						Class44.aGraphicsToolkit668.DA(Class186.anInt2250, Class320_Sub16.anInt8361, Node_Sub38_Sub20.anInt10298, Class349.anInt4305);
					}
					Class320_Sub5.method3695(Class7.aClass179_157);
					if ((i_50_ ^ 0xffffffff) < -1) {
						Class44.aGraphicsToolkit668.KA(0, i_51_, CacheNode_Sub15.anInt9589, i_51_ - -i_50_);
						Class44.aGraphicsToolkit668.ya();
						Class44.aGraphicsToolkit668.GA(Node_Sub43.anInt7539);
						Class151.method1671(i_4_, i, i_1_, i_0_, bs, is_6_, is_9_, is, is_10_, is_3_, i_5_, b, i_11_, i_2_, bool, bool_7_, i_8_, 1, false);
					}
					if (i_45_ > 0) {
						Class44.aGraphicsToolkit668.KA(i_44_, i_48_, i_45_ + i_44_, i_49_ + i_48_);
						Class44.aGraphicsToolkit668.ya();
						Class44.aGraphicsToolkit668.GA(Node_Sub43.anInt7539);
						Class151.method1671(i_4_, i, i_1_, i_0_, bs, is_6_, is_9_, is, is_10_, is_3_, i_5_, b, i_11_, i_2_, bool, bool_7_, i_8_, 1, false);
					}
					Class44.aGraphicsToolkit668.la();
					Node_Sub38_Sub7.method2805();
					if (Class320_Sub20.anInt8397 == 0) {
						Class44.aGraphicsToolkit668.v();
					}
					Class312.anInt3977 += i_32_;
					Class319.anInt4057 += i_31_;
					Class346.aDouble4277 += d_35_;
					Class166.anInt5100 = -Class312.anInt3977 + (Class372.anInt4600 + i_24_);
					Node_Sub38_Sub1.anInt10075 = i_23_ + (Node_Sub23_Sub1.anInt9929 + -Class319.anInt4057);
					if (Class320_Sub20.anInt8397 == 1) {
						Class338.anInt4190 += i_33_;
						Class259.anInt3300 += i_34_;
						for (int i_63_ = 0; (i_63_ ^ 0xffffffff) > (Class290_Sub11.anInt8181 ^ 0xffffffff); i_63_++) {
							int i_64_ = AnimableAnimator.method254(Class259.anInt3300 + i_63_, i_12_ ^ 0x422a, Class290_Sub11.anInt8181) * Class117.anInt1479;
							for (int i_65_ = 0; (i_65_ ^ 0xffffffff) > (Class117.anInt1479 ^ 0xffffffff); i_65_++) {
								int i_66_ = AnimableAnimator.method254(i_65_ + Class338.anInt4190, 16939, Class117.anInt1479) + i_64_;
								boolean bool_67_ = (i_63_ ^ 0xffffffff) <= (i_36_ ^ 0xffffffff) && (i_63_ ^ 0xffffffff) > (i_36_ + i_37_ ^ 0xffffffff) || i_39_ <= i_63_ && (i_63_ ^ 0xffffffff) > (i_41_ + i_39_ ^ 0xffffffff) && i_65_ >= i_38_ && (i_65_ ^ 0xffffffff) > (i_40_ + i_38_ ^ 0xffffffff);
								Class352.anInterface6Array4332[i_66_].method18(i_65_ * StandardSprite.anInt8946, aa_Sub3.anInt5493 * i_63_, StandardSprite.anInt8946, aa_Sub3.anInt5493, 0, 0, bool_67_, true);
							}
						}
					}
				}
			}
			if (Class194_Sub1.aBoolean6892) {
				Class186.anInt2261 = i;
				Class319.anInt4057 = 0;
				MainFile.anInt148 = i_0_;
				Class346.aDouble4277 = 0.0;
				Node_Sub38_Sub1.anInt10075 = Node_Sub23_Sub1.anInt9929;
				Class82.anInt1111 = i_1_;
				Class312.anInt3977 = 0;
				Class166.anInt5100 = Class372.anInt4600;
				if ((Class320_Sub20.anInt8397 ^ 0xffffffff) == -1) {
					Class44.aGraphicsToolkit668.a(Node_Sub15_Sub9.anInterface6_9843);
				}
				Class44.aGraphicsToolkit668.la();
				Class44.aGraphicsToolkit668.ya();
				Class44.aGraphicsToolkit668.GA(Node_Sub43.anInt7539);
				Class225.aClass336_2678.method3864(Class186.anInt2261, Class82.anInt1111, MainFile.anInt148, Class368.anInt4550, Class72.anInt973, Node_Sub29_Sub1.anInt10012);
				Class44.aGraphicsToolkit668.a(Class225.aClass336_2678);
				if (Class320_Sub20.anInt8397 != 1) {
					Class186.anInt2250 = Node_Sub23_Sub1.anInt9929 + i_14_;
					Node_Sub38_Sub20.anInt10298 = i_18_;
					Class349.anInt4305 = i_19_;
					Class320_Sub16.anInt8361 = i_15_ - -Class372.anInt4600;
					Class44.aGraphicsToolkit668.DA(Class186.anInt2250, Class320_Sub16.anInt8361, Node_Sub38_Sub20.anInt10298, Class349.anInt4305);
				} else {
					Class186.anInt2250 = i_14_;
					Class320_Sub16.anInt8361 = i_15_;
					Node_Sub38_Sub20.anInt10298 = i_18_;
					Class349.anInt4305 = i_19_;
					Class44.aGraphicsToolkit668.DA(Class186.anInt2250, Class320_Sub16.anInt8361, Node_Sub38_Sub20.anInt10298, Class349.anInt4305);
				}
				Class320_Sub10.aDouble8299 = 0.0;
				Class7.aClass179_157.method1815((byte) 74);
				Class320_Sub5.method3695(Class7.aClass179_157);
				Class151.method1671(i_4_, i, i_1_, i_0_, bs, is_6_, is_9_, is, is_10_, is_3_, i_5_, b, i_11_, i_2_, bool, bool_7_, i_8_, 1, false);
				Node_Sub38_Sub7.method2805();
				Class194_Sub1.aBoolean6892 = false;
				if (Class320_Sub20.anInt8397 == 0) {
					Class44.aGraphicsToolkit668.v();
				}
				if ((Class320_Sub20.anInt8397 ^ 0xffffffff) == -2) {
					RuntimeException_Sub1.method4210((byte) -12);
				}
			}
			if (Class320_Sub20.anInt8397 == 0) {
				Node_Sub15_Sub9.anInterface6_9843.method19(Node_Sub38_Sub1.anInt10075, Class166.anInt5100, Animable_Sub1_Sub2.anInt10668, Class148.anInt1825, 0, 0, true, true);
			}
			Class225.anInt2675++;
			Node_Sub38_Sub11.method2826(true, Class346.aDouble4277);
			Class157.aDouble1981 = Class346.aDouble4277;
			if (Class320_Sub20.anInt8397 != 0 && Class320_Sub20.anInt8397 != 2) {
				if ((Class320_Sub20.anInt8397 ^ 0xffffffff) == -2) {
					Class30.anInt491 = i_18_;
					Class118.anInt5404 = i_14_ + -Class319.anInt4057;
					Class320_Sub23.anInt8433 = i_15_ - Class312.anInt3977;
					Class320_Sub10.anInt8303 = i_19_;
					Class44.aGraphicsToolkit668.DA(Class118.anInt5404, Class320_Sub23.anInt8433, Class30.anInt491, Class320_Sub10.anInt8303);
					Class44.aGraphicsToolkit668.KA(Node_Sub38_Sub1.anInt10075, Class166.anInt5100, Node_Sub38_Sub1.anInt10075 + Animable_Sub1_Sub2.anInt10668, Class148.anInt1825 + Class166.anInt5100);
				}
			} else {
				if (Class320_Sub20.anInt8397 == 2) {
					Class44.aGraphicsToolkit668.GA(Node_Sub43.anInt7539);
					Class44.aGraphicsToolkit668.ya();
				}
				Class30.anInt491 = i_18_;
				Class320_Sub23.anInt8433 = -Class166.anInt5100 + i_15_ - (-Class372.anInt4600 + Class312.anInt3977);
				Class118.anInt5404 = -Node_Sub38_Sub1.anInt10075 + -Class319.anInt4057 + i_14_ - -Node_Sub23_Sub1.anInt9929;
				Class320_Sub10.anInt8303 = i_19_;
				Class44.aGraphicsToolkit668.DA(Class118.anInt5404, Class320_Sub23.anInt8433, Class30.anInt491, Class320_Sub10.anInt8303);
			}
			Class151.method1671(i_4_, i, i_1_, i_0_, bs, is_6_, is_9_, is, is_10_, is_3_, i_5_, b, i_11_, i_2_, bool, bool_7_, i_8_, Class320_Sub20.anInt8397 != 2 ? 2 : 0, i_12_ == Class320_Sub20.anInt8397);
			Class44.aGraphicsToolkit668.la();
			Class44.aGraphicsToolkit668.DA(i_14_, i_15_, i_16_, i_17_);
		}
	}
	
	static final void decodeReceivedDynamicMapRegions(boolean bool) {
		anInt3186++;
		Packet packet = Class218.aClass123_2566.aPacket1570;
		int gameSceneBaseRegionY = packet.readUnsignedShort();
		int mapSize = packet.readUnsignedByte();
		boolean forceRefresh = (packet.readUnsigned128Byte() ^ 0xffffffff) == -2;
		Class61.anInt898 = packet.readUnsigned128Byte();
		int gameSceneBaseRegionX = packet.readUnsignedShortLE();
		Class95.method1066(62);
		Animable_Sub2.updateGameSceneSize(mapSize);
		packet.initBitAccess();
		for (int i_71_ = 0; i_71_ < 4; i_71_++) {
			for (int i_72_ = 0; Node_Sub54.GAME_SCENE_WDITH >> 3 > i_72_; i_72_++) {
				for (int i_73_ = 0; (i_73_ ^ 0xffffffff) > (Class377_Sub1.GAME_SCENE_HEIGHT >> 3 ^ 0xffffffff); i_73_++) {
					int i_74_ = packet.readBits(1);
					if ((i_74_ ^ 0xffffffff) != -2) {
						Class330.anIntArrayArrayArray4128[i_71_][i_72_][i_73_] = -1;
					} else {
						Class330.anIntArrayArrayArray4128[i_71_][i_72_][i_73_] = packet.readBits(26);
					}
				}
			}
		}
		packet.finishBitAccess();
		int i_75_ = (Class218.aClass123_2566.anInt1581 + -packet.offset) / 16;
		Class15.XTEA_KEYS = new int[i_75_][4];
		for (int i_76_ = 0; (i_75_ ^ 0xffffffff) < (i_76_ ^ 0xffffffff); i_76_++) {
			for (int i_77_ = 0; (i_77_ ^ 0xffffffff) > -5; i_77_++)
				Class15.XTEA_KEYS[i_76_][i_77_] = packet.readInt();
		}
		FileOnDisk.aByteArrayArray1331 = new byte[i_75_][];
		Class320_Sub6.aByteArrayArray8263 = new byte[i_75_][];
		Class144.anIntArray1789 = new int[i_75_];
		Class204.anIntArray2460 = null;
		Class262_Sub1.MAP_REGION_HASHES = new int[i_75_];
		ProducingGraphicsBuffer.anIntArray9895 = new int[i_75_];
		Class320_Sub18.aByteArrayArray8378 = new byte[i_75_][];
		if (bool == false) {
			StandardPlane.anIntArray7980 = new int[i_75_];
			Class188_Sub1_Sub1.aByteArrayArray9334 = new byte[i_75_][];
			Class194.aByteArrayArray2373 = null;
			Class42.anIntArray645 = new int[i_75_];
			i_75_ = 0;
			for (int i_78_ = 0; i_78_ < 4; i_78_++) {
				for (int i_79_ = 0; (i_79_ ^ 0xffffffff) > (Node_Sub54.GAME_SCENE_WDITH >> 3 ^ 0xffffffff); i_79_++) {
					for (int i_80_ = 0; Class377_Sub1.GAME_SCENE_HEIGHT >> 3 > i_80_; i_80_++) {
						int i_81_ = Class330.anIntArrayArrayArray4128[i_78_][i_79_][i_80_];
						if ((i_81_ ^ 0xffffffff) != 0) {
							int i_82_ = 0x3ff & i_81_ >> 14;
							int i_83_ = 0x7ff & i_81_ >> 3;
							int i_84_ = i_83_ / 8 + (i_82_ / 8 << 8);
							for (int i_85_ = 0; i_85_ < i_75_; i_85_++) {
								if (Class262_Sub1.MAP_REGION_HASHES[i_85_] == i_84_) {
									i_84_ = -1;
									break;
								}
							}
							if (i_84_ != -1) {
								Class262_Sub1.MAP_REGION_HASHES[i_75_] = i_84_;
								int i_86_ = 0xff & i_84_ >> 8;
								int i_87_ = i_84_ & 0xff;
								StandardPlane.anIntArray7980[i_75_] = Animable_Sub1_Sub1.aClass302_10618.method3519("m" + i_86_ + "_" + i_87_, (byte) 102);
								Class144.anIntArray1789[i_75_] = Animable_Sub1_Sub1.aClass302_10618.method3519("l" + i_86_ + "_" + i_87_, (byte) 93);
								Class42.anIntArray645[i_75_] = Animable_Sub1_Sub1.aClass302_10618.method3519("um" + i_86_ + "_" + i_87_, (byte) 82);
								ProducingGraphicsBuffer.anIntArray9895[i_75_] = Animable_Sub1_Sub1.aClass302_10618.method3519("ul" + i_86_ + "_" + i_87_, (byte) 114);
								i_75_++;
							}
						}
					}
				}
			}
			Class364.method4057(forceRefresh, gameSceneBaseRegionX, 12, gameSceneBaseRegionY, (byte) -36);
		}
	}
	
	static final boolean method3101(int i, byte b) {
		if (b != -62) {
			return true;
		}
		anInt3187++;
        return !(i != 20 && i != 18 && (i ^ 0xffffffff) != -1003 && (i ^ 0xffffffff) != -13 && i != 10);
    }
	
	Class251(int i) {
		anInt3182 = i;
	}
}
