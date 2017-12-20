/* IDirect3DVertexBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;
import jaclib.memory.Source;
import jaclib.peer.IUnknown;
import jaclib.peer.ti;

public class IDirect3DVertexBuffer extends IUnknown
{
	protected int b;
	
	public final boolean a(Source source, int i, int i_0_, int i_1_, int i_2_) {
		if (null == source || 0 > i || (i_1_ ^ 0xffffffff) < (i - -source.getSize() ^ 0xffffffff)) {
			throw new sja("");
		}
		if (0 > i_0_ || b + i_0_ < i_1_) {
			throw new sja("");
		}
		return _Update((long) i + source.getAddress(), i_0_, i_1_, i_2_);
	}
	
	IDirect3DVertexBuffer(ti var_ti) {
		super(var_ti);
	}
	
	private final native boolean _Update(long l, int i, int i_3_, int i_4_);
	
	protected final long a() {
		b = 0;
		return super.a();
	}
	
	public final native int Lock(int i, int i_5_, int i_6_, GeometryBuffer geometrybuffer);
	
	public final native int Unlock();
}
