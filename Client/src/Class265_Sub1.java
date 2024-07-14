/* Class265_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.lh;

public class Class265_Sub1 extends Class265 implements Interface13_Impl3 {
    private IDirect3DVolumeTexture anIDirect3DVolumeTexture7898;
    private int anInt7900;

    Class265_Sub1(D3DToolkit d3dtoolkit, Class68 class68, byte[] bs) {
        super(d3dtoolkit, class68, Class372.aClass372_4594, false);
        int anInt7899 = 16;
        anInt7900 = 128;
        int anInt7897 = 128;
        anIDirect3DVolumeTexture7898 = aD3DToolkit3365.anIDirect3DDevice9199.a(128, 128, 16, 1, 0, D3DToolkit.method1396(aClass372_3366, class68, -106), 1);
        PixelBuffer pixelbuffer = aD3DToolkit3365.aPixelBuffer9187;
        int i_2_ = anIDirect3DVolumeTexture7898.LockBox(0, 0, 0, 0, 128, 128, 16, 0, pixelbuffer);
        if (lh.a((byte) 107, i_2_)) {
            int i_3_ = anInt7900 * aClass68_3367.anInt934;
            int i_4_ = i_3_ * anInt7897;
            int i_5_ = pixelbuffer.getSlicePitch();
            if (i_4_ == i_5_) {
                pixelbuffer.a(bs, 0, 0, anInt7897 * i_3_ * anInt7899);
            } else {
                int i_6_ = pixelbuffer.getRowPitch();
                if (i_6_ == i_3_) {
                    for (int i_9_ = 0; anInt7899 > i_9_; i_9_++)
                        pixelbuffer.a(bs, i_4_ * i_9_, i_9_ * i_5_, i_4_);
                } else {
                    for (int i_7_ = 0; anInt7899 > i_7_; i_7_++) {
                        for (int i_8_ = 0; anInt7897 > i_8_; i_8_++)
                            pixelbuffer.a(bs, i_4_ * i_7_ + i_3_ * i_8_, i_8_ * i_6_ + i_5_ * i_7_, i_3_);
                    }
                }
            }
            anIDirect3DVolumeTexture7898.UnlockBox(0);
        }
    }

    public final void method41(byte b, Class228 class228) {
        super.method41((byte) -127, class228);
        if (b >= -104) {
            anIDirect3DVolumeTexture7898 = null;
        }
    }

    public final void method42(boolean bool) {
        if (bool) {
            anInt7900 = 7;
        }
        aD3DToolkit3365.method1394(this);
    }

    final IDirect3DBaseTexture method3232(int i) {
        if (i >= -46) {
            method42(false);
        }
        return anIDirect3DVolumeTexture7898;
    }
}
