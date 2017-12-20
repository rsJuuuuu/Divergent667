/* Animable_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Animable_Sub2 extends Animable
{
	static int anInt9106;
	static int anInt9107;
	static int anInt9108;
	static int anInt9109;
	protected short aShort9110;
	static int anInt9111;
	static int anInt9112;
	static int anInt9113;
	static OutcommingPacket aClass318_9114 = new OutcommingPacket(47, 9);
	static int anInt9115;
	static Class103 aClass103_9116;
	
	static final void method834(int i, Class163 class163) {
		Class342.aClass163_4236 = class163;
		if (i >= -106) {
			aClass103_9116 = null;
		}
		anInt9115++;
	}
	
	static final boolean method835(Class171 class171, byte b) {
		anInt9112++;
		if (class171 == null) {
			return false;
		}
		if (b < 91) {
			aClass318_9114 = null;
		}
		return Node_Sub25.method2653(-class171.anInt2059 + class171.anInt2063, -class171.anInt2072 + class171.anInt2073, class171.anInt2059, 255, class171.anInt2068, class171.anInt2072, class171.anInt2061 - class171.anInt2068);
	}
	
	final boolean method815(byte b, GraphicsToolkit graphicstoolkit) {
		if (b != 59) {
			aShort9110 = (short) -17;
		}
		anInt9109++;
		return Actor.method859(anInt5934 >> Class36.anInt549, anInt5940 >> Class36.anInt549, 4297, this, aByte5931);
	}
	
	static final void method836(int i, boolean bool) {
		anInt9108++;
		//sets world opcodes to lobby login response
		/*if (Class159.loginType != 1) {
			if ((Class159.loginType ^ 0xffffffff) == -3) {
				Class339_Sub2.anInt8653 = i;
			}
		} else {*/
			Class152.anInt1941 = i;
		//}
		if (bool != true) {
			aClass103_9116 = null;
		}
	}
	
	final int method819(Node_Sub29[] node_sub29s, int i) {
		anInt9106++;
		int i_0_ = anInt5934 >> Class36.anInt549;
		if (i != 1) {
			return 71;
		}
		int i_1_ = anInt5940 >> Class36.anInt549;
		int i_2_ = 0;
		if (Class216.anInt2551 == i_0_) {
			i_2_++;
		} else if ((Class216.anInt2551 ^ 0xffffffff) > (i_0_ ^ 0xffffffff)) {
			i_2_ += 2;
		}
		if ((i_1_ ^ 0xffffffff) != (EntityNode_Sub7.anInt6013 ^ 0xffffffff)) {
			if ((EntityNode_Sub7.anInt6013 ^ 0xffffffff) < (i_1_ ^ 0xffffffff)) {
				i_2_ += 6;
			}
		} else {
			i_2_ += 3;
		}
		int i_3_ = Class1.anIntArray109[i_2_];
		if ((aShort9110 & i_3_ ^ 0xffffffff) != -1) {
			return this.method808(-23024, node_sub29s, i_1_, i_0_);
		}
		if ((aShort9110 ^ 0xffffffff) == -2 && i_0_ > 0) {
			return this.method808(-23024, node_sub29s, i_1_, -1 + i_0_);
		}
		if (aShort9110 == 4 && Class328.anInt4115 >= i_0_) {
			return this.method808(-23024, node_sub29s, i_1_, i_0_ + 1);
		}
		if ((aShort9110 ^ 0xffffffff) == -9 && i_1_ > 0) {
			return this.method808(-23024, node_sub29s, -1 + i_1_, i_0_);
		}
		if ((aShort9110 ^ 0xffffffff) == -3 && (Node_Sub50.anInt7623 ^ 0xffffffff) <= (i_1_ ^ 0xffffffff)) {
			return this.method808(-23024, node_sub29s, 1 + i_1_, i_0_);
		}
		if ((aShort9110 ^ 0xffffffff) == -17 && (i_0_ ^ 0xffffffff) < -1 && i_1_ <= Node_Sub50.anInt7623) {
			return this.method808(-23024, node_sub29s, 1 + i_1_, -1 + i_0_);
		}
		if (aShort9110 == 32 && i_0_ <= Class328.anInt4115 && Node_Sub50.anInt7623 >= i_1_) {
			return this.method808(-23024, node_sub29s, i_1_ + 1, 1 + i_0_);
		}
		if ((aShort9110 ^ 0xffffffff) == -129 && (i_0_ ^ 0xffffffff) < -1 && i_1_ > 0) {
			return this.method808(-23024, node_sub29s, -1 + i_1_, i_0_ + -1);
		}
		if ((aShort9110 ^ 0xffffffff) == -65 && Class328.anInt4115 >= i_0_ && i_1_ > 0) {
			return this.method808(i ^ ~0x59ee, node_sub29s, -1 + i_1_, i_0_ + 1);
		}
		throw new RuntimeException("");
	}
	
	static final void updateGameSceneSize(int sceneSize) {
		if (sceneSize != Node_Sub38_Sub25.CURRENT_GAME_SCENE_SIZE) {
			Node_Sub54.GAME_SCENE_WDITH = Class377_Sub1.GAME_SCENE_HEIGHT = Class129.VALID_GAME_SCENE_SIZES[sceneSize];
			Class116.method1163(2);
			Class330.anIntArrayArrayArray4128 = new int[4][Node_Sub54.GAME_SCENE_WDITH >> 3][Class377_Sub1.GAME_SCENE_HEIGHT >> 3];
			Class79.anIntArrayArray1070 = new int[Node_Sub54.GAME_SCENE_WDITH][Class377_Sub1.GAME_SCENE_HEIGHT];
			Node_Sub38_Sub16.anIntArrayArray10269 = new int[Node_Sub54.GAME_SCENE_WDITH][Class377_Sub1.GAME_SCENE_HEIGHT];
			for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > -5; i_4_++)
				Class304.SCENE_CLIP_DATA_PLANES[i_4_] = Class63.method707(Node_Sub54.GAME_SCENE_WDITH, Class377_Sub1.GAME_SCENE_HEIGHT, (byte) 42);
			Node_Sub38_Sub15.aByteArrayArrayArray10261 = new byte[4][Node_Sub54.GAME_SCENE_WDITH][Class377_Sub1.GAME_SCENE_HEIGHT];
			Class376.method4119(Node_Sub54.GAME_SCENE_WDITH, -128, Class377_Sub1.GAME_SCENE_HEIGHT, 4);
			Class325.method3814(Class93.aGraphicsToolkit1241, 18521, Class377_Sub1.GAME_SCENE_HEIGHT >> 3, Node_Sub54.GAME_SCENE_WDITH >> 3);
			Node_Sub38_Sub25.CURRENT_GAME_SCENE_SIZE = sceneSize;
		}
	}
	
	public static void method838(int i) {
		aClass103_9116 = null;
		if (i > -31) {
			updateGameSceneSize(59);
		}
		aClass318_9114 = null;
	}
	
	final boolean method806(int i) {
		anInt9107++;
		if (i != 0) {
			aClass103_9116 = null;
		}
		return Class139.aBooleanArrayArray1730[-Class216.anInt2551 + ((anInt5934 >> Class36.anInt549) + Node_Sub9_Sub1.anInt9656)][Node_Sub9_Sub1.anInt9656 + -EntityNode_Sub7.anInt6013 + (anInt5940 >> Class36.anInt549)];
	}
	
	Animable_Sub2(int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_) {
		aShort9110 = (short) i_9_;
		anInt5937 = i_5_;
		plane = (byte) i_7_;
		anInt5940 = i_6_;
		anInt5934 = i;
		aByte5931 = (byte) i_8_;
	}
}
