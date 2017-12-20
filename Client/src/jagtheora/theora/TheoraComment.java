/* TheoraComment - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.theora;
import jagtheora.misc.SimplePeer;

public class TheoraComment extends SimplePeer
{
	public TheoraComment() {
		init();
		if (this.b()) {
			throw new IllegalStateException();
		}
	}
	
	private final native void init();
	
	protected final native void clear();
}
