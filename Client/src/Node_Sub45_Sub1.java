/* Node_Sub45_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub45_Sub1 extends Node_Sub45
{
	protected boolean aBoolean10501;
	protected int anInt10502;
	protected int anInt10503;
	protected byte[] aByteArray10504;
	protected int anInt10505;
	
	final Node_Sub45_Sub1 method2947(Class191 class191) {
		aByteArray10504 = class191.method1949(-14, aByteArray10504);
		anInt10502 = class191.method1948(0, anInt10502);
		if (anInt10503 == anInt10505) {
			anInt10503 = anInt10505 = class191.method1945(5692, anInt10503);
		} else {
			anInt10503 = class191.method1945(5692, anInt10503);
			anInt10505 = class191.method1945(5692, anInt10505);
			if (anInt10503 == anInt10505) {
				anInt10503--;
			}
		}
		return this;
	}
	
	Node_Sub45_Sub1(int i, byte[] bs, int i_0_, int i_1_) {
		anInt10502 = i;
		aByteArray10504 = bs;
		anInt10503 = i_0_;
		anInt10505 = i_1_;
	}
	
	Node_Sub45_Sub1(int i, byte[] bs, int i_2_, int i_3_, boolean bool) {
		anInt10502 = i;
		aByteArray10504 = bs;
		anInt10503 = i_2_;
		anInt10505 = i_3_;
		aBoolean10501 = bool;
	}
}
