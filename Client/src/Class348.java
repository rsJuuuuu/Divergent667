/* Class348 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class348
{
	private int anInt4289;
	static int anInt4290;
	private int anInt4291;
	private int anInt4292 = -1;
	private int[][][] anIntArrayArrayArray4293;
	static int anInt4294;
	private Node_Sub21[] aNode_Sub21Array4295;
	private int anInt4296 = 0;
	static int anInt4297;
	static int anInt4298;
	private Class312 aClass312_4299 = new Class312();
	protected boolean aBoolean4300 = false;
	
	final void method3980(boolean bool) {
		anInt4298++;
		if (bool != true) {
			method3980(true);
		}
		for (int i = 0; (anInt4289 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
			anIntArrayArrayArray4293[i][0] = null;
			anIntArrayArrayArray4293[i][1] = null;
			anIntArrayArrayArray4293[i][2] = null;
			anIntArrayArrayArray4293[i] = null;
		}
		anIntArrayArrayArray4293 = null;
		aNode_Sub21Array4295 = null;
		aClass312_4299.method3614(-601);
		aClass312_4299 = null;
	}
	
	final int[][] method3981(int i, int i_0_) {
		anInt4294++;
		if (i_0_ != 3168) {
			method3981(-101, -42);
		}
		if (anInt4289 == anInt4291) {
			aBoolean4300 = aNode_Sub21Array4295[i] == null;
			aNode_Sub21Array4295[i] = Class279.aNode_Sub21_3555;
			return anIntArrayArrayArray4293[i];
		}
		if ((anInt4289 ^ 0xffffffff) == -2) {
			aBoolean4300 = (anInt4292 ^ 0xffffffff) != (i ^ 0xffffffff);
			anInt4292 = i;
			return anIntArrayArrayArray4293[0];
		}
		Node_Sub21 node_sub21 = aNode_Sub21Array4295[i];
		if (node_sub21 == null) {
			aBoolean4300 = true;
			if (anInt4296 < anInt4289) {
				node_sub21 = new Node_Sub21(i, anInt4296);
				anInt4296++;
			} else {
				Node_Sub21 node_sub21_1_ = (Node_Sub21) aClass312_4299.method3622((byte) -60);
				node_sub21 = new Node_Sub21(i, node_sub21_1_.anInt7181);
				aNode_Sub21Array4295[node_sub21_1_.anInt7187] = null;
				node_sub21_1_.method2160((byte) 36);
			}
			aNode_Sub21Array4295[i] = node_sub21;
		} else {
			aBoolean4300 = false;
		}
		aClass312_4299.method3611(node_sub21, -127);
		return anIntArrayArrayArray4293[node_sub21.anInt7181];
	}
	
	final int[][][] method3982(int i) {
		anInt4297++;
		if (anInt4291 != anInt4289) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (int i_2_ = i; (i_2_ ^ 0xffffffff) > (anInt4289 ^ 0xffffffff); i_2_++)
			aNode_Sub21Array4295[i_2_] = Class279.aNode_Sub21_3555;
		return anIntArrayArrayArray4293;
	}
	
	Class348(int i, int i_3_, int i_4_) {
		anInt4289 = i;
		anInt4291 = i_3_;
		aNode_Sub21Array4295 = new Node_Sub21[anInt4291];
		anIntArrayArrayArray4293 = new int[anInt4289][3][i_4_];
	}
}
