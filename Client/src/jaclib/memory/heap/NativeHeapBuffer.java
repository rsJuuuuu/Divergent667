/* NativeHeapBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;

import java.util.Objects;

public class NativeHeapBuffer implements Buffer, Source {
    private final int c;
    private final NativeHeap a;
    public int b;
    private boolean d = true;

    public final int getSize() {
        return b;
    }

    public final synchronized void a(byte[] bs, int i, int i_0_, int i_1_) {
        if (i_0_ < 0 | (bs == null | !a() | i < 0 | Objects.requireNonNull(bs).length < i + i_1_) | i_0_ + i_1_ > b) {
            throw new RuntimeException();
        }
        a.put(c, bs, i, i_0_, i_1_);
    }

    public final long getAddress() {
        return a.getBufferAddress(c);
    }

    private synchronized boolean a() {
        return !(!a.a() || !d);
    }

    private synchronized void b() {
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
