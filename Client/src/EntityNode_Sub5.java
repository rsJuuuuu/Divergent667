/* EntityNode_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class EntityNode_Sub5 extends EntityNode
{
	protected int anInt5982;
	protected int anInt5983;
	protected int anInt5984;
	protected int anInt5985;
	protected int anInt5986;
	protected boolean aBoolean5987 = false;
	
	final boolean method968(int i, int i_0_) {
		if (!aBoolean5987) {
			return false;
		}
		int i_1_ = anInt5982 - anInt5985;
		int i_2_ = anInt5984 - anInt5986;
		int i_3_ = i_1_ * i_1_ + i_2_ * i_2_;
		int i_4_ = i * i_1_ + i_0_ * i_2_ - (anInt5985 * i_1_ + anInt5986 * i_2_);
		if (i_4_ <= 0) {
			int i_5_ = anInt5985 - i;
			int i_6_ = anInt5986 - i_0_;
            return i_5_ * i_5_ + i_6_ * i_6_ < anInt5983 * anInt5983;
        }
		if (i_4_ > i_3_) {
			int i_7_ = anInt5982 - i;
			int i_8_ = anInt5984 - i_0_;
            return i_7_ * i_7_ + i_8_ * i_8_ < anInt5983 * anInt5983;
        }
		i_4_ = (i_4_ << 10) / i_3_;
		int i_9_ = anInt5985 + (i_1_ * i_4_ >> 10) - i;
		int i_10_ = anInt5986 + (i_2_ * i_4_ >> 10) - i_0_;
        return i_9_ * i_9_ + i_10_ * i_10_ < anInt5983 * anInt5983;
    }
}
