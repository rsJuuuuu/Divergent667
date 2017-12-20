/* Node_Sub35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class InterfaceSettings extends Node
{
	static int anInt7412;
	protected int anInt7413;
	static int anInt7414;
	static int anInt7415;
	static int anInt7416;
	static int anInt7417;
	protected int settingsHash;
	static int anInt7419;
	static IncommingPacket aClass192_7420 = new IncommingPacket(140, -2);
	static Class135 aClass135_7421 = new Class135();
	
	final int method2743(int i) {
		anInt7415++;
		if (i >= -20) {
			anInt7413 = -17;
		}
		return Animable_Sub4.method925(settingsHash, 34933);
	}
	
	final boolean method2744(byte b) {
		anInt7416++;
		if (b < 70) {
			return true;
		}
        return (0x1 & settingsHash >> 22) != 0;
    }
	
	final int method2745(int i) {
		if (i > -70) {
			aClass192_7420 = null;
		}
		anInt7414++;
		return (0x1d36c1 & settingsHash) >> 18;
	}
	
	final boolean method2746(int i) {
		if (i != 9336) {
			method2743(115);
		}
		anInt7419++;
        return (0x1 & settingsHash ^ 0xffffffff) != -1;
    }
	
	final boolean method2747(int i) {
		if (i != 1) {
			settingsHash = -80;
		}
		anInt7412++;
        return (0x1 & settingsHash >> 21) != 0;
    }
	
	final boolean method2748(byte b, int i) {
		if (b >= -33) {
			return true;
		}
		anInt7417++;
        return (0x1 & settingsHash >> i + 1) != 0;
    }
	
	public static void method2749(int i) {
		aClass135_7421 = null;
		aClass192_7420 = null;
		if (i != 1914561) {
			method2749(-83);
		}
	}
	
	InterfaceSettings(int i, int i_0_) {
		anInt7413 = i_0_;
		settingsHash = i;
	}
}
