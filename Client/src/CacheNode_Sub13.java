/* CacheNode_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CacheNode_Sub13 extends CacheNode
{
	protected String aString9558;
	static int anInt9559;
	protected String aString9560;
	protected int anInt9561;
	protected int anInt9562;
	protected long aLong9563;
	protected long aLong9564;
	protected String aString9565;
	static int anInt9566;
	protected boolean aBoolean9567;
	protected int anInt9568;
	protected int anInt9569;
	protected int anInt9570;
	protected boolean aBoolean9571;
	protected boolean aBoolean9572;
	
	static final int method2344(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		anInt9559++;
		int i_4_ = i_0_ & 0xf;
		if (i_2_ <= 2) {
			return 92;
		}
		int i_5_ = (i_4_ ^ 0xffffffff) <= -9 ? i_3_ : i_1_;
		int i_6_ = (i_4_ ^ 0xffffffff) > -5 ? i_3_ : (i_4_ ^ 0xffffffff) != -13 && (i_4_ ^ 0xffffffff) != -15 ? i : i_1_;
		return ((i_4_ & 0x1) != 0 ? -i_5_ : i_5_) - -((0x2 & i_4_) != 0 ? -i_6_ : i_6_);
	}
	
	static final void method2345(int i, int i_7_, boolean bool) {
		if (i_7_ > -84) {
			method2344(-36, -111, 123, -85, -62);
		}
		anInt9566++;
		CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(3, 21, (long) i);
		cachenode_sub2.method2288(0);
		cachenode_sub2.anInt9434 = !bool ? 0 : 1;
	}
	
	CacheNode_Sub13(String string, String string_8_, int i, int i_9_, int i_10_, long l, int i_11_, int i_12_, boolean bool, boolean bool_13_, long l_14_, boolean bool_15_) {
		aLong9563 = l;
		aBoolean9571 = bool;
		anInt9570 = i;
		anInt9569 = i_10_;
		anInt9561 = i_12_;
		anInt9562 = i_9_;
		aString9560 = string;
		aLong9564 = l_14_;
		aString9558 = string_8_;
		anInt9568 = i_11_;
		aBoolean9572 = bool_13_;
		aBoolean9567 = bool_15_;
	}
}
