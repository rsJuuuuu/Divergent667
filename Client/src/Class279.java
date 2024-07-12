/* Class279 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class279 {
    private final Index aClass302_3549;
    static int anInt3550;
    static int anInt3551;
    static int anInt3552;
    protected Class353 aClass353_3553;
    static int anInt3554;
    static Node_Sub21 aNode_Sub21_3555 = new Node_Sub21(0, 0);
    protected boolean aBoolean3556;
    static int anInt3557;
    static int anInt3558;
    static int anInt3559;
    private final Class61 aClass61_3560 = new Class61(64);
    static int anInt3561;
    static int anInt3563;
    protected Index aClass302_3564;
    protected Class61 aClass61_3565 = new Class61(50);
    protected Class61 aClass61_3566 = new Class61(5);
    protected int anInt3567;
    private final String[] aStringArray3568;

    final void method3369(int i, int i_0_) {
        synchronized (aClass61_3560) {
            aClass61_3560.method598(i);
        }
        anInt3559++;
        synchronized (aClass61_3565) {
            if (i_0_ != -759) {
                method3370((byte) 81);
            }
            aClass61_3565.method598(i);
        }
        synchronized (aClass61_3566) {
            aClass61_3566.method598(i);
        }
    }

    final void method3370(byte b) {
        synchronized (aClass61_3560) {
            aClass61_3560.method608(false);
        }
        anInt3551++;
        synchronized (aClass61_3565) {
            aClass61_3565.method608(false);
        }
        synchronized (aClass61_3566) {
            if (b != -40) {
                method3369(0, 92);
            }
            aClass61_3566.method608(false);
        }
    }

    static void method3371(int i, int i_1_, int i_2_, int i_3_) {
        anInt3558++;
        CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(3, 10, i_1_);
        cachenode_sub2.method2288();
        cachenode_sub2.anInt9432 = i_2_;
        cachenode_sub2.anInt9434 = i_3_;
        cachenode_sub2.anInt9429 = i;
    }

    public static void method3372() {
        aNode_Sub21_3555 = null;
    }

    final void method3373() {
        synchronized (aClass61_3560) {
            aClass61_3560.method602((byte) -125);
        }
        anInt3563++;
        synchronized (aClass61_3565) {
            aClass61_3565.method602((byte) -117);
        }
        synchronized (aClass61_3566) {
            aClass61_3566.method602((byte) -119);
        }
    }

    final void method3374(boolean bool) {
        anInt3557++;
        if (bool != aBoolean3556) {
            aBoolean3556 = bool;
            method3370((byte) -40);
        }
    }

    final void method3375() {
        synchronized (aClass61_3565) {
            aClass61_3565.method608(false);
        }
        anInt3561++;
        synchronized (aClass61_3566) {
            aClass61_3566.method608(false);
        }
    }

    final NpcDefinition getNPCDefinitions(int i) {
        anInt3554++;
        NpcDefinition npcdefinition;
        synchronized (aClass61_3560) {
            npcdefinition = (NpcDefinition) aClass61_3560.method607(i, 0);
        }
        if (npcdefinition != null) {
            return npcdefinition;
        }
        byte[] bs;
        synchronized (aClass302_3549) {
            bs = aClass302_3549.method3524(Node_Sub47.method2952(i), Class379.method4164(i));
        }
        npcdefinition = new NpcDefinition();
        npcdefinition.aClass279_2861 = this;
        npcdefinition.npcId = i;
        npcdefinition.options = aStringArray3568.clone();
        if (bs != null) {
            npcdefinition.method3000(new BufferedStream(bs));
        }
        npcdefinition.method2997();
        synchronized (aClass61_3560) {
            aClass61_3560.method601(npcdefinition, 25566, i);
        }
        return npcdefinition;
    }

    final void method3377(int i) {
        anInt3567 = i;
        anInt3552++;
        synchronized (aClass61_3565) {
            aClass61_3565.method608(false);
        }
        synchronized (aClass61_3566) {
            aClass61_3566.method608(false);
        }
    }

    Class279(Class353 class353, int i, Index class302, Index class302_4_) {
        aClass302_3564 = class302_4_;
        aClass302_3549 = class302;
        aBoolean3556 = true;
        aClass353_3553 = class353;
        if (aClass302_3549 != null) {
            int i_5_ = -1 + aClass302_3549.method3526();
            aClass302_3549.method3537(-2, i_5_);
        }
        if (Node_Sub38_Sub34.aClass353_10443 == aClass353_3553) {
            aStringArray3568 = new String[]{null, null, null, null, null, Translation.aTranslation_385.getTranslatedString(i)};
        } else {
            aStringArray3568 = new String[]{null, null, null, null, null, null};
        }
    }
}
