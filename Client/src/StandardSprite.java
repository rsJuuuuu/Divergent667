/* StandardSprite - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StandardSprite extends GLSprite
{
	static int anInt8914;
	private int anInt8915;
	private boolean aBoolean8916;
	static int anInt8917;
	static int anInt8918;
	static int anInt8919;
	static int anInt8920;
	static int anInt8921;
	private int anInt8922 = 0;
	static int anInt8923;
	static int anInt8924;
	private Interface13_Impl1 anInterface13_Impl1_8925;
	static Class104 aClass104_8926 = new Class104();
	static int anInt8927;
	static int anInt8928;
	private int anInt8929;
	static int anInt8930;
	static int anInt8931;
	static int anInt8932;
	private boolean aBoolean8933;
	static int anInt8934;
	private AbstractToolkit anAbstractToolkit8935;
	private boolean aBoolean8936;
	static int anInt8937;
	static int anInt8938;
	private int anInt8939 = 0;
	private int anInt8940;
	private boolean aBoolean8941;
	private int anInt8942;
	static int anInt8943;
	private boolean aBoolean8944;
	static Class52 aClass52_8945;
	static int anInt8946;
	
	private final void method1212(int i, int i_0_, int i_1_, int i_2_, int[] is, int i_3_, int i_4_) {
		anInterface13_Impl1_8925.method47(is, i, i_0_, i_2_, 23110, i_1_, i_3_, i_4_);
		anInt8914++;
	}
	
	final void method1178(int i, int i_5_, int i_6_, int i_7_) {
		anInt8939 = i_5_;
		anInt8938++;
		anInt8940 = i_6_;
		anInt8922 = i_7_;
		anInt8929 = i;
		aBoolean8933 = anInt8929 != 0 || anInt8939 != 0 || anInt8940 != 0 || (anInt8922 ^ 0xffffffff) != -1;
	}
	
	final int method1193() {
		anInt8932++;
		return anInt8942;
	}
	
	final int getYOffset() {
		anInt8927++;
		return anInt8915;
	}
	
	final void method1189(int i, int i_8_, aa var_aa, int i_9_, int i_10_) {
		anInt8931++;
		aa_Sub2 var_aa_Sub2 = (aa_Sub2) var_aa;
		Interface13_Impl1 interface13_impl1 = var_aa_Sub2.anInterface13_Impl1_5489;
		i += anInt8929;
		i_8_ += anInt8939;
		anInterface13_Impl1_8925.method41((byte) -127, Class194.aClass228_2377);
		anAbstractToolkit8935.method1323((byte) 28);
		anAbstractToolkit8935.method1312((byte) -21, anInterface13_Impl1_8925);
		anAbstractToolkit8935.method1277((byte) 61, 1);
		anAbstractToolkit8935.method1278((byte) -12, 1);
		Class336_Sub1 class336_sub1 = anAbstractToolkit8935.method1264(false);
		class336_sub1.method3877(0.0F, (byte) -112, (float) anInt8915, (float) anInt8942);
		class336_sub1.method3863(i, i_8_, 0);
		anAbstractToolkit8935.method1266((byte) 127);
		Class336_Sub1 class336_sub1_11_ = anAbstractToolkit8935.method1306(7);
		class336_sub1_11_.method3877(1.0F, (byte) -112, anInterface13_Impl1_8925.method49((float) anInt8915, (byte) -116), anInterface13_Impl1_8925.method45((float) anInt8942, 105));
		anAbstractToolkit8935.method1297(-21029, BufferedConnection.aClass346_615);
		anAbstractToolkit8935.method1362(255, 1);
		anAbstractToolkit8935.method1312((byte) -21, interface13_impl1);
		anAbstractToolkit8935.method1318(-30, Class116.aClass94_5075, Class117_Sub1.aClass94_4924);
		anAbstractToolkit8935.method1304(0, 0, Class200_Sub1.aClass135_5139);
		Class336_Sub1 class336_sub1_12_ = anAbstractToolkit8935.method1306(7);
		class336_sub1_12_.method3877(1.0F, (byte) -112, interface13_impl1.method49((float) anInt8915, (byte) -121), interface13_impl1.method45((float) anInt8942, -79));
		class336_sub1_12_.method3875(0.0F, interface13_impl1.method49((float) (-i_10_ + i_8_), (byte) -40), (byte) 103, interface13_impl1.method45((float) (-i_9_ + i), -109));
		anAbstractToolkit8935.method1297(-21029, BufferedConnection.aClass346_615);
		anAbstractToolkit8935.method1283((byte) -128);
		anAbstractToolkit8935.method1255((byte) -12);
		anAbstractToolkit8935.method1304(0, 0, Class106.aClass135_1354);
		anAbstractToolkit8935.method1318(-30, Class116.aClass94_5075, Class116.aClass94_5075);
		anAbstractToolkit8935.method1312((byte) -21, null);
		anAbstractToolkit8935.method1362(255, 0);
		anAbstractToolkit8935.method1255((byte) -12);
	}
	
	final void method1191(int i, int i_13_, int i_14_, int i_15_, int i_16_) {
		anInt8934++;
		Class336_Sub1 class336_sub1 = anAbstractToolkit8935.method1264(false);
		Class336_Sub1 class336_sub1_17_ = anAbstractToolkit8935.method1306(7);
		i_13_ += anInt8939;
		i += anInt8929;
		anInterface13_Impl1_8925.method41((byte) -108, Class194.aClass228_2377);
		anAbstractToolkit8935.method1323((byte) 28);
		anAbstractToolkit8935.method1312((byte) -21, anInterface13_Impl1_8925);
		anAbstractToolkit8935.method1277((byte) 61, i_16_);
		anAbstractToolkit8935.method1278((byte) -12, i_14_);
		anAbstractToolkit8935.method1304(1, 0, InterfaceSettings.aClass135_7421);
		anAbstractToolkit8935.method1366((byte) -79, InterfaceSettings.aClass135_7421, 1);
		anAbstractToolkit8935.method1336(-2, i_15_);
		class336_sub1.method3877(0.0F, (byte) -112, (float) anInt8915, (float) anInt8942);
		class336_sub1.method3863(i, i_13_, 0);
		class336_sub1_17_.method3877(1.0F, (byte) -112, anInterface13_Impl1_8925.method49((float) anInt8915, (byte) -56), anInterface13_Impl1_8925.method45((float) anInt8942, 98));
		anAbstractToolkit8935.method1297(-21029, BufferedConnection.aClass346_615);
		anAbstractToolkit8935.method1266((byte) 108);
		anAbstractToolkit8935.method1283((byte) -128);
		anAbstractToolkit8935.method1255((byte) -12);
		anAbstractToolkit8935.method1304(1, 0, Class200_Sub1.aClass135_5139);
		anAbstractToolkit8935.method1366((byte) -86, Class200_Sub1.aClass135_5139, 1);
	}
	
	final void method1195(int i, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_) {
		anInt8943++;
		int[] is = anAbstractToolkit8935.na(i_21_, i_22_, i_19_, i_20_);
		if (is != null) {
			for (int i_23_ = 0; (i_23_ ^ 0xffffffff) > (is.length ^ 0xffffffff); i_23_++)
				is[i_23_] = Node_Sub16.method2590(is[i_23_], -16777216);
			method1212(i, i_18_, i_19_, i_20_, is, 0, i_19_);
		}
	}
	
	final int method1197() {
		anInt8918++;
		return anInt8940 + anInt8942 + anInt8929;
	}
	
	final void method1183(int i, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_) {
		anInt8921++;
		Class336_Sub1 class336_sub1 = anAbstractToolkit8935.method1264(false);
		Class336_Sub1 class336_sub1_30_ = anAbstractToolkit8935.method1306(7);
		anInterface13_Impl1_8925.method41((byte) -109, Class194.aClass228_2377);
		anAbstractToolkit8935.method1323((byte) 28);
		anAbstractToolkit8935.method1312((byte) -21, anInterface13_Impl1_8925);
		anAbstractToolkit8935.method1277((byte) 61, i_29_);
		anAbstractToolkit8935.method1278((byte) -12, i_27_);
		anAbstractToolkit8935.method1304(1, 0, InterfaceSettings.aClass135_7421);
		anAbstractToolkit8935.method1366((byte) 74, InterfaceSettings.aClass135_7421, 1);
		anAbstractToolkit8935.method1336(-2, i_28_);
		boolean bool = aBoolean8944 && anInt8939 == 0 && anInt8922 == 0;
		boolean bool_31_ = aBoolean8916 && (anInt8929 ^ 0xffffffff) == -1 && anInt8940 == 0;
		if (bool_31_ & bool) {
			class336_sub1_30_.method3877(1.0F, (byte) -112, anInterface13_Impl1_8925.method49((float) i_26_, (byte) -22), anInterface13_Impl1_8925.method45((float) i_25_, -74));
			class336_sub1.method3877(0.0F, (byte) -112, (float) i_26_, (float) i_25_);
			class336_sub1.method3863(i, i_24_, 0);
			anAbstractToolkit8935.method1297(-21029, BufferedConnection.aClass346_615);
			anAbstractToolkit8935.method1266((byte) 108);
			anAbstractToolkit8935.method1283((byte) -128);
		} else if (bool_31_) {
			int i_32_ = i_24_ - -i_26_;
			int i_33_ = method1186();
			class336_sub1_30_.method3877(1.0F, (byte) -112, anInterface13_Impl1_8925.method49((float) anInt8915, (byte) -94), anInterface13_Impl1_8925.method45((float) i_25_, 118));
			anAbstractToolkit8935.method1297(-21029, BufferedConnection.aClass346_615);
			int i_34_ = anInt8939 + i_24_;
			int i_35_ = i_34_ - -anInt8915;
			while ((i_35_ ^ 0xffffffff) >= (i_32_ ^ 0xffffffff)) {
				class336_sub1.method3877(0.0F, (byte) -112, (float) anInt8915, (float) i_25_);
				class336_sub1.method3863(i, i_34_, 0);
				anAbstractToolkit8935.method1266((byte) 120);
				i_35_ += i_33_;
				i_34_ += i_33_;
				anAbstractToolkit8935.method1283((byte) -128);
			}
			if ((i_32_ ^ 0xffffffff) < (i_34_ ^ 0xffffffff)) {
				int i_36_ = -i_34_ + i_32_;
				class336_sub1_30_.method3877(1.0F, (byte) -112, anInterface13_Impl1_8925.method49((float) i_36_, (byte) -102), anInterface13_Impl1_8925.method45((float) i_25_, 98));
				anAbstractToolkit8935.method1297(-21029, BufferedConnection.aClass346_615);
				class336_sub1.method3877(0.0F, (byte) -112, (float) i_36_, (float) i_25_);
				class336_sub1.method3863(i, i_34_, 0);
				anAbstractToolkit8935.method1266((byte) 118);
				anAbstractToolkit8935.method1283((byte) -128);
			}
		} else if (!bool) {
			int i_37_ = i_24_ + i_26_;
			int i_38_ = i + i_25_;
			int i_39_ = method1197();
			int i_40_ = method1186();
			int i_41_ = anInt8939 + i_24_;
			for (int i_42_ = i_41_ - -anInt8915; (i_37_ ^ 0xffffffff) <= (i_42_ ^ 0xffffffff); i_42_ += i_40_) {
				class336_sub1_30_.method3877(1.0F, (byte) -112, anInterface13_Impl1_8925.method49((float) anInt8915, (byte) -102), anInterface13_Impl1_8925.method45((float) anInt8942, -98));
				anAbstractToolkit8935.method1297(-21029, BufferedConnection.aClass346_615);
				int i_43_ = i + anInt8929;
				for (int i_44_ = anInt8942 + i_43_; i_44_ <= i_38_; i_44_ += i_39_) {
					class336_sub1.method3877(0.0F, (byte) -112, (float) anInt8915, (float) anInt8942);
					class336_sub1.method3863(i_43_, i_41_, 0);
					anAbstractToolkit8935.method1266((byte) 112);
					i_43_ += i_39_;
					anAbstractToolkit8935.method1283((byte) -128);
				}
				if (i_38_ > i_43_) {
					int i_45_ = i_38_ + -i_43_;
					class336_sub1_30_.method3877(1.0F, (byte) -112, anInterface13_Impl1_8925.method49((float) anInt8915, (byte) -124), anInterface13_Impl1_8925.method45((float) i_45_, -69));
					anAbstractToolkit8935.method1297(-21029, BufferedConnection.aClass346_615);
					class336_sub1.method3877(0.0F, (byte) -112, (float) anInt8915, (float) i_45_);
					class336_sub1.method3863(i_43_, i_41_, 0);
					anAbstractToolkit8935.method1266((byte) 109);
					anAbstractToolkit8935.method1283((byte) -128);
				}
				i_41_ += i_40_;
			}
			if (i_37_ > i_41_) {
				int i_46_ = -i_41_ + i_37_;
				class336_sub1_30_.method3877(1.0F, (byte) -112, anInterface13_Impl1_8925.method49((float) i_46_, (byte) -119), anInterface13_Impl1_8925.method45((float) anInt8942, 83));
				anAbstractToolkit8935.method1297(-21029, BufferedConnection.aClass346_615);
				int i_47_ = anInt8929 + i;
				int i_48_ = anInt8942 + i_47_;
				while (i_38_ >= i_48_) {
					class336_sub1.method3877(0.0F, (byte) -112, (float) i_46_, (float) anInt8942);
					class336_sub1.method3863(i_47_, i_41_, 0);
					anAbstractToolkit8935.method1266((byte) 109);
					anAbstractToolkit8935.method1283((byte) -128);
					i_48_ += i_39_;
					i_47_ += i_39_;
				}
				if ((i_38_ ^ 0xffffffff) < (i_47_ ^ 0xffffffff)) {
					int i_49_ = -i_47_ + i_38_;
					class336_sub1_30_.method3877(1.0F, (byte) -112, anInterface13_Impl1_8925.method49((float) i_46_, (byte) -30), anInterface13_Impl1_8925.method45((float) i_49_, 108));
					anAbstractToolkit8935.method1297(-21029, BufferedConnection.aClass346_615);
					class336_sub1.method3877(0.0F, (byte) -112, (float) i_46_, (float) i_49_);
					class336_sub1.method3863(i_47_, i_41_, 0);
					anAbstractToolkit8935.method1266((byte) 125);
					anAbstractToolkit8935.method1283((byte) -128);
				}
			}
		} else {
			int i_50_ = i + i_25_;
			int i_51_ = method1197();
			class336_sub1_30_.method3877(1.0F, (byte) -112, anInterface13_Impl1_8925.method49((float) i_26_, (byte) -73), anInterface13_Impl1_8925.method45((float) anInt8942, 110));
			anAbstractToolkit8935.method1297(-21029, BufferedConnection.aClass346_615);
			int i_52_ = i + anInt8929;
			int i_53_ = anInt8942 + i_52_;
			while ((i_53_ ^ 0xffffffff) >= (i_50_ ^ 0xffffffff)) {
				class336_sub1.method3877(0.0F, (byte) -112, (float) i_26_, (float) anInt8942);
				class336_sub1.method3863(i_52_, i_24_, 0);
				anAbstractToolkit8935.method1266((byte) 124);
				i_52_ += i_51_;
				i_53_ += i_51_;
				anAbstractToolkit8935.method1283((byte) -128);
			}
			if ((i_52_ ^ 0xffffffff) > (i_50_ ^ 0xffffffff)) {
				int i_54_ = i_50_ - i_52_;
				class336_sub1_30_.method3877(1.0F, (byte) -112, anInterface13_Impl1_8925.method49((float) i_26_, (byte) -107), anInterface13_Impl1_8925.method45((float) i_54_, -64));
				anAbstractToolkit8935.method1297(-21029, BufferedConnection.aClass346_615);
				class336_sub1.method3877(0.0F, (byte) -112, (float) i_26_, (float) i_54_);
				class336_sub1.method3863(i_52_, i_24_, 0);
				anAbstractToolkit8935.method1266((byte) 110);
				anAbstractToolkit8935.method1283((byte) -128);
			}
		}
		anAbstractToolkit8935.method1255((byte) -12);
		anAbstractToolkit8935.method1304(1, 0, Class200_Sub1.aClass135_5139);
		anAbstractToolkit8935.method1366((byte) -66, Class200_Sub1.aClass135_5139, 1);
	}
	
	final void method1187(int[] is) {
		anInt8937++;
		is[2] = anInt8940;
		is[0] = anInt8929;
		is[3] = anInt8922;
		is[1] = anInt8939;
	}
	
	final int method1186() {
		anInt8924++;
		return anInt8939 + anInt8915 + anInt8922;
	}
	
	static final void method1213(int i, Packet packet) {
		anInt8919++;
		Node_Sub53 node_sub53 = (Node_Sub53) CacheNode_Sub16.aClass312_9600.method3613(65280);
		if (node_sub53 != null) {
			boolean bool = false;
			for (int i_55_ = 0; node_sub53.anInt7658 > i_55_; i_55_++) {
				if (node_sub53.aClass241Array7657[i_55_] != null) {
					if (node_sub53.aClass241Array7657[i_55_].anInt2953 == 2) {
						node_sub53.anIntArray7663[i_55_] = -5;
					}
					if (node_sub53.aClass241Array7657[i_55_].anInt2953 == 0) {
						bool = true;
					}
				}
				if (node_sub53.aClass241Array7664[i_55_] != null) {
					if (node_sub53.aClass241Array7664[i_55_].anInt2953 == 2) {
						node_sub53.anIntArray7663[i_55_] = -6;
					}
					if ((node_sub53.aClass241Array7664[i_55_].anInt2953 ^ 0xffffffff) == -1) {
						bool = true;
					}
				}
			}
			if (!bool) {
				int i_56_ = packet.offset;
				packet.writeInt(node_sub53.anInt7665);
				for (int i_57_ = 0; node_sub53.anInt7658 > i_57_; i_57_++) {
					if (node_sub53.anIntArray7663[i_57_] != 0) {
						packet.writeByte(node_sub53.anIntArray7663[i_57_]);
					} else {
						try {
							int i_58_ = node_sub53.anIntArray7661[i_57_];
							if ((i_58_ ^ 0xffffffff) != -1) {
								if ((i_58_ ^ 0xffffffff) == -2) {
									Field field = (Field) node_sub53.aClass241Array7657[i_57_].anObject2956;
									field.setInt(null, node_sub53.anIntArray7660[i_57_]);
									packet.writeByte(0);
								} else if (i_58_ == 2) {
									Field field = (Field) node_sub53.aClass241Array7657[i_57_].anObject2956;
									int i_59_ = field.getModifiers();
									packet.writeByte(0);
									packet.writeInt(i_59_);
								}
							} else {
								Field field = (Field) node_sub53.aClass241Array7657[i_57_].anObject2956;
								int i_60_ = field.getInt(null);
								packet.writeByte(0);
								packet.writeInt(i_60_);
							}
							if ((i_58_ ^ 0xffffffff) != -4) {
								if ((i_58_ ^ 0xffffffff) == -5) {
									Method method = (Method) node_sub53.aClass241Array7664[i_57_].anObject2956;
									int i_61_ = method.getModifiers();
									packet.writeByte(0);
									packet.writeInt(i_61_);
								}
							} else {
								Method method = (Method) node_sub53.aClass241Array7664[i_57_].anObject2956;
								byte[][] bs = node_sub53.aByteArrayArrayArray7659[i_57_];
								Object[] objects = new Object[bs.length];
								for (int i_62_ = 0; bs.length > i_62_; i_62_++) {
									ObjectInputStream objectinputstream = new ObjectInputStream(new ByteArrayInputStream(bs[i_62_]));
									objects[i_62_] = objectinputstream.readObject();
								}
								Object object = method.invoke(null, objects);
								if (object == null) {
									packet.writeByte(0);
								} else if (!(object instanceof Number)) {
									if (!(object instanceof String)) {
										packet.writeByte(4);
									} else {
										packet.writeByte(2);
										packet.writeString((String) object);
									}
								} else {
									packet.writeByte(1);
									packet.writeLong(((Number) object).longValue());
								}
							}
						} catch (ClassNotFoundException classnotfoundexception) {
							packet.writeByte(-10);
						} catch (java.io.InvalidClassException invalidclassexception) {
							packet.writeByte(-11);
						} catch (java.io.StreamCorruptedException streamcorruptedexception) {
							packet.writeByte(-12);
						} catch (java.io.OptionalDataException optionaldataexception) {
							packet.writeByte(-13);
						} catch (IllegalAccessException illegalaccessexception) {
							packet.writeByte(-14);
						} catch (IllegalArgumentException illegalargumentexception) {
							packet.writeByte(-15);
						} catch (java.lang.reflect.InvocationTargetException invocationtargetexception) {
							packet.writeByte(-16);
						} catch (SecurityException securityexception) {
							packet.writeByte(-17);
						} catch (java.io.IOException ioexception) {
							packet.writeByte(-18);
						} catch (NullPointerException nullpointerexception) {
							packet.writeByte(-19);
						} catch (Exception exception) {
							packet.writeByte(-20);
						} catch (Throwable throwable) {
							packet.writeByte(-21);
						}
					}
				}
				packet.method2190(i_56_, false);
				if (i == -2) {
					node_sub53.method2160((byte) 66);
				}
			}
		}
	}
	
	final void method1184(int i, int i_63_, int i_64_, int i_65_, int i_66_, int i_67_, int i_68_, int i_69_) {
		anInt8930++;
		Class336_Sub1 class336_sub1 = anAbstractToolkit8935.method1264(false);
		Class336_Sub1 class336_sub1_70_ = anAbstractToolkit8935.method1306(7);
		anInterface13_Impl1_8925.method41((byte) -106, aBoolean8936 || aBoolean8941 || (i_69_ & 0x1) == 0 ? Class194.aClass228_2377 : Node_Sub38_Sub5.aClass228_10123);
		anAbstractToolkit8935.method1323((byte) 28);
		anAbstractToolkit8935.method1312((byte) -21, anInterface13_Impl1_8925);
		anAbstractToolkit8935.method1277((byte) 61, i_68_);
		anAbstractToolkit8935.method1278((byte) -12, i_66_);
		anAbstractToolkit8935.method1304(1, 0, InterfaceSettings.aClass135_7421);
		anAbstractToolkit8935.method1366((byte) -100, InterfaceSettings.aClass135_7421, 1);
		anAbstractToolkit8935.method1336(-2, i_67_);
		class336_sub1_70_.method3877(1.0F, (byte) -112, anInterface13_Impl1_8925.method49((float) anInt8915, (byte) -20), anInterface13_Impl1_8925.method45((float) anInt8942, -99));
		if (aBoolean8933) {
			i_64_ = anInt8942 * i_64_ / method1197();
			i_65_ = anInt8915 * i_65_ / method1186();
			i += i_64_ * anInt8929 / anInt8942;
			i_63_ += anInt8939 * i_65_ / anInt8915;
		}
		class336_sub1.method3877(0.0F, (byte) -112, (float) i_65_, (float) i_64_);
		class336_sub1.method3863(i, i_63_, 0);
		anAbstractToolkit8935.method1297(-21029, BufferedConnection.aClass346_615);
		anAbstractToolkit8935.method1266((byte) 111);
		anAbstractToolkit8935.method1283((byte) -128);
		anAbstractToolkit8935.method1255((byte) -12);
		anAbstractToolkit8935.method1304(1, 0, Class200_Sub1.aClass135_5139);
		anAbstractToolkit8935.method1366((byte) -105, Class200_Sub1.aClass135_5139, 1);
	}
	
	public static void method1214(byte b) {
		aClass104_8926 = null;
		if (b <= 102) {
			method1215(-58, -44, -54);
		}
		aClass52_8945 = null;
	}
	
	final void method1190(int i, int i_71_, int i_72_) {
		anInt8923++;
		int[] is = anAbstractToolkit8935.na(i, i_71_, anInt8942, anInt8915);
		int[] is_73_ = new int[anInt8942 * anInt8915];
		anInterface13_Impl1_8925.method43((byte) 64, 0, 0, is_73_, 0, anInt8942, anInt8915);
		if ((i_72_ ^ 0xffffffff) != -1) {
			if (i_72_ == 1) {
				for (int i_74_ = 0; i_74_ < anInt8915; i_74_++) {
					int i_75_ = anInt8942 * i_74_;
					for (int i_76_ = 0; (i_76_ ^ 0xffffffff) > (anInt8942 ^ 0xffffffff); i_76_++)
						is_73_[i_75_ + i_76_] = Node_Sub16.method2590(Node_Sub30.method2723(is[i_75_ - -i_76_], -1962803456) << 16, Node_Sub30.method2723(is_73_[i_76_ + i_75_], 16777215));
				}
			} else if ((i_72_ ^ 0xffffffff) == -3) {
				for (int i_77_ = 0; i_77_ < anInt8915; i_77_++) {
					int i_78_ = anInt8942 * i_77_;
					for (int i_79_ = 0; (i_79_ ^ 0xffffffff) > (anInt8942 ^ 0xffffffff); i_79_++)
						is_73_[i_78_ - -i_79_] = Node_Sub16.method2590(Node_Sub30.method2723(is[i_78_ + i_79_], -1816447489) << 24, Node_Sub30.method2723(16777215, is_73_[i_79_ + i_78_]));
				}
			} else if ((i_72_ ^ 0xffffffff) == -4) {
				for (int i_80_ = 0; (i_80_ ^ 0xffffffff) > (anInt8915 ^ 0xffffffff); i_80_++) {
					int i_81_ = i_80_ * anInt8942;
					for (int i_82_ = 0; (anInt8942 ^ 0xffffffff) < (i_82_ ^ 0xffffffff); i_82_++)
						is_73_[i_82_ + i_81_] = Node_Sub16.method2590(Node_Sub30.method2723(is_73_[i_81_ + i_82_], 16777215), is[i_82_ + i_81_] == 0 ? 0 : -16777216);
				}
			}
		} else {
			for (int i_83_ = 0; i_83_ < anInt8915; i_83_++) {
				int i_84_ = i_83_ * anInt8942;
				for (int i_85_ = 0; i_85_ < anInt8942; i_85_++)
					is_73_[i_85_ + i_84_] = Node_Sub16.method2590(Node_Sub30.method2723(-369164288, is[i_84_ - -i_85_]) << 8, Node_Sub30.method2723(16777215, is_73_[i_84_ - -i_85_]));
			}
		}
		method1212(0, 0, anInt8942, anInt8915, is_73_, 0, anInt8942);
	}
	
	static final boolean method1215(int i, int i_86_, int i_87_) {
		if (i != -30061) {
			method1215(88, -128, -104);
		}
		anInt8917++;
        return !(!((0x70000 & i_87_) != 0 | Class349.method3988((byte) -104, i_86_, i_87_)) && !OutcommingPacket.method3669(i_87_, (byte) 112, i_86_));
    }
	
	final void method1188(float f, float f_88_, float f_89_, float f_90_, float f_91_, float f_92_, int i, aa var_aa, int i_93_, int i_94_) {
		anInt8920++;
		Class336_Sub1 class336_sub1 = anAbstractToolkit8935.method1264(false);
		Class336_Sub1 class336_sub1_95_ = anAbstractToolkit8935.method1306(7);
		aa_Sub2 var_aa_Sub2 = (aa_Sub2) var_aa;
		Interface13_Impl1 interface13_impl1 = var_aa_Sub2.anInterface13_Impl1_5489;
		anInterface13_Impl1_8925.method41((byte) -117, aBoolean8936 || aBoolean8941 || (0x1 & i ^ 0xffffffff) == -1 ? Class194.aClass228_2377 : Node_Sub38_Sub5.aClass228_10123);
		anAbstractToolkit8935.method1323((byte) 28);
		anAbstractToolkit8935.method1312((byte) -21, anInterface13_Impl1_8925);
		anAbstractToolkit8935.method1277((byte) 61, 1);
		anAbstractToolkit8935.method1278((byte) -12, 1);
		if (aBoolean8933) {
			float f_96_ = (float) anInt8942 / (float) method1197();
			float f_97_ = (float) anInt8915 / (float) method1186();
			class336_sub1.method3880(f_97_ * (-f + f_91_), (byte) 118, (f_90_ - f_88_) * f_96_, 1.0F, f_96_ * (f_89_ - f), 0.0F, 0.0F, 0.0F, 0.0F, f_97_ * (-f_88_ + f_92_));
			class336_sub1.method3875(0.0F, (f_88_ + (float) anInt8939) * f_97_, (byte) 103, f_96_ * ((float) anInt8929 + f));
		} else {
			class336_sub1.method3880(f_91_ - f, (byte) 94, -f_88_ + f_90_, 1.0F, -f + f_89_, 0.0F, 0.0F, 0.0F, 0.0F, f_92_ - f_88_);
			class336_sub1.method3875(0.0F, f_88_, (byte) 103, f);
		}
		class336_sub1_95_.method3877(1.0F, (byte) -112, anInterface13_Impl1_8925.method49((float) anInt8915, (byte) -125), anInterface13_Impl1_8925.method45((float) anInt8942, 109));
		anAbstractToolkit8935.method1297(-21029, BufferedConnection.aClass346_615);
		anAbstractToolkit8935.method1362(255, 1);
		anAbstractToolkit8935.method1312((byte) -21, interface13_impl1);
		anAbstractToolkit8935.method1318(-30, Class116.aClass94_5075, Class117_Sub1.aClass94_4924);
		anAbstractToolkit8935.method1304(0, 0, Class200_Sub1.aClass135_5139);
		Class336_Sub1 class336_sub1_98_ = anAbstractToolkit8935.method1306(7);
		class336_sub1_98_.method3857(class336_sub1);
		class336_sub1_98_.method3863(-i_93_, -i_94_, 0);
		class336_sub1_98_.method3889(interface13_impl1.method49(1.0F, (byte) -86), (byte) 111, interface13_impl1.method45(1.0F, -57), 1.0F);
		anAbstractToolkit8935.method1297(-21029, BufferedConnection.aClass346_615);
		anAbstractToolkit8935.method1266((byte) 123);
		anAbstractToolkit8935.method1283((byte) -128);
		anAbstractToolkit8935.method1255((byte) -12);
		anAbstractToolkit8935.method1304(0, 0, Class106.aClass135_1354);
		anAbstractToolkit8935.method1318(-30, Class116.aClass94_5075, Class116.aClass94_5075);
		anAbstractToolkit8935.method1312((byte) -21, null);
		anAbstractToolkit8935.method1362(255, 0);
		anAbstractToolkit8935.method1255((byte) -12);
	}
	
	StandardSprite(AbstractToolkit abstracttoolkit, int i, int i_99_, boolean bool) {
		aBoolean8933 = false;
		anInt8929 = 0;
		anInt8940 = 0;
		anInt8915 = i_99_;
		anInt8942 = i;
		anAbstractToolkit8935 = abstracttoolkit;
		anInterface13_Impl1_8925 = abstracttoolkit.method1291(bool ? Class99.aClass68_1290 : CacheNode_Sub19.aClass68_9621, Class372.aClass372_4594, i_99_, i, -99);
		anInterface13_Impl1_8925.method51(true, true, false);
		aBoolean8936 = (anInterface13_Impl1_8925.method44(19809) ^ 0xffffffff) != (i ^ 0xffffffff);
		aBoolean8941 = (anInterface13_Impl1_8925.method46((byte) 122) ^ 0xffffffff) != (i_99_ ^ 0xffffffff);
		aBoolean8916 = !aBoolean8936 && anInterface13_Impl1_8925.method48(30986);
		aBoolean8944 = !aBoolean8941 && anInterface13_Impl1_8925.method48(30986);
	}
	
	final void method1194(float f, float f_100_, float f_101_, float f_102_, float f_103_, float f_104_, int i, int i_105_, int i_106_, int i_107_) {
		anInt8928++;
		Class336_Sub1 class336_sub1 = anAbstractToolkit8935.method1264(false);
		Class336_Sub1 class336_sub1_108_ = anAbstractToolkit8935.method1306(7);
		anInterface13_Impl1_8925.method41((byte) -124, aBoolean8936 || aBoolean8941 || (i_107_ & 0x1 ^ 0xffffffff) == -1 ? Class194.aClass228_2377 : Node_Sub38_Sub5.aClass228_10123);
		anAbstractToolkit8935.method1323((byte) 28);
		anAbstractToolkit8935.method1312((byte) -21, anInterface13_Impl1_8925);
		anAbstractToolkit8935.method1277((byte) 61, i_106_);
		anAbstractToolkit8935.method1278((byte) -12, i);
		anAbstractToolkit8935.method1304(1, 0, InterfaceSettings.aClass135_7421);
		anAbstractToolkit8935.method1366((byte) 78, InterfaceSettings.aClass135_7421, 1);
		anAbstractToolkit8935.method1336(-2, i_105_);
		if (aBoolean8933) {
			float f_109_ = (float) method1197();
			float f_110_ = (float) method1186();
			float f_111_ = (f_101_ - f) / f_109_;
			float f_112_ = (-f_100_ + f_102_) / f_109_;
			float f_113_ = (f_103_ - f) / f_110_;
			float f_114_ = (f_104_ - f_100_) / f_110_;
			float f_115_ = f_113_ * (float) anInt8939;
			float f_116_ = (float) anInt8939 * f_114_;
			float f_117_ = f_111_ * (float) anInt8929;
			float f_118_ = f_112_ * (float) anInt8929;
			float f_119_ = (float) anInt8940 * -f_111_;
			float f_120_ = -f_112_ * (float) anInt8940;
			float f_121_ = -f_113_ * (float) anInt8922;
			float f_122_ = (float) anInt8922 * -f_114_;
			f = f + f_117_ + f_115_;
			f_103_ = f_103_ + f_117_ + f_121_;
			f_102_ = f_116_ + (f_120_ + f_102_);
			f_100_ = f_116_ + (f_118_ + f_100_);
			f_101_ = f_119_ + f_101_ + f_115_;
			f_104_ = f_104_ + f_118_ + f_122_;
		}
		class336_sub1.method3880(-f + f_103_, (byte) -45, -f_100_ + f_102_, 1.0F, -f + f_101_, 0.0F, 0.0F, 0.0F, 0.0F, -f_100_ + f_104_);
		class336_sub1.method3875(0.0F, f_100_, (byte) 103, f);
		class336_sub1_108_.method3877(1.0F, (byte) -112, anInterface13_Impl1_8925.method49((float) anInt8915, (byte) -78), anInterface13_Impl1_8925.method45((float) anInt8942, 98));
		anAbstractToolkit8935.method1297(-21029, BufferedConnection.aClass346_615);
		anAbstractToolkit8935.method1266((byte) 117);
		anAbstractToolkit8935.method1283((byte) -128);
		anAbstractToolkit8935.method1255((byte) -12);
		anAbstractToolkit8935.method1304(1, 0, Class200_Sub1.aClass135_5139);
		anAbstractToolkit8935.method1366((byte) -62, Class200_Sub1.aClass135_5139, 1);
	}
	
	StandardSprite(AbstractToolkit abstracttoolkit, int i, int i_123_, int[] is, int i_124_, int i_125_) {
		aBoolean8933 = false;
		anInt8929 = 0;
		anInt8940 = 0;
		anInt8942 = i;
		anInt8915 = i_123_;
		anAbstractToolkit8935 = abstracttoolkit;
		anInterface13_Impl1_8925 = abstracttoolkit.method1367(-6331, i, is, i_124_, i_125_, false, i_123_);
		anInterface13_Impl1_8925.method51(true, true, false);
		aBoolean8936 = (anInterface13_Impl1_8925.method44(19809) ^ 0xffffffff) != (i ^ 0xffffffff);
		aBoolean8941 = i_123_ != anInterface13_Impl1_8925.method46((byte) 122);
		aBoolean8916 = !aBoolean8936 && anInterface13_Impl1_8925.method48(30986);
		aBoolean8944 = !aBoolean8941 && anInterface13_Impl1_8925.method48(30986);
	}
}
