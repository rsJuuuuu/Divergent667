/* OutputStream_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.io.OutputStream;

public class OutputStream_Sub2 extends OutputStream
{
	static int anInt92;
	static OutcommingPacket aClass318_93 = new OutcommingPacket(77, 3);
	static int anInt94;
	static int anInt95;
	static int anInt96;
	static int anInt97 = 5000;
	
	OutputStream_Sub2() {
		/* empty */
	}
	
	public static void method137(int i) {
		if (i != -5656) {
			method139((byte) -53);
		}
		aClass318_93 = null;
	}
	
	static final void method138(int i, int i_0_, int i_1_, byte b, int i_2_, int i_3_, int i_4_) {
		anInt92++;
		@SuppressWarnings("unused")
		int i_5_ = 101 % ((b - -46) / 57);
		if (-i_0_ + i_3_ >= Class262_Sub4.anInt7722 && (i_0_ + i_3_ ^ 0xffffffff) >= (za_Sub2.anInt10513 ^ 0xffffffff) && (Class384.anInt4906 ^ 0xffffffff) >= (i_2_ - i_0_ ^ 0xffffffff) && i_0_ + i_2_ <= Node_Sub25_Sub1.anInt9936) {
			Class62.method610(i_1_, i_4_, i_2_, i_0_, (byte) -56, i_3_, i);
		} else {
			Class35.method387(i, i_4_, i_1_, i_3_, -1, i_0_, i_2_);
		}
	}
	
	public final void write(int i) throws IOException {
		anInt95++;
		throw new IOException();
	}
	
	static final void method139(byte b) {
		anInt94++;
		int[] is = new int[EntityNode_Sub3_Sub1.aClass86_9166.anInt1175];
		int i = 0;
		for (int i_6_ = 0; (i_6_ ^ 0xffffffff) > (EntityNode_Sub3_Sub1.aClass86_9166.anInt1175 ^ 0xffffffff); i_6_++) {
			ItemDefinitions itemdefinition = EntityNode_Sub3_Sub1.aClass86_9166.method1010(i_6_, 14434);
			if (itemdefinition.maleWornModelId1 >= 0 || itemdefinition.femaleWornModelId1 >= 0) {
				is[i++] = i_6_;
			}
		}
		Node_Sub28.anIntArray7329 = new int[i];
		if (b != -110) {
			aClass318_93 = null;
		}
		for (int i_7_ = 0; i_7_ < i; i_7_++)
			Node_Sub28.anIntArray7329[i_7_] = is[i_7_];
	}
}
