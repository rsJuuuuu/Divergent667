/* Class262_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class262_Sub10 extends Class262 {
	static int anInt7767;
	private int anInt7768;
	private int anInt7769;
	private int anInt7770;
	private int anInt7771;
	private int anInt7772;
	static int[] anIntArray7773 = new int[13];
	static int anInt7774;
	static Index aClass302_7776;

	public static void method3172(boolean bool) {
		aClass302_7776 = null;
		anIntArray7773 = null;
		if (bool != true) {
			anIntArray7773 = null;
		}
		Settings.LOGIN_RSA_EXPONENT = null;
	}

	static final void method3173(boolean bool) {
		anInt7774++;
		Packet packet = Class218.aClass123_2566.aPacket1570;
		packet.initBitAccess();
		int i = packet.readBits(8);
		if (Node_Sub25_Sub3.localNPCsCount > i) {
			for (int i_0_ = i; Node_Sub25_Sub3.localNPCsCount > i_0_; i_0_++)
				FileOnDisk.anIntArray1322[Class270_Sub2_Sub1.anInt10543++] = Class54.LocalNPCsIndexes[i_0_];
		}
		if (bool != false) {
			method3173(false);
		}
		if ((i ^ 0xffffffff) < (Node_Sub25_Sub3.localNPCsCount ^ 0xffffffff)) {
			throw new RuntimeException("gnpov1");
		}
		Node_Sub25_Sub3.localNPCsCount = 0;
		for (int i_1_ = 0; i > i_1_; i_1_++) {
			int i_2_ = Class54.LocalNPCsIndexes[i_1_];
			Npc npc = ((Node_Sub41) Class12.aHashTable187.method1518(3512,
					(long) i_2_)).aNpc7518;
			int i_3_ = packet.readBits(1);
			if (i_3_ == 0) {
				Class54.LocalNPCsIndexes[Node_Sub25_Sub3.localNPCsCount++] = i_2_;
				npc.anInt10880 = Plane.anInt3423;
			} else {
				int i_4_ = packet.readBits(2);
				if (i_4_ == 0) {
					Class54.LocalNPCsIndexes[Node_Sub25_Sub3.localNPCsCount++] = i_2_;
					npc.anInt10880 = Plane.anInt3423;
					Class194_Sub1_Sub1.anIntArray9370[Node_Sub38_Sub6.anInt10132++] = i_2_;
				} else if ((i_4_ ^ 0xffffffff) == -2) {
					Class54.LocalNPCsIndexes[Node_Sub25_Sub3.localNPCsCount++] = i_2_;
					npc.anInt10880 = Plane.anInt3423;
					int walkDir = packet.readBits(3);
					npc.method876(1, walkDir, (byte) -111);
					int i_6_ = packet.readBits(1);
					if (i_6_ == 1) {
						Class194_Sub1_Sub1.anIntArray9370[Node_Sub38_Sub6.anInt10132++] = i_2_;
					}
				} else if (i_4_ == 2) {
					Class54.LocalNPCsIndexes[Node_Sub25_Sub3.localNPCsCount++] = i_2_;
					npc.anInt10880 = Plane.anInt3423;
					if ((packet.readBits(1) ^ 0xffffffff) == -2) {
						int walkDir = packet.readBits(3);
						npc.method876(2, walkDir, (byte) -123);
						int runDir = packet.readBits(3);
						npc.method876(2, runDir, (byte) -113);
					} else {
						int i_9_ = packet.readBits(3);
						npc.method876(0, i_9_, (byte) -126);
					}
					int i_10_ = packet.readBits(1);
					if ((i_10_ ^ 0xffffffff) == -2) {
						Class194_Sub1_Sub1.anIntArray9370[Node_Sub38_Sub6.anInt10132++] = i_2_;
					}
				} else if ((i_4_ ^ 0xffffffff) == -4) {
					FileOnDisk.anIntArray1322[Class270_Sub2_Sub1.anInt10543++] = i_2_;
				}
			}
		}
	}

	Class262_Sub10(BufferedStream buffer) {
		super(buffer);
		anInt7772 = buffer.readUnsignedShort();
		anInt7771 = buffer.readUnsignedShort();
		anInt7770 = buffer.readUnsignedShort();
		anInt7768 = buffer.readUnsignedShort();
		anInt7769 = buffer.readUnsignedShort();
	}

	final void method3148(int i) {
		Class188_Sub1_Sub1.method1895(anInt7772, false, 100, (byte) 21,
				anInt7771, anInt7770, 100);
		if (i < -102) {
			anInt7767++;
			Node_Sub38_Sub24.method2868(3, 0, anInt7769, anInt7768);
			Class320_Sub18.aBoolean8375 = true;
		}
	}
}
