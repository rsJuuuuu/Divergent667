/* Class203 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class203
{
	static int anInt2449 = 2;
	static int[] anIntArray2450 = new int[1];
	static int anInt2452 = -1;
	
	static final void method2028(int i, int i_0_) {
		r var_r = null;
		for (int i_1_ = i; i_1_ < i_0_; i_1_++) {
			Plane plane = Node_Sub38_Sub37.aPlaneArray10466[i_1_];
			if (plane != null) {
				for (int i_2_ = 0; i_2_ < Node_Sub50.anInt7623; i_2_++) {
					for (int i_3_ = 0; i_3_ < Class328.anInt4115; i_3_++) {
						var_r = plane.fa(i_3_, i_2_, var_r);
						if (var_r != null) {
							int i_4_ = i_3_ << Class36.anInt549;
							int i_5_ = i_2_ << Class36.anInt549;
							for (int i_6_ = i_1_ - 1; i_6_ >= 0; i_6_--) {
								Plane plane_7_ = Node_Sub38_Sub37.aPlaneArray10466[i_6_];
								if (plane_7_ != null) {
									int i_8_ = plane.method3251(i_2_, i_3_, (byte) -118) - plane_7_.method3251(i_2_, i_3_, (byte) -118);
									int i_9_ = plane.method3251(i_2_, i_3_ + 1, (byte) -118) - plane_7_.method3251(i_2_, i_3_ + 1, (byte) -118);
									int i_10_ = plane.method3251(i_2_ + 1, i_3_ + 1, (byte) -118) - plane_7_.method3251(i_2_ + 1, i_3_ + 1, (byte) -118);
									int i_11_ = plane.method3251(i_2_ + 1, i_3_, (byte) -118) - plane_7_.method3251(i_2_ + 1, i_3_, (byte) -118);
									plane_7_.CA(var_r, i_4_, (i_8_ + i_9_ + i_10_ + i_11_) / 4, i_5_, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}
	
	public static void method2029(int i) {
		Settings.LOGIN_RSA_MODULO = null;
		anIntArray2450 = null;
		@SuppressWarnings("unused")
		int i_12_ = -120 / ((-61 - i) / 51);
	}
}
