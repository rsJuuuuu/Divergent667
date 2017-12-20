/* Class82 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class82
{
	protected int anInt1109 = -1;
	static int anInt1110;
	static int anInt1111;
	static volatile long aLong1112 = 0L;
	protected int anInt1113 = -1;
	protected int anInt1114;
	protected int[] anIntArray1115;
	static int anInt1116;
	static int anInt1117;
	static int anInt1118;
	protected int anInt1119 = -1;
	static Class103 aClass103_1120 = new Class103();
	static int anInt1121 = 1408;
	static boolean aBoolean1122;
	static GameStub aGameStub1123 = null;
	
	private final void method794(int i, int i_0_, BufferedStream buffer) {
		anInt1117++;
		if (i_0_ == -12897) {
			if ((i ^ 0xffffffff) != -2) {
				if (i == 2) {
					anIntArray1115 = new int[buffer.readUnsignedByte()];
					for (int i_1_ = 0; i_1_ < anIntArray1115.length; i_1_++)
						anIntArray1115[i_1_] = buffer.readUnsignedShort();
				} else if ((i ^ 0xffffffff) == -4) {
					anInt1113 = buffer.readUnsignedByte();
				} else if ((i ^ 0xffffffff) != -5) {
					if (i == 5) {
						anInt1109 = buffer.readUnsignedShort();
					}
				} else {
					anInt1114 = buffer.readUnsignedByte();
				}
			} else {
				anInt1119 = buffer.readUnsignedShort();
			}
		}
	}
	
	final void method795(byte b, BufferedStream buffer) {
		for (;;) {
			int i = buffer.readUnsignedByte();
			if (i == 0) {
				break;
			}
			method794(i, -12897, buffer);
		}
		anInt1110++;
		@SuppressWarnings("unused")
		int i = -84 % ((48 - b) / 51);
	}
	
	public static void method796(byte b) {
		if (b < -22) {
			aClass103_1120 = null;
		}
	}
	
	static final void method797(GraphicsToolkit graphicstoolkit, int i) {
		anInt1116++;
		int i_2_ = 0;
		int i_3_ = 0;
		if (Class71.aBoolean967) {
			i_2_ = Class67.method733(-115);
			i_3_ = Class226.method2112(256);
		}
		int i_4_ = Node_Sub6.anInt7043 + i_2_;
		int i_5_ = i_3_ + Client.anInt5481;
		int i_6_ = Class362.anInt4492;
		int i_7_ = Class219.anInt2627 + -3;
		int i_8_ = 20;
		Class50.method512(Class362.anInt4492, Class219.anInt2627, Class22.aClass22_387.method297(Class35.language), graphicstoolkit, (byte) -39, i_3_ + Client.anInt5481, Node_Sub6.anInt7043 - -i_2_, i_8_);
		int i_9_ = Class106.aClass93_1356.method1050((byte) -45) - -i_2_;
		if (i == 32712) {
			int i_10_ = i_3_ + Class106.aClass93_1356.method1051(true);
			if (Class194_Sub3_Sub1.aBoolean9375) {
				int i_11_ = 0;
				for (CacheNode_Sub4 cachenode_sub4 = (CacheNode_Sub4) Class184.aClass158_2189.method1723(i + -32699); cachenode_sub4 != null; cachenode_sub4 = (CacheNode_Sub4) Class184.aClass158_2189.method1721(0)) {
					int i_12_ = i_8_ + (i_5_ - -13 - -(16 * i_11_));
					if (i_9_ > i_2_ + Node_Sub6.anInt7043 && (i_9_ ^ 0xffffffff) > (i_2_ + (Node_Sub6.anInt7043 - -Class362.anInt4492) ^ 0xffffffff) && i_10_ > i_12_ - 13 && i_10_ < i_12_ + 4 && (cachenode_sub4.anInt9462 > 1 || ((CacheNode_Sub13) cachenode_sub4.aClass158_9457.aCacheNode1984.aCacheNode7035).aBoolean9571)) {
						graphicstoolkit.aa(i_2_ + Node_Sub6.anInt7043, -12 + i_12_, Class362.anInt4492, 16, 255 + -Class218.anInt2569 << 24 | Class262_Sub5.anInt7737, 1);
					}
					i_11_++;
				}
				if (Class73.aCacheNode_Sub4_988 != null) {
					Class50.method512(CacheNode.anInt7033, Class18.anInt309, Class73.aCacheNode_Sub4_988.aString9458, graphicstoolkit, (byte) -39, ReferenceTable.anInt286, Class367.anInt4539, i_8_);
					i_11_ = 0;
					for (CacheNode_Sub13 cachenode_sub13 = (CacheNode_Sub13) Class73.aCacheNode_Sub4_988.aClass158_9457.method1723(i ^ 0x7fc5); cachenode_sub13 != null; cachenode_sub13 = (CacheNode_Sub13) Class73.aCacheNode_Sub4_988.aClass158_9457.method1721(i ^ 0x7fc8)) {
						int i_13_ = i_8_ + (ReferenceTable.anInt286 - -13 - -(i_11_ * 16));
						if (Class367.anInt4539 < i_9_ && Class367.anInt4539 + CacheNode.anInt7033 > i_9_ && i_10_ > i_13_ + -13 && (i_10_ ^ 0xffffffff) > (4 + i_13_ ^ 0xffffffff) && cachenode_sub13.aBoolean9571) {
							graphicstoolkit.aa(Class367.anInt4539, i_13_ - 12, CacheNode.anInt7033, 16, 255 - Class218.anInt2569 << 24 | Class262_Sub5.anInt7737, 1);
						}
						i_11_++;
					}
					Node_Sub23.method2622(ReferenceTable.anInt286, graphicstoolkit, Class367.anInt4539, CacheNode.anInt7033, i_8_, (byte) -77, Class18.anInt309);
				}
			} else {
				int i_14_ = 0;
				for (CacheNode_Sub13 cachenode_sub13 = (CacheNode_Sub13) Class368.aClass312_4549.method3613(65280); cachenode_sub13 != null; cachenode_sub13 = (CacheNode_Sub13) Class368.aClass312_4549.method3620(16776960)) {
					int i_15_ = 16 * (-1 + Class315.anInt4035 + -i_14_) + i_5_ + (i_8_ + 13);
					i_14_++;
					if (i_2_ + Node_Sub6.anInt7043 < i_9_ && i_2_ + (Node_Sub6.anInt7043 + Class362.anInt4492) > i_9_ && (i_10_ ^ 0xffffffff) < (i_15_ - 13 ^ 0xffffffff) && 4 + i_15_ > i_10_ && cachenode_sub13.aBoolean9571) {
						graphicstoolkit.aa(i_2_ + Node_Sub6.anInt7043, -12 + i_15_, Class362.anInt4492, 16, Class262_Sub5.anInt7737 | -Class218.anInt2569 + 255 << 24, 1);
					}
				}
			}
			Node_Sub23.method2622(i_3_ + Client.anInt5481, graphicstoolkit, Node_Sub6.anInt7043 + i_2_, Class362.anInt4492, i_8_, (byte) -77, Class219.anInt2627);
			if (!Class194_Sub3_Sub1.aBoolean9375) {
				int i_16_ = 0;
				for (CacheNode_Sub13 cachenode_sub13 = (CacheNode_Sub13) Class368.aClass312_4549.method3613(65280); cachenode_sub13 != null; cachenode_sub13 = (CacheNode_Sub13) Class368.aClass312_4549.method3620(16776960)) {
					int i_17_ = 13 + i_5_ - -i_8_ - -((-i_16_ + -1 + Class315.anInt4035) * 16);
					i_16_++;
					IComponentDefinitions.method4139(graphicstoolkit, i_6_, i_7_, i_5_, i_17_, Class340.anInt4209 | ~0xffffff, cachenode_sub13, ~0xffffff | Class320_Sub26.anInt8451, i_10_, i_4_, i_9_, -4392);
				}
			} else {
				int i_18_ = 0;
				for (CacheNode_Sub4 cachenode_sub4 = (CacheNode_Sub4) Class184.aClass158_2189.method1723(13); cachenode_sub4 != null; cachenode_sub4 = (CacheNode_Sub4) Class184.aClass158_2189.method1721(0)) {
					int i_19_ = i_18_ * 16 + (13 + i_8_ + (i_3_ + Client.anInt5481));
					if (cachenode_sub4.anInt9462 != 1) {
						Node_Sub40.method2924(i_10_, Class362.anInt4492, i_19_, -9330, ~0xffffff | Class340.anInt4209, graphicstoolkit, i_9_, ~0xffffff | Class320_Sub26.anInt8451, i_3_ + Client.anInt5481, i_2_ + Node_Sub6.anInt7043, Class219.anInt2627, cachenode_sub4);
					} else {
						IComponentDefinitions.method4139(graphicstoolkit, Class362.anInt4492, Class219.anInt2627, Client.anInt5481 + i_3_, i_19_, Class340.anInt4209 | ~0xffffff, (CacheNode_Sub13) cachenode_sub4.aClass158_9457.aCacheNode1984.aCacheNode7035, ~0xffffff | Class320_Sub26.anInt8451, i_10_, Node_Sub6.anInt7043 + i_2_, i_9_, -4392);
					}
					i_18_++;
				}
				if (Class73.aCacheNode_Sub4_988 != null) {
					i_18_ = 0;
					for (CacheNode_Sub13 cachenode_sub13 = (CacheNode_Sub13) Class73.aCacheNode_Sub4_988.aClass158_9457.method1723(13); cachenode_sub13 != null; cachenode_sub13 = (CacheNode_Sub13) Class73.aCacheNode_Sub4_988.aClass158_9457.method1721(0)) {
						int i_20_ = i_8_ + ReferenceTable.anInt286 + (13 - -(16 * i_18_));
						IComponentDefinitions.method4139(graphicstoolkit, CacheNode.anInt7033, Class18.anInt309, ReferenceTable.anInt286, i_20_, Class340.anInt4209 | ~0xffffff, cachenode_sub13, ~0xffffff | Class320_Sub26.anInt8451, i_10_, Class367.anInt4539, i_9_, -4392);
						i_18_++;
					}
					Class226.method2114(Class367.anInt4539, ReferenceTable.anInt286, CacheNode.anInt7033, Class18.anInt309, -126);
				}
			}
			Class226.method2114(Node_Sub6.anInt7043 + i_2_, Client.anInt5481 - -i_3_, Class362.anInt4492, Class219.anInt2627, -128);
		}
	}
	
	static final void method798(int i) {
		anInt1118++;
		Class105.aClass61_5202.method602((byte) -118);
		if (i != -1) {
			method797(null, 37);
		}
	}
	
	public Class82() {
		anInt1114 = 0;
	}
	
	static {
		aBoolean1122 = false;
	}
}
