/* Class92 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class92 implements Runnable
{
	static int anInt1229;
	static int anInt1230 = -1;
	volatile boolean aBoolean1231;
	volatile boolean aBoolean1232;
	static CacheNode_Sub11 aCacheNode_Sub11_1233;
	volatile Class42[] aClass42Array1234 = new Class42[2];
	static int anInt1235 = -1;
	static int anInt1236;
	protected SignLink aSignLink1237;
	
	public final void run() {
		anInt1236++;
		aBoolean1232 = true;
		try {
			while (!aBoolean1231) {
				for (int i = 0; i < 2; i++) {
					Class42 class42 = aClass42Array1234[i];
					if (class42 != null) {
						class42.method453((byte) -105);
					}
				}
				Class262_Sub22.method3208(10L, false);
				ObjectDefinition.method3049(aSignLink1237, null, (byte) 93);
			}
		} catch (Exception exception) {
			ClanChat.method507(exception, null, -115);
		} finally {
			aBoolean1232 = false;
		}
	}
	
	public static void method1037(int i) {
		aCacheNode_Sub11_1233 = null;
		if (i != -29003) {
			aCacheNode_Sub11_1233 = null;
		}
	}
	
	Class92() {
		aBoolean1231 = false;
		aBoolean1232 = false;
	}
}
