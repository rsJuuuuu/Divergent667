/* Class2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;

import netscape.javascript.JSObject;

public class Class2
{
	static final Object method166(byte b, Applet applet, String string, Object[] objects) throws Throwable {
		if (b != -37) {
			return null;
		}
		return JSObject.getWindow(applet).call(string, objects);
	}
	
	static final Object method167(String string, Applet applet, byte b) throws Throwable {
		if (b > -62) {
			return null;
		}
		return JSObject.getWindow(applet).call(string, null);
	}
	
	static final void method168(String string, Applet applet, int i) throws Throwable {
		JSObject.getWindow(applet).eval(string);
		if (i == 30639) {
			/* empty */
		}
	}
}
