/* Class262_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class262_Sub13 extends Class262
{
	static int anInt7794;
	static IncommingPacket aClass192_7795 = new IncommingPacket(4, 0);
	private int anInt7796;
	static int anInt7797;
	private int anInt7798;
	static int anInt7799;
	static int anInt7800 = 0;
	static Class257 aClass257_7801 = new Class257(9, -1);
	static int anInt7802;
	static int anInt7803;
	private int anInt7804;
	private int anInt7805;
	static int anInt7806 = 0;
	
	public static void method3181(byte b) {
		aClass257_7801 = null;
		aClass192_7795 = null;
		if (b != 125) {
			method3184(-45);
		}
	}
	
	static final void method3182(boolean bool) {
		anInt7802++;
		if (Class329.method3833((byte) -61, Class151.anInt1843)) {
			Class127.method1542(11582, false);
		} else {
			Class290_Sub7.aClass365_8135 = Class218.aClass123_2566.aClass365_1557;
			if (bool != false) {
				aClass257_7801 = null;
			}
			Class218.aClass123_2566.aClass365_1557 = null;
			Class48.method478(14, (byte) 123);
		}
	}
	
	static final void method3183(int i) {
		if (i == 9844) {
			anInt7797++;
			if (Node_Sub25_Sub2.aClass54Array9959 != null) {
				for (int i_0_ = 0; Class167.anInt2033 > i_0_; i_0_++)
					Node_Sub25_Sub2.aClass54Array9959[i_0_] = null;
				Node_Sub25_Sub2.aClass54Array9959 = null;
			}
			if (GLXToolkit.aClass54Array9292 != null) {
				for (int i_1_ = 0; i_1_ < NpcDefinition.anInt2885; i_1_++)
					GLXToolkit.aClass54Array9292[i_1_] = null;
				GLXToolkit.aClass54Array9292 = null;
			}
			if (IsaacCipher.aClass54Array1840 != null) {
				for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > (Class83.anInt5183 ^ 0xffffffff); i_2_++)
					IsaacCipher.aClass54Array1840[i_2_] = null;
				IsaacCipher.aClass54Array1840 = null;
			}
			Node_Sub44.aClass54Array7548 = null;
			Class240.anIntArrayArrayArray2948 = null;
			Node_Sub38.anIntArray7451 = null;
			Class144_Sub1.anInt6806 = Class331.anInt4130 = -1;
		}
	}
	
	Class262_Sub13(BufferedStream buffer) {
		super(buffer);
		anInt7796 = buffer.readUnsignedShort();
		anInt7805 = buffer.readUnsignedByte();
		anInt7804 = buffer.readUnsignedByte();
		anInt7798 = buffer.readUnsignedByte();
	}
	
	static final Class170[] method3184(int i) {
		if (i != 0) {
			aClass257_7801 = null;
		}
		anInt7794++;
		return new Class170[] { Node_Sub40.aClass170_7508, Class46.aClass170_680, Class169_Sub2.aClass170_8806, Class336_Sub3.aClass170_8613, Class96.aClass170_1273, Class262_Sub18.aClass170_7850, Class350.aClass170_5391, Class106.aClass170_1357, Class356.aClass170_4425, Class270.aClass170_3476 };
	}
	
	final void method3148(int i) {
		Class91.method1033(anInt7804, 0, anInt7796, anInt7798, anInt7805, 0);
		anInt7799++;
		if (i >= -102) {
			anInt7806 = 25;
		}
	}
	
	static final void method3185(byte b, EntityNode entitynode, EntityNode entitynode_3_) {
		anInt7803++;
		if (entitynode.anEntityNode1124 != null) {
			entitynode.method803(false);
		}
		entitynode.anEntityNode1126 = entitynode_3_;
		entitynode.anEntityNode1124 = entitynode_3_.anEntityNode1124;
		entitynode.anEntityNode1124.anEntityNode1126 = entitynode;
		entitynode.anEntityNode1126.anEntityNode1124 = entitynode;
		if (b < 45) {
			method3181((byte) 13);
		}
	}
}
