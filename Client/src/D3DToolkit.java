/* D3DToolkit - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.peer.ti;
import jagdx.D3DADAPTER_IDENTIFIER;
import jagdx.D3DCAPS;
import jagdx.D3DDISPLAYMODE;
import jagdx.D3DLIGHT;
import jagdx.D3DPRESENT_PARAMETERS;
import jagdx.GeometryBuffer;
import jagdx.IDirect3D;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DEventQuery;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DSurface;
import jagdx.IDirect3DVertexShader;
import jagdx.PixelBuffer;
import jagdx.lh;
import jagdx.sja;

import java.awt.Dimension;
import java.awt.Rectangle;

public class D3DToolkit extends AbstractToolkit
{
	private D3DPRESENT_PARAMETERS aD3DPRESENT_PARAMETERS9178;
	private int[] anIntArray9179;
	private boolean[] aBooleanArray9180;
	private Class228[] aClass228Array9181;
	private int anInt9182;
	private D3DLIGHT aD3DLIGHT9183;
	protected GeometryBuffer aGeometryBuffer9184;
	private boolean aBoolean9185 = false;
	protected boolean aBoolean9186;
	protected PixelBuffer aPixelBuffer9187;
	protected D3DCAPS aD3DCAPS9188;
	private boolean[] aBooleanArray9189;
	private boolean[] aBooleanArray9190;
	private boolean[] aBooleanArray9191;
	private static int[] anIntArray9192 = { 77, 80 };
	private D3DLIGHT aD3DLIGHT9193;
	private int anInt9194;
	private static float[] aFloatArray9195 = new float[16];
	protected boolean aBoolean9196;
	private IDirect3DVertexShader anIDirect3DVertexShader9197;
	private static int[] anIntArray9198 = { 22, 23 };
	protected IDirect3DDevice anIDirect3DDevice9199;
	protected boolean aBoolean9200;
	protected ti aTi9201;
	private D3DLIGHT aD3DLIGHT9202;
	private Class322 aClass322_9203;
	private IDirect3D anIDirect3D9204;
	private int anInt9205 = 0;

	final Interface13_Impl1 method1291(Class68 class68, Class372 class372, int i, int i_0_, int i_1_) {
		return new Class265_Sub3(this, class68, class372, i_0_, i);
	}

	final Interface13_Impl3 method1262(Class68 class68, byte[] bs, byte b, int i, int i_3_, int i_4_) {
		if (b != -57) {
			return null;
		}
		return new Class265_Sub1(this, class68, i_4_, i, i_3_, bs);
	}

	final void method1309(int i) {
		if (i >= -101) {
			method1353(false);
		}
	}

	final synchronized void e(int i) {
		aTi9201.c(-104);
		super.e(i);
	}

	final void a(int i, int i_5_, int i_6_, int i_7_) {
		/* empty */
	}

	final void method1384(byte b, IDirect3DVertexShader idirect3dvertexshader) {
		anIDirect3DVertexShader9197 = idirect3dvertexshader;
		anIDirect3DDevice9199.SetVertexShader(idirect3dvertexshader);
		method1310((byte) -113);
	}

	final void method1265(java.awt.Canvas canvas, Object object, int i) {
		if (canvas == aCanvas6251) {
			Dimension dimension = canvas.getSize();
			if (-1 > (dimension.width ^ 0xffffffff) && dimension.height > 0) {
				anIDirect3DDevice9199.EndScene();
				method1389((byte) -12);
				anIDirect3DDevice9199.BeginScene();
			}
		}
	}

	private static final int method1385(Class94 class94, boolean bool) {
		if (class94 != Class117_Sub1.aClass94_4924) {
			if (class94 == Class116.aClass94_5075) {
				return 4;
			}
			if (Class385.aClass94_4911 != class94) {
				if (class94 != Class236.aClass94_2898) {
					if (GameStub.aClass94_11 == class94) {
						return 10;
					}
				} else {
					return 7;
				}
			} else {
				return 26;
			}
		} else {
			return 2;
		}
		if (bool) {
			anIntArray9198 = null;
		}
		throw new IllegalArgumentException();
	}

	final void method1354(int i, int i_9_, Interface15_Impl2 interface15_impl2) {
		if (i_9_ == 32011) {
			Class80 class80 = (Class80) interface15_impl2;
			anIDirect3DDevice9199.SetStreamSource(i, class80.anIDirect3DVertexBuffer9080, 0, class80.method793(i_9_ ^ ~0x5344));
		}
	}

	final void method1386(int i, IDirect3DPixelShader idirect3dpixelshader) {
		anIDirect3DDevice9199.SetPixelShader(idirect3dpixelshader);
	}

	final void v() {
		/* empty */
	}

	final Interface13_Impl2 method1287(int i, int[][] is, boolean bool, int i_11_) {
		if (i_11_ != 0) {
			aTi9201 = null;
		}
		return new Class265_Sub2(this, i, bool, is);
	}

	final boolean method1377(Class372 class372, Class68 class68, byte b) {
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
		if (b != -72) {
			aBooleanArray9189 = null;
		}
        return lh.a((byte) 75, anIDirect3D9204.a(anInt9194, d3ddisplaymode)) && lh.a((byte) 89, anIDirect3D9204.CheckDeviceFormat(anInt9194, anInt9182, d3ddisplaymode.Format, 0, 4, method1396(class372, class68, -54)));
    }

	private D3DToolkit(int i, int i_12_, java.awt.Canvas canvas, ti var_ti, IDirect3D idirect3d, IDirect3DDevice idirect3ddevice, Class322 class322, D3DPRESENT_PARAMETERS d3dpresent_parameters, D3DCAPS d3dcaps, d var_d, Index class302, int i_13_) {
		super(canvas, class322, var_d, class302, i_13_, 0);
		try {
			aD3DCAPS9188 = d3dcaps;
			anInt9182 = i_12_;
			anIDirect3D9204 = idirect3d;
			aD3DPRESENT_PARAMETERS9178 = d3dpresent_parameters;
			aClass322_9203 = class322;
			aTi9201 = var_ti;
			anIDirect3DDevice9199 = idirect3ddevice;
			anInt9194 = i;
			aD3DLIGHT9183 = new D3DLIGHT(aTi9201);
			aD3DLIGHT9202 = new D3DLIGHT(aTi9201);
			aD3DLIGHT9193 = new D3DLIGHT(aTi9201);
			aPixelBuffer9187 = new PixelBuffer(aTi9201);
			aGeometryBuffer9184 = new GeometryBuffer(aTi9201);
			new GeometryBuffer(aTi9201);
			anInt6370 = aD3DCAPS9188.MaxSimultaneousTextures;
			aBoolean9186 = -1 != (0x10000 & aD3DCAPS9188.TextureCaps ^ 0xffffffff);
			aBoolean9200 = 0 != (0x4000 & aD3DCAPS9188.TextureCaps);
			anInt6367 = aD3DCAPS9188.MaxActiveLights > 0 ? aD3DCAPS9188.MaxActiveLights : 8;
			aBoolean6310 = (aD3DCAPS9188.TextureCaps & 0x800 ^ 0xffffffff) != -1;
			aBoolean6366 = -1 != (aD3DCAPS9188.TextureCaps & 0x2000 ^ 0xffffffff);
			aBoolean9196 = (0x2 & aD3DCAPS9188.TextureCaps) == 0;
			aBoolean6342 = 0 < anInt6319 || -1 == (anIDirect3D9204.CheckDeviceMultiSampleType(anInt9194, anInt9182, aD3DPRESENT_PARAMETERS9178.BackBufferFormat, true, 2) ^ 0xffffffff);
			anIntArray9179 = new int[anInt6370];
			aBooleanArray9180 = new boolean[anInt6370];
			aBooleanArray9190 = new boolean[anInt6370];
			aBooleanArray9189 = new boolean[anInt6370];
			aClass228Array9181 = new Class228[anInt6370];
			aBooleanArray9191 = new boolean[anInt6370];
			anIDirect3DDevice9199.BeginScene();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			method1233(-7751);
			throw new RuntimeException("");
		}
	}

	final void a(Interface6 interface6) {
		/* empty */
	}

	final void d() {
		/* empty */
	}

	final boolean method1295(Class68 class68, Class372 class372, int i) {
		if (i != 1) {
			return true;
		}
		D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
        return lh.a((byte) 98, anIDirect3D9204.a(anInt9194, d3ddisplaymode)) && lh.a((byte) 58, anIDirect3D9204.CheckDeviceFormat(anInt9194, anInt9182, d3ddisplaymode.Format, 0, 3, method1396(class372, class68, -29)));
    }

	final Renderer c() {
		D3DADAPTER_IDENTIFIER d3dadapter_identifier = anIDirect3D9204.b(anInt9194, 0);
		return new Renderer(d3dadapter_identifier.VendorID, "Direct3D", 9, d3dadapter_identifier.Description, d3dadapter_identifier.DriverVersion);
	}

	final void method1363(int i, byte b, Class135 class135, boolean bool) {
		int i_14_ = 0;
		int i_15_ = i;
		int i_16_;
		while_22_:
			do {
				do {
					if (i_15_ != 1) {
						if ((i_15_ ^ 0xffffffff) != -3) {
							break;
						}
					} else {
						i_16_ = 6;
						break while_22_;
					}
					i_16_ = 27;
					break while_22_;
				} while (false);
				i_16_ = 5;
			} while (false);
		if (b < 79) {
			aTi9201 = null;
		}
		if (bool) {
			i_14_ |= 0x10;
		}
		anIDirect3DDevice9199.SetTextureStageState(anInt6284, i_16_, i_14_ | method1390(class135, (byte) -86));
	}

	final void method1308(byte b) {
		anIDirect3DDevice9199.a(28, aBoolean6338 && aBoolean6299 && -1 >= (anInt6355 ^ 0xffffffff));
		if (b < 74) {
			method1365(true, (byte) -67);
		}
	}

	final void j() {
		IDirect3DEventQuery idirect3deventquery = anIDirect3DDevice9199.b();
		if (lh.a((byte) 95, idirect3deventquery.Issue())) {
			for (;;) {
				int i = idirect3deventquery.IsSignaled();
				if (i != 1) {
					break;
				}
				Thread.yield();
			}
		}
		idirect3deventquery.a(-65);
	}

	final void method1302(int i) {
		anIDirect3DDevice9199.a(137, aBoolean6340 && !aBoolean6283);
		if (i != 1) {
			aFloatArray9195 = null;
		}
	}

	private static final boolean method1387(D3DPRESENT_PARAMETERS d3dpresent_parameters, int i, IDirect3D idirect3d, int k, int l, int i1) {
		int j1;
		int k1;
		int l1;
		j1 = 0;
		k1 = 0;
		try {
			if(i1 != 20644) {
				return false;
			}
			l1 = 0;
			D3DDISPLAYMODE d3ddisplaymode = new D3DDISPLAYMODE();
			if(lh.a(idirect3d.a(i, d3ddisplaymode), true)) {
				return false;
			}
			label0:
				for(; ~l <= -1; l--) {
					if(1 == l) {
						continue;
					}
					l1 = 0 - -l;
					label1:
						for(int i2 = 0; ~i2 > ~anIntArray9198.length; i2++) {
							if(-1 != ~idirect3d.CheckDeviceType(i, k, d3ddisplaymode.Format, anIntArray9198[i2], true) || -1 != ~idirect3d.CheckDeviceFormat(i, k, d3ddisplaymode.Format, 1, 1, anIntArray9198[i2]) || -1 != ~l && -1 != ~idirect3d.CheckDeviceMultiSampleType(i, k, anIntArray9198[i2], true, l1)) {
								continue;
							}
							int j2 = 0;
							do {
								if(~anIntArray9192.length >= ~j2) {
									continue label1;
								}
								if(idirect3d.CheckDeviceFormat(i, k, d3ddisplaymode.Format, 2, 1, anIntArray9192[j2]) == 0 && idirect3d.CheckDepthStencilMatch(i, k, d3ddisplaymode.Format, anIntArray9198[i2], anIntArray9192[j2]) == 0 && (0 == l || ~idirect3d.CheckDeviceMultiSampleType(i, k, anIntArray9192[i2], true, l1) == -1)) {
									k1 = anIntArray9198[i2];
									j1 = anIntArray9192[j2];
									break label0;
								}
								j2++;
							} while(true);
						}

				}

			if(l < 0 || ~k1 == -1 || -1 == ~j1) {
				return false;
			}
			d3dpresent_parameters.MultiSampleType = l1;
			d3dpresent_parameters.BackBufferFormat = k1;
			d3dpresent_parameters.AutoDepthStencilFormat = j1;
			d3dpresent_parameters.MultiSampleQuality = 0;
			return true;
		} catch (Throwable t) { 
			t.printStackTrace();
			return false;
		}
	}

	final Interface4 a(int i, int i_29_) {
		return null;
	}

	final Interface13_Impl1 method1322(Class68 class68, boolean bool, int i, int i_30_, byte b, float[] fs, int i_31_, int i_32_) {
		if (b != 5) {
			j();
		}
		return null;
	}

	final void b(int i, int i_33_, int i_34_, int i_35_, double d) {
		/* empty */
	}

	private static final int method1388(int i, Class228 class228) {
		if (class228 != Node_Sub38_Sub5.aClass228_10123) {
			if (class228 == Class194.aClass228_2377) {
				return 1;
			}
		} else {
			return 2;
		}
		if (i <= 95) {
			aFloatArray9195 = null;
		}
		throw new IllegalArgumentException();
	}

	final Class290 method1311(int i, int i_36_) {
		if (i != -22838) {
			aBoolean9196 = false;
		}
		int i_37_ = i_36_;
		while_25_:
			do {
				do {
					if (-4 != (i_37_ ^ 0xffffffff)) {
						if ((i_37_ ^ 0xffffffff) != -5) {
							if ((i_37_ ^ 0xffffffff) == -9) {
								break;
							}
							break while_25_;
						}
					} else {
						return new Class290_Sub8(this, aClass302_6167);
					}
					return new Class290_Sub9(this, aClass302_6167, aClass5_6247);
				} while (false);
				return new Class290_Sub10(this, aClass302_6167, aClass5_6247);
			} while (false);
		return super.method1311(-22838, i_36_);
	}

	private final boolean method1389(byte b) {
		int i = anIDirect3DDevice9199.TestCooperativeLevel();
		if (b != -12) {
			aD3DCAPS9188 = null;
		}
		if ((i ^ 0xffffffff) == -1 || i == -2005530519) {
			Class322 class322 = (Class322) anObject6119;
			method1285(0);
			class322.method3803(-111);
			aD3DPRESENT_PARAMETERS9178.BackBufferWidth = 0;
			aD3DPRESENT_PARAMETERS9178.BackBufferHeight = 0;
			if (method1387(aD3DPRESENT_PARAMETERS9178, anInt9194, anIDirect3D9204, anInt9182, anInt6319, 20644)) {
				int i_38_ = anIDirect3DDevice9199.Reset(aD3DPRESENT_PARAMETERS9178);
				if (lh.a((byte) 95, i_38_)) {
					class322.method3805(anIDirect3DDevice9199.c(), anIDirect3DDevice9199.b(0), (byte) 106);
					method1325(b + 11);
					method1326(false);
					return true;
				}
			}
		}
		return false;
	}

	final void method1300(int i) {
		if (i != 0) {
			aBoolean9200 = false;
		}
		anIDirect3DDevice9199.SetScissorRect(anInt6280 + anInt6295, anInt6325 + anInt6307, anInt6294, anInt6333);
	}

	final void method1370(int i) {
		if (i >= -12) {
			aFloatArray9195 = null;
		}
		anIDirect3DDevice9199.a(14, aBoolean6275 && aBoolean6313);
	}

	static final GraphicsToolkit createToolkit(java.awt.Canvas canvas, d var_d, Index class302, Integer integer) {
		D3DToolkit d3dtoolkit = null;
		D3DToolkit d3dtoolkit_39_;
		try {
			int i = 0;
			int i_40_ = 1;
			ti var_ti = new ti();
			IDirect3D idirect3d = IDirect3D.a(-2147483616, var_ti);
			D3DCAPS d3dcaps = idirect3d.a(i, i_40_);
			if ((0x1000000 & d3dcaps.RasterCaps) == 0) {
				throw new RuntimeException("");
			}
			if ((d3dcaps.MaxSimultaneousTextures ^ 0xffffffff) > -3) {
				throw new RuntimeException("");
			}
			if (-1 == (d3dcaps.TextureOpCaps & 0x2 ^ 0xffffffff)) {
				throw new RuntimeException("");
			}
			if ((0x8 & d3dcaps.TextureOpCaps) == 0) {
				throw new RuntimeException("");
			}
			if (-1 == (d3dcaps.TextureOpCaps & 0x40 ^ 0xffffffff)) {
				throw new RuntimeException("");
			}
			if ((0x200 & d3dcaps.TextureOpCaps) == 0) {
				throw new RuntimeException("");
			}
			if ((0x2000000 & d3dcaps.TextureOpCaps) == 0) {
				throw new RuntimeException("");
			}
			if (0 == (0x10 & (d3dcaps.DestBlendCaps & d3dcaps.SrcBlendCaps))) {
				throw new RuntimeException("");
			}
			if (0 == (d3dcaps.SrcBlendCaps & d3dcaps.DestBlendCaps & 0x20)) {
				throw new RuntimeException("");
			}
			if ((0x2 & (d3dcaps.DestBlendCaps & d3dcaps.SrcBlendCaps)) == 0) {
				throw new RuntimeException("");
			}
			if (-1 > (d3dcaps.MaxActiveLights ^ 0xffffffff) && 2 > d3dcaps.MaxActiveLights) {
				throw new RuntimeException("");
			}
			if ((d3dcaps.MaxStreams ^ 0xffffffff) > -6) {
				throw new RuntimeException("");
			}
			D3DPRESENT_PARAMETERS d3dpresent_parameters = new D3DPRESENT_PARAMETERS(canvas);
			if (!method1387(d3dpresent_parameters, i, idirect3d, i_40_, integer.intValue(), 20644)) {
				throw new RuntimeException("");
			}
			d3dpresent_parameters.EnableAutoDepthStencil = true;
			d3dpresent_parameters.Windowed = true;
			d3dpresent_parameters.PresentationInterval = -2147483648;
			int i_41_ = 2;
			if ((0x100000 & d3dcaps.DevCaps ^ 0xffffffff) != -1) {
				i_41_ |= 0x10;
			}
			IDirect3DDevice idirect3ddevice;
			try {
				idirect3ddevice = idirect3d.a(i, i_40_, canvas, 0x40 | i_41_, d3dpresent_parameters);
			} catch (sja var_sja) {
				idirect3ddevice = idirect3d.a(i, i_40_, canvas, i_41_ | 0x20, d3dpresent_parameters);
			}
			Class322 class322 = new Class322(idirect3ddevice.b(0), idirect3ddevice.c());
			d3dtoolkit = new D3DToolkit(i, i_40_, canvas, var_ti, idirect3d, idirect3ddevice, class322, d3dpresent_parameters, d3dcaps, var_d, class302, integer.intValue());
			d3dtoolkit.method1358(106);
			d3dtoolkit_39_ = d3dtoolkit;
		} catch (RuntimeException runtimeexception) {
			if (d3dtoolkit != null) {
				d3dtoolkit.u();
			}
			throw runtimeexception;
		}
		return d3dtoolkit_39_;
	}

	final void method1259(int i) {
		if (i < 85) {
			anIDirect3D9204 = null;
		}
		if (Class47.aClass26_688 == aClass26_6301) {
			anIDirect3DDevice9199.SetRenderState(19, 5);
			anIDirect3DDevice9199.SetRenderState(20, 6);
		} else if (aClass26_6301 != Class339_Sub3.aClass26_8664) {
			if (aClass26_6301 == Node_Sub15_Sub7.aClass26_9827) {
				anIDirect3DDevice9199.SetRenderState(19, 9);
				anIDirect3DDevice9199.SetRenderState(20, 2);
			}
		} else {
			anIDirect3DDevice9199.SetRenderState(19, 2);
			anIDirect3DDevice9199.SetRenderState(20, 2);
		}
	}

	final void method1263(boolean bool) {
		if (bool) {
			anIntArray9192 = null;
		}
		int i = !aBooleanArray9191[anInt6284] ? 1 : method1385(aClass94Array6351[anInt6284], bool);
		anIDirect3DDevice9199.SetTextureStageState(anInt6284, 1, i);
	}

	final void u() {
		aTi9201.b(-23417);
		super.u();
	}

	final int I() {
		return 0;
	}

	private static final int method1390(Class135 class135, byte b) {
		if (b != -86) {
			return 50;
		}
		if (class135 == Class106.aClass135_1354) {
			return 2;
		}
		if (class135 == Class115.aClass135_1465) {
			return 0;
		}
		if (class135 == Class200_Sub1.aClass135_5139) {
			return 1;
		}
		if (class135 == InterfaceSettings.aClass135_7421) {
			return 3;
		}
		throw new IllegalArgumentException();
	}

	final Interface15_Impl1 method1346(boolean bool, byte b) {
		if (b != 102) {
			return null;
		}
		return new Class8(this, Class372.aClass372_4595, bool);
	}

	final void method1261(byte b) {
		anIDirect3DDevice9199.SetViewport(anInt6280, anInt6307, anInt6239, anInt6124, 0.0F, 1.0F);
		if (b != -18) {
			aBooleanArray9190 = null;
		}
	}

	private static final int method1391(int i, Class346 class346) {
		if (class346 == Animator.aClass346_252) {
			return 1;
		}
		if (BufferedConnection.aClass346_615 == class346) {
			return 2;
		}
		if (Class55.aClass346_829 != class346) {
			if (Class262_Sub16.aClass346_7824 == class346) {
				return 4;
			}
			if (class346 == Node_Sub15_Sub9.aClass346_9842) {
				return 256;
			}
		} else {
			return 3;
		}
		if (i != 0) {
			anIntArray9192 = null;
		}
		return 0;
	}

	final Interface20 d(int i, int i_42_) {
		return null;
	}

	final int[] na(int i, int i_43_, int i_44_, int i_45_) {
		int[] is = null;
		IDirect3DSurface idirect3dsurface = anIDirect3DDevice9199.c(0);
		IDirect3DSurface idirect3dsurface_46_ = anIDirect3DDevice9199.a(i_44_, i_45_, 21, 0, 0, true);
		if (lh.a((byte) 78, anIDirect3DDevice9199.StretchRect(idirect3dsurface, i, i_43_, i_44_, i_45_, idirect3dsurface_46_, 0, 0, i_44_, i_45_, 0)) && lh.a((byte) 65, idirect3dsurface_46_.LockRect(0, 0, i_44_, i_45_, 16, aPixelBuffer9187))) {
			is = new int[i_44_ * i_45_];
			int i_47_ = aPixelBuffer9187.getRowPitch();
			if (i_47_ == 4 * i_44_) {
				aPixelBuffer9187.a(is, 0, 0, i_45_ * i_44_);
			} else {
				for (int i_48_ = 0; (i_45_ ^ 0xffffffff) < (i_48_ ^ 0xffffffff); i_48_++)
					aPixelBuffer9187.a(is, i_44_ * i_48_, i_48_ * i_47_, i_44_);
			}
			idirect3dsurface_46_.UnlockRect();
		}
		idirect3dsurface.a(-90);
		idirect3dsurface_46_.a(104);
		return is;
	}

	final Object method1351(java.awt.Canvas canvas, int i) {
		if (i > -70) {
			j();
		}
		return null;
	}

	final void method1326(boolean bool) {
		for (int i = 0; (anInt6370 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
			anIDirect3DDevice9199.SetSamplerState(i, 7, 0);
			anIDirect3DDevice9199.SetSamplerState(i, 6, 2);
			anIDirect3DDevice9199.SetSamplerState(i, 5, 2);
			anIDirect3DDevice9199.SetSamplerState(i, 1, 1);
			anIDirect3DDevice9199.SetSamplerState(i, 2, 1);
			aClass228Array9181[i] = Node_Sub38_Sub5.aClass228_10123;
			aBooleanArray9190[i] = aBooleanArray9189[i] = true;
			aBooleanArray9180[i] = false;
			anIntArray9179[i] = 0;
		}
		anIDirect3DDevice9199.SetTextureStageState(0, 6, 1);
		anIDirect3DDevice9199.SetRenderState(9, 2);
		anIDirect3DDevice9199.SetRenderState(23, 4);
		anIDirect3DDevice9199.SetRenderState(25, 5);
		anIDirect3DDevice9199.SetRenderState(24, 0);
		anIDirect3DDevice9199.SetRenderState(22, 2);
		anIDirect3DDevice9199.SetRenderState(147, 1);
		anIDirect3DDevice9199.SetRenderState(145, 1);
		anIDirect3DDevice9199.a(38, 0.95F);
		anIDirect3DDevice9199.SetRenderState(140, 3);
		aD3DLIGHT9183.SetType(3);
		aD3DLIGHT9202.SetType(3);
		aD3DLIGHT9193.SetType(1);
		aBoolean9185 = bool;
		super.method1326(bool);
	}

	final void F(int i, int i_49_) {
		/* empty */
	}

	final Interface13_Impl1 method1367(int i, int i_50_, int[] is, int i_51_, int i_52_, boolean bool, int i_53_) {
		if (i != -6331) {
			return null;
		}
		return new Class265_Sub3(this, i_50_, i_53_, bool, is, i_51_, i_52_);
	}

	final void method1289(boolean bool) {
		float f = !aBoolean6306 ? 0.0F : aFloat6274;
		float f_54_ = aBoolean6306 ? -aFloat6272 : 0.0F;
		aD3DLIGHT9183.SetDiffuse(f * aFloat6323, aFloat6293 * f, aFloat6365 * f, 0.0F);
		aD3DLIGHT9202.SetDiffuse(aFloat6323 * f_54_, f_54_ * aFloat6293, aFloat6365 * f_54_, 0.0F);
		aBoolean9185 = bool;
	}

	final void method1374(byte b) {
		aFloat6328 = (float) (anInt6335 - anInt6372);
		aFloat6311 = (float) -anInt6355 + aFloat6328;
		if (aFloat6311 < (float) anInt6364) {
			aFloat6311 = (float) anInt6364;
		}
		anIDirect3DDevice9199.a(36, aFloat6311);
		anIDirect3DDevice9199.a(37, aFloat6328);
		anIDirect3DDevice9199.SetRenderState(34, anInt6276);
	}

	final void method1284(int i) {
		anIDirect3DDevice9199.a(15, aBoolean6279);
		if (i != 14) {
			method1389((byte) -115);
		}
	}

	final void method1269(byte b) {
		if (b <= 2) {
			aBooleanArray9189 = null;
		}
		anIDirect3DDevice9199.a(27, enableBlending);
	}

	final void h() {
		/* empty */
	}

	final void method1360(byte b) {
		if (aBoolean6261) {
			aFloatArray9195[9] = 0.0F;
			aFloatArray9195[2] = 0.0F;
			aFloatArray9195[7] = 0.0F;
			aFloatArray9195[15] = 1.0F;
			aFloatArray9195[11] = 0.0F;
			aFloatArray9195[1] = 0.0F;
			aFloatArray9195[6] = 0.0F;
			aFloatArray9195[14] = 0.0F;
			aFloatArray9195[3] = 0.0F;
			aFloatArray9195[12] = 0.0F;
			aFloatArray9195[8] = 0.0F;
			aFloatArray9195[13] = 0.0F;
			aFloatArray9195[0] = 1.0F;
			aFloatArray9195[5] = 1.0F;
			aFloatArray9195[10] = 1.0F;
			aFloatArray9195[4] = 0.0F;
		} else {
			aClass336_Sub1_6262.method3884(true, aFloatArray9195);
		}
		anIDirect3DDevice9199.SetTransform(256, aFloatArray9195);
		if (b < 36) {
			aBooleanArray9191 = null;
		}
	}

	final void a(float f, float f_55_, float f_56_) {
		/* empty */
	}

	final void method1365(boolean bool, byte b) {
		anIDirect3DDevice9199.a(161, bool);
		if (b > -112) {
			ya();
		}
	}

	final void method1310(byte b) {
		if (null == anIDirect3DVertexShader9197 && Class119.aClass346_1515 != aClass346Array6343[anInt6284]) {
			if (aClass346Array6343[anInt6284] != BufferedConnection.aClass346_615) {
				anIDirect3DDevice9199.SetTransform(16 + anInt6284, aClass336_Sub1Array6327[anInt6284].method3884(true, aFloatArray9195));
			} else {
				anIDirect3DDevice9199.SetTransform(16 + anInt6284, aClass336_Sub1Array6327[anInt6284].method3874(5, aFloatArray9195));
			}
			int i = method1391(0, aClass346Array6343[anInt6284]);
			if ((i ^ 0xffffffff) != (anIntArray9179[anInt6284] ^ 0xffffffff)) {
				anIDirect3DDevice9199.SetTextureStageState(anInt6284, 24, i);
				anIntArray9179[anInt6284] = i;
			}
		} else {
			anIDirect3DDevice9199.SetTextureStageState(anInt6284, 24, 0);
			anIntArray9179[anInt6284] = 0;
		}
		if (b != -113) {
			method1396(null, null, -128);
		}
	}

	final void ya() {
		method1307(-117, true);
		anIDirect3DDevice9199.Clear(2, 0, 1.0F, 0);
	}

	final Class213 method1372(byte b, Class207[] class207s) {
		if (b >= -118) {
			aD3DCAPS9188 = null;
		}
		return new dxVertexLayout(this, class207s);
	}

	final Interface13_Impl1 method1327(Class68 class68, int i, boolean bool, int i_57_, int i_58_, int i_59_, boolean bool_60_, byte[] bs) {
		if (bool_60_ != true) {
			method1363(-92, (byte) -104, null, false);
		}
		return new Class265_Sub3(this, class68, i, i_59_, bool, bs, i_57_, i_58_);
	}

	final Interface6 a(Interface4 interface4, Interface20 interface20) {
		return null;
	}

	final void b(boolean bool) {
		/* empty */
	}

	final float method1379(int i) {
		if (i < 62) {
			aD3DLIGHT9193 = null;
		}
		return -0.5F;
	}

	final void e(int i, int i_61_) throws Exception_Sub1 {
		anIDirect3DDevice9199.EndScene();
		if (!aClass322_9203.method3806(0)) {
			if (++anInt9205 > 50) {
				throw new Exception_Sub1();
			}
			method1389((byte) -12);
		} else {
			anInt9205 = 0;
			if (lh.a(aClass322_9203.method3804(0, (byte) 21), true)) {
				method1389((byte) -12);
			}
		}
		anIDirect3DDevice9199.BeginScene();
	}

	final void method1392(int i, Class265_Sub3 class265_sub3) {
		method1395(class265_sub3, i ^ 0x7f);
		if (!class265_sub3.aBoolean7907 != !aBooleanArray9190[anInt6284]) {
			anIDirect3DDevice9199.SetSamplerState(anInt6284, 1, class265_sub3.aBoolean7907 ? 1 : 3);
			aBooleanArray9190[anInt6284] = class265_sub3.aBoolean7907;
		}
		if (i != 2) {
			aPixelBuffer9187 = null;
		}
		if (class265_sub3.aBoolean7904 == !aBooleanArray9189[anInt6284]) {
			anIDirect3DDevice9199.SetSamplerState(anInt6284, 2, !class265_sub3.aBoolean7904 ? 3 : 1);
			aBooleanArray9189[anInt6284] = class265_sub3.aBoolean7904;
		}
	}

	final boolean m() {
		return false;
	}

	final void method1337(int i) {
		if (i == 6) {
			anIDirect3DDevice9199.SetRenderState(60, anInt6318);
		}
	}

	final void method1319(Object object, java.awt.Canvas canvas, int i) {
		if (i != -30190) {
			method1346(false, (byte) 25);
		}
		aClass322_9203 = (Class322) object;
	}

	final void method1353(boolean bool) {
		aD3DLIGHT9183.SetAmbient(aFloat6300 * aFloat6323, aFloat6300 * aFloat6293, aFloat6365 * aFloat6300, 0.0F);
		aBoolean9185 = bool;
	}

	final void method1340(byte b) {
		anIDirect3DDevice9199.a(7, aBoolean6277);
	}

	final void method1251(byte b) {
		if (b <= 59) {
			aClass228Array9181 = null;
		}
		if (aBooleanArray9191[anInt6284]) {
			aBooleanArray9191[anInt6284] = false;
			anIDirect3DDevice9199.SetTexture(anInt6284, null);
			method1254(true);
			method1263(false);
		}
	}

	final void method1303(Class104 class104, int i, int i_62_, int i_63_) {
		if (i < 2) {
			method1338(null, -36);
		}
		anIDirect3DDevice9199.DrawPrimitive(method1393(107, class104), i_62_, i_63_);
	}

	final void method1273(int i) {
		int i_64_;
		for (i_64_ = 0; anInt6358 > i_64_; i_64_++) {
			Node_Sub29 node_sub29 = aNode_Sub29Array6345[i_64_];
			int i_65_ = 2 + i_64_;
			int i_66_ = node_sub29.method2710((byte) 113);
			float f = node_sub29.method2707(1) / 255.0F;
			aD3DLIGHT9193.SetPosition((float) node_sub29.method2705(32311), (float) node_sub29.method2704(30), (float) node_sub29.method2708(27433));
			aD3DLIGHT9193.SetDiffuse((float) (0xff & i_66_ >> 16) * f, f * (float) (0xff & i_66_ >> 8), f * (float) (0xff & i_66_), 0.0F);
			aD3DLIGHT9193.SetAttenuation(0.0F, 0.0F, 1.0F / (float) (node_sub29.method2711(123) * node_sub29.method2711(125)));
			aD3DLIGHT9193.SetRange((float) node_sub29.method2711(119));
			anIDirect3DDevice9199.SetLight(i_65_, aD3DLIGHT9193);
			anIDirect3DDevice9199.LightEnable(i_65_, true);
		}
		if (i > -20) {
			m();
		}
		for (/**/; (anInt6356 ^ 0xffffffff) < (i_64_ ^ 0xffffffff); i_64_++)
			anIDirect3DDevice9199.LightEnable(2 + i_64_, false);
		super.method1273(-69);
	}

	final void f() {
		/* empty */
	}

	final void method1282(int i) {
		if (i != 0) {
			method1308((byte) 8);
		}
		anIDirect3DDevice9199.a(174, aBoolean6387);
	}

	final void GA(int i) {
		anIDirect3DDevice9199.Clear(1, i, 0.0F, 0);
	}

	final Interface15_Impl2 method1380(int i, boolean bool) {
		if (i != 2) {
			anIDirect3D9204 = null;
		}
		return new Class80(this, bool);
	}

	final void method1321(byte b, Class139 class139) {
		int i = 0;
		if (Class191.aClass139_2349 != class139) {
			if (class139 == IsaacCipher.aClass139_1829) {
				i = 131072;
			} else if (class139 == Class168.aClass139_2042) {
				i = 196608;
			}
		} else {
			i = 65536;
		}
		if (b == 102) {
			anIDirect3DDevice9199.SetTextureStageState(anInt6284, 11, anInt6284 | i);
		}
	}

	final void method1293(int i) {
		if (i <= 114) {
			j();
		}
		if (aClass56_6303.method566(108)) {
			aClass336_Sub1_6269.method3884(true, aFloatArray9195);
		} else {
			aFloatArray9195[3] = 0.0F;
			aFloatArray9195[8] = 0.0F;
			aFloatArray9195[15] = 1.0F;
			aFloatArray9195[12] = 0.0F;
			aFloatArray9195[11] = 0.0F;
			aFloatArray9195[13] = 0.0F;
			aFloatArray9195[14] = 0.0F;
			aFloatArray9195[1] = 0.0F;
			aFloatArray9195[4] = 0.0F;
			aFloatArray9195[5] = 1.0F;
			aFloatArray9195[0] = 1.0F;
			aFloatArray9195[6] = 0.0F;
			aFloatArray9195[7] = 0.0F;
			aFloatArray9195[9] = 0.0F;
			aFloatArray9195[10] = 1.0F;
			aFloatArray9195[2] = 0.0F;
		}
		anIDirect3DDevice9199.SetTransform(2, aFloatArray9195);
	}

	private static final int method1393(int i, Class104 class104) {
		if (StandardSprite.aClass104_8926 == class104) {
			return 2;
		}
		if (Class263.aClass104_3337 != class104) {
			if (class104 == Mobile_Sub1.aClass104_10947) {
				return 1;
			}
			if (Class55.aClass104_833 == class104) {
				return 4;
			}
			if (class104 == Class169_Sub3.aClass104_8818) {
				return 6;
			}
			if (Node_Sub15_Sub2.aClass104_9779 == class104) {
				return 5;
			}
		} else {
			return 3;
		}
		throw new IllegalArgumentException("");
	}

	final void method1333(boolean bool) {
		if (!aBoolean9185) {
			anIDirect3DDevice9199.LightEnable(0, false);
			anIDirect3DDevice9199.LightEnable(1, false);
			anIDirect3DDevice9199.SetLight(0, aD3DLIGHT9183);
			anIDirect3DDevice9199.SetLight(1, aD3DLIGHT9202);
			anIDirect3DDevice9199.LightEnable(0, true);
			anIDirect3DDevice9199.LightEnable(1, true);
			aBoolean9185 = true;
		}
		if (bool) {
			aClass322_9203 = null;
		}
	}

	final void a(Rectangle[] rectangles, int i, int i_68_, int i_69_) throws Exception_Sub1 {
		e(i_68_, i_69_);
	}

	final void method1382(int i) {
		aD3DLIGHT9183.SetDirection(-aFloatArray6292[0], -aFloatArray6292[1], -aFloatArray6292[2]);
		aD3DLIGHT9202.SetDirection(-aFloatArray6304[0], -aFloatArray6304[1], -aFloatArray6304[2]);
		aBoolean9185 = false;
	}

	final void method1394(Class265_Sub1 class265_sub1, int i) {
		method1395(class265_sub1, 125);
		if (!aBooleanArray9190[anInt6284]) {
			anIDirect3DDevice9199.SetSamplerState(anInt6284, 1, 1);
			aBooleanArray9190[anInt6284] = true;
		}
		if (!aBooleanArray9189[anInt6284]) {
			anIDirect3DDevice9199.SetSamplerState(anInt6284, 2, 1);
			aBooleanArray9189[anInt6284] = true;
		}
		if (i != 1) {
			anIDirect3DVertexShader9197 = null;
		}
	}

	final void method1279(int i, byte b) {
		if (b != -15) {
			method1380(78, true);
		}
		anIDirect3DDevice9199.SetTextureStageState(anInt6284, 11, i);
	}

	final void method1334(int i) {
		anIDirect3DDevice9199.SetTransform(3, aFloatArray6314);
	}

	final void method1276(int i, byte b, int i_72_, Interface15_Impl1 interface15_impl1, int i_73_, Class104 class104, int i_74_) {
		anIDirect3DDevice9199.SetIndices(((Class8) interface15_impl1).anIDirect3DIndexBuffer9089);
		anIDirect3DDevice9199.DrawIndexedPrimitive(method1393(-89, class104), 0, i, i_73_, i_72_, i_74_);
		if (b > -66) {
			anIDirect3DDevice9199 = null;
		}
	}

	final boolean w() {
		return false;
	}

	final void method1338(Class213 class213, int i) {
		dxVertexLayout var_dxVertexLayout = (dxVertexLayout) class213;
		anIDirect3DDevice9199.SetVertexDeclaration(var_dxVertexLayout.anIDirect3DVertexDeclaration6910);
		if (i != 9422) {
			anInt9194 = 55;
		}
	}

	final void method1395(Class265 class265, int i) {
		anIDirect3DDevice9199.SetTexture(anInt6284, class265.method3232(-121));
		if (class265.aClass228_3363 == aClass228Array9181[anInt6284]) {
			if (!class265.aBoolean3364 == aBooleanArray9180[anInt6284]) {
				anIDirect3DDevice9199.SetSamplerState(anInt6284, 7, !class265.aBoolean3364 ? 0 : method1388(97, class265.aClass228_3363));
				aBooleanArray9180[anInt6284] = class265.aBoolean3364;
			}
		} else {
			int i_75_ = method1388(105, class265.aClass228_3363);
			anIDirect3DDevice9199.SetSamplerState(anInt6284, 6, i_75_);
			anIDirect3DDevice9199.SetSamplerState(anInt6284, 5, i_75_);
			aClass228Array9181[anInt6284] = class265.aClass228_3363;
			if (!class265.aBoolean3364 == aBooleanArray9180[anInt6284]) {
				anIDirect3DDevice9199.SetSamplerState(anInt6284, 7, !class265.aBoolean3364 ? 0 : method1388(102, class265.aClass228_3363));
				aBooleanArray9180[anInt6284] = class265.aBoolean3364;
			}
		}
		if (i < 124) {
			method1351(null, -39);
		}
		if (!aBooleanArray9191[anInt6284]) {
			aBooleanArray9191[anInt6284] = true;
			method1254(true);
			method1263(false);
		}
	}

	final void method1275(int i, java.awt.Canvas canvas, Object object) {
		if (i > -61) {
			method1377(null, null, (byte) 101);
		}
	}

	final Class270 a(Class270 class270, Class270 class270_76_, float f, Class270 class270_77_) {
		if (f < 0.5F) {
			return class270;
		}
		return class270_76_;
	}

	final void method1349(Class135 class135, byte b, boolean bool, boolean bool_78_, int i) {
		if (b != 19) {
			method1351(null, 6);
		}
		int i_79_ = i;
		int i_80_;
		while_26_:
			do {
				do {
					if (i_79_ != 1) {
						if ((i_79_ ^ 0xffffffff) != -3) {
							break;
						}
					} else {
						i_80_ = 3;
						break while_26_;
					}
					i_80_ = 26;
					break while_26_;
				} while (false);
				i_80_ = 2;
			} while (false);
		int i_81_ = 0;
		if (bool) {
			i_81_ |= 0x20;
		}
		if (bool_78_) {
			i_81_ |= 0x10;
		}
		anIDirect3DDevice9199.SetTextureStageState(anInt6284, i_80_, method1390(class135, (byte) -86) | i_81_);
	}

	final void method1313(byte b) {
		if (b == 108) {
			method1289(false);
			method1333(false);
		}
	}

	final void method1254(boolean bool) {
		int i = !aBooleanArray9191[anInt6284] ? 1 : method1385(aClass94Array6296[anInt6284], false);
		anIDirect3DDevice9199.SetTextureStageState(anInt6284, 4, i);
		if (bool != true) {
			method1311(-59, -38);
		}
	}

	static final int method1396(Class372 class372, Class68 class68, int i) {
		if (i > -23) {
			return 83;
		}
		if (Class372.aClass372_4594 == class372) {
			if (CacheNode_Sub19.aClass68_9621 != class68) {
				if (class68 != Class99.aClass68_1290) {
					if (class68 != Node_Sub52.aClass68_7639) {
						if (class68 != Class188_Sub2.aClass68_6875) {
							if (class68 != Class259.aClass68_3268) {
								if (Class262_Sub15_Sub1.aClass68_10521 == class68) {
									return 77;
								}
							} else {
								return 51;
							}
						} else {
							return 50;
						}
					} else {
						return 28;
					}
				} else {
					return 21;
				}
			} else {
				return 22;
			}
		}
		throw new IllegalArgumentException("");
	}
}
