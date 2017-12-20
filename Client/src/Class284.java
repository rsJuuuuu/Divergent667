/* Class284 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class284 {
	protected short[] aShortArray3592;
	protected short[] aShortArray3593;
	static int anInt3594;
	protected short[] aShortArray3595;
	static EntityNode_Sub3_Sub2_Sub1[] anEntityNode_Sub3_Sub2_Sub1Array3596;
	static float aFloat3597;
	protected byte[] aByteArray3598;
	static int anInt3599;

	public static void method3390(byte b) {
		@SuppressWarnings("unused")
		int i = -22 / ((b - -19) / 38);
		anEntityNode_Sub3_Sub2_Sub1Array3596 = null;
	}

	static final GraphicsBuffer method3391(int i, java.awt.Canvas canvas,
			int i_0_, int i_1_) {
		anInt3599++;
		try {
			if (i_0_ < 32) {
				anEntityNode_Sub3_Sub2_Sub1Array3596 = null;
			}
			Class<?> var_class = Class.forName("GraphicsBuffer_Sub1");
			GraphicsBuffer graphicsbuffer = (GraphicsBuffer) var_class
					.newInstance();
			graphicsbuffer.method2595(true, i_1_, i, canvas);
			return graphicsbuffer;
		} catch (Throwable throwable) {
			ProducingGraphicsBuffer producinggraphicsbuffer = new ProducingGraphicsBuffer();
			producinggraphicsbuffer.method2595(true, i_1_, i, canvas);
			return producinggraphicsbuffer;
		}
	}

	Class284() {
		/* empty */
	}

	static final void decodeNPCMasks() {
		Packet packet = Class218.aClass123_2566.aPacket1570;
		for (int i = 0; i < Node_Sub38_Sub6.anInt10132; i++) {
			int i_2_ = Class194_Sub1_Sub1.anIntArray9370[i];
			Npc npc = ((Node_Sub41) Class12.aHashTable187.method1518(3512,
					(long) i_2_)).aNpc7518;
			npc.toString();
			int mask = packet.readUnsignedByte();
			if ((0x80 & mask ^ 0xffffffff) != -1) {
				mask += packet.readUnsignedByte() << 8;
			}
			if ((0x8000 & mask) != 0) {
				mask += packet.readUnsignedByte() << 16;
			}
			if ((mask & 0x100000 ^ 0xffffffff) != -1) {// graphics 3
				int i_4_ = packet.readUnsignedShort();
				int i_5_ = packet.readInt();
				if (i_4_ == 65535) {
					i_4_ = -1;
				}
				int i_6_ = packet.readUnsignedByte128();
				int i_7_ = i_6_ & 0x7;
				int i_8_ = i_6_ >> 3 & 0xf;
				if ((i_8_ ^ 0xffffffff) == -16) {
					i_8_ = -1;
				}
				boolean bool_9_ = (0x1 & i_6_ >> 7 ^ 0xffffffff) == -2;
				npc.sendGraphics(2, i_7_, bool_9_, i_5_, i_8_, i_4_);
			}
			if ((0x1 & mask) != 0) { //face entity
				npc.faceEntity = packet.readUnsignedShortLE();
				if ((npc.faceEntity ^ 0xffffffff) == -65536) {
					npc.faceEntity = -1;
				}
			}
			if ((mask & 0x20000 ^ 0xffffffff) != -1) {// graphics 4
				int i_10_ = packet.readUnsignedShort();
				int i_11_ = packet.readInt();
				if (i_10_ == 65535) {
					i_10_ = -1;
				}
				int i_12_ = packet.readUnsignedByte();
				int i_13_ = 0x7 & i_12_;
				int i_14_ = i_12_ >> 3 & 0xf;
				if (i_14_ == 15) {
					i_14_ = -1;
				}
				boolean bool_15_ = (i_12_ >> 7 & 0x1 ^ 0xffffffff) == -2;
				npc.sendGraphics(3, i_13_, bool_15_, i_11_, i_14_, i_10_);
			}
			if ((mask & 0x40 ^ 0xffffffff) != -1) {// hit
				int amount = packet.readUnsignedByteC();
				if ((amount ^ 0xffffffff) < -1) {
					for (int i_17_ = 0; i_17_ < amount; i_17_++) {
						int i_18_ = -1;
						int icon = -1;
						int type = packet.readSmart();
						int i_21_ = -1;
						if ((type ^ 0xffffffff) != -32768) {
							if (type != 32766) {
								icon = packet.readSmart();
							} else {
								type = -1;
							}
						} else {
							type = packet.readSmart();
							icon = packet.readSmart();
							i_18_ = packet.readSmart();
							i_21_ = packet.readSmart();
						}
						int delay = packet.readSmart();
						int i_23_ = packet.readUnsignedByte();
						npc.method852(i_21_, delay, i_23_, (byte) -121, icon,
								Class174.clientCycle, i_18_, type);
					}
				}
			}
			if ((mask & 0x100) != 0) {
				int i_24_ = packet.readUnsignedShort128();
				npc.anInt10856 = packet.readUnsignedByteC();
				npc.anInt10848 = packet.readUnsignedByteC();
				npc.anInt10855 = i_24_ & 0x7fff;
				npc.aBoolean10871 = (0x8000 & i_24_) != 0;
				npc.anInt10835 = npc.anInt10855 + Class174.clientCycle
						- -npc.anInt10856;
			}
			if ((0x40000 & mask ^ 0xffffffff) != -1) { //set custom name
				npc.name = packet.readString();
				if ("".equals(npc.name)
						|| npc.name
								.equals(npc.aNpcDefinition11122.name)) {
					npc.name = npc.aNpcDefinition11122.name;
				}
			}
			if ((mask & 0x20 ^ 0xffffffff) != -1) {// npc transform
				if (npc.aNpcDefinition11122.method2998((byte) 91)) {
					Node_Sub38_Sub4.method2799(-126, npc);
				}
				npc.method879(
						Class366.aClass279_4526.getNPCDefinitions(
								packet.readUnsignedShortLE(), (byte) 107), true);
				npc.method861(-1000, npc.aNpcDefinition11122.anInt2811);
				npc.anInt10890 = npc.aNpcDefinition11122.anInt2876 << 3;
				if (npc.aNpcDefinition11122.method2998((byte) 91)) {
					Class262_Sub1
							.method3150(npc.plane, null,
									npc.scenePositionXQueue[0],
									npc.scenePositionYQueue[0], npc, null,
									(byte) -8, 0);
				}
			}
			if ((0x2 & mask ^ 0xffffffff) != -1) {// force talk
				npc.method878(0, 0, packet.readString(), (byte) -60);
			}
			if ((mask & 0x8 ^ 0xffffffff) != -1) { // face coords
				npc.anInt11107 = packet.readUnsignedShortLE();
				npc.anInt11100 = packet.readUnsignedShortLE();
			}
			
			if ((mask & 0x80000) != 0) {// set custom combat level
				npc.combatLevel = packet.readUnsignedShortLE();
				if (npc.combatLevel == 65535) {
					npc.combatLevel = npc.aNpcDefinition11122.anInt2838;
				}
			}
			if ((mask & 0x2000) != 0) {
				int i_25_ = packet.readUnsignedByte128();
				int[] is = new int[i_25_];
				int[] is_26_ = new int[i_25_];
				for (int i_27_ = 0; i_27_ < i_25_; i_27_++) {
					int i_28_ = packet.readUnsignedShort();
					if ((i_28_ & 0xc000) == 49152) {
						int i_29_ = packet.readUnsignedShort128();
						is[i_27_] = Node_Sub16.method2590(i_29_, i_28_ << 16);
					} else {
						is[i_27_] = i_28_;
					}
					is_26_[i_27_] = packet.readUnsignedShort();
				}
				npc.method866(is_26_, is, (byte) 121);
			}
			if ((mask & 0x10000) != 0) {
				int i_30_ = npc.aNpcDefinition11122.anIntArray2847.length;
				int i_31_ = 0;
				if (npc.aNpcDefinition11122.aShortArray2829 != null) {
					i_31_ = npc.aNpcDefinition11122.aShortArray2829.length;
				}
				if (npc.aNpcDefinition11122.aShortArray2874 != null) {
					i_31_ = npc.aNpcDefinition11122.aShortArray2874.length;
				}
				int i_32_ = 0;
				int i_33_ = packet.readUnsigned128Byte();
				if ((0x1 & i_33_ ^ 0xffffffff) != -2) {
					int[] is = null;
					if ((i_33_ & 0x2 ^ 0xffffffff) == -3) {
						is = new int[i_30_];
						for (int i_34_ = 0; i_30_ > i_34_; i_34_++)
							is[i_34_] = packet.readUnsignedShortLE128();
					}
					short[] ses = null;
					if ((i_33_ & 0x4 ^ 0xffffffff) == -5) {
						ses = new short[i_31_];
						for (int i_35_ = 0; i_31_ > i_35_; i_35_++)
							ses[i_35_] = (short) packet.readUnsignedShort128();
					}
					short[] ses_36_ = null;
					if ((i_33_ & 0x8) == 8) {
						ses_36_ = new short[i_32_];
						for (int i_37_ = 0; (i_32_ ^ 0xffffffff) < (i_37_ ^ 0xffffffff); i_37_++)
							ses_36_[i_37_] = (short) packet.readUnsignedShort();
					}
					long l = (long) npc.anInt11124++ << 32 | (long) i_2_;
					new Class361(l, is, ses, ses_36_);
				}
			}
			if ((0x400 & mask ^ 0xffffffff) != -1) {// force movement
				npc.toFirstTileX = packet.read128Byte();
				npc.toFirstTileY = packet.read128Byte();
				npc.toSecondTileX = packet.readByteC();
				npc.toSecondTileY = packet.readByteC();
				npc.toFirstTileTicketDelay = packet.readUnsignedShort()
						+ Class174.clientCycle;
				npc.toSecondTileTicketDelay = packet.readUnsignedShortLE128()
						+ Class174.clientCycle;
				npc.forceMovementDirection = packet.readUnsigned128Byte();
				npc.toSecondTileY += npc.scenePositionYQueue[0];
				npc.anInt10904 = 1;
				npc.toFirstTileY += npc.scenePositionYQueue[0];
				npc.toSecondTileX += npc.scenePositionXQueue[0];
				npc.anInt10900 = 0;
				npc.toFirstTileX += npc.scenePositionXQueue[0];
			}
			if ((0x10 & mask ^ 0xffffffff) != -1) {// animation
				int[] is = new int[4];
				for (int i_38_ = 0; (i_38_ ^ 0xffffffff) > -5; i_38_++) {
					is[i_38_] = packet.readUnsignedShort();
					if ((is[i_38_] ^ 0xffffffff) == -65536) {
						is[i_38_] = -1;
					}
				}
				int i_39_ = packet.readUnsignedByte();
				Class352.method4011(is, i_39_, true, npc, -125);
			}
			if ((0x800 & mask ^ 0xffffffff) != -1) {
				int i_40_ = npc.aNpcDefinition11122.anIntArray2865.length;
				int i_41_ = 0;
				if (npc.aNpcDefinition11122.aShortArray2829 != null) {
					i_41_ = npc.aNpcDefinition11122.aShortArray2829.length;
				}
				int i_42_ = 0;
				if (npc.aNpcDefinition11122.aShortArray2874 != null) {
					i_42_ = npc.aNpcDefinition11122.aShortArray2874.length;
				}
				int i_43_ = packet.readUnsigned128Byte();
				if ((i_43_ & 0x1) == 1) {
					npc.aClass361_11118 = null;
				} else {
					int[] is = null;
					if ((0x2 & i_43_) == 2) {
						is = new int[i_40_];
						for (int i_44_ = 0; i_44_ < i_40_; i_44_++)
							is[i_44_] = packet.readUnsignedShort();
					}
					short[] ses = null;
					if ((0x4 & i_43_) == 4) {
						ses = new short[i_41_];
						for (int i_45_ = 0; i_45_ < i_41_; i_45_++)
							ses[i_45_] = (short) packet.readUnsignedShort();
					}
					short[] ses_46_ = null;
					if ((i_43_ & 0x8) == 8) {
						ses_46_ = new short[i_42_];
						for (int i_47_ = 0; (i_47_ ^ 0xffffffff) > (i_42_ ^ 0xffffffff); i_47_++)
							ses_46_[i_47_] = (short) packet
									.readUnsignedShortLE128();
					}
					long l = (long) i_2_ | (long) npc.anInt11126++ << 32;
					npc.aClass361_11118 = new Class361(l, is, ses, ses_46_);
				}
			}
			if ((0x4000 & mask) != 0) {
				int i_48_ = packet.readUnsignedByte();
				int[] is = new int[i_48_];
				int[] is_49_ = new int[i_48_];
				int[] is_50_ = new int[i_48_];
				for (int i_51_ = 0; i_48_ > i_51_; i_51_++) {
					int i_52_ = packet.readUnsignedShortLE();
					if ((i_52_ ^ 0xffffffff) == -65536) {
						i_52_ = -1;
					}
					is[i_51_] = i_52_;
					is_49_[i_51_] = packet.readUnsignedByte128();
					is_50_[i_51_] = packet.readUnsignedShort();
				}
				Node_Sub38_Sub13.method2831(is_50_, -31813, is, is_49_, npc);
			}
			if ((0x1000 & mask) != 0) { //graphics 2
				int i_53_ = packet.readUnsignedShort128();
				int i_54_ = packet.readInt();
				if ((i_53_ ^ 0xffffffff) == -65536) {
					i_53_ = -1;
				}
				int i_55_ = packet.readUnsignedByte();
				int i_56_ = i_55_ & 0x7;
				int i_57_ = (0x7c & i_55_) >> 3;
				if (i_57_ == 15) {
					i_57_ = -1;
				}
				boolean bool_58_ = (i_55_ >> 7 & 0x1 ^ 0xffffffff) == -2;
				npc.sendGraphics(1, i_56_, bool_58_, i_54_, i_57_, i_53_);
			}
			if ((mask & 0x4) != 0) { //graphics 1
				int i_59_ = packet.readUnsignedShortLE();
				int i_60_ = packet.readIntV2();
				if (i_59_ == 65535) {
					i_59_ = -1;
				}
				int i_61_ = packet.readUnsignedByteC();
				int i_62_ = 0x7 & i_61_;
				int i_63_ = (i_61_ & 0x7f) >> 3;
				if ((i_63_ ^ 0xffffffff) == -16) {
					i_63_ = -1;
				}
				boolean bool_64_ = ((i_61_ & 0xb7) >> 7 ^ 0xffffffff) == -2;
				npc.sendGraphics(0, i_62_, bool_64_, i_60_, i_63_, i_59_);
			}
			if ((0x200 & mask) != 0) {
				npc.aByte10896 = packet.readByte128();
				npc.aByte10878 = packet.read128Byte();
				npc.aByte10884 = packet.readByte();
				npc.aByte10888 = (byte) packet.readUnsigned128Byte();
				npc.anInt10895 = Class174.clientCycle
						- -packet.readUnsignedShortLE();
				npc.anInt10882 = Class174.clientCycle
						+ packet.readUnsignedShort();
			}
		}
	}
}
