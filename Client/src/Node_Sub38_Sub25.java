/* Node_Sub38_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub38_Sub25 extends Node_Sub38
{
	static int anInt10357;
	static int[] anIntArray10358;
	static int anInt10359;
	static int CURRENT_GAME_SCENE_SIZE = -1;
	
	public Node_Sub38_Sub25() {
		super(0, true);
	}
	
	static final ClientScript method2871(Class212 class212, int i, int i_0_, int i_1_) {
		anInt10359++;
		int i_2_ = class212.anInt5130 | i << 10;
		ClientScript cachenode_sub9 = (ClientScript) Class258.aClass335_5293.method3849((long) i_2_ << 16, true);
		if (cachenode_sub9 != null) {
			return cachenode_sub9;
		}
		byte[] bs = Class21.aClass302_357.method3518((byte) -128, Class21.aClass302_357.method3528((byte) -48, i_2_));
		if (bs != null) {
			if ((bs.length ^ 0xffffffff) >= -2) {
				return null;
			}
			try {
				cachenode_sub9 = Class32.method356(bs, false);
			} catch (Exception exception) {
				throw new RuntimeException(exception.getMessage() + " S: " + i_2_);
			}
			cachenode_sub9.aClass212_9505 = class212;
			Class258.aClass335_5293.method3848((byte) -125, cachenode_sub9, (long) i_2_ << 16);
			return cachenode_sub9;
		}
		if (i_1_ >= -4) {
			return null;
		}
		i_2_ = 65536 + i_0_ << 10 | class212.anInt5130;
		cachenode_sub9 = (ClientScript) Class258.aClass335_5293.method3849((long) i_2_ << 16, true);
		if (cachenode_sub9 != null) {
			return cachenode_sub9;
		}
		bs = Class21.aClass302_357.method3518((byte) -127, Class21.aClass302_357.method3528((byte) -48, i_2_));
		if (bs != null) {
			if (bs.length <= 1) {
				return null;
			}
			try {
				cachenode_sub9 = Class32.method356(bs, false);
			} catch (Exception exception) {
				throw new RuntimeException(exception.getMessage() + " S: " + i_2_);
			}
			cachenode_sub9.aClass212_9505 = class212;
			Class258.aClass335_5293.method3848((byte) -117, cachenode_sub9, (long) i_2_ << 16);
			return cachenode_sub9;
		}
		i_2_ = class212.anInt5130 | 0x3fffc00;
		cachenode_sub9 = (ClientScript) Class258.aClass335_5293.method3849((long) i_2_ << 16, true);
		if (cachenode_sub9 != null) {
			return cachenode_sub9;
		}
		bs = Class21.aClass302_357.method3518((byte) 71, Class21.aClass302_357.method3528((byte) -48, i_2_));
		if (bs != null) {
			if ((bs.length ^ 0xffffffff) >= -2) {
				return null;
			}
			try {
				cachenode_sub9 = Class32.method356(bs, false);
			} catch (Exception exception) {
				throw new RuntimeException(exception.getMessage() + " S: " + i_2_);
			}
			cachenode_sub9.aClass212_9505 = class212;
			Class258.aClass335_5293.method3848((byte) -120, cachenode_sub9, (long) i_2_ << 16);
			return cachenode_sub9;
		}
		return null;
	}
	
	final int[] method2775(int i, int i_3_) {
		anInt10357++;
		int[] is = aClass146_7460.method1645(27356, i_3_);
		if (i <= 107) {
			anIntArray10358 = null;
		}
		if (aClass146_7460.aBoolean1819) {
			Class311.method3604(is, 0, Class339_Sub7.anInt8728, Node_Sub25_Sub1.anIntArray9941[i_3_]);
		}
		return is;
	}
	
	public static void method2872(byte b) {
		if (b != -38) {
			anIntArray10358 = null;
		}
		anIntArray10358 = null;
	}
}
