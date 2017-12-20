/* Class138 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class138
{
	static int anInt1718;
	static int anInt1719;
	protected int anInt1720;
	protected int anInt1721;
	protected int anInt1722;
	protected int anInt1723;
	static int anInt1724 = 0;
	private byte aByte1725;
	static int anInt1726;
	static int anInt1727;
	static int anInt1728;
	protected int anInt1729;
	
	final int method1601(boolean bool) {
		if (bool != false) {
			return 15;
		}
		anInt1718++;
		if ((aByte1725 & 0x8) == 8) {
			return 1;
		}
		return 0;
	}
	
	final int method1602(int i) {
		if (i != 28771) {
			return 18;
		}
		anInt1727++;
		return 0x7 & aByte1725;
	}
	
	static final boolean method1603(byte b, int i, int i_0_) {
		anInt1728++;
		if (!Class213.aBoolean2510) {
			return false;
		}
		int i_1_ = i >> 16;
		if (b <= 68) {
			anInt1726 = 54;
		}
		int i_2_ = 0xffff & i;
		if (Class134_Sub3.aWidgetArrayArray9035[i_1_] == null || Class134_Sub3.aWidgetArrayArray9035[i_1_][i_2_] == null) {
			return false;
		}
		IComponentDefinitions widget = Class134_Sub3.aWidgetArrayArray9035[i_1_][i_2_];
		if (i_0_ != -1 || widget.type != 0) {
			for (CacheNode_Sub13 cachenode_sub13 = (CacheNode_Sub13) Class368.aClass312_4549.method3613(65280); cachenode_sub13 != null; cachenode_sub13 = (CacheNode_Sub13) Class368.aClass312_4549.method3620(16776960)) {
				if (cachenode_sub13.anInt9568 == i_0_ && widget.ihash == cachenode_sub13.anInt9561 && (cachenode_sub13.anInt9562 == 18 || (cachenode_sub13.anInt9562 ^ 0xffffffff) == -1003 || (cachenode_sub13.anInt9562 ^ 0xffffffff) == -13 || cachenode_sub13.anInt9562 == 20 || cachenode_sub13.anInt9562 == 10)) {
					return true;
				}
			}
		} else {
			for (CacheNode_Sub13 cachenode_sub13 = (CacheNode_Sub13) Class368.aClass312_4549.method3613(65280); cachenode_sub13 != null; cachenode_sub13 = (CacheNode_Sub13) Class368.aClass312_4549.method3620(16776960)) {
				if ((cachenode_sub13.anInt9562 ^ 0xffffffff) == -19 || (cachenode_sub13.anInt9562 ^ 0xffffffff) == -1003 || (cachenode_sub13.anInt9562 ^ 0xffffffff) == -13 || cachenode_sub13.anInt9562 == 20 || cachenode_sub13.anInt9562 == 10) {
					for (IComponentDefinitions widget_3_ = Class76.method771((byte) 107, cachenode_sub13.anInt9561); widget_3_ != null; widget_3_ = Class295.method3468((byte) -120, widget_3_)) {
						if (widget_3_.ihash == widget.ihash) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	
	static final boolean method1604(int i, int i_4_, int i_5_) {
		if (i_5_ != 0) {
			anInt1724 = -101;
		}
		anInt1719++;
        return !(!(Node_Sub38_Sub26.method2877(i_4_, i, 90) | (i & 0x70000) != 0) && !Class262_Sub15_Sub1.method3192(i_4_, i, 512));
    }
	
	public Class138() {
		/* empty */
	}
	
	Class138(BufferedStream buffer) {
		aByte1725 = buffer.readByte();
		anInt1721 = buffer.readUnsignedShort();
		anInt1729 = buffer.readInt();
		anInt1722 = buffer.readInt();
		anInt1723 = buffer.readInt();
		anInt1720 = buffer.readInt();
	}
}
