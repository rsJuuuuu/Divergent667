/* Class164 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class164 {
    private static boolean aBoolean2022 = false;
    private static final Class312 aClass312_2023;
    private static int anInt2024 = 0;

    static synchronized void method1739(Interface3 interface3) {
        if (!aBoolean2022) {
            if (anInt2024 <= 0) {
                interface3.w(false);
            } else {
                Node_Sub48 node_sub48 = new Node_Sub48();
                node_sub48.anInterface3_7588 = interface3;
                aClass312_2023.method3625(node_sub48);
            }
        }
    }

    static synchronized void method1740() {
        for (; ; ) {
            Node_Sub48 node_sub48 = (Node_Sub48) aClass312_2023.method3619(-82);
            if (node_sub48 == null) {
                break;
            }
            node_sub48.anInterface3_7588.w(true);
            node_sub48.method2160((byte) 108);
        }
    }

    static synchronized void method1741() {
        anInt2024++;
    }

    static synchronized void method1742() {
        aBoolean2022 = true;
    }

    static synchronized void method1743() {
        anInt2024--;
        if (anInt2024 == 0) {
            method1740();
        }
    }

    static {
        aClass312_2023 = new Class312();
    }
}
