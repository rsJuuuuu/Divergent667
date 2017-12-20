/* IDirect3DSurface - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;
import jaclib.peer.IUnknown;
import jaclib.peer.ti;

public class IDirect3DSurface extends IUnknown
{
	IDirect3DSurface(ti var_ti) {
		super(var_ti);
	}
	
	public final native int LockRect(int i, int i_0_, int i_1_, int i_2_, int i_3_, PixelBuffer pixelbuffer);
	
	public final native boolean UnlockRect();
}
