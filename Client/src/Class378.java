/* Class378 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class378
{
	static int anInt4676;
	static int anInt4677;
	static int anInt4678;
	
	static final void method4133(int i, byte b, int i_0_) {
		anInt4677++;
		if (b <= 35) {
			method4134((byte) -23);
		}
		Class304.method3544(i_0_, i, 33);
	}
	
	static final void method4134(byte b) {
		if (b < 65) {
			method4133(-112, (byte) -62, 78);
		}
		anInt4678++;
		if (Class194_Sub3_Sub1.aClass241_9377 != null) {
			if ((Class194_Sub3_Sub1.aClass241_9377.anInt2953 ^ 0xffffffff) == -2) {
				Class194_Sub3_Sub1.aClass241_9377 = null;
			} else if (Class194_Sub3_Sub1.aClass241_9377.anInt2953 == 2) {
				Class343.method3962(Class179.aString2123, -117, 2, Class146.aSignLink1813);
				Class194_Sub3_Sub1.aClass241_9377 = null;
			}
		}
	}
}
