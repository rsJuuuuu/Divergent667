/* IDirect3DDevice - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;
import jaclib.peer.IUnknown;
import jaclib.peer.ti;

public class IDirect3DDevice extends IUnknown
{
	private static float[] c = new float[4];
	private ti b;
	
	public final native int SetLight(int i, D3DLIGHT d3dlight);
	
	public final native int SetPixelShaderConstantF(int i, float[] fs, int i_0_);
	
	private final native int _GetDepthStencilSurface(IDirect3DSurface idirect3dsurface);
	
	public final IDirect3DPixelShader a(byte[] bs) {
		if (null == bs) {
			return null;
		}
		IDirect3DPixelShader idirect3dpixelshader = new IDirect3DPixelShader(b);
		int i = _CreatePixelShader(bs, idirect3dpixelshader);
		if (lh.a(i, true)) {
			throw new sja(String.valueOf(i));
		}
		return idirect3dpixelshader;
	}
	
	public final native int SetTextureStageState(int i, int i_1_, int i_2_);
	
	private final native int _CreateEventQuery(IDirect3DEventQuery idirect3deventquery);
	
	private final native int _CreateDepthStencilSurface(int i, int i_3_, int i_4_, int i_5_, int i_6_, boolean bool, IDirect3DSurface idirect3dsurface);
	
	public final IDirect3DVertexBuffer a(int i, int i_7_, int i_8_, int i_9_, IDirect3DVertexBuffer idirect3dvertexbuffer) {
		if (null != idirect3dvertexbuffer) {
			idirect3dvertexbuffer.a(-117);
		} else {
			idirect3dvertexbuffer = new IDirect3DVertexBuffer(b);
		}
		int i_10_ = _CreateVertexBuffer(i, i_7_, i_8_, i_9_, idirect3dvertexbuffer);
		if (lh.a(i_10_, true)) {
			throw new sja(String.valueOf(i_10_));
		}
		idirect3dvertexbuffer.b = i;
		return idirect3dvertexbuffer;
	}
	
	private final native int _GetSwapChain(int i, IDirect3DSwapChain idirect3dswapchain);
	
	public final int a(int i, float f) {
		return SetRenderStatef(i, f);
	}
	
	public final IDirect3DSurface c() {
		IDirect3DSurface idirect3dsurface = new IDirect3DSurface(b);
		int i = _GetDepthStencilSurface(idirect3dsurface);
		if (lh.a(i, true)) {
			throw new sja(String.valueOf(i));
		}
		return idirect3dsurface;
	}
	
	public final native int SetRenderState(int i, int i_11_);
	
	public final IDirect3DTexture a(int i, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_) {
		IDirect3DTexture idirect3dtexture = new IDirect3DTexture(b);
		int i_17_ = _CreateTexture(i, i_12_, i_13_, i_14_, i_15_, i_16_, idirect3dtexture);
		if (lh.a(i_17_, true)) {
			throw new sja(String.valueOf(i_17_));
		}
		return idirect3dtexture;
	}
	
	public final native boolean LightEnable(int i, boolean bool);
	
	public final native int SetTransform(int i, float[] fs);
	
	private final native int _GetBackBuffer(int i, int i_18_, int i_19_, IDirect3DSurface idirect3dsurface);
	
	public final IDirect3DCubeTexture a(int i, int i_20_, int i_21_, int i_22_, int i_23_) {
		IDirect3DCubeTexture idirect3dcubetexture = new IDirect3DCubeTexture(b);
		int i_24_ = _CreateCubeTexture(i, i_20_, i_21_, i_22_, i_23_, idirect3dcubetexture);
		if (lh.a(i_24_, true)) {
			throw new sja(String.valueOf(i_24_));
		}
		return idirect3dcubetexture;
	}
	
	private final native int _CreateIndexBuffer(int i, int i_25_, int i_26_, int i_27_, IDirect3DIndexBuffer idirect3dindexbuffer);
	
	private final native int SetRenderStatef(int i, float f);
	
	public final native int DrawIndexedPrimitive(int i, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_);
	
	public final native int _CreateTexture(int i, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_, IDirect3DTexture idirect3dtexture);
	
	public final IDirect3DVolumeTexture a(int i, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_) {
		IDirect3DVolumeTexture idirect3dvolumetexture = new IDirect3DVolumeTexture(b);
		int i_44_ = _CreateVolumeTexture(i, i_38_, i_39_, i_40_, i_41_, i_42_, i_43_, idirect3dvolumetexture);
		if (lh.a(i_44_, true)) {
			throw new sja(String.valueOf(i_44_));
		}
		return idirect3dvolumetexture;
	}
	
	public final native int SetSamplerState(int i, int i_45_, int i_46_);
	
	IDirect3DDevice(ti var_ti) {
		super(var_ti);
		b = var_ti;
	}
	
	public final int a(int i, float f, float f_47_, float f_48_, float f_49_) {
		c[1] = f_47_;
		c[2] = f_48_;
		c[0] = f;
		c[3] = f_49_;
		return SetVertexShaderConstantF(i, c, 1);
	}
	
	private final native int SetRenderStateb(int i, boolean bool);
	
	public final native int _CreatePixelShader(byte[] bs, IDirect3DPixelShader idirect3dpixelshader);
	
	public final native int SetVertexShaderConstantF(int i, float[] fs, int i_50_);
	
	public final native int Reset(D3DPRESENT_PARAMETERS d3dpresent_parameters);
	
	public final native int SetStreamSource(int i, IDirect3DVertexBuffer idirect3dvertexbuffer, int i_51_, int i_52_);
	
	public final IDirect3DEventQuery b() {
		IDirect3DEventQuery idirect3deventquery = new IDirect3DEventQuery(b);
		if (lh.a((byte) 68, _CreateEventQuery(idirect3deventquery))) {
			if (!idirect3deventquery.a((byte) -127)) {
				return null;
			}
			return idirect3deventquery;
		}
		return null;
	}
	
	public final native int BeginScene();
	
	public final native int SetVertexShader(IDirect3DVertexShader idirect3dvertexshader);
	
	public final native int TestCooperativeLevel();
	
	public final int b(int i, float f, float f_53_, float f_54_, float f_55_) {
		c[0] = f;
		c[2] = f_54_;
		c[1] = f_53_;
		c[3] = f_55_;
		return SetPixelShaderConstantF(i, c, 1);
	}
	
	public final IDirect3DSurface c(int i) {
		IDirect3DSurface idirect3dsurface = new IDirect3DSurface(b);
		int i_56_ = _GetRenderTarget(i, idirect3dsurface);
		if (lh.a(i_56_, true)) {
			throw new sja(String.valueOf(i_56_));
		}
		return idirect3dsurface;
	}
	
	public final IDirect3DVertexShader b(byte[] bs) {
		if (bs == null) {
			return null;
		}
		IDirect3DVertexShader idirect3dvertexshader = new IDirect3DVertexShader(b);
		int i = _CreateVertexShader(bs, idirect3dvertexshader);
		if (lh.a(i, true)) {
			throw new sja(String.valueOf(i));
		}
		return idirect3dvertexshader;
	}
	
	private final native int _GetRenderTarget(int i, IDirect3DSurface idirect3dsurface);
	
	public final IDirect3DVertexDeclaration a(VertexElementCollection vertexelementcollection, IDirect3DVertexDeclaration idirect3dvertexdeclaration) {
		if (null != idirect3dvertexdeclaration) {
			idirect3dvertexdeclaration.a(-109);
		} else {
			idirect3dvertexdeclaration = new IDirect3DVertexDeclaration(b);
		}
		int i = _CreateVertexDeclaration(vertexelementcollection, idirect3dvertexdeclaration);
		if (lh.a(i, true)) {
			throw new sja(String.valueOf(i));
		}
		return idirect3dvertexdeclaration;
	}
	
	public final native int SetViewport(int i, int i_57_, int i_58_, int i_59_, float f, float f_60_);
	
	public final IDirect3DSwapChain b(int i) {
		IDirect3DSwapChain idirect3dswapchain = new IDirect3DSwapChain(b);
		int i_61_ = _GetSwapChain(i, idirect3dswapchain);
		if (lh.a(i_61_, true)) {
			throw new sja(String.valueOf(i_61_));
		}
		return idirect3dswapchain;
	}
	
	public final native int DrawPrimitive(int i, int i_62_, int i_63_);
	
	private final native int _CreateVertexBuffer(int i, int i_64_, int i_65_, int i_66_, IDirect3DVertexBuffer idirect3dvertexbuffer);
	
	public final IDirect3DIndexBuffer a(int i, int i_67_, int i_68_, int i_69_, IDirect3DIndexBuffer idirect3dindexbuffer) {
		if (null != idirect3dindexbuffer) {
			idirect3dindexbuffer.a(47);
		} else {
			idirect3dindexbuffer = new IDirect3DIndexBuffer(b);
		}
		int i_70_ = _CreateIndexBuffer(i, i_67_, i_68_, i_69_, idirect3dindexbuffer);
		if (lh.a(i_70_, true)) {
			throw new sja(String.valueOf(i_70_));
		}
		return idirect3dindexbuffer;
	}
	
	public final native int SetTexture(int i, IDirect3DBaseTexture idirect3dbasetexture);
	
	public final native int StretchRect(IDirect3DSurface idirect3dsurface, int i, int i_71_, int i_72_, int i_73_, IDirect3DSurface idirect3dsurface_74_, int i_75_, int i_76_, int i_77_, int i_78_, int i_79_);
	
	private final native int _CreateVertexDeclaration(VertexElementCollection vertexelementcollection, IDirect3DVertexDeclaration idirect3dvertexdeclaration);
	
	private final native int _CreateRenderTarget(int i, int i_80_, int i_81_, int i_82_, int i_83_, boolean bool, IDirect3DSurface idirect3dsurface);
	
	public final native int SetFVF(int i);
	
	public final native int SetScissorRect(int i, int i_84_, int i_85_, int i_86_);
	
	private final native int _CreateOffscreenPlainSurface(int i, int i_87_, int i_88_, int i_89_, IDirect3DSurface idirect3dsurface);
	
	public final int a(int i, float[] fs) {
		return SetVertexShaderConstantF(i, fs, fs.length / 4);
	}
	
	public final native int SetVertexDeclaration(IDirect3DVertexDeclaration idirect3dvertexdeclaration);
	
	public final int a(int i, boolean bool) {
		return SetRenderStateb(i, bool);
	}
	
	public final native int Clear(int i, int i_90_, float f, int i_91_);
	
	public final native int _CreateCubeTexture(int i, int i_92_, int i_93_, int i_94_, int i_95_, IDirect3DCubeTexture idirect3dcubetexture);
	
	public final native int SetIndices(IDirect3DIndexBuffer idirect3dindexbuffer);
	
	public final IDirect3DSurface a(int i, int i_96_, int i_97_, int i_98_, int i_99_, boolean bool) {
		IDirect3DSurface idirect3dsurface = new IDirect3DSurface(b);
		int i_100_ = _CreateRenderTarget(i, i_96_, i_97_, i_98_, i_99_, bool, idirect3dsurface);
		if (lh.a(i_100_, true)) {
			throw new sja(String.valueOf(i_100_));
		}
		return idirect3dsurface;
	}
	
	public final native int EndScene();
	
	public final native int _CreateVertexShader(byte[] bs, IDirect3DVertexShader idirect3dvertexshader);
	
	public final native int SetPixelShader(IDirect3DPixelShader idirect3dpixelshader);
	
	public final native int _CreateVolumeTexture(int i, int i_101_, int i_102_, int i_103_, int i_104_, int i_105_, int i_106_, IDirect3DVolumeTexture idirect3dvolumetexture);
}
