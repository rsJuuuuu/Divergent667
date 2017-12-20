/* Class202 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class202
{
	static int anInt2447;
	static int[] anIntArray2448 = new int[200];
	
	public static void method2026(int i) {
		anIntArray2448 = null;
		if (i != 200) {
			anIntArray2448 = null;
		}
	}
	
	static final void method2027(int i) {
		if (i != 200) {
			anIntArray2448 = null;
		}
		Class214.anInt2513++;
		anInt2447++;
		Node_Sub13 node_sub13 = FloatBuffer.method2250(i + -586, Class312.aClass318_3976, Class218.aClass123_2566.anIsaacCipher1571);
		node_sub13.aPacket7113.writeByte(Class188_Sub2_Sub1.getDisplayMode(3));
		node_sub13.aPacket7113.writeShort(Class360.screenWidth);
		node_sub13.aPacket7113.writeShort(Class205.screenHeight);
		node_sub13.aPacket7113.writeByte(Class213.aNode_Sub27_2512.aClass320_Sub13_7283.method3734(false));
		Class218.aClass123_2566.sendPacket(i ^ 0xb7, node_sub13);
	}
}
