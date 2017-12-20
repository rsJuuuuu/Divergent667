/* Class320_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class320_Sub9 extends Class320
{
	static int anInt8286;
	static int anInt8287;
	static int anInt8288;
	static int anInt8289;
	static int anInt8290;
	static int anInt8291;
	static int anInt8292;
	static int anInt8293;
	static int anInt8294;
	static int anInt8295;
	
	Class320_Sub9(int i, Node_Sub27 node_sub27) {
		super(i, node_sub27);
	}
	
	static final boolean method3713(int i, int i_0_, int i_1_) {
		if (i < 78) {
			method3716(false, 89, false, 111, null, -76);
		}
		anInt8291++;
        return (0x10000 & i_0_) != 0;
    }
	
	final void method3673(byte b) {
		anInt4064 = method3677(0);
		anInt8288++;
		if (b > -35) {
			method3673((byte) 6);
		}
	}
	
	final int method3675(int i, byte b) {
		if (b != 54) {
			anInt8295 = -96;
		}
		anInt8290++;
		return 3;
	}
	
	Class320_Sub9(Node_Sub27 node_sub27) {
		super(node_sub27);
	}
	
	final void method3676(boolean bool, int i) {
		anInt8294++;
		if (bool != false) {
			anInt8295 = 34;
		}
		anInt4064 = i;
	}
	
	static final void method3714(int i, byte b, int i_2_, int i_3_, int i_4_) {
		for (Node_Sub47 node_sub47 = (Node_Sub47) Class290_Sub6.aClass312_8122.method3613(65280); node_sub47 != null; node_sub47 = (Node_Sub47) Class290_Sub6.aClass312_8122.method3620(16776960))
			Class338.method3913(i, node_sub47, i_4_, i_3_, (byte) 54, i_2_);
		anInt8289++;
		if (b < -123) {
			for (Node_Sub47 node_sub47 = (Node_Sub47) Class200_Sub2.aClass312_4942.method3613(65280); node_sub47 != null; node_sub47 = (Node_Sub47) Class200_Sub2.aClass312_4942.method3620(16776960)) {
				int i_5_ = 1;
				Class259 class259 = node_sub47.aNpc7583.method868((byte) -125);
				int i_6_ = node_sub47.aNpc7583.anAnimator10860.method250((byte) 92);
				if ((i_6_ ^ 0xffffffff) == 0 || node_sub47.aNpc7583.aBoolean10867) {
					i_5_ = 0;
				} else if ((i_6_ ^ 0xffffffff) != (class259.anInt3252 ^ 0xffffffff) && i_6_ != class259.anInt3271 && (i_6_ ^ 0xffffffff) != (class259.anInt3293 ^ 0xffffffff) && class259.anInt3270 != i_6_) {
					if ((class259.anInt3262 ^ 0xffffffff) == (i_6_ ^ 0xffffffff) || (i_6_ ^ 0xffffffff) == (class259.anInt3297 ^ 0xffffffff) || class259.anInt3304 == i_6_ || i_6_ == class259.anInt3269) {
						i_5_ = 3;
					}
				} else {
					i_5_ = 2;
				}
				if ((node_sub47.anInt7586 ^ 0xffffffff) != (i_5_ ^ 0xffffffff)) {
					int i_7_ = Class266.method3243(-68, node_sub47.aNpc7583);
					NpcDefinition npcdefinition = node_sub47.aNpc7583.aNpcDefinition11122;
					if (npcdefinition.anIntArray2827 != null) {
						npcdefinition = npcdefinition.method2999(65535, Class24.aClass275_442);
					}
					if (npcdefinition != null && (i_7_ ^ 0xffffffff) != 0) {
						if ((i_7_ ^ 0xffffffff) != (node_sub47.anInt7564 ^ 0xffffffff) || node_sub47.aBoolean7580 == !npcdefinition.aBoolean2883) {
							boolean bool = false;
							if (node_sub47.aNode_Sub9_Sub2_7568 == null) {
								bool = true;
							} else {
								node_sub47.anInt7570 -= 512;
								if ((node_sub47.anInt7570 ^ 0xffffffff) >= -1) {
									Class176.aNode_Sub9_Sub3_2106.method2514(node_sub47.aNode_Sub9_Sub2_7568);
									bool = true;
									node_sub47.aNode_Sub9_Sub2_7568 = null;
								}
							}
							if (bool) {
								node_sub47.aNode_Sub49_7581 = null;
								node_sub47.aNode_Sub45_Sub1_7576 = null;
								node_sub47.aBoolean7580 = npcdefinition.aBoolean2883;
								node_sub47.anInt7570 = npcdefinition.anInt2828;
								node_sub47.anInt7586 = i_5_;
								node_sub47.anInt7564 = i_7_;
							}
						} else {
							node_sub47.anInt7586 = i_5_;
							node_sub47.anInt7570 = npcdefinition.anInt2828;
						}
					} else {
						node_sub47.anInt7586 = i_5_;
						node_sub47.aBoolean7580 = false;
						node_sub47.anInt7564 = -1;
					}
				}
				node_sub47.anInt7569 = node_sub47.aNpc7583.anInt5934;
				node_sub47.anInt7582 = node_sub47.aNpc7583.anInt5934 + (node_sub47.aNpc7583.getSize((byte) 53) << 8);
				node_sub47.anInt7563 = node_sub47.aNpc7583.anInt5940;
				node_sub47.anInt7559 = node_sub47.aNpc7583.anInt5940 + (node_sub47.aNpc7583.getSize((byte) 68) << 8);
				Class338.method3913(i, node_sub47, i_4_, i_3_, (byte) 54, i_2_);
			}
			for (Node_Sub47 node_sub47 = (Node_Sub47) Class320_Sub3.aHashTable8234.method1516(false); node_sub47 != null; node_sub47 = (Node_Sub47) Class320_Sub3.aHashTable8234.method1520(69)) {
				int i_8_ = 1;
				Class259 class259 = node_sub47.aPlayer7573.method868((byte) -125);
				int i_9_ = node_sub47.aPlayer7573.anAnimator10860.method250((byte) 82);
				if (i_9_ == -1 || node_sub47.aPlayer7573.aBoolean10867) {
					i_8_ = 0;
				} else if ((i_9_ ^ 0xffffffff) == (class259.anInt3252 ^ 0xffffffff) || (i_9_ ^ 0xffffffff) == (class259.anInt3271 ^ 0xffffffff) || (class259.anInt3293 ^ 0xffffffff) == (i_9_ ^ 0xffffffff) || i_9_ == class259.anInt3270) {
					i_8_ = 2;
				} else if ((class259.anInt3262 ^ 0xffffffff) == (i_9_ ^ 0xffffffff) || (i_9_ ^ 0xffffffff) == (class259.anInt3297 ^ 0xffffffff) || (class259.anInt3304 ^ 0xffffffff) == (i_9_ ^ 0xffffffff) || i_9_ == class259.anInt3269) {
					i_8_ = 3;
				}
				if ((i_8_ ^ 0xffffffff) != (node_sub47.anInt7586 ^ 0xffffffff)) {
					int i_10_ = Class172.method1797(-1, node_sub47.aPlayer7573);
					if (node_sub47.anInt7564 == i_10_ && !node_sub47.aPlayer7573.hasDisplayName == !node_sub47.aBoolean7580) {
						node_sub47.anInt7586 = i_8_;
						node_sub47.anInt7570 = node_sub47.aPlayer7573.anInt11173;
					} else {
						boolean bool = false;
						if (node_sub47.aNode_Sub9_Sub2_7568 == null) {
							bool = true;
						} else {
							node_sub47.anInt7570 -= 512;
							if ((node_sub47.anInt7570 ^ 0xffffffff) >= -1) {
								Class176.aNode_Sub9_Sub3_2106.method2514(node_sub47.aNode_Sub9_Sub2_7568);
								node_sub47.aNode_Sub9_Sub2_7568 = null;
								bool = true;
							}
						}
						if (bool) {
							node_sub47.aBoolean7580 = node_sub47.aPlayer7573.hasDisplayName;
							node_sub47.anInt7564 = i_10_;
							node_sub47.anInt7570 = node_sub47.aPlayer7573.anInt11173;
							node_sub47.aNode_Sub45_Sub1_7576 = null;
							node_sub47.anInt7586 = i_8_;
							node_sub47.aNode_Sub49_7581 = null;
						}
					}
				}
				node_sub47.anInt7569 = node_sub47.aPlayer7573.anInt5934;
				node_sub47.anInt7582 = node_sub47.aPlayer7573.anInt5934 + (node_sub47.aPlayer7573.getSize((byte) 127) << 8);
				node_sub47.anInt7563 = node_sub47.aPlayer7573.anInt5940;
				node_sub47.anInt7559 = node_sub47.aPlayer7573.anInt5940 - -(node_sub47.aPlayer7573.getSize((byte) 62) << 8);
				Class338.method3913(i, node_sub47, i_4_, i_3_, (byte) 54, i_2_);
			}
		}
	}
	
	final int method3677(int i) {
		anInt8293++;
		if (i != 0) {
			return -28;
		}
		if (!aNode_Sub27_4063.method2697(-66)) {
			return 0;
		}
		return 1;
	}
	
	final int method3715(boolean bool) {
		anInt8287++;
		if (bool != false) {
			method3676(false, -66);
		}
		return anInt4064;
	}
	
	static final void method3716(boolean bool, int i, boolean bool_11_, int i_12_, IComponentDefinitions[] widgets, int i_13_) {
		anInt8286++;
		int i_14_ = 0;
		if (bool == true) {
			for (/**/; (widgets.length ^ 0xffffffff) < (i_14_ ^ 0xffffffff); i_14_++) {
				IComponentDefinitions widget = widgets[i_14_];
				if (widget != null && (widget.parentId ^ 0xffffffff) == (i_13_ ^ 0xffffffff)) {
					Node_Sub39.method2921(bool_11_, i_12_, 18815, i, widget);
					Node_Sub38_Sub23.method2862(widget, i, i_12_, -8525);
					if (-widget.anInt4809 + widget.anInt4735 < widget.anInt4817) {
						widget.anInt4817 = -widget.anInt4809 + widget.anInt4735;
					}
					if (widget.anInt4817 < 0) {
						widget.anInt4817 = 0;
					}
					if ((widget.anInt4691 + -widget.anInt4695 ^ 0xffffffff) > (widget.anInt4734 ^ 0xffffffff)) {
						widget.anInt4734 = -widget.anInt4695 + widget.anInt4691;
					}
					if ((widget.anInt4734 ^ 0xffffffff) > -1) {
						widget.anInt4734 = 0;
					}
					if (widget.type == 0) {
						Class270_Sub1.method3300(widget, (byte) -10, bool_11_);
					}
				}
			}
		}
	}
	
	static final boolean method3717(Class42 class42, Index class302, Index class302_15_, Index class302_16_, int i, Node_Sub9_Sub1 node_sub9_sub1) {
		Class307.aNode_Sub9_Sub1_3902 = node_sub9_sub1;
		Class320_Sub12.aClass302_8326 = class302;
		anInt8292++;
		Class51.aClass302_5339 = class302_15_;
		Class153.anIntArray1948 = new int[16];
		Class230.aClass42_5208 = class42;
		Node_Sub38_Sub6.aClass302_10138 = class302_16_;
		if (i != 311508264) {
			anInt8295 = -128;
		}
		for (int i_17_ = 0; (i_17_ ^ 0xffffffff) > -17; i_17_++)
			Class153.anIntArray1948[i_17_] = 255;
		return true;
	}
}
