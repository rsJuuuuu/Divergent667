/* Class258 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class258 implements Interface12
{
	private String aString5286;
	private Index aClass302_5287;
	static int anInt5288;
	static int[] calculatedScenePositionYs = new int[50];
	static int anInt5290;
	static int anInt5291 = 0;
	static int anInt5292;
	static Class335 aClass335_5293 = new Class335(128);
	static int anInt5294;
	static int anInt5295;
	
	public final int method35(int i) {
		anInt5292++;
		if (i >= -4) {
			method3126(-59, null, null, -95);
		}
		if (aClass302_5287.method3507((byte) -126, aString5286)) {
			return 100;
		}
		return 0;
	}
	
	static final void method3124(int i, int i_0_, int[] is, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		anInt5294++;
		if (i > 0 && !Class371.method4094(i, false)) {
			throw new IllegalArgumentException("");
		}
		if ((i_3_ ^ 0xffffffff) < -1 && !Class371.method4094(i_3_, false)) {
			throw new IllegalArgumentException("");
		}
		if ((i_1_ ^ 0xffffffff) != -32994) {
			throw new IllegalArgumentException("");
		}
		int i_6_ = 0;
		int i_7_ = i_3_ <= i ? i_3_ : i;
		int i_8_ = i >> 1;
		if (i_4_ != 1) {
			calculatedScenePositionYs = null;
		}
		int i_9_ = i_3_ >> 1;
		int[] is_10_ = is;
		int[] is_11_ = new int[i_9_ * i_8_];
		for (;;) {
			OpenGL.glTexImage2Di(i_0_, i_6_, i_2_, i, i_3_, 0, i_1_, i_5_, is_10_, 0);
			if ((i_7_ ^ 0xffffffff) >= -2) {
				break;
			}
			int i_12_ = 0;
			int i_13_ = 0;
			int i_14_ = i_13_ - -i;
			int[] is_15_ = is_11_;
			for (int i_16_ = 0; (i_9_ ^ 0xffffffff) < (i_16_ ^ 0xffffffff); i_16_++) {
				for (int i_17_ = 0; i_17_ < i_8_; i_17_++) {
					int i_18_ = is_10_[i_13_++];
					int i_19_ = is_10_[i_14_++];
					int i_20_ = is_10_[i_13_++];
					int i_21_ = i_18_ >> 24 & 0xff;
					int i_22_ = 0xff & i_18_;
					int i_23_ = is_10_[i_14_++];
					int i_24_ = (0xff42 & i_18_) >> 8;
					int i_25_ = (0xff12ee & i_18_) >> 16;
					i_25_ += (0xfff930 & i_20_) >> 16;
					i_24_ += (0xff82 & i_20_) >> 8;
					i_22_ += 0xff & i_20_;
					i_21_ += i_20_ >> 24 & 0xff;
					i_21_ += 0xff & i_19_ >> 24;
					i_22_ += i_19_ & 0xff;
					i_25_ += (0xff52b6 & i_19_) >> 16;
					i_24_ += i_19_ >> 8 & 0xff;
					i_21_ += 0xff & i_23_ >> 24;
					i_22_ += 0xff & i_23_;
					i_25_ += i_23_ >> 16 & 0xff;
					i_24_ += i_23_ >> 8 & 0xff;
					is_11_[i_12_++] = Node_Sub16.method2590(Node_Sub16.method2590(Node_Sub16.method2590(Node_Sub30.method2723(i_25_, 1020) << 14, Node_Sub30.method2723(i_21_, 1020) << 22), Node_Sub30.method2723(1020, i_24_) << 6), Node_Sub30.method2723(i_22_ >> 2, 255));
				}
				i_14_ += i;
				i_13_ += i;
			}
			is_11_ = is_10_;
			i_3_ = i_9_;
			i = i_8_;
			is_10_ = is_15_;
			i_9_ >>= 1;
			i_8_ >>= 1;
			i_7_ >>= 1;
			i_6_++;
		}
	}
	
	public static void method3125(byte b) {
		aClass335_5293 = null;
		if (b < 47) {
			method3127((byte) 92);
		}
		calculatedScenePositionYs = null;
	}
	
	static final void method3126(int i, BufferedStream buffer, SignLink signlink, int i_26_) {
		anInt5295++;
		if (i != -9821) {
			method3124(-43, 56, null, -92, -124, -63, -16, 39);
		}
		Node_Sub53 node_sub53 = new Node_Sub53();
		node_sub53.anInt7658 = buffer.readUnsignedByte();
		node_sub53.anInt7665 = buffer.readInt();
		node_sub53.anIntArray7663 = new int[node_sub53.anInt7658];
		node_sub53.anIntArray7660 = new int[node_sub53.anInt7658];
		node_sub53.aClass241Array7657 = new Class241[node_sub53.anInt7658];
		node_sub53.aByteArrayArrayArray7659 = new byte[node_sub53.anInt7658][][];
		node_sub53.anIntArray7661 = new int[node_sub53.anInt7658];
		node_sub53.aClass241Array7664 = new Class241[node_sub53.anInt7658];
		for (int i_27_ = 0; (i_27_ ^ 0xffffffff) > (node_sub53.anInt7658 ^ 0xffffffff); i_27_++) {
			try {
				int i_28_ = buffer.readUnsignedByte();
				if ((i_28_ ^ 0xffffffff) != -1 && i_28_ != 1 && (i_28_ ^ 0xffffffff) != -3) {
					if (i_28_ == 3 || (i_28_ ^ 0xffffffff) == -5) {
						String string = buffer.readString();
						String string_29_ = buffer.readString();
						int i_30_ = buffer.readUnsignedByte();
						String[] strings = new String[i_30_];
						for (int i_31_ = 0; i_31_ < i_30_; i_31_++)
							strings[i_31_] = buffer.readString();
						byte[][] bs = new byte[i_30_][];
						if ((i_28_ ^ 0xffffffff) == -4) {
							for (int i_32_ = 0; i_32_ < i_30_; i_32_++) {
								int i_33_ = buffer.readInt();
								bs[i_32_] = new byte[i_33_];
								buffer.readBytes(bs[i_32_], 0, i_33_);
							}
						}
						node_sub53.anIntArray7661[i_27_] = i_28_;
						@SuppressWarnings("rawtypes")
						Class[] var_classes = new Class[i_30_];
						for (int i_34_ = 0; (i_30_ ^ 0xffffffff) < (i_34_ ^ 0xffffffff); i_34_++)
							var_classes[i_34_] = Class260.method3139(strings[i_34_], 51);
						node_sub53.aClass241Array7664[i_27_] = signlink.method3638(Class260.method3139(string, 51), var_classes, string_29_, false);
						node_sub53.aByteArrayArrayArray7659[i_27_] = bs;
					}
				} else {
					String string = buffer.readString();
					String string_35_ = buffer.readString();
					int i_36_ = 0;
					if (i_28_ == 1) {
						i_36_ = buffer.readInt();
					}
					node_sub53.anIntArray7661[i_27_] = i_28_;
					node_sub53.anIntArray7660[i_27_] = i_36_;
					node_sub53.aClass241Array7657[i_27_] = signlink.method3628(Class260.method3139(string, i + 9872), string_35_, Node_Sub19.method2612(i, -9821));
				}
			} catch (ClassNotFoundException classnotfoundexception) {
				node_sub53.anIntArray7663[i_27_] = -1;
			} catch (SecurityException securityexception) {
				node_sub53.anIntArray7663[i_27_] = -2;
			} catch (NullPointerException nullpointerexception) {
				node_sub53.anIntArray7663[i_27_] = -3;
			} catch (Exception exception) {
				node_sub53.anIntArray7663[i_27_] = -4;
			} catch (Throwable throwable) {
				node_sub53.anIntArray7663[i_27_] = -5;
			}
		}
		CacheNode_Sub16.aClass312_9600.method3625((byte) -54, node_sub53);
	}
	
	static final void method3127(byte b) {
		if (b == 122) {
			anInt5290++;
			Class44.aGraphicsToolkit668.a(Npc.aClass336_11113);
			Class44.aGraphicsToolkit668.DA(Class178.anInt2119, Class343.anInt4252, Class99.anInt1280, Class320_Sub30.anInt8495);
		}
	}
	
	public final Class172 method34(byte b) {
		@SuppressWarnings("unused")
		int i = -11 % ((15 - b) / 48);
		anInt5288++;
		return Class172.aClass172_2078;
	}
	
	Class258(Index class302, String string) {
		aClass302_5287 = class302;
		aString5286 = string;
	}
}
