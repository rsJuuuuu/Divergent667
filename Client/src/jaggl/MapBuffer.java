/* MapBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaggl;
import jaclib.memory.NativeBuffer;

public class MapBuffer extends NativeBuffer
{
	private int c;
	
	public final boolean a(int i, int i_0_, int i_1_) {
		if (c != 0) {
			return false;
		}
		long l = OpenGL.glMapBufferARB(i, i_1_);
		if (l == 0L) {
			return false;
		}
		this.a(l, i_0_);
		c = i;
		return true;
	}
	
	public final boolean a() {
        return (c ^ 0xffffffff) != -1;
    }
	
	public final void a(byte[] bs, int i, int i_2_, int i_3_) {
		if (c == 0) {
			throw new RuntimeException();
		}
		super.a(bs, i, i_2_, i_3_);
	}
	
	public final boolean b() {
		boolean bool = true;
		if (c != 0) {
			bool = OpenGL.glUnmapBufferARB(c);
			this.a(0L, 0);
			c = 0;
		}
		return bool;
	}
}
