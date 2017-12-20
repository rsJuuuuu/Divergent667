/* Class338 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class338
{
	static OutcommingPacket aClass318_4184 = new OutcommingPacket(78, -1);
	static int anInt4185;
	static int anInt4186;
	static int anInt4187;
	static int anInt4188;
	private Class61 aClass61_4189 = new Class61(64);
	static int anInt4190;
	static int anInt4191;
	private Index aClass302_4192;
	protected Index aClass302_4193;
	static int anInt4194;
	static int anInt4195;
	static int anInt4196;
	static String[] aStringArray4197 = new String[100];
	static OutcommingPacket aClass318_4198 = new OutcommingPacket(83, -1);
	static float[] aFloatArray4199 = new float[4];
	protected Class61 aClass61_4200 = new Class61(64);
	static IncommingPacket aClass192_4201 = new IncommingPacket(89, -1);
	
	static final Class150 method3906(BufferedStream buffer, int i) {
		anInt4191++;
		Class379 class379 = Class23.method302(1476280292)[buffer.readUnsignedByte()];
		Class77 class77 = PlayerDefinition.method3277(12247)[buffer.readUnsignedByte()];
		int i_0_ = buffer.readShort();
		int i_1_ = buffer.readShort();
		int i_2_ = buffer.readUnsignedShort();
		int i_3_ = buffer.readUnsignedShort();
		int i_4_ = buffer.readShort();
		if (i > -27) {
			return null;
		}
		int i_5_ = buffer.readInt();
		int i_6_ = buffer.readInt();
		return new Class150(class379, class77, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_);
	}
	
	final void method3907(byte b) {
		synchronized (aClass61_4189) {
			aClass61_4189.method602((byte) -126);
		}
		anInt4194++;
		synchronized (aClass61_4200) {
			if (b != -101) {
				/* empty */
			} else {
				aClass61_4200.method602((byte) -124);
			}
		}
	}
	
	final void method3908(int i) {
		if (i != -32478) {
			aClass61_4200 = null;
		}
		synchronized (aClass61_4189) {
			aClass61_4189.method608(false);
		}
		anInt4196++;
		synchronized (aClass61_4200) {
			aClass61_4200.method608(false);
		}
	}
	
	final Class140 method3909(int i, int i_7_) {
		anInt4186++;
		Class140 class140;
		synchronized (aClass61_4189) {
			class140 = (Class140) aClass61_4189.method607((long) i, 0);
		}
		if (class140 != null) {
			return class140;
		}
		byte[] bs;
		synchronized (aClass302_4192) {
			bs = aClass302_4192.method3524(false, i, i_7_);
		}
		class140 = new Class140();
		class140.aClass338_1733 = this;
		if (bs != null) {
			class140.method1611(new BufferedStream(bs), i_7_ ^ ~0x7f8c);
		}
		synchronized (aClass61_4189) {
			aClass61_4189.method601(class140, 25566, (long) i);
		}
		return class140;
	}
	
	public static void method3910(int i) {
		if (i < 96) {
			aClass318_4198 = null;
		}
		aClass192_4201 = null;
		aStringArray4197 = null;
		aClass318_4184 = null;
		aClass318_4198 = null;
		aFloatArray4199 = null;
	}
	
	static final boolean method3911(int i, int i_8_, int i_9_) {
		anInt4195++;
		if (i_9_ != 24987) {
			method3906(null, 46);
		}
        return !(!((i & 0x800 ^ 0xffffffff) != -1 | Class150_Sub3.method1663((byte) -21, i, i_8_)) && !Class110.method1135(i, i_8_, false));
    }
	
	final void method3912(int i, int i_10_, int i_11_) {
		anInt4188++;
		aClass61_4189 = new Class61(i_11_);
		aClass61_4200 = new Class61(i);
		if (i_10_ <= 114) {
			method3915(null, false, false);
		}
	}
	
	static final void method3913(int i, Node_Sub47 node_sub47, int i_12_, int i_13_, byte b, int i_14_) {
		anInt4185++;
		if ((node_sub47.anInt7564 != -1 || node_sub47.anIntArray7579 != null) && b == 54) {
			int i_15_ = 0;
			int i_16_ = node_sub47.anInt7570 * Class213.aNode_Sub27_2512.aClass320_Sub25_7265.method3776(false) >> 8;
			if (node_sub47.anInt7582 < i_13_) {
				i_15_ += -node_sub47.anInt7582 + i_13_;
			} else if (node_sub47.anInt7569 > i_13_) {
				i_15_ += -i_13_ + node_sub47.anInt7569;
			}
			if (node_sub47.anInt7559 < i_14_) {
				i_15_ += i_14_ - node_sub47.anInt7559;
			} else if ((node_sub47.anInt7563 ^ 0xffffffff) < (i_14_ ^ 0xffffffff)) {
				i_15_ += node_sub47.anInt7563 - i_14_;
			}
			if ((node_sub47.anInt7567 ^ 0xffffffff) == -1 || node_sub47.anInt7567 < i_15_ + -256 || (Class213.aNode_Sub27_2512.aClass320_Sub25_7265.method3776(false) ^ 0xffffffff) == -1 || i_12_ != node_sub47.anInt7560) {
				if (node_sub47.aNode_Sub9_Sub2_7568 != null) {
					Class176.aNode_Sub9_Sub3_2106.method2514(node_sub47.aNode_Sub9_Sub2_7568);
					node_sub47.aNode_Sub9_Sub2_7568 = null;
					node_sub47.aNode_Sub49_7581 = null;
					node_sub47.aNode_Sub45_Sub1_7576 = null;
				}
				if (node_sub47.aNode_Sub9_Sub2_7556 != null) {
					Class176.aNode_Sub9_Sub3_2106.method2514(node_sub47.aNode_Sub9_Sub2_7556);
					node_sub47.aNode_Sub49_7578 = null;
					node_sub47.aNode_Sub9_Sub2_7556 = null;
					node_sub47.aNode_Sub45_Sub1_7575 = null;
				}
			} else {
				i_15_ -= 256;
				if (i_15_ < 0) {
					i_15_ = 0;
				}
				int i_17_ = -node_sub47.anInt7566 + node_sub47.anInt7567;
				if ((i_17_ ^ 0xffffffff) > -1) {
					i_17_ = node_sub47.anInt7567;
				}
				int i_18_ = i_16_;
				int i_19_ = i_15_ - node_sub47.anInt7566;
				if ((i_19_ ^ 0xffffffff) < -1 && (i_17_ ^ 0xffffffff) < -1) {
					i_18_ = (i_17_ + -i_19_) * i_16_ / i_17_;
				}
				Class295.myPlayer.getSize((byte) 71);
				int i_20_ = 8192;
				int i_21_ = (node_sub47.anInt7582 + node_sub47.anInt7569) / 2 + -i_13_;
				int i_22_ = -i_14_ + (node_sub47.anInt7559 + node_sub47.anInt7563) / 2;
				if ((i_21_ ^ 0xffffffff) != -1 || (i_22_ ^ 0xffffffff) != -1) {
					int i_23_ = -Class170.anInt2053 - (int) (Math.atan2((double) i_21_, (double) i_22_) * 2607.5945876176133) + -4096 & 0x3fff;
					if (i_23_ > 8192) {
						i_23_ = 16384 - i_23_;
					}
					int i_24_;
					if (i_15_ <= 0) {
						i_24_ = 8192;
					} else if ((i_15_ ^ 0xffffffff) <= -4097) {
						i_24_ = 16384;
					} else {
						i_24_ = 8192 + 8192 * i_15_ / 4096;
					}
					i_20_ = (-i_24_ + 16384 >> 1) + i_23_ * i_24_ / 8192;
				}
				if (node_sub47.aNode_Sub9_Sub2_7568 == null) {
					if ((node_sub47.anInt7564 ^ 0xffffffff) <= -1) {
						int i_25_ = node_sub47.anInt7572 == 256 && node_sub47.anInt7571 == 256 ? 256 : Class89.method1019(node_sub47.anInt7571, 26817, node_sub47.anInt7572);
						if (node_sub47.aBoolean7580) {
							if (node_sub47.aNode_Sub49_7581 == null) {
								node_sub47.aNode_Sub49_7581 = Node_Sub49.method2954(Class78.aClass302_1033, node_sub47.anInt7564);
							}
							if (node_sub47.aNode_Sub49_7581 != null) {
								if (node_sub47.aNode_Sub45_Sub1_7576 == null) {
									node_sub47.aNode_Sub45_Sub1_7576 = node_sub47.aNode_Sub49_7581.method2958(new int[] { 22050 });
								}
								if (node_sub47.aNode_Sub45_Sub1_7576 != null) {
									Node_Sub9_Sub2 node_sub9_sub2 = Node_Sub9_Sub2.method2509(node_sub47.aNode_Sub45_Sub1_7576, i_25_, i_18_ << 6, i_20_);
									node_sub9_sub2.method2481(-1);
									Class176.aNode_Sub9_Sub3_2106.method2513(node_sub9_sub2);
									node_sub47.aNode_Sub9_Sub2_7568 = node_sub9_sub2;
								}
							}
						} else {
							Class65 class65 = Class65.method714(Class148.aClass302_1827, node_sub47.anInt7564, 0);
							if (class65 != null) {
								Node_Sub45_Sub1 node_sub45_sub1 = class65.method716().method2947(Class361.aClass191_4486);
								Node_Sub9_Sub2 node_sub9_sub2 = Node_Sub9_Sub2.method2509(node_sub45_sub1, i_25_, i_18_ << 6, i_20_);
								node_sub9_sub2.method2481(-1);
								Class176.aNode_Sub9_Sub3_2106.method2513(node_sub9_sub2);
								node_sub47.aNode_Sub9_Sub2_7568 = node_sub9_sub2;
							}
						}
					}
				} else {
					node_sub47.aNode_Sub9_Sub2_7568.method2490(i_18_);
					node_sub47.aNode_Sub9_Sub2_7568.method2496(i_20_);
				}
				if (node_sub47.aNode_Sub9_Sub2_7556 != null) {
					node_sub47.aNode_Sub9_Sub2_7556.method2490(i_18_);
					node_sub47.aNode_Sub9_Sub2_7556.method2496(i_20_);
					if (!node_sub47.aNode_Sub9_Sub2_7556.method2161(-122)) {
						node_sub47.aNode_Sub9_Sub2_7556 = null;
						node_sub47.aNode_Sub49_7578 = null;
						node_sub47.aNode_Sub45_Sub1_7575 = null;
					}
				} else if (node_sub47.anIntArray7579 != null && ((node_sub47.anInt7561 -= i) ^ 0xffffffff) >= -1) {
					int i_26_ = node_sub47.anInt7572 != 256 || node_sub47.anInt7571 != 256 ? node_sub47.anInt7571 + (int) ((double) (node_sub47.anInt7572 - node_sub47.anInt7571) * Math.random()) : 256;
					if (!node_sub47.aBoolean7584) {
						int i_27_ = (int) ((double) node_sub47.anIntArray7579.length * Math.random());
						Class65 class65 = Class65.method714(Class148.aClass302_1827, node_sub47.anIntArray7579[i_27_], 0);
						if (class65 != null) {
							Node_Sub45_Sub1 node_sub45_sub1 = class65.method716().method2947(Class361.aClass191_4486);
							Node_Sub9_Sub2 node_sub9_sub2 = Node_Sub9_Sub2.method2509(node_sub45_sub1, i_26_, i_18_ << 6, i_20_);
							node_sub9_sub2.method2481(0);
							Class176.aNode_Sub9_Sub3_2106.method2513(node_sub9_sub2);
							node_sub47.anInt7561 = (int) (Math.random() * (double) (-node_sub47.anInt7587 + node_sub47.anInt7565)) + node_sub47.anInt7587;
							node_sub47.aNode_Sub9_Sub2_7556 = node_sub9_sub2;
						}
					} else {
						if (node_sub47.aNode_Sub49_7578 == null) {
							int i_28_ = (int) (Math.random() * (double) node_sub47.anIntArray7579.length);
							node_sub47.aNode_Sub49_7578 = Node_Sub49.method2954(Class78.aClass302_1033, node_sub47.anIntArray7579[i_28_]);
						}
						if (node_sub47.aNode_Sub49_7578 != null) {
							if (node_sub47.aNode_Sub45_Sub1_7575 == null) {
								node_sub47.aNode_Sub45_Sub1_7575 = node_sub47.aNode_Sub49_7578.method2958(new int[] { 22050 });
							}
							if (node_sub47.aNode_Sub45_Sub1_7575 != null) {
								Node_Sub9_Sub2 node_sub9_sub2 = Node_Sub9_Sub2.method2509(node_sub47.aNode_Sub45_Sub1_7575, i_26_, i_18_ << 6, i_20_);
								node_sub9_sub2.method2481(0);
								Class176.aNode_Sub9_Sub3_2106.method2513(node_sub9_sub2);
								node_sub47.anInt7561 = (int) ((double) (node_sub47.anInt7565 - node_sub47.anInt7587) * Math.random()) + node_sub47.anInt7587;
								node_sub47.aNode_Sub9_Sub2_7556 = node_sub9_sub2;
							}
						}
					}
				}
			}
		}
	}
	
	final void method3914(int i, int i_29_) {
		anInt4187++;
		synchronized (aClass61_4189) {
			if (i_29_ != 34) {
				aClass302_4192 = null;
			}
			aClass61_4189.method598(i, i_29_ + -11853);
		}
		synchronized (aClass61_4200) {
			aClass61_4200.method598(i, -11819);
		}
	}
	
	static final void method3915(Animable animable, boolean bool, boolean bool_30_) {
		animable.aBoolean5945 = bool_30_;
		if (Class188_Sub2.aBoolean6868) {
			if (bool) {
				Class364.aClass273Array4513[Class364.aClass273Array4513.length - 1].method3321(animable, 41);
			} else {
				int i = Class187.method1879(animable.anInt5938);
				int i_31_ = Class20_Sub1.anIntArray5510[2] * animable.method823((byte) -21) / animable.anInt5944;
				int i_32_ = Class187.method1879(animable.anInt5938 - i_31_);
				int i_33_ = Class187.method1879(animable.anInt5938 + i_31_);
				if (i_32_ == i_33_) {
					Class364.aClass273Array4513[i].method3321(animable, 85);
				} else if (i_33_ - i_32_ == 1) {
					Class364.aClass273Array4513[Class290.anInt3655 + i_32_].method3321(animable, 85);
				} else {
					Class364.aClass273Array4513[Class364.aClass273Array4513.length - 1].method3321(animable, 63);
				}
			}
		} else {
			Class270_Sub2_Sub2.method3309(animable, Class377_Sub1.aNode_Sub29Array8782);
		}
	}
	
	Class338(Class353 class353, int i, Index class302, Index class302_34_) {
		aClass302_4193 = class302_34_;
		aClass302_4192 = class302;
		aClass302_4192.method3537(-2, 34);
	}
}
