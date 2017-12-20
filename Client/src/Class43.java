/* Class43 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class43
{
	static long aLong663;
	static int anInt664;
	static IncommingPacket aClass192_665 = new IncommingPacket(125, 2);
	
	static final String method458(int i, int[] is) {
		anInt664++;
		StringBuffer stringbuffer = new StringBuffer();
		int i_0_ = Class173.anInt2087;
		for (int i_1_ = 0; (is.length ^ 0xffffffff) < (i_1_ ^ 0xffffffff); i_1_++) {
			Class184 class184 = Class146.aClass32_1812.method353(is[i_1_], (byte) 84);
			if ((class184.anInt2188 ^ 0xffffffff) != 0) {
				GLSprite glsprite = (GLSprite) CacheNode_Sub12.aClass61_9556.method607((long) class184.anInt2188, i + -4923);
				if (glsprite == null) {
					Class383 class383 = Class383.method4194(Node_Sub38_Sub39.aClass302_10500, class184.anInt2188, 0);
					if (class383 != null) {
						glsprite = Class93.aGraphicsToolkit1241.a(class383, true);
						CacheNode_Sub12.aClass61_9556.method601(glsprite, i ^ 0x70e5, (long) class184.anInt2188);
					}
				}
				if (glsprite != null) {
					Class105.aGLSpriteArray5194[i_0_] = glsprite;
					stringbuffer.append(" <img=").append(i_0_).append(">");
					i_0_++;
				}
			}
		}
		if (i != 4923) {
			aLong663 = 67L;
		}
		return stringbuffer.toString();
	}
	
	public static void method459(int i) {
		aClass192_665 = null;
		if (i > -42) {
			aClass192_665 = null;
		}
	}
}
