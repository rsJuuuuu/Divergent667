/* Node_Sub38_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub38_Sub17 extends Node_Sub38
{
	static Class257 aClass257_10270 = new Class257(2, -1);
	private int anInt10271 = 4096;
	static int anInt10272;
	static int anInt10273;
	static int anInt10274;
	
	public Node_Sub38_Sub17() {
		this(4096);
	}
	
	final void method2780(boolean bool, BufferedStream buffer, int i) {
		anInt10273++;
		if (bool != false) {
			method2842(false);
		}
		int i_0_ = i;
		if (i_0_ == 0) {
			anInt10271 = (buffer.readUnsignedByte() << 12) / 255;
		}
	}
	
	static final void method2842(boolean bool) {
		if (bool) {
			Class175.aClass261ArrayArrayArray2099 = Class225.aClass261ArrayArrayArray2680;
			Class320_Sub10.aPlaneArray8300 = Class368.aPlaneArray4548;
		} else {
			Class175.aClass261ArrayArrayArray2099 = Class256.aClass261ArrayArrayArray3240;
			Class320_Sub10.aPlaneArray8300 = Node_Sub38_Sub37.aPlaneArray10466;
		}
		Class159.anInt1995 = Class175.aClass261ArrayArrayArray2099.length;
	}
	
	Node_Sub38_Sub17(int i) {
		super(0, true);
		anInt10271 = i;
	}
	
	public static void method2843(int i) {
		aClass257_10270 = null;
		if (i != 2) {
			method2843(97);
		}
	}
	
	final int[] method2775(int i, int i_1_) {
		if (i < 107) {
			anInt10274 = -76;
		}
		anInt10272++;
		int[] is = aClass146_7460.method1645(27356, i_1_);
		if (aClass146_7460.aBoolean1819) {
			Class311.method3604(is, 0, Class339_Sub7.anInt8728, anInt10271);
		}
		return is;
	}
}
