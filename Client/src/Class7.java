/* Class7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.CRC32;

public class Class7
{
	static int anInt149;
	protected int anInt150 = 8;
	protected int anInt151;
	protected int anInt152;
	protected int anInt153;
	static int anInt154;
	protected int anInt155;
	protected int anInt156;
	static Class179 aClass179_157 = new Class179(true);
	protected int anInt158;
	protected int anInt159 = 16777215;
	protected int anInt160;
	protected int anInt161;
	protected boolean aBoolean162;
	static CRC32 aCRC32_163 = new CRC32();
	static String[] aStringArray164 = new String[100];
	
	private final void method180(int i, BufferedStream buffer, int i_0_) {
		if (i_0_ >= -119) {
			method180(-41, null, -52);
		}
		if ((i ^ 0xffffffff) == -2) {
			anInt150 = buffer.readUnsignedShort();
		} else if ((i ^ 0xffffffff) != -3) {
			if (i == 3) {
				anInt152 = buffer.readShort();
				anInt158 = buffer.readShort();
				anInt160 = buffer.readShort();
			} else if (i == 4) {
				anInt156 = buffer.readUnsignedByte();
			} else if (i == 5) {
				anInt151 = buffer.readUnsignedShort();
			} else if ((i ^ 0xffffffff) != -7) {
				if (i == 7) {
					anInt155 = buffer.readShort();
					anInt161 = buffer.readShort();
					anInt153 = buffer.readShort();
				}
			} else {
				anInt159 = buffer.read24BitInteger();
			}
		} else {
			aBoolean162 = true;
		}
		anInt154++;
	}
	
	static final void method181(int i, int i_1_, int i_2_, Class var_class) {
		Class261 class261 = Class175.aClass261ArrayArrayArray2099[i][i_1_][i_2_];
		if (class261 != null) {
			for (Class256 class256 = class261.aClass256_3312; class256 != null; class256 = class256.aClass256_3238) {
				Mobile mobile = class256.aMobile3239;
				if (var_class.isAssignableFrom(mobile.getClass()) && mobile.aShort9119 == i_1_ && mobile.aShort9120 == i_2_) {
					Class290.method3418(mobile, false);
					break;
				}
			}
		}
	}
	
	final void method182(BufferedStream buffer, int i) {
		if (i != 16777215) {
			anInt155 = 84;
		}
		for (;;) {
			int i_3_ = buffer.readUnsignedByte();
			if ((i_3_ ^ 0xffffffff) == -1) {
				break;
			}
			method180(i_3_, buffer, -121);
		}
		anInt149++;
	}
	
	public static void method183(boolean bool) {
		aStringArray164 = null;
		aCRC32_163 = null;
		aClass179_157 = null;
		if (bool != false) {
			aStringArray164 = null;
		}
	}
}
