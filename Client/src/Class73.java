/* Class73 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class73 {
    static byte[] movementTypes = new byte[2048];
    private final Class339[] aClass339Array982;
    static int anInt983;
    private final GLToolkit aGLToolkit984;
    static int anInt985;
    protected Class339_Sub6 aClass339_Sub6_986;
    private int anInt987 = 0;
    static CacheNode_Sub4 aCacheNode_Sub4_988 = null;
    private int anInt989 = 0;
    static int anInt990;
    private int anInt991 = 0;
    static int anInt992;

    final boolean method748() {
        anInt990++;
        return aClass339Array982[3].method3922((byte) -73);
    }

    static boolean method749(byte b, int i, int i_0_) {
        if (b != -65) {
            method749((byte) 11, -103, -77);
        }
        anInt983++;
        return (i & 0x18) != 0 | (i & 0x220) == 544;
    }

    final boolean method750(int i, Class169 class169) {
        anInt992++;
        if (anInt987 == 0) {
            return false;
        }
        aClass339Array982[0x7fffffff & anInt987].method3917(class169, i, -28289);
        return true;
    }

    final void method751(int i_1_, boolean bool, boolean bool_2_, int i_3_, int i_4_) {
        anInt985++;
        bool &= aGLToolkit984.z();
        if (!bool && (i_4_ == 4 || i_4_ == 8 || i_4_ == 9)) {
            if (i_4_ == 4) {
                i_1_ = i_3_;
            }
            i_4_ = 2;
        }
        if (i_4_ != 0 && bool_2_) {
            i_4_ |= -2147483648;
        }
        if (anInt987 == i_4_) {
            if (anInt987 != 0) {
                aClass339Array982[anInt987 & 0x7fffffff].method3920(bool_2_);
                if (anInt991 != i_3_ || i_1_ != anInt989) {
                    aClass339Array982[anInt987 & 0x7fffffff].method3919(-13437, i_1_, i_3_);
                    anInt989 = i_1_;
                    anInt991 = i_3_;
                }
            }
        } else {
            if (anInt987 != 0) {
                aClass339Array982[anInt987 & 0x7fffffff].method3918(20937);
            }
            if (i_4_ != 0) {
                aClass339Array982[0x7fffffff & i_4_].method3923(bool_2_, 0);
                aClass339Array982[i_4_ & 0x7fffffff].method3920(bool_2_);
                aClass339Array982[i_4_ & 0x7fffffff].method3919(-13437, i_1_, i_3_);
            }
            anInt989 = i_1_;
            anInt991 = i_3_;
            anInt987 = i_4_;
        }
    }

    public static void method752() {
        aCacheNode_Sub4_988 = null;
        movementTypes = null;
    }

    Class73(GLToolkit gltoolkit) {
        aGLToolkit984 = gltoolkit;
        Class301 aClass301_980 = new Class301(gltoolkit);
        aClass339Array982 = new Class339[10];
        aClass339Array982[1] = new Class339_Sub1(gltoolkit);
        aClass339Array982[2] = new Class339_Sub9(gltoolkit, aClass301_980);
        aClass339Array982[4] = new Class339_Sub2(gltoolkit, aClass301_980);
        aClass339Array982[5] = new Class339_Sub5(gltoolkit, aClass301_980);
        aClass339Array982[6] = new Class339_Sub8(gltoolkit);
        aClass339Array982[7] = new Class339_Sub3(gltoolkit);
        aClass339Array982[3] = aClass339_Sub6_986 = new Class339_Sub6(gltoolkit);
        aClass339Array982[8] = new Class339_Sub4(gltoolkit, aClass301_980);
        aClass339Array982[9] = new Class339_Sub7(gltoolkit, aClass301_980);
        if (!aClass339Array982[8].method3922((byte) -71)) {
            aClass339Array982[8] = aClass339Array982[4];
        }
        if (!aClass339Array982[9].method3922((byte) -60)) {
            aClass339Array982[9] = aClass339Array982[8];
        }
    }
}
