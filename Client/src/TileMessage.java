/* EntityNode_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class TileMessage extends EntityNode
{
	protected int completeCycle;
	protected int y;
	static int anInt5949;
	protected int height;
	protected int anInt5951;
	static IncommingPacket aClass192_5952 = new IncommingPacket(74, 11);
	protected String message;
	static IncommingPacket aClass192_5954 = new IncommingPacket(39, 6);
	protected int plane;
	static IncommingPacket aClass192_5956 = new IncommingPacket(132, -2);
	protected int x;
	static IncommingPacket aClass192_5958 = new IncommingPacket(15, 0);
	
	public static void method935(int i) {
		aClass192_5952 = null;
		if (i == -7576) {
			aClass192_5958 = null;
			aClass192_5954 = null;
			aClass192_5956 = null;
		}
	}
	
	static final long method936(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, byte b) {
		anInt5949++;
		Class141.aCalendar1754.clear();
		Class141.aCalendar1754.set(i_1_, i, i_3_, i_4_, i_2_, i_0_);
		if (b <= 71) {
			return -52L;
		}
		return Class141.aCalendar1754.getTime().getTime();
	}
}
