/* Class102 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.datatransfer.Clipboard;

public class Class102
{
	static OutcommingPacket aClass318_1314 = new OutcommingPacket(21, 15);
	static Clipboard aClipboard1315;
	static int anInt1316;
	
	public static void method1096(int i) {
		if (i != 15) {
			method1096(17);
		}
		aClipboard1315 = null;
		aClass318_1314 = null;
	}
	
	static final void method1097(int i, int i_0_, int i_1_, int i_2_, int i_3_, byte b) {
		anInt1316++;
		if (b <= 81) {
			aClass318_1314 = null;
		}
		Class369.method4086(i_2_, i_1_, i_3_, Class169_Sub4.anIntArrayArray8826[i_0_++], 0);
		Class369.method4086(i_2_, i_1_, i_3_, Class169_Sub4.anIntArrayArray8826[i--], 0);
		for (int i_4_ = i_0_; (i ^ 0xffffffff) <= (i_4_ ^ 0xffffffff); i_4_++) {
			int[] is = Class169_Sub4.anIntArrayArray8826[i_4_];
			is[i_3_] = is[i_2_] = i_1_;
		}
	}
}
