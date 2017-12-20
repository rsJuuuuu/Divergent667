/* Class262_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class262_Sub1 extends Class262
{
	static Class124 aClass124_7696 = new Class124(2);
	static int anInt7697;
	private String aString7698;
	private int anInt7699;
	private int anInt7700;
	private int anInt7701;
	static int anInt7702;
	static int anInt7703;
	static int[] MAP_REGION_HASHES;
	
	final void method3148(int i) {
		if (i >= -102) {
			method3149((byte) 7);
		}
		Class121.aClass206Array1529[anInt7699].method2037(-67).method864(anInt7700, aString7698, false, 0, anInt7701);
		anInt7697++;
	}
	
	public static void method3149(byte b) {
		MAP_REGION_HASHES = null;
		aClass124_7696 = null;
		@SuppressWarnings("unused")
		int i = -50 % ((b - 18) / 40);
	}
	
	Class262_Sub1(BufferedStream buffer) {
		super(buffer);
		anInt7699 = buffer.readUnsignedShort();
		aString7698 = buffer.readString();
		anInt7701 = buffer.readInt();
		anInt7700 = buffer.readUnsignedShort();
	}
	
	static final void method3150(int i, Player player, int i_0_, int i_1_, Npc npc, ObjectDefinition objectdefinition, byte b, int i_2_) {
		anInt7703++;
		Node_Sub47 node_sub47 = new Node_Sub47();
		node_sub47.anInt7560 = i;
		if (b == -8) {
			node_sub47.anInt7569 = i_0_ << 9;
			node_sub47.anInt7563 = i_1_ << 9;
			if (objectdefinition == null) {
				if (npc != null) {
					node_sub47.aNpc7583 = npc;
					NpcDefinition npcdefinition = npc.aNpcDefinition11122;
					if (npcdefinition.anIntArray2827 != null) {
						node_sub47.aBoolean7574 = true;
						npcdefinition = npcdefinition.method2999(65535, Class24.aClass275_442);
					}
					if (npcdefinition != null) {
						node_sub47.anInt7582 = npcdefinition.anInt2811 + i_0_ << 9;
						node_sub47.anInt7559 = i_1_ - -npcdefinition.anInt2811 << 9;
						node_sub47.anInt7564 = Class266.method3243(-31, npc);
						node_sub47.anInt7566 = npcdefinition.anInt2862 << 9;
						node_sub47.anInt7570 = npcdefinition.anInt2828;
						node_sub47.anInt7571 = npcdefinition.anInt2844;
						node_sub47.aBoolean7580 = npcdefinition.aBoolean2883;
						node_sub47.anInt7567 = npcdefinition.anInt2864 << 9;
						node_sub47.anInt7572 = npcdefinition.anInt2852;
					}
					Class200_Sub2.aClass312_4942.method3625((byte) -54, node_sub47);
				} else if (player != null) {
					node_sub47.aPlayer7573 = player;
					node_sub47.anInt7582 = i_0_ + player.getSize((byte) 46) << 9;
					node_sub47.anInt7559 = player.getSize((byte) 77) + i_1_ << 9;
					node_sub47.anInt7564 = Class172.method1797(-1, player);
					node_sub47.anInt7567 = player.anInt11164 << 9;
					node_sub47.anInt7572 = 256;
					node_sub47.anInt7571 = 256;
					node_sub47.anInt7570 = player.anInt11173;
					node_sub47.anInt7566 = 0;
					node_sub47.aBoolean7580 = player.hasDisplayName;
					Class320_Sub3.aHashTable8234.method1515((long) player.index, node_sub47, -127);
				}
			} else {
				node_sub47.anObjectDefinition7562 = objectdefinition;
				int i_3_ = objectdefinition.anInt3055;
				int i_4_ = objectdefinition.anInt2986;
				if ((i_2_ ^ 0xffffffff) == -2 || (i_2_ ^ 0xffffffff) == -4) {
					i_4_ = objectdefinition.anInt3055;
					i_3_ = objectdefinition.anInt2986;
				}
				node_sub47.anInt7570 = objectdefinition.anInt3024;
				node_sub47.anInt7567 = objectdefinition.anInt3012 << 9;
				node_sub47.anInt7564 = objectdefinition.anInt3015;
				node_sub47.anInt7565 = objectdefinition.anInt2971;
				node_sub47.anInt7559 = i_1_ + i_4_ << 9;
				node_sub47.anInt7572 = objectdefinition.anInt3020;
				node_sub47.aBoolean7580 = objectdefinition.aBoolean2961;
				node_sub47.aBoolean7584 = objectdefinition.aBoolean2993;
				node_sub47.anInt7566 = objectdefinition.anInt2975 << 9;
				node_sub47.anInt7587 = objectdefinition.anInt2989;
				node_sub47.anInt7571 = objectdefinition.anInt3050;
				node_sub47.anIntArray7579 = objectdefinition.anIntArray3036;
				node_sub47.anInt7582 = i_0_ + i_3_ << 9;
				if (objectdefinition.anIntArray2984 != null) {
					node_sub47.aBoolean7574 = true;
					node_sub47.method2951(918119625);
				}
				if (node_sub47.anIntArray7579 != null) {
					node_sub47.anInt7561 = (int) ((double) (node_sub47.anInt7565 + -node_sub47.anInt7587) * Math.random()) + node_sub47.anInt7587;
				}
				Class290_Sub6.aClass312_8122.method3625((byte) -54, node_sub47);
			}
		}
	}
	
	static final void method3151(float[] fs, float f, int i, int i_5_, int i_6_, float[] fs_7_, float f_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_) {
		i_5_ -= i_13_;
		i_12_ -= i;
		if (i_10_ != -2356) {
			aClass124_7696 = null;
		}
		i_11_ -= i_9_;
		anInt7702++;
		float f_14_ = (float) i_12_ * fs[2] + (fs[1] * (float) i_11_ + (float) i_5_ * fs[0]);
		float f_15_ = (float) i_12_ * fs[5] + ((float) i_11_ * fs[4] + fs[3] * (float) i_5_);
		float f_16_ = fs[6] * (float) i_5_ + (float) i_11_ * fs[7] + fs[8] * (float) i_12_;
		float f_17_ = (float) Math.atan2((double) f_14_, (double) f_16_) / 6.2831855F + 0.5F;
		if (f_8_ != 1.0F) {
			f_17_ *= f_8_;
		}
		float f_18_ = f + (0.5F + f_15_);
		if ((i_6_ ^ 0xffffffff) != -2) {
			if ((i_6_ ^ 0xffffffff) != -3) {
				if (i_6_ == 3) {
					float f_19_ = f_17_;
					f_17_ = f_18_;
					f_18_ = -f_19_;
				}
			} else {
				f_18_ = -f_18_;
				f_17_ = -f_17_;
			}
		} else {
			float f_20_ = f_17_;
			f_17_ = -f_18_;
			f_18_ = f_20_;
		}
		fs_7_[1] = f_18_;
		fs_7_[0] = f_17_;
	}
}
