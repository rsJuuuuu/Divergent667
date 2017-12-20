/* Class313 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class313
{
	static int anInt4010;
	static int anInt4011;
	static int anInt4012;
	static int anInt4013 = -1;
	static int anInt4014;
	
	static boolean method3647(boolean bool, boolean bool_0_) {
		return bool | bool_0_;
	}
	
	static final void method3648(int i) {
		Class229.aGraphicsToolkit2732.xa((0.7F + (float) Class213.aNode_Sub27_2512.aClass320_Sub22_7299.method3765(false) * 0.1F) * Node_Sub25.aFloat7236);
		anInt4014++;
		Class229.aGraphicsToolkit2732.ZA(Class320_Sub20.anInt8402, CacheNode_Sub16_Sub2.aFloat11082, Class363.aFloat4502, (float) (Class181.anInt2145 << 2), (float) (Class134_Sub2.anInt9022 << 2), (float) (Class173.anInt2089 << 2));
		@SuppressWarnings("unused")
		int i_1_ = -3 % ((i - -57) / 39);
		Class229.aGraphicsToolkit2732.a(Class229.aClass270_2733);
	}
	
	static final boolean method3649(boolean bool, int i, int i_2_, int i_3_) {
		anInt4010++;
		if (!Class12.aBoolean194 || !Mobile_Sub1.aBoolean10959) {
			return false;
		}
		if (Class233.anInt2786 < 100) {
			return false;
		}
		if (bool != true) {
			method3649(true, 77, 66, -67);
		}
		int i_4_ = Class240.anIntArrayArrayArray2948[i_2_][i_3_][i];
		if ((-Class359.anInt4465 ^ 0xffffffff) == (i_4_ ^ 0xffffffff)) {
			return false;
		}
		if (Class359.anInt4465 == i_4_) {
			return true;
		}
		if (Class368.aPlaneArray4548 == Class320_Sub10.aPlaneArray8300) {
			return false;
		}
		int i_5_ = i_3_ << Class36.anInt549;
		int i_6_ = i << Class36.anInt549;
		if (Class99.method1087(-1 + (i_5_ + Class179.anInt2129), i_6_ + 1, Class320_Sub10.aPlaneArray8300[i_2_].method3251(1 + i, i_3_ + 1, (byte) -118), Class320_Sub10.aPlaneArray8300[i_2_].method3251(1 + i, i_3_, (byte) -118), Class320_Sub10.aPlaneArray8300[i_2_].method3251(i, i_3_, (byte) -118), (byte) 89, -1 + (i_6_ - -Class179.anInt2129), Class179.anInt2129 + i_6_ + -1, 1 + i_5_, 1 + i_5_) && Class99.method1087(-1 + (Class179.anInt2129 + i_5_), 1 + i_6_, Class320_Sub10.aPlaneArray8300[i_2_].method3251(i, i_3_ + 1, (byte) -118), Class320_Sub10.aPlaneArray8300[i_2_].method3251(i + 1, i_3_ + 1, (byte) -118), Class320_Sub10.aPlaneArray8300[i_2_].method3251(i, i_3_, (byte) -118), (byte) 89, 1 + i_6_, Class179.anInt2129 + i_6_ + -1, i_5_ + 1, -1 + (Class179.anInt2129 + i_5_))) {
			ProducingGraphicsBuffer.anInt9880++;
			Class240.anIntArrayArrayArray2948[i_2_][i_3_][i] = Class359.anInt4465;
			return true;
		}
		Class240.anIntArrayArrayArray2948[i_2_][i_3_][i] = -Class359.anInt4465;
		return false;
	}
	
	static final synchronized long method3650(boolean bool) {
		anInt4012++;
		long l = System.currentTimeMillis();
		if ((Node_Sub38_Sub11.aLong10215 ^ 0xffffffffffffffffL) < (l ^ 0xffffffffffffffffL)) {
			Node_Sub38_Sub33.aLong10441 += -l + Node_Sub38_Sub11.aLong10215;
		}
		if (bool != false) {
			return -72L;
		}
		Node_Sub38_Sub11.aLong10215 = l;
		return l + Node_Sub38_Sub33.aLong10441;
	}
}
