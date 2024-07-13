/* Class34_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Objects;

public class Class34_Sub1 extends Class34 {
    static int anInt5513;
    private final HashTable aHashTable5514;
    static int anInt5515;
    static int anInt5516;
    static int anInt5517;
    static int anInt5518;
    private CacheNode_Sub16 aCacheNode_Sub16_5519;
    private final MainFile aClass6_5520;
    static int anInt5521;
    private final int anInt5522;
    static int anInt5523;
    private final int anInt5524;
    private byte[] aByteArray5525;
    private final byte[] aByteArray5526;
    static int anInt5527;
    static int[] SKILL_REAL_LEVEL = new int[25];
    static int anInt5529;
    private final Class141 aClass141_5530;
    static int anInt5531;
    static int anInt5532;
    static int anInt5533;
    static int anInt5534;
    private final Class266 aClass266_5535;
    private final int anInt5536;
    private int anInt5537 = 0;
    static int anInt5538;
    private final MainFile aClass6_5539;
    private ReferenceTable anArchive5540;
    private final Class312 aClass312_5541;
    private int anInt5542;
    private boolean aBoolean5543;
    private Class312 aClass312_5544;
    private boolean aBoolean5545;
    private final boolean aBoolean5546;
    private long aLong5547;

    static void method375(int i, boolean bool, int i_0_, int i_1_, byte b, int i_2_) {
        anInt5523++;
        if (i_2_ < 1) {
            i_2_ = 1;
        }
        if (i_1_ < 1) {
            i_1_ = 1;
        }
        if (b <= -80) {
            int i_3_ = i_1_ - 334;
            if (i_3_ < 0) {
                i_3_ = 0;
            } else if (i_3_ > 100) {
                i_3_ = 100;
            }
            int i_4_ = (Node_Sub29_Sub3.aShort10026 - Node_Sub29_Sub3.aShort10027) * i_3_ / 100 + Node_Sub29_Sub3.aShort10027;
            if (Class18.aShort310 <= i_4_) {
                if (OutcommingPacket.aShort4053 < i_4_) {
                    i_4_ = OutcommingPacket.aShort4053;
                }
            } else {
                i_4_ = Class18.aShort310;
            }
            int i_5_ = i_1_ * (i_4_ * 512) / (334 * i_2_);
            if (Class291.aShort3667 <= i_5_) {
                if (Animable_Sub2_Sub2.aShort10750 < i_5_) {
                    i_5_ = Animable_Sub2_Sub2.aShort10750;
                    i_4_ = 334 * (i_5_ * i_2_) / (512 * i_1_);
                    if (i_4_ < Class18.aShort310) {
                        i_4_ = Class18.aShort310;
                        int i_6_ = 334 * (i_2_ * i_5_) / (i_4_ * 512);
                        int i_7_ = (i_1_ - i_6_) / 2;
                        if (bool) {
                            Class93.aGraphicsToolkit1241.la();
                            Class93.aGraphicsToolkit1241.method1239(i_2_, i_7_, i_0_, i, -16777216);
                            Class93.aGraphicsToolkit1241.method1239(i_2_, i_7_, i_0_ + i_1_ - i_7_, i, -16777216);
                        }
                        i_1_ -= 2 * i_7_;
                        i_0_ += i_7_;
                    }
                }
            } else {
                i_5_ = Class291.aShort3667;
                i_4_ = i_5_ * i_2_ * 334 / (512 * i_1_);
                if (OutcommingPacket.aShort4053 < i_4_) {
                    i_4_ = OutcommingPacket.aShort4053;
                    int i_8_ = i_4_ * i_1_ * 512 / (i_5_ * 334);
                    int i_9_ = (-i_8_ + i_2_) / 2;
                    if (bool) {
                        Class93.aGraphicsToolkit1241.la();
                        Class93.aGraphicsToolkit1241.method1239(i_9_, i_1_, i_0_, i, -16777216);
                        Class93.aGraphicsToolkit1241.method1239(i_9_, i_1_, i_0_, -i_9_ + i_2_ + i, -16777216);
                    }
                    i += i_9_;
                    i_2_ -= 2 * i_9_;
                }
            }
            Translation.anInt428 = i;
            Class111.anInt1418 = (short) i_1_;
            Class339_Sub6.anInt8713 = i_4_ * i_1_ / 334;
            Mobile_Sub2.anInt10722 = i_0_;
            Class132.anInt1684 = (short) i_2_;
        }
    }

    final int method376() {
        anInt5533++;
        if (method374() == null) {
            if (aCacheNode_Sub16_5519 == null) {
                return 0;
            }
            return aCacheNode_Sub16_5519.method2386();
        }
        return 100;
    }

    final int method377() {
        anInt5515++;
        if (anArchive5540 == null) {
            return 0;
        }
        return anArchive5540.anInt294;
    }

    static void method378() {
        Node_Sub38_Sub8.method2813();
        anInt5521++;
        int i_11_ = Class213.aNode_Sub27_2512.aClass320_Sub3_7298.method3691();
        if (i_11_ == 2) {
            CacheNode.method2279(Class205.screenHeight, Class360.screenWidth, Class93.aGraphicsToolkit1241);
        } else if (i_11_ == 3) {
            Class64.method711(Class93.aGraphicsToolkit1241, Class360.screenWidth, Translation.anInt432, Node_Sub36_Sub1.anInt10039, Class205.screenHeight);
        }
        if (Class213.aNode_Sub27_2512.aClass320_Sub3_7298.method3689((byte) 122)) {
            Index.method3535(Node_Sub38_Sub20.aCanvas10309);
        }
        if (Class93.aGraphicsToolkit1241 != null) {
            Class116.method1163();
        }
        Node_Sub15_Sub10.aBoolean9850 = Class213.aNode_Sub27_2512.aClass320_Sub3_7298.method3691() != 0;
        Class71.aBoolean967 = Class213.aNode_Sub27_2512.aClass320_Sub3_7298.method3689((byte) 125);
    }

    final void method368(int i_12_) {
        anInt5527++;
        if (aClass6_5539 != null) {
            for (Node node = aClass312_5541.method3613(); node != null; node = aClass312_5541.method3620(16776960)) {
                if ((long) i_12_ == node.aLong2797) {
                    return;
                }
            }
            Node node = new Node();
            node.aLong2797 = i_12_;
            aClass312_5541.method3625(node);
        }
    }

    final int method379() {
        anInt5538++;
        if (anArchive5540 == null) {
            return 0;
        }
        if (!aBoolean5543) {
            return anArchive5540.anInt294;
        }
        Node node = aClass312_5544.method3613();
        if (node == null) {
            return 0;
        }
        return (int) node.aLong2797;
    }

    final void method380(int i) {
        anInt5532++;
        if (aClass312_5544 != null) {
            if (method374() == null) {
                return;
            }
            if (aBoolean5543) {
                boolean bool = true;
                for (Node node = aClass312_5544.method3613(); node != null; node = aClass312_5544.method3620(16776960)) {
                    int i_14_ = (int) node.aLong2797;
                    if (aByteArray5525[i_14_] == 0) {
                        method383(i_14_, 1, -1);
                    }
                    if (aByteArray5525[i_14_] == 0) {
                        bool = false;
                    } else {
                        node.method2160((byte) 122);
                    }
                }
                while (anArchive5540.anIntArray295.length > anInt5542) {
                    if (anArchive5540.anIntArray295[anInt5542] == 0) {
                        anInt5542++;
                    } else {
                        if (aClass141_5530.anInt1753 >= 250) {
                            bool = false;
                            break;
                        }
                        if (aByteArray5525[anInt5542] == 0) {
                            method383(anInt5542, 1, -1);
                        }
                        if (aByteArray5525[anInt5542] == 0) {
                            Node node = new Node();
                            node.aLong2797 = anInt5542;
                            bool = false;
                            aClass312_5544.method3625(node);
                        }
                        anInt5542++;
                    }
                }
                if (bool) {
                    anInt5542 = 0;
                    aBoolean5543 = false;
                }
            } else if (aBoolean5545) {
                boolean bool = true;
                for (Node node = aClass312_5544.method3613(); node != null; node = aClass312_5544.method3620(16776960)) {
                    int i_13_ = (int) node.aLong2797;
                    if (aByteArray5525[i_13_] != 1) {
                        method383(i_13_, 2, -1);
                    }
                    if (aByteArray5525[i_13_] == 1) {
                        node.method2160((byte) 108);
                    } else {
                        bool = false;
                    }
                }
                while (anArchive5540.anIntArray295.length > anInt5542) {
                    if (anArchive5540.anIntArray295[anInt5542] == 0) {
                        anInt5542++;
                    } else {
                        if (aClass266_5535.method3239(255)) {
                            bool = false;
                            break;
                        }
                        if (aByteArray5525[anInt5542] != 1) {
                            method383(anInt5542, 2, i - 1);
                        }
                        if (aByteArray5525[anInt5542] != 1) {
                            Node node = new Node();
                            node.aLong2797 = anInt5542;
                            aClass312_5544.method3625(node);
                            bool = false;
                        }
                        anInt5542++;
                    }
                }
                if (bool) {
                    anInt5542 = 0;
                    aBoolean5545 = false;
                }
            } else {
                aClass312_5544 = null;
            }
        }
        if (aBoolean5546 && aLong5547 <= Class313.method3650()) {
            for (CacheNode_Sub16 cachenode_sub16 = (CacheNode_Sub16) aHashTable5514.method1516(); cachenode_sub16 != null; cachenode_sub16 = (CacheNode_Sub16) aHashTable5514.method1520(99)) {
                if (!cachenode_sub16.aBoolean9602) {
                    if (cachenode_sub16.aBoolean9597) {
                        if (!cachenode_sub16.aBoolean9598) {
                            throw new RuntimeException();
                        }
                        cachenode_sub16.method2160((byte) 121);
                    } else {
                        cachenode_sub16.aBoolean9597 = true;
                    }
                }
            }
            aLong5547 = 1000L + Class313.method3650();
        }
        if (i != 0) {
            method380(-72);
        }
    }

    final int method381() {
        anInt5534++;
        return anInt5537;
    }

    static void quicksortAnimables(Animable[] animables, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int midpoint = (lo + hi) / 2;
        int i = lo;
        Animable pivotAnimable = animables[midpoint];
        animables[midpoint] = animables[hi];
        animables[hi] = pivotAnimable;
        int pivot = pivotAnimable.anInt5944;
        for (int j = lo; j < hi; j++) {
            // j & 0x1 added to keep partitions balanced when there are a lot of equal elements?
            if (animables[j].anInt5944 > pivot + (j & 0x1)) {
                Animable next = animables[j];
                animables[j] = animables[i];
                animables[i++] = next;
            }
        }
        animables[hi] = animables[i];
        animables[i] = pivotAnimable;
        quicksortAnimables(animables, lo, i - 1);
        quicksortAnimables(animables, i + 1, hi);
    }

    final byte[] method373(int i, byte b) {
        anInt5513++;
        CacheNode_Sub16 cachenode_sub16 = method383(i, 0, -1);
        if (cachenode_sub16 == null) {
            return null;
        }
        if (b < 46) {
            anInt5537 = 39;
        }
        byte[] bs = cachenode_sub16.method2385();
        cachenode_sub16.method2160((byte) 100);
        return bs;
    }

    private CacheNode_Sub16 method383(int i, int i_21_, int i_22_) {
        anInt5516++;
        if (i_22_ != -1) {
            return null;
        }
        CacheNode_Sub16 cachenode_sub16 = (CacheNode_Sub16) aHashTable5514.method1518(3512, i);
        if (cachenode_sub16 != null && i_21_ == 0 && !cachenode_sub16.aBoolean9598 && cachenode_sub16.aBoolean9602) {
            cachenode_sub16.method2160((byte) 57);
            cachenode_sub16 = null;
        }
        if (cachenode_sub16 == null) {
            if (i_21_ == 0) {
                if (aClass6_5539 == null || aByteArray5525[i] == -1) {
                    if (aClass266_5535.method3244()) {
                        return null;
                    }
                    cachenode_sub16 = aClass266_5535.method3247(anInt5524, i, true, (byte) 2);
                } else {
                    cachenode_sub16 = aClass141_5530.method1612(aClass6_5539, i);
                }
            } else if (i_21_ == 1) {
                if (aClass6_5539 == null) {
                    throw new RuntimeException();
                }
                cachenode_sub16 = aClass141_5530.method1617(aClass6_5539, i);
            } else if (i_21_ == 2) {
                if (aClass6_5539 == null) {
                    throw new RuntimeException();
                }
                if (aByteArray5525[i] != -1) {
                    throw new RuntimeException();
                }
                if (aClass266_5535.method3239(i_22_ ^ -256)) {
                    return null;
                } else {
                    cachenode_sub16 = aClass266_5535.method3247(anInt5524, i, false, (byte) 2);
                }
            } else {
                throw new RuntimeException();
            }
            aHashTable5514.method1515(i, cachenode_sub16, i_22_ - 125);
        }
        if (cachenode_sub16.aBoolean9602) {
            return null;
        }
        byte[] bs = cachenode_sub16.method2385();
        if (cachenode_sub16 instanceof CacheNode_Sub16_Sub2) {
            try {
                if (bs == null || bs.length <= 2) {
                    throw new RuntimeException();
                }
                Class7.aCRC32_163.reset();
                Class7.aCRC32_163.update(bs, 0, bs.length - 2);
                int i_23_ = (int) Class7.aCRC32_163.getValue();
                if (!(anInt5524 == 8 & i == 2498)) {
                    if (i_23_ != anArchive5540.anIntArray299[i]) {
                        //System.out.println("error crc "+i_23_+", "+anArchive5540.anIntArray299[i]);
                        //if(anInt5524 != 37)
                        throw new RuntimeException();
                    }
                }
                if (anArchive5540.aByteArrayArray298 != null && anArchive5540.aByteArrayArray298[i] != null) {
                    byte[] bs_24_ = anArchive5540.aByteArrayArray298[i];
                    byte[] bs_25_ = GLXToolkit.generateWhirpoolHash((byte) 126, bs, -2 + bs.length, 0);
                    for (int i_26_ = 0; i_26_ < 64; i_26_++) {
                        if (Objects.requireNonNull(bs_25_)[i_26_] != bs_24_[i_26_]) {
                            //System.out.println("error hash");
                            throw new RuntimeException();
                        }
                    }
                }
                int i_27_ = (bs[-1 + bs.length] & 0xff) + (0xff00 & bs[bs.length - 2] << 8);
                if (!(anInt5524 == 8 & i == 2498)) {
                    if ((0xffff & anArchive5540.anIntArray293[i]) != i_27_) {
                        //System.out.println("error rev "+i_27_+", "+anArchive5540.anIntArray293[i]);

                        throw new RuntimeException();
                    }
                }
                if (aByteArray5525[i] != 1) {
                    anInt5537++;
                    aByteArray5525[i] = (byte) 1;
                }
                if (!cachenode_sub16.aBoolean9598) {
                    cachenode_sub16.method2160((byte) 81);
                }
                return cachenode_sub16;
            } catch (Exception exception) {
                aByteArray5525[i] = (byte) -1;
                cachenode_sub16.method2160((byte) 67);
                if (cachenode_sub16.aBoolean9598 && !aClass266_5535.method3244()) {
                    CacheNode_Sub16_Sub1 cachenode_sub16_sub1 = aClass266_5535.method3247(anInt5524, i, true, (byte) 2);
                    aHashTable5514.method1515(i, cachenode_sub16_sub1, -123);
                }
                return null;
            }
        }
        try {
            if (bs == null || bs.length <= 2) {
                throw new RuntimeException();
            }
            Class7.aCRC32_163.reset();
            Class7.aCRC32_163.update(bs, 0, -2 + bs.length);
            int i_28_ = (int) Class7.aCRC32_163.getValue();
            if (!(anInt5524 == 8 & i == 2498)) {
                if (anArchive5540.anIntArray299[i] != i_28_) {
                    //System.out.println("error2 crc "+anInt5524+", "+i);
                    throw new RuntimeException();
                }
            }
            if (anArchive5540.aByteArrayArray298 != null && anArchive5540.aByteArrayArray298[i] != null) {
                byte[] bs_29_ = anArchive5540.aByteArrayArray298[i];
                byte[] bs_30_ = GLXToolkit.generateWhirpoolHash((byte) 127, bs, -2 + bs.length, 0);
                for (int i_31_ = 0; i_31_ < 64; i_31_++) {
                    if (Objects.requireNonNull(bs_30_)[i_31_] != bs_29_[i_31_]) {
                        //System.out.println("error2 hash");
                        throw new RuntimeException();
                    }
                }
            }
            aClass266_5535.anInt3394 = 0;
            aClass266_5535.anInt3393 = 0;
        } catch (RuntimeException runtimeexception) {
            //made it request file again instead of crashing
            aClass266_5535.method3233();
            cachenode_sub16.method2160((byte) 118);
            if (cachenode_sub16.aBoolean9598 && !aClass266_5535.method3244()) {
                CacheNode_Sub16_Sub1 cachenode_sub16_sub1 = aClass266_5535.method3247(anInt5524, i, true, (byte) 2);
                aHashTable5514.method1515(i, cachenode_sub16_sub1, -124);
            }
            //	runtimeexception.printStackTrace();
		/*	aByteArray5525[i] = (byte) -1;
			cachenode_sub16.method2160((byte) 67);
			if (cachenode_sub16.aBoolean9598 && !aClass266_5535.method3244(24365)) {
				CacheNode_Sub16_Sub1 cachenode_sub16_sub1 = aClass266_5535.method3247(anInt5524, i, (byte) -79, true, (byte) 2);
				aHashTable5514.method1515((long) i, cachenode_sub16_sub1, -123);
			}
			return null;*/
        }
        Objects.requireNonNull(bs)[bs.length - 2] = (byte) (anArchive5540.anIntArray293[i] >>> 8);
        bs[bs.length - 1] = (byte) anArchive5540.anIntArray293[i];
        if (aClass6_5539 != null) {
            aClass141_5530.method1616(bs, i, aClass6_5539);
            if (aByteArray5525[i] != 1) {
                anInt5537++;
                aByteArray5525[i] = (byte) 1;
            }
        }
        if (!cachenode_sub16.aBoolean9598) {
            cachenode_sub16.method2160((byte) 112);
        }
        return cachenode_sub16;
    }

    public static void method384() {
        SKILL_REAL_LEVEL = null;
    }

    final int method369(int i) {
        anInt5518++;
        CacheNode_Sub16 cachenode_sub16 = (CacheNode_Sub16) aHashTable5514.method1518(3512, i);
        if (cachenode_sub16 != null) {
            return cachenode_sub16.method2386();
        }
        return 0;
    }

    final void method385() {
        anInt5517++;
        if (aClass312_5544 != null && method374() != null) {
            for (Node node = aClass312_5541.method3613(); node != null; node = aClass312_5541.method3620(16776960)) {
                int i = (int) node.aLong2797;
                if (i < 0 || i >= anArchive5540.anInt296 || anArchive5540.anIntArray295[i] == 0) {
                    node.method2160((byte) 98);
                } else {
                    if (aByteArray5525[i] == 0) {
                        method383(i, 1, -1);
                    }
                    if (aByteArray5525[i] == -1) {
                        method383(i, 2, -1);
                    }
                    if (aByteArray5525[i] == 1) {
                        node.method2160((byte) 67);
                    }
                }
            }
        }
    }

    final ReferenceTable method374() {
        anInt5529++;
        if (anArchive5540 != null) {
            return anArchive5540;
        }
        if (aCacheNode_Sub16_5519 == null) {
            if (aClass266_5535.method3244()) {
                return null;
            }
            aCacheNode_Sub16_5519 = aClass266_5535.method3247(255, anInt5524, true, (byte) 0);
        }
        if (aCacheNode_Sub16_5519.aBoolean9602) {
            return null;
        }
        byte[] bs = aCacheNode_Sub16_5519.method2385();
        if (aCacheNode_Sub16_5519 instanceof CacheNode_Sub16_Sub2) {
            try {
                if (bs == null) {
                    throw new RuntimeException();
                }
                anArchive5540 = new ReferenceTable(bs, anInt5522, aByteArray5526);
                if (anArchive5540.anInt292 != anInt5536) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException runtimeexception) {
                anArchive5540 = null;
                if (aClass266_5535.method3244()) {
                    aCacheNode_Sub16_5519 = null;
                } else {
                    aCacheNode_Sub16_5519 = aClass266_5535.method3247(255, anInt5524, true, (byte) 0);
                }
                return null;
            }
        } else {
            try {
                if (bs == null) {
                    throw new RuntimeException();
                }
                anArchive5540 = new ReferenceTable(bs, anInt5522, aByteArray5526);
            } catch (RuntimeException runtimeexception) {
                aClass266_5535.method3233();
                anArchive5540 = null;
                if (aClass266_5535.method3244()) {
                    aCacheNode_Sub16_5519 = null;
                } else {
                    aCacheNode_Sub16_5519 = aClass266_5535.method3247(255, anInt5524, true, (byte) 0);
                }
                return null;
            }
            if (aClass6_5520 != null) {
                aClass141_5530.method1616(bs, anInt5524, aClass6_5520);
            }
        }
        if (aClass6_5539 != null) {
            aByteArray5525 = new byte[anArchive5540.anInt296];
            anInt5537 = 0;
        }
        aCacheNode_Sub16_5519 = null;
        return anArchive5540;
    }

    final void method386() {
        anInt5531++;
        if (aClass6_5539 != null) {
            aBoolean5545 = true;
            if (aClass312_5544 == null) {
                aClass312_5544 = new Class312();
            }
        }
    }

    Class34_Sub1(int i, MainFile class6, MainFile class6_32_, Class266 class266, Class141 class141, int i_33_, byte[] bs, int i_34_) {
        aHashTable5514 = new HashTable(16);
        anInt5542 = 0;
        aClass312_5541 = new Class312();
        aLong5547 = 0L;
        anInt5524 = i;
        aClass6_5539 = class6;
        if (aClass6_5539 == null) {
            aBoolean5543 = false;
        } else {
            aBoolean5543 = true;
            aClass312_5544 = new Class312();
        }
        aBoolean5546 = true;
        aClass266_5535 = class266;
        anInt5522 = i_33_;
        anInt5536 = i_34_;
        aClass141_5530 = class141;
        aByteArray5526 = bs;
        aClass6_5520 = class6_32_;
        if (aClass6_5520 != null) {
            aCacheNode_Sub16_5519 = aClass141_5530.method1612(aClass6_5520, anInt5524);
        }
    }
}
