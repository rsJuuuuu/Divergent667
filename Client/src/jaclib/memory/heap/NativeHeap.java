/* NativeHeap - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory.heap;

public class NativeHeap
{
	private int a;
	protected long peer;
	private boolean b;
	
	private final native void allocateHeap(int i);
	
	protected final synchronized void finalize() throws Throwable {
		super.finalize();
		b();
	}
	
	final synchronized native void deallocateBuffer(int i);
	
	final synchronized native int allocateBuffer(int i, boolean bool);
	
	private final native void deallocateHeap();
	
	public final NativeHeapBuffer a(int i, boolean bool) {
		if (!b) {
			throw new IllegalStateException();
		}
		return new NativeHeapBuffer(this, allocateBuffer(i, bool), i);
	}
	
	final synchronized native void put(int i, byte[] bs, int i_0_, int i_1_, int i_2_);
	
	final synchronized native void get(int i, byte[] bs, int i_3_, int i_4_, int i_5_);
	
	final synchronized boolean a() {
		return b;
	}
	
	final synchronized native long getBufferAddress(int i);
	
	public NativeHeap(int i) {
		a = i;
		allocateHeap(a);
		b = true;
	}
	
	public final synchronized void b() {
		if (b) {
			deallocateHeap();
		}
		b = false;
	}
}
