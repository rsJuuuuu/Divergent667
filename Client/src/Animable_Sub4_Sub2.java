/* Animable_Sub4_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Animable_Sub4_Sub2 extends Animable_Sub4 implements Interface19
{
	private Class171 aClass171_10793;
	protected Class310 aClass310_10794;
	static int anInt10795;
	static int anInt10796;
	static int anInt10797;
	static int anInt10798;
	static int anInt10799;
	static int anInt10800;
	static int anInt10801;
	static int anInt10802;
	static int anInt10803;
	static byte[][] aByteArrayArray10804 = new byte[250][];
	static Class77 aClass77_10805 = new Class77();
	static int anInt10806;
	static int anInt10807;
	static int anInt10808;
	static int anInt10809;
	private boolean aBoolean10810;
	static int anInt10811;
	static int anInt10812;
	private boolean aBoolean10813 = true;
	static int anInt10814;
	
	final int method823(byte b) {
		anInt10808++;
		if (b != -21) {
			return -55;
		}
		return aClass310_10794.method3592(true);
	}
	
	public final int method71(int i) {
		anInt10802++;
		return aClass310_10794.anInt3926;
	}
	
	final EntityNode_Sub6 method807(int i, GraphicsToolkit graphicstoolkit) {
		anInt10803++;
		DrawableModel drawablemodel = aClass310_10794.method3597(graphicstoolkit, false, true, true, 2048);
		if (drawablemodel == null) {
			return null;
		}
		Class336 class336 = graphicstoolkit.A();
		class336.method3854(anInt5934 + aShort9145, anInt5937, anInt5940 + aShort9147);
		EntityNode_Sub6 entitynode_sub6 = Class345.method3972(aBoolean10810, (byte) -50, 1);
		int i_2_ = anInt5934 >> 9;
		int i_3_ = anInt5940 >> 9;
		aClass310_10794.method3600(i_3_, drawablemodel, true, -9827, graphicstoolkit, i_2_, i_2_, i_3_, class336);
		if (Node_Sub15_Sub10.aBoolean9850) {
			drawablemodel.method622(class336, entitynode_sub6.anEntityNode_Sub5Array5995[0], Class308.anInt3912, 0);
		} else {
			drawablemodel.method611(class336, entitynode_sub6.anEntityNode_Sub5Array5995[0], 0);
		}
		if (aClass310_10794.anEntityNode_Sub4_3931 != null) {
			Class198 class198 = aClass310_10794.anEntityNode_Sub4_3931.method954();
			if (Node_Sub15_Sub10.aBoolean9850) {
				graphicstoolkit.a(class198, Class308.anInt3912);
			} else {
				graphicstoolkit.a(class198);
			}
		}
		aBoolean10813 = drawablemodel.F() || aClass310_10794.anEntityNode_Sub4_3931 != null;
		if (aClass171_10793 != null) {
			Animator.method239(drawablemodel, anInt5940, anInt5937, anInt5934, aClass171_10793, -79);
		} else {
			aClass171_10793 = Class167.method1752(0, anInt5937, anInt5934, drawablemodel, anInt5940);
		}
		return entitynode_sub6;
	}
	
	public final int method68(int i) {
		if (i != 23796) {
			return -54;
		}
		anInt10807++;
		return aClass310_10794.anInt3951;
	}
	
	public final void method69(int i) {
		anInt10798++;
	}
	
	public final void method70(GraphicsToolkit graphicstoolkit, int i) {
		aClass310_10794.method3588(graphicstoolkit, (byte) 16);
		if (i < -42) {
			anInt10797++;
		}
	}
	
	final boolean method810(int i, int i_5_, boolean bool, GraphicsToolkit graphicstoolkit) {
		anInt10814++;
		DrawableModel drawablemodel = aClass310_10794.method3597(graphicstoolkit, false, !bool, bool, 131072);
		if (drawablemodel == null) {
			return false;
		}
		Class336 class336 = graphicstoolkit.A();
		class336.method3854(aShort9145 + anInt5934, anInt5937, anInt5940 + aShort9147);
		if (!Node_Sub15_Sub10.aBoolean9850) {
			return drawablemodel.method624(i_5_, i, class336, false, 0);
		}
		return drawablemodel.method621(i_5_, i, class336, false, 0, Class308.anInt3912);
	}
	
	final void method933(Class121 class121, byte b) {
		if (b <= 26) {
			aClass77_10805 = null;
		}
		aClass310_10794.method3598(class121, -12);
		anInt10799++;
	}
	
	public static void method934(int i) {
		aByteArrayArray10804 = null;
		if (i == -1703522551) {
			aClass77_10805 = null;
		}
	}
	
	Animable_Sub4_Sub2(GraphicsToolkit graphicstoolkit, ObjectDefinition objectdefinition, int i, int i_6_, int i_7_, int i_8_, int i_9_, boolean bool, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_) {
		super(i_7_, i_8_, i_9_, i, i_6_, i_10_, i_11_);
		aClass310_10794 = new Class310(graphicstoolkit, objectdefinition, i_12_, i_13_, plane, i_6_, this, bool, i_14_);
		aBoolean10810 = objectdefinition.anInt3057 != 0 && !bool;
	}
	
	public final boolean method73(int i) {
		anInt10795++;
		if (i != -19717) {
			method69(26);
		}
		return aClass310_10794.method3594(10);
	}
	
	final boolean method814(byte b) {
		anInt10801++;
		return false;
	}
	
	final Class171 method809(GraphicsToolkit graphicstoolkit, int i) {
		if (i >= -93) {
			return null;
		}
		anInt10809++;
		return aClass171_10793;
	}
	
	public final void method74(GraphicsToolkit graphicstoolkit, int i) {
		anInt10812++;
		aClass310_10794.method3587(graphicstoolkit, 262144);
		if (i >= -46) {
			method817(92);
		}
	}
	
	final boolean method813(int i) {
		if (i != 0) {
			return true;
		}
		anInt10811++;
		return aBoolean10813;
	}
	
	final int method817(int i) {
		if (i != 2) {
			return 14;
		}
		anInt10800++;
		return aClass310_10794.method3590((byte) -112);
	}
	
	final void method820(GraphicsToolkit graphicstoolkit, int i) {
		if (i != -5) {
			method933(null, (byte) 103);
		}
		anInt10806++;
		DrawableModel drawablemodel = aClass310_10794.method3597(graphicstoolkit, false, true, true, 262144);
		if (drawablemodel != null) {
			int i_15_ = anInt5934 >> 9;
			int i_16_ = anInt5940 >> 9;
			Class336 class336 = graphicstoolkit.A();
			class336.method3854(anInt5934, anInt5937, anInt5940);
			aClass310_10794.method3600(i_16_, drawablemodel, false, i + -9822, graphicstoolkit, i_15_, i_15_, i_16_, class336);
		}
	}
	
	public final int method72(int i) {
		anInt10796++;
		if (i != -32136) {
			aClass310_10794 = null;
		}
		return aClass310_10794.anInt3933;
	}
}
