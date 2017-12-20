/* NativeHeapBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory.heap;
import jaclib.memory.Buffer;
import jaclib.memory.Source;

public class NativeHeapBuffer implements Buffer, Source
{
	private int c;
	private NativeHeap a;
	public int b;
	private boolean d = true;
	
	public final int getSize() {
		return b;
	}
	
	public final synchronized void a(byte[] bs, int i, int i_0_, int i_1_) {
		if ((i_0_ ^ 0xffffffff) > -1 | (bs == null | !a() | (i ^ 0xffffffff) > -1 | (i + i_1_ ^ 0xffffffff) < (bs.length ^ 0xffffffff)) | (b ^ 0xffffffff) > (i_0_ + i_1_ ^ 0xffffffff)) {
			throw new RuntimeException();
		}
		a.put(c, bs, i, i_0_, i_1_);
	}
	
	public final long getAddress() {
		return a.getBufferAddress(c);
	}
	
	private final synchronized boolean a() {
        return !(!a.a() || !d);
    }
	
	private final synchronized void b() {
		if (a()) {
			a.deallocateBuffer(c);
		}
		d = false;
	}
	
	protected final synchronized void finalize() throws Throwable {
		super.finalize();
		b();
	}
	
	NativeHeapBuffer(NativeHeap nativeheap, int i, int i_2_) {
		b = i_2_;
		a = nativeheap;
		c = i;
	}
}
