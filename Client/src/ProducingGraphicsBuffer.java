/* ProducingGraphicsBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;

public class ProducingGraphicsBuffer extends GraphicsBuffer implements ImageProducer
{
	static int anInt9880;
	static int[] anIntArray9881;
	static int anInt9882;
	static int anInt9883;
	static int anInt9884;
	static int anInt9885;
	static int anInt9886;
	private Image anImage9887;
	static int anInt9888;
	private java.awt.Canvas aCanvas9889;
	static int anInt9890;
	static int anInt9891;
	private ColorModel aColorModel9892;
	static int anInt9893;
	static Class212 aClass212_9894;
	static int[] anIntArray9895;
	static int anInt9896;
	static int anInt9897;
	static int anInt9898;
	private ImageConsumer anImageConsumer9899;
	static boolean aBoolean9900 = false;
	static Interface17 anInterface17_9901;
	
	public final synchronized void removeConsumer(ImageConsumer imageconsumer) {
		if (imageconsumer == anImageConsumer9899) {
			anImageConsumer9899 = null;
		}
		anInt9890++;
	}
	
	final void method2597(int i, int i_0_, int i_1_, boolean bool, Graphics graphics, int i_2_, int i_3_, int i_4_) {
		if (bool == false) {
			method2599(i_0_, i_4_, i_2_, bool, i);
			anInt9888++;
			Shape shape = graphics.getClip();
			graphics.clipRect(i_1_, i_3_, i, i_2_);
			graphics.drawImage(anImage9887, i_1_ + -i_0_, -i_4_ + i_3_, aCanvas9889);
			graphics.setClip(shape);
		}
	}
	
	public final synchronized void addConsumer(ImageConsumer imageconsumer) {
		anImageConsumer9899 = imageconsumer;
		anInt9893++;
		imageconsumer.setDimensions(anInt7146, anInt7142);
		imageconsumer.setProperties(null);
		imageconsumer.setColorModel(aColorModel9892);
		imageconsumer.setHints(14);
	}
	
	final void method2595(boolean bool, int i, int i_5_, java.awt.Canvas canvas) {
		anInt7142 = i_5_;
		aCanvas9889 = canvas;
		anInt9884++;
		anInt7146 = i;
		if (bool == true) {
			anIntArray7145 = new int[anInt7146 * anInt7142];
			aColorModel9892 = new DirectColorModel(32, 16711680, 65280, 255);
			anImage9887 = aCanvas9889.createImage(this);
			method2600(0);
			aCanvas9889.prepareImage(anImage9887, aCanvas9889);
			method2600(0);
			aCanvas9889.prepareImage(anImage9887, aCanvas9889);
			method2600(0);
			aCanvas9889.prepareImage(anImage9887, aCanvas9889);
		}
	}
	
	private final synchronized void method2599(int i, int i_6_, int i_7_, boolean bool, int i_8_) {
		anInt9891++;
		if (anImageConsumer9899 != null) {
			anImageConsumer9899.setPixels(i, i_6_, i_8_, i_7_, aColorModel9892, anIntArray7145, i + i_6_ * anInt7146, anInt7146);
			if (bool != false) {
				method2601(112);
			}
			anImageConsumer9899.imageComplete(2);
		}
	}
	
	public final void startProduction(ImageConsumer imageconsumer) {
		anInt9896++;
		addConsumer(imageconsumer);
	}
	
	private final synchronized void method2600(int i) {
		anInt9883++;
		if (anImageConsumer9899 != null) {
			anImageConsumer9899.setPixels(0, i, anInt7146, anInt7142, aColorModel9892, anIntArray7145, 0, anInt7146);
			anImageConsumer9899.imageComplete(2);
		}
	}
	
	static final void method2601(int i) {
		Class18.aHashTable308.method1517(false);
		anInt9886++;
		Class320_Sub16.aClass312_8358.method3614(-601);
		Node_Sub39.aClass369Array7497 = null;
		Class194_Sub1.aClass331Array6894 = null;
		if (i < -33) {
			Class121.aClass206Array1529 = null;
			Class3.anInt5161 = -1;
			Class246.anInt3108 = 1;
			Class259.anInt3254 = 0;
			if (Class186.aBoolean2255) {
				Class18.aShort310 = StandardPlane.aShort7990;
				OutcommingPacket.aShort4053 = Node_Sub38_Sub22.aShort10325;
				Class291.aShort3667 = Node_Sub38_Sub23.aShort10345;
				Animable_Sub2_Sub2.aShort10750 = Class169.aShort4961;
				Class186.aBoolean2255 = false;
			}
			Class262_Sub5.aClass199Array7732 = null;
			Class270_Sub1.anInt8034 = 0;
			ClientScript.aClass216_9498 = null;
			Class214.aClass262Array2528 = null;
		}
	}
	
	public final synchronized boolean isConsumer(ImageConsumer imageconsumer) {
		anInt9898++;
        return imageconsumer == anImageConsumer9899;
    }
	
	public static void method2602(byte b) {
		anInterface17_9901 = null;
		anIntArray9895 = null;
		if (b < 57) {
			aBoolean9900 = true;
		}
		aClass212_9894 = null;
		anIntArray9881 = null;
	}
	
	public final void requestTopDownLeftRightResend(ImageConsumer imageconsumer) {
		anInt9882++;
	}
	
	static final boolean method2603(int i, boolean bool, int i_9_) {
		if (bool != false) {
			method2603(-120, true, -69);
		}
		anInt9897++;
        return (0x37 & i_9_) != 0;
    }
	
	ProducingGraphicsBuffer() {
		/* empty */
	}
	
	static final void method2604(int i, int i_10_) {
		anInt9885++;
		Class339_Sub9.anInt8754 = i_10_;
		if (i != 2) {
			anInt9880 = 123;
		}
		synchronized (Class186.aClass61_2247) {
			Class186.aClass61_2247.method608(false);
		}
	}
	
	static {
		anIntArray9881 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };
		aClass212_9894 = new Class212("", 10);
		anInterface17_9901 = new Class118();
	}
}
