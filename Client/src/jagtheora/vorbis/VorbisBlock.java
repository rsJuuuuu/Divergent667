/* VorbisBlock - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.vorbis;
import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;

public class VorbisBlock extends SimplePeer
{
	public VorbisBlock(DSPState dspstate) {
		init(dspstate);
		if (this.b()) {
			throw new IllegalStateException();
		}
	}
	
	public final native int synthesis(OggPacket oggpacket);
	
	private final native void init(DSPState dspstate);
	
	protected final native void clear();
}
