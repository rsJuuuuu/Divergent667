/* Class168 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class168
{
	static int anInt2041;
	static Class139 aClass139_2042 = new Class139();
	static int anInt2043;
	static int anInt2044;
	static IncommingPacket aClass192_2045 = new IncommingPacket(85, -2);
	static int anInt2046;
	
	public static void method1753(int i) {
		if (i >= -37) {
			method1754(true);
		}
		aClass139_2042 = null;
		aClass192_2045 = null;
	}
	
	static final void method1754(boolean bool) {
		anInt2041++;
		if (!Class213.aBoolean2510) {
			Class194_Sub3_Sub1.aBoolean9375 = Animable_Sub1.anInt9101 != -1 && Animable_Sub1.anInt9101 <= Class315.anInt4035 || (Class315.anInt4035 * 16 - -(!Node_Sub38_Sub5.aBoolean10130 ? 22 : 26) ^ 0xffffffff) < (Class205.screenHeight ^ 0xffffffff);
		}
		if (bool == true) {
			Node_Sub16.aClass312_7139.method3614(-601);
			Class130.aClass312_1670.method3614(-601);
			for (CacheNode_Sub13 cachenode_sub13 = (CacheNode_Sub13) Class368.aClass312_4549.method3613(65280); cachenode_sub13 != null; cachenode_sub13 = (CacheNode_Sub13) Class368.aClass312_4549.method3620(16776960)) {
				int i = cachenode_sub13.anInt9562;
				if (i < 1000) {
					cachenode_sub13.method2160((byte) 78);
					if ((i ^ 0xffffffff) == -22 || (i ^ 0xffffffff) == -61 || (i ^ 0xffffffff) == -24 || i == 17 || i == 44 || (i ^ 0xffffffff) == -5 || i == 18) {
						Class130.aClass312_1670.method3625((byte) -54, cachenode_sub13);
					} else {
						Node_Sub16.aClass312_7139.method3625((byte) -54, cachenode_sub13);
					}
				}
			}
			Node_Sub16.aClass312_7139.method3621(-2869, Class368.aClass312_4549);
			Class130.aClass312_1670.method3621(-2869, Class368.aClass312_4549);
			if (Class315.anInt4035 <= 1) {
				Node_Sub38_Sub23.aCacheNode_Sub13_10343 = null;
				Class52.aCacheNode_Sub13_788 = null;
			} else {
				if (!Class116.aBoolean5072 || !Class175.aClass291_2100.method3450(-69, 81) || (Class315.anInt4035 ^ 0xffffffff) >= -3) {
					Node_Sub38_Sub23.aCacheNode_Sub13_10343 = (CacheNode_Sub13) Class368.aClass312_4549.aNode3958.aNode2799;
				} else {
					Node_Sub38_Sub23.aCacheNode_Sub13_10343 = (CacheNode_Sub13) Class368.aClass312_4549.aNode3958.aNode2799.aNode2799;
				}
				Class52.aCacheNode_Sub13_788 = (CacheNode_Sub13) Class368.aClass312_4549.aNode3958.aNode2799;
			}
			int i = -1;
			Node_Sub5 node_sub5 = (Node_Sub5) GraphicsToolkit.aClass312_1545.method3613(65280);
			if (node_sub5 != null) {
				i = node_sub5.method2267(true);
			}
			if (!Class213.aBoolean2510) {
				if (i == 0 && (Class121.anInt1521 == 1 && (Class315.anInt4035 ^ 0xffffffff) < -3 || Node_Sub16.method2594(bool))) {
					i = 2;
				}
				if ((i ^ 0xffffffff) == -3 && (Class315.anInt4035 ^ 0xffffffff) < -1 && node_sub5 != null) {
					if (Class58.aWidget861 != null || Class290_Sub6.anInt8116 != 0) {
						Class283.anInt3591 = 2;
					} else {
						Plane.method3258(124, node_sub5.method2272(5), node_sub5.method2270(2));
					}
				}
				if ((i ^ 0xffffffff) == -1) {
					if (Node_Sub38_Sub23.aCacheNode_Sub13_10343 == null) {
						if (Class87.removeWalkHere) {
							Node_Sub38_Sub23.method2863(-19316);
						}
					} else {
						Class219.method2095((byte) -93);
					}
				}
				if (Class58.aWidget861 == null && Class290_Sub6.anInt8116 == 0) {
					Class194_Sub1.aCacheNode_Sub13_6893 = null;
					Class283.anInt3591 = 0;
				}
			} else {
				if (i == -1) {
					int i_0_ = Class106.aClass93_1356.method1050((byte) -62);
					int i_1_ = Class106.aClass93_1356.method1051(bool);
					boolean bool_2_ = false;
					if (Class73.aCacheNode_Sub4_988 != null) {
						if ((i_0_ ^ 0xffffffff) > (Class367.anInt4539 - 10 ^ 0xffffffff) || (i_0_ ^ 0xffffffff) < (Class367.anInt4539 - -CacheNode.anInt7033 - -10 ^ 0xffffffff) || -10 + ReferenceTable.anInt286 > i_1_ || (i_1_ ^ 0xffffffff) < (10 + ReferenceTable.anInt286 + Class18.anInt309 ^ 0xffffffff)) {
							GameStub.method88((byte) -114);
						} else {
							bool_2_ = true;
						}
					}
					if (!bool_2_) {
						if ((-10 + Node_Sub6.anInt7043 ^ 0xffffffff) >= (i_0_ ^ 0xffffffff) && (10 + Node_Sub6.anInt7043 + Class362.anInt4492 ^ 0xffffffff) <= (i_0_ ^ 0xffffffff) && -10 + Client.anInt5481 <= i_1_ && i_1_ <= 10 + Class219.anInt2627 + Client.anInt5481) {
							if (Class194_Sub3_Sub1.aBoolean9375) {
								int i_3_ = -1;
								int i_4_ = -1;
								for (int i_5_ = 0; Class21.anInt355 > i_5_; i_5_++) {
									if (!Node_Sub38_Sub5.aBoolean10130) {
										int i_6_ = 16 * i_5_ + Client.anInt5481 + 31;
										if (-13 + i_6_ < i_1_ && (i_1_ ^ 0xffffffff) > (3 + i_6_ ^ 0xffffffff)) {
											i_4_ = i_6_ - 13;
											i_3_ = i_5_;
											break;
										}
									} else {
										int i_7_ = 16 * i_5_ + 33 + Client.anInt5481;
										if ((i_1_ ^ 0xffffffff) < (i_7_ - 13 ^ 0xffffffff) && (4 + i_7_ ^ 0xffffffff) < (i_1_ ^ 0xffffffff)) {
											i_3_ = i_5_;
											i_4_ = -13 + i_7_;
											break;
										}
									}
								}
								if ((i_3_ ^ 0xffffffff) != 0) {
									int i_8_ = 0;
									Class269 class269 = new Class269(Class184.aClass158_2189);
									for (CacheNode_Sub4 cachenode_sub4 = (CacheNode_Sub4) class269.method3295(16); cachenode_sub4 != null; cachenode_sub4 = (CacheNode_Sub4) class269.method3294(16)) {
										if (i_8_ == i_3_) {
											if ((cachenode_sub4.anInt9462 ^ 0xffffffff) < -2) {
												PlayerUpdateReference.method3809(i_4_, -126, i_1_, cachenode_sub4);
											}
											break;
										}
										i_8_++;
									}
								}
							}
						} else {
							Class260.method3137(0);
						}
					}
				}
				if ((i ^ 0xffffffff) == -1) {
					int i_9_ = node_sub5.method2270(2);
					int i_10_ = node_sub5.method2272(5);
					if (Class73.aCacheNode_Sub4_988 == null || (Class367.anInt4539 ^ 0xffffffff) < (i_9_ ^ 0xffffffff) || (CacheNode.anInt7033 + Class367.anInt4539 ^ 0xffffffff) > (i_9_ ^ 0xffffffff) || i_10_ < ReferenceTable.anInt286 || ReferenceTable.anInt286 - -Class18.anInt309 < i_10_) {
						if ((Node_Sub6.anInt7043 ^ 0xffffffff) >= (i_9_ ^ 0xffffffff) && Node_Sub6.anInt7043 - -Class362.anInt4492 >= i_9_ && (Client.anInt5481 ^ 0xffffffff) >= (i_10_ ^ 0xffffffff) && i_10_ <= Class219.anInt2627 + Client.anInt5481) {
							if (!Class194_Sub3_Sub1.aBoolean9375) {
								int i_11_ = -1;
								for (int i_12_ = 0; Class315.anInt4035 > i_12_; i_12_++) {
									if (Node_Sub38_Sub5.aBoolean10130) {
										int i_13_ = (-i_12_ + Class315.anInt4035 - 1) * 16 + Client.anInt5481 - -33;
										if ((i_10_ ^ 0xffffffff) < (-13 + i_13_ ^ 0xffffffff) && i_10_ < i_13_ - -4) {
											i_11_ = i_12_;
										}
									} else {
										int i_14_ = 31 + Client.anInt5481 + 16 * (-i_12_ + (Class315.anInt4035 + -1));
										if ((i_10_ ^ 0xffffffff) < (-13 + i_14_ ^ 0xffffffff) && (i_14_ - -3 ^ 0xffffffff) < (i_10_ ^ 0xffffffff)) {
											i_11_ = i_12_;
										}
									}
								}
								if (i_11_ != -1) {
									int i_15_ = 0;
									Class157 class157 = new Class157(Class368.aClass312_4549);
									for (CacheNode_Sub13 cachenode_sub13 = (CacheNode_Sub13) class157.method1714(2); cachenode_sub13 != null; cachenode_sub13 = (CacheNode_Sub13) class157.method1713((byte) -34)) {
										if ((i_11_ ^ 0xffffffff) == (i_15_ ^ 0xffffffff)) {
											Class134_Sub1.method1580(i_10_, 1, cachenode_sub13, i_9_);
											break;
										}
										i_15_++;
									}
								}
								Class260.method3137(0);
							} else {
								int i_16_ = -1;
								for (int i_17_ = 0; (Class21.anInt355 ^ 0xffffffff) < (i_17_ ^ 0xffffffff); i_17_++) {
									if (!Node_Sub38_Sub5.aBoolean10130) {
										int i_18_ = Client.anInt5481 + 31 - -(i_17_ * 16);
										if (i_10_ > -13 + i_18_ && i_10_ < 3 + i_18_) {
											i_16_ = i_17_;
											break;
										}
									} else {
										int i_19_ = i_17_ * 16 + 33 + Client.anInt5481;
										if ((i_19_ + -13 ^ 0xffffffff) > (i_10_ ^ 0xffffffff) && (i_10_ ^ 0xffffffff) > (i_19_ + 4 ^ 0xffffffff)) {
											i_16_ = i_17_;
											break;
										}
									}
								}
								if ((i_16_ ^ 0xffffffff) != 0) {
									int i_20_ = 0;
									Class269 class269 = new Class269(Class184.aClass158_2189);
									for (CacheNode_Sub4 cachenode_sub4 = (CacheNode_Sub4) class269.method3295(16); cachenode_sub4 != null; cachenode_sub4 = (CacheNode_Sub4) class269.method3294(16)) {
										if (i_20_ == i_16_) {
											Class134_Sub1.method1580(i_10_, 1, (CacheNode_Sub13) cachenode_sub4.aClass158_9457.aCacheNode1984.aCacheNode7035, i_9_);
											Class260.method3137(0);
											break;
										}
										i_20_++;
									}
								}
							}
						}
					} else {
						int i_21_ = -1;
						for (int i_22_ = 0; Class73.aCacheNode_Sub4_988.anInt9462 > i_22_; i_22_++) {
							if (!Node_Sub38_Sub5.aBoolean10130) {
								int i_23_ = 16 * i_22_ + (31 + ReferenceTable.anInt286);
								if ((i_10_ ^ 0xffffffff) < (i_23_ + -13 ^ 0xffffffff) && i_10_ < 3 + i_23_) {
									i_21_ = i_22_;
								}
							} else {
								int i_24_ = 16 * i_22_ + ReferenceTable.anInt286 + 33;
								if (i_10_ > -13 + i_24_ && i_24_ + 4 > i_10_) {
									i_21_ = i_22_;
								}
							}
						}
						if ((i_21_ ^ 0xffffffff) != 0) {
							int i_25_ = 0;
							Class269 class269 = new Class269(Class73.aCacheNode_Sub4_988.aClass158_9457);
							for (CacheNode_Sub13 cachenode_sub13 = (CacheNode_Sub13) class269.method3295(16); cachenode_sub13 != null; cachenode_sub13 = (CacheNode_Sub13) class269.method3294(16)) {
								if ((i_21_ ^ 0xffffffff) == (i_25_ ^ 0xffffffff)) {
									Class134_Sub1.method1580(i_10_, 1, cachenode_sub13, i_9_);
									break;
								}
								i_25_++;
							}
						}
						Class260.method3137(0);
					}
				}
			}
		}
	}
}
