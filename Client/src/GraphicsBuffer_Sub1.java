/* GraphicsBuffer_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public class GraphicsBuffer_Sub1 extends GraphicsBuffer
{
	private Image anImage9876;
	private Rectangle aRectangle9877;
	private Shape aShape9878;
	private java.awt.Canvas aCanvas9879;
	
	final void method2597(int i, int i_0_, int i_1_, boolean bool, Graphics graphics, int i_2_, int i_3_, int i_4_) {
		aShape9878 = graphics.getClip();
		aRectangle9877.height = i_2_;
		aRectangle9877.x = i_1_;
		aRectangle9877.y = i_3_;
		aRectangle9877.width = i;
		graphics.setClip(aRectangle9877);
		graphics.drawImage(anImage9876, i_1_ - i_0_, i_3_ - i_4_, aCanvas9879);
		graphics.setClip(aShape9878);
		if (bool) {
			aCanvas9879 = null;
		}
	}
	
	final void method2595(boolean bool, int i, int i_5_, java.awt.Canvas canvas) {
		aCanvas9879 = canvas;
		aRectangle9877 = new Rectangle();
		anInt7142 = i_5_;
		anInt7146 = i;
		if (bool != true) {
			aShape9878 = null;
		}
		anIntArray7145 = new int[anInt7142 * anInt7146];
		DataBufferInt databufferint = new DataBufferInt(anIntArray7145, anIntArray7145.length);
		DirectColorModel directcolormodel = new DirectColorModel(32, 16711680, 65280, 255);
		WritableRaster writableraster = Raster.createWritableRaster(directcolormodel.createCompatibleSampleModel(anInt7146, anInt7142), databufferint, null);
		anImage9876 = new BufferedImage(directcolormodel, writableraster, false, new Hashtable<Object, Object>());
	}
	
	GraphicsBuffer_Sub1() {
		/* empty */
	}
}
