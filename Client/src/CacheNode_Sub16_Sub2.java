/* CacheNode_Sub16_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CacheNode_Sub16_Sub2 extends CacheNode_Sub16 {
    static int anInt11077;
    static int anInt11078;
    static IncommingPacket aClass192_11079;
    protected int anInt11080;
    protected MainFile aClass6_11081;
    static float aFloat11082;
    static int anInt11083;
    static int anInt11084;
    static int anInt11085 = 0;
    protected byte[] aByteArray11086;
    static int anInt11087;

    public static void method2390() {
        aClass192_11079 = null;
    }

    final int method2386() {
        anInt11077++;
        if (aBoolean9602) {
            return 0;
        }
        return 100;
    }

    static int method2391() {
        anInt11084++;
        return 15;
    }

    final byte[] method2385() {
        anInt11083++;
        if (aBoolean9602) {
            throw new RuntimeException();
        }
        return aByteArray11086;
    }

    static void method2392(int i) {
        Class253.anInt3201 = i;
        Class168.anInt2044 = 3;
        anInt11078++;
        Node_Sub38_Sub19.anInt10296 = -1;
        Node_Sub15_Sub4.anInt9800 = 100;
    }

    static {
        aClass192_11079 = new IncommingPacket(88, -2);
    }
}
