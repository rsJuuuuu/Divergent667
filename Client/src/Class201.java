/* Class201 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class201 {
    static int anInt2441;
    static byte[] aByteArray2442;
    static int anInt2443;
    static int anInt2444;
    static int anInt2445;
    static int anInt2446 = 64;

    static void method2019() {
        anInt2445++;
        int i_0_ = Class194.aByteArrayArray2373.length;
        for (int i_1_ = 0; i_0_ > i_1_; i_1_++) {
            if (Class194.aByteArrayArray2373[i_1_] != null) {
                int i_2_ = -1;
                for (int i_3_ = 0; Class262_Sub5.anInt7739 > i_3_; i_3_++) {
                    if (Class262_Sub1.MAP_REGION_HASHES[i_1_] == Class320_Sub5.anIntArray8255[i_3_]) {
                        i_2_ = i_3_;
                        break;
                    }
                }
                if (i_2_ == -1) {
                    Class320_Sub5.anIntArray8255[Class262_Sub5.anInt7739] = Class262_Sub1.MAP_REGION_HASHES[i_1_];
                    i_2_ = Class262_Sub5.anInt7739++;
                }
                BufferedStream buffer = new BufferedStream(Class194.aByteArrayArray2373[i_1_]);
                int i_4_ = 0;
                while (Class194.aByteArrayArray2373[i_1_].length > buffer.offset) {
                    if (i_4_ >= 511 || Node_Sub25_Sub3.localNPCsCount >= 1023) {
                        break;
                    }
                    int i_5_ = i_2_ | i_4_++ << 6;
                    int i_6_ = buffer.readUnsignedShort();
                    int i_7_ = i_6_ >> 14;
                    int i_8_ = (i_6_ & 0x1f87) >> 7;
                    int i_9_ = 0x3f & i_6_;
                    int i_10_ = i_8_ - Node_Sub53.gameSceneBaseX + (Class262_Sub1.MAP_REGION_HASHES[i_1_] >> 8) * 64;
                    int i_11_ = 64 * (Class262_Sub1.MAP_REGION_HASHES[i_1_] & 0xff) - Class320_Sub4.gameSceneBaseY + i_9_;
                    NpcDefinition npcdefinition = Class366.aClass279_4526.getNPCDefinitions(buffer.readUnsignedShort());
                    Node_Sub41 node_sub41 = (Node_Sub41) Class12.aHashTable187.method1518(3512, i_5_);
                    if (node_sub41 == null && (0x1 & npcdefinition.aByte2816) > 0 && i_7_ == Class94.anInt1249 && i_10_ >= 0 && Node_Sub54.GAME_SCENE_WDITH > npcdefinition.anInt2811 + i_10_ && i_11_ >= 0 && Class377_Sub1.GAME_SCENE_HEIGHT > i_11_ + npcdefinition.anInt2811) {
                        Npc npc = new Npc();
                        npc.index = i_5_;
                        Node_Sub41 node_sub41_12_ = new Node_Sub41(npc);
                        Class12.aHashTable187.method1515(i_5_, node_sub41_12_, -127);
                        Class314.LocalNPCs[Node_Sub32.cachedNPCcsCount++] = node_sub41_12_;
                        Class54.LocalNPCsIndexes[Node_Sub25_Sub3.localNPCsCount++] = i_5_;
                        npc.anInt10880 = Class174.clientCycle;
                        npc.method879(npcdefinition);
                        npc.method861(npc.aNpcDefinition11122.anInt2811);
                        npc.anInt10890 = npc.aNpcDefinition11122.anInt2876 << 3;
                        npc.method849((-2141192185 & 4 + npc.aNpcDefinition11122.aByte2873) << 11, -88, true);
                        npc.method877(true, i_11_, i_10_, i_7_, npc.getSize((byte) 119));
                    }
                }
            }
        }
    }

    abstract byte[] method2020(int i_13_);

    abstract void method2021(byte[] bs);

    abstract byte[] method2022();

    static void method2023(GraphicsToolkit graphicstoolkit) {
        anInt2441++;
        if (Class69.aClass312_940.method3615(-78) != 0) {
            if (Class213.aNode_Sub27_2512.aClass320_Sub29_7270.method3791() == 0) {
                for (Node_Sub30 node_sub30 = (Node_Sub30) Class69.aClass312_940.method3613(); node_sub30 != null; node_sub30 = (Node_Sub30) Class69.aClass312_940.method3620(16776960)) {
                    EntityNode_Sub3_Sub1.aClass86_9166.method1002(node_sub30.anInt7358, graphicstoolkit, graphicstoolkit, node_sub30.aBoolean7355 ? Class295.myPlayer.aPlayerDefinition11137 : null, false, node_sub30.anInt7356, node_sub30.anInt7352, false, node_sub30.anInt7354, CacheNode_Sub18.aClass52_9609, node_sub30.anInt7361);
                    node_sub30.method2160((byte) 52);
                }
                Class320_Sub21.method3764(-118);
            } else {
                if (Class88.aGraphicsToolkit5280 == null) {
                    java.awt.Canvas canvas = new java.awt.Canvas();
                    canvas.setSize(36, 32);
                    Class88.aGraphicsToolkit5280 = Class262_Sub9.method3171(Class262_Sub2.index31, (byte) 96, TemporaryItemDefinition.aD565, 0, canvas, 0);
                    Class337.aClass52_4181 = Class88.aGraphicsToolkit5280.a(Class44.method461(Node_Sub50.anInt7625, AnimableAnimator_Sub1.aClass302_9091), Class383.method4187(Node_Sub38_Sub39.aClass302_10500, Node_Sub50.anInt7625), true);
                }
                for (Node_Sub30 node_sub30 = (Node_Sub30) Class69.aClass312_940.method3613(); node_sub30 != null; node_sub30 = (Node_Sub30) Class69.aClass312_940.method3620(-22880 + 16799840)) {
                    EntityNode_Sub3_Sub1.aClass86_9166.method1002(node_sub30.anInt7358, Class88.aGraphicsToolkit5280, graphicstoolkit, !node_sub30.aBoolean7355 ? null : Class295.myPlayer.aPlayerDefinition11137, false, node_sub30.anInt7356, node_sub30.anInt7352, false, node_sub30.anInt7354, Class337.aClass52_4181, node_sub30.anInt7361);
                    node_sub30.method2160((byte) 93);
                }
            }
        }
    }

    static void method2024(byte b) {
        if (Class143.aByteArray1773 != null) {
            Node_Sub23.method2633();
        } else if (Class336_Sub2.anInt8586 == -1) {
            Node_Sub38_Sub28.loginToLobby(Node_Sub5.password, Class243.username);
        } else {
            CacheNode_Sub20.method2407();
        }
        anInt2443++;
        if (b != -91) {
            method2024((byte) 56);
        }
    }

    public static void method2025() {

        aByteArray2442 = null;
    }
}
