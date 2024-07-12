/* Class373 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class373 {
    static int anInt4601;
    static int RUN_ENERGY = 0;
    static int anInt4603;
    private final Index aClass302_4604;
    private Class337 aClass337_4605;
    static int anInt4606;
    private final Index aClass302_4607;
    static boolean aBoolean4608 = true;
    static int anInt4609;

    final Interface10 method4105(Interface7 interface7) {
        anInt4609++;
        if (interface7 == null) {
            return null;
        }
        Class170 class170 = interface7.method20(123);
        if (class170 == Node_Sub40.aClass170_7508) {
            return new Class3((Class116) interface7);
        }
        if (class170 == Class96.aClass170_1273) {
            return new Class260(method4107(), (Class205) interface7);
        }
        if (class170 == Class262_Sub18.aClass170_7850) {
            return new Class230(aClass302_4607, (Class235) interface7);
        }
        if (Class350.aClass170_5391 == class170) {
            return new Class230_Sub1(aClass302_4607, (Class235_Sub1) interface7);
        }
        if (Class46.aClass170_680 == class170) {
            return new Class66_Sub1(aClass302_4607, aClass302_4604, (Class150_Sub2) interface7);
        }
        if (Class169_Sub2.aClass170_8806 == class170) {
            return new Class66_Sub3(aClass302_4607, aClass302_4604, (Class150_Sub1) interface7);
        }
        if (Class336_Sub3.aClass170_8613 == class170) {
            return new Class66_Sub2(aClass302_4607, aClass302_4604, (Class150_Sub3) interface7);
        }
        if (class170 == Class106.aClass170_1357) {
            return new Class105(aClass302_4607, aClass302_4604, (Class98) interface7);
        }
        if (class170 == Class356.aClass170_4425) {
            return new Class83(aClass302_4607, (Class166) interface7);
        }
        if (Class270.aClass170_3476 == class170) {
            return new Class66_Sub2_Sub1(aClass302_4607, aClass302_4604, (Class150_Sub3_Sub1) interface7);
        }
        return null;
    }

    static void method4106(Index class302) {
        anInt4606++;
        Node_Sub38_Sub19.aClass302_10286 = class302;
    }

    private Class337 method4107() {
        anInt4603++;
        if (aClass337_4605 == null) {
            aClass337_4605 = new Class337();
        }
        return aClass337_4605;
    }

    Class373(Index class302, Index class302_0_) {
        aClass302_4604 = class302_0_;
        aClass302_4607 = class302;
    }

    static void method4108(EntityNode_Sub1 entitynode_sub1) {
        entitynode_sub1.anActor5925 = null;
        anInt4601++;
        if (Class4.anInt121 < 20) {
            Class336_Sub2.aClass103_8562.method1110(entitynode_sub1);
            Class4.anInt121++;
        }
    }
}
