/* IDirect3DTexture - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;
import jaclib.peer.ti;

public class IDirect3DTexture extends IDirect3DBaseTexture
{
	IDirect3DTexture(ti var_ti) {
		super(var_ti);
	}
	
	public final native boolean UnlockRect(int i);
	
	public final native int LockRect(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, PixelBuffer pixelbuffer);
}
