/* Class262_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public class Class262_Sub22 extends Class262
{
	static int anInt7869;
	static int anInt7870;
	static int anInt7871;
	static int anInt7872;
	static int anInt7873;
	static int anInt7874;
	
	static final void method3206(int i) {
		anInt7874++;
		synchronized (Class30.aClass103Array494) {
			for (int i_0_ = i; (i_0_ ^ 0xffffffff) > (Class30.aClass103Array494.length ^ 0xffffffff); i_0_++) {
				Class30.aClass103Array494[i_0_] = new Class103();
				Class89.anIntArray1195[i_0_] = 0;
			}
		}
	}
	
	static final Class42 method3207(SignLink signlink, byte b, int i, int i_1_, Component component) {
		anInt7871++;
		if (Class365.anInt4523 == 0) {
			throw new IllegalStateException();
		}
		if ((i ^ 0xffffffff) > -1 || (i ^ 0xffffffff) <= -3) {
			throw new IllegalArgumentException();
		}
		if ((i_1_ ^ 0xffffffff) > -257) {
			i_1_ = 256;
		}
		try {
			Class42 class42 = (Class42) Class.forName("Class42_Sub1").newInstance();
			class42.anIntArray642 = new int[256 * (!DrawableModel.aBoolean913 ? 1 : 2)];
			class42.anInt653 = i_1_;
			class42.method452(component);
			if (b != -27) {
				method3207(null, (byte) 120, 39, -124, null);
			}
			class42.anInt651 = (~0x3ff & i_1_) - -1024;
			if ((class42.anInt651 ^ 0xffffffff) < -16385) {
				class42.anInt651 = 16384;
			}
			class42.method447(class42.anInt651);
			if (Class87.anInt1193 > 0 && IComponentDefinitions.aClass92_4845 == null) {
				IComponentDefinitions.aClass92_4845 = new Class92();
				IComponentDefinitions.aClass92_4845.aSignLink1237 = signlink;
				signlink.method3641((byte) 50, IComponentDefinitions.aClass92_4845, Class87.anInt1193);
			}
			if (IComponentDefinitions.aClass92_4845 != null) {
				if (IComponentDefinitions.aClass92_4845.aClass42Array1234[i] != null) {
					throw new IllegalArgumentException();
				}
				IComponentDefinitions.aClass92_4845.aClass42Array1234[i] = class42;
			}
			return class42;
		} catch (Throwable throwable) {
			try {
				Class42_Sub2 class42_sub2 = new Class42_Sub2(signlink, i);
				class42_sub2.anIntArray642 = new int[256 * (!DrawableModel.aBoolean913 ? 1 : 2)];
				class42_sub2.anInt653 = i_1_;
				class42_sub2.method452(component);
				class42_sub2.anInt651 = 16384;
				class42_sub2.method447(class42_sub2.anInt651);
				if ((Class87.anInt1193 ^ 0xffffffff) < -1 && IComponentDefinitions.aClass92_4845 == null) {
					IComponentDefinitions.aClass92_4845 = new Class92();
					IComponentDefinitions.aClass92_4845.aSignLink1237 = signlink;
					signlink.method3641((byte) 50, IComponentDefinitions.aClass92_4845, Class87.anInt1193);
				}
				if (IComponentDefinitions.aClass92_4845 != null) {
					if (IComponentDefinitions.aClass92_4845.aClass42Array1234[i] != null) {
						throw new IllegalArgumentException();
					}
					IComponentDefinitions.aClass92_4845.aClass42Array1234[i] = class42_sub2;
				}
				return class42_sub2;
			} catch (Throwable throwable_2_) {
				return new Class42();
			}
		}
	}
	
	static final void method3208(long l, boolean bool) {
		anInt7870++;
		if ((l ^ 0xffffffffffffffffL) < -1L && bool == false) {
			if ((l % 10L ^ 0xffffffffffffffffL) != -1L) {
				Class262_Sub11.method3179(l, (byte) 123);
			} else {
				Class262_Sub11.method3179(-1L + l, (byte) 127);
				Class262_Sub11.method3179(1L, (byte) 117);
			}
		}
	}
	
	final void method3148(int i) {
		Class23.method301((byte) -104);
		anInt7872++;
		if (i < -102) {
			/* empty */
		}
	}
	
	static final Class115 method3209(boolean bool) {
		anInt7869++;
		try {
			if (bool != true) {
				return null;
			}
			return (Class115) Class.forName("Class115_Sub1").newInstance();
		} catch (Throwable throwable) {
			return null;
		}
	}
	
	Class262_Sub22(BufferedStream buffer) {
		super(buffer);
	}
	
	static final void method3210(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		Class10.anInt174 = i_3_;
		anInt7873++;
		Class134_Sub1.anInt9015 = i_6_;
		Node_Sub24.anInt7229 = i;
		Node_Sub13.anInt7116 = i_7_;
		Class238.anInt2911 = i_5_;
		if (Node_Sub13.anInt7116 >= 100) {
			int i_8_ = 256 + 512 * Class238.anInt2911;
			int i_9_ = 512 * Class10.anInt174 - -256;
			int i_10_ = Node_Sub38_Sub7.method2809(CacheNode_Sub20_Sub1.myPlayerPlane, -29754, i_9_, i_8_) - Class134_Sub1.anInt9015;
			int i_11_ = -Class98.anInt5061 + i_8_;
			int i_12_ = i_10_ + -Class190.anInt2331;
			int i_13_ = -Node_Sub10.anInt7079 + i_9_;
			int i_14_ = (int) Math.sqrt((double) (i_13_ * i_13_ + i_11_ * i_11_));
			OutcommingPacket.anInt4050 = (int) (2607.5945876176133 * Math.atan2((double) i_12_, (double) i_14_)) & 0x3fff;
			Class170.anInt2053 = 0x3fff & (int) (-2607.5945876176133 * Math.atan2((double) i_11_, (double) i_13_));
			if (OutcommingPacket.anInt4050 < 1024) {
				OutcommingPacket.anInt4050 = 1024;
			}
			Class48.anInt704 = 0;
			if (OutcommingPacket.anInt4050 > 3072) {
				OutcommingPacket.anInt4050 = 3072;
			}
		}
		Class367.anInt4541 = Class368.anInt4551 = i_4_;
		Class320_Sub22.anInt8415 = 2;
	}
	
	static final Animable_Sub3 method3211(int i, int i_15_, int i_16_) {
		Class261 class261 = Class175.aClass261ArrayArrayArray2099[i][i_15_][i_16_];
		if (class261 == null) {
			return null;
		}
		Animable_Sub3 animable_sub3 = class261.anAnimable_Sub3_3316;
		class261.anAnimable_Sub3_3316 = null;
		Class58.method575(animable_sub3);
		return animable_sub3;
	}
}
