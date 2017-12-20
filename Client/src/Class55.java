/* Class55 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class55
{
	protected Interface7[] anInterface7Array825;
	static int anInt826;
	static int anInt827;
	static int anInt828;
	static Class346 aClass346_829 = new Class346();
	static int anInt830;
	protected int anInt831;
	protected int anInt832;
	static Class104 aClass104_833 = new Class104();
	static int[] anIntArray834;
	
	static final void method558(byte b, String string) {
		anInt830++;
		Node_Sub13 node_sub13 = Node_Sub25_Sub1.method2660(0);
		node_sub13.aPacket7113.writeByte(Plane.aClass133_3419.packetId);

		node_sub13.aPacket7113.writeShort(0);
		if (b != -119) {
			anIntArray834 = null;
		}
		int i = node_sub13.aPacket7113.offset;
		node_sub13.aPacket7113.writeShort(667);
		int[] is = Class355.method4014(-5410, node_sub13);
		int i_0_ = node_sub13.aPacket7113.offset;
		node_sub13.aPacket7113.writeString(string);
		node_sub13.aPacket7113.writeByte(Class35.language);
		node_sub13.aPacket7113.offset += 7;
		node_sub13.aPacket7113.encryptXteas(is, i_0_, false, node_sub13.aPacket7113.offset);
		node_sub13.aPacket7113.method2194(-i + node_sub13.aPacket7113.offset, b + -2768);
		Class218.aClass123_2560.sendPacket(127, node_sub13);
		Node_Sub36_Sub4.anInt10073 = -3;
		Class51_Sub2.anInt9069 = 0;
		Class4.anInt124 = 1;
		Node_Sub54.anInt7683 = 0;
	}
	
	private final Interface7 method559(int i, BufferedStream buffer, Class170 class170) {
		if (i != 0) {
			method562((byte) -11);
		}
		anInt827++;
		if (Node_Sub40.aClass170_7508 == class170) {
			return Node_Sub9_Sub4.method2521(buffer, -30746);
		}
		if (Class46.aClass170_680 == class170) {
			return Class268.method3291((byte) 53, buffer);
		}
		if (class170 == Class96.aClass170_1273) {
			return Node_Sub9_Sub1.method2458(buffer, 1);
		}
		if (Class350.aClass170_5391 == class170) {
			return Node_Sub38_Sub21.method2859(buffer, false);
		}
		if (Class262_Sub18.aClass170_7850 == class170) {
			return Node_Sub40.method2928(buffer, (byte) -24);
		}
		if (class170 == Class169_Sub2.aClass170_8806) {
			return Class290_Sub5.method3436(buffer, (byte) 91);
		}
		if (Class336_Sub3.aClass170_8613 == class170) {
			return Class380.method4169((byte) 110, buffer);
		}
		if (class170 == Class106.aClass170_1357) {
			return CacheNode_Sub12.method2341(1, buffer);
		}
		if (class170 == Class356.aClass170_4425) {
			return Class59.method588((byte) 26, buffer);
		}
		if (class170 == Class270.aClass170_3476) {
			return Node_Sub29.method2709(buffer, (byte) -23);
		}
		return null;
	}
	
	public static void method560(byte b) {
		if (b == -125) {
			anIntArray834 = null;
			aClass346_829 = null;
			aClass104_833 = null;
		}
	}
	
	final void method561(BufferedStream buffer, byte b) {
		anInt831 = buffer.read24BitInteger();
		anInt828++;
		anInt832 = buffer.readUnsignedShort();
		anInterface7Array825 = new Interface7[buffer.readUnsignedByte()];
		if (b < 24) {
			method560((byte) -4);
		}
		Class170[] class170s = Class262_Sub13.method3184(0);
		for (int i = 0; i < anInterface7Array825.length; i++)
			anInterface7Array825[i] = method559(0, buffer, class170s[buffer.readUnsignedByte()]);
	}
	
	static final void method562(byte b) {
		if (b != 18) {
			method560((byte) -65);
		}
		anInt826++;
		Class229.aGraphicsToolkit2732.xa(((float) Class213.aNode_Sub27_2512.aClass320_Sub22_7299.method3765(false) * 0.1F + 0.7F) * 1.1523438F);
		Class229.aGraphicsToolkit2732.ZA(Class42.anInt649, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		Class229.aGraphicsToolkit2732.L(Class320_Sub26.anInt8456, -1, 0);
		Class229.aGraphicsToolkit2732.a(GraphicsToolkit.aClass270_1548);
	}
}
