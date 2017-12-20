/* CacheNode - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class CacheNode extends Node
{
	static int anInt7033;
	static int anInt7034;
	protected CacheNode aCacheNode7035;
	protected CacheNode aCacheNode7036;
	protected long aLong7037;
	protected int index;
	protected int archiveId;
	
	static IncommingPacket aClass192_7038 = new IncommingPacket(76, 9);
	static int anInt7039;
	static int anInt7040;
	static int anInt7041;
	
	final void method2275(int i) {
		anInt7034++;
		if (aCacheNode7036 != null) {
			aCacheNode7036.aCacheNode7035 = aCacheNode7035;
			aCacheNode7035.aCacheNode7036 = aCacheNode7036;
			aCacheNode7035 = null;
			aCacheNode7036 = null;
			if (i > -37) {
				anInt7033 = -122;
			}
		}
	}
	
	final boolean method2276(byte b) {
		anInt7041++;
		if (aCacheNode7036 == null) {
			return false;
		}
		if (b < 52) {
			return true;
		}
		return true;
	}
	
	static final void method2277(int i, int i_0_) {
		anInt7039++;
		CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(i ^ 0x1, i, (long) i_0_);
		cachenode_sub2.method2291((byte) 121);
	}
	
	public static void method2278(int i) {
		if (i < 30) {
			anInt7033 = -34;
		}
		aClass192_7038 = null;
	}
	
	public CacheNode() {
		/* empty */
	}
	
	static final void method2279(int i, int i_1_, int i_2_, int i_3_, int i_4_, GraphicsToolkit graphicstoolkit) {
		Class44.aGraphicsToolkit668 = graphicstoolkit;
		anInt7040++;
		Class225.aClass336_2678 = Class44.aGraphicsToolkit668.y();
		Class113.aClass336_1440 = Class44.aGraphicsToolkit668.y();
		Npc.aClass336_11113 = Class44.aGraphicsToolkit668.y();
		Class290_Sub4.anIntArray8102 = null;
		Node_Sub23_Sub1.anInt9929 = i_2_;
		Class372.anInt4600 = i_4_;
		Class352.anInterface6Array4332 = null;
		Class320_Sub20.anInt8397 = 0;
		Node_Sub15_Sub8.method2575(i_1_, i_3_, 122);
		Node_Sub29_Sub1.anInt10012 = i;
		Class368.anInt4550 = -1;
		Class72.anInt973 = -1;
	}
}
