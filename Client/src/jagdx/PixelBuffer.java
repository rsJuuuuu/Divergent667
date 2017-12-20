/* PixelBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;
import jaclib.memory.Buffer;
import jaclib.peer.os;
import jaclib.peer.ti;

public class PixelBuffer extends os implements Buffer
{
	public final void b(int[] is, int i, int i_0_, int i_1_) {
		if ((is.length ^ 0xffffffff) > (i - -i_1_ ^ 0xffffffff) | (-1 < (i ^ 0xffffffff) | is == null) | i_0_ < 0 || getSize() < i_1_ * 4 + i_0_) {
			throw new sja();
		}
		puti(is, i, i_0_, i_1_);
	}
	
	public PixelBuffer(ti var_ti) {
		super(var_ti);
		init();
	}
	
	private final native void getub(byte[] bs, int i, int i_2_, int i_3_);
	
	public final native int getSlicePitch();
	
	private final native void geti(int[] is, int i, int i_4_, int i_5_);
	
	public final void a(int[] is, int i, int i_6_, int i_7_) {
		if ((i ^ 0xffffffff) > -1 | is == null | is.length < i_7_ + i | i_6_ < 0 || getSize() < 4 * i_7_ + i_6_) {
			throw new sja();
		}
		geti(is, i, i_6_, i_7_);
	}
	
	private final native void putub(byte[] bs, int i, int i_8_, int i_9_);
	
	public final long getAddress() {
		return 0L;
	}
	
	private final native void puti(int[] is, int i, int i_10_, int i_11_);
	
	public final void a(byte[] bs, int i, int i_12_, int i_13_) {
		if ((i_12_ ^ 0xffffffff) > -1 | (i_13_ + i > bs.length | (null == bs | (i ^ 0xffffffff) > -1)) || (i_13_ + i_12_ ^ 0xffffffff) < (getSize() ^ 0xffffffff)) {
			throw new sja();
		}
		putub(bs, i, i_12_, i_13_);
	}
	
	public final native int getRowPitch();
	
	private final native void init();
	
	public final native int getSize();
}
