/* Class306 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Canvas;
import java.lang.reflect.Method;

public class Class306 {
    static GraphicsToolkit method3566(Index class302, int i, d var_d, Canvas canvas) {
        GraphicsToolkit graphicstoolkit;
        try {
            if (Class352.method4012()) {
                throw new RuntimeException("");
            }
            if (!Node_Sub38_Sub2.method2793("jagdx")) {
                throw new RuntimeException("");
            }
            Class<?> var_class = Class.forName("D3DToolkit");

            Method method = var_class.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("d"), Class.forName("Index"), Class.forName("java.lang.Integer"));
            graphicstoolkit = (GraphicsToolkit) method.invoke(null, canvas, var_d, class302, i);
        } catch (Throwable throwable) {
            throw new RuntimeException("");
        }
        return graphicstoolkit;
    }
}
