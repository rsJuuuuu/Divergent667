/* Class262_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Dimension;

public class Class262_Sub9 extends Class262
{
	private int anInt7758;
	private int anInt7759;
	static int anInt7760;
	private int anInt7761;
	private int anInt7762;
	static int anInt7763;
	private int anInt7764;
	static OutcommingPacket aClass318_7765 = new OutcommingPacket(4, 8);
	private int anInt7766;
	
	final void method3148(int i) {
		Class121.aClass206Array1529[anInt7759].method2037(-61).method852(anInt7766, 0, anInt7761, (byte) -119, anInt7764, Class174.clientCycle, anInt7762, anInt7758);
		if (i >= -102) {
			method3171(null, (byte) 71, null, -111, null, 38);
		}
		anInt7763++;
	}
	
	public static void method3170(boolean bool) {
		if (bool != false) {
			aClass318_7765 = null;
		}
		aClass318_7765 = null;
	}
	
	static final GraphicsToolkit method3171(Index class302, byte b, d var_d, int i, java.awt.Canvas canvas, int i_0_) {
		anInt7760++;
		@SuppressWarnings("unused")
		int i_1_ = -11 % ((-31 - b) / 47);
		int i_2_ = 0;
		int i_3_ = 0;
		if (canvas != null) {
			Dimension dimension = canvas.getSize();
			i_2_ = dimension.width;
			i_3_ = dimension.height;
		}
		return GraphicsToolkit.method1240(-106, canvas, i_3_, i_0_, var_d, i, class302, i_2_);
	}
	
	Class262_Sub9(BufferedStream buffer) {
		super(buffer);
		anInt7759 = buffer.readUnsignedShort();
		int i = buffer.readUnsignedByte();
		if ((i & 0x1) != 0) {
			anInt7758 = buffer.readUnsignedShort();
			anInt7764 = buffer.readUnsignedShort();
		} else {
			anInt7758 = -1;
			anInt7764 = -1;
		}
		if ((0x2 & i ^ 0xffffffff) != -1) {
			anInt7762 = buffer.readUnsignedShort();
			anInt7766 = buffer.readUnsignedShort();
		} else {
			anInt7766 = -1;
			anInt7762 = -1;
		}
		if ((0x4 & i ^ 0xffffffff) == -1) {
			anInt7761 = -1;
		} else {
			int i_4_ = buffer.readUnsignedShort();
			int i_5_ = buffer.readUnsignedShort();
			int i_6_ = i_4_ * 255 / i_5_;
			if ((i_4_ ^ 0xffffffff) < -1 && (i_6_ ^ 0xffffffff) > -2) {
				i_6_ = 1;
			}
			anInt7761 = i_6_;
		}
	}
}
