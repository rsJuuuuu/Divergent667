/* Class70 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ConfigDefinitions
{
	static int anInt945;
	protected int anInt946;
	static int anInt947;
	protected int anInt948;
	static int anInt949;
	protected int anInt950;
	
	final void method737(int i, BufferedStream buffer) {
		for (;;) {
			int i_1_ = buffer.readUnsignedByte();
			if ((i_1_ ^ 0xffffffff) == -1) {
				break;
			}
			method739(-31, buffer, i_1_);
		}
		anInt945++;
	}
	
	static final void method738(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		if (i_7_ == 1) {
			anInt947++;
			if ((i_8_ ^ 0xffffffff) == (i_3_ ^ 0xffffffff)) {
				OutputStream_Sub2.method138(i_2_, i_8_, i_5_, (byte) 91, i, i_4_, i_6_);
			} else if (Class262_Sub4.anInt7722 > i_4_ + -i_8_ || (i_8_ + i_4_ ^ 0xffffffff) < (za_Sub2.anInt10513 ^ 0xffffffff) || (Class384.anInt4906 ^ 0xffffffff) < (i - i_3_ ^ 0xffffffff) || (Node_Sub25_Sub1.anInt9936 ^ 0xffffffff) > (i_3_ + i ^ 0xffffffff)) {
				Class263.method3223(i_4_, i_8_, -21595, i_3_, i_5_, i, i_6_, i_2_);
			} else {
				Class188_Sub2.method1903(i_6_, i_8_, i_5_, i_3_, i_2_, 3, i, i_4_);
			}
		}
	}
	
	private final void method739(int i, BufferedStream buffer, int i_9_) {
		anInt949++;
		if (i_9_ == 1) {
			anInt950 = buffer.readUnsignedShort();
			anInt946 = buffer.readUnsignedByte();
			anInt948 = buffer.readUnsignedByte();
		}
	}
}
