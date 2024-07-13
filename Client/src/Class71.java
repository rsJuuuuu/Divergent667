/* Class71 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Hashtable;

public class Class71 {
    private final Index aClass302_951;
    static int anInt952;
    static int anInt953;
    static int anInt954;
    static int anInt955;
    protected int anInt956;
    static int anInt957;
    static Hashtable aHashtable958 = new Hashtable();
    static int anInt959;
    private final Class61 aClass61_960 = new Class61(64);
    protected int anInt961 = 0;
    static IncommingPacket aClass192_962 = new IncommingPacket(11, 3);
    static IncommingPacket aClass192_963 = new IncommingPacket(24, -1);
    static OutcommingPacket aClass318_964 = new OutcommingPacket(7, -1);
    static Class251 aClass251_965 = new Class251(1);
    static int anInt966 = 1;
    static boolean aBoolean967 = false;

    final void method740() {
        synchronized (aClass61_960) {
            aClass61_960.method608(false);
        }
        anInt953++;
    }

    static boolean method741(int i, int i_1_) {
        anInt957++;
        return (i_1_ & 0xc580) != 0;
    }

    final void method742() {
        synchronized (aClass61_960) {
            aClass61_960.method602((byte) -127);
        }
        anInt952++;
    }

    final Class289 method743(int i, byte b) {
        if (b < 26) {
            method746(83, 27);
        }
        anInt954++;
        Class289 class289;
        synchronized (aClass61_960) {
            class289 = (Class289) aClass61_960.method607(i, 0);
        }
        if (class289 != null) {
            return class289;
        }
        byte[] bs;
        synchronized (aClass302_951) {
            bs = aClass302_951.method3524(i, 4);
        }
        class289 = new Class289();
        class289.aClass71_3635 = this;
        class289.anInt3637 = i;
        if (bs != null) {
            class289.method3408(new BufferedStream(bs));
        }
        class289.method3406();
        synchronized (aClass61_960) {
            aClass61_960.method601(class289, 25566, i);
        }
        return class289;
    }

    public static void method744() {
        aHashtable958 = null;
        aClass318_964 = null;
        aClass251_965 = null;
        aClass192_963 = null;
        aClass192_962 = null;
    }

    static void method745() {
        Node_Sub46.aFont7555 = null;
        anInt959++;
        Class54.anImage813 = null;
    }

    final void method746(int i, int i_2_) {
        synchronized (aClass61_960) {
            if (i_2_ != -3452) {
                return;
            }
            aClass61_960.method598(i);
        }
        anInt955++;
    }

    Class71(Class353 class353, int i, Index class302) {
        aClass302_951 = class302;
        anInt956 = aClass302_951.method3537(4);
    }
}
