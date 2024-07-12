/* Class361 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Component;

public class Class361 {
    protected int[] anIntArray4482;
    static int anInt4483;
    static int anInt4484;
    protected short[] aShortArray4485;
    static Class191 aClass191_4486;
    protected short[] aShortArray4487;
    protected long aLong4488;
    static int anInt4489;

    static boolean method4045(byte[] bs) {
        anInt4484++;
        BufferedStream buffer = new BufferedStream(bs);
        int i_0_ = buffer.readUnsignedByte();
        if (i_0_ != 2) {
            return false;
        }
        boolean bool = buffer.readUnsignedByte() == 1;
        if (bool) {
            Class160.method1729(buffer);
        }
        Node_Sub38_Sub36.method2904(-1, buffer);
        return true;
    }

    static void method4046(int i_1_, int i_2_) {
        anInt4489++;
        CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(3, 16, i_1_);
        cachenode_sub2.method2288();
        cachenode_sub2.anInt9434 = i_2_;
    }

    static Class291 method4047(Component component) {
        anInt4483++;
        return new Class291_Sub1(component);
    }

    public static void method4048() {
        aClass191_4486 = null;
    }

    Class361(long l, int[] is, short[] ses, short[] ses_3_) {
        aShortArray4485 = ses_3_;
        anIntArray4482 = is;
        aShortArray4487 = ses;
        aLong4488 = l;
    }

    protected Class361() {
        /* empty */
    }
}
