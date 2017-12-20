/* Node_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub13 extends Node
{
	static int anInt7107 = 0;
	static int anInt7108;
	protected OutcommingPacket aClass318_7109;
	protected int anInt7110;
	static int anInt7111;
	static int anInt7112;
	protected Packet aPacket7113;
	protected int anInt7114;
	static int anInt7115;
	static int anInt7116;
	
	static final int method2546(int i, int i_0_, int i_1_) {
		if (i_0_ != -1) {
			method2548(false, null);
		}
		anInt7112++;
		int i_2_ = 0;
		while ((i ^ 0xffffffff) < -1) {
			i_2_ = 0x1 & i_1_ | i_2_ << 1;
			i--;
			i_1_ >>>= 1;
		}
		return i_2_;
	}
	
	final void method2547(boolean bool) {
		anInt7111++;
		if (Class45.anInt5270 < Node_Sub30.aNode_Sub13Array7362.length) {
			Node_Sub30.aNode_Sub13Array7362[Class45.anInt5270++] = this;
			if (bool != false) {
				method2547(true);
			}
		}
	}
	
	static final boolean method2548(boolean bool, Class329 class329) {
		anInt7115++;
		if (bool != false) {
			return false;
		}
        return !(Class189_Sub1.aClass329_6887 != class329 && class329 != Class379.aClass329_4873 && class329 != Class229.aClass329_2730 && class329 != CacheNode_Sub11.aClass329_9538 && class329 != Class362.aClass329_4498);
    }
	
	static final void method2549(int i, int i_3_, int i_4_, int i_5_, boolean bool, int i_6_, int i_7_, int i_8_) {
		if (((bool ? Class213.aNode_Sub27_2512.aClass320_Sub25_7276.method3776(false) : Class213.aNode_Sub27_2512.aClass320_Sub25_7295.method3776(false)) ^ 0xffffffff) != -1 && (i ^ 0xffffffff) != -1 && (Class23.anInt434 ^ 0xffffffff) > -51 && i_8_ != -1) {
			Node_Sub38_Sub19.aClass78Array10284[Class23.anInt434++] = new Class78(!bool ? (byte) 2 : (byte) 3, i_8_, i, i_3_, i_7_, i_4_, i_6_, null);
		}
		if (i_5_ == -620649727) {
			anInt7108++;
		}
	}
	
	Node_Sub13() {
		/* empty */
	}
}
