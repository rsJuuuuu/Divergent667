/* Node_Sub31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub31 extends Node
{
	protected int anInt7363;
	protected int anInt7364;
	protected int anInt7365;
	protected int anInt7366 = -2147483648;
	static int anInt7367;
	static int anInt7368;
	protected int anInt7369;
	protected int anInt7370;
	protected int anInt7371;
	static int anInt7372;
	static int anInt7373;
	protected int anInt7374;
	protected Node_Sub14 aNode_Sub14_7375;
	
	static final byte[] method2725(int i, byte b, byte[] bs) {
		@SuppressWarnings("unused")
		int i_0_ = 48 / ((40 - b) / 48);
		anInt7373++;
		byte[] bs_1_ = new byte[i];
		Class311.method3608(bs, 0, bs_1_, 0, i);
		return bs_1_;
	}
	
	static final void method2726(int i) {
		anInt7372++;
		Class370.anInt4566++;
		Class123 class123 = Class262_Sub23.method3213((byte) -123);
		Node_Sub13 node_sub13 = FloatBuffer.method2250(i ^ ~0x181, Node_Sub18.aClass318_7151, class123.anIsaacCipher1571);
		node_sub13.aPacket7113.writeByte(i);
		class123.sendPacket(127, node_sub13);
	}
	
	static final Class144_Sub3 method2727(BufferedStream buffer, byte b) {
		anInt7368++;
		if (b != 120) {
			method2727(null, (byte) -7);
		}
		return new Class144_Sub3(buffer.readShort(), buffer.readShort(), buffer.readShort(), buffer.readShort(), buffer.readShort(), buffer.readShort(), buffer.readShort(), buffer.readShort(), buffer.read24BitInteger(), buffer.readUnsignedByte());
	}
	
	final boolean method2728(int i, byte b, int i_2_) {
		anInt7367++;
		if (b <= 11) {
			anInt7370 = -117;
		}
		if ((i ^ 0xffffffff) <= (anInt7374 ^ 0xffffffff) && i <= anInt7369 && (i_2_ ^ 0xffffffff) <= (anInt7365 ^ 0xffffffff) && (i_2_ ^ 0xffffffff) >= (anInt7370 ^ 0xffffffff)) {
			return true;
		}
        return (anInt7371 ^ 0xffffffff) >= (i ^ 0xffffffff) && i <= anInt7364 && (anInt7363 ^ 0xffffffff) >= (i_2_ ^ 0xffffffff) && i_2_ <= anInt7366;
    }
	
	Node_Sub31(Node_Sub14 node_sub14) {
		anInt7365 = 2147483647;
		anInt7364 = -2147483648;
		anInt7370 = -2147483648;
		anInt7363 = 2147483647;
		anInt7369 = -2147483648;
		anInt7374 = 2147483647;
		anInt7371 = 2147483647;
		aNode_Sub14_7375 = node_sub14;
	}
}
