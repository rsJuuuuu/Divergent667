/* Node_Sub15_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub15_Sub5 extends Node_Sub15
{
	private int anInt9803 = -1;
	static int anInt9804;
	static Index aClass302_9805;
	static int anInt9806;
	static int anInt9807;
	static int anInt9808;
	static int anInt9809;
	private byte aByte9810;
	
	final void method2556(ClanChat clanchat, int i) {
		anInt9809++;
		clanchat.method500(aByte9810, (byte) 126, anInt9803);
		if (i != 16) {
			method2554(-120, null);
		}
	}
	
	static final long method2568(int i) {
		anInt9808++;
		if (i != -1) {
			method2570(33);
		}
		return Animable_Sub3_Sub1.aClass234_11017.method2151(0);
	}
	
	final void method2554(int i, BufferedStream buffer) {
		if (i != 29147) {
			aClass302_9805 = null;
		}
		anInt9803 = buffer.readUnsignedShort();
		anInt9804++;
		aByte9810 = buffer.readByte();
	}
	
	static final void method2569(byte b) {
		anInt9807++;
		for (Node_Sub19 node_sub19 = (Node_Sub19) Class89.aClass312_1199.method3613(65280); node_sub19 != null; node_sub19 = (Node_Sub19) Class89.aClass312_1199.method3620(16776960))
			Class287.method3401(node_sub19, false, -1);
		for (Node_Sub19 node_sub19 = (Node_Sub19) Class262_Sub8.aClass312_7755.method3613(b + 65263); node_sub19 != null; node_sub19 = (Node_Sub19) Class262_Sub8.aClass312_7755.method3620(16776960))
			Class287.method3401(node_sub19, true, -1);
		if (b != 17) {
			aClass302_9805 = null;
		}
	}
	
	public static void method2570(int i) {
		aClass302_9805 = null;
		if (i >= -24) {
			anInt9806 = 108;
		}
	}
	
	Node_Sub15_Sub5() {
		/* empty */
	}
}
