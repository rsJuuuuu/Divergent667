/* Animable_Sub4_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Animable_Sub4_Sub1 extends Animable_Sub4 implements Interface19
{
	private boolean aBoolean10673;
	static int anInt10674;
	static int anInt10675;
	private r aR10676;
	private int aShort10677;
	static int anInt10678;
	static int anInt10679;
	static int anInt10680;
	static int anInt10681;
	static int anInt10682;
	static int anInt10683;
	private boolean aBoolean10684;
	static int anInt10685;
	private byte aByte10686;
	static int anInt10687 = -1;
	static int anInt10688;
	static int anInt10689;
	static int anInt10690;
	static int anInt10691;
	static int anInt10692;
	static int anInt10693;
	static int anInt10694;
	static int anInt10695;
	private DrawableModel aDrawableModel10696;
	static int anInt10697;
	private byte aByte10698;
	static int anInt10699;
	static int anInt10700;
	private Class171 aClass171_10701;
	private boolean aBoolean10702;
	static int anInt10703;
	
	public final int method68(int i) {
		if (i != 23796) {
			method71(-18);
		}
		anInt10679++;
		return aByte10698;
	}
	
	static final void method927(int i, int i_0_, int i_1_, Node_Sub13 node_sub13, int i_2_) {
		anInt10681++;
		node_sub13.aPacket7113.writeIntV2(i);
		node_sub13.aPacket7113.writeShortLE128(i_0_);
		node_sub13.aPacket7113.writeShort(i_2_);
	}
	
	private final DrawableModel method928(int i, int i_4_, GraphicsToolkit graphicstoolkit) {
		anInt10695++;
		if (aDrawableModel10696 != null && graphicstoolkit.b(aDrawableModel10696.ua(), i) == 0) {
			return aDrawableModel10696;
		}
		if (i_4_ != 25524) {
			method820(null, -111);
		}
		Class243 class243 = method932((byte) 24, graphicstoolkit, i, false);
		if (class243 == null) {
			return null;
		}
		return class243.aDrawableModel3064;
	}
	
	public final void method69(int i) {
		anInt10692++;
		if (aDrawableModel10696 != null) {
			aDrawableModel10696.method617();
		}
	}
	
	final int method817(int i) {
		anInt10683++;
		if (i != 2) {
			aDrawableModel10696 = null;
		}
		if (aDrawableModel10696 != null) {
			return aDrawableModel10696.fa();
		}
		return 0;
	}
	
	static final long method929(Interface19 interface19, int i, int i_6_, boolean bool) {
		anInt10694++;
		long l = 4194304L;
		if (bool != true) {
			method927(-86, -65, -50, null, 40);
		}
		long l_7_ = -9223372036854775808L;
		ObjectDefinition objectdefinition = Class186.aClass112_2256.method1145(interface19.method72(-32136), 44);
		long l_8_ = (long) (i_6_ | i << 7 | interface19.method71(-126) << 14 | interface19.method68(23796) << 20 | 0x40000000);
		if (objectdefinition.anInt3057 == 0) {
			l_8_ |= l_7_;
		}
		if ((objectdefinition.anInt2970 ^ 0xffffffff) == -2) {
			l_8_ |= l;
		}
		l_8_ |= (long) interface19.method72(-32136) << 32;
		return l_8_;
	}
	
	public final boolean method73(int i) {
		anInt10690++;
		if (i != -19717) {
			return true;
		}
		return aBoolean10684;
	}
	
	final boolean method810(int i, int i_9_, boolean bool, GraphicsToolkit graphicstoolkit) {
		anInt10703++;
		if (bool != false) {
			method70(null, 39);
		}
		DrawableModel drawablemodel = method928(131072, 25524, graphicstoolkit);
		if (drawablemodel != null) {
			Class336 class336 = graphicstoolkit.A();
			class336.method3854(anInt5934, anInt5937, anInt5940);
			if (!Node_Sub15_Sub10.aBoolean9850) {
				return drawablemodel.method624(i_9_, i, class336, false, 0);
			}
			return drawablemodel.method621(i_9_, i, class336, false, 0, Class308.anInt3912);
		}
		return false;
	}
	
	final Class171 method809(GraphicsToolkit graphicstoolkit, int i) {
		if (i >= -93) {
			method68(-71);
		}
		anInt10685++;
		if (aClass171_10701 == null) {
			aClass171_10701 = Class167.method1752(0, anInt5937, anInt5934, method928(0, 25524, graphicstoolkit), anInt5940);
		}
		return aClass171_10701;
	}
	
	static final boolean method930(int i, char c) {
		if (i != -31853) {
			anInt10687 = -94;
		}
		anInt10680++;
        return !((c ^ 0xffffffff) > -49 || c > 57);
    }
	
	public final void method74(GraphicsToolkit graphicstoolkit, int i) {
		anInt10689++;
		if (i >= -46) {
			method68(22);
		}
		r var_r;
		if (aR10676 == null && aBoolean10684) {
			Class243 class243 = method932((byte) 24, graphicstoolkit, 262144, true);
			var_r = class243 != null ? class243.aR3072 : null;
		} else {
			var_r = aR10676;
			aR10676 = null;
		}
		if (var_r != null) {
			Class320_Sub30.method3797(var_r, aByte5931, anInt5934, anInt5940, null);
		}
	}
	
	final void method820(GraphicsToolkit graphicstoolkit, int i) {
		if (i != -5) {
			aByte10698 = (byte) 89;
		}
		anInt10700++;
	}
	
	final boolean method813(int i) {
		anInt10693++;
		if (i != 0) {
			return false;
		}
		if (aDrawableModel10696 == null) {
			return false;
		}
		return aDrawableModel10696.F();
	}
	
	public final void method70(GraphicsToolkit graphicstoolkit, int i) {
		anInt10699++;
		r var_r;
		if (aR10676 == null && aBoolean10684) {
			Class243 class243 = method932((byte) 24, graphicstoolkit, 262144, true);
			var_r = class243 == null ? null : class243.aR3072;
		} else {
			var_r = aR10676;
			aR10676 = null;
		}
		if (i < -42) {
			if (var_r != null) {
				Node_Sub23.method2636(var_r, aByte5931, anInt5934, anInt5940, null);
			}
		}
	}
	
	public final int method72(int i) {
		if (i != -32136) {
			return 109;
		}
		anInt10688++;
		return aShort10677 ;
	}
	
	Animable_Sub4_Sub1(GraphicsToolkit graphicstoolkit, ObjectDefinition objectdefinition, int i, int i_10_, int i_11_, int i_12_, int i_13_, boolean bool, int i_14_, int i_15_, int i_16_, int i_17_) {
		super(i_11_, i_12_, i_13_, i, i_10_, i_14_, i_15_);
		anInt5940 = i_13_;
		aShort10677 = objectdefinition.objectId;
		aByte10698 = (byte) i_17_;
		anInt5934 = i_11_;
		aByte10686 = (byte) i_16_;
		aBoolean10702 = (objectdefinition.anInt3057 ^ 0xffffffff) != -1 && !bool;
		aBoolean10673 = bool;
		aBoolean10684 = graphicstoolkit.r() && objectdefinition.aBoolean2972 && !aBoolean10673 && (Class213.aNode_Sub27_2512.aClass320_Sub12_7282.method3730(false) ^ 0xffffffff) != -1;
		Class243 class243 = method932((byte) 24, graphicstoolkit, 2048, aBoolean10684);
		if (class243 != null) {
			aDrawableModel10696 = class243.aDrawableModel3064;
			aR10676 = class243.aR3072;
		}
	}
	
	static final boolean method931(int i, boolean bool, int i_18_) {
		anInt10674++;
		if (bool != true) {
			method930(122, '.');
		}
        return (0x800 & i) != 0;
    }
	
	final boolean method814(byte b) {
		anInt10697++;
		if (aDrawableModel10696 == null) {
			return true;
		}
        return !aDrawableModel10696.r();
    }
	
	private final Class243 method932(byte b, GraphicsToolkit graphicstoolkit, int i, boolean bool) {
		if (b != 24) {
			return null;
		}
		anInt10678++;
		ObjectDefinition objectdefinition = Class186.aClass112_2256.method1145(aShort10677, 42);
		Plane plane;
		Plane plane_19_;
		if (aBoolean10673) {
			plane_19_ = Node_Sub38_Sub37.aPlaneArray10466[0];
			plane = Class368.aPlaneArray4548[aByte5931];
		} else {
			plane = Node_Sub38_Sub37.aPlaneArray10466[aByte5931];
			if (aByte5931 < 3) {
				plane_19_ = Node_Sub38_Sub37.aPlaneArray10466[1 + aByte5931];
			} else {
				plane_19_ = null;
			}
		}
		return objectdefinition.method3046(aByte10698, anInt5940, anInt5934, plane, bool, (byte) 0, anInt5937, aByte10686, graphicstoolkit, null, i, plane_19_);
	}
	
	public final int method71(int i) {
		anInt10675++;
		return aByte10686;
	}
	
	final EntityNode_Sub6 method807(int i, GraphicsToolkit graphicstoolkit) {
		anInt10682++;
		if (aDrawableModel10696 == null) {
			return null;
		}
		Class336 class336 = graphicstoolkit.A();
		class336.method3854(anInt5934 - -aShort9145, anInt5937, aShort9147 + anInt5940);
		EntityNode_Sub6 entitynode_sub6 = Class345.method3972(aBoolean10702, (byte) 111, 1);
		if (!Node_Sub15_Sub10.aBoolean9850) {
			aDrawableModel10696.method611(class336, entitynode_sub6.anEntityNode_Sub5Array5995[0], 0);
		} else {
			aDrawableModel10696.method622(class336, entitynode_sub6.anEntityNode_Sub5Array5995[0], Class308.anInt3912, 0);
		}
		return entitynode_sub6;
	}
	
	final int method823(byte b) {
		anInt10691++;
		if (b != -21) {
			aByte10686 = (byte) 110;
		}
		if (aDrawableModel10696 != null) {
			return aDrawableModel10696.ma();
		}
		return 0;
	}
}
