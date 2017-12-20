/* Frame - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.theora;
import jagtheora.misc.SimplePeer;

public class Frame extends SimplePeer
{
	public int a;
	public int b;
	public int[] pixels;
	
	public Frame(int i, int i_0_) {
		b = i;
		a = i_0_;
		pixels = new int[a * b];
	}
	
	private static final native void init();
	
	protected final native void clear();
	
	static {
		init();
	}
}
