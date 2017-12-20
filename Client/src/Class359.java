/* Class359 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class359
{
	static int anInt4456;
	static int anInt4457;
	private Index aClass302_4458;
	private Class61 aClass61_4459 = new Class61(64);
	static int anInt4460;
	static int anInt4461;
	static int anInt4462;
	static OutcommingPacket aClass318_4463 = new OutcommingPacket(50, 3);
	static int anInt4464;
	static int anInt4465;
	static long aLong4466;
	static int anInt4467 = -1;
	static int anInt4468;
	
	public static void method4035(int i) {
		if (i != 17665) {
			anInt4465 = 12;
		}
		aClass318_4463 = null;
	}
	
	static final void method4036(int i) {
		anInt4462++;
		Class252.aClass61_3190.method608(false);
		Class166.aClass61_5097.method608(false);
		Class243.aClass61_3065.method608(false);
		if (i >= 81) {
			NpcDefinition.aClass61_2805.method608(false);
		}
	}
	
	final void method4037(int i) {
		synchronized (aClass61_4459) {
			aClass61_4459.method608(false);
		}
		anInt4457++;
		if (i != 31) {
			aClass318_4463 = null;
		}
	}
	
	final void method4038(int i, int i_0_) {
		anInt4461++;
		synchronized (aClass61_4459) {
			aClass61_4459.method598(i_0_, -11819);
		}
		if (i >= -122) {
			method4037(46);
		}
	}
	
	final Class367 method4039(int i, byte b) {
		if (b != 123) {
			method4035(94);
		}
		anInt4456++;
		Class367 class367;
		synchronized (aClass61_4459) {
			class367 = (Class367) aClass61_4459.method607((long) i, 0);
		}
		if (class367 != null) {
			return class367;
		}
		byte[] bs;
		synchronized (aClass302_4458) {
			bs = aClass302_4458.method3524(false, i, 31);
		}
		class367 = new Class367();
		if (bs != null) {
			class367.method4074(new BufferedStream(bs), 120);
		}
		synchronized (aClass61_4459) {
			aClass61_4459.method601(class367, b + 25443, (long) i);
		}
		return class367;
	}
	
	final void method4040(byte b) {
		synchronized (aClass61_4459) {
			aClass61_4459.method602((byte) -123);
			if (b > -35) {
				method4038(-102, 98);
			}
		}
		anInt4460++;
	}
	
	Class359(Class353 class353, int i, Index class302) {
		aClass302_4458 = class302;
		aClass302_4458.method3537(-2, 31);
	}
}
