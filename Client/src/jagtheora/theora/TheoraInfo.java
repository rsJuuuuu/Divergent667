/* TheoraInfo - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.theora;
import jagtheora.misc.SimplePeer;

public class TheoraInfo extends SimplePeer
{
	public int frameWidth;
	public int picX;
	public int pixelFormat;
	public int picHeight;
	public int frameHeight;
	public int fpsDenominator;
	public int picY;
	public byte versionSubMinor;
	public int fpsNumerator;
	public int aspectDenominator;
	public int colourSpace;
	public byte versionMinor;
	public byte versionMajor;
	public int picWidth;
	public int aspectNumerator;
	
	private static final native void initFields();
	
	private final native void init();
	
	protected final native void clear();
	
	public TheoraInfo() {
		init();
		if (this.b()) {
			throw new IllegalStateException();
		}
	}
	
	static {
		initFields();
	}
}
