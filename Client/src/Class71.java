/* Class71 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Hashtable;

public class Class71
{
	private Index aClass302_951;
	static int anInt952;
	static int anInt953;
	static int anInt954;
	static int anInt955;
	protected int anInt956;
	static int anInt957;
	static Hashtable aHashtable958 = new Hashtable();
	static int anInt959;
	private Class61 aClass61_960 = new Class61(64);
	protected int anInt961 = 0;
	static IncommingPacket aClass192_962 = new IncommingPacket(11, 3);
	static IncommingPacket aClass192_963 = new IncommingPacket(24, -1);
	static OutcommingPacket aClass318_964 = new OutcommingPacket(7, -1);
	static Class251 aClass251_965 = new Class251(1);
	static int anInt966 = 1;
	static boolean aBoolean967 = false;
	
	final void method740(byte b) {
		synchronized (aClass61_960) {
			if (b > -49) {
				method745(31);
			}
			aClass61_960.method608(false);
		}
		anInt953++;
	}
	
	static final boolean method741(int i, int i_0_, int i_1_) {
		anInt957++;
		if (i_0_ != -23003) {
			return false;
		}
        return (i_1_ & 0xc580 ^ 0xffffffff) != -1;
    }
	
	final void method742(int i) {
		if (i >= -43) {
			aClass318_964 = null;
		}
		synchronized (aClass61_960) {
			aClass61_960.method602((byte) -127);
		}
		anInt952++;
	}
	
	final Class289 method743(int i, byte b) {
		if (b < 26) {
			method746(83, 27);
		}
		anInt954++;
		Class289 class289;
		synchronized (aClass61_960) {
			class289 = (Class289) aClass61_960.method607((long) i, 0);
		}
		if (class289 != null) {
			return class289;
		}
		byte[] bs;
		synchronized (aClass302_951) {
			bs = aClass302_951.method3524(false, i, 4);
		}
		class289 = new Class289();
		class289.aClass71_3635 = this;
		class289.anInt3637 = i;
		if (bs != null) {
			class289.method3408((byte) -95, new BufferedStream(bs));
		}
		class289.method3406(-13163);
		synchronized (aClass61_960) {
			aClass61_960.method601(class289, 25566, (long) i);
		}
		return class289;
	}
	
	public static void method744(int i) {
		aHashtable958 = null;
		aClass318_964 = null;
		aClass251_965 = null;
		aClass192_963 = null;
		aClass192_962 = null;
		if (i != -14980) {
			method744(15);
		}
	}
	
	static final void method745(int i) {
		Node_Sub46.aFont7555 = null;
		if (i != 22732) {
			method741(15, -78, 20);
		}
		anInt959++;
		Class54.anImage813 = null;
	}
	
	final void method746(int i, int i_2_) {
		synchronized (aClass61_960) {
			if (i_2_ != -3452) {
				return;
			}
			aClass61_960.method598(i, -11819);
		}
		anInt955++;
	}
	
	Class71(Class353 class353, int i, Index class302) {
		aClass302_951 = class302;
		anInt956 = aClass302_951.method3537(-2, 4);
	}
}
