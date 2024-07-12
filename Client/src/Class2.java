/* Class2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.applet.Applet;

import netscape.javascript.JSObject;

public class Class2 {
    static Object method166(Applet applet, String string, Object[] objects) throws Throwable {
        return JSObject.getWindow(applet).call(string, objects);
    }

    static Object method167(String string, Applet applet, byte b) throws Throwable {
        if (b > -62) {
            return null;
        }
        return JSObject.getWindow(applet).call(string, null);
    }

    static void method168(String string, Applet applet) throws Throwable {
        JSObject.getWindow(applet).eval(string);
        /* empty */
    }
}
