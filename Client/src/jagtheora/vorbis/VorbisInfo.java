/* VorbisInfo - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.vorbis;
import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;

public class VorbisInfo extends SimplePeer
{
	public int rate;
	public int channels;
	
	private static final native void initFields();
	
	protected final native void clear();
	
	public final native int headerIn(VorbisComment vorbiscomment, OggPacket oggpacket);
	
	private final native void init();
	
	public VorbisInfo() {
		init();
		if (this.b()) {
			throw new IllegalStateException();
		}
	}
	
	static {
		initFields();
	}
}
