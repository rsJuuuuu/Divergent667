/* Class59 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class59
{
	protected int anInt865;
	static int anInt866 = 0;
	static boolean aBoolean867 = false;
	static int anInt868;
	static int anInt869;
	static int anInt870;
	protected int anInt871;
	protected int anInt872;
	static int anInt873;
	protected int anInt874;
	static int anInt875;
	static int anInt876;
	protected String aString877;
	static int anInt878;
	static int anInt879;
	
	final int method585(int i) {
		if (i != -1) {
			aBoolean867 = false;
		}
		anInt876++;
		return anInt872;
	}
	
	static final int method586(int i, Actor actor) {
		if (i != -32769) {
			method586(123, null);
		}
		anInt873++;
		if (actor.anInt10890 == 0) {
			return 0;
		}
		if (actor.faceEntity != -1) {
			Actor actor_0_ = null;
			if ((actor.faceEntity ^ 0xffffffff) <= -32769) {
				if ((actor.faceEntity ^ 0xffffffff) <= -32769) {
					actor_0_ = Class270_Sub2.LOCAL_PLAYERS[actor.faceEntity - 32768];
				}
			} else {
				Node_Sub41 node_sub41 = (Node_Sub41) Class12.aHashTable187.method1518(3512, (long) actor.faceEntity);
				if (node_sub41 != null) {
					actor_0_ = node_sub41.aNpc7518;
				}
			}
			if (actor_0_ != null) {
				int i_1_ = actor.anInt5934 - actor_0_.anInt5934;
				int i_2_ = -actor_0_.anInt5940 + actor.anInt5940;
				if ((i_1_ ^ 0xffffffff) != -1 || i_2_ != 0) {
					actor.method856((byte) -64, 0x3fff & (int) (2607.5945876176133 * Math.atan2((double) i_1_, (double) i_2_)));
				}
			}
		}
		if (actor instanceof Player) {
			Player player = (Player) actor;
			if (player.anInt11180 != -1 && (player.anInt10904 == 0 || player.anInt10901 > 0)) {
				player.method856((byte) -107, player.anInt11180);
				player.anInt11180 = -1;
			}
		} else if (actor instanceof Npc) {
			Npc npc = (Npc) actor;
			if ((npc.anInt11107 ^ 0xffffffff) != 0 && (npc.anInt10904 == 0 || npc.anInt10901 > 0)) {
				int i_3_ = -((-Node_Sub53.gameSceneBaseX + npc.anInt11107 - Node_Sub53.gameSceneBaseX) * 256) + npc.anInt5934;
				int i_4_ = npc.anInt5940 - 256 * (-Class320_Sub4.gameSceneBaseY + (-Class320_Sub4.gameSceneBaseY + npc.anInt11100));
				if (i_3_ != 0 || (i_4_ ^ 0xffffffff) != -1) {
					npc.method856((byte) 69, (int) (Math.atan2((double) i_3_, (double) i_4_) * 2607.5945876176133) & 0x3fff);
				}
				npc.anInt11107 = -1;
			}
		}
		return actor.method854(125);
	}
	
	final String method587(int i) {
		anInt878++;
		int i_5_ = 76 / ((8 - i) / 62);
		return aString877;
	}
	
	static final Class166 method588(byte b, BufferedStream buffer) {
		anInt869++;
		int i = buffer.readUnsignedShort();
		if (b != 26) {
			method586(-95, null);
		}
		return new Class166(i);
	}
	
	final int method589(int i) {
		anInt879++;
		if (i < 42) {
			method591(73);
		}
		return anInt865;
	}
	
	final int method590(int i) {
		anInt870++;
		int i_6_ = -119 % ((i - 82) / 42);
		return anInt874;
	}
	
	static final void method591(int i) {
		if (Class88.aGraphicsToolkit5280 != null) {
			Class88.aGraphicsToolkit5280.method1233(-7751);
			Class337.aClass52_4181 = null;
			Class88.aGraphicsToolkit5280 = null;
		}
		if (i != -6194) {
			anInt866 = 113;
		}
		anInt868++;
	}
	
	final int method592(byte b) {
		if (b >= -32) {
			return 67;
		}
		anInt875++;
		return anInt871;
	}
}
