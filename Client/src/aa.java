/* aa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class aa
{
	static int anInt100;
	static int anInt101 = 0;
	static GLSprite aGLSprite102;
	static int anInt103;
	static boolean aBoolean104 = false;
	
	public aa() {
		/* empty */
	}
	
	public static void method158(int i) {
		if (i != 32) {
			method159(79, (byte) 112, -107);
		}
		aGLSprite102 = null;
	}
	
	static final boolean method159(int i, byte b, int i_0_) {
		if (b != 105) {
			aBoolean104 = true;
		}
		anInt103++;
        return (0x20 & i_0_) != 0;
    }
}
