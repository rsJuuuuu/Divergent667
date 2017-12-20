/* Class208 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Point;
import java.awt.Robot;
import java.awt.image.BufferedImage;

public class Class208
{
	private Robot aRobot2481;
	private Component aComponent2482;
	
	final void method2045(Component component, boolean bool) {
		if (bool) {
			component = null;
		} else if (component == null) {
			throw new NullPointerException();
		}
		if (aComponent2482 != component) {
			if (aComponent2482 != null) {
				aComponent2482.setCursor(null);
				aComponent2482 = null;
			}
			if (null != component) {
				component.setCursor(component.getToolkit().createCustomCursor(new BufferedImage(1, 1, 2), new Point(0, 0), null));
				aComponent2482 = component;
			}
		}
	}
	
	final void method2046(int i, int i_0_) {
		aRobot2481.mouseMove(i, i_0_);
	}
	
	final void method2047(Component component, int[] is, int i, int i_1_, Point point) {
		if (is != null) {
			BufferedImage bufferedimage = new BufferedImage(i, i_1_, 2);
			bufferedimage.setRGB(0, 0, i, i_1_, is, 0, i);
			component.setCursor(component.getToolkit().createCustomCursor(bufferedimage, point, null));
		} else {
			component.setCursor(null);
		}
	}
	
	Class208() throws Exception {
		aRobot2481 = new Robot();
	}
}
