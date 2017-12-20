/* GeometryBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;
import jaclib.memory.Buffer;
import jaclib.peer.os;
import jaclib.peer.ti;

public class GeometryBuffer extends os implements Buffer
{
	private final native void putub(byte[] bs, int i, int i_0_, int i_1_);
	
	private final native void getub(byte[] bs, int i, int i_2_, int i_3_);
	
	public final void a(byte[] bs, int i, int i_4_, int i_5_) {
		if (bs.length < i + i_5_ | (i < 0 | null == bs) | -1 < (i_4_ ^ 0xffffffff) || (i_5_ + i_4_ ^ 0xffffffff) < (getSize() ^ 0xffffffff)) {
			throw new sja();
		}
		putub(bs, i, i_4_, i_5_);
	}
	
	public GeometryBuffer(ti var_ti) {
		super(var_ti);
		init();
	}
	
	public final native long getAddress();
	
	private final native void init();
	
	public final native int getSize();
}
