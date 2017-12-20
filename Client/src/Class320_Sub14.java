/* Class320_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class320_Sub14 extends Class320
{
	static int anInt8340;
	static int anInt8341;
	static int anInt8342;
	static int anInt8343;
	static int anInt8344;
	static int anInt8345;
	static int anInt8346;
	static int anInt8347;
	
	final int method3677(int i) {
		if (i != 0) {
			anInt8347 = 112;
		}
		anInt8341++;
		return 1;
	}
	
	final void method3676(boolean bool, int i) {
		if (bool == false) {
			anInt8344++;
			anInt4064 = i;
		}
	}
	
	Class320_Sub14(Node_Sub27 node_sub27) {
		super(node_sub27);
	}
	
	static final short[][] method3735(int i, float[][] fs, short[][] ses) {
		for (int i_0_ = i; (i_0_ ^ 0xffffffff) > (fs.length ^ 0xffffffff); i_0_++) {
			for (int i_1_ = 0; ses[i_0_].length > i_1_; i_1_++)
				ses[i_0_][i_1_] = (short) (int) (16383.0F * fs[i_0_][i_1_]);
		}
		anInt8345++;
		return ses;
	}
	
	static final Class270 method3736(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		anInt8343++;
		long l = 67481L * (long) i_7_ ^ (long) i_3_ * 97549L ^ 475427L * (long) i_4_ ^ (long) i_5_ * 986053L ^ 32147369L * (long) i ^ (long) i_6_ * 76724863L;
		Class270 class270 = (Class270) Node.aClass61_2795.method607(l, 0);
		if (i_2_ >= -39) {
			return null;
		}
		if (class270 != null) {
			return class270;
		}
		class270 = Class229.aGraphicsToolkit2732.c(i_7_, i_3_, i_4_, i_5_, i, i_6_);
		Node.aClass61_2795.method601(class270, 25566, l);
		return class270;
	}
	
	final int method3675(int i, byte b) {
		if (b != 54) {
			method3736(122, -33, 67, -113, 117, -106, 96);
		}
		anInt8340++;
		return 1;
	}
	
	final void method3673(byte b) {
		anInt8342++;
		if ((anInt4064 ^ 0xffffffff) != -2 && anInt4064 != 0) {
			anInt4064 = method3677(0);
		}
		if (b > -35) {
			anInt8347 = -57;
		}
	}
	
	Class320_Sub14(int i, Node_Sub27 node_sub27) {
		super(node_sub27);
	}
	
	final int method3737(boolean bool) {
		anInt8346++;
		if (bool != false) {
			return -78;
		}
		return anInt4064;
	}
}
