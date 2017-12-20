/* Class265_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.lh;

public class Class265_Sub3 extends Class265 implements Interface13_Impl1
{
	private int anInt7903;
	protected boolean aBoolean7904;
	private int anInt7905;
	private IDirect3DTexture anIDirect3DTexture7906;
	protected boolean aBoolean7907;
	
	public final int method46(byte b) {
		if (b != 122) {
			aBoolean7907 = false;
		}
		return anInt7905;
	}
	
	final IDirect3DBaseTexture method3232(int i) {
		if (i > -46) {
			anIDirect3DTexture7906 = null;
		}
		return anIDirect3DTexture7906;
	}
	
	Class265_Sub3(D3DToolkit d3dtoolkit, int i, int i_0_, boolean bool, int[] is, int i_1_, int i_2_) {
		super(d3dtoolkit, Class99.aClass68_1290, Class372.aClass372_4594, bool && d3dtoolkit.aBoolean9200, i_0_ * i);
		if (aD3DToolkit3365.aBoolean9196) {
			anInt7903 = i;
			anInt7905 = i_0_;
		} else {
			anInt7903 = Class320_Sub19.method3753(i, -729073628);
			anInt7905 = Class320_Sub19.method3753(i_0_, -729073628);
		}
		if (bool) {
			anIDirect3DTexture7906 = aD3DToolkit3365.anIDirect3DDevice9199.a(anInt7903, anInt7905, 0, 1024, 21, 1);
		} else {
			anIDirect3DTexture7906 = aD3DToolkit3365.anIDirect3DDevice9199.a(anInt7903, anInt7905, 1, 0, 21, 1);
		}
		PixelBuffer pixelbuffer = aD3DToolkit3365.aPixelBuffer9187;
		int i_3_ = anIDirect3DTexture7906.LockRect(0, 0, 0, i, i_0_, 0, pixelbuffer);
		if (lh.a((byte) 84, i_3_)) {
			if (-1 == (i_2_ ^ 0xffffffff)) {
				i_2_ = i;
			}
			int i_4_ = pixelbuffer.getRowPitch();
			if (4 * i == i_4_ && (i_2_ ^ 0xffffffff) == (i ^ 0xffffffff)) {
				pixelbuffer.b(is, i_1_, 0, i * i_0_);
			} else {
				for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > (i_0_ ^ 0xffffffff); i_5_++)
					pixelbuffer.b(is, i_1_ + i_5_ * i_2_, i_5_ * i_4_, i);
			}
			anIDirect3DTexture7906.UnlockRect(0);
		}
	}
	
	public final void method51(boolean bool, boolean bool_6_, boolean bool_7_) {
		if (bool_7_) {
			method43((byte) -58, -35, 103, null, -32, -116, -79);
		}
		aBoolean7904 = bool_6_;
		aBoolean7907 = bool;
	}
	
	public final void method50(int i, int i_8_, int i_9_, int i_10_, byte[] bs, int i_11_, Class68 class68, int i_12_, int i_13_) {
		if (class68 != aClass68_3367 || Class372.aClass372_4594 != aClass372_3366) {
			throw new RuntimeException();
		}
		PixelBuffer pixelbuffer = aD3DToolkit3365.aPixelBuffer9187;
		int i_14_ = anIDirect3DTexture7906.LockRect(0, i_12_, i_11_, i_13_, i_9_, 0, pixelbuffer);
		if (lh.a((byte) 106, i_14_)) {
			i_8_ *= aClass68_3367.anInt934;
			i_13_ *= aClass68_3367.anInt934;
			int i_15_ = pixelbuffer.getRowPitch();
			if ((i_13_ ^ 0xffffffff) != (i_15_ ^ 0xffffffff) || i_13_ != i_8_) {
				for (int i_16_ = 0; (i_16_ ^ 0xffffffff) > (i_9_ ^ 0xffffffff); i_16_++)
					pixelbuffer.a(bs, i_16_ * i_8_ + i, i_15_ * i_16_, i_13_);
			} else {
				pixelbuffer.a(bs, i, 0, i_13_ * i_9_);
			}
			anIDirect3DTexture7906.UnlockRect(0);
		}
		if (i_10_ != -15178) {
			method48(-27);
		}
	}
	
	Class265_Sub3(D3DToolkit d3dtoolkit, Class68 class68, Class372 class372, int i, int i_17_) {
		super(d3dtoolkit, class68, class372, false, i_17_ * i);
		if (aD3DToolkit3365.aBoolean9196) {
			anInt7905 = i_17_;
			anInt7903 = i;
		} else {
			anInt7903 = Class320_Sub19.method3753(i, -729073628);
			anInt7905 = Class320_Sub19.method3753(i_17_, -729073628);
		}
		anIDirect3DTexture7906 = aD3DToolkit3365.anIDirect3DDevice9199.a(i, i_17_, 1, 0, D3DToolkit.method1396(aClass372_3366, aClass68_3367, -103), 1);
	}
	
	public final void method41(byte b, Class228 class228) {
		if (b >= -104) {
			method46((byte) -33);
		}
		super.method41((byte) -118, class228);
	}
	
	public final float method45(float f, int i) {
		@SuppressWarnings("unused")
		int i_18_ = -75 / ((i - 17) / 63);
		return f / (float) anInt7903;
	}
	
	public final void method42(boolean bool) {
		if (!bool) {
			aD3DToolkit3365.method1392(2, this);
		}
	}
	
	Class265_Sub3(D3DToolkit d3dtoolkit, Class68 class68, int i, int i_19_, boolean bool, byte[] bs, int i_20_, int i_21_) {
		super(d3dtoolkit, class68, Class372.aClass372_4594, bool && d3dtoolkit.aBoolean9200, i_19_ * i);
		if (!aD3DToolkit3365.aBoolean9196) {
			anInt7903 = Class320_Sub19.method3753(i, -729073628);
			anInt7905 = Class320_Sub19.method3753(i_19_, -729073628);
		} else {
			anInt7905 = i_19_;
			anInt7903 = i;
		}
		if (!bool) {
			anIDirect3DTexture7906 = aD3DToolkit3365.anIDirect3DDevice9199.a(anInt7903, anInt7905, 1, 0, D3DToolkit.method1396(Class372.aClass372_4594, aClass68_3367, -32), 1);
		} else {
			anIDirect3DTexture7906 = aD3DToolkit3365.anIDirect3DDevice9199.a(anInt7903, anInt7905, 0, 1024, D3DToolkit.method1396(Class372.aClass372_4594, aClass68_3367, -31), 1);
		}
		PixelBuffer pixelbuffer = aD3DToolkit3365.aPixelBuffer9187;
		int i_22_ = anIDirect3DTexture7906.LockRect(0, 0, 0, i, i_19_, 0, pixelbuffer);
		if (lh.a((byte) 104, i_22_)) {
			if (0 == i_21_) {
				i_21_ = i;
			}
			i *= aClass68_3367.anInt934;
			i_21_ *= aClass68_3367.anInt934;
			int i_23_ = pixelbuffer.getRowPitch();
			if ((i ^ 0xffffffff) == (i_23_ ^ 0xffffffff) && (i ^ 0xffffffff) == (i_21_ ^ 0xffffffff)) {
				pixelbuffer.a(bs, i_20_, 0, i * i_19_);
			} else {
				for (int i_24_ = 0; i_24_ < i_19_; i_24_++)
					pixelbuffer.a(bs, i_21_ * i_24_ + i_20_, i_24_ * i_23_, i);
			}
			anIDirect3DTexture7906.UnlockRect(0);
		}
	}
	
	public final void method43(byte b, int i, int i_25_, int[] is, int i_26_, int i_27_, int i_28_) {
		if (Class99.aClass68_1290 != aClass68_3367 || Class372.aClass372_4594 != aClass372_3366) {
			throw new RuntimeException();
		}
		if (b != 64) {
			method49(0.5192189F, (byte) 26);
		}
		PixelBuffer pixelbuffer = aD3DToolkit3365.aPixelBuffer9187;
		int i_29_ = anIDirect3DTexture7906.LockRect(0, i_26_, i_25_, i_27_, i_28_, 16, pixelbuffer);
		if (lh.a((byte) 63, i_29_)) {
			int i_30_ = pixelbuffer.getRowPitch();
			if (4 * i_27_ == i_30_) {
				pixelbuffer.a(is, i, 0, is.length);
			} else {
				for (int i_31_ = 0; (i_31_ ^ 0xffffffff) > (i_28_ ^ 0xffffffff); i_31_++)
					pixelbuffer.a(is, i - -(i_27_ * i_31_), i_31_ * i_30_, i_27_);
			}
			anIDirect3DTexture7906.UnlockRect(0);
		}
	}
	
	public final boolean method48(int i) {
		if (i != 30986) {
			aBoolean7904 = true;
		}
		return true;
	}
	
	public final void method47(int[] is, int i, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_) {
		if (Class99.aClass68_1290 != aClass68_3367 || Class372.aClass372_4594 != aClass372_3366) {
			throw new RuntimeException();
		}
		PixelBuffer pixelbuffer = aD3DToolkit3365.aPixelBuffer9187;
		int i_38_ = anIDirect3DTexture7906.LockRect(0, i, i_32_, i_35_, i_33_, 0, pixelbuffer);
		if (i_34_ != 23110) {
			method51(true, true, true);
		}
		if (lh.a((byte) 123, i_38_)) {
			int i_39_ = pixelbuffer.getRowPitch();
			if (i_39_ != 4 * i_35_ || (i_35_ ^ 0xffffffff) != (i_37_ ^ 0xffffffff)) {
				for (int i_40_ = 0; (i_40_ ^ 0xffffffff) > (i_33_ ^ 0xffffffff); i_40_++)
					pixelbuffer.b(is, i_36_ + i_37_ * i_40_, i_40_ * i_39_, i_35_);
			} else {
				pixelbuffer.b(is, i_36_, 0, i_35_ * i_33_);
			}
			anIDirect3DTexture7906.UnlockRect(0);
		}
	}
	
	public final float method49(float f, byte b) {
		if (b > -6) {
			method44(-88);
		}
		return f / (float) anInt7905;
	}
	
	public final int method44(int i) {
		if (i != 19809) {
			method43((byte) -121, -46, 83, null, 20, 59, 68);
		}
		return anInt7903;
	}
}
