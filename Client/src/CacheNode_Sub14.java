/* CacheNode_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class CacheNode_Sub14 extends CacheNode
{
	static int anInt9573;
	protected int anInt9574;
	static int[] anIntArray9575 = { 28, 35, 40, 44 };
	protected Interface18 anInterface18_9576;
	static int anInt9577;
	
	public static void method2346(int i) {
		anIntArray9575 = null;
	}
	
	abstract Object method2347(int i);
	
	static final void method2348(int i, int i_1_, int i_2_, ObjectDefinition objectdefinition, int i_3_) {
		anInt9577++;
		for (Node_Sub47 node_sub47 = (Node_Sub47) Class290_Sub6.aClass312_8122.method3613(65280); node_sub47 != null; node_sub47 = (Node_Sub47) Class290_Sub6.aClass312_8122.method3620(16776960)) {
			if (node_sub47.anInt7560 == i_2_ && node_sub47.anInt7569 == i << 9 && (node_sub47.anInt7563 ^ 0xffffffff) == (i_1_ << 9 ^ 0xffffffff) && (objectdefinition.objectId ^ 0xffffffff) == (node_sub47.anObjectDefinition7562.objectId ^ 0xffffffff)) {
				if (node_sub47.aNode_Sub9_Sub2_7568 != null) {
					Class176.aNode_Sub9_Sub3_2106.method2514(node_sub47.aNode_Sub9_Sub2_7568);
					node_sub47.aNode_Sub9_Sub2_7568 = null;
				}
				if (node_sub47.aNode_Sub9_Sub2_7556 != null) {
					Class176.aNode_Sub9_Sub3_2106.method2514(node_sub47.aNode_Sub9_Sub2_7556);
					node_sub47.aNode_Sub9_Sub2_7556 = null;
				}
				node_sub47.method2160((byte) 98);
				break;
			}
		}
	}
	
	static final void method2349(byte b) {
		anInt9573++;
		if (b != 5) {
			anIntArray9575 = null;
		}
		if ((Class290_Sub4.anInt8100 ^ 0xffffffff) <= -1) {
			long l = Class313.method3650(false);
			Class290_Sub4.anInt8100 -= -Class181.aLong2157 + l;
			if (Class290_Sub4.anInt8100 > 0) {
				int i = (Class290_Sub4.anInt8100 << 8) / Class312.anInt3955;
				int i_5_ = -i + 255;
				float f = (float) i / 255.0F;
				float f_6_ = -f + 1.0F;
				Class320_Sub20.anInt8402 = (~0xff00ff & i_5_ * (0xff00ff & Class20_Sub1.aClass343_5509.anInt4253) + (0xff00ff & Class188_Sub2_Sub2.anInt9360) * i) - -(i * (0xff00 & Class188_Sub2_Sub2.anInt9360) - -(i_5_ * (0xff00 & Class20_Sub1.aClass343_5509.anInt4253)) & 0xff0000) >>> 8;
				Node_Sub25.aFloat7236 = Class329.aFloat4117 + (-Class329.aFloat4117 + Class20_Sub1.aClass343_5509.aFloat4254) * f_6_;
				CacheNode_Sub16_Sub2.aFloat11082 = f_6_ * (-CacheNode_Sub17.aFloat8847 + Class20_Sub1.aClass343_5509.aFloat4256) + CacheNode_Sub17.aFloat8847;
				Node_Sub12.anInt5455 = Node_Sub52.anInt7644 * i - -(Class20_Sub1.aClass343_5509.anInt4258 * i_5_) >> 8;
				Class363.aFloat4502 = (Class20_Sub1.aClass343_5509.aFloat4250 - Class357.aFloat4439) * f_6_ + Class357.aFloat4439;
				Animable.aFloat5932 = Animable_Sub3_Sub1.aFloat11014 + (-Animable_Sub3_Sub1.aFloat11014 + Class20_Sub1.aClass343_5509.aFloat4251) * f_6_;
				Class138.anInt1726 = (i_5_ * (0xff00ff & Class20_Sub1.aClass343_5509.anInt4257) + (0xff00ff & Class191.anInt2353) * i & ~0xff00ff) + (0xff0000 & i * (0xff00 & Class191.anInt2353) + (0xff00 & Class20_Sub1.aClass343_5509.anInt4257) * i_5_) >>> 8;
				Class69.aFloat944 = Class284.aFloat3597 + (Class20_Sub1.aClass343_5509.aFloat4244 - Class284.aFloat3597) * f_6_;
				Class39.aFloat580 = f_6_ * (-Class113.aFloat1439 + Class20_Sub1.aClass343_5509.aFloat4239) + Class113.aFloat1439;
				if (Class44.aClass270_669 != Class20_Sub1.aClass343_5509.aClass270_4240) {
					Class229.aClass270_2733 = Class229.aGraphicsToolkit2732.a(Class44.aClass270_669, Class20_Sub1.aClass343_5509.aClass270_4240, f_6_, Class229.aClass270_2733);
				}
				if (Class20_Sub1.aClass343_5509.aClass119_4238 != Class44.aClass119_670) {
					if (Class44.aClass119_670 != null) {
						Class245.aClass119_3085 = Class44.aClass119_670;
						if (Class245.aClass119_3085 != null) {
							Class245.aClass119_3085.method1217(255, i_5_, (byte) 85);
						}
					} else {
						Class245.aClass119_3085 = Class20_Sub1.aClass343_5509.aClass119_4238;
						if (Class245.aClass119_3085 != null) {
							Class245.aClass119_3085.method1217(0, i_5_, (byte) -127);
						}
					}
				}
			} else {
				Class320_Sub20.anInt8402 = Class20_Sub1.aClass343_5509.anInt4253;
				Animable.aFloat5932 = Class20_Sub1.aClass343_5509.aFloat4251;
				Node_Sub25.aFloat7236 = Class20_Sub1.aClass343_5509.aFloat4254;
				Class69.aFloat944 = Class20_Sub1.aClass343_5509.aFloat4244;
				Class363.aFloat4502 = Class20_Sub1.aClass343_5509.aFloat4250;
				Class229.aClass270_2733 = Class20_Sub1.aClass343_5509.aClass270_4240;
				Node_Sub12.anInt5455 = Class20_Sub1.aClass343_5509.anInt4258;
				Class138.anInt1726 = Class20_Sub1.aClass343_5509.anInt4257;
				CacheNode_Sub16_Sub2.aFloat11082 = Class20_Sub1.aClass343_5509.aFloat4256;
				Class39.aFloat580 = Class20_Sub1.aClass343_5509.aFloat4239;
				if (Class245.aClass119_3085 != null) {
					Class245.aClass119_3085.method1226(2);
				}
				Class290_Sub4.anInt8100 = -1;
				Class245.aClass119_3085 = Class20_Sub1.aClass343_5509.aClass119_4238;
			}
			Class181.aLong2157 = l;
		}
	}
	
	CacheNode_Sub14(Interface18 interface18, int i) {
		anInt9574 = i;
		anInterface18_9576 = interface18;
	}
	
	abstract boolean method2350(byte b);
}
