/* Stream - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory;

public class Stream
{
	private Buffer a;
	private int b;
	private int e;
	private int d;
	private byte[] c;
	
	public final void a(float f) {
		if (3 + b >= c.length) {
			c();
		}
		int i = floatToRawIntBits(f);
		c[b++] = (byte) (i >> 24);
		c[b++] = (byte) (i >> 16);
		c[b++] = (byte) (i >> 8);
		c[b++] = (byte) i;
	}
	
	public final int a() {
		return b + d;
	}
	
	public final void f(int i) {
		c();
		d = i;
	}
	
	public final void b(int i) {
		if ((c.length ^ 0xffffffff) >= (b + 1 ^ 0xffffffff)) {
			c();
		}
		c[b++] = (byte) (i >> 8);
		c[b++] = (byte) i;
	}
	
	public final void c(int i) {
		if (c.length <= b - -1) {
			c();
		}
		c[b++] = (byte) i;
		c[b++] = (byte) (i >> 8);
	}
	
	private static final native byte getLSB(int i);
	
	public final void a(Buffer buffer) {
		a(buffer, 0, buffer.getSize());
	}
	
	public Stream(Buffer buffer) {
		this(buffer, 0, buffer.getSize());
	}
	
	public static final native int floatToRawIntBits(float f);
	
	public final void a(int i, int i_0_, int i_1_, int i_2_) {
		if ((3 + b ^ 0xffffffff) <= (c.length ^ 0xffffffff)) {
			c();
		}
		c[b++] = (byte) i_1_;
		c[b++] = (byte) i_0_;
		c[b++] = (byte) i;
		c[b++] = (byte) i_2_;
	}
	
	public final void a(int i) {
		if ((c.length ^ 0xffffffff) >= (b + 3 ^ 0xffffffff)) {
			c();
		}
		c[b++] = (byte) i;
		c[b++] = (byte) (i >> 8);
		c[b++] = (byte) (i >> 16);
		c[b++] = (byte) (i >> 24);
	}
	
	private final void a(Buffer buffer, int i, int i_3_) {
		c();
		a = buffer;
		e = i_3_ + i;
		d = i;
		if (e > buffer.getSize()) {
			throw new RuntimeException();
		}
	}
	
	public final void e(int i) {
		if ((3 + b ^ 0xffffffff) <= (c.length ^ 0xffffffff)) {
			c();
		}
		c[b++] = (byte) (i >> 16);
		c[b++] = (byte) (i >> 8);
		c[b++] = (byte) i;
		c[b++] = (byte) (i >> 24);
	}
	
	public final void d(int i) {
		if ((b ^ 0xffffffff) <= (c.length ^ 0xffffffff)) {
			c();
		}
		c[b++] = (byte) i;
	}
	
	public final void b(int i, int i_4_, int i_5_, int i_6_) {
		if ((c.length ^ 0xffffffff) >= (b - -3 ^ 0xffffffff)) {
			c();
		}
		c[b++] = (byte) i;
		c[b++] = (byte) i_4_;
		c[b++] = (byte) i_5_;
		c[b++] = (byte) i_6_;
	}
	
	public static final boolean b() {
        return (getLSB(-65536) ^ 0xffffffff) == 0;
    }
	
	public Stream(Buffer buffer, int i, int i_7_) {
		this((buffer.getSize() ^ 0xffffffff) <= -4097 ? 4096 : buffer.getSize());
		a(buffer, i, i_7_);
	}
	
	public Stream() {
		this(4096);
	}
	
	private Stream(int i) {
		c = new byte[i];
	}
	
	public final void b(float f) {
		if ((3 + b ^ 0xffffffff) <= (c.length ^ 0xffffffff)) {
			c();
		}
		int i = floatToRawIntBits(f);
		c[b++] = (byte) i;
		c[b++] = (byte) (i >> 8);
		c[b++] = (byte) (i >> 16);
		c[b++] = (byte) (i >> 24);
	}
	
	public final void c() {
		if (b > 0) {
			if ((d + b ^ 0xffffffff) < (e ^ 0xffffffff)) {
				throw new RuntimeException();
			}
			a.a(c, 0, d, b);
			d += b;
			b = 0;
		}
	}
}
