/* Class295 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class295
{
	protected String aString3691;
	static Player myPlayer;
	static int anInt3693;
	protected String aString3694;
	static Class343 aClass343_3695;
	static int anInt3696;
	protected String aString3697;
	static int anInt3698;
	static int anInt3699;
	static int anInt3700;
	
	static final IComponentDefinitions method3468(byte b, IComponentDefinitions widget) {
		anInt3699++;
		if ((widget.parentId ^ 0xffffffff) != 0) {
			return Class76.method771((byte) 107, widget.parentId);
		}
		if (b >= -92) {
			return null;
		}
		int i = widget.ihash >>> 16;
		Class303 class303 = new Class303(Class289.aHashTable3630);
		for (Node_Sub2 node_sub2 = (Node_Sub2) class303.method3542(true); node_sub2 != null; node_sub2 = (Node_Sub2) class303.method3539(0)) {
			if ((node_sub2.interfaceId ^ 0xffffffff) == (i ^ 0xffffffff)) {
				return Class76.method771((byte) 107, (int) node_sub2.aLong2797);
			}
		}
		return null;
	}
	
	static final void method3469(int i, byte b) {
		Class362.anIntArray4497 = new int[i];
		Class84.anIntArray1147 = new int[i];
		MainFile.anIntArray135 = new int[i];
		if (b < -122) {
			anInt3700++;
			Class259.anIntArray3296 = new int[i];
			Class246.anIntArray3107 = new int[i];
		}
	}
	
	static final void method3470(GraphicsToolkit graphicstoolkit, int i) {
		anInt3696++;
		if (((Class315.anInt4035 ^ 0xffffffff) <= -3 || Class87.removeWalkHere) && Class58.aWidget861 == null) {
			String string;
			if (!Class87.removeWalkHere || (Class315.anInt4035 ^ 0xffffffff) <= -3) {
				if (!Class116.aBoolean5072 || !Class175.aClass291_2100.method3450(-46, 81) || Class315.anInt4035 <= 2) {
					CacheNode_Sub13 cachenode_sub13 = Node_Sub38_Sub23.aCacheNode_Sub13_10343;
					if (cachenode_sub13 == null) {
						return;
					}
					string = Mobile.method844(cachenode_sub13, (byte) 127);
					int[] is = null;
					if (!Class134.method1574(false, cachenode_sub13.anInt9562)) {
						if ((cachenode_sub13.anInt9569 ^ 0xffffffff) == 0) {
							if (OutcommingPacket.method3666(cachenode_sub13.anInt9562, (byte) 109)) {
								Node_Sub41 node_sub41 = (Node_Sub41) Class12.aHashTable187.method1518(3512, (long) (int) cachenode_sub13.aLong9563);
								if (node_sub41 != null) {
									Npc npc = node_sub41.aNpc7518;
									NpcDefinition npcdefinition = npc.aNpcDefinition11122;
									if (npcdefinition.anIntArray2827 != null) {
										npcdefinition = npcdefinition.method2999(65535, Class24.aClass275_442);
									}
									if (npcdefinition != null) {
										is = npcdefinition.anIntArray2832;
									}
								}
							} else if (Class194_Sub3.method1973(cachenode_sub13.anInt9562, 31922)) {
								ObjectDefinition objectdefinition = Class186.aClass112_2256.method1145((int) (0x7fffffffL & cachenode_sub13.aLong9563 >>> 32), 68);
								if (objectdefinition.anIntArray2984 != null) {
									objectdefinition = objectdefinition.method3038(13, Class24.aClass275_442);
								}
								if (objectdefinition != null) {
									is = objectdefinition.anIntArray2981;
								}
							}
						} else {
							is = EntityNode_Sub3_Sub1.aClass86_9166.method1010(cachenode_sub13.anInt9569, 14434).anIntArray1926;
						}
					} else {
						is = EntityNode_Sub3_Sub1.aClass86_9166.method1010((int) cachenode_sub13.aLong9563, 14434).anIntArray1926;
					}
					if (is != null) {
						string += Class43.method458(4923, is);
					}
				} else {
					string = Mobile.method844(Node_Sub38_Sub23.aCacheNode_Sub13_10343, (byte) 126);
				}
			} else {
				string = Class84.aString1148 + Class22.aClass22_395.method297(Class35.language) + Class66.aString5177 + " ->";
			}
			if ((Class315.anInt4035 ^ 0xffffffff) < -3) {
				string += "<col=ffffff> / " + (Class315.anInt4035 - 2) + Class22.aClass22_388.method297(Class35.language);
			}
			if (Class320_Sub29.aWidget8488 != null) {
				Class52 class52 = Class320_Sub29.aWidget8488.method4155(true, graphicstoolkit);
				if (class52 == null) {
					class52 = Class262_Sub4.aClass52_7721;
				}
				class52.method545(GameStub.anIntArray44, Class320_Sub29.aWidget8488.anInt4835, Class320_Sub29.aWidget8488.anInt4809, 0, Class290_Sub6.anIntArray8123, Class320_Sub29.aWidget8488.anInt4754, Class320_Sub29.aWidget8488.anInt4695, ReferenceTable.aRandom283, string, Class197.anInt2415, Class320_Sub29.aWidget8488.anInt4796, Class105.aGLSpriteArray5194, ClientScript.anInt9496, StandardDrawableModel.anInt5918, Class320_Sub29.aWidget8488.anInt4825);
				Class310.method3589(GameStub.anIntArray44[2], GameStub.anIntArray44[0], (byte) 115, GameStub.anIntArray44[3], GameStub.anIntArray44[1]);
			} else if (Node_Sub6.aWidget7047 != null && Class209.aClass353_2483 == Node_Sub38_Sub34.aClass353_10443) {
				int i_1_ = Class262_Sub4.aClass52_7721.method525(Class105.aGLSpriteArray5194, ClientScript.anInt9496, 16777215, Node_Sub14.anInt7119 - -16, 8906, string, Class290_Sub6.anIntArray8123, 0, ReferenceTable.aRandom283, 4 + Class385.anInt4913);
				Class310.method3589(i_1_ + Class262_Sub15_Sub1.aClass357_10524.method4033((byte) -6, string), Class385.anInt4913 - -4, (byte) 103, 16, Node_Sub14.anInt7119);
			}
		}
	}
	
	static final int method3471(byte b) {
		anInt3693++;
		return Class243.aClass340_3069.method3959(255);
	}
	
	Class295(String string, String string_2_, String string_3_) {
		aString3697 = string_2_;
		aString3691 = string_3_;
		aString3694 = string;
	}
	
	static final Node_Sub16 method3472(int key, byte b, boolean bool) {
		if (b != 18) {
			return null;
		}
		anInt3698++;
		long l = (long) (key | (!bool ? 0 : -2147483648));
		return (Node_Sub16) Class153.aHashTable1947.method1518(b + 3494, l);
	}
	
	public static void method3473(int i) {
		myPlayer = null;
		if (i != -2594) {
			method3471((byte) 4);
		}
		aClass343_3695 = null;
	}
}
