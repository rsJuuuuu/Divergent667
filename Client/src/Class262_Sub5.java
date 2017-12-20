/* Class262_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class262_Sub5 extends Class262
{
	static Class199[] aClass199Array7732;
	private String aString7733;
	static int anInt7734;
	private int anInt7735;
	private int anInt7736;
	static int anInt7737;
	static int anInt7738;
	static int anInt7739 = 0;
	private int anInt7740;
	private int anInt7741;
	
	public static void method3162(int i) {
		if (i != 0) {
			aClass199Array7732 = null;
		}
		aClass199Array7732 = null;
	}
	
	static final boolean method3163(String string, boolean bool) {
		if (bool != false) {
			anInt7737 = -72;
		}
		anInt7738++;
		return Class71.aHashtable958.containsKey(string);
	}
	
	Class262_Sub5(BufferedStream buffer) {
		super(buffer);
		anInt7740 = buffer.readUnsignedShort();
		anInt7735 = buffer.readUnsignedShort();
		aString7733 = buffer.readString();
		anInt7741 = buffer.readInt();
		anInt7736 = buffer.readUnsignedShort();
	}
	
	final void method3148(int i) {
		//message on tile
		r.sendMessageOnTile(-22840, CacheNode_Sub20_Sub1.myPlayerPlane, anInt7736, aString7733, anInt7741, Node_Sub38_Sub7.method2809(CacheNode_Sub20_Sub1.myPlayerPlane, -29754, anInt7735, anInt7740), anInt7740, anInt7735);
		if (i <= -102) {
			anInt7734++;
		}
	}
}
