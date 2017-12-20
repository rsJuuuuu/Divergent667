/* Class86 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class86
{
	static int anInt1160;
	protected int anInt1161;
	private boolean aBoolean1162;
	static IncommingPacket aClass192_1163 = new IncommingPacket(3, 12);
	private Class353 aClass353_1164;
	static int anInt1165;
	static int anInt1166;
	static int anInt1167;
	protected Index aClass302_1168;
	static int anInt1169;
	static int anInt1170;
	static int anInt1171;
	static int anInt1172;
	private Index index19;
	private Class61 aClass61_1174 = new Class61(64);
	protected int anInt1175;
	protected Class61 aClass61_1176 = new Class61(50);
	static int anInt1177;
	static int anInt1178;
	protected Class12 aClass12_1179 = new Class12(250);
	private Class296 aClass296_1180 = new Class296();
	protected int anInt1181;
	private Class36 aClass36_1182;
	private String[] aStringArray1183;
	private String[] aStringArray1184;
	private Index index37;
	
	final void method1000(byte b) {
		anInt1177++;
		synchronized (aClass61_1174) {
			aClass61_1174.method608(false);
		}
		synchronized (aClass61_1176) {
			@SuppressWarnings("unused")
			int i = -18 / ((64 - b) / 39);
			aClass61_1176.method608(false);
		}
		synchronized (aClass12_1179) {
			aClass12_1179.method196(false);
		}
	}
	
	public static void method1001(int i) {
		if (i != 32) {
			aClass192_1163 = null;
		}
		aClass192_1163 = null;
	}
	
	final GLSprite method1002(int i, GraphicsToolkit graphicstoolkit, GraphicsToolkit graphicstoolkit_0_, PlayerDefinition playerdefinition, boolean bool, int i_1_, int i_2_, boolean bool_3_, int i_4_, Class52 class52, int i_5_, int i_6_) {
		if (i_6_ != -16139) {
			aClass61_1176 = null;
		}
		anInt1166++;
		GLSprite glsprite = method1007(playerdefinition, (byte) 18, graphicstoolkit_0_, i_4_, i_5_, i, i_2_, i_1_);
		if (glsprite != null) {
			return glsprite;
		}
		ItemDefinitions itemdefinition = method1010(i_5_, 14434);
		if (i_2_ > 1 && itemdefinition.anIntArray1918 != null) {
			int i_7_ = -1;
			for (int i_8_ = 0; i_8_ < 10; i_8_++) {
				if ((itemdefinition.anIntArray1872[i_8_] ^ 0xffffffff) >= (i_2_ ^ 0xffffffff) && itemdefinition.anIntArray1872[i_8_] != 0) {
					i_7_ = itemdefinition.anIntArray1918[i_8_];
				}
			}
			if (i_7_ != -1) {
				itemdefinition = method1010(i_7_, 14434);
			}
		}
		int[] is = itemdefinition.method1682(i_4_, graphicstoolkit_0_, i_2_, (byte) 40, i_1_, bool_3_, playerdefinition, graphicstoolkit, class52, i);
		if (is == null) {
			return null;
		}
		GLSprite glsprite_9_;
		if (!bool) {
			glsprite_9_ = graphicstoolkit_0_.method1235(36, 36, 32, is, 0, i_6_ ^ ~0x2226);
		} else {
			glsprite_9_ = graphicstoolkit.method1235(36, 36, 32, is, 0, 7468);
		}
		if (!bool) {
			Class296 class296 = new Class296();
			class296.anInt5434 = i_4_;
			class296.aBoolean5440 = playerdefinition != null;
			class296.anInt5431 = graphicstoolkit_0_.anInt1537;
			class296.anInt5427 = i_2_;
			class296.anInt5433 = i;
			class296.anInt5432 = i_5_;
			class296.anInt5435 = i_1_;
			aClass12_1179.method205(glsprite_9_, 0, class296);
		}
		return glsprite_9_;
	}
	
	final void method1003(int i, int i_10_) {
		if (i != 250) {
			aClass12_1179 = null;
		}
		anInt1169++;
		synchronized (aClass61_1174) {
			aClass61_1174.method598(i_10_, -11819);
		}
		synchronized (aClass61_1176) {
			aClass61_1176.method598(i_10_, i + -12069);
		}
		synchronized (aClass12_1179) {
			aClass12_1179.method199(false, i_10_);
		}
	}
	
	final void method1004(byte b) {
		anInt1160++;
		synchronized (aClass61_1174) {
			aClass61_1174.method602((byte) -126);
		}
		if (b < 65) {
			method1004((byte) -25);
		}
		synchronized (aClass61_1176) {
			aClass61_1176.method602((byte) -124);
		}
		synchronized (aClass12_1179) {
			aClass12_1179.method197((byte) 46);
		}
	}
	
	final void method1005(int i, int i_11_) {
		anInt1181 = i;
		anInt1178++;
		if (i_11_ > -20) {
			method1004((byte) -108);
		}
		synchronized (aClass61_1176) {
			aClass61_1176.method608(false);
		}
	}
	
	final void method1006(int i) {
		synchronized (aClass61_1176) {
			if (i != -1) {
				aClass61_1174 = null;
			}
			aClass61_1176.method608(false);
		}
		anInt1172++;
	}
	
	final GLSprite method1007(PlayerDefinition playerdefinition, byte b, GraphicsToolkit graphicstoolkit, int i, int i_12_, int i_13_, int i_14_, int i_15_) {
		aClass296_1180.anInt5427 = i_14_;
		aClass296_1180.anInt5431 = graphicstoolkit.anInt1537;
		if (b < 8) {
			method1000((byte) -95);
		}
		aClass296_1180.anInt5434 = i;
		anInt1165++;
		aClass296_1180.anInt5435 = i_15_;
		aClass296_1180.aBoolean5440 = playerdefinition != null;
		aClass296_1180.anInt5433 = i_13_;
		aClass296_1180.anInt5432 = i_12_;
		return (GLSprite) aClass12_1179.method204(aClass296_1180, (byte) -119);
	}
	
	final void method1008(int i) {
		anInt1170++;
		synchronized (aClass12_1179) {
			aClass12_1179.method196(false);
		}
		if (i != 50) {
			aClass61_1176 = null;
		}
	}
	
	final void method1009(byte b, boolean bool) {
		anInt1167++;
		if (aBoolean1162 == !bool) {
			aBoolean1162 = bool;
			if (b <= 57) {
				aStringArray1184 = null;
			}
			method1000((byte) -72);
		}
	}
	
	public static boolean OLD_ITEMS = true;
	
	final ItemDefinitions method1010(int i, int i_16_) {
		if (i_16_ != 14434) {
			method1006(-81);
		}
		anInt1171++;
		ItemDefinitions itemdefinition;
		synchronized (aClass61_1174) {
			itemdefinition = (ItemDefinitions) aClass61_1174.method607((long) i, i_16_ + -14434);
		}
		if (itemdefinition != null) {
			return itemdefinition;
		}
		byte[] bs = null;
		if(OLD_ITEMS && index37 != null)
			synchronized (index37) {
				bs = index37.method3524(false, Animator.method236(false, i), Node_Sub29_Sub2.method2716(0, i));
				//System.out.println(i+", "+bs);
			}
		if(bs == null)
			synchronized (index19) {
				bs = index19.method3524(false, Animator.method236(false, i), Node_Sub29_Sub2.method2716(0, i));
			}
		itemdefinition = new ItemDefinitions();
		itemdefinition.anInt1914 = i;
		itemdefinition.aClass86_1868 = this;
		itemdefinition.aStringArray1920 = aStringArray1184.clone();
		itemdefinition.aStringArray1901 = aStringArray1183.clone();
		if (bs != null) {
			itemdefinition.method1675(new BufferedStream(bs), (byte) 122);
		}
		itemdefinition.method1691((byte) 106);
		if (itemdefinition.anInt1857 != -1) {
			itemdefinition.method1677(method1010(itemdefinition.anInt1857, 14434), 45, method1010(itemdefinition.anInt1887, 14434));
		}
		if ((itemdefinition.anInt1852 ^ 0xffffffff) != 0) {
			itemdefinition.method1676((byte) 103, method1010(itemdefinition.anInt1927, 14434), method1010(itemdefinition.anInt1852, 14434));
		}
		if ((itemdefinition.anInt1928 ^ 0xffffffff) != 0) {
			itemdefinition.method1693(method1010(itemdefinition.anInt1928, i_16_), (byte) -121, method1010(itemdefinition.anInt1891, i_16_));
		}
		if (!aBoolean1162 && itemdefinition.aBoolean1871) {
			itemdefinition.aString1860 = Class22.aClass22_368.method297(anInt1161);
			itemdefinition.aStringArray1920 = aStringArray1184;
			itemdefinition.aStringArray1901 = aStringArray1183;
			itemdefinition.anIntArray1926 = null;
			itemdefinition.anInt1899 = 0;
			itemdefinition.aBoolean1933 = false;
			if (itemdefinition.aHashTable1873 != null) {
				boolean bool = false;
				for (Node node = itemdefinition.aHashTable1873.method1516(false); node != null; node = itemdefinition.aHashTable1873.method1520(85)) {
					Class267 class267 = aClass36_1182.method394((int) node.aLong2797, -119);
					if (class267.aBoolean3442) {
						node.method2160((byte) 99);
					} else {
						bool = true;
					}
				}
				if (!bool) {
					itemdefinition.aHashTable1873 = null;
				}
			}
		}
		synchronized (aClass61_1174) {
			aClass61_1174.method601(itemdefinition, 25566, (long) i);
		}
		return itemdefinition;
	}
	
	Class86(Class353 class353, int i, boolean bool, Class36 class36, Index class302, Index class302_17_, Index index37) {
		anInt1161 = i;
		aClass353_1164 = class353;
		aClass302_1168 = class302_17_;
		aClass36_1182 = class36;
		index19 = class302;
		this.index37 = index37;
		aBoolean1162 = bool;
		if (index19 != null) {
			int i_18_ = index19.method3526(-20871) - 1;
			anInt1175 = index19.method3537(-2, i_18_) + i_18_ * 256;
		} else {
			anInt1175 = 0;
		}
		if (aClass353_1164 != Node_Sub38_Sub34.aClass353_10443) {
			aStringArray1184 = new String[] { null, null, Class22.aClass22_371.method297(anInt1161), null, null, null };
		} else {
			aStringArray1184 = new String[] { null, null, Class22.aClass22_371.method297(anInt1161), null, null, Class22.aClass22_385.method297(anInt1161) };
		}
		aStringArray1183 = new String[] { null, null, null, null, Class22.aClass22_372.method297(anInt1161) };
	}
}
