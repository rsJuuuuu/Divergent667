/* Class229 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class229
{
	static int anInt2722;
	protected int anInt2723;
	static int anInt2724;
	static boolean aBoolean2725;
	private Class61 aClass61_2726 = new Class61(64);
	static int anInt2727;
	private Index aClass302_2728;
	static int anInt2729;
	static Class329 aClass329_2730 = new Class329("WTWIP", "office", "_wip", 3);
	static OutcommingPacket aClass318_2731 = new OutcommingPacket(41, -1);
	static GraphicsToolkit aGraphicsToolkit2732;
	static Class270 aClass270_2733;
	
	final void method2122(boolean bool) {
		synchronized (aClass61_2726) {
			if (bool != true) {
				method2122(true);
			}
			aClass61_2726.method602((byte) -128);
		}
		anInt2724++;
	}
	
	final Class293 method2123(int i, int i_0_) {
		anInt2727++;
		Class293 class293;
		synchronized (aClass61_2726) {
			class293 = (Class293) aClass61_2726.method607((long) i_0_, 0);
		}
		if (class293 != null) {
			return class293;
		}
		byte[] bs;
		synchronized (aClass302_2728) {
			bs = aClass302_2728.method3524(false, i_0_, i);
		}
		class293 = new Class293();
		if (bs != null) {
			class293.method3463(new BufferedStream(bs), (byte) -114);
		}
		synchronized (aClass61_2726) {
			aClass61_2726.method601(class293, 25566, (long) i_0_);
		}
		return class293;
	}
	
	public static void method2124(byte b) {
		aGraphicsToolkit2732 = null;
		aClass318_2731 = null;
		if (b != 39) {
			aClass270_2733 = null;
		}
		aClass270_2733 = null;
		aClass329_2730 = null;
	}
	
	final void method2125(byte b) {
		if (b != 95) {
			method2124((byte) -56);
		}
		anInt2729++;
		synchronized (aClass61_2726) {
			aClass61_2726.method608(false);
		}
	}
	
	final void method2126(int i, byte b) {
		anInt2722++;
		if (b >= 71) {
			synchronized (aClass61_2726) {
				aClass61_2726.method598(i, -11819);
			}
		}
	}
	
	Class229(Class353 class353, int i, Index class302) {
		aClass302_2728 = class302;
		if (aClass302_2728 == null) {
			anInt2723 = 0;
		} else {
			anInt2723 = aClass302_2728.method3537(-2, 16);
		}
	}
}
