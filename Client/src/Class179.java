/* Class179 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class179 {
    static String aString2123;
    protected Class103 aClass103_2124 = new Class103();
    static int anInt2125;
    static int anInt2126;
    static int anInt2127;
    static int anInt2128;
    static int anInt2129;
    protected boolean aBoolean2130;
    static int anInt2131;
    static Index aClass302_2132;

    final void method1813(EntityNode_Sub6 entitynode_sub6) {
        anInt2128++;
        Animable animable = entitynode_sub6.anAnimable5990;
        boolean bool = true;
        EntityNode_Sub5[] entitynode_sub5s = entitynode_sub6.anEntityNode_Sub5Array5995;
        for (EntityNode_Sub5 entitynode_sub5 : entitynode_sub5s) {
            if (entitynode_sub5.aBoolean5987) {
                bool = false;
                break;
            }
        }
        if (!bool) {
            if (aBoolean2130) {
                for (EntityNode_Sub6 entitynode_sub6_1_ = (EntityNode_Sub6) aClass103_2124.method1113(); entitynode_sub6_1_ != null; entitynode_sub6_1_ = (EntityNode_Sub6) aClass103_2124.method1108(99)) {
                    if (entitynode_sub6_1_.anAnimable5990 == animable) {
                        entitynode_sub6_1_.method803();
                        Class148.method1650(entitynode_sub6_1_);
                    }
                }
            }
            for (EntityNode_Sub6 entitynode_sub6_2_ = (EntityNode_Sub6) aClass103_2124.method1113(); entitynode_sub6_2_ != null; entitynode_sub6_2_ = (EntityNode_Sub6) aClass103_2124.method1108(94)) {
                if (animable.anInt5944 >= entitynode_sub6_2_.anAnimable5990.anInt5944) {
                    Class262_Sub13.method3185(entitynode_sub6, entitynode_sub6_2_);
                    return;
                }
            }
            aClass103_2124.method1110(entitynode_sub6);
        }
    }

    public static void method1814() {
        aClass302_2132 = null;
        aString2123 = null;
    }

    final void method1815() {
        for (; ; ) {
            EntityNode_Sub6 entitynode_sub6 = (EntityNode_Sub6) aClass103_2124.method1106(102);
            if (entitynode_sub6 == null) {
                break;
            }
            entitynode_sub6.method803();
            Class148.method1650(entitynode_sub6);
        }
        anInt2126++;
    }

    static boolean method1816(int i) {
        anInt2131++;
        return (i & 0x34) != 0;
    }

    static boolean method1817(int i_6_) {
        anInt2125++;
        return (i_6_ & 0x800) != 0;
    }

    Class179(boolean bool) {
        aBoolean2130 = bool;
    }
}
