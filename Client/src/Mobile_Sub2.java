/* Mobile_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Mobile_Sub2 extends Mobile implements Interface19
{
	static int anInt10704;
	static int anInt10705;
	static int anInt10706;
	static int anInt10707;
	static int anInt10708;
	static int anInt10709;
	static int anInt10710;
	private Class171 aClass171_10711;
	static int anInt10712;
	static int anInt10713;
	private boolean aBoolean10714;
	static int anInt10715;
	static int anInt10716;
	static int anInt10717;
	private r aR10718;
	private boolean aBoolean10719;
	static int anInt10720;
	private boolean aBoolean10721;
	static int anInt10722 = 0;
	static int anInt10723;
	protected DrawableModel aDrawableModel10724;
	private byte aByte10725;
	static int anInt10726;
	static int anInt10727;
	static int anInt10728;
	private boolean aBoolean10729;
	static int anInt10730;
	private byte aByte10731;
	static int anInt10732;
	static int anInt10733;
	private int aShort10734; //object
	static int anInt10735;
	
	public final void method69(int i) {
		if (aDrawableModel10724 != null) {
			aDrawableModel10724.method617();
		}
		anInt10705++;
	}
	
	public final void method70(GraphicsToolkit graphicstoolkit, int i) {
		anInt10715++;
		r var_r;
		if (aR10718 != null || !aBoolean10714) {
			var_r = aR10718;
			aR10718 = null;
		} else {
			Class243 class243 = method904(graphicstoolkit, (byte) 102, true, 262144);
			var_r = class243 != null ? class243.aR3072 : null;
		}
		if (var_r != null) {
			Node_Sub23.method2636(var_r, aByte5931, anInt5934, anInt5940, null);
		}
		if (i > -42) {
			aDrawableModel10724 = null;
		}
	}
	
	public final boolean method73(int i) {
		if (i != -19717) {
			aClass171_10711 = null;
		}
		anInt10707++;
		return aBoolean10714;
	}
	
	final boolean method814(byte b) {
		anInt10710++;
		if (aDrawableModel10724 != null) {
            return !aDrawableModel10724.r();
        }
		return true;
	}
	
	final int method817(int i) {
		anInt10704++;
		if (i != 2) {
			method814((byte) 111);
		}
		if (aDrawableModel10724 != null) {
			return aDrawableModel10724.fa();
		}
		return 0;
	}
	
	final boolean method821(int i) {
		anInt10720++;
		if (i != 0) {
			method811(61);
		}
		return aBoolean10729;
	}
	
	private final DrawableModel method902(byte b, GraphicsToolkit graphicstoolkit, int i) {
		if (b != 69) {
			aBoolean10729 = true;
		}
		anInt10713++;
		if (aDrawableModel10724 != null && graphicstoolkit.b(aDrawableModel10724.ua(), i) == 0) {
			return aDrawableModel10724;
		}
		Class243 class243 = method904(graphicstoolkit, (byte) 118, false, i);
		if (class243 != null) {
			return class243.aDrawableModel3064;
		}
		return null;
	}
	
	public final int method72(int i) {
		anInt10732++;
		if (i != -32136) {
			anInt10722 = -2;
		}
		return /*0xffff & */aShort10734;
	}
	
	final boolean method810(int i, int i_1_, boolean bool, GraphicsToolkit graphicstoolkit) {
		anInt10727++;
		DrawableModel drawablemodel = method902((byte) 69, graphicstoolkit, 131072);
		if (drawablemodel != null) {
			Class336 class336 = graphicstoolkit.A();
			class336.method3854(anInt5934, anInt5937, anInt5940);
			if (!Node_Sub15_Sub10.aBoolean9850) {
				return drawablemodel.method624(i_1_, i, class336, false, 0);
			}
			return drawablemodel.method621(i_1_, i, class336, false, 0, Class308.anInt3912);
		}
		if (bool != false) {
			return false;
		}
		return false;
	}
	
	final void method811(int i) {
		aBoolean10729 = false;
		if (i != 27811) {
			aClass171_10711 = null;
		}
		anInt10708++;
		if (aDrawableModel10724 != null) {
			aDrawableModel10724.s(~0x10000 & aDrawableModel10724.ua());
		}
	}
	
	public final int method71(int i) {
		anInt10730++;
		return aByte10731;
	}
	
	final int method903(int i) {
		anInt10706++;
		if (i >= -20) {
			anInt10722 = 47;
		}
		if (aDrawableModel10724 == null) {
			return 15;
		}
		return aDrawableModel10724.na() / 4;
	}
	
	final Class171 method809(GraphicsToolkit graphicstoolkit, int i) {
		if (i > -93) {
			return null;
		}
		if (aClass171_10711 == null) {
			aClass171_10711 = Class167.method1752(0, anInt5937, anInt5934, method902((byte) 69, graphicstoolkit, 0), anInt5940);
		}
		anInt10728++;
		return aClass171_10711;
	}
	
	public final void method74(GraphicsToolkit graphicstoolkit, int i) {
		anInt10723++;
		if (i < -46) {
			r var_r;
			if (aR10718 != null || !aBoolean10714) {
				var_r = aR10718;
				aR10718 = null;
			} else {
				Class243 class243 = method904(graphicstoolkit, (byte) 101, true, 262144);
				var_r = class243 != null ? class243.aR3072 : null;
			}
			if (var_r != null) {
				Class320_Sub30.method3797(var_r, aByte5931, anInt5934, anInt5940, null);
			}
		}
	}
	
	final int method823(byte b) {
		anInt10712++;
		if (b != -21) {
			return -59;
		}
		if (aDrawableModel10724 != null) {
			return aDrawableModel10724.ma();
		}
		return 0;
	}
	
	final void method820(GraphicsToolkit graphicstoolkit, int i) {
		if (i == -5) {
			anInt10733++;
		}
	}
	
	Mobile_Sub2(GraphicsToolkit graphicstoolkit, ObjectDefinition objectdefinition, int i, int i_3_, int i_4_, int i_5_, int i_6_, boolean bool, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, boolean bool_13_) {
		super(i, i_3_, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_, i_10_, objectdefinition.anInt2970 == 1, Class320_Sub7.method3707(i_11_, (byte) 125, i_12_));
		aBoolean10721 = objectdefinition.anInt3057 != 0 && !bool;
		aBoolean10719 = bool;
		aByte10725 = (byte) i_12_;
		aShort10734 = /*(short) */objectdefinition.objectId;
		aByte10731 = (byte) i_11_;
		aByte5931 = (byte) i_3_;
		aBoolean10729 = bool_13_;
		aBoolean10714 = graphicstoolkit.r() && objectdefinition.aBoolean2972 && !aBoolean10719 && Class213.aNode_Sub27_2512.aClass320_Sub12_7282.method3730(false) != 0;
		int i_14_ = 2048;
		if (aBoolean10729) {
			i_14_ |= 0x10000;
		}
		Class243 class243 = method904(graphicstoolkit, (byte) 57, aBoolean10714, i_14_);
		if (class243 != null) {
			aDrawableModel10724 = class243.aDrawableModel3064;
			aR10718 = class243.aR3072;
			if (aBoolean10729) {
				aDrawableModel10724 = aDrawableModel10724.method633((byte) 0, i_14_, false);
			}
		}
	}
	
	final boolean method813(int i) {
		anInt10709++;
		if (i != 0) {
			aR10718 = null;
		}
		if (aDrawableModel10724 != null) {
			return aDrawableModel10724.F();
		}
		return false;
	}
	
	final EntityNode_Sub6 method807(int i, GraphicsToolkit graphicstoolkit) {
		anInt10726++;
		if (aDrawableModel10724 == null) {
			return null;
		}
		Class336 class336 = graphicstoolkit.A();
		class336.method3854(anInt5934, anInt5937, anInt5940);
		EntityNode_Sub6 entitynode_sub6 = Class345.method3972(aBoolean10721, (byte) 95, 1);
		if (!Node_Sub15_Sub10.aBoolean9850) {
			aDrawableModel10724.method611(class336, entitynode_sub6.anEntityNode_Sub5Array5995[0], 0);
		} else {
			aDrawableModel10724.method622(class336, entitynode_sub6.anEntityNode_Sub5Array5995[0], Class308.anInt3912, 0);
		}
		return entitynode_sub6;
	}
	
	final void method816(int i, boolean bool, GraphicsToolkit graphicstoolkit, int i_16_, byte b, int i_17_, Animable animable) {
		anInt10717++;
		if (!(animable instanceof Animable_Sub2_Sub2)) {
			if (animable instanceof Mobile_Sub2) {
				Mobile_Sub2 mobile_sub2_18_ = (Mobile_Sub2) animable;
				if (aDrawableModel10724 != null && mobile_sub2_18_.aDrawableModel10724 != null) {
					aDrawableModel10724.method619(mobile_sub2_18_.aDrawableModel10724, i_17_, i, i_16_, bool);
				}
			}
		} else {
			Animable_Sub2_Sub2 animable_sub2_sub2 = (Animable_Sub2_Sub2) animable;
			if (aDrawableModel10724 != null && animable_sub2_sub2.aDrawableModel10756 != null) {
				aDrawableModel10724.method619(animable_sub2_sub2.aDrawableModel10756, i_17_, i, i_16_, bool);
			}
		}
		if (b <= 101) {
			method809(null, -1);
		}
	}
	
	private final Class243 method904(GraphicsToolkit graphicstoolkit, byte b, boolean bool, int i) {
		anInt10735++;
		ObjectDefinition objectdefinition = Class186.aClass112_2256.method1145(/*0xffff & */aShort10734, 73);
		if (b < 7) {
			method811(111);
		}
		Plane plane;
		Plane plane_19_;
		if (!aBoolean10719) {
			plane = Node_Sub38_Sub37.aPlaneArray10466[aByte5931];
			if (aByte5931 >= 3) {
				plane_19_ = null;
			} else {
				plane_19_ = Node_Sub38_Sub37.aPlaneArray10466[1 + aByte5931];
			}
		} else {
			plane = Class368.aPlaneArray4548[aByte5931];
			plane_19_ = Node_Sub38_Sub37.aPlaneArray10466[0];
		}
		return objectdefinition.method3046(aByte10731 == 11 ? aByte10725 + 4 : aByte10725, anInt5940, anInt5934, plane, bool, (byte) 0, anInt5937, (aByte10731 ^ 0xffffffff) != -12 ? aByte10731 : 10, graphicstoolkit, null, i, plane_19_);
	}
	
	public final int method68(int i) {
		if (i != 23796) {
			return -53;
		}
		anInt10716++;
		return aByte10725;
	}
}
