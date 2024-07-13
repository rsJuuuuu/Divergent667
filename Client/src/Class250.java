/* Class250 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Objects;
import java.util.Random;

public class Class250 {
    static boolean[][] aBooleanArrayArray3168;
    static int anInt3169;
    static int anInt3170;
    static int anInt3171;
    private final int[][] anIntArrayArray3172;
    private final boolean[] aBooleanArray3173;
    static int anInt3174;
    static boolean aBoolean3175 = false;
    static int anInt3176;
    private final Index aClass302_3177;
    private final int anInt3178;
    static Index aClass302_3179;

    final int[] method3091(int i, byte b) {
        anInt3174++;
        if (i < 0 || i >= anIntArrayArray3172.length) {
            if (anInt3178 != -1) {
                return new int[]{anInt3178};
            }
            return new int[0];
        }
        if (!aBooleanArray3173[i] || anIntArrayArray3172[i].length <= 1) {
            return anIntArrayArray3172[i];
        }
        int i_0_ = anInt3178 != -1 ? 1 : 0;
        Random random = new Random();
        int[] is = new int[anIntArrayArray3172[i].length];
        Class311.method3609(anIntArrayArray3172[i], 0, is, 0, is.length);
        if (b <= 97) {
            method3091(13, (byte) -73);
        }
        for (int i_1_ = i_0_; is.length > i_1_; i_1_++) {
            int i_2_ = i_0_ + Class330.method3838(-5208, -i_0_ + is.length, random);
            int i_3_ = is[i_1_];
            is[i_1_] = is[i_2_];
            is[i_2_] = i_3_;
        }
        return is;
    }

    final boolean method3092() {
        anInt3170++;
        return anInt3178 != -1;
    }

    final Class55 method3093(int i) {
        try {
            anInt3176++;
            byte[] bs = aClass302_3177.method3524(i, 1);
            Class55 class55 = new Class55();
            class55.method561(new BufferedStream(bs));
            return class55;
        } catch (RuntimeException runtimeexception) {
            throw Class126.method1537(runtimeexception, "oka.D(" + i + ',' + false + ')');
        }
    }

    public static void method3094() {
        aBooleanArrayArray3168 = null;
        aClass302_3179 = null;
    }

    static Class329 method3095(int i) {
        anInt3169++;
        Class329[] class329s = Class154.method1698(54);
        for (int i_5_ = 0; Objects.requireNonNull(class329s).length > i_5_; i_5_++) {
            Class329 class329 = class329s[i_5_];
            if (class329.anInt4123 == i) {
                return class329;
            }
        }
        return null;
    }

    static boolean method3096(int i) {
        anInt3171++;
        return !(i != 0 && i != 2);
    }

    Class250(Class353 class353, int i, Index class302) {
        aClass302_3177 = class302;
        aClass302_3177.method3537(1);
        BufferedStream buffer = new BufferedStream(aClass302_3177.method3524(0, 0));
        int i_7_ = buffer.readUnsignedByte();
        if (i_7_ <= 3) {
            int i_8_ = buffer.readUnsignedByte();
            Class170[] class170s = Class262_Sub13.method3184();
            boolean bool = true;
            if (i_8_ == class170s.length) {
                for (Class170 class170 : class170s) {
                    int i_10_ = buffer.readUnsignedByte();
                    if (i_10_ != class170.anInt2047) {
                        bool = false;
                        break;
                    }
                }
            } else {
                bool = false;
            }
            if (bool) {
                int i_11_ = buffer.readUnsignedByte();
                int i_12_ = buffer.readUnsignedByte();
                if (i_7_ > 2) {
                    anInt3178 = buffer.readShort();
                } else {
                    anInt3178 = -1;
                }
                anIntArrayArray3172 = new int[1 + i_12_][];
                aBooleanArray3173 = new boolean[i_12_ + 1];
                for (int i_13_ = 0; i_11_ > i_13_; i_13_++) {
                    int i_14_ = buffer.readUnsignedByte();
                    aBooleanArray3173[i_14_] = buffer.readUnsignedByte() == 1;
                    int i_15_ = buffer.readUnsignedShort();
                    if (anInt3178 == -1) {
                        anIntArrayArray3172[i_14_] = new int[i_15_];
                        for (int i_17_ = 0; i_17_ < i_15_; i_17_++)
                            anIntArrayArray3172[i_14_][i_17_] = buffer.readUnsignedShort();
                    } else {
                        anIntArrayArray3172[i_14_] = new int[1 + i_15_];
                        anIntArrayArray3172[i_14_][0] = anInt3178;
                        for (int i_16_ = 0; i_16_ < i_15_; i_16_++)
                            anIntArrayArray3172[i_14_][1 + i_16_] = buffer.readUnsignedShort();
                    }
                }
                for (int i_18_ = 0; i_18_ < i_12_ + 1; i_18_++) {
                    if (anIntArrayArray3172[i_18_] == null) {
                        if (anInt3178 == -1) {
                            anIntArrayArray3172[i_18_] = new int[0];
                        } else {
                            anIntArrayArray3172[i_18_] = new int[]{anInt3178};
                        }
                    }
                }
            } else {
                aBooleanArray3173 = new boolean[0];
                anIntArrayArray3172 = new int[0][];
                anInt3178 = -1;
            }
        } else {
            aBooleanArray3173 = new boolean[0];
            anInt3178 = -1;
            anIntArrayArray3172 = new int[0][];
        }
    }

    static {
        aBooleanArrayArray3168 = new boolean[][]{new boolean[4], {false, true, true, false}, {true, false, true, false}, {true, false, true, false}, {false, false, true, false}, {false, false, true, false}, {true, false, true, false}, {true, false, false, true}, {true, false, false, true}, {true, true, false, false}, new boolean[4], {false, true, false, true}, new boolean[4]};
    }
}
