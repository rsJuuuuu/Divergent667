/* Class164 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class164
{
	private static boolean aBoolean2022 = false;
	private static Class312 aClass312_2023;
	private static int anInt2024 = 0;
	
	static final synchronized void method1739(int i, Interface3 interface3) {
		if (!aBoolean2022) {
			if (anInt2024 <= i) {
				interface3.w(false);
			} else {
				Node_Sub48 node_sub48 = new Node_Sub48();
				node_sub48.anInterface3_7588 = interface3;
				aClass312_2023.method3625((byte) -54, node_sub48);
			}
		}
	}
	
	static final synchronized void method1740(int i) {
		for (;;) {
			Node_Sub48 node_sub48 = (Node_Sub48) aClass312_2023.method3619(-82);
			if (node_sub48 == null) {
				break;
			}
			node_sub48.anInterface3_7588.w(true);
			node_sub48.method2160((byte) 108);
		}
		if (i != -9630) {
			method1739(36, null);
		}
	}
	
	static final synchronized void method1741(int i) {
		if (i == -1) {
			anInt2024++;
		}
	}
	
	static final synchronized void method1742(boolean bool, int i) {
		aBoolean2022 = bool;
		if (i != 0) {
			anInt2024 = -114;
		}
	}
	
	static final synchronized void method1743(int i) {
		anInt2024--;
		if (i == (anInt2024 ^ 0xffffffff)) {
			method1740(-9630);
		}
	}
	
	static {
		aClass312_2023 = new Class312();
	}
}
