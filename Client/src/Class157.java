/* Class157 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class157
{
	static int anInt1972;
	static byte[] aByteArray1973 = new byte[520];
	static int anInt1974;
	static int anInt1975;
	private Class312 aClass312_1976;
	static int anInt1977;
	static int anInt1978;
	static int anInt1979;
	private Node aNode1980;
	static double aDouble1981;
	static int anInt1982;
	
	static final Class106 method1709(GLXToolkit glxtoolkit, int i, int i_0_, byte[] bs) {
		anInt1982++;
		if (bs == null) {
			return null;
		}
		if (i_0_ > -55) {
			return null;
		}
		int i_1_ = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(i, i_1_);
		OpenGL.glProgramRawARB(i, 34933, bs);
		OpenGL.glGetIntegerv(34379, Class297.anIntArray3703, 0);
		if (Class297.anIntArray3703[0] != -1) {
			OpenGL.glBindProgramARB(i, 0);
			return null;
		}
		OpenGL.glBindProgramARB(i, 0);
		return new Class106(glxtoolkit, i, i_1_);
	}
	
	static final void method1710(int i, int i_2_, boolean bool, int i_3_, int i_4_, int i_5_) {
		anInt1978++;
		if (Class175.aClass261ArrayArrayArray2099 == null) {
			Class93.aGraphicsToolkit1241.method1239(i_3_, i_4_, i_2_, (byte) 116, i_5_, -16777216);
		} else {
			boolean bool_6_ = false;
			if (aa.anInt101 == 0) {
				if (Class295.myPlayer.anInt5934 < 0 || (Class295.myPlayer.anInt5934 ^ 0xffffffff) <= (512 * Node_Sub54.GAME_SCENE_WDITH ^ 0xffffffff) || Class295.myPlayer.anInt5940 < 0 || Class295.myPlayer.anInt5940 >= Class377_Sub1.GAME_SCENE_HEIGHT * 512) {
					bool_6_ = true;
				}
			} else if (!Class320_Sub18.aBoolean8375) {
				bool_6_ = true;
			}
			if (bool_6_) {
				Class93.aGraphicsToolkit1241.method1239(i_3_, i_4_, i_2_, (byte) 116, i_5_, -16777216);
			} else {
				Class110.anInt1412++;
				if (Class295.myPlayer != null && (Class295.myPlayer.anInt5934 + (-(256 * Class295.myPlayer.getSize((byte) 45)) + 256) >> 9 ^ 0xffffffff) == (Class359.anInt4467 ^ 0xffffffff) && (Class295.myPlayer.anInt5940 + -(256 * (Class295.myPlayer.getSize((byte) 48) + -1)) >> 9 ^ 0xffffffff) == (Node_Sub15_Sub4.anInt9798 ^ 0xffffffff)) {
					Class359.anInt4467 = -1;
					Node_Sub15_Sub4.anInt9798 = -1;
					NpcDefinition.method3002((byte) 97);
				}
				Class377.method4125(96);
				if (i > -40) {
					aByteArray1973 = null;
				}
				if (!bool) {
					Class320_Sub24.method3774(-51);
				}
				Class34_Sub1.method375(i_5_, true, i_2_, i_4_, (byte) -95, i_3_);
				i_5_ = Class22.anInt428;
				i_3_ = Class132.anInt1684;
				Class308.anInt3912 = Class308.anInt3916;
				i_2_ = Mobile_Sub2.anInt10722;
				i_4_ = Class111.anInt1418;
				if ((Class320_Sub22.anInt8415 ^ 0xffffffff) == -2) {
					int i_7_ = (int) Class257.aFloat3243;
					if (Class200_Sub1.anInt5145 >> 8 > i_7_) {
						i_7_ = Class200_Sub1.anInt5145 >> 8;
					}
					if (Plane.aBooleanArray3401[4] && i_7_ < Class262_Sub3.anIntArray7713[4] + 128) {
						i_7_ = Class262_Sub3.anIntArray7713[4] - -128;
					}
					int i_8_ = Node_Sub36_Sub1.anInt10040 + (int) Node_Sub12.aFloat5450 & 0x3fff;
					Node_Sub23.method2624(i_7_, (i_7_ >> 3) * 3 + 600 << 2, i_4_, 101, Mobile_Sub4.anInt10987, i_8_, Class25.anInt444, -200 + Node_Sub38_Sub7.method2809(CacheNode_Sub20_Sub1.myPlayerPlane, -29754, Class295.myPlayer.anInt5940, Class295.myPlayer.anInt5934));
				} else if ((Class320_Sub22.anInt8415 ^ 0xffffffff) == -5) {
					int i_9_ = (int) Class257.aFloat3243;
					if ((Class200_Sub1.anInt5145 >> 8 ^ 0xffffffff) < (i_9_ ^ 0xffffffff)) {
						i_9_ = Class200_Sub1.anInt5145 >> 8;
					}
					if (Plane.aBooleanArray3401[4] && (Class262_Sub3.anIntArray7713[4] - -128 ^ 0xffffffff) < (i_9_ ^ 0xffffffff)) {
						i_9_ = 128 + Class262_Sub3.anIntArray7713[4];
					}
					int i_10_ = 0x3fff & (int) Node_Sub12.aFloat5450;
					Node_Sub23.method2624(i_9_, (i_9_ >> 3) * 3 + 600 << 2, i_4_, 76, Mobile_Sub4.anInt10987, i_10_, Class25.anInt444, -200 + Node_Sub38_Sub7.method2809(CacheNode_Sub20_Sub1.myPlayerPlane, -29754, Node_Sub19.anInt7173, Class234.anInt2792));
				} else if ((Class320_Sub22.anInt8415 ^ 0xffffffff) == -6) {
					Node_Sub10.method2537(i_4_, false);
				}
				int i_11_ = Class98.anInt5061;
				int i_12_ = Class190.anInt2331;
				int i_13_ = Node_Sub10.anInt7079;
				int i_14_ = OutcommingPacket.anInt4050;
				int i_15_ = Class170.anInt2053;
				for (int i_16_ = 0; i_16_ < 5; i_16_++) {
					if (Plane.aBooleanArray3401[i_16_]) {
						int i_17_ = (int) ((double) -Class173.anIntArray2091[i_16_] + (double) (2 * Class173.anIntArray2091[i_16_] + 1) * Math.random() + Math.sin((double) Class193.anIntArray2362[i_16_] / 100.0 * (double) Class320_Sub7.anIntArray8271[i_16_]) * (double) Class262_Sub3.anIntArray7713[i_16_]);
						if ((i_16_ ^ 0xffffffff) == -4) {
							Class170.anInt2053 = 0x3fff & i_17_ + Class170.anInt2053;
						}
						if (i_16_ == 0) {
							Class98.anInt5061 += i_17_ << 2;
						}
						if ((i_16_ ^ 0xffffffff) == -2) {
							Class190.anInt2331 += i_17_ << 2;
						}
						if ((i_16_ ^ 0xffffffff) == -3) {
							Node_Sub10.anInt7079 += i_17_ << 2;
						}
						if ((i_16_ ^ 0xffffffff) == -5) {
							OutcommingPacket.anInt4050 += i_17_;
							if (OutcommingPacket.anInt4050 >= 1024) {
								if (OutcommingPacket.anInt4050 > 3072) {
									OutcommingPacket.anInt4050 = 3072;
								}
							} else {
								OutcommingPacket.anInt4050 = 1024;
							}
						}
					}
				}
				if ((Class98.anInt5061 ^ 0xffffffff) > -1) {
					Class98.anInt5061 = 0;
				}
				if ((Node_Sub10.anInt7079 ^ 0xffffffff) > -1) {
					Node_Sub10.anInt7079 = 0;
				}
				if ((Class98.anInt5061 ^ 0xffffffff) < ((Class328.anInt4115 << 9) + -1 ^ 0xffffffff)) {
					Class98.anInt5061 = -1 + (Class328.anInt4115 << 9);
				}
				if (Node_Sub10.anInt7079 > -1 + (Node_Sub50.anInt7623 << 9)) {
					Node_Sub10.anInt7079 = (Node_Sub50.anInt7623 << 9) + -1;
				}
				Class194_Sub2.method1972(4);
				Class93.aGraphicsToolkit1241.KA(i_5_, i_2_, i_3_ + i_5_, i_2_ + i_4_);
				Class377_Sub1.method4130(true, -10385);
				int i_18_ = Class138.anInt1726;
				Class290_Sub6.aClass336_8114.method3864(Class98.anInt5061, Class190.anInt2331, Node_Sub10.anInt7079, 0x3fff & -OutcommingPacket.anInt4050, -Class170.anInt2053 & 0x3fff, 0x3fff & -Class48.anInt704);
				Class93.aGraphicsToolkit1241.a(Class290_Sub6.aClass336_8114);
				Class93.aGraphicsToolkit1241.DA(i_3_ / 2 + i_5_, i_4_ / 2 + i_2_, Class339_Sub6.anInt8713 << 1, Class339_Sub6.anInt8713 << 1);
				if (!Class71.aBoolean967) {
					if (Class245.aClass119_3085 == null) {
						Class93.aGraphicsToolkit1241.GA(i_18_);
						Class93.aGraphicsToolkit1241.ya();
					} else {
						Class93.aGraphicsToolkit1241.xa(1.0F);
						Class93.aGraphicsToolkit1241.ZA(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
						Class245.aClass119_3085.method1216(true, i_2_, Class93.aGraphicsToolkit1241, Class170.anInt2053, i_3_, i_18_, Class48.anInt704, i_4_, i_5_, Class235.anInt5127 << 3, OutcommingPacket.anInt4050, false, (byte) -32);
					}
				} else {
					Class254.method3108(Class138.anInt1726, 4);
					if (Class92.anInt1235 != Class308.anInt3912) {
						Class194_Sub1.aBoolean6892 = true;
					}
					Class92.anInt1235 = Class308.anInt3912;
					Class93.aGraphicsToolkit1241.GA(i_18_);
					Class93.aGraphicsToolkit1241.ya();
				}
				CacheNode_Sub16_Sub1.method2387((byte) -114);
				Class320_Sub24.method3772(Class339_Sub6.anInt8713 << 1, (byte) -27, i_4_ / 2 + i_2_, Class339_Sub6.anInt8713 << 1, i_5_ - -(i_3_ / 2));
				Class329.method3836(0x3fff & -Class170.anInt2053, 327263118, Node_Sub10.anInt7079, -Class48.anInt704 & 0x3fff, Class190.anInt2331, -OutcommingPacket.anInt4050 & 0x3fff, Class98.anInt5061);
				Class89.method1022(false);
				byte b = (Class213.aNode_Sub27_2512.aClass320_Sub4_7304.method3694(false) ^ 0xffffffff) != -3 ? (byte) 1 : (byte) Class110.anInt1412;
				if (Class71.aBoolean967) {
					Class291_Sub1.method3454(0x3fff & -Class170.anInt2053, 0x3fff & -Class48.anInt704, -OutcommingPacket.anInt4050 & 0x3fff, 128);
					Class251.method3099(b, Class98.anInt5061, Node_Sub10.anInt7079, Class190.anInt2331, Class295.myPlayer.anInt5940 >> 9, Class246.anIntArray3107, Class362.anIntArray4497, Class174.clientCycle, 1 + Class295.myPlayer.plane, Class259.anIntArray3296, Class213.aNode_Sub27_2512.aClass320_Sub8_7280.method3712(false) == 0, true, Class308.anInt3912, MainFile.anIntArray135, Node_Sub38_Sub15.aByteArrayArrayArray10261, Class84.anIntArray1147, Class295.myPlayer.anInt5934 >> 9, 1);
				} else {
					Class151.method1671(Class174.clientCycle, Class98.anInt5061, Class190.anInt2331, Node_Sub10.anInt7079, Node_Sub38_Sub15.aByteArrayArrayArray10261, Class259.anIntArray3296, MainFile.anIntArray135, Class246.anIntArray3107, Class84.anIntArray1147, Class362.anIntArray4497, 1 + Class295.myPlayer.plane, b, Class295.myPlayer.anInt5934 >> 9, Class295.myPlayer.anInt5940 >> 9, (Class213.aNode_Sub27_2512.aClass320_Sub8_7280.method3712(false) ^ 0xffffffff) == -1, true, !Node_Sub15_Sub10.aBoolean9850 ? -1 : Class308.anInt3912, 0, false);
				}
				CacheNode_Sub16_Sub1.method2387((byte) -114);
				if (Class151.anInt1843 == 11) {
					Class262_Sub6.drawTileStrings((byte) 55, i_3_, 256, i_4_, 256, i_2_, i_5_);
					Class339_Sub7.method3942(i_2_, i_3_, 256, 256, i_5_, i_4_, true);
					Class127.drawHintIcons(3, 256, 256, i_3_, i_2_, i_5_, i_4_);
					Class150_Sub1.method1656(i_3_, i_5_, 16427, i_2_, i_4_);
				}
				Npc.method874();
				Node_Sub10.anInt7079 = i_13_;
				Class98.anInt5061 = i_11_;
				OutcommingPacket.anInt4050 = i_14_;
				Class190.anInt2331 = i_12_;
				Class170.anInt2053 = i_15_;
				Node_Sub36_Sub1.aBoolean10030 = false;
				if (Class230.aBoolean5214 && (Class267.aClass266_3449.method3236(0) ^ 0xffffffff) == -1) {
					Class230.aBoolean5214 = false;
				}
				if (Class230.aBoolean5214) {
					Class93.aGraphicsToolkit1241.method1239(i_3_, i_4_, i_2_, (byte) 116, i_5_, -16777216);
					Class169_Sub3.method1779(Class93.aGraphicsToolkit1241, Class22.loading_translation.method297(Class35.language), false, Class169_Sub3.aClass357_8820, StandardSprite.aClass52_8945, -16777216);
				}
				Class377_Sub1.method4130(false, -10385);
			}
		}
	}
	
	public static void method1711(int i) {
		if (i >= 45) {
			aByteArray1973 = null;
		}
	}
	
	public Class157() {
		/* empty */
	}
	
	Class157(Class312 class312) {
		aClass312_1976 = class312;
	}
	
	static final Node_Sub38 method1712(int i, BufferedStream buffer) {
		buffer.readUnsignedByte();
		anInt1977++;
		int i_19_ = buffer.readUnsignedByte();
		Node_Sub38 node_sub38 = Class52.method530(i_19_, 83);
		if (i >= -56) {
			return null;
		}
		node_sub38.anInt7450 = buffer.readUnsignedByte();
		int i_20_ = buffer.readUnsignedByte();
		for (int i_21_ = 0; i_20_ > i_21_; i_21_++) {
			int i_22_ = buffer.readUnsignedByte();
			node_sub38.method2780(false, buffer, i_22_);
		}
		node_sub38.method2785(7);
		return node_sub38;
	}
	
	final Node method1713(byte b) {
		anInt1974++;
		if (b != -34) {
			return null;
		}
		Node node = aNode1980;
		if (aClass312_1976.aNode3958 == node) {
			aNode1980 = null;
			return null;
		}
		aNode1980 = node.aNode2800;
		return node;
	}
	
	final Node method1714(int i) {
		anInt1975++;
		Node node = aClass312_1976.aNode3958.aNode2800;
		if (aClass312_1976.aNode3958 == node) {
			aNode1980 = null;
			return null;
		}
		aNode1980 = node.aNode2800;
		if (i != 2) {
			aByteArray1973 = null;
		}
		return node;
	}
	
	final void method1715(Class312 class312, int i) {
		if (i < 34) {
			aByteArray1973 = null;
		}
		aClass312_1976 = class312;
		anInt1979++;
	}
}
