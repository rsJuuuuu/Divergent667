/* Node_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Node_Sub5 extends Node
{
	static int anInt7026;
	static Class158 aClass158_7027 = new Class158();
	static Class312 aClass312_7028;
	static int anInt7029 = 999999;
	static String password;
	static Class124 aClass124_7031;
	static Class336 aClass336_7032;
	
	abstract int method2267(boolean bool);
	
	static final int skipPlayersCount(Packet packet) {
		int i_0_ = packet.readBits(2);
		int i_1_;
		if (i_0_ != 0) {
			if (i_0_ == 1) {
				i_1_ = packet.readBits(5);
			} else if ((i_0_ ^ 0xffffffff) == -3) {
				i_1_ = packet.readBits(8);
			} else {
				i_1_ = packet.readBits(11);
			}
		} else {
			i_1_ = 0;
		}
		return i_1_;
	}
	
	public static void method2269(int i) {
		password = null;
		aClass312_7028 = null;
		aClass124_7031 = null;
		aClass336_7032 = null;
		if (i != -6) {
			aClass336_7032 = null;
		}
		aClass158_7027 = null;
	}
	
	public Node_Sub5() {
		/* empty */
	}
	
	abstract int method2270(int i);
	
	abstract int method2271(byte b);
	
	abstract int method2272(int i);
	
	abstract long method2273(byte b);
	
	static {
		aClass312_7028 = new Class312();
		password = "";
		aClass124_7031 = new Class124(43);
	}
}
