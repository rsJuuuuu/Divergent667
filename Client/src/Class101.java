/* Class101 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class101
{
	static GLSprite[] aGLSpriteArray1301;
	private Class61 aClass61_1302 = new Class61(64);
	static int anInt1303;
	static int anInt1304;
	static int anInt1305;
	static int anInt1306;
	static int anInt1307;
	private Index aClass302_1308;
	static int anInt1309;
	protected Index aClass302_1310;
	protected Class61 aClass61_1311 = new Class61(60);
	protected int anInt1312;
	static boolean aBoolean1313 = false;
	
	final Class195 method1090(int i, int i_0_) {
			anInt1307++;
			Class195 class195;
			synchronized (aClass61_1302) {
				class195 = (Class195) aClass61_1302.method607((long) i_0_, 0);
			}
			if (class195 != null) {
				return class195;
			}
			byte[] bs;
			synchronized (aClass302_1308) {
				bs = aClass302_1308.method3524(false, Node_Sub44.method2946(106, i_0_), Class190.method1938(i_0_, 128));

			}
			class195 = new Class195();
			class195.anInt2378 = i_0_;
			class195.aClass101_2392 = this;
			if (bs != null) {
				class195.method1983(new BufferedStream(bs), true);
			}
			synchronized (aClass61_1302) {
				aClass61_1302.method601(class195, 25566, (long) i_0_);
			}
			return class195;
	}
	
	final void method1091(byte b, int i) {
		anInt1304++;
		anInt1312 = i;
		synchronized (aClass61_1311) {
			aClass61_1311.method608(false);
		}
		if (b > -35) {
			method1091((byte) -59, -31);
		}
	}
	
	public static void method1092(byte b) {
		aGLSpriteArray1301 = null;
		if (b <= 20) {
			aGLSpriteArray1301 = null;
		}
	}
	
	final void method1093(boolean bool) {
		anInt1309++;
		synchronized (aClass61_1302) {
			aClass61_1302.method602((byte) -122);
			if (bool != false) {
				method1090(-69, 47);
			}
		}
		synchronized (aClass61_1311) {
			aClass61_1311.method602((byte) -126);
		}
	}
	
	final void method1094(int i, int i_2_) {
		synchronized (aClass61_1302) {
			aClass61_1302.method598(i_2_, -11819);
		}
		anInt1303++;
		synchronized (aClass61_1311) {
			aClass61_1311.method598(i_2_, -11819);
		}
	}
	
	final void method1095(int i) {
		anInt1305++;
		synchronized (aClass61_1302) {
			aClass61_1302.method608(false);
		}
		synchronized (aClass61_1311) {
			aClass61_1311.method608(false);
		}
		if (i != -20625) {
			method1091((byte) 48, -1);
		}
	}
	
	Class101(Class353 class353, int i, Index class302, Index class302_4_) {
		aClass302_1310 = class302_4_;
		aClass302_1308 = class302;
		int i_5_ = aClass302_1308.method3526(-20871) + -1;
		aClass302_1308.method3537(-2, i_5_);
	}
}
