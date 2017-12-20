/* Animable_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Animable_Sub2_Sub2 extends Animable_Sub2 implements Interface19
{
	static int anInt10736;
	private boolean aBoolean10737;
	static int anInt10738;
	static int anInt10739;
	private boolean aBoolean10740;
	static int anInt10741;
	static int anInt10742;
	private byte aByte10743;
	static int anInt10744;
	static int anInt10745;
	private boolean aBoolean10746;
	static int anInt10747;
	static int anInt10748;
	static int anInt10749;
	static short aShort10750 = 32767;
	private byte aByte10751;
	private boolean aBoolean10752;
	private r aR10753;
	private int aShort10754;
	static int anInt10755;
	protected DrawableModel aDrawableModel10756;
	static int anInt10757;
	private Class171 aClass171_10758;
	static int anInt10759;
	static int anInt10760;
	static int anInt10761;
	static int anInt10762;
	static int anInt10763;
	static int anInt10764;
	static int anInt10765;
	static int anInt10766;
	static int anInt10767;
	
	final boolean method821(int i) {
		if (i != 0) {
			method814((byte) 100);
		}
		anInt10742++;
		return aBoolean10746;
	}
	
	final boolean method813(int i) {
		if (i != 0) {
			return false;
		}
		anInt10760++;
		if (aDrawableModel10756 != null) {
			return aDrawableModel10756.F();
		}
		return false;
	}
	
	Animable_Sub2_Sub2(GraphicsToolkit graphicstoolkit, ObjectDefinition objectdefinition, int i, int i_0_, int i_1_, int i_2_, int i_3_, boolean bool, int i_4_, int i_5_, boolean bool_6_) {
		super(i_1_, i_2_, i_3_, i, i_0_, Class261.method3144(false, i_5_, i_4_));
		anInt5934 = i_1_;
		anInt5940 = i_3_;
		aBoolean10752 = objectdefinition.anInt3057 != 0 && !bool;
		aShort10754 = objectdefinition.objectId;
		aByte10751 = (byte) i_4_;
		aBoolean10737 = bool;
		aBoolean10746 = bool_6_;
		aByte10743 = (byte) i_5_;
		aBoolean10740 = graphicstoolkit.r() && objectdefinition.aBoolean2972 && !aBoolean10737 && (Class213.aNode_Sub27_2512.aClass320_Sub12_7282.method3730(false) ^ 0xffffffff) != -1;
		int i_7_ = 2048;
		if (aBoolean10746) {
			i_7_ |= 0x10000;
		}
		Class243 class243 = method842(graphicstoolkit, false, i_7_, aBoolean10740);
		if (class243 != null) {
			aDrawableModel10756 = class243.aDrawableModel3064;
			aR10753 = class243.aR3072;
			if (aBoolean10746) {
				aDrawableModel10756 = aDrawableModel10756.method633((byte) 0, i_7_, false);
			}
		}
	}
	
	public final void method74(GraphicsToolkit graphicstoolkit, int i) {
		if (i < -46) {
			anInt10736++;
			r var_r;
			if (aR10753 != null || !aBoolean10740) {
				var_r = aR10753;
				aR10753 = null;
			} else {
				Class243 class243 = method842(graphicstoolkit, false, 262144, true);
				var_r = class243 != null ? class243.aR3072 : null;
			}
			if (var_r != null) {
				Class320_Sub30.method3797(var_r, aByte5931, anInt5934, anInt5940, null);
			}
		}
	}
	
	final void method816(int i, boolean bool, GraphicsToolkit graphicstoolkit, int i_8_, byte b, int i_9_, Animable animable) {
		if (!(animable instanceof Animable_Sub2_Sub2)) {
			if (animable instanceof Mobile_Sub2) {
				Mobile_Sub2 mobile_sub2 = (Mobile_Sub2) animable;
				if (aDrawableModel10756 != null && mobile_sub2.aDrawableModel10724 != null) {
					aDrawableModel10756.method619(mobile_sub2.aDrawableModel10724, i_9_, i, i_8_, bool);
				}
			}
		} else {
			Animable_Sub2_Sub2 animable_sub2_sub2_10_ = (Animable_Sub2_Sub2) animable;
			if (aDrawableModel10756 != null && animable_sub2_sub2_10_.aDrawableModel10756 != null) {
				aDrawableModel10756.method619(animable_sub2_sub2_10_.aDrawableModel10756, i_9_, i, i_8_, bool);
			}
		}
		if (b < 101) {
			method813(1);
		}
		anInt10748++;
	}
	
	public final boolean method73(int i) {
		anInt10764++;
		if (i != -19717) {
			aBoolean10746 = true;
		}
		return aBoolean10740;
	}
	
	final boolean method814(byte b) {
		anInt10747++;
		if (aDrawableModel10756 == null) {
			return true;
		}
        return !aDrawableModel10756.r();
    }
	
	final int method817(int i) {
		if (i != 2) {
			method843(null, 57);
		}
		anInt10762++;
		if (aDrawableModel10756 != null) {
			return aDrawableModel10756.fa();
		}
		return 0;
	}
	
	final Class171 method809(GraphicsToolkit graphicstoolkit, int i) {
		if (aClass171_10758 == null) {
			aClass171_10758 = Class167.method1752(0, anInt5937, anInt5934, method841(graphicstoolkit, (byte) 62, 0), anInt5940);
		}
		if (i >= -93) {
			aClass171_10758 = null;
		}
		anInt10741++;
		return aClass171_10758;
	}
	
	private final DrawableModel method841(GraphicsToolkit graphicstoolkit, byte b, int i) {
		if (b != 62) {
			aBoolean10740 = false;
		}
		anInt10759++;
		if (aDrawableModel10756 != null && (graphicstoolkit.b(aDrawableModel10756.ua(), i) ^ 0xffffffff) == -1) {
			return aDrawableModel10756;
		}
		Class243 class243 = method842(graphicstoolkit, false, i, false);
		if (class243 != null) {
			return class243.aDrawableModel3064;
		}
		return null;
	}
	
	final void method811(int i) {
		anInt10765++;
		aBoolean10746 = false;
		if (aDrawableModel10756 != null) {
			aDrawableModel10756.s(aDrawableModel10756.ua() & ~0x10000);
		}
		if (i != 27811) {
			aByte10751 = (byte) -28;
		}
	}
	
	public final void method69(int i) {
		if (aDrawableModel10756 != null) {
			aDrawableModel10756.method617();
		}
		anInt10755++;
	}
	
	public final void method70(GraphicsToolkit graphicstoolkit, int i) {
		anInt10745++;
		if (i >= -42) {
			aClass171_10758 = null;
		}
		r var_r;
		if (aR10753 != null || !aBoolean10740) {
			var_r = aR10753;
			aR10753 = null;
		} else {
			Class243 class243 = method842(graphicstoolkit, false, 262144, true);
			var_r = class243 != null ? class243.aR3072 : null;
		}
		if (var_r != null) {
			Node_Sub23.method2636(var_r, aByte5931, anInt5934, anInt5940, null);
		}
	}
	
	final int method823(byte b) {
		if (b != -21) {
			return 49;
		}
		anInt10744++;
		if (aDrawableModel10756 == null) {
			return 0;
		}
		return aDrawableModel10756.ma();
	}
	
	private final Class243 method842(GraphicsToolkit graphicstoolkit, boolean bool, int i, boolean bool_12_) {
		anInt10739++;
		ObjectDefinition objectdefinition = Class186.aClass112_2256.method1145(aShort10754, 56);
		if (bool != false) {
			aBoolean10737 = true;
		}
		Plane plane;
		Plane plane_13_;
		if (!aBoolean10737) {
			plane = Node_Sub38_Sub37.aPlaneArray10466[aByte5931];
			if (aByte5931 < 3) {
				plane_13_ = Node_Sub38_Sub37.aPlaneArray10466[aByte5931 + 1];
			} else {
				plane_13_ = null;
			}
		} else {
			plane = Class368.aPlaneArray4548[aByte5931];
			plane_13_ = Node_Sub38_Sub37.aPlaneArray10466[0];
		}
		return objectdefinition.method3046(aByte10743, anInt5940, anInt5934, plane, bool_12_, (byte) 0, anInt5937, aByte10751, graphicstoolkit, null, i, plane_13_);
	}
	
	final void method820(GraphicsToolkit graphicstoolkit, int i) {
		anInt10738++;
		if (i != -5) {
			aBoolean10746 = true;
		}
	}
	
	final boolean method810(int i, int i_14_, boolean bool, GraphicsToolkit graphicstoolkit) {
		anInt10767++;
		DrawableModel drawablemodel = method841(graphicstoolkit, (byte) 62, 131072);
		if (drawablemodel != null) {
			Class336 class336 = graphicstoolkit.A();
			class336.method3854(anInt5934, anInt5937, anInt5940);
			if (Node_Sub15_Sub10.aBoolean9850) {
				return drawablemodel.method621(i_14_, i, class336, false, 0, Class308.anInt3912);
			}
			return drawablemodel.method624(i_14_, i, class336, false, 0);
		}
		if (bool != false) {
			aClass171_10758 = null;
		}
		return false;
	}
	
	public final int method72(int i) {
		anInt10757++;
		if (i != -32136) {
			aDrawableModel10756 = null;
		}
		return aShort10754;
	}
	
	static final long method843(String string, int i) {
		anInt10761++;
		if (i >= -87) {
			aShort10750 = (short) -52;
		}
		long l = 0L;
		int i_15_ = string.length();
		for (int i_16_ = 0; (i_15_ ^ 0xffffffff) < (i_16_ ^ 0xffffffff); i_16_++) {
			l *= 37L;
			int i_17_ = string.charAt(i_16_);
			if ((i_17_ ^ 0xffffffff) <= -66 && i_17_ <= 90) {
				l += (long) (-65 + (i_17_ + 1));
			} else if (i_17_ >= 97 && i_17_ <= 122) {
				l += (long) (-97 + i_17_ + 1);
			} else if ((i_17_ ^ 0xffffffff) <= -49 && (i_17_ ^ 0xffffffff) >= -58) {
				l += (long) (-48 + (27 - -i_17_));
			}
			if ((l ^ 0xffffffffffffffffL) <= -177917621779460414L) {
				break;
			}
		}
		for (/**/; (l % 37L ^ 0xffffffffffffffffL) == -1L; l /= 37L) {
			if ((l ^ 0xffffffffffffffffL) == -1L) {
				break;
			}
		}
		return l;
	}
	
	final EntityNode_Sub6 method807(int i, GraphicsToolkit graphicstoolkit) {
		anInt10749++;
		if (aDrawableModel10756 == null) {
			return null;
		}
		Class336 class336 = graphicstoolkit.A();
		class336.method3854(anInt5934, anInt5937, anInt5940);
		EntityNode_Sub6 entitynode_sub6 = Class345.method3972(aBoolean10752, (byte) -40, 1);
		if (Node_Sub15_Sub10.aBoolean9850) {
			aDrawableModel10756.method622(class336, entitynode_sub6.anEntityNode_Sub5Array5995[0], Class308.anInt3912, 0);
		} else {
			aDrawableModel10756.method611(class336, entitynode_sub6.anEntityNode_Sub5Array5995[0], 0);
		}
		return entitynode_sub6;
	}
	
	public final int method71(int i) {
		anInt10763++;
		return aByte10751;
	}
	
	public final int method68(int i) {
		if (i != 23796) {
			aByte10743 = (byte) 21;
		}
		anInt10766++;
		return aByte10743;
	}
}
