/* Class262_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class262_Sub17 extends Class262
{
	private int anInt7832;
	static boolean aBoolean7833 = false;
	static int anInt7834;
	private int anInt7835;
	private int anInt7836;
	private int[] anIntArray7837;
	static int anInt7838;
	static int anInt7839 = 0;
	
	final void method3148(int i) {
		anInt7838++;
		Actor actor = Class121.aClass206Array1529[anInt7832].method2037(-117);
		if ((anInt7836 ^ 0xffffffff) != -1) {
			Node_Sub38_Sub13.method2831(new int[] { anInt7836 }, -31813, new int[] { anInt7835 }, new int[1], actor);
		} else {
			Class352.method4011(anIntArray7837, 0, false, actor, -122);
		}
		if (i >= -102) {
			method3197(30);
		}
	}
	
	Class262_Sub17(BufferedStream buffer) {
		super(buffer);
		anInt7832 = buffer.readUnsignedShort();
		anIntArray7837 = new int[4];
		anInt7835 = buffer.method2183();
		Class311.method3604(anIntArray7837, 0, anIntArray7837.length, anInt7835);
		anInt7836 = buffer.readInt();
	}
	
	static final void method3197(int i) {
		if (CacheNode_Sub18.aClass343ArrayArray9608 != null) {
			for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > (CacheNode_Sub18.aClass343ArrayArray9608.length ^ 0xffffffff); i_0_++) {
				for (int i_1_ = 0; CacheNode_Sub18.aClass343ArrayArray9608[i_0_].length > i_1_; i_1_++)
					CacheNode_Sub18.aClass343ArrayArray9608[i_0_][i_1_] = Class295.aClass343_3695;
			}
		}
		anInt7834++;
		if (i != 0) {
			method3197(89);
		}
	}
}
