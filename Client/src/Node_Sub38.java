/* Node_Sub38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Node_Sub38 extends Node
{
	static int anInt7447;
	static int anInt7448;
	static int anInt7449;
	protected int anInt7450;
	static int[] anIntArray7451;
	static int[] anIntArray7452 = { 1, 0, -1, 0 };
	protected Node_Sub38[] aNode_Sub38Array7453;
	protected Class348 aClass348_7454;
	static int anInt7455;
	static int anInt7456;
	static int[] anIntArray7457 = new int[3];
	static int anInt7458;
	static int anInt7459;
	protected Class146 aClass146_7460;
	static int anInt7461;
	static int anInt7462;
	protected boolean aBoolean7463;
	static int anInt7464;
	static int anInt7465;
	static int anInt7466;
	static int anInt7467;
	
	public static void method2774(int i) {
		if (i != 16369) {
			method2774(-4);
		}
		anIntArray7451 = null;
		anIntArray7452 = null;
		anIntArray7457 = null;
	}
	
	int[] method2775(int i, int i_0_) {
		anInt7467++;
		if (i < 107) {
			return null;
		}
		throw new IllegalStateException("This operation does not have a monochrome output");
	}
	
	int method2776(byte b) {
		anInt7449++;
		return -1;
	}
	
	final int[][] method2777(int i, int i_1_, int i_2_) {
		if (i > -62) {
			method2778(-94, true);
		}
		anInt7458++;
		if (!aNode_Sub38Array7453[i_1_].aBoolean7463) {
			return aNode_Sub38Array7453[i_1_].method2778(i_2_, true);
		}
		int[] is = aNode_Sub38Array7453[i_1_].method2775(111, i_2_);
		int[][] is_3_ = new int[3][];
		is_3_[1] = is;
		is_3_[2] = is;
		is_3_[0] = is;
		return is_3_;
	}
	
	int[][] method2778(int i, boolean bool) {
		anInt7447++;
		if (bool != true) {
			method2782(82, -57, true);
		}
		throw new IllegalStateException("This operation does not have a colour output");
	}
	
	static final void method2779(IComponentDefinitions widget, int i, GraphicsToolkit graphicstoolkit) {
		anInt7448++;
		if (i == 28564) {
			boolean bool = EntityNode_Sub3_Sub1.aClass86_9166.method1007(widget.aBoolean4723 ? Class295.myPlayer.aPlayerDefinition11137 : null, (byte) 96, graphicstoolkit, widget.anInt4714, widget.anInt4718, widget.anInt4744, widget.anInt4831, ~0xffffff | widget.anInt4796) == null;
			if (bool) {
				Class69.aClass312_940.method3625((byte) -54, new Node_Sub30(widget.anInt4718, widget.anInt4831, widget.anInt4744, widget.anInt4796 | ~0xffffff, widget.anInt4714, widget.aBoolean4723));
				ClientScript.method2321(-1, widget);
			}
		}
	}
	
	void method2780(boolean bool, BufferedStream buffer, int i) {
		anInt7461++;
		if (bool != false) {
			method2784(true, null, 33);
		}
	}
	
	static final int method2781(int i, int i_4_, int i_5_, int i_6_) {
		i_4_ &= 0x3;
		anInt7459++;
		if (i_4_ == 0) {
			return i;
		}
		if (i_6_ != 27542) {
			anIntArray7457 = null;
		}
		if ((i_4_ ^ 0xffffffff) == -2) {
			return -i_5_ + 4095;
		}
		if (i_4_ == 2) {
			return 4095 - i;
		}
		return i_5_;
	}
	
	void method2782(int i, int i_7_, boolean bool) {
		anInt7465++;
		if (bool != false) {
			anIntArray7451 = null;
		}
		int i_8_ = (anInt7450 ^ 0xffffffff) == -256 ? i : anInt7450;
		if (!aBoolean7463) {
			aClass348_7454 = new Class348(i_8_, i, i_7_);
		} else {
			aClass146_7460 = new Class146(i_8_, i, i_7_);
		}
	}
	
	int method2783(int i) {
		if (i != -1) {
			anIntArray7457 = null;
		}
		anInt7466++;
		return -1;
	}
	
	static final float[] method2784(boolean bool, float[] fs, int i) {
		if (bool != false) {
			return null;
		}
		anInt7455++;
		float[] fs_9_ = new float[i];
		Class311.method3603(fs, 0, fs_9_, 0, i);
		return fs_9_;
	}
	
	void method2785(int i) {
		if (i != 7) {
			anIntArray7451 = null;
		}
		anInt7456++;
	}
	
	Node_Sub38(int i, boolean bool) {
		aBoolean7463 = bool;
		aNode_Sub38Array7453 = new Node_Sub38[i];
	}
	
	final int[] method2786(int i, int i_10_, int i_11_) {
		anInt7464++;
		if (i_10_ != 0) {
			aBoolean7463 = true;
		}
		if (aNode_Sub38Array7453[i_11_].aBoolean7463) {
			return aNode_Sub38Array7453[i_11_].method2775(i_10_ + 120, i);
		}
		return aNode_Sub38Array7453[i_11_].method2778(i, true)[0];
	}
	
	void method2787(int i) {
		anInt7462++;
		if (!aBoolean7463) {
			aClass348_7454.method3980(true);
			aClass348_7454 = null;
		} else {
			aClass146_7460.method1644(-119);
			aClass146_7460 = null;
		}
	}
}
