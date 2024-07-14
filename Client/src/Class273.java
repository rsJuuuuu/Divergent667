/* Class273 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Objects;

public class Class273 {
    private final Class103 aClass103_3486 = new Class103();
    static int anInt3487;
    static int anInt3488;
    static int anInt3489;
    static Index index33;
    static int anInt3491;
    protected String aString3492;
    static int anInt3493;
    static int anInt3494;
    private volatile int anInt3495;
    static int anInt3496;
    private Class33 aClass33_3497;

    final void method3314(EntityNode_Sub8 entitynode_sub8) {
        synchronized (aClass103_3486) {
            aClass103_3486.method1110(entitynode_sub8);
            anInt3495++;
        }
        anInt3487++;
        if (aClass33_3497 != null) {
            synchronized (aClass33_3497) {
                aClass33_3497.notify();
            }
        }
    }

    static int method3315(int i_0_) {
        anInt3493++;
        return i_0_ >>> 10;
    }

    final EntityNode method3316() {
        anInt3496++;

        EntityNode entitynode;
        synchronized (aClass103_3486) {
            entitynode = aClass103_3486.method1113();
            Objects.requireNonNull(entitynode).method803();
            anInt3495--;
        }
        return entitynode;
    }

    public static void method3317() {

        index33 = null;
    }

    final void method3318(Animable animable) {
        animable.aBoolean5935 = true;
        anInt3491++;
        synchronized (aClass103_3486) {
            aClass103_3486.method1110(animable);
            anInt3495++;
        }
        if (aClass33_3497 != null) {
            synchronized (aClass33_3497) {
                aClass33_3497.notify();
            }
        }
    }

    final boolean method3319() {
        anInt3494++;
        return anInt3495 == 0;
    }

    final void method3320(Class33 class33) {
        anInt3488++;
        aClass33_3497 = class33;
    }

    final void method3321(Animable animable, int i) {
        animable.aBoolean5935 = false;
        anInt3489++;
        synchronized (aClass103_3486) {
            aClass103_3486.method1110(animable);
            if (i <= 22) {
                method3317();
            }
            anInt3495++;
        }
        if (aClass33_3497 != null) {
            synchronized (aClass33_3497) {
                aClass33_3497.notify();
            }
        }
    }

    Class273(String string) {
        aString3492 = string;
    }
}
