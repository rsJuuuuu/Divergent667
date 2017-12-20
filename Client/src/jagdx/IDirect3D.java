/* IDirect3D - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;
import jaclib.peer.IUnknown;
import jaclib.peer.ti;

import java.awt.Canvas;

public class IDirect3D extends IUnknown
{
	private ti b;
	
	public final native int CheckDeviceFormat(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_);
	
	private static final native int _Direct3DCreate(int i, IDirect3D idirect3d);
	
	private IDirect3D(ti var_ti) {
		super(var_ti);
		b = var_ti;
	}
	
	public final IDirect3DDevice a(int i, int i_5_, Canvas canvas, int i_6_, D3DPRESENT_PARAMETERS d3dpresent_parameters) {
		IDirect3DDevice idirect3ddevice = new IDirect3DDevice(b);
		int i_7_ = _CreateDevice(i, i_5_, canvas, i_6_, d3dpresent_parameters, idirect3ddevice);
		if (lh.a(i_7_, true)) {
			throw new sja(String.valueOf(i_7_));
		}
		return idirect3ddevice;
	}
	
	public final int a(int i, D3DDISPLAYMODE d3ddisplaymode) {
		return _GetAdapterDisplayMode(i, d3ddisplaymode);
	}
	
	private final native int _GetAdapterDisplayMode(int i, D3DDISPLAYMODE d3ddisplaymode);
	
	private final native int _GetAdapterIdentifier(int i, int i_8_, D3DADAPTER_IDENTIFIER d3dadapter_identifier);
	
	public static final IDirect3D a(int i, ti var_ti) {
		IDirect3D idirect3d = new IDirect3D(var_ti);
		int i_9_ = _Direct3DCreate(i, idirect3d);
		if (lh.a(i_9_, true)) {
			throw new sja(String.valueOf(i_9_));
		}
		return idirect3d;
	}
	
	public final native int CheckDepthStencilMatch(int i, int i_10_, int i_11_, int i_12_, int i_13_);
	
	private final native int _GetDeviceCaps(int i, int i_14_, D3DCAPS d3dcaps);
	
	public final D3DADAPTER_IDENTIFIER b(int i, int i_15_) {
		D3DADAPTER_IDENTIFIER d3dadapter_identifier = new D3DADAPTER_IDENTIFIER();
		int i_16_ = _GetAdapterIdentifier(i, i_15_, d3dadapter_identifier);
		if (lh.a(i_16_, true)) {
			throw new sja(String.valueOf(i_16_));
		}
		return d3dadapter_identifier;
	}
	
	public final native int CheckDeviceMultiSampleType(int i, int i_17_, int i_18_, boolean bool, int i_19_);
	
	private final native int _CreateDevice(int i, int i_20_, Canvas canvas, int i_21_, D3DPRESENT_PARAMETERS d3dpresent_parameters, IDirect3DDevice idirect3ddevice);
	
	public final D3DCAPS a(int i, int i_22_) {
		D3DCAPS d3dcaps = new D3DCAPS();
		int i_23_ = _GetDeviceCaps(i, i_22_, d3dcaps);
		if (lh.a(i_23_, true)) {
			throw new sja(String.valueOf(i_23_));
		}
		return d3dcaps;
	}
	
	public final native int CheckDeviceType(int i, int i_24_, int i_25_, int i_26_, boolean bool);
}
