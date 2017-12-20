/* Class150 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

class Class150 implements Interface7
{
	static int anInt5078;
	protected Class379 aClass379_5079;
	protected int anInt5080;
	protected int anInt5081;
	static int anInt5082;
	protected int anInt5083;
	protected int anInt5084;
	static int anInt5085;
	protected int anInt5086;
	protected Class77 aClass77_5087;
	static int anInt5088;
	static int anInt5089;
	protected int anInt5090;
	static int anInt5091;
	protected int anInt5092;
	
	static final boolean method1652(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		anInt5089++;
		if (!Class12.aBoolean194 || !Mobile_Sub1.aBoolean10959) {
			return false;
		}
		if ((Class233.anInt2786 ^ 0xffffffff) > -101) {
			return false;
		}
		if (!Class313.method3649(true, i_3_, i_0_, i_1_)) {
			return false;
		}
		if (i_2_ != 0) {
			return false;
		}
		int i_4_ = i_1_ << Class36.anInt549;
		int i_5_ = i_3_ << Class36.anInt549;
		if (Node_Sub25.method2653(Class179.anInt2129, i, i_4_, 255, i_5_, Class320_Sub10.aPlaneArray8300[i_0_].method3251(i_3_, i_1_, (byte) -118), Class179.anInt2129)) {
			Class187.anInt2267++;
			return true;
		}
		return false;
	}
	
	static final void method1653(File file, int i, byte[] bs, int i_6_) throws IOException {
		anInt5078++;
		DataInputStream datainputstream = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
		try {
			datainputstream.readFully(bs, 0, i_6_);
		} catch (java.io.EOFException eofexception) {
			/* empty */
		}
		if (i >= 84) {
			datainputstream.close();
		}
	}
	
	static final float method1654(float f, float f_7_, float f_8_, int i, byte b) {
		@SuppressWarnings("unused")
		int i_9_ = -69 / ((-17 - b) / 33);
		anInt5091++;
		float[] fs = Class150_Sub3.aFloatArrayArray8967[i];
		return f * fs[2] + (fs[0] * f_7_ + f_8_ * fs[1]);
	}
	
	public Class170 method20(int i) {
		anInt5082++;
		if (i <= 81) {
			method1652(43, -71, -15, 90, -71);
		}
		return null;
	}
	
	Class150(Class379 class379, Class77 class77, int i, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_) {
		anInt5081 = i_12_;
		anInt5083 = i_14_;
		aClass379_5079 = class379;
		anInt5084 = i_13_;
		aClass77_5087 = class77;
		anInt5086 = i_11_;
		anInt5092 = i;
		anInt5080 = i_10_;
		anInt5090 = i_15_;
	}
}
