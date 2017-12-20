/* Node_Sub53 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub53 extends Node
{
	protected Class241[] aClass241Array7657;
	protected int anInt7658;
	protected byte[][][] aByteArrayArrayArray7659;
	protected int[] anIntArray7660;
	protected int[] anIntArray7661;
	static int anInt7662;
	protected int[] anIntArray7663;
	protected Class241[] aClass241Array7664;
	protected int anInt7665;
	static GLSprite[] aGLSpriteArray7666;
	static Class176 aClass176_7667;
	static int gameSceneBaseX;
	static int anInt7669 = 0;
	
	static final DrawableModel method2978(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, GraphicsToolkit graphicstoolkit) {
		anInt7662++;
		if (i_1_ < 61) {
			gameSceneBaseX = -50;
		}
		long l = (long) i_2_;
		DrawableModel drawablemodel = (DrawableModel) Class105.aClass61_5202.method607(l, 0);
		int i_5_ = 2055;
		if (drawablemodel == null) {
			Model model = Renderer.method3448(i_2_, 7, 0, Class107.aClass302_1364);
			if (model == null) {
				return null;
			}
			if (model.anInt2614 < 13) {
				model.method2081(2, 0);
			}
			drawablemodel = graphicstoolkit.a(model, i_5_, Class320_Sub16.anInt8360, 64, 768);
			Class105.aClass61_5202.method601(drawablemodel, 25566, l);
		}
		drawablemodel = drawablemodel.method633((byte) 6, i_5_, true);
		if ((i_4_ ^ 0xffffffff) != -1) {
			drawablemodel.a(i_4_);
		}
		if (i != 0) {
			drawablemodel.FA(i);
		}
		if ((i_0_ ^ 0xffffffff) != -1) {
			drawablemodel.VA(i_0_);
		}
		if (i_3_ != 0) {
			drawablemodel.H(0, i_3_, 0);
		}
		return drawablemodel;
	}
	
	public static void method2979(byte b) {
		if (b <= 6) {
			aGLSpriteArray7666 = null;
		}
		aClass176_7667 = null;
		aGLSpriteArray7666 = null;
	}
}
