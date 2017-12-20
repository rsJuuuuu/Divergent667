/* Class117_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class117_Sub1 extends Class117 implements Interface1
{
	static int anInt4923;
	static Class94 aClass94_4924 = new Class94();
	static int anInt4925;
	private int anInt4926;
	static int anInt4927;
	static int anInt4928;
	static int anInt4929;
	static int anInt4930;
	static String aString4931;
	static OutcommingPacket aClass318_4932 = new OutcommingPacket(0, 9);
	/*synthetic*/ static Class<?> aClass4933;
	
	public static void method1169(byte b) {
		aString4931 = null;
		aClass94_4924 = null;
		aClass318_4932 = null;
		if (b < 63) {
			method1169((byte) -123);
		}
	}
	
	Class117_Sub1(GLToolkit gltoolkit, int i, byte[] bs, int i_0_, boolean bool) {
		super(gltoolkit, 34963, bs, i_0_, bool);
		anInt4926 = i;
	}
	
	public final void method4(int i, int i_1_, byte[] bs, int i_2_) {
		this.method1165((byte) 108, i_1_, bs);
		if (i_2_ != 2712) {
			aClass94_4924 = null;
		}
		anInt4925++;
		anInt4926 = i;
	}
	
	public final int method3(byte b) {
		if (b > -61) {
			aString4931 = null;
		}
		anInt4928++;
		return anInt4926;
	}
	
	public final int method2(int i) {
		if (i != 15758) {
			method4(45, -111, null, -75);
		}
		anInt4923++;
		return anInt1476;
	}
	
	static final void method1170(GraphicsToolkit graphicstoolkit, int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_) {
		anInt4927++;
		Interface19 interface19 = (Interface19) Node_Sub38_Sub12.method2830(i_8_, i_3_, i_4_);
		if (interface19 != null) {
			ObjectDefinition objectdefinition = Class186.aClass112_2256.method1145(interface19.method72(-32136), i_7_ ^ 0x12fe);
			int i_10_ = interface19.method68(23796) & 0x3;
			int i_11_ = interface19.method71(-127);
			if (objectdefinition.anInt3006 != -1) {
				CacheNode_Sub12.method2343(objectdefinition, (byte) 106, i_10_, graphicstoolkit, i_5_, i_6_);
			} else {
				int i_12_ = i;
				if (objectdefinition.anInt3057 > 0) {
					i_12_ = i_9_;
				}
				if ((i_11_ ^ 0xffffffff) == -1 || (i_11_ ^ 0xffffffff) == -3) {
					if (i_10_ == 0) {
						graphicstoolkit.method1243(4, i_6_, i_12_, i_5_, 2);
					} else if (i_10_ == 1) {
						graphicstoolkit.method1242(i_6_, i_12_, i_5_, false, 4);
					} else if ((i_10_ ^ 0xffffffff) == -3) {
						graphicstoolkit.method1243(4, i_6_, i_12_, i_5_ - -3, 2);
					} else if (i_10_ == 3) {
						graphicstoolkit.method1242(3 + i_6_, i_12_, i_5_, false, 4);
					}
				}
				if (i_11_ == 3) {
					if ((i_10_ ^ 0xffffffff) == -1) {
						graphicstoolkit.method1239(1, 1, i_6_, (byte) 116, i_5_, i_12_);
					} else if (i_10_ == 1) {
						graphicstoolkit.method1239(1, 1, i_6_, (byte) 116, 3 + i_5_, i_12_);
					} else if ((i_10_ ^ 0xffffffff) != -3) {
						if (i_10_ == 3) {
							graphicstoolkit.method1239(1, 1, i_6_ + 3, (byte) 116, i_5_, i_12_);
						}
					} else {
						graphicstoolkit.method1239(1, 1, i_6_ - -3, (byte) 116, i_5_ + 3, i_12_);
					}
				}
				if ((i_11_ ^ 0xffffffff) == -3) {
					if (i_10_ != 0) {
						if ((i_10_ ^ 0xffffffff) != -2) {
							if (i_10_ != 2) {
								if ((i_10_ ^ 0xffffffff) == -4) {
									graphicstoolkit.method1243(4, i_6_, i_12_, i_5_, 2);
								}
							} else {
								graphicstoolkit.method1242(3 + i_6_, i_12_, i_5_, false, 4);
							}
						} else {
							graphicstoolkit.method1243(4, i_6_, i_12_, 3 + i_5_, 2);
						}
					} else {
						graphicstoolkit.method1242(i_6_, i_12_, i_5_, false, 4);
					}
				}
			}
		}
		if (i_7_ != 4827) {
			method1170(null, 111, 50, -87, -109, -124, -97, 118, 120);
		}
		interface19 = (Interface19) Class262_Sub20.method3203(i_8_, i_3_, i_4_, aClass4933 == null ? aClass4933 = method1171("Interface19") : aClass4933);
		if (interface19 != null) {
			ObjectDefinition objectdefinition = Class186.aClass112_2256.method1145(interface19.method72(-32136), 61);
			int i_13_ = interface19.method68(23796) & 0x3;
			int i_14_ = interface19.method71(-122);
			if (objectdefinition.anInt3006 != -1) {
				CacheNode_Sub12.method2343(objectdefinition, (byte) 115, i_13_, graphicstoolkit, i_5_, i_6_);
			} else if ((i_14_ ^ 0xffffffff) == -10) {
				int i_15_ = -1118482;
				if (objectdefinition.anInt3057 > 0) {
					i_15_ = -1179648;
				}
				if (i_13_ != 0 && i_13_ != 2) {
					graphicstoolkit.method1236(i_6_ - -3, i_6_, i_5_ + 3, i_15_, 1, i_5_);
				} else {
					graphicstoolkit.method1236(i_6_, i_6_ + 3, i_5_ + 3, i_15_, 1, i_5_);
				}
			}
		}
		interface19 = (Interface19) Class270_Sub1_Sub1.method3303(i_8_, i_3_, i_4_);
		if (interface19 != null) {
			ObjectDefinition objectdefinition = Class186.aClass112_2256.method1145(interface19.method72(i_7_ ^ ~0x6f5c), 106);
			int i_16_ = interface19.method68(23796) & 0x3;
			if ((objectdefinition.anInt3006 ^ 0xffffffff) != 0) {
				CacheNode_Sub12.method2343(objectdefinition, (byte) 89, i_16_, graphicstoolkit, i_5_, i_6_);
			}
		}
	}
	
	final void method1167(int i) {
		aGLToolkit1474.method1445(-30197, this);
		if (i != -20931) {
			aClass94_4924 = null;
		}
		anInt4929++;
	}
	
	public final long method1(int i) {
		anInt4930++;
		if (i != 32711) {
			return -91L;
		}
		return 0L;
	}
	
	/*synthetic*/ static Class<?> method1171(String string) {
		Class<?> var_class;
		try {
			var_class = Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw (NoClassDefFoundError) new NoClassDefFoundError().initCause(classnotfoundexception);
		}
		return var_class;
	}
}
