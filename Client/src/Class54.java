/* Class54 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Image;

public class Class54
{
	protected short[] aShortArray809;
	protected int[] anIntArray810;
	protected short[] aShortArray811;
	protected short[] aShortArray812;
	static Image anImage813;
	protected int[] anIntArray814;
	protected short aShort815;
	static int[] LocalNPCsIndexes = new int[1024];
	static boolean aBoolean817 = false;
	protected short aShort818;
	protected short aShort819;
	protected int[] anIntArray820 = new int[4];
	protected short aShort821;
	protected byte aByte822;
	static Class56 aClass56_823 = new Class56();
	protected byte aByte824;
	
	public static void method557(boolean bool) {
		anImage813 = null;
		LocalNPCsIndexes = null;
		aClass56_823 = null;
		if (bool != true) {
			LocalNPCsIndexes = null;
		}
	}
	
	Class54(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		aByte824 = (byte) i_0_;
		aByte822 = (byte) i;
		anIntArray814 = new int[4];
		anIntArray810 = new int[4];
		anIntArray810[3] = i_4_;
		anIntArray810[0] = i_1_;
		anIntArray810[2] = i_3_;
		anIntArray810[1] = i_2_;
		anIntArray814[3] = i_8_;
		anIntArray814[0] = i_5_;
		anIntArray814[2] = i_7_;
		anIntArray814[1] = i_6_;
		anIntArray820[0] = i_9_;
		anIntArray820[2] = i_11_;
		anIntArray820[1] = i_10_;
		aShort821 = (short) (i_1_ >> Class36.anInt549);
		anIntArray820[3] = i_12_;
		aShort818 = (short) (i_3_ >> Class36.anInt549);
		aShort815 = (short) (i_9_ >> Class36.anInt549);
		aShortArray809 = new short[4];
		aShort819 = (short) (i_11_ >> Class36.anInt549);
		aShortArray811 = new short[4];
		aShortArray812 = new short[4];
	}
}
