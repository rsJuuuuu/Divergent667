/* Class341 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class341
{
	static int anInt4231 = 0;
	static int anInt4232;
	
	static final void method3960(int id, boolean bool, byte b) {
		anInt4232++;
		if (b <= 78) {
			method3960(69, true, (byte) 92);
		}
		if (!bool) {
			ClientScriptsExecutor.method3565(Class194_Sub1_Sub1.aClass212_9369, id, -1);
		} else {
			Node_Sub13 node_sub13 = FloatBuffer.method2250(-386, Node_Sub23_Sub1.aClass318_9920, Class218.aClass123_2566.anIsaacCipher1571);
			node_sub13.aPacket7113.writeShort(id);
			Class218.aClass123_2566.sendPacket(126, node_sub13);
		}
	}
}
