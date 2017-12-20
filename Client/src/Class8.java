/* Class8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DIndexBuffer;
import jagdx.lh;

public class Class8 implements Interface15_Impl1
{
	private D3DToolkit aD3DToolkit9083;
	private boolean aBoolean9084;
	private Class372 aClass372_9085;
	private int anInt9086;
	private boolean aBoolean9087 = false;
	private int anInt9088;
	protected IDirect3DIndexBuffer anIDirect3DIndexBuffer9089;
	
	public final jaclib.memory.Buffer method54(boolean bool, byte b) {
		if (b < 66) {
			method53(-44);
		}
		if (null == anIDirect3DIndexBuffer9089) {
			return null;
		}
		bool &= aBoolean9084;
		if (!aBoolean9087 && lh.a((byte) 86, anIDirect3DIndexBuffer9089.Lock(0, anInt9088, !bool ? 0 : 8192, aD3DToolkit9083.aGeometryBuffer9184))) {
			aBoolean9087 = true;
			return aD3DToolkit9083.aGeometryBuffer9184;
		}
		return null;
	}
	
	public final int method57(byte b) {
		if (b > -56) {
			aClass372_9085 = null;
		}
		return anInt9086;
	}
	
	public final void method56(int i, int i_0_) {
		if (i != -1696) {
			anInt9088 = 0;
		}
		anInt9086 = i_0_ * aClass372_9085.anInt4591;
		if ((anInt9088 ^ 0xffffffff) > (anInt9086 ^ 0xffffffff)) {
			int i_1_ = 8;
			int i_2_;
			if (!aBoolean9084) {
				i_2_ = 1;
			} else {
				i_1_ |= 0x200;
				i_2_ = 0;
			}
			if (anIDirect3DIndexBuffer9089 != null) {
				anIDirect3DIndexBuffer9089.a(110);
			}
			anIDirect3DIndexBuffer9089 = aD3DToolkit9083.anIDirect3DDevice9199.a(anInt9086, i_1_, aClass372_9085 != Class372.aClass372_4595 ? 102 : 101, i_2_, anIDirect3DIndexBuffer9089);
			anInt9088 = anInt9086;
		}
	}
	
	public final Class372 method55(int i) {
		@SuppressWarnings("unused")
		int i_3_ = -90 % ((i - 55) / 39);
		return aClass372_9085;
	}
	
	public final boolean method53(int i) {
		if (aBoolean9087 && lh.a((byte) 61, anIDirect3DIndexBuffer9089.Unlock())) {
			aBoolean9087 = false;
			return true;
		}
		if (i != -3308) {
			method53(-29);
		}
		return false;
	}
	
	Class8(D3DToolkit d3dtoolkit, Class372 class372, boolean bool) {
		aClass372_9085 = class372;
		aD3DToolkit9083 = d3dtoolkit;
		aBoolean9084 = bool;
	}
	
	public final void method38(boolean bool) {
		if (!bool) {
			if (anIDirect3DIndexBuffer9089 != null) {
				anIDirect3DIndexBuffer9089.a(39);
				anIDirect3DIndexBuffer9089 = null;
			}
			anInt9088 = 0;
			anInt9086 = 0;
		}
	}
}
