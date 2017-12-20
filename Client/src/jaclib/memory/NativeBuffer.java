/* NativeBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory;

public class NativeBuffer implements Buffer, Source
{
	private int a = -1;
	private long b;
	
	public void a(byte[] bs, int i, int i_0_, int i_1_) {
		if ((i_0_ ^ 0xffffffff) > -1 | (bs == null | b == 0L | (i ^ 0xffffffff) > -1 | (bs.length ^ 0xffffffff) > (i + i_1_ ^ 0xffffffff)) | i_0_ - -i_1_ > a) {
			throw new RuntimeException();
		}
		put(b, bs, i, i_0_, i_1_);
	}
	
	protected final void a(long l, int i) {
		b = l;
		a = i;
	}
	
	public final long getAddress() {
		return b;
	}
	
	private final native void put(long l, byte[] bs, int i, int i_2_, int i_3_);
	
	private final native void get(long l, byte[] bs, int i, int i_4_, int i_5_);
	
	public final int getSize() {
		return a;
	}
}
