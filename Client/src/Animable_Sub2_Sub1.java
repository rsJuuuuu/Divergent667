/* Animable_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Animable_Sub2_Sub1 extends Animable_Sub2 implements Interface19
{
	static int anInt10620;
	static int anInt10621;
	static int anInt10622;
	static int anInt10623;
	static int anInt10624;
	static int anInt10625;
	static int anInt10626;
	static int anInt10627;
	static boolean aBoolean10628 = false;
	static int anInt10629;
	static long aLong10630 = -1L;
	static double aDouble10631;
	protected Class310 aClass310_10632;
	static int anInt10633;
	static int anInt10634;
	private boolean aBoolean10635;
	static int anInt10636;
	static int anInt10637;
	static int[] anIntArray10638 = new int[4096];
	static int anInt10639;
	static int anInt10640;
	static int anInt10641;
	private boolean aBoolean10642 = true;
	static int anInt10643;
	static OutcommingPacket aClass318_10644 = new OutcommingPacket(57, 3);
	static int anInt10645;
	static int anInt10646;
	private Class171 aClass171_10647;
	
	final void method839(Class121 class121, int i) {
		if (i == 3) {
			aClass310_10632.method3598(class121, -12);
			anInt10633++;
		}
	}
	
	public final int method68(int i) {
		if (i != 23796) {
			method817(52);
		}
		anInt10646++;
		return aClass310_10632.anInt3951;
	}
	
	public final void method74(GraphicsToolkit graphicstoolkit, int i) {
		anInt10637++;
		aClass310_10632.method3587(graphicstoolkit, 262144);
		if (i >= -46) {
			aClass310_10632 = null;
		}
	}
	
	public final int method72(int i) {
		if (i != -32136) {
			aClass171_10647 = null;
		}
		anInt10636++;
		return aClass310_10632.anInt3933;
	}
	
	final void method811(int i) {
		if (i != 27811) {
			method810(-29, 50, false, null);
		}
		anInt10620++;
		throw new IllegalStateException();
	}
	
	Animable_Sub2_Sub1(GraphicsToolkit graphicstoolkit, ObjectDefinition objectdefinition, int i, int i_0_, int i_1_, int i_2_, int i_3_, boolean bool, int i_4_, int i_5_, int i_6_) {
		super(i_1_, i_2_, i_3_, i, i_0_, Node_Sub30.method2720(i_5_, i_4_, -123));
		aClass310_10632 = new Class310(graphicstoolkit, objectdefinition, i_4_, i_5_, plane, i_0_, this, bool, i_6_);
		aBoolean10635 = (objectdefinition.anInt3057 ^ 0xffffffff) != -1 && !bool;
	}
	
	final boolean method821(int i) {
		anInt10645++;
        return i != 0;
    }
	
	final EntityNode_Sub6 method807(int i, GraphicsToolkit graphicstoolkit) {
		anInt10641++;
		DrawableModel drawablemodel = aClass310_10632.method3597(graphicstoolkit, false, true, true, 2048);
		if (drawablemodel == null) {
			return null;
		}
		Class336 class336 = graphicstoolkit.A();
		class336.method3854(anInt5934, anInt5937, anInt5940);
		EntityNode_Sub6 entitynode_sub6 = Class345.method3972(aBoolean10635, (byte) -57, 1);
		int i_8_ = anInt5934 >> 9;
		int i_9_ = anInt5940 >> 9;
		aClass310_10632.method3600(i_9_, drawablemodel, true, -9827, graphicstoolkit, i_8_, i_8_, i_9_, class336);
		if (Node_Sub15_Sub10.aBoolean9850) {
			drawablemodel.method622(class336, entitynode_sub6.anEntityNode_Sub5Array5995[0], Class308.anInt3912, 0);
		} else {
			drawablemodel.method611(class336, entitynode_sub6.anEntityNode_Sub5Array5995[0], 0);
		}
		if (aClass310_10632.anEntityNode_Sub4_3931 != null) {
			Class198 class198 = aClass310_10632.anEntityNode_Sub4_3931.method954();
			if (!Node_Sub15_Sub10.aBoolean9850) {
				graphicstoolkit.a(class198);
			} else {
				graphicstoolkit.a(class198, Class308.anInt3912);
			}
		}
		aBoolean10642 = drawablemodel.F() || aClass310_10632.anEntityNode_Sub4_3931 != null;
		if (aClass171_10647 == null) {
			aClass171_10647 = Class167.method1752(0, anInt5937, anInt5934, drawablemodel, anInt5940);
		} else {
			Animator.method239(drawablemodel, anInt5940, anInt5937, anInt5934, aClass171_10647, -79);
		}
		return entitynode_sub6;
	}
	
	final boolean method813(int i) {
		anInt10634++;
		if (i != 0) {
			anIntArray10638 = null;
		}
		return aBoolean10642;
	}
	
	final void method816(int i, boolean bool, GraphicsToolkit graphicstoolkit, int i_10_, byte b, int i_11_, Animable animable) {
		anInt10626++;
		if (b >= 101) {
			throw new IllegalStateException();
		}
	}
	
	final boolean method810(int i, int i_12_, boolean bool, GraphicsToolkit graphicstoolkit) {
		anInt10643++;
		DrawableModel drawablemodel = aClass310_10632.method3597(graphicstoolkit, false, true, bool, 131072);
		if (drawablemodel == null) {
			return false;
		}
		Class336 class336 = graphicstoolkit.A();
		class336.method3854(anInt5934, anInt5937, anInt5940);
		if (Node_Sub15_Sub10.aBoolean9850) {
			return drawablemodel.method621(i_12_, i, class336, false, 0, Class308.anInt3912);
		}
		return drawablemodel.method624(i_12_, i, class336, false, 0);
	}
	
	final int method823(byte b) {
		if (b != -21) {
			method823((byte) -62);
		}
		anInt10639++;
		return aClass310_10632.method3592(true);
	}
	
	final void method820(GraphicsToolkit graphicstoolkit, int i) {
		if (i == -5) {
			anInt10625++;
			DrawableModel drawablemodel = aClass310_10632.method3597(graphicstoolkit, true, true, true, 262144);
			if (drawablemodel != null) {
				int i_13_ = anInt5934 >> 9;
				int i_14_ = anInt5940 >> 9;
				Class336 class336 = graphicstoolkit.A();
				class336.method3854(anInt5934, anInt5937, anInt5940);
				aClass310_10632.method3600(i_14_, drawablemodel, false, -9827, graphicstoolkit, i_13_, i_13_, i_14_, class336);
			}
		}
	}
	
	public final void method70(GraphicsToolkit graphicstoolkit, int i) {
		anInt10624++;
		if (i < -42) {
			aClass310_10632.method3588(graphicstoolkit, (byte) 16);
		}
	}
	
	public final void method69(int i) {
		anInt10623++;
	}
	
	final boolean method814(byte b) {
		anInt10622++;
		return false;
	}
	
	final Class171 method809(GraphicsToolkit graphicstoolkit, int i) {
		if (i >= -93) {
			aClass171_10647 = null;
		}
		anInt10640++;
		return aClass171_10647;
	}
	
	public final boolean method73(int i) {
		anInt10627++;
		if (i != -19717) {
			aClass310_10632 = null;
		}
		return aClass310_10632.method3594(i + 19727);
	}
	
	public static void method840(int i) {
		aClass318_10644 = null;
		if (i == -17940) {
			anIntArray10638 = null;
		}
	}
	
	final int method817(int i) {
		if (i != 2) {
			return 103;
		}
		anInt10621++;
		return aClass310_10632.method3590((byte) -112);
	}
	
	public final int method71(int i) {
		anInt10629++;
		return aClass310_10632.anInt3926;
	}
}
