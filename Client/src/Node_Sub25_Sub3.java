/* Node_Sub25_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.theora.DecoderContext;
import jagtheora.theora.Frame;
import jagtheora.theora.GranulePos;
import jagtheora.theora.SetupInfo;
import jagtheora.theora.TheoraComment;
import jagtheora.theora.TheoraInfo;

public class Node_Sub25_Sub3 extends Node_Sub25
{
	static int anInt9960;
	private DecoderContext aDecoderContext9961;
	static int anInt9962;
	private int anInt9963;
	private boolean aBoolean9964;
	static int anInt9965;
	static int[] anIntArray9966 = { 1, 4, 1, 2, 1 };
	private GLSprite aGLSprite9967;
	private SetupInfo aSetupInfo9968 = new SetupInfo();
	private boolean aBoolean9969;
	static int anInt9970;
	static int anInt9971;
	private TheoraInfo aTheoraInfo9972 = new TheoraInfo();
	private long aLong9973;
	private boolean aBoolean9974;
	private int anInt9975;
	static int anInt9976;
	static int anInt9977;
	static IncommingPacket aClass192_9978;
	static int anInt9979;
	static Class299 aClass299_9980;
	private TheoraComment aTheoraComment9981 = new TheoraComment();
	static int anInt9982;
	private double aDouble9983;
	static int anInt9984;
	static int anInt9985;
	private Frame aFrame9986;
	static int localNPCsCount = 0;
	static int anInt9988;
	private GranulePos aGranulePos9989;
	static IComponentDefinitions aWidget9990 = null;
	private boolean aBoolean9991;
	
	final float method2667(int i) {
		anInt9960++;
		if (!aBoolean9991 || aTheoraInfo9972.b()) {
			return 0.0F;
		}
		if (i != 0) {
			aLong9973 = -77L;
		}
		return (float) aTheoraInfo9972.fpsNumerator / (float) aTheoraInfo9972.fpsDenominator;
	}
	
	public static void method2668(byte b) {
		aClass299_9980 = null;
		aClass192_9978 = null;
		if (b == -77) {
			aWidget9990 = null;
			anIntArray9966 = null;
		}
	}
	
	private final void method2669(byte b, int i) {
		anInt9975 = i;
		anInt9988++;
		if (aBoolean9991) {
			if ((anInt9975 ^ 0xffffffff) < (anInt9963 ^ 0xffffffff)) {
				anInt9975 = anInt9963;
			}
			if ((anInt9975 ^ 0xffffffff) > -1) {
				anInt9975 = 0;
			}
			aDecoderContext9961.setPostProcessingLevel(anInt9975);
		}
	}
	
	final GLSprite method2670(GraphicsToolkit graphicstoolkit, int i) {
		anInt9979++;
		if (i != -10171) {
			return null;
		}
		if (aFrame9986 == null) {
			return null;
		}
		if (!aBoolean9974 && aGLSprite9967 != null) {
			return aGLSprite9967;
		}
		aGLSprite9967 = graphicstoolkit.a(aFrame9986.pixels, 0, aFrame9986.b, aFrame9986.b, aFrame9986.a, false);
		aBoolean9974 = false;
		return aGLSprite9967;
	}
	
	static final String method2671(int i, String string) {
		anInt9985++;
		if (string == null) {
			return null;
		}
		int i_1_ = 0;
		int i_2_;
		for (i_2_ = string.length(); i_1_ < i_2_; i_1_++) {
			if (!Class13.method206(string.charAt(i_1_), 18)) {
				break;
			}
		}
		if (i != -13472) {
			return null;
		}
		for (/**/; (i_1_ ^ 0xffffffff) > (i_2_ ^ 0xffffffff); i_2_--) {
			if (!Class13.method206(string.charAt(-1 + i_2_), 10)) {
				break;
			}
		}
		int i_3_ = -i_1_ + i_2_;
		if ((i_3_ ^ 0xffffffff) > -2 || (i_3_ ^ 0xffffffff) < -13) {
			return null;
		}
		StringBuffer stringbuffer = new StringBuffer(i_3_);
		for (int i_4_ = i_1_; i_4_ < i_2_; i_4_++) {
			char c = string.charAt(i_4_);
			if (r.method2357((byte) -117, c)) {
				char c_5_ = Class77.method772((byte) -109, c);
				if (c_5_ != 0) {
					stringbuffer.append(c_5_);
				}
			}
		}
		if (stringbuffer.length() == 0) {
			return null;
		}
		return stringbuffer.toString();
	}
	
	static final Class299 method2672(boolean bool, int i) {
		if (bool != true) {
			anIntArray9966 = null;
		}
		anInt9977++;
		if (i != 0) {
			if (i == 1) {
				if ((double) Class20.aFloat327 == 3.0) {
					return Class75.aClass299_1007;
				}
				if ((double) Class20.aFloat327 == 4.0) {
					return Class352.aClass299_4329;
				}
				if ((double) Class20.aFloat327 == 6.0) {
					return Class150_Sub2.aClass299_8962;
				}
				if ((double) Class20.aFloat327 >= 8.0) {
					return aClass299_9980;
				}
			} else if (i == 2) {
				if ((double) Class20.aFloat327 == 3.0) {
					return Class150_Sub2.aClass299_8962;
				}
				if ((double) Class20.aFloat327 == 4.0) {
					return aClass299_9980;
				}
				if ((double) Class20.aFloat327 == 6.0) {
					return Class195.aClass299_2380;
				}
				if ((double) Class20.aFloat327 >= 8.0) {
					return Class190.aClass299_2330;
				}
			}
		} else {
			if ((double) Class20.aFloat327 == 3.0) {
				return Packet.aClass299_9394;
			}
			if ((double) Class20.aFloat327 == 4.0) {
				return EntityNode_Sub6.aClass299_5988;
			}
			if ((double) Class20.aFloat327 == 6.0) {
				return Class75.aClass299_1007;
			}
			if ((double) Class20.aFloat327 >= 8.0) {
				return Class352.aClass299_4329;
			}
		}
		return null;
	}
	
	final void method2656(int i) {
		if (i != 100) {
			method2670(null, 90);
		}
		anInt9970++;
		if (aFrame9986 != null) {
			aFrame9986.a();
		}
		if (aDecoderContext9961 != null) {
			aDecoderContext9961.a();
			aDecoderContext9961 = null;
		}
		if (aGranulePos9989 != null) {
			aGranulePos9989.a();
			aGranulePos9989 = null;
		}
		aTheoraInfo9972.a();
		aTheoraComment9981.a();
		aSetupInfo9968.a();
	}
	
	static final int method2673(int i, boolean bool, int i_6_, boolean bool_7_, int i_8_) {
		if (i <= 54) {
			method2674(100, -17, 53);
		}
		anInt9976++;
		Node_Sub16 node_sub16 = Class295.method3472(i_8_, (byte) 18, bool_7_);
		if (node_sub16 == null) {
			return 0;
		}
		int i_9_ = 0;
		for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > (node_sub16.anIntArray7137.length ^ 0xffffffff); i_10_++) {
			if (node_sub16.anIntArray7137[i_10_] >= 0 && (node_sub16.anIntArray7137[i_10_] ^ 0xffffffff) > (EntityNode_Sub3_Sub1.aClass86_9166.anInt1175 ^ 0xffffffff)) {
				ItemDefinitions itemdefinition = EntityNode_Sub3_Sub1.aClass86_9166.method1010(node_sub16.anIntArray7137[i_10_], 14434);
				int i_11_ = itemdefinition.method1678(i_6_, Class188_Sub2_Sub2.aClass36_9366.method394(i_6_, -78).anInt3443, 10247);
				if (bool) {
					i_9_ += i_11_ * node_sub16.anIntArray7138[i_10_];
				} else {
					i_9_ += i_11_;
				}
			}
		}
		return i_9_;
	}
	
	Node_Sub25_Sub3(OggStreamState oggstreamstate) {
		super(oggstreamstate);
	}
	
	static final boolean method2674(int i, int i_12_, int i_13_) {
		anInt9982++;
		if (i_12_ != 393216) {
			aWidget9990 = null;
		}
        return !(!(Class262_Sub16.method3193(i_13_, i, (byte) -109) | (i & 0x60000 ^ 0xffffffff) != -1) && !Class110.method1135(i, i_13_, false) && !Class188_Sub1_Sub1.method1894(i, (byte) -29, i_13_));
    }
	
	final long method2675(int i) {
		if (i != -3744) {
			localNPCsCount = -126;
		}
		anInt9984++;
		return aLong9973;
	}
	
	final double method2676(int i) {
		anInt9971++;
		return aDouble9983;
	}
	
	final boolean method2677(byte b) {
		if (b < 82) {
			return true;
		}
		anInt9962++;
		return aBoolean9991;
	}
	
	final void method2654(int i, OggPacket oggpacket) {
		anInt9965++;
		if (aBoolean9991) {
			aLong9973 = Class313.method3650(false);
			int i_15_ = aDecoderContext9961.decodePacketIn(oggpacket, aGranulePos9989);
			if ((i_15_ ^ 0xffffffff) > -1) {
				throw new IllegalStateException(String.valueOf(i_15_));
			}
			aDecoderContext9961.granuleFrame(aGranulePos9989);
			aDouble9983 = aDecoderContext9961.granuleTime(aGranulePos9989);
			if (aBoolean9964) {
				boolean bool = (oggpacket.isKeyFrame() ^ 0xffffffff) == -2;
				if (!bool) {
					return;
				}
				aBoolean9964 = false;
			}
			if (!aBoolean9969 || (oggpacket.isKeyFrame() ^ 0xffffffff) == -2) {
				if (aDecoderContext9961.decodeFrame(aFrame9986) != 0) {
					throw new IllegalStateException(String.valueOf(i_15_));
				}
				aBoolean9974 = true;
			}
		} else {
			int i_16_ = aSetupInfo9968.decodeHeader(aTheoraInfo9972, aTheoraComment9981, oggpacket);
			if (i_16_ == 0) {
				aBoolean9991 = true;
				if ((aTheoraInfo9972.frameWidth ^ 0xffffffff) < -2049 || aTheoraInfo9972.frameHeight > 1024) {
					throw new IllegalStateException();
				}
				aDecoderContext9961 = new DecoderContext(aTheoraInfo9972, aSetupInfo9968);
				aGranulePos9989 = new GranulePos();
				aFrame9986 = new Frame(aTheoraInfo9972.frameWidth, aTheoraInfo9972.frameHeight);
				anInt9963 = aDecoderContext9961.getMaxPostProcessingLevel();
				method2669((byte) -125, anInt9975);
			} else if ((i_16_ ^ 0xffffffff) > -1) {
				throw new IllegalStateException(String.valueOf(i_16_));
			}
		}
		if (i != 18986) {
			method2670(null, -63);
		}
	}
	
	static {
		aClass192_9978 = new IncommingPacket(53, -1);
	}
}
