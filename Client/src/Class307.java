/* Class307 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class307 {
    static int[] anIntArray3896 = new int[1];
    private final d aD3897;
    static boolean aBoolean3898;
    private final Class61 aClass61_3899 = new Class61(256);
    static int anInt3900;
    static int anInt3901;
    static Node_Sub9_Sub1 aNode_Sub9_Sub1_3902;
    private final AbstractToolkit anAbstractToolkit3903;
    static int anInt3904;
    static int[] SKILL_LEVEL = new int[25];

    public static void method3579() {
        SKILL_LEVEL = null;
        aNode_Sub9_Sub1_3902 = null;
        anIntArray3896 = null;
    }

    final void method3580(byte b) {
        aClass61_3899.method608(false);
        anInt3901++;
    }

    final Interface13_Impl1 method3581(int i) {
        anInt3904++;
        Object object = aClass61_3899.method607(i, 0);
        if (object != null) {
            return (Interface13_Impl1) object;
        }
        if (!aD3897.method7(9900, i)) {
            return null;
        }
        Class91 class91 = aD3897.method10(i, -8217);
        int i_1_ = class91.aBoolean1204 ? 64 : anAbstractToolkit3903.anInt6368;
        Interface13_Impl1 interface13_impl1;
        if (!class91.aBoolean1215 || !anAbstractToolkit3903.w()) {
            int[] is;
            if (class91.anInt1226 != 2 && Class377_Sub1.method4129(class91.aByte1214)) {
                is = aD3897.method11(i_1_, true, i_1_, i, (byte) 0, 0.7F);
            } else {
                is = aD3897.method8(0.7F, i, i_1_, false, false, i_1_);
            }
            interface13_impl1 = anAbstractToolkit3903.method1258(class91.aByte1207 != 0, i_1_, i_1_, is);
        } else {
            float[] fs = aD3897.method9(i_1_, i, 0.7F, (byte) -114, i_1_, false);
            interface13_impl1 = anAbstractToolkit3903.method1345(i_1_, fs, Class99.aClass68_1290, class91.aByte1207 != 0, i_1_);
        }
        interface13_impl1.method51(class91.aBoolean1212, class91.aBoolean1210, false);
        aClass61_3899.method601(interface13_impl1, 25566, i);
        return interface13_impl1;
    }

    final void method3582() {
        anInt3900++;
        aClass61_3899.method598(5);
    }

    Class307(AbstractToolkit abstracttoolkit, d var_d) {
        aD3897 = var_d;
        anAbstractToolkit3903 = abstracttoolkit;
    }
}
