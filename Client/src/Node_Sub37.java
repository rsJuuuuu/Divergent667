/* Node_Sub37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub37 extends Node
{
	protected int anInt7430;
	static int anInt7431 = 0;
	protected IComponentDefinitions aWidget7432;
	protected boolean aBoolean7433;
	protected Object[] parameters;
	protected int anInt7435;
	static int anInt7436;
	protected IComponentDefinitions aWidget7437;
	static IncommingPacket aClass192_7438 = new IncommingPacket(17, 0);
	protected int anInt7439;
	protected String aString7440;
	protected int anInt7441;
	protected int anInt7442;
	static Class257 aClass257_7443 = new Class257(1, 8);
	protected int anInt7444;
	static int anInt7445 = 0;
	static float aFloat7446;
	
	static final void method2772(byte b) {
		if (b != 54) {
			method2772((byte) 64);
		}
		if (Class122.anIntArray1556 == null || Class17.anIntArray277 == null) {
			Class17.anIntArray277 = new int[256];
			Class122.anIntArray1556 = new int[256];
			for (int i = 0; (i ^ 0xffffffff) > -257; i++) {
				double d = (double) i / 255.0 * 6.283185307179586;
				Class122.anIntArray1556[i] = (int) (4096.0 * Math.sin(d));
				Class17.anIntArray277[i] = (int) (Math.cos(d) * 4096.0);
			}
		}
		anInt7436++;
	}
	
	public static void method2773(boolean bool) {
		aClass192_7438 = null;
		if (bool != false) {
			aFloat7446 = -0.3831248F;
		}
		aClass257_7443 = null;
	}
}
