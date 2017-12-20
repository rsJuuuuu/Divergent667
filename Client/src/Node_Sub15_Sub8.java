/* Node_Sub15_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub15_Sub8 extends Node_Sub15
{
	static int anInt9829;
	static int anInt9830;
	private int anInt9831 = -1;
	static int anInt9832;
	
	final void method2556(ClanChat clanchat, int i) {
		anInt9830++;
		clanchat.method496(anInt9831, i ^ i);
	}
	
	final void method2554(int i, BufferedStream buffer) {
		anInt9831 = buffer.readUnsignedShort();
		anInt9829++;
		if (i != 29147) {
			method2575(109, -92, 120);
		}
	}
	
	static final void method2575(int i, int i_0_, int i_1_) {
		anInt9832++;
		if (Class44.aGraphicsToolkit668 != null) {
			int i_2_ = Class117.anInt1479;
			if (i_1_ >= 82) {
				int i_3_ = Class290_Sub11.anInt8181;
				Class105.method1119(i, i_0_, 104);
				if ((Class320_Sub20.anInt8397 ^ 0xffffffff) == -1) {
					Node_Sub15_Sub9.anInterface6_9843 = null;
					Node_Sub15_Sub9.anInterface6_9843 = Class44.aGraphicsToolkit668.a(Class44.aGraphicsToolkit668.a(CacheNode_Sub15.anInt9589, Class303.anInt3831), Class44.aGraphicsToolkit668.d(CacheNode_Sub15.anInt9589, Class303.anInt3831));
				} else if ((Class320_Sub20.anInt8397 ^ 0xffffffff) == -2 && (Class352.anInterface6Array4332 == null || (i_2_ ^ 0xffffffff) != (Class117.anInt1479 ^ 0xffffffff) || (i_3_ ^ 0xffffffff) != (Class290_Sub11.anInt8181 ^ 0xffffffff))) {
					Class352.anInterface6Array4332 = new Interface6[Class117.anInt1479 * Class290_Sub11.anInt8181];
					for (int i_4_ = 0; i_4_ < Class352.anInterface6Array4332.length; i_4_++)
						Class352.anInterface6Array4332[i_4_] = Class44.aGraphicsToolkit668.a(Class44.aGraphicsToolkit668.a(StandardSprite.anInt8946, aa_Sub3.anInt5493), Class44.aGraphicsToolkit668.d(StandardSprite.anInt8946, aa_Sub3.anInt5493));
					Class225.anInt2675 = 1;
					Class290_Sub4.anIntArray8102 = new int[Class117.anInt1479 * Class290_Sub11.anInt8181];
				}
				Class194_Sub1.aBoolean6892 = true;
			}
		}
	}
	
	Node_Sub15_Sub8() {
		/* empty */
	}
}
