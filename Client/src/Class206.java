/* Class206 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class206
{
	protected int anInt2462;
	static int[] anIntArray2463 = { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };
	static long[] aLongArray2464;
	static int anInt2465;
	static int anInt2466;
	static int anInt2467;
	private Player aPlayer2468;
	private Npc aNpc2469;
	static int anInt2470;
	private int anInt2471;
	protected boolean aBoolean2472 = false;
	
	final void method2034(int i, byte b, int i_0_, int i_1_) {
		if (aNpc2469 == null) {
			aPlayer2468.plane = aPlayer2468.aByte5931 = (byte) i_0_;
			aPlayer2468.method888(i, -117, i_1_);
		} else {
			aNpc2469.method877(-15694, true, i_1_, i, i_0_, aNpc2469.getSize((byte) 44));
		}
		anInt2470++;
	}
	
	final void method2035(byte b) {
		aNpc2469 = null;
		if (b >= -12) {
			method2037(-6);
		}
		aBoolean2472 = false;
		anInt2465++;
		aPlayer2468 = null;
	}
	
	public static void method2036(int i) {
		anIntArray2463 = null;
		aLongArray2464 = null;
	}
	
	final Actor method2037(int i) {
		anInt2466++;
		if (i >= -55) {
			method2034(-42, (byte) -70, -78, 52);
		}
		if (aNpc2469 != null) {
			return aNpc2469;
		}
		return aPlayer2468;
	}
	
	final void method2038(byte b, int i, int i_4_, int i_5_, int i_6_) {
		if (!aBoolean2472) {
			aBoolean2472 = true;
			if (anInt2462 >= 0) {
				aNpc2469 = new Npc(25);
				aNpc2469.anInt10880 = Class174.clientCycle;
				aNpc2469.index = anInt2471;
				aNpc2469.method879(Class366.aClass279_4526.getNPCDefinitions(anInt2462, (byte) 107), true);
				aNpc2469.method861(b ^ ~0x3a4, aNpc2469.aNpcDefinition11122.anInt2811);
				aNpc2469.anInt10890 = aNpc2469.aNpcDefinition11122.anInt2876 << 3;
				aNpc2469.anInt10857 = Class246.anInt3108++;
			} else {
				aPlayer2468 = new Player(25);
				aPlayer2468.decodeAppearance(Mobile.aBuffer9128, 0);
				aPlayer2468.anInt10880 = Class174.clientCycle;
				aPlayer2468.anInt10857 = Class246.anInt3108++;
				aPlayer2468.index = anInt2471;
			}
		}
		if (b == 67) {
			anInt2467++;
			if ((anInt2462 ^ 0xffffffff) > -1) {
				aPlayer2468.plane = aPlayer2468.aByte5931 = (byte) i_4_;
				aPlayer2468.method888(i_5_, -101, i_6_);
				aPlayer2468.method849(i, -78, true);
			} else {
				aNpc2469.method877(-15694, true, i_6_, i_5_, i_4_, aNpc2469.getSize((byte) 71));
				aNpc2469.method849(i, b + -177, true);
			}
		}
	}
	
	Class206(BufferedStream buffer, int i) {
		aNpc2469 = null;
		aPlayer2468 = null;
		anInt2471 = i;
		int i_7_ = buffer.readUnsignedByte();
		int i_8_ = i_7_;
	while_160_:
		do {
			do {
				if ((i_8_ ^ 0xffffffff) != -1) {
					if ((i_8_ ^ 0xffffffff) != -2) {
						break;
					}
				} else {
					anInt2462 = buffer.method2183();
					break while_160_;
				}
				anInt2462 = -1;
				break while_160_;
			} while (false);
			anInt2462 = -1;
		} while (false);
		buffer.readString();
	}
}
