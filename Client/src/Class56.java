/* Class56 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class56
{
	static int anInt835;
	static int anInt836;
	static int anInt837;
	static int anInt838;
	static HashTable aHashTable839 = new HashTable(4);
	static int anInt840;
	static Class377_Sub1[] aClass377_Sub1Array841;
	
	public final String toString() {
		anInt836++;
		throw new IllegalStateException();
	}
	
	static final void method563(int i, GraphicsToolkit graphicstoolkit) {
		anInt838++;
		if (i != -27770) {
			method564(83);
		}
		if ((Class346.anInt4278 ^ 0xffffffff) != (Class295.myPlayer.plane ^ 0xffffffff) && Class175.aClass261ArrayArrayArray2099 != null) {
			if (EntityNode_Sub6.method969(graphicstoolkit, Class295.myPlayer.plane, 6400)) {
				Class346.anInt4278 = Class295.myPlayer.plane;
			}
		}
	}
	
	public static void method564(int i) {
		aHashTable839 = null;
		if (i == 4) {
			aClass377_Sub1Array841 = null;
		}
	}
	
	static final void method565(boolean bool, int i, int i_0_) {
		anInt835++;
		Class262_Sub4.anInt7730 = i + -Class20.anInt354;
		if (bool == false) {
			Class150_Sub3.anInt8963 = -Class20.anInt343 + i_0_;
		}
	}
	
	final boolean method566(int i) {
		if (i < 47) {
			method563(-98, null);
		}
		anInt840++;
		return Class274.aClass56_4971 == this | Class366.aClass56_4527 == this;
	}
}
