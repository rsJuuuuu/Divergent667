/* Class33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class33 implements Runnable
{
	private int anInt519;
	private long aLong520;
	private Class273 aClass273_521;
	private GraphicsToolkit aGraphicsToolkit522;
	private volatile boolean aBoolean523;
	private Node_Sub29[] aNode_Sub29Array524;
	private volatile boolean aBoolean525;
	private int[] anIntArray526 = new int[3];
	private volatile boolean aBoolean527;
	
	public final void run() {
		while (aBoolean523)
			method362();
	}
	
	final void method360() {
		aBoolean525 = false;
		aBoolean523 = false;
		synchronized (this) {
			this.notify();
		}
	}
	
	final boolean method361() {
        return !(aClass273_521 != null && (aBoolean527 || !aClass273_521.method3319(-10968)));
    }
	
	private final void method362() {
		aGraphicsToolkit522.k(anInt519);
		while (!aBoolean525) {
			if (!aBoolean523) {
				break;
			}
			if (aClass273_521 != null && !aClass273_521.method3319(-10968)) {
				aBoolean527 = true;
				EntityNode entitynode = aClass273_521.method3316(true);
				if (entitynode instanceof Animable) {
					Animable animable = (Animable) entitynode;
					if (animable.aBoolean5935) {
						animable.method820(CacheNode_Sub18.aGraphicsToolkit9607, -5);
					} else {
						Class270_Sub2_Sub2.method3309(animable, aNode_Sub29Array524);
						if (Class132.aClass52_1673 != null) {
							Class132.aClass52_1673.method538(animable.anInt5938, animable.anInt5946, aClass273_521.aString3492, -16777216, 1, -256);
						}
					}
				} else {
					int i = ((EntityNode_Sub8) entitynode).anInt6023;
					if (i >= 1 && i <= 4) {
						Plane plane = Class320_Sub10.aPlaneArray8300[i - 1];
						for (int i_0_ = 0; i_0_ < Node_Sub9_Sub1.anInt9656 + Node_Sub9_Sub1.anInt9656; i_0_++) {
							for (int i_1_ = 0; i_1_ < Node_Sub9_Sub1.anInt9656 + Node_Sub9_Sub1.anInt9656; i_1_++) {
								if (Class234.aBooleanArrayArrayArray2790[i - 1][i_0_][i_1_]) {
									int i_2_ = Class216.anInt2551 - Node_Sub9_Sub1.anInt9656 + i_0_;
									int i_3_ = EntityNode_Sub7.anInt6013 - Node_Sub9_Sub1.anInt9656 + i_1_;
									if (i_2_ >= 0 && i_2_ < plane.anInt3408 && i_3_ >= 0 && i_3_ < plane.anInt3404) {
										CacheNode_Sub18.aGraphicsToolkit9607.H(i_2_ << Class36.anInt549, plane.method3251(i_3_, i_2_, (byte) -118), i_3_ << Class36.anInt549, anIntArray526);
										if (Class187.method1879(anIntArray526[0]) == anInt519 - 1) {
											plane.method3257(i_2_, i_3_);
										}
									}
								}
							}
						}
					}
				}
			} else {
				aBoolean527 = false;
				aLong520 = Class146.aClass10_1815.method186(-107);
				synchronized (this) {
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
		}
		aGraphicsToolkit522.c(anInt519);
		while (aBoolean525 && aBoolean523) {
			synchronized (this) {
				try {
					this.wait();
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
			}
		}
	}
	
	final long method363() {
		return aLong520;
	}
	
	final void method364(Class273 class273) {
		if (aClass273_521 != null) {
			aClass273_521.method3320(false, null);
		}
		aClass273_521 = class273;
		if (aClass273_521 != null) {
			aClass273_521.method3320(false, this);
		}
	}
	
	final void method365() {
		aBoolean525 = true;
		synchronized (this) {
			this.notify();
		}
	}
	
	final void method366() {
		aBoolean525 = false;
		synchronized (this) {
			this.notify();
		}
	}
	
	Class33(int i, GraphicsToolkit graphicstoolkit) {
		aBoolean525 = true;
		aBoolean523 = true;
		aNode_Sub29Array524 = new Node_Sub29[8];
		aBoolean527 = false;
		anInt519 = i;
		aGraphicsToolkit522 = graphicstoolkit;
	}
}
