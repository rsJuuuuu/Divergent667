/* CacheNode_Sub14_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CacheNode_Sub14_Sub2 extends CacheNode_Sub14
{
	static int anInt11030;
	static int anInt11031;
	static int anInt11032;
	static int anInt11033;
	private Object anObject11034;
	static int anInt11035;
	static int anInt11036;
	static IncommingPacket aClass192_11037 = new IncommingPacket(141, 2);
	static int anInt11038;
	static Class312 aClass312_11039 = new Class312();
	static IncommingPacket aClass192_11040 = new IncommingPacket(81, 12);
	
	final boolean method2350(byte b) {
		if (b != -38) {
			method2356(91, null, -4, -4, 103, 0, true, null, 12, null, -56, -61, 29);
		}
		anInt11030++;
		return false;
	}
	
	final Object method2347(int i) {
		anInt11035++;
		if (i != 27670) {
			return null;
		}
		return anObject11034;
	}
	
	public static void method2351(int i) {
		if (i != -513) {
			aClass192_11040 = null;
		}
		aClass312_11039 = null;
		aClass192_11040 = null;
		aClass192_11037 = null;
	}
	
	static final boolean method2352(int i, int i_0_, int i_1_) {
		anInt11033++;
		if (i != 0) {
			method2352(-85, -123, -8);
		}
        return !(!(Class144_Sub2.method1634(i_1_, i_0_, false) | (0x60000 & i_0_) != 0) && !GraphicsBuffer.method2596(-1, i_0_, i_1_));
    }
	
	static final void method2353(byte b, BufferedStream buffer) {
		anInt11031++;
		if ((buffer.buffer.length - buffer.offset ^ 0xffffffff) <= -2) {
			int i = buffer.readUnsignedByte();
			if (i >= 0 && (i ^ 0xffffffff) >= -2) {
				if (b > -21) {
					method2354(null, -121, true, -60, -117, 43, false);
				}
				if ((buffer.buffer.length + -buffer.offset ^ 0xffffffff) <= -3) {
					int i_2_ = buffer.readUnsignedShort();
					if ((6 * i_2_ ^ 0xffffffff) >= (buffer.buffer.length - buffer.offset ^ 0xffffffff)) {
						for (int i_3_ = 0; (i_2_ ^ 0xffffffff) < (i_3_ ^ 0xffffffff); i_3_++) {
							int i_4_ = buffer.readUnsignedShort();
							int i_5_ = buffer.readInt();
							if ((i_4_ ^ 0xffffffff) > (Class320_Sub22.anIntArray8417.length ^ 0xffffffff) && FileOnDisk.aBooleanArray1332[i_4_] && ((Node_Sub53.aClass176_7667.method1805(i_4_, -4409).aChar3210 ^ 0xffffffff) != -50 || i_5_ >= -1 && (i_5_ ^ 0xffffffff) >= -2)) {
								Class320_Sub22.anIntArray8417[i_4_] = i_5_;
							}
						}
					}
				}
			}
		}
	}
	
	static final void method2354(Index class302, int i, boolean bool, int i_6_, int i_7_, int i_8_, boolean bool_9_) {
		anInt11036++;
		if ((i_8_ ^ 0xffffffff) >= -1) {
			Class339_Sub8.method3946(i_7_, i_6_, i, class302, bool, 23732);
		} else {
			Class17.anInt282 = i;
			Class52.anInt800 = 1;
			Class93_Sub2.aClass302_6049 = class302;
			Class266.aBoolean3385 = bool;
			Class61.aNode_Sub9_Sub1_885 = null;
			CacheNode_Sub6.anInt9485 = i_7_;
			Class101.anInt1306 = i_6_;
			Class107.anInt1362 = Class307.aNode_Sub9_Sub1_3902.method2471(15) / i_8_;
			if ((Class107.anInt1362 ^ 0xffffffff) > -2) {
				Class107.anInt1362 = 1;
			}
		}
		if (bool_9_ != false) {
			aClass312_11039 = null;
		}
	}
	
	static final void decodePlayerMasks(Packet packet) {
		for (int i = 0; i < Node_Sub9_Sub4.DECODE_MASKS_PLAYERS_COUNT; i++) {
			int playerIndex = Node_Sub23_Sub1.DECODE_MASKS_PLAYERS_INDEXES_LIST[i];
			Player player = Class270_Sub2.LOCAL_PLAYERS[playerIndex];
			int mask = packet.readUnsignedByte();
			if ((mask & 0x80) != 0)
				mask += packet.readUnsignedByte() << 8;
			if ((mask & 0x800) != 0)
				mask += packet.readUnsignedByte() << 16;
			Class91.decodePlayerMasks(-1, player, playerIndex, packet, mask);
		}
	}
	
	static final DrawableModel method2356(int i, DrawableModel drawablemodel, int i_12_, int i_13_, int i_14_, int i_15_, boolean bool, GraphicsToolkit graphicstoolkit, int i_16_, Animator animator, int i_17_, int i_18_, int i_19_) {
		anInt11038++;
		if (drawablemodel == null) {
			return null;
		}
		int i_20_ = 2055;
		if (bool != true) {
			method2354(null, 45, false, 32, 86, -90, false);
		}
		if (animator != null) {
			i_20_ |= animator.method237((byte) -126);
			i_20_ &= ~0x200;
		}
		long l = ((long) i_13_ << 48) + ((long) i_19_ << 32) + (long) (i_15_ + ((i_16_ << 16) + (i << 24)));
		DrawableModel drawablemodel_21_;
		synchronized (Class186.aClass61_2247) {
			drawablemodel_21_ = (DrawableModel) Class186.aClass61_2247.method607(l, 0);
		}
		if (drawablemodel_21_ == null || graphicstoolkit.b(drawablemodel_21_.ua(), i_20_) != 0) {
			if (drawablemodel_21_ != null) {
				i_20_ = graphicstoolkit.c(i_20_, drawablemodel_21_.ua());
			}
			int i_22_;
			if (i_15_ != 1) {
				if ((i_15_ ^ 0xffffffff) == -3) {
					i_22_ = 12;
				} else if ((i_15_ ^ 0xffffffff) == -4) {
					i_22_ = 15;
				} else if (i_15_ != 4) {
					i_22_ = 21;
				} else {
					i_22_ = 18;
				}
			} else {
				i_22_ = 9;
			}
			int i_23_ = 3;
			int[] is = { 64, 96, 128 };
			Model model = new Model(1 - -(i_23_ * i_22_), -i_22_ + i_22_ * (i_23_ * 2), 0);
			int i_24_ = model.method2079(-112, 0, 0, 0);
			int[][] is_25_ = new int[i_23_][i_22_];
			for (int i_26_ = 0; (i_26_ ^ 0xffffffff) > (i_23_ ^ 0xffffffff); i_26_++) {
				int i_27_ = is[i_26_];
				int i_28_ = is[i_26_];
				for (int i_29_ = 0; i_29_ < i_22_; i_29_++) {
					int i_30_ = (i_29_ << 14) / i_22_;
					int i_31_ = Class335.anIntArray4167[i_30_] * i_27_ >> 14;
					int i_32_ = i_28_ * Class335.anIntArray4165[i_30_] >> 14;
					is_25_[i_26_][i_29_] = model.method2079(-118, i_32_, 0, i_31_);
				}
			}
			for (int i_33_ = 0; (i_23_ ^ 0xffffffff) < (i_33_ ^ 0xffffffff); i_33_++) {
				int i_34_ = (i_33_ * 256 - -128) / i_23_;
				int i_35_ = 256 - i_34_;
				byte b = (byte) (i * i_34_ + i_16_ * i_35_ >> 8);
				short s = (short) ((i_34_ * (i_13_ & 0x7f) + i_35_ * (0x7f & i_19_) & 0x7f00) + ((0x380 & i_19_) * i_35_ + (0x380 & i_13_) * i_34_ & 0x38000) + ((0xfc00 & i_19_) * i_35_ + (0xfc00 & i_13_) * i_34_ & 0xfc0000) >> 8);
				for (int i_36_ = 0; i_22_ > i_36_; i_36_++) {
					if (i_33_ == 0) {
						model.method2080(true, i_24_, is_25_[0][i_36_], is_25_[0][(i_36_ + 1) % i_22_], s, (short) -1, b, (byte) 1, (byte) -1);
					} else {
						model.method2080(bool, is_25_[i_33_ + -1][i_36_], is_25_[i_33_][(i_36_ + 1) % i_22_], is_25_[-1 + i_33_][(1 + i_36_) % i_22_], s, (short) -1, b, (byte) 1, (byte) -1);
						model.method2080(true, is_25_[i_33_ - 1][i_36_], is_25_[i_33_][i_36_], is_25_[i_33_][(1 + i_36_) % i_22_], s, (short) -1, b, (byte) 1, (byte) -1);
					}
				}
			}
			drawablemodel_21_ = graphicstoolkit.a(model, i_20_, Class339_Sub9.anInt8754, 64, 768);
			synchronized (Class186.aClass61_2247) {
				Class186.aClass61_2247.method601(drawablemodel_21_, 25566, l);
			}
		}
		int i_37_ = drawablemodel.V();
		int i_38_ = drawablemodel.RA();
		int i_39_ = drawablemodel.HA();
		int i_40_ = drawablemodel.G();
		if (animator != null) {
			drawablemodel_21_ = drawablemodel_21_.method633((byte) 3, i_20_, true);
			drawablemodel_21_.O(i_38_ + -i_37_ >> 1, 128, -i_39_ + i_40_ >> 1);
			drawablemodel_21_.H(i_38_ + i_37_ >> 1, 0, i_39_ + i_40_ >> 1);
			animator.method241(drawablemodel_21_, 0);
		} else {
			drawablemodel_21_ = drawablemodel_21_.method633((byte) 3, i_20_, true);
			drawablemodel_21_.O(-i_37_ + i_38_ >> 1, 128, i_40_ + -i_39_ >> 1);
			drawablemodel_21_.H(i_38_ + i_37_ >> 1, 0, i_40_ + i_39_ >> 1);
		}
		if ((i_17_ ^ 0xffffffff) != -1) {
			drawablemodel_21_.FA(i_17_);
		}
		if (i_12_ != 0) {
			drawablemodel_21_.VA(i_12_);
		}
		if (i_14_ != 0) {
			drawablemodel_21_.H(0, i_14_, 0);
		}
		return drawablemodel_21_;
	}
	
	CacheNode_Sub14_Sub2(Interface18 interface18, Object object, int i) {
		super(interface18, i);
		anObject11034 = object;
	}
}
