/* EntityNode_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class EntityNode_Sub3_Sub1 extends EntityNode_Sub3
{
	protected String aString9156;
	static String[] aStringArray9157 = new String[200];
	static int anInt9158;
	static OutcommingPacket aClass318_9159;
	static int anInt9160;
	static int[] anIntArray9161;
	protected int anInt9162 = (int) (Class313.method3650(false) / 1000L);
	static int anInt9163 = 0;
	protected short aShort9164;
	static short[] aShortArray9165;
	static Class86 aClass86_9166;
	
	public static void method942(boolean bool) {
		if (bool != false) {
			anInt9163 = 37;
		}
		aClass86_9166 = null;
		anIntArray9161 = null;
		aShortArray9165 = null;
		aStringArray9157 = null;
		aClass318_9159 = null;
	}
	
	static final String method943(byte b, int i) {
		if (b >= -11) {
			method943((byte) 88, -59);
		}
		anInt9158++;
		return String.valueOf(0xff & i >> 24) + "." + (0xff & i >> 16) + "." + (0xff & i >> 8) + "." + (0xff & i);
	}
	
	EntityNode_Sub3_Sub1(String string, int i) {
		aString9156 = string;
		aShort9164 = (short) i;
	}
	
	static final void method944(int i) {
		if (i != -7733) {
			method943((byte) -114, 116);
		}
		anInt9160++;
		if (Class243.aClass340_3069 != null) {
			Class243.aClass340_3069.method3952(100);
		}
		if (Class132.aThread1677 != null) {
			for (;;) {
				try {
					Class132.aThread1677.join();
					break;
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
			}
		}
	}
	
	static {
		aClass318_9159 = new OutcommingPacket(42, 17);
		aShortArray9165 = new short[256];
	}
}
