/* Class322 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DSurface;
import jagdx.IDirect3DSwapChain;

public class Class322
{
	private IDirect3DSwapChain anIDirect3DSwapChain4071;
	private IDirect3DSurface anIDirect3DSurface4072;
	private IDirect3DSurface anIDirect3DSurface4073;
	
	final void method3803(int i) {
		if (null != anIDirect3DSurface4073) {
			anIDirect3DSurface4073.a(-92);
			anIDirect3DSurface4073 = null;
		}
		if (null != anIDirect3DSurface4072) {
			anIDirect3DSurface4072.a(-116);
			anIDirect3DSurface4072 = null;
		}
		if (i <= -74) {
			if (anIDirect3DSwapChain4071 != null) {
				anIDirect3DSwapChain4071.a(58);
				anIDirect3DSwapChain4071 = null;
			}
		}
	}
	
	final int method3804(int i, byte b) {
		int i_0_ = -125 % ((b - 58) / 37);
		return anIDirect3DSwapChain4071.Present(i);
	}
	
	final void method3805(IDirect3DSurface idirect3dsurface, IDirect3DSwapChain idirect3dswapchain, byte b) {
		anIDirect3DSwapChain4071 = idirect3dswapchain;
		anIDirect3DSurface4072 = idirect3dsurface;
		int i = 76 / ((44 - b) / 46);
		anIDirect3DSurface4073 = anIDirect3DSwapChain4071.a(0, 0);
	}
	
	Class322(IDirect3DSwapChain idirect3dswapchain, IDirect3DSurface idirect3dsurface) {
		method3805(idirect3dsurface, idirect3dswapchain, (byte) 117);
	}
	
	final boolean method3806(int i) {
		if (i != 0) {
			method3804(16, (byte) 19);
		}
        return anIDirect3DSwapChain4071 != null;
    }
}
