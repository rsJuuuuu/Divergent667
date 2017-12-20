/* Class220 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class220 implements Interface14
{
	static int anInt5320;
	static IncommingPacket aClass192_5321 = new IncommingPacket(102, -1);
	static int anInt5322;
	static int anInt5323;
	
	static final void method2097(int i) {
		Class158.aClient1983.method86(i ^ 0x53f8);
		anInt5322++;
		Class320_Sub23.aClass123_8432.method1511((byte) 52);
		Class320_Sub23.aClass123_8432.anInt1578 = 0;
		Node_Sub19.anInt7163 = 0;
		Class320_Sub23.aClass123_8432.aClass192_1573 = null;
		Class320_Sub23.aClass123_8432.aClass192_1582 = null;
		Class320_Sub23.aClass123_8432.aClass192_1574 = null;
		Class320_Sub23.aClass123_8432.aPacket1570.offset = 0;
		Node_Sub38_Sub7.method2806((byte) -1);
		if (i != 19810) {
			method2098(false);
		}
		Class138.anInt1724 = 0;
		Class169_Sub4.aString8830 = null;
		Node_Sub38_Sub14.anInt10242 = 0;
		Class51.aClanChat5345 = null;
		Class66.aClanChat5176 = null;
		Node_Sub38_Sub37.anInt10473 = 0;
		Class50.aClass211Array782 = null;
	}
	
	public static void method2098(boolean bool) {
		if (bool != true) {
			aClass192_5321 = null;
		}
		aClass192_5321 = null;
	}
	
	static final boolean method2099(boolean bool, Class79 class79) {
		anInt5320++;
		if (class79 == null) {
			return false;
		}
		if (bool != true) {
			return true;
		}
		if (!class79.aBoolean1047) {
			return false;
		}
		if (!class79.method784((byte) 111, Class20.anInterface17_317)) {
			return false;
		}
		if (CacheNode_Sub10.aHashTable9530.method1518(3512, (long) class79.anInt1055) != null) {
			return false;
		}
        return IComponentDefinitions.aHashTable4827.method1518(3512, (long) class79.anInt1067) == null;
    }
	
	public final String method52(int i, long l, Class151 class151, int[] is) {
		anInt5323++;
		if (Class216.aClass151_2550 == class151) {
			Class39 class39 = Class328.aClass362_4112.method4051(is[0], -752);
			return class39.method412(i + -3470, (int) l);
		}
		if (i != 0) {
			aClass192_5321 = null;
		}
		if (Node_Sub44.aClass151_7549 == class151 || class151 == Node_Sub39.aClass151_7493) {
			ItemDefinitions itemdefinition = EntityNode_Sub3_Sub1.aClass86_9166.method1010((int) l, 14434);
			return itemdefinition.aString1860;
		}
		if (Class35.aClass151_535 == class151 || Class345.aClass151_4267 == class151 || Class150_Sub1.aClass151_8949 == class151) {
			return Class328.aClass362_4112.method4051(is[0], -752).method412(-3470, (int) l);
		}
		return null;
	}
}
