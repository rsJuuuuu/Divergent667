/* Class37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

public class Class37
{
	static int anInt550;
	private Class61 aClass61_551 = new Class61(64);
	static int anInt552;
	static int anInt553;
	static int anInt554;
	static int anInt555;
	static int anInt556;
	static OutcommingPacket aClass318_557 = new OutcommingPacket(53, 3);
	static float aFloat558;
	private Index aClass302_559;
	private Class61 aClass61_560 = new Class61(100);
	
	final Class48 method395(int i, byte b) {
		anInt550++;
		Class48 class48;
		synchronized (aClass61_551) {
			class48 = (Class48) aClass61_551.method607((long) i, 0);
		}
		if (class48 != null) {
			return class48;
		}
		byte[] bs;
		synchronized (aClass302_559) {
			bs = aClass302_559.method3524(false, Class262_Sub23.method3214(i, -20139), Class156.method1705(-983162425, i));
		}
		class48 = new Class48();
		class48.anInt711 = i;
		if (bs != null) {
			class48.method477(new BufferedStream(bs), -14);
		}
		class48.method476(2);
		synchronized (aClass61_551) {
			aClass61_551.method601(class48, 25566, (long) i);
			if (b >= -78) {
				aFloat558 = 0.41899917F;
			}
		}
		return class48;
	}
	
	final void method396(int i, int i_0_) {
		anInt552++;
		synchronized (aClass61_551) {
			aClass61_551.method598(i_0_, -11819);
			if (i != 0) {
				aClass61_560 = null;
			}
		}
		synchronized (aClass61_560) {
			aClass61_560.method598(i_0_, i + -11819);
		}
	}
	
	final void method397(int i) {
		synchronized (aClass61_551) {
			if (i != 53) {
				return;
			}
			aClass61_551.method602((byte) -125);
		}
		anInt554++;
		synchronized (aClass61_560) {
			aClass61_560.method602((byte) -119);
		}
	}
	
	final void method398(byte b) {
		if (b == -128) {
			synchronized (aClass61_551) {
				aClass61_551.method608(false);
			}
			anInt553++;
			synchronized (aClass61_560) {
				aClass61_560.method608(false);
			}
		}
	}
	
	final CacheNode_Sub15 method399(int i, int i_1_) {
		if (i_1_ > -49) {
			return null;
		}
		anInt556++;
		CacheNode_Sub15 cachenode_sub15;
		synchronized (aClass61_560) {
			cachenode_sub15 = (CacheNode_Sub15) aClass61_560.method607((long) i, 0);
			if (cachenode_sub15 == null) {
				cachenode_sub15 = new CacheNode_Sub15(i);
				aClass61_560.method601(cachenode_sub15, 25566, (long) i);
			}
			if (!cachenode_sub15.method2378(-419)) {
				return null;
			}
		}
		return cachenode_sub15;
	}
	
	public static void method400(int i) {
		if (i != -14514) {
			aFloat558 = -0.60005486F;
		}
		aClass318_557 = null;
	}
	
	static final int method401(boolean bool, String string) {
		anInt555++;
		if (!Animable_Sub1_Sub1.aSignLink10616.aBoolean4005) {
			return -1;
		}
		if (Class85.aHashtable1157.containsKey(string)) {
			return 100;
		}
		String string_2_ = OutputStream_Sub1.method136(125, string);
		if (string_2_ == null) {
			return -1;
		}
		String string_3_ = Class117_Sub1.aString4931 + string_2_;
		if (!Class239.index30.method3506(string_3_, bool, "")) {
			return -1;
		}
		if (!Class239.index30.method3527(string_3_, 0)) {
			return Class239.index30.method3522((byte) 102, string_3_);
		}
		byte[] data = Class239.index30.method3529(string_3_, "", 1);
		Object object = null;
		File file;
		try {
			file = Class351.method4003(string_2_, 111);
		} catch (RuntimeException runtimeexception) {
			return -1;
		}
		if (data != null && file != null) {
			boolean bool_4_ = true;
			byte[] bs_5_ = Class337.method3904((byte) -104, file);
			if (bs_5_ != null && (bs_5_.length ^ 0xffffffff) == (data.length ^ 0xffffffff)) {
				for (int i = 0; (bs_5_.length ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
					if ((data[i] ^ 0xffffffff) != (bs_5_[i] ^ 0xffffffff)) {
						bool_4_ = false;
						break;
					}
				}
			} else {
				bool_4_ = false;
			}
			try {
				if (!bool_4_) {
					Animable_Sub1_Sub1.aSignLink10616.method3637(file, 0, data);
				}
			} catch (Throwable throwable) {
				return -1;
			}
			Class169_Sub2_Sub1.method1777(file, string, 34037);
			return 100;
		}
		return -1;
	}
	
	Class37(Class353 class353, int i, Index class302, Index class302_6_, Index class302_7_) {
		aClass302_559 = class302;
		if (aClass302_559 != null) {
			int i_8_ = -1 + aClass302_559.method3526(-20871);
			aClass302_559.method3537(-2, i_8_);
		}
		Class345.method3971(class302_7_, 2, true, class302_6_);
	}
}
