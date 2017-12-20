/* Class371 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Rectangle;

public class Class371
{
	private boolean aBoolean4572;
	static int anInt4573;
	private int anInt4574;
	static int anInt4575;
	private int anInt4576;
	static int anInt4577;
	static int anInt4578;
	private String[] aStringArray4579 = new String[0];
	static int anInt4580;
	static int anInt4581;
	static int anInt4582;
	static int anInt4583;
	static int anInt4584;
	static int anInt4585;
	static OutcommingPacket aClass318_4586 = new OutcommingPacket(10, 8);
	
	static final void method4092(int i, int i_0_, Rectangle[] rectangles) throws Exception_Sub1 {
		if (Class320_Sub20.anInt8397 != 1) {
			Class44.aGraphicsToolkit668.a(rectangles, i_0_, 0, 0);
		} else {
			Class44.aGraphicsToolkit668.a(rectangles, i_0_, Node_Sub38_Sub1.anInt10075, Class166.anInt5100);
		}
		anInt4583++;
		if (i != 16600) {
			aClass318_4586 = null;
		}
	}
	
	final void method4093(String string, byte b) {
		method4101((byte) -114, 1 + anInt4576, string);
		anInt4577++;
		if (b != -105) {
			method4093(null, (byte) -128);
		}
	}
	
	static final boolean method4094(int i, boolean bool) {
		anInt4580++;
		if (bool != false) {
			method4097(17, -80, 66);
		}
        return (i & -i) == i;
    }
	
	public final String toString() {
		anInt4585++;
		StringBuffer stringbuffer = new StringBuffer();
		stringbuffer.append("[");
		for (int i = 0; anInt4576 > i; i++) {
			if ((i ^ 0xffffffff) != -1) {
				stringbuffer.append(", ");
			}
			stringbuffer.append(aStringArray4579[i]);
		}
		stringbuffer.append("]");
		return stringbuffer.toString();
	}
	
	final String[] method4095(int i) {
		if (i != -15202) {
			aClass318_4586 = null;
		}
		anInt4575++;
		String[] strings = new String[1 + anInt4576];
		Class311.method3605(aStringArray4579, 0, strings, 0, 1 + anInt4576);
		return strings;
	}
	
	static final void method4096(byte b) {
		int i = -87 % ((-56 - b) / 40);
		Class320_Sub26.method3777();
		anInt4581++;
		for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > -5; i_1_++)
			Class304.SCENE_CLIP_DATA_PLANES[i_1_].method991(-120);
		Node_Sub18.method2606(126);
		Node_Sub36_Sub2.method2761((byte) 125);
		Class30.method343(-125);
		System.gc();
		Class93.aGraphicsToolkit1241.ya();
	}
	
	static final void method4097(int i, int i_2_, int i_3_) {
		anInt4573++;
		CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(3, 17, (long) i_3_);
		int i_4_ = 6 % ((16 - i) / 61);
		cachenode_sub2.method2288(0);
		cachenode_sub2.anInt9434 = i_2_;
	}
	
	private final int method4098(int i, int i_5_) {
		if (i_5_ != 0) {
			anInt4574 = -53;
		}
		anInt4582++;
		int i_6_ = aStringArray4579.length;
		while (i_6_ <= i) {
			if (!aBoolean4572) {
				i_6_ += anInt4574;
			} else if (i_6_ != 0) {
				i_6_ *= anInt4574;
			} else {
				i_6_ = 1;
			}
		}
		return i_6_;
	}
	
	public static void method4099(byte b) {
		int i = -96 % ((-82 - b) / 33);
		aClass318_4586 = null;
	}
	
	private final void method4100(int i, byte b) {
		anInt4584++;
		String[] strings = new String[method4098(i, 0)];
		Class311.method3605(aStringArray4579, 0, strings, 0, aStringArray4579.length);
		aStringArray4579 = strings;
		if (b <= 111) {
			method4101((byte) -49, 86, null);
		}
	}
	
	private final void method4101(byte b, int i, String string) {
		anInt4578++;
		int i_7_ = 1 / ((-32 - b) / 50);
		if ((anInt4576 ^ 0xffffffff) > (i ^ 0xffffffff)) {
			anInt4576 = i;
		}
		if (i >= aStringArray4579.length) {
			method4100(i, (byte) 119);
		}
		aStringArray4579[i] = string;
	}
	
	Class371(int i, boolean bool) {
		anInt4576 = -1;
		aBoolean4572 = false;
		anInt4574 = i;
		aBoolean4572 = bool;
	}
}
