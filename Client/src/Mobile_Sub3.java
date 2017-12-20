/* Mobile_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Mobile_Sub3 extends Mobile implements Interface19
{
	static int anInt10768;
	static int anInt10769;
	static int anInt10770;
	static int anInt10771;
	static int anInt10772;
	static int anInt10773;
	private Class171 aClass171_10774;
	static int anInt10775;
	static int anInt10776;
	protected Class310 aClass310_10777;
	static IncommingPacket aClass192_10778;
	static int anInt10779;
	private boolean aBoolean10780;
	static int anInt10781;
	static int anInt10782;
	static int anInt10783;
	static int anInt10784 = 0;
	static int anInt10785;
	private boolean aBoolean10786 = true;
	static int anInt10787;
	static int anInt10788;
	static int anInt10789;
	static int anInt10790;
	static int anInt10791;
	static int anInt10792;
	
	public static void method905(byte b) {
		aClass192_10778 = null;
		if (b <= 88) {
			anInt10784 = 44;
		}
	}
	
	final void method816(int i, boolean bool, GraphicsToolkit graphicstoolkit, int i_0_, byte b, int i_1_, Animable animable) {
		if (b < 101) {
			aClass192_10778 = null;
		}
		anInt10789++;
		throw new IllegalStateException();
	}
	
	final boolean method810(int i, int i_2_, boolean bool, GraphicsToolkit graphicstoolkit) {
		anInt10781++;
		DrawableModel drawablemodel = aClass310_10777.method3597(graphicstoolkit, false, true, bool, 131072);
		if (drawablemodel == null) {
			return false;
		}
		Class336 class336 = graphicstoolkit.A();
		class336.method3854(anInt5934, anInt5937, anInt5940);
		if (Node_Sub15_Sub10.aBoolean9850) {
			return drawablemodel.method621(i_2_, i, class336, false, 0, Class308.anInt3912);
		}
		return drawablemodel.method624(i_2_, i, class336, false, 0);
	}
	
	final EntityNode_Sub6 method807(int i, GraphicsToolkit graphicstoolkit) {
		anInt10783++;
		DrawableModel drawablemodel = aClass310_10777.method3597(graphicstoolkit, false, true, true, 2048);
		if (drawablemodel == null) {
			return null;
		}
		Class336 class336 = graphicstoolkit.A();
		class336.method3854(anInt5934, anInt5937, anInt5940);
		EntityNode_Sub6 entitynode_sub6 = Class345.method3972(aBoolean10780, (byte) 116, 1);
		aClass310_10777.method3600(aShort9124, drawablemodel, true, -9827, graphicstoolkit, aShort9130, aShort9119, aShort9120, class336);
		if (Node_Sub15_Sub10.aBoolean9850) {
			drawablemodel.method622(class336, entitynode_sub6.anEntityNode_Sub5Array5995[0], Class308.anInt3912, 0);
		} else {
			drawablemodel.method611(class336, entitynode_sub6.anEntityNode_Sub5Array5995[0], 0);
		}
		if (aClass310_10777.anEntityNode_Sub4_3931 != null) {
			Class198 class198 = aClass310_10777.anEntityNode_Sub4_3931.method954();
			if (Node_Sub15_Sub10.aBoolean9850) {
				graphicstoolkit.a(class198, Class308.anInt3912);
			} else {
				graphicstoolkit.a(class198);
			}
		}
		aBoolean10786 = drawablemodel.F() || aClass310_10777.anEntityNode_Sub4_3931 != null;
		if (aClass171_10774 != null) {
			Animator.method239(drawablemodel, anInt5940, anInt5937, anInt5934, aClass171_10774, -107);
		} else {
			aClass171_10774 = Class167.method1752(0, anInt5937, anInt5934, drawablemodel, anInt5940);
		}
		return entitynode_sub6;
	}
	
	final boolean method813(int i) {
		anInt10769++;
		if (i != 0) {
			aClass171_10774 = null;
		}
		return aBoolean10786;
	}
	
	public final int method68(int i) {
		anInt10775++;
		if (i != 23796) {
			aBoolean10780 = false;
		}
		return aClass310_10777.anInt3951;
	}
	
	public final boolean method73(int i) {
		if (i != -19717) {
			aBoolean10780 = false;
		}
		anInt10779++;
		return aClass310_10777.method3594(i ^ ~0x4d0e);
	}
	
	final boolean method821(int i) {
		if (i != 0) {
			return false;
		}
		anInt10768++;
		return false;
	}
	
	final void method820(GraphicsToolkit graphicstoolkit, int i) {
		anInt10782++;
		DrawableModel drawablemodel = aClass310_10777.method3597(graphicstoolkit, true, true, true, 262144);
		if (i == -5) {
			if (drawablemodel != null) {
				Class336 class336 = graphicstoolkit.A();
				class336.method3854(anInt5934, anInt5937, anInt5940);
				aClass310_10777.method3600(aShort9124, drawablemodel, false, -9827, graphicstoolkit, aShort9130, aShort9119, aShort9120, class336);
			}
		}
	}
	
	public final int method71(int i) {
		anInt10773++;
		return aClass310_10777.anInt3926;
	}
	
	public final int method72(int i) {
		if (i != -32136) {
			aClass310_10777 = null;
		}
		anInt10772++;
		return aClass310_10777.anInt3933;
	}
	
	final Class171 method809(GraphicsToolkit graphicstoolkit, int i) {
		if (i >= -93) {
			aClass310_10777 = null;
		}
		anInt10791++;
		return aClass171_10774;
	}
	
	final void method811(int i) {
		if (i != 27811) {
			aBoolean10780 = false;
		}
		anInt10790++;
		throw new IllegalStateException();
	}
	
	final void method906(int i, Class121 class121) {
		anInt10771++;
		aClass310_10777.method3598(class121, -12);
	}
	
	final boolean method814(byte b) {
		anInt10787++;
		return false;
	}
	
	public final void method70(GraphicsToolkit graphicstoolkit, int i) {
		if (i >= -42) {
			method816(72, true, null, -2, (byte) 37, -105, null);
		}
		aClass310_10777.method3588(graphicstoolkit, (byte) 16);
		anInt10792++;
	}
	
	final int method823(byte b) {
		anInt10776++;
		if (b != -21) {
			aBoolean10780 = true;
		}
		return aClass310_10777.method3592(true);
	}
	
	Mobile_Sub3(GraphicsToolkit graphicstoolkit, ObjectDefinition objectdefinition, int i, int i_6_, int i_7_, int i_8_, int i_9_, boolean bool, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_) {
		super(i, i_6_, i_7_, i_8_, i_9_, i_10_, i_11_, i_12_, i_13_, objectdefinition.anInt2970 == 1, PlayerUpdateReference.method3810(i_14_, false, i_15_));
		aClass310_10777 = new Class310(graphicstoolkit, objectdefinition, i_14_, i_15_, plane, i_6_, this, bool, i_16_);
		aBoolean10780 = (objectdefinition.anInt3057 ^ 0xffffffff) != -1 && !bool;
	}
	
	public final void method74(GraphicsToolkit graphicstoolkit, int i) {
		anInt10770++;
		if (i > -46) {
			method69(-83);
		}
		aClass310_10777.method3587(graphicstoolkit, 262144);
	}
	
	public final void method69(int i) {
		anInt10788++;
	}
	
	final int method817(int i) {
		if (i != 2) {
			aClass171_10774 = null;
		}
		anInt10785++;
		return aClass310_10777.method3590((byte) -112);
	}
	
	static {
		aClass192_10778 = new IncommingPacket(12, -2);
	}
}
