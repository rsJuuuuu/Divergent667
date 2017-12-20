/* Class80 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.lh;

public class Class80 implements Interface15_Impl2
{
	private int anInt9076;
	private int anInt9077;
	private boolean aBoolean9078;
	private byte aByte9079;
	protected IDirect3DVertexBuffer anIDirect3DVertexBuffer9080;
	private D3DToolkit aD3DToolkit9081;
	private boolean aBoolean9082 = false;
	
	public final boolean method39(int i) {
		if (aBoolean9082 && lh.a((byte) 96, anIDirect3DVertexBuffer9080.Unlock())) {
			aBoolean9082 = false;
			return true;
		}
		return false;
	}
	
	public final boolean method37(int i, int i_1_, int i_2_) {
		aByte9079 = (byte) i;
		anInt9076 = i_1_;
		if ((anInt9077 ^ 0xffffffff) > (anInt9076 ^ 0xffffffff)) {
			int i_3_ = 8;
			int i_4_;
			if (aBoolean9078) {
				i_3_ |= 0x200;
				i_4_ = 0;
			} else {
				i_4_ = 1;
			}
			if (anIDirect3DVertexBuffer9080 != null) {
				anIDirect3DVertexBuffer9080.a(111);
			}
			anIDirect3DVertexBuffer9080 = aD3DToolkit9081.anIDirect3DDevice9199.a(anInt9076, i_3_, 0, i_4_, anIDirect3DVertexBuffer9080);
			anInt9077 = anInt9076;
		}
		if (i_2_ != -12093) {
			method39(46);
		}
        return anIDirect3DVertexBuffer9080 != null;
    }
	
	public final boolean method36(int i, int i_5_, Source source, int i_6_) {
		if (method37(i, i_5_, -12093)) {
			return anIDirect3DVertexBuffer9080.a(source, 0, 0, anInt9076, !aBoolean9078 ? 0 : 8192);
		}
		if (i_6_ != 1965) {
			return false;
		}
		return false;
	}
	
	public final jaclib.memory.Buffer method40(int i, boolean bool) {
		if (null == anIDirect3DVertexBuffer9080) {
			return null;
		}
		bool &= aBoolean9078;
		if (!aBoolean9082 && lh.a((byte) 108, anIDirect3DVertexBuffer9080.Lock(0, anInt9077, !bool ? 0 : 8192, aD3DToolkit9081.aGeometryBuffer9184))) {
			aBoolean9082 = true;
			return aD3DToolkit9081.aGeometryBuffer9184;
		}
		return null;
	}
	
	public final void method38(boolean bool) {
		if (null != anIDirect3DVertexBuffer9080) {
			anIDirect3DVertexBuffer9080.a(31);
			anIDirect3DVertexBuffer9080 = null;
		}
		anInt9077 = 0;
		if (!bool) {
			anInt9076 = 0;
		}
	}
	
	final int method793(int i) {
		if (i != -11856) {
			return -40;
		}
		return aByte9079;
	}
	
	public final int method57(byte b) {
		if (b >= -56) {
			return 17;
		}
		return anInt9076;
	}
	
	Class80(D3DToolkit d3dtoolkit, boolean bool) {
		aD3DToolkit9081 = d3dtoolkit;
		aBoolean9078 = bool;
	}
}
