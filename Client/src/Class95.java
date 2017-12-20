/* Class95 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class95
{
	static int anInt1251;
	protected char aChar1252;
	static int anInt1253;
	protected int anInt1254;
	static int anInt1255;
	static int anInt1256;
	static int anInt1257;
	protected int anInt1258;
	protected int anInt1259;
	
	static final void method1066(int i) {
		anInt1255++;
		if (Class61.anInt898 != -1 && Node_Sub38_Sub7.anInt10153 != -1) {
			if (Class61.anInt898 == 1 || Class61.anInt898 == 3 || (Class61.anInt898 ^ 0xffffffff) != (Node_Sub38_Sub7.anInt10153 ^ 0xffffffff) && (Class61.anInt898 == 0 || (Node_Sub38_Sub7.anInt10153 ^ 0xffffffff) == -1)) {
				Node_Sub25_Sub3.localNPCsCount = 0;
				Node_Sub32.cachedNPCcsCount = 0;
				Class12.aHashTable187.method1517(false);
			}
			Node_Sub38_Sub7.anInt10153 = Class61.anInt898;
		}
	}
	
	static final void method1067(int i, int i_1_, byte b, int i_2_, int i_3_, int i_4_, int i_5_) {
		anInt1257++;
		if ((Class213.aNode_Sub27_2512.aClass320_Sub25_7295.method3776(false) ^ 0xffffffff) != -1 && (i_3_ ^ 0xffffffff) != -1 && Class23.anInt434 < 50 && (i_2_ ^ 0xffffffff) != 0) {
			Node_Sub38_Sub19.aClass78Array10284[Class23.anInt434++] = new Class78((byte) 1, i_2_, i_3_, i_1_, i, i_5_, i_4_, null);
		}
		if (b < 3) {
			method1066(-88);
		}
	}
	
	private final void method1068(int i, BufferedStream buffer, byte b) {
		anInt1253++;
		if ((i ^ 0xffffffff) != -2) {
			if (i == 3) {
				anInt1258 = buffer.readUnsignedShort();
				anInt1254 = buffer.readUnsignedByte();
				anInt1259 = buffer.readUnsignedByte();
			}
		} else {
			aChar1252 = Class20_Sub1.method294(buffer.readByte(), (byte) 113);
		}
	}
	
	final void method1069(byte b, BufferedStream buffer) {
		for (;;) {
			int i = buffer.readUnsignedByte();
			if (i == 0) {
				break;
			}
			method1068(i, buffer, (byte) -58);
		}
		anInt1256++;
		if (b != 119) {
			anInt1259 = 120;
		}
	}
}
