/* Class113 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class113
{
	static float aFloat1439;
	static Class336 aClass336_1440;
	protected int anInt1441 = -1;
	static int anInt1442;
	protected long[] aLongArray1443;
	protected String[] aStringArray1444;
	static int anInt1445;
	static int anInt1446;
	static byte[][][] aByteArrayArrayArray1447;
	protected int[] anIntArray1448;
	protected ClientScript aCacheNode_Sub9_1449;
	static int anInt1450;
	static int anInt1451;
	
	static final int method1148(boolean bool, int i, int i_0_) {
		anInt1445++;
		if (bool != true) {
			return 95;
		}
		if ((i_0_ ^ 0xffffffff) == 1) {
			return 12345678;
		}
		if (i_0_ == -1) {
			if ((i ^ 0xffffffff) > -3) {
				i = 2;
			} else if ((i ^ 0xffffffff) < -127) {
				i = 126;
			}
			return i;
		}
		i = (i_0_ & 0x7f) * i >> 7;
		if ((i ^ 0xffffffff) <= -3) {
			if ((i ^ 0xffffffff) < -127) {
				i = 126;
			}
		} else {
			i = 2;
		}
		return i + (0xff80 & i_0_);
	}
	
	public static void method1149(int i) {
		@SuppressWarnings("unused")
		int i_1_ = -121 % ((8 - i) / 54);
		aByteArrayArrayArray1447 = null;
		aClass336_1440 = null;
	}
	
	static final void method1150(byte b) {
		Class238.aGLSpriteArray2912 = null;
		if (b != -99) {
			aClass336_1440 = null;
		}
		Class150_Sub3.aGLSpriteArray8973 = null;
		Class101.aGLSpriteArray1301 = null;
		CacheNode_Sub18.aClass52_9609 = null;
		StandardSprite.aClass52_8945 = null;
		Class10.aGLSprite173 = null;
		Class320_Sub5.aGLSpriteArray8254 = null;
		Class156.aGLSpriteArray1969 = null;
		Node_Sub38_Sub24.aGLSpriteArray10356 = null;
		Class24.aGLSpriteArray443 = null;
		Class274.aGLSprite4981 = null;
		Node_Sub15_Sub7.aGLSpriteArray9828 = null;
		anInt1446++;
		Class262_Sub4.aClass52_7721 = null;
		Node_Sub52.aGLSpriteArray7655 = null;
		Node_Sub53.aGLSpriteArray7666 = null;
		Class19.aGLSpriteArray312 = null;
		ReferenceTable.aGLSpriteArray284 = null;
	}
	
	static final void method1151(int i, int i_2_, int i_3_, byte b, int i_4_) {
		if (b > -103) {
			aFloat1439 = 0.7469533F;
		}
		anInt1450++;
		float f = (float) Class20.anInt333 / (float) Class20.anInt345;
		int i_5_ = i;
		int i_6_ = i_4_;
		if (f < 1.0F) {
			i_6_ = (int) ((float) i * f);
		} else {
			i_5_ = (int) ((float) i_4_ / f);
		}
		i_3_ -= (-i_6_ + i_4_) / 2;
		i_2_ -= (-i_5_ + i) / 2;
		Class94.anInt1250 = i_2_ * Class20.anInt345 / i_5_;
		Class327.anInt5360 = -(Class20.anInt333 * i_3_ / i_6_) + Class20.anInt333;
		Class150_Sub3.anInt8963 = -1;
		Class262_Sub4.anInt7730 = -1;
		Class207.method2039(9);
	}
	
	static final boolean method1152(int i) {
		anInt1451++;
		if (i > -65) {
			method1152(-37);
		}
        return (Class52.anInt800 ^ 0xffffffff) != -1;
    }
	
	Class113() {
		/* empty */
	}
	
	static final long method1153(int i, String string) {
		anInt1442++;
		if (i != 1) {
			method1153(79, null);
		}
		int i_7_ = string.length();
		long l = 0L;
		for (int i_8_ = 0; (i_7_ ^ 0xffffffff) < (i_8_ ^ 0xffffffff); i_8_++)
			l = (long) string.charAt(i_8_) + ((l << 5) + -l);
		return l;
	}
}
