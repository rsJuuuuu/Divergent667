/* Class30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class30
{
	static int anInt491;
	static int anInt492;
	static int anInt493;
	static Class103[] aClass103Array494 = new Class103[5];
	static IncommingPacket aClass192_495;
	
	static final int method341(byte b, boolean bool, int i) {
		anInt492++;
		if (bool) {
			return 0;
		}
		Node_Sub16 node_sub16 = Class295.method3472(i, (byte) 18, bool);
		if (node_sub16 == null) {
			return Class269.aClass308_3469.method3584(i, -13798).anInt9479;
		}
		int i_0_ = 0;
		if (b != 88) {
			anInt491 = 95;
		}
		for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > (node_sub16.anIntArray7137.length ^ 0xffffffff); i_1_++) {
			if (node_sub16.anIntArray7137[i_1_] == -1) {
				i_0_++;
			}
		}
		i_0_ += Class269.aClass308_3469.method3584(i, -13798).anInt9479 - node_sub16.anIntArray7137.length;
		return i_0_;
	}
	
	public static void method342(int i) {
		if (i != -1) {
			method342(-36);
		}
		aClass192_495 = null;
		aClass103Array494 = null;
	}
	
	static final void method343(int i) {
		anInt493++;
		for (Node_Sub3 node_sub3 = (Node_Sub3) Class56.aHashTable839.method1516(false); node_sub3 != null; node_sub3 = (Node_Sub3) Class56.aHashTable839.method1520(73))
			Renderer.method3446(node_sub3.anInt6947, 5);
		if (i >= -113) {
			method343(-70);
		}
	}
	
	static {
		for (int i = 0; i < aClass103Array494.length; i++)
			aClass103Array494[i] = new Class103();
		aClass192_495 = new IncommingPacket(101, 3);
	}
}
