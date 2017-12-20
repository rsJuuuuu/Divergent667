/* Class304 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class304
{
	static int anInt3832;
	static Class84[] SCENE_CLIP_DATA_PLANES = new Class84[4];
	static Class215 aClass215_3834;
	static int anInt3835 = 0;
	static int anInt3836;
	
	static final void method3544(int i, int i_0_, int i_1_) {
		if (i_1_ <= 15) {
			SCENE_CLIP_DATA_PLANES = null;
		}
		if (Class52.anInt800 != 0) {
			if ((i_0_ ^ 0xffffffff) <= -1) {
				Class153.anIntArray1948[i_0_] = i;
			} else {
				for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > -17; i_2_++)
					Class153.anIntArray1948[i_2_] = i;
			}
		}
		anInt3836++;
		Class307.aNode_Sub9_Sub1_3902.method2449(i, false, i_0_);
	}
	
	static final boolean method3545(int i, int i_3_, int i_4_) {
		if (i_3_ != 10215) {
			SCENE_CLIP_DATA_PLANES = null;
		}
		anInt3832++;
        return !(!((0x70000 & i ^ 0xffffffff) != -1 | Class320_Sub5.method3700(i_4_, (byte) 124, i)) && !Class262_Sub15_Sub1.method3192(i_4_, i, 512));
    }
	
	public static void method3546(byte b) {
		aClass215_3834 = null;
		if (b <= 56) {
			method3546((byte) -41);
		}
		SCENE_CLIP_DATA_PLANES = null;
	}
}
