/* Class141 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Calendar;
import java.util.TimeZone;

public class Class141 implements Runnable
{
	static int anInt1742;
	static int anInt1743;
	static int anInt1744;
	private Class158 aClass158_1745 = new Class158();
	static int anInt1746;
	static int anInt1747;
	static float aFloat1748;
	static int anInt1749;
	static int[] anIntArray1750 = new int[32];
	static int anInt1751;
	private Thread aThread1752;
	protected int anInt1753 = 0;
	static Calendar aCalendar1754;
	static int[][] anIntArrayArray1755;
	static Calendar aCalendar1756;
	private boolean aBoolean1757 = false;
	static int anInt1758;
	
	final CacheNode_Sub16_Sub2 method1612(MainFile class6, int i, boolean bool) {
		anInt1743++;
		CacheNode_Sub16_Sub2 cachenode_sub16_sub2 = new CacheNode_Sub16_Sub2();
		cachenode_sub16_sub2.anInt11080 = 1;
		synchronized (aClass158_1745) {
			for (CacheNode_Sub16_Sub2 cachenode_sub16_sub2_0_ = (CacheNode_Sub16_Sub2) aClass158_1745.method1723(13); cachenode_sub16_sub2_0_ != null; cachenode_sub16_sub2_0_ = (CacheNode_Sub16_Sub2) aClass158_1745.method1721(0)) {
				if ((cachenode_sub16_sub2_0_.aLong7037 ^ 0xffffffffffffffffL) == ((long) i ^ 0xffffffffffffffffL) && cachenode_sub16_sub2_0_.aClass6_11081 == class6 && cachenode_sub16_sub2_0_.anInt11080 == 2) {
					cachenode_sub16_sub2.aBoolean9602 = false;
					cachenode_sub16_sub2.aByteArray11086 = cachenode_sub16_sub2_0_.aByteArray11086;
					return cachenode_sub16_sub2;
				}
			}
		}
		cachenode_sub16_sub2.aByteArray11086 = class6.method177(i, 512);
		cachenode_sub16_sub2.aBoolean9598 = bool;
		cachenode_sub16_sub2.aBoolean9602 = false;
		return cachenode_sub16_sub2;
	}
	
	final void method1613(int i) {
		aBoolean1757 = true;
		anInt1744++;
		synchronized (aClass158_1745) {
			aClass158_1745.notifyAll();
		}
		try {
			aThread1752.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
		aThread1752 = null;
		if (i >= -44) {
			anIntArray1750 = null;
		}
	}
	
	private final void method1614(int i, CacheNode_Sub16_Sub2 cachenode_sub16_sub2) {
		anInt1742++;
		synchronized (aClass158_1745) {
			aClass158_1745.method1719(true, cachenode_sub16_sub2);
			if (i != 0) {
				/* empty */
			} else {
				anInt1753++;
				aClass158_1745.notifyAll();
			}
		}
	}
	
	public final void run() {
		anInt1751++;
		while (!aBoolean1757) {
			CacheNode_Sub16_Sub2 cachenode_sub16_sub2;
			synchronized (aClass158_1745) {
				cachenode_sub16_sub2 = (CacheNode_Sub16_Sub2) aClass158_1745.method1717(-123);
				if (cachenode_sub16_sub2 == null) {
					try {
						aClass158_1745.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
					continue;
				}
				anInt1753--;
			}
			try {
				if ((cachenode_sub16_sub2.anInt11080 ^ 0xffffffff) == -3) {
					cachenode_sub16_sub2.aClass6_11081.method176(cachenode_sub16_sub2.aByteArray11086.length, cachenode_sub16_sub2.aByteArray11086, (int) cachenode_sub16_sub2.aLong7037, true);
				} else if ((cachenode_sub16_sub2.anInt11080 ^ 0xffffffff) == -4) {
					cachenode_sub16_sub2.aByteArray11086 = cachenode_sub16_sub2.aClass6_11081.method177((int) cachenode_sub16_sub2.aLong7037, 512);
				}
			} catch (Exception exception) {
				ClanChat.method507(exception, null, -128);
			}
			cachenode_sub16_sub2.aBoolean9602 = false;
		}
	}
	
	static final Class16 method1615(BufferedStream buffer, boolean bool) {
		anInt1746++;
		if (bool != true) {
			method1618(true);
		}
		Class16 class16 = new Class16();
		class16.anInt231 = buffer.readUnsignedShort();
		class16.aCacheNode_Sub10_229 = Node_Sub36_Sub1.aClass109_10035.method1128(class16.anInt231, !bool);
		return class16;
	}
	
	final CacheNode_Sub16_Sub2 method1616(byte b, byte[] bs, int i, MainFile class6) {
		anInt1747++;
		CacheNode_Sub16_Sub2 cachenode_sub16_sub2 = new CacheNode_Sub16_Sub2();
		cachenode_sub16_sub2.aLong7037 = (long) i;
		cachenode_sub16_sub2.anInt11080 = 2;
		cachenode_sub16_sub2.aByteArray11086 = bs;
		cachenode_sub16_sub2.aClass6_11081 = class6;
		cachenode_sub16_sub2.aBoolean9598 = false;
		method1614(0, cachenode_sub16_sub2);
		if (b != -124) {
			return null;
		}
		return cachenode_sub16_sub2;
	}
	
	final CacheNode_Sub16_Sub2 method1617(MainFile class6, int i, int i_1_) {
		anInt1749++;
		CacheNode_Sub16_Sub2 cachenode_sub16_sub2 = new CacheNode_Sub16_Sub2();
		cachenode_sub16_sub2.aClass6_11081 = class6;
		cachenode_sub16_sub2.aBoolean9598 = false;
		cachenode_sub16_sub2.anInt11080 = 3;
		if (i != 13006) {
			aClass158_1745 = null;
		}
		cachenode_sub16_sub2.aLong7037 = (long) i_1_;
		method1614(0, cachenode_sub16_sub2);
		return cachenode_sub16_sub2;
	}
	
	public static void method1618(boolean bool) {
		if (bool != true) {
			method1618(true);
		}
		aCalendar1754 = null;
		anIntArray1750 = null;
		aCalendar1756 = null;
		anIntArrayArray1755 = null;
	}
	
	Class141(SignLink signlink) {
		Class241 class241 = signlink.method3641((byte) 50, this, 5);
		while (class241.anInt2953 == 0)
			Class262_Sub22.method3208(10L, false);
		if (class241.anInt2953 == 2) {
			throw new RuntimeException();
		}
		aThread1752 = (Thread) class241.anObject2956;
	}
	
	static {
		int i = 2;
		for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > -33; i_2_++) {
			anIntArray1750[i_2_] = -1 + i;
			i += i;
		}
		anIntArrayArray1755 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };
		aCalendar1756 = Calendar.getInstance();
		aCalendar1754 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		anInt1758 = 0;
	}
}
