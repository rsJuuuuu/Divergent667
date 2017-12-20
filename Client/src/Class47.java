/* Class47 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class47
{
	static int anInt682;
	static int anInt683;
	private long aLong684 = -1L;
	static int anInt685;
	private Class312 aClass312_686 = new Class312();
	private long aLong687;
	static Class26 aClass26_688 = new Class26();
	static int[] anIntArray689 = new int[1];
	
	private final void method472(BufferedStream buffer, int i) {
		aLong687 = buffer.readLong();
		anInt685++;
		aLong684 = buffer.readLong();
		for (int i_0_ = buffer.readUnsignedByte(); i_0_ != 0; i_0_ = buffer.readUnsignedByte()) {
			Node_Sub36 node_sub36;
			if (i_0_ != 1) {
				if (i_0_ != 4) {
					if ((i_0_ ^ 0xffffffff) == -4) {
						node_sub36 = new Node_Sub36_Sub3();
					} else {
						if (i_0_ != 2) {
							throw new RuntimeException("Unrecognised ClanChannelDelta type in decode()");
						}
						node_sub36 = new Node_Sub36_Sub4();
					}
				} else {
					node_sub36 = new Node_Sub36_Sub2();
				}
			} else {
				node_sub36 = new Node_Sub36_Sub1();
			}
			node_sub36.method2756(buffer, -1);
			aClass312_686.method3625((byte) -54, node_sub36);
		}
		if (i != 17) {
			anIntArray689 = null;
		}
	}
	
	final void method473(Node_Sub43 node_sub43, boolean bool) {
		if (bool != false) {
			aClass312_686 = null;
		}
		anInt682++;
		if (node_sub43.aLong2797 != aLong687 || aLong684 != node_sub43.aLong7537) {
			throw new RuntimeException("ClanChannelDelta.applyToClanChannel(): Credentials do not match! cc.clanHash:" + node_sub43.aLong2797 + " updateNum:" + node_sub43.aLong7537 + " delta.clanHash:" + aLong687 + " updateNum:" + aLong684);
		}
		for (Node_Sub36 node_sub36 = (Node_Sub36) aClass312_686.method3613(65280); node_sub36 != null; node_sub36 = (Node_Sub36) aClass312_686.method3620(16776960))
			node_sub36.method2751(node_sub43, 0);
		node_sub43.aLong7537++;
	}
	
	public static void method474(int i) {
		if (i != 1) {
			method474(120);
		}
		aClass26_688 = null;
		anIntArray689 = null;
	}
	
	static final void method475(int i, int i_1_) {
		anInt683++;
		CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(3, 17, (long) i_1_);
		cachenode_sub2.method2291((byte) 121);
		if (i >= -51) {
			anIntArray689 = null;
		}
	}
	
	Class47(BufferedStream buffer) {
		method472(buffer, 17);
	}
}
