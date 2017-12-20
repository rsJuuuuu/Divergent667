/* Class290_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;

public class Class290_Sub9 extends Class290
{
	private D3DToolkit aD3DToolkit8149;
	private static float[] aFloatArray8150 = new float[16];
	private IDirect3DVertexShader anIDirect3DVertexShader8151;
	private Class5 aClass5_8152;
	
	final void method3416(byte b) {
		if (b != -56) {
			method3412(83);
		}
		if (anIDirect3DVertexShader8151 != null) {
			IDirect3DDevice idirect3ddevice = aD3DToolkit8149.anIDirect3DDevice9199;
			if (-1 > (anAbstractToolkit3654.anInt6355 ^ 0xffffffff)) {
				float f = anAbstractToolkit3654.aFloat6328;
				float f_0_ = anAbstractToolkit3654.aFloat6311;
				float f_1_ = -512.0F + f_0_;
				idirect3ddevice.a(10, f_1_, 1.0F / (-f_1_ + f_0_), f_0_, 1.0F / (-f_0_ + f));
			} else {
				idirect3ddevice.a(10, 0.0F, 0.0F, 0.0F, 0.0F);
			}
			anAbstractToolkit3654.method1336(-2, anAbstractToolkit3654.anInt6276);
		}
	}
	
	final void method3410(int i) {
		if (anIDirect3DVertexShader8151 != null) {
			IDirect3DDevice idirect3ddevice = aD3DToolkit8149.anIDirect3DDevice9199;
			Class336_Sub1 class336_sub1 = aD3DToolkit8149.method1378(50);
			idirect3ddevice.a(0, class336_sub1.method3881((byte) -122, aFloatArray8150));
		}
		if (i <= 10) {
			anIDirect3DVertexShader8151 = null;
		}
	}
	
	final void method3422(int i, boolean bool) {
		anAbstractToolkit3654.method1304(0, 0, Class106.aClass135_1354);
		anAbstractToolkit3654.method1304(1, 0, InterfaceSettings.aClass135_7421);
		anAbstractToolkit3654.method1349(Class115.aClass135_1465, (byte) 19, false, true, 2);
		anAbstractToolkit3654.method1364(-28858, false);
		aD3DToolkit8149.method1384((byte) -124, anIDirect3DVertexShader8151);
		if (i >= -84) {
			aFloatArray8150 = null;
		}
		method3410(46);
		method3421(false);
		method3412(0);
		method3416((byte) -56);
	}
	
	Class290_Sub9(D3DToolkit d3dtoolkit, Index class302, Class5 class5) {
		super(d3dtoolkit);
		aD3DToolkit8149 = d3dtoolkit;
		aClass5_8152 = class5;
		if (null != class302 && aClass5_8152.method173(4) && (0xffff & aD3DToolkit8149.aD3DCAPS9188.VertexShaderVersion) >= 257) {
			anIDirect3DVertexShader8151 = aD3DToolkit8149.anIDirect3DDevice9199.b(class302.method3529("dx", "transparent_water", 1));
		} else {
			anIDirect3DVertexShader8151 = null;
		}
	}
	
	final void method3417(boolean bool, boolean bool_2_) {
		if (bool_2_) {
			method3421(false);
		}
		anAbstractToolkit3654.method1318(-30, Class236.aClass94_2898, Class385.aClass94_4911);
	}
	
	final void method3412(int i) {
		if (null != anIDirect3DVertexShader8151) {
			IDirect3DDevice idirect3ddevice = aD3DToolkit8149.anIDirect3DDevice9199;
			idirect3ddevice.a(4, anAbstractToolkit3654.method1361(aFloatArray8150, i + 7));
		}
		if (i != 0) {
			anIDirect3DVertexShader8151 = null;
		}
	}
	
	final void method3411(int i) {
		aD3DToolkit8149.method1384((byte) -118, null);
		anAbstractToolkit3654.method1304(0, 0, Class106.aClass135_1354);
		anAbstractToolkit3654.method1304(1, 0, Class115.aClass135_1465);
		anAbstractToolkit3654.method1304(2, i + 8668, InterfaceSettings.aClass135_7421);
		anAbstractToolkit3654.method1364(i ^ 0x5162, true);
		if (i != -8668) {
			aClass5_8152 = null;
		}
	}
	
	final void method3415(boolean bool, int i, int i_3_) {
		IDirect3DDevice idirect3ddevice = aD3DToolkit8149.anIDirect3DDevice9199;
		if (bool != true) {
			method3410(11);
		}
		if (aClass5_8152.aBoolean128) {
			float f = (float) (anAbstractToolkit3654.anInt6332 % 4000) / 4000.0F;
			anAbstractToolkit3654.method1312((byte) -21, aClass5_8152.anInterface13_Impl3_130);
			idirect3ddevice.a(11, f, 0.0F, 0.0F, 0.0F);
		} else {
			int i_4_ = anAbstractToolkit3654.anInt6332 % 4000 * 16 / 4000;
			anAbstractToolkit3654.method1312((byte) -21, aClass5_8152.anInterface13_Impl1Array131[i_4_]);
			idirect3ddevice.a(11, 0.0F, 0.0F, 0.0F, 0.0F);
		}
	}
	
	final void method3419(Interface13 interface13, int i, byte b) {
		if (b != 92) {
			aClass5_8152 = null;
		}
	}
	
	final void method3421(boolean bool) {
		if (bool) {
			aClass5_8152 = null;
		}
		if (anIDirect3DVertexShader8151 != null) {
			IDirect3DDevice idirect3ddevice = aD3DToolkit8149.anIDirect3DDevice9199;
			Class336_Sub1 class336_sub1 = anAbstractToolkit3654.method1290((byte) 86);
			class336_sub1.method3891(aFloatArray8150, true);
			aFloatArray8150[4] *= 0.25F;
			aFloatArray8150[0] *= 0.25F;
			aFloatArray8150[7] *= 0.25F;
			aFloatArray8150[1] *= 0.25F;
			aFloatArray8150[5] *= 0.25F;
			aFloatArray8150[3] *= 0.25F;
			aFloatArray8150[6] *= 0.25F;
			aFloatArray8150[2] *= 0.25F;
			idirect3ddevice.SetVertexShaderConstantF(8, aFloatArray8150, 2);
		}
	}
	
	final void method3413(int i) {
		if (anIDirect3DVertexShader8151 != null) {
			IDirect3DDevice idirect3ddevice = aD3DToolkit8149.anIDirect3DDevice9199;
			Class336_Sub1 class336_sub1 = aD3DToolkit8149.method1378(50);
			idirect3ddevice.a(0, class336_sub1.method3881((byte) -120, aFloatArray8150));
		}
		@SuppressWarnings("unused")
		int i_5_ = -33 / ((i - -60) / 61);
	}
	
	final boolean method3414(byte b) {
		if (b >= -45) {
			method3417(true, true);
		}
        return anIDirect3DVertexShader8151 != null;
    }
}
