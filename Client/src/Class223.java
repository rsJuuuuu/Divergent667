/* Class223 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

public class Class223
{
	protected int anInt2651;
	static int anInt2652;
	protected int anInt2653;
	protected int anInt2654;
	protected int anInt2655;
	static String aString2656;
	protected int anInt2657;
	protected int anInt2658;
	protected int anInt2659;
	static String aString2660;
	protected int anInt2661;
	protected int anInt2662;
	static float[] aFloatArray2663 = new float[2];
	static Class383 aClass383_2664;
	static int anInt2665;
	protected int anInt2666 = -1;
	
	public static void method2102(byte b) {
		aString2660 = null;
		aClass383_2664 = null;
		aString2656 = null;
		aFloatArray2663 = null;
		if (b != 71) {
			aFloatArray2663 = null;
		}
	}
	
	static final void drawPlayerOptions(boolean bool, Player player, int i) {
		anInt2665++;
		if (Class315.anInt4035 < 400) {
			if (player == Class295.myPlayer) {
				if (Class87.removeWalkHere && (0x10 & Class200_Sub2.anInt4943) != 0) {
					Node_Sub32.method2731(false, -1, 0L, 0, 0, Class84.aString1148, 4, true, Class201.anInt2444, Class66.aString5177 + " -> <col=ffffff>" + Class22.aClass22_400.method297(Class35.language), (long) player.index, (byte) -18, false);
					Class231.anInt2761++;
				}
			} else {
				String string;
				if (player.anInt11139 == 0) {
					boolean bool_0_ = true;
					if (Class295.myPlayer.anInt11184 != -1 && player.anInt11184 != -1) {
						int i_1_ = (Class295.myPlayer.anInt11184 ^ 0xffffffff) > (player.anInt11184 ^ 0xffffffff) ? Class295.myPlayer.anInt11184 : player.anInt11184;
						int i_2_ = -player.combatLevel + Class295.myPlayer.combatLevel;
						if ((i_2_ ^ 0xffffffff) > -1) {
							i_2_ = -i_2_;
						}
						if ((i_2_ ^ 0xffffffff) < (i_1_ ^ 0xffffffff)) {
							bool_0_ = false;
						}
					}
					String string_3_ = Class169_Sub4.aClass353_8825 != Class209.aClass353_2483 ? Class22.aClass22_391.method297(Class35.language) : Class22.aClass22_393.method297(Class35.language);
					if ((player.combatLevel ^ 0xffffffff) <= (player.combatLevelWithSummoning ^ 0xffffffff)) {
						string = player.fixedName(false, true) + (bool_0_ ? Class368.method4077(Class295.myPlayer.combatLevel, player.combatLevel) : "<col=ffffff>") + " (" + string_3_ + player.combatLevel + ")";
					} else {
						string = player.fixedName(false, true) + (!bool_0_ ? "<col=ffffff>" : Class368.method4077(Class295.myPlayer.combatLevel, player.combatLevel)) + " (" + string_3_ + player.combatLevel + "+" + (player.combatLevelWithSummoning + -player.combatLevel) + ")";
					}
				} else if (player.anInt11139 == -1) {
					string = player.fixedName(false, true);
				} else {
					string = player.fixedName(false, true) + " (" + Class22.aClass22_392.method297(Class35.language) + player.anInt11139 + ")";
				}
				if (Class87.removeWalkHere && !bool && (0x8 & Class200_Sub2.anInt4943 ^ 0xffffffff) != -1) {
					Class320_Sub8.anInt8285++;
					Node_Sub32.method2731(false, -1, (long) player.index, 0, 0, Class84.aString1148, 44, true, Class201.anInt2444, Class66.aString5177 + " -> <col=ffffff>" + string, (long) player.index, (byte) -18, false);
				}
				if (i != -15052) {
					aString2656 = null;
				}
				if (!bool) {
					for (int i_4_ = 7; i_4_ >= 0; i_4_--) {
						if (Class320_Sub13.aStringArray8338[i_4_] != null) {
							short s = 0;
							if (Class209.aClass353_2483 == Node_Sub38_Sub34.aClass353_10443 && Class320_Sub13.aStringArray8338[i_4_].equalsIgnoreCase(Class22.aClass22_386.method297(Class35.language))) {
								if (Class171.aBoolean2058 && !Settings.forceLeftClick() && (Class295.myPlayer.combatLevel ^ 0xffffffff) > (player.combatLevel ^ 0xffffffff)) {
									s = (short) 2000;
								}
								if ((Class295.myPlayer.anInt11134 ^ 0xffffffff) != -1 && player.anInt11134 != 0) {
									if ((player.anInt11134 ^ 0xffffffff) != (Class295.myPlayer.anInt11134 ^ 0xffffffff)) {
										s = (short) 0;
									} else {
										s = (short) 2000;
									}
								} else if (player.aBoolean11135) {
									s = (short) 2000;
								}
							} else if (Class319.aBooleanArray4060[i_4_]) {
								s = (short) 2000;
							}
							short s_5_ = (short) (s + Node_Sub38_Sub9.aShortArray10186[i_4_]);
							int i_6_ = (Class78.anIntArray1031[i_4_] ^ 0xffffffff) == 0 ? Class230_Sub1.anInt9013 : Class78.anIntArray1031[i_4_];
							Node_Sub32.method2731(false, -1, (long) player.index, 0, 0, Class320_Sub13.aStringArray8338[i_4_], s_5_, true, i_6_, "<col=ffffff>" + string, (long) player.index, (byte) -18, false);
							Class106.anInt1349++;
						}
					}
				} else {
					Node_Sub32.method2731(true, 0, 0L, 0, 0, "<col=cccccc>" + string, -1, false, -1, "", (long) player.index, (byte) -18, false);
				}
				if (!bool) {
					for (CacheNode_Sub13 cachenode_sub13 = (CacheNode_Sub13) Class368.aClass312_4549.method3613(65280); cachenode_sub13 != null; cachenode_sub13 = (CacheNode_Sub13) Class368.aClass312_4549.method3620(16776960)) {
						if (cachenode_sub13.anInt9562 == 58) {
							cachenode_sub13.aString9565 = "<col=ffffff>" + string;
							break;
						}
					}
				}
			}
		}
	}
	
	static final void method2104(int i, int i_7_, int i_8_) {
		anInt2652++;
		if (i != 0) {
			aClass383_2664 = null;
		}
		if (Class209.aClass353_2483 == Class169_Sub4.aClass353_8825) {
			if (!Class78.method778(0, i_7_, 1, false, i_8_, 0, -2, -65, 1)) {
				Class78.method778(0, i_7_, 1, false, i_8_, 0, -3, -59, 1);
			}
		} else if (!Class78.method778(0, i_7_, 1, false, i_8_, 0, -3, -69, 1)) {
			Class78.method778(0, i_7_, 1, false, i_8_, 0, -2, i + 32, 1);
		}
	}
	
	static {
		String string = "Unknown";
		try {
			string = System.getProperty("java.vendor").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		string.toLowerCase();
		string = "Unknown";
		try {
			string = System.getProperty("java.version").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		string.toLowerCase();
		string = "Unknown";
		try {
			string = System.getProperty("os.name").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		aString2660 = string.toLowerCase();
		string = "Unknown";
		try {
			string = System.getProperty("os.arch").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		aString2656 = string.toLowerCase();
		string = "Unknown";
		try {
			string = System.getProperty("os.version").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		string.toLowerCase();
		string = "~/";
		try {
			string = System.getProperty("user.home").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		new File(string);
	}
}
