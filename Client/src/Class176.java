/* Class176 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class176 {
    private final Index aClass302_2101;
    static Index aClass302_2102;
    static int anInt2103;
    private final Class61 aClass61_2104 = new Class61(64);
    protected int anInt2105;
    static Node_Sub9_Sub3 aNode_Sub9_Sub3_2106;

    final Class254 method1805(int i) {
        anInt2103++;
        Class254 class254;
        synchronized (aClass61_2104) {
            class254 = (Class254) aClass61_2104.method607(i, 0);
        }
        if (class254 != null) {
            return class254;
        }
        byte[] bs;
        synchronized (aClass302_2101) {
            bs = aClass302_2101.method3524(i, 19);
        }
        class254 = new Class254();
        if (bs != null) {
            class254.method3109(new BufferedStream(bs));
        }
        synchronized (aClass61_2104) {
            aClass61_2104.method601(class254, 25566, i);
        }
        return class254;
    }

    public static void method1806() {
        aClass302_2102 = null;
        aNode_Sub9_Sub3_2106 = null;
    }

    Class176(Class353 class353, int i, Index class302) {
        aClass302_2101 = class302;
        anInt2105 = aClass302_2101.method3537(19);
    }
}
