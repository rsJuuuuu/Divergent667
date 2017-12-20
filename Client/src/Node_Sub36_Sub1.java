/* Node_Sub36_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;

public class Node_Sub36_Sub1 extends Node_Sub36
{
	static int anInt10028;
	private byte aByte10029;
	static boolean aBoolean10030 = false;
	static OutcommingPacket aClass318_10031;
	private long aLong10032;
	private String aString10033 = null;
	static int anInt10034;
	static Class109 aClass109_10035;
	static int anInt10036;
	private int anInt10037;
	static float aFloat10038 = 0.0F;
	static int anInt10039 = 100;
	static int anInt10040;
	
	static final void method2758(int i) {
		anInt10028++;
		if (DrawableModel.aFrame907 == null) {
			int i_1_ = Class270_Sub1.anInt8033;
			int i_2_ = Class131.anInt5447;
			int i_3_ = -i_1_ + Class36.anInt542 + -Class360.screenWidth;
			int i_4_ = -i_2_ + (CacheNode_Sub3.anInt9441 - Class205.screenHeight);
			do {
				if (i_1_ > 0 || (i_3_ ^ 0xffffffff) < -1 || i_2_ > 0 || i_4_ > 0) {
					try {
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
						int i_5_ = 0;
						int i_6_ = 0;
						if (container == Node_Sub29.aFrame7344) {
							Insets insets = Node_Sub29.aFrame7344.getInsets();
							i_5_ = insets.left;
							i_6_ = insets.top;
						}
						Graphics graphics = container.getGraphics();
						graphics.setColor(Color.black);
						if ((i_1_ ^ 0xffffffff) < -1) {
							graphics.fillRect(i_5_, i_6_, i_1_, CacheNode_Sub3.anInt9441);
						}
						if (i_2_ > 0) {
							graphics.fillRect(i_5_, i_6_, Class36.anInt542, i_2_);
						}
						if (i_3_ > 0) {
							graphics.fillRect(-i_3_ + (Class36.anInt542 + i_5_), i_6_, i_3_, CacheNode_Sub3.anInt9441);
						}
						if ((i_4_ ^ 0xffffffff) >= -1) {
							break;
						}
						graphics.fillRect(i_5_, -i_4_ + i_6_ - -CacheNode_Sub3.anInt9441, Class36.anInt542, i_4_);
					} catch (Exception exception) {
						break;
					}
					break;
				}
			} while (false);
		}
	}
	
	final void method2751(Node_Sub43 node_sub43, int i) {
		anInt10036++;
		Class24 class24 = new Class24();
		class24.anInt441 = anInt10037;
		class24.aByte438 = aByte10029;
		class24.aString437 = aString10033;
		if (i != 0) {
			anInt10039 = -114;
		}
		node_sub43.method2938((byte) -118, class24);
	}
	
	public static void method2759(byte b) {
		aClass109_10035 = null;
		aClass318_10031 = null;
	}
	
	final void method2756(BufferedStream buffer, int i) {
		anInt10034++;
		if (buffer.readUnsignedByte() != 255) {
			buffer.offset--;
			aLong10032 = buffer.readLong();
		}
		aString10033 = buffer.readString2();
		anInt10037 = buffer.readUnsignedShort();
		aByte10029 = buffer.readByte();
		buffer.readLong();
		if (i == -1) {
			if (Class247.aBoolean3122) {
				//System.out.println("memberhash:" + aLong10032 + " membername:" + aString10033);
			}
		}
	}
	
	Node_Sub36_Sub1() {
		aLong10032 = -1L;
	}
	
	static {
		aClass318_10031 = new OutcommingPacket(54, 6);
		anInt10040 = 0;
	}
}
