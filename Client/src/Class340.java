/* Class340 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class340 implements Runnable
{
	private boolean aBoolean4206;
	static int anInt4207;
	static int anInt4208;
	static int anInt4209;
	static int anInt4210;
	static int anInt4211;
	static int anInt4212;
	static int anInt4213;
	private volatile boolean aBoolean4214;
	static int anInt4215;
	private Interface16 anInterface16_4216 = new Class350();
	static int anInt4217 = -1;
	static int anInt4218;
	static int anInt4219;
	static int anInt4220;
	static int anInt4221;
	private long aLong4222;
	private Class110 aClass110_4223;
	static int anInt4224;
	private long aLong4225;
	static int anInt4226;
	private String aString4227;
	private Interface16 anInterface16_4228 = null;
	private int anInt4229;
	private int anInt4230;
	
	final Class110 method3949(boolean bool) {
		if (bool != false) {
			method3954(-61, null, null, 84, 34L);
		}
		anInt4208++;
		return aClass110_4223;
	}
	
	final long method3950(byte b) {
		if (b < 37) {
			anInterface16_4228 = null;
		}
		anInt4211++;
		return aLong4225;
	}
	
	final synchronized void method3951(byte b) {
		aBoolean4206 = true;
		anInt4212++;
		if (b != 66) {
			method3951((byte) -109);
		}
	}
	
	final void method3952(int i) {
		if (i == 100) {
			anInt4224++;
			aBoolean4214 = true;
		}
	}
	
	final synchronized void method3953(byte b, Interface16 interface16) {
		anInt4207++;
		anInterface16_4228 = anInterface16_4216;
		anInterface16_4216 = interface16;
		if (b <= -42) {
			aLong4222 = Class313.method3650(false);
		}
	}
	
	final synchronized void method3954(int i, String string, Class110 class110, int i_0_, long l) {
		anInt4230 = i;
		aClass110_4223 = class110;
		aLong4225 = l;
		aString4227 = string;
		int i_1_ = -111 / ((i_0_ - -2) / 49);
		anInt4210++;
	}
	
	final int method3955(int i) {
		anInt4221++;
		if (aClass110_4223 == null) {
			return 0;
		}
		if (i != 7398) {
			anInt4229 = -104;
		}
		int i_2_ = aClass110_4223.method1130(-3);
		if (aClass110_4223.aBoolean1393 && (aClass110_4223.loadPercentage ^ 0xffffffff) < (anInt4230 ^ 0xffffffff)) {
			return 1 + anInt4230;
		}
		if ((i_2_ ^ 0xffffffff) > -1 || (i_2_ ^ 0xffffffff) <= (Node_Sub25_Sub4.aClass110Array10006.length + -1 ^ 0xffffffff)) {
			return 100;
		}
		if ((anInt4230 ^ 0xffffffff) == (aClass110_4223.anInt1383 ^ 0xffffffff)) {
			return aClass110_4223.loadPercentage;
		}
		return aClass110_4223.anInt1383;
	}
	
	final synchronized boolean method3956(int i) {
		anInt4226++;
		int i_3_ = -96 % ((-17 - i) / 60);
		return anInterface16_4216.method61(false, aLong4222);
	}
	
	final String method3957(byte b) {
		if (b < 23) {
			method3949(false);
		}
		anInt4219++;
		return aString4227;
	}
	
	final int method3958(byte b) {
		anInt4213++;
		if (b != 84) {
			method3959(79);
		}
		return anInt4230;
	}
	
	public final void run() {
		while (!aBoolean4214) {
			long l = Class313.method3650(false);
			synchronized (this) {
				try {
					anInt4229++;
					if (!(anInterface16_4216 instanceof Class350)) {
						long l_4_ = Class313.method3650(false);
						if (Class93.aGraphicsToolkit1241 != null && anInterface16_4228 != null && anInterface16_4228.method60(66) != 0 && (aLong4222 ^ 0xffffffffffffffffL) <= (-(long) anInterface16_4228.method60(36) + l_4_ ^ 0xffffffffffffffffL)) {
							int i = (int) ((-aLong4222 + l_4_) * 255L / (long) anInterface16_4228.method60(124));
							int i_5_ = -i + 255;
							Node_Sub36_Sub1.method2758(-90);
							i_5_ = i_5_ << 24 | 0xffffff;
							i = 0xffffff | i << 24;
							Class93.aGraphicsToolkit1241.GA(0);
							GLSprite glsprite = Class93.aGraphicsToolkit1241.a(Class360.screenWidth, Class205.screenHeight, true);
							Class93.aGraphicsToolkit1241.method1245(glsprite, -1);
							anInterface16_4228.method63(true, (byte) -95);
							Class93.aGraphicsToolkit1241.v();
							glsprite.method1191(0, 0, 0, i_5_, 1);
							Class93.aGraphicsToolkit1241.method1245(glsprite, -1);
							Class93.aGraphicsToolkit1241.GA(0);
							anInterface16_4216.method63(true, (byte) -63);
							Class93.aGraphicsToolkit1241.v();
							glsprite.method1191(0, 0, 0, i, 1);
						} else {
							if (anInterface16_4228 != null) {
								aBoolean4206 = true;
								anInterface16_4228.method59(6312);
								anInterface16_4228 = null;
							}
							if (aBoolean4206) {
								Node_Sub36_Sub1.method2758(-35);
								if (Class93.aGraphicsToolkit1241 != null) {
									Class93.aGraphicsToolkit1241.GA(0);
								}
							}
							anInterface16_4216.method63(aBoolean4206 || Class93.aGraphicsToolkit1241 != null && Class93.aGraphicsToolkit1241.B(), (byte) -123);
						}
						try {
							if (Class93.aGraphicsToolkit1241 != null && !(anInterface16_4216 instanceof Class350)) {
								Class93.aGraphicsToolkit1241.method1241(19088);
							}
						} catch (Exception_Sub1 exception_sub1) {
							ClanChat.method507(exception_sub1, exception_sub1.getMessage() + " (Recovered) " + Class158.aClient1983.method100(10), -108);
							Class22.method300(0, true, true);
						}
					} else {
						anInterface16_4216.method63(aBoolean4206, (byte) -113);
					}
					java.awt.Container container;
					if (Node_Sub29.aFrame7344 == null) {
						if (Class96.anApplet1270 != null) {
							container = Class96.anApplet1270;
						} else {
							container = Class82.aGameStub1123;
						}
					} else {
						container = Node_Sub29.aFrame7344;
					}
					container.getSize();
					container.getSize();
					if (container == Node_Sub29.aFrame7344) {
						Node_Sub29.aFrame7344.getInsets();
					}
					aBoolean4206 = false;
					if (Class93.aGraphicsToolkit1241 != null && !(anInterface16_4216 instanceof Class350) && aClass110_4223.method1130(-3) < Class110.aClass110_1409.method1130(-3)) {
						Npc.method880((byte) 11);
					}
				} catch (Exception exception) {
					continue;
				}
			}
			long l_6_ = Class313.method3650(false);
			int i = (int) (20L + (l + -l_6_));
			if ((i ^ 0xffffffff) < -1) {
				Class262_Sub22.method3208((long) i, false);
			}
		}
		anInt4215++;
	}
	
	final int method3959(int i) {
		if (i != 255) {
			method3952(0);
		}
		anInt4218++;
		return anInt4229;
	}
}
