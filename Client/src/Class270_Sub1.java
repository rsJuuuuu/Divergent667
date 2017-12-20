/* Class270_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.FileOutputStream;

abstract class Class270_Sub1 extends Class270
{
	static FileOutputStream aFileOutputStream8027;
	static Class277_Sub1 aClass277_Sub1_8028;
	static long[] aLongArray8029;
	static int anInt8030;
	static int anInt8031;
	static int anInt8032;
	static int anInt8033;
	static int anInt8034 = 0;
	static int anInt8035;
	
	public static void method3297(int i) {
		aClass277_Sub1_8028 = null;
		aLongArray8029 = null;
		aFileOutputStream8027 = null;
		if (i > -33) {
			anInt8034 = 65;
		}
	}
	
	abstract Interface13_Impl2 method3298(byte b);
	
	static final byte[] method3299(byte[] bs, int i) {
		anInt8035++;
		if (bs == null) {
			return null;
		}
		byte[] bs_0_ = new byte[bs.length];
		Class311.method3608(bs, i, bs_0_, 0, bs.length);
		return bs_0_;
	}
	
	static final void method3300(IComponentDefinitions widget, byte b, boolean bool) {
		anInt8031++;
		int i = (widget.anInt4735 ^ 0xffffffff) != -1 ? widget.anInt4735 : widget.anInt4809;
		@SuppressWarnings("unused")
		int i_1_ = -101 / ((-76 - b) / 36);
		int i_2_ = (widget.anInt4691 ^ 0xffffffff) != -1 ? widget.anInt4691 : widget.anInt4695;
		Class320_Sub9.method3716(true, i, bool, i_2_, Class134_Sub3.aWidgetArrayArray9035[widget.ihash >> 16], widget.ihash);
		if (widget.aWidgetArray4793 != null) {
			Class320_Sub9.method3716(true, i, bool, i_2_, widget.aWidgetArray4793, widget.ihash);
		}
		Node_Sub2 node_sub2 = (Node_Sub2) Class289.aHashTable3630.method1518(3512, (long) widget.ihash);
		if (node_sub2 != null) {
			Class13.method209(bool, node_sub2.interfaceId, -98, i_2_, i);
		}
	}
	
	static {
		anInt8033 = 0;
		aLongArray8029 = new long[10];
	}
}
