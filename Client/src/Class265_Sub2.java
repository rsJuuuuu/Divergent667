/* Class265_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.lh;

public class Class265_Sub2 extends Class265 implements Interface13_Impl2
{
	private int anInt7901;
	private IDirect3DCubeTexture anIDirect3DCubeTexture7902;
	
	public final void method42(boolean bool) {
		aD3DToolkit3365.method1395(this, 125);
		if (bool) {
			method42(false);
		}
	}
	
	public final void method41(byte b, Class228 class228) {
		if (b < -104) {
			super.method41((byte) -105, class228);
		}
	}
	
	Class265_Sub2(D3DToolkit d3dtoolkit, int i, boolean bool, int[][] is) {
		super(d3dtoolkit, Class99.aClass68_1290, Class372.aClass372_4594, bool && d3dtoolkit.aBoolean9186, 6 * (i * i));
		anInt7901 = i;
		if (aBoolean3364) {
			anIDirect3DCubeTexture7902 = aD3DToolkit3365.anIDirect3DDevice9199.a(anInt7901, 0, 1024, 21, 1);
		} else {
			anIDirect3DCubeTexture7902 = aD3DToolkit3365.anIDirect3DDevice9199.a(anInt7901, 1, 0, 21, 1);
		}
		PixelBuffer pixelbuffer = aD3DToolkit3365.aPixelBuffer9187;
		for (int i_0_ = 0; -7 < (i_0_ ^ 0xffffffff); i_0_++) {
			int i_1_ = anIDirect3DCubeTexture7902.LockRect(i_0_, 0, 0, 0, anInt7901, anInt7901, 0, pixelbuffer);
			if (lh.a((byte) 84, i_1_)) {
				int i_2_ = pixelbuffer.getRowPitch();
				if ((i_2_ ^ 0xffffffff) != (anInt7901 * 4 ^ 0xffffffff)) {
					for (int i_3_ = 0; i_3_ < anInt7901; i_3_++)
						pixelbuffer.b(is[i_0_], anInt7901 * i_3_, i_2_ * i_3_, anInt7901);
				} else {
					pixelbuffer.b(is[i_0_], 0, 0, anInt7901 * anInt7901);
				}
				anIDirect3DCubeTexture7902.UnlockRect(i_0_, 0);
			}
		}
	}
	
	final IDirect3DBaseTexture method3232(int i) {
		if (i >= -46) {
			anInt7901 = 102;
		}
		return anIDirect3DCubeTexture7902;
	}
}
