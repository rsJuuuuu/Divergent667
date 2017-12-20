/* Class299 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;

public class Class299
{
	private boolean aBoolean3742 = false;
	private int anInt3743;
	private static int anInt3744 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7".length();
	private int[] anIntArray3745;
	private GLSprite[] aGLSpriteArray3746;
	private static int[] anIntArray3747 = new int[256];
	private int[] anIntArray3748 = new int[4];
	private int anInt3749;
	
	final int method3487() {
		return anInt3749 - 1;
	}
	
	private final void method3488(GraphicsToolkit graphicstoolkit, String string, int[] is, int i, int i_0_, int i_1_, boolean bool) {
		if (i_1_ == 0) {
			bool = false;
		}
		i_1_ |= ~0xffffff;
		for (int i_2_ = 0; i_2_ < string.length(); i_2_++) {
			int i_3_ = anIntArray3747[string.charAt(i_2_)];
			if (bool) {
				aGLSpriteArray3746[i_3_].method1191(i + 1, i_0_ + 1, 0, -16777216, 1);
			}
			aGLSpriteArray3746[i_3_].method1191(i, i_0_, 0, i_1_, 1);
			i += anIntArray3745[i_3_];
		}
	}
	
	final int method3489() {
		return anInt3743;
	}
	
	final int method3490(String string) {
		int i = 0;
		for (int i_4_ = 0; i_4_ < string.length(); i_4_++) {
			int i_5_ = anIntArray3747[string.charAt(i_4_)];
			i += anIntArray3745[i_5_];
		}
		return i;
	}
	
	final void method3491(GraphicsToolkit graphicstoolkit, String string, int i, int i_6_, int i_7_, boolean bool) {
		int i_8_ = method3490(string) / 2;
		graphicstoolkit.K(anIntArray3748);
		if (i - i_8_ <= anIntArray3748[2] && i + i_8_ >= anIntArray3748[0] && i_6_ - anInt3743 <= anIntArray3748[3] && i_6_ + anInt3749 >= anIntArray3748[1]) {
			method3488(graphicstoolkit, string, anIntArray3748, i - i_8_, i_6_, i_7_, bool);
		}
	}
	
	private final void method3492(GraphicsToolkit graphicstoolkit, Font font, FontMetrics fontmetrics, char c, int i, boolean bool) {
		int i_9_ = fontmetrics.charWidth(c);
		int i_10_ = i_9_;
		if (bool) {
			try {
				if (c == '/') {
					bool = false;
				}
				if (c == 'f' || c == 't' || c == 'w' || c == 'v' || c == 'k' || c == 'x' || c == 'y' || c == 'A' || c == 'V' || c == 'W') {
					i_9_++;
				}
			} catch (Exception exception) {
				/* empty */
			}
		}
		int i_11_ = fontmetrics.getMaxAscent();
		int i_12_ = fontmetrics.getMaxAscent() + fontmetrics.getMaxDescent();
		int i_13_ = fontmetrics.getHeight();
		Image image = Node_Sub38_Sub20.aCanvas10309.createImage(i_9_, i_12_);
		Graphics graphics = image.getGraphics();
		graphics.setColor(Color.black);
		graphics.fillRect(0, 0, i_9_, i_12_);
		graphics.setColor(Color.white);
		graphics.setFont(font);
		graphics.drawString(String.valueOf(c), 0, i_11_);
		if (bool) {
			graphics.drawString(String.valueOf(c), 1, i_11_);
		}
		int[] is = new int[i_9_ * i_12_];
		PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, i_9_, i_12_, is, 0, i_9_);
		try {
			pixelgrabber.grabPixels();
		} catch (Exception exception) {
			/* empty */
		}
		image.flush();
		@SuppressWarnings("unused")
		Object object = null;
		int i_14_ = 0;
	while_225_:
		for (int i_15_ = 0; i_15_ < i_12_; i_15_++) {
			for (int i_16_ = 0; i_16_ < i_9_; i_16_++) {
				int i_17_ = is[i_16_ + i_15_ * i_9_];
				if ((i_17_ & 0xffffff) != 0) {
					i_14_ = i_15_;
					break while_225_;
				}
			}
		}
		for (int i_18_ = 0; i_18_ < is.length; i_18_++) {
			if ((is[i_18_] & 0xffffff) == 0) {
				is[i_18_] = 0;
			}
		}
		anInt3743 = i_11_ - i_14_;
		anInt3749 = i_13_;
		anIntArray3745[i] = i_10_;
		aGLSpriteArray3746[i] = graphicstoolkit.method1235(i_9_, i_9_, i_12_, is, 0, 7468);
	}
	
	public static void method3493() {
		anIntArray3747 = null;
	}
	
	Class299(GraphicsToolkit graphicstoolkit, int i, boolean bool, Component component) {
		aBoolean3742 = false;
		aGLSpriteArray3746 = new GLSprite[256];
		anIntArray3745 = new int[256];
		Font font = new Font("Helvetica", bool ? 1 : 0, i);
		FontMetrics fontmetrics = component.getFontMetrics(font);
		for (int i_19_ = 0; i_19_ < anInt3744; i_19_++)
			method3492(graphicstoolkit, font, fontmetrics, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7".charAt(i_19_), i_19_, false);
		if (bool && aBoolean3742) {
			aBoolean3742 = false;
			font = new Font("Helvetica", 0, i);
			fontmetrics = component.getFontMetrics(font);
			for (int i_20_ = 0; i_20_ < anInt3744; i_20_++)
				method3492(graphicstoolkit, font, fontmetrics, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7".charAt(i_20_), i_20_, false);
			if (!aBoolean3742) {
				aBoolean3742 = false;
				for (int i_21_ = 0; i_21_ < anInt3744; i_21_++)
					method3492(graphicstoolkit, font, fontmetrics, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7".charAt(i_21_), i_21_, true);
			}
		}
	}
	
	static {
		for (int i = 0; i < 256; i++) {
			int i_22_ = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7".indexOf(i);
			if (i_22_ == -1) {
				i_22_ = 74;
			}
			anIntArray3747[i] = i_22_;
		}
	}
}
