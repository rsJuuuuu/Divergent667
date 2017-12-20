/* DecoderContext - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.theora;
import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;

public class DecoderContext extends SimplePeer
{
	public final native double granuleTime(GranulePos granulepos);
	
	public final native int decodePacketIn(OggPacket oggpacket, GranulePos granulepos);
	
	public final native int getMaxPostProcessingLevel();
	
	public final native long granuleFrame(GranulePos granulepos);
	
	public final native int setPostProcessingLevel(int i);
	
	public final native int setGranulePosition(long l);
	
	public final native int decodeFrame(Frame frame);
	
	public DecoderContext(TheoraInfo theorainfo, SetupInfo setupinfo) {
		init(theorainfo, setupinfo);
		if (this.b()) {
			throw new IllegalArgumentException("");
		}
	}
	
	private final native void init(TheoraInfo theorainfo, SetupInfo setupinfo);
	
	protected final native void clear();
}
