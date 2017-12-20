/* OggStreamState - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.ogg;
import jagtheora.misc.SimplePeer;

public class OggStreamState extends SimplePeer
{
	private final native boolean init(int i);
	
	public final native int packetOut();
	
	public final native boolean isEOS();
	
	public final native int packetPeek(OggPacket oggpacket);
	
	protected final native void clear();
	
	public final native boolean reset();
	
	public final native int packetOut(OggPacket oggpacket);
	
	public OggStreamState(int i) {
		if (!init(i)) {
			throw new IllegalStateException();
		}
	}
	
	public final native int packetPeek();
	
	public final native boolean resetSerialNo(int i);
	
	public final native boolean pageIn(OggPage oggpage);
}
