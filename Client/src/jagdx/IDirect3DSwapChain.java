/* IDirect3DSwapChain - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;
import jaclib.peer.IUnknown;
import jaclib.peer.ti;

public class IDirect3DSwapChain extends IUnknown
{
	private ti b;
	
	public final native int Present(int i);
	
	IDirect3DSwapChain(ti var_ti) {
		super(var_ti);
		b = var_ti;
	}
	
	private final native int _GetBackBuffer(int i, int i_0_, IDirect3DSurface idirect3dsurface);
	
	public final IDirect3DSurface a(int i, int i_1_) {
		IDirect3DSurface idirect3dsurface = new IDirect3DSurface(b);
		int i_2_ = _GetBackBuffer(i, i_1_, idirect3dsurface);
		if (lh.a(i_2_, true)) {
			throw new sja(String.valueOf(i_2_));
		}
		return idirect3dsurface;
	}
}
