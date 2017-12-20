/* Class262_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class262_Sub6 extends Class262
{
	static int anInt7742;
	static int anInt7743;
	static int anInt7744;
	static Class124 aClass124_7745 = new Class124(42);
	private int anInt7746;
	private int anInt7747;
	static IncommingPacket aClass192_7748 = new IncommingPacket(84, 6);
	
	Class262_Sub6(BufferedStream buffer) {
		super(buffer);
		anInt7747 = buffer.readUnsignedShort();
		anInt7746 = buffer.method2183();
	}
	
	final void method3148(int i) {
		anInt7742++;
		Class369 class369 = Node_Sub39.aClass369Array7497[anInt7747];
		if (i >= -102) {
			method3164(-55, false, (byte) -71);
		}
		Class110.method1131(class369.anInt4557, class369.anInt4563, class369.anInt4556, anInt7746, class369.anInt4560, class369.anInt4552, -4, Class248.anIntArray3145[class369.anInt4556]);
	}
	
	static final void method3164(int key, boolean bool, byte b) {
		anInt7744++;
		Node_Sub16 node_sub16 = Class295.method3472(key, (byte) 18, bool);
		if (node_sub16 != null) {
			int i_0_ = 0;
			@SuppressWarnings("unused")
			int i_1_ = -16 / ((b - -58) / 52);
			for (/**/; (i_0_ ^ 0xffffffff) > (node_sub16.anIntArray7137.length ^ 0xffffffff); i_0_++) {
				node_sub16.anIntArray7137[i_0_] = -1;
				node_sub16.anIntArray7138[i_0_] = 0;
			}
		}
	}
	
	public static void method3165(int i) {
		aClass192_7748 = null;
		aClass124_7745 = null;
		if (i != 0) {
			aClass124_7745 = null;
		}
	}
	
	static final void drawTileStrings(byte b, int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		anInt7743++;
		if (b <= 41) {
			aClass192_7748 = null;
		}
		for (TileMessage entitynode_sub2 = (TileMessage) Class226.aClass103_2684.method1113((byte) 122); entitynode_sub2 != null; entitynode_sub2 = (TileMessage) Class226.aClass103_2684.method1108(88)) {
			if ((entitynode_sub2.completeCycle ^ 0xffffffff) >= (Class174.clientCycle ^ 0xffffffff)) {
				entitynode_sub2.method803(false);
			} else {
				Animable_Sub1.method826(2 * entitynode_sub2.height, -1, (entitynode_sub2.x << 9) + 256, i_4_, i >> 1, i_2_, (entitynode_sub2.y << 9) - -256, entitynode_sub2.plane, i_3_ >> 1);
				Class262_Sub4.aClass52_7721.method537(0, (byte) 111, Class119.anIntArray1516[0] + i_6_, entitynode_sub2.message, Class119.anIntArray1516[1] + i_5_, entitynode_sub2.anInt5951 | ~0xffffff);
			}
		}
	}
}
