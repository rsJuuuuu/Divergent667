/* Class306 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.reflect.Method;

public class Class306
{
	static final GraphicsToolkit method3566(Index class302, int i, int i_0_, d var_d, java.awt.Canvas canvas) {
		GraphicsToolkit graphicstoolkit;
		try {
			if (!Class352.method4012(71)) {
				throw new RuntimeException("");
			}
			if (!Node_Sub38_Sub2.method2793(1, "jagdx")) {
				throw new RuntimeException("");
			}
			Class<?> var_class = Class.forName("D3DToolkit");
			@SuppressWarnings("unused")
			int i_1_ = -80 % ((-68 - i_0_) / 51);
			Method method = var_class.getDeclaredMethod("createToolkit", Class.forName("java.awt.Canvas"), Class.forName("d"), Class.forName("Index"), Class.forName("java.lang.Integer"));
			graphicstoolkit = (GraphicsToolkit) method.invoke(null, canvas, var_d, class302, new Integer(i));
		} catch (Throwable throwable) {
			throw new RuntimeException("");
		}
		return graphicstoolkit;
	}
}
