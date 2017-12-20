/* GLXToolkit - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;

import java.awt.Rectangle;

public class GLXToolkit extends AbstractToolkit
{
	static int anInt9206;
	static int anInt9207;
	static int anInt9208;
	static int anInt9209;
	static int anInt9210;
	static int anInt9211;
	static int anInt9212;
	static int anInt9213;
	static int anInt9214;
	static int anInt9215;
	static int anInt9216;
	static int anInt9217;
	static int anInt9218;
	static int anInt9219;
	static int anInt9220;
	static int[] anIntArray9221 = new int[1];
	static int anInt9222;
	private Class312 aClass312_9223 = new Class312();
	static int anInt9224;
	static int anInt9225;
	static int anInt9226;
	static int anInt9227;
	static int anInt9228;
	static int anInt9229;
	static int anInt9230;
	static int anInt9231;
	static int anInt9232;
	static int anInt9233;
	static int anInt9234;
	static int anInt9235;
	static int anInt9236;
	static int anInt9237;
	static int anInt9238;
	static int anInt9239;
	static int anInt9240;
	static int anInt9241;
	static int anInt9242;
	static int anInt9243;
	static int anInt9244;
	static int anInt9245;
	static int anInt9246;
	static int anInt9247;
	static int anInt9248;
	private OpenGL anOpenGL9249;
	static int anInt9250;
	static int anInt9251;
	static int anInt9252;
	static int anInt9253;
	static int anInt9254;
	static int anInt9255;
	static int anInt9256;
	static int anInt9257;
	static int anInt9258;
	static int anInt9259;
	static int anInt9260;
	static int anInt9261;
	static int anInt9262;
	static int anInt9263;
	private Class312 aClass312_9264 = new Class312();
	static int anInt9265;
	static int anInt9266;
	static int anInt9267;
	static int anInt9268;
	static int anInt9269;
	static int anInt9270;
	static int anInt9271;
	static int anInt9272;
	static int anInt9273;
	static Index aClass302_9274;
	private Class312 aClass312_9275 = new Class312();
	static int anInt9276 = -1;
	static int anInt9277;
	static int anInt9278;
	static int anInt9279;
	static int anInt9280;
	static int anInt9281;
	static int anInt9282;
	static int anInt9283;
	static int anInt9284;
	static int anInt9285;
	static int anInt9286;
	static int anInt9287;
	static int anInt9288;
	static int anInt9289;
	static int anInt9290;
	static int anInt9291;
	static Class54[] aClass54Array9292;
	static int anInt9293;
	static int anInt9294;
	static int anInt9295;
	static int anInt9296;
	static int anInt9297;
	static int anInt9298;
	static int anInt9299;
	static int anInt9300;
	private Class312 aClass312_9301 = new Class312();
	private Class312 aClass312_9302 = new Class312();
	private Class312 aClass312_9303 = new Class312();
	private Class312 aClass312_9304 = new Class312();
	private boolean aBoolean9305;
	private boolean aBoolean9306;
	private boolean aBoolean9307;
	protected MapBuffer aMapBuffer9308;
	private Class51_Sub1[] aClass51_Sub1Array9309 = new Class51_Sub1[16];
	private boolean aBoolean9310;
	private int anInt9311;
	private long aLong9312;
	private boolean aBoolean9313;
	protected MapBuffer aMapBuffer9314;
	protected boolean aBoolean9315;
	protected boolean aBoolean9316;
	private boolean aBoolean9317;
	private String aString9318;
	private int anInt9319;
	private boolean aBoolean9320;
	protected int anInt9321;
	protected boolean aBoolean9322;
	private String aString9323;
	protected int[] anIntArray9324;
	private int anInt9325;
	protected boolean aBoolean9326;
	
	final void method1363(int i, byte b, Class135 class135, boolean bool) {
		anInt9284++;
		OpenGL.glTexEnvi(8960, 34184 - -i, Class339_Sub6.method3939(class135, 34168));
		if (b >= 79) {
			OpenGL.glTexEnvi(8960, i + 34200, bool ? 771 : 770);
		}
	}
	
	final void b(int i, int i_0_, int i_1_, int i_2_, double d) {
		anInt9300++;
	}
	
	final void method1374(byte b) {
		aFloat6328 = (float) (anInt6335 - anInt6372);
		anInt9248++;
		aFloat6311 = aFloat6328 - (float) anInt6355;
		if ((float) anInt6364 > aFloat6311) {
			aFloat6311 = (float) anInt6364;
		}
		OpenGL.glFogf(2915, aFloat6311);
		OpenGL.glFogf(2916, aFloat6328);
		GLDrawableModel.aFloatArray5626[0] = (float) Node_Sub30.method2723(anInt6276, 16711680) / 1.671168E7F;
		GLDrawableModel.aFloatArray5626[1] = (float) Node_Sub30.method2723(anInt6276, 65280) / 65280.0F;
		GLDrawableModel.aFloatArray5626[2] = (float) Node_Sub30.method2723(255, anInt6276) / 255.0F;
		OpenGL.glFogfv(2918, GLDrawableModel.aFloatArray5626, 0);
	}
	
	final Object method1351(java.awt.Canvas canvas, int i) {
		anInt9258++;
		long l = anOpenGL9249.prepareSurface(canvas);
		if (i >= -70) {
			b(true);
		}
		if (l == -1L) {
			throw new RuntimeException();
		}
		return new Long(l);
	}
	
	final void method1321(byte b, Class139 class139) {
		if (b != 102) {
			method1269((byte) -120);
		}
		if (Class308.aClass139_3915 != class139) {
			int i = Class132.method1560((byte) 41, class139);
			OpenGL.glTexGeni(8192, 9472, i);
			OpenGL.glEnable(3168);
			OpenGL.glTexGeni(8193, 9472, i);
			OpenGL.glEnable(3169);
			OpenGL.glTexGeni(8194, 9472, i);
			OpenGL.glEnable(3170);
		} else {
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
		}
		anInt9280++;
	}
	
	final Interface13_Impl3 method1262(Class68 class68, byte[] bs, byte b, int i, int i_3_, int i_4_) {
		anInt9295++;
		if (b != -57) {
			aMapBuffer9308 = null;
		}
		return new Class134_Sub1(this, class68, i_4_, i, i_3_, bs);
	}
	
	final void method1308(byte b) {
		if (!aBoolean6338 || !aBoolean6299 || (anInt6355 ^ 0xffffffff) > -1) {
			OpenGL.glDisable(2912);
		} else {
			OpenGL.glEnable(2912);
		}
		if (b < 74) {
			aBoolean9306 = true;
		}
		anInt9251++;
	}
	
	final int I() {
		anInt9271++;
		return anInt9319;
	}
	
	private final void method1397(byte b) {
		if (aBoolean9313) {
			OpenGL.glPopMatrix();
		}
		anInt9241++;
		if (aClass56_6303.method566(107)) {
			if (!aBoolean9305) {
				OpenGL.glLoadMatrixf(aClass336_Sub1_6269.method3884(true, Node_Sub38_Sub8.aFloatArray10162), 0);
				aBoolean9305 = true;
				method1382(103);
				method1273(-124);
			}
			if (!aBoolean6261) {
				OpenGL.glPushMatrix();
				OpenGL.glMultMatrixf(aClass336_Sub1_6262.method3884(true, Node_Sub38_Sub8.aFloatArray10162), 0);
				aBoolean9313 = true;
			} else {
				aBoolean9313 = false;
			}
		} else if (!aBoolean6261) {
			OpenGL.glLoadMatrixf(aClass336_Sub1_6262.method3884(true, Node_Sub38_Sub8.aFloatArray10162), 0);
			aBoolean9313 = false;
		} else {
			OpenGL.glLoadIdentity();
			aBoolean9313 = false;
		}
	}
	
	final Interface6 a(Interface4 interface4, Interface20 interface20) {
		anInt9206++;
		return null;
	}
	
	final synchronized void method1398(int i, int i_5_, boolean bool) {
		anInt9253++;
		if (bool != true) {
			method1349(null, (byte) -14, false, true, -23);
		}
		Node_Sub32 node_sub32 = new Node_Sub32(i);
		node_sub32.aLong2797 = (long) i_5_;
		aClass312_9275.method3625((byte) -54, node_sub32);
	}
	
	final Class290 method1311(int i, int i_6_) {
		anInt9286++;
		if (i != -22838) {
			method1273(-41);
		}
		int i_7_ = i_6_;
	while_103_:
		do {
			do {
				if (i_7_ != 3) {
					if ((i_7_ ^ 0xffffffff) != -5) {
						if ((i_7_ ^ 0xffffffff) == -9) {
							break;
						}
						break while_103_;
					}
				} else {
					return new Class290_Sub11(this, aClass302_6167);
				}
				return new Class290_Sub1(this, aClass302_6167, aClass5_6247);
			} while (false);
			return new Class290_Sub3(this, aClass302_6167, aClass5_6247);
		} while (false);
		return super.method1311(-22838, i_6_);
	}
	
	final Class270 a(Class270 class270, Class270 class270_8_, float f, Class270 class270_9_) {
		anInt9254++;
		if (!(f < 0.5F)) {
			return class270_8_;
		}
		return class270;
	}
	
	final void method1261(byte b) {
		if (b != -18) {
			anIntArray9221 = null;
		}
		anInt9226++;
		OpenGL.glViewport(anInt6280, anInt6307, anInt6239, anInt6124);
	}
	
	final void method1251(byte b) {
		anInt9298++;
		int i = anIntArray9324[anInt6284];
		if ((i ^ 0xffffffff) != -1) {
			anIntArray9324[anInt6284] = 0;
			OpenGL.glBindTexture(i, 0);
			OpenGL.glDisable(i);
		}
		if (b <= 59) {
			aLong9312 = -35L;
		}
	}
	
	final void h() {
		anInt9214++;
		if (anInt6239 > 0 || anInt6124 > 0) {
			int i = anInt6295;
			int i_10_ = anInt6294;
			int i_11_ = anInt6325;
			int i_12_ = anInt6333;
			this.la();
			OpenGL.glReadBuffer(1028);
			OpenGL.glDrawBuffer(1029);
			this.method1376(530);
			this.method1371(false, false);
			this.method1296(114, false);
			this.method1347(1, false);
			this.method1307(-97, false);
			this.method1312((byte) -21, null);
			this.method1332(3, false, -2, false);
			this.method1278((byte) -12, 1);
			this.method1277((byte) 61, 0);
			OpenGL.glMatrixMode(5889);
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadIdentity();
			OpenGL.glRasterPos2i(0, 0);
			OpenGL.glCopyPixels(0, 0, anInt6239, anInt6124, 6144);
			OpenGL.glFlush();
			OpenGL.glReadBuffer(1029);
			OpenGL.glDrawBuffer(1029);
			this.KA(i, i_11_, i_10_, i_12_);
		}
	}
	
	final void method1284(int i) {
		anInt9238++;
		if (!aBoolean6279) {
			OpenGL.glDisable(3008);
		} else {
			OpenGL.glEnable(3008);
		}
		if (i != 14) {
			d();
		}
	}
	
	final void method1293(int i) {
		if (i <= 114) {
			anInt9319 = 88;
		}
		anInt9290++;
		aBoolean9305 = false;
		method1397((byte) 121);
	}
	
	final Interface15_Impl1 method1346(boolean bool, byte b) {
		if (b != 102) {
			aLong9312 = -1L;
		}
		anInt9266++;
		return new Class51_Sub2(this, Class372.aClass372_4595, bool);
	}
	
	final Interface13_Impl1 method1367(int i, int i_13_, int[] is, int i_14_, int i_15_, boolean bool, int i_16_) {
		anInt9285++;
		if (i != -6331) {
			anIntArray9221 = null;
		}
		if (aBoolean9320 || Class371.method4094(i_13_, false) && Class371.method4094(i_16_, false)) {
			return new Class134_Sub4(this, i_13_, i_16_, bool, is, i_14_, i_15_);
		}
		if (aBoolean9317) {
			return new Class134_Sub3(this, i_13_, i_16_, is, i_14_, i_15_);
		}
		Class134_Sub4 class134_sub4 = new Class134_Sub4(this, Class99.aClass68_1290, Class372.aClass372_4594, Class320_Sub19.method3753(i_13_, -729073628), Class320_Sub19.method3753(i_16_, -729073628));
		class134_sub4.method47(is, 0, 0, i_16_, 23110, i_13_, i_14_, i_15_);
		return class134_sub4;
	}
	
	final void v() {
		anInt9270++;
	}
	
	final void method1309(int i) {
		anInt9211++;
		if (i <= -101) {
			OpenGL.glActiveTexture(33984 + anInt6284);
		}
	}
	
	final synchronized void e(int i) {
		anInt9239++;
		int i_17_ = 0;
		i &= 0x7fffffff;
		while (!aClass312_9264.method3616(0)) {
			Node_Sub32 node_sub32 = (Node_Sub32) aClass312_9264.method3619(-65);
			Class262_Sub14.anIntArray7813[i_17_++] = (int) node_sub32.aLong2797;
			anInt6260 -= node_sub32.anInt7381;
			if (i_17_ == 1000) {
				OpenGL.glDeleteBuffersARB(i_17_, Class262_Sub14.anIntArray7813, 0);
				i_17_ = 0;
			}
		}
		if ((i_17_ ^ 0xffffffff) < -1) {
			OpenGL.glDeleteBuffersARB(i_17_, Class262_Sub14.anIntArray7813, 0);
			i_17_ = 0;
		}
		while (!aClass312_9275.method3616(0)) {
			Node_Sub32 node_sub32 = (Node_Sub32) aClass312_9275.method3619(-65);
			Class262_Sub14.anIntArray7813[i_17_++] = (int) node_sub32.aLong2797;
			anInt6266 -= node_sub32.anInt7381;
			if (i_17_ == 1000) {
				OpenGL.glDeleteTextures(i_17_, Class262_Sub14.anIntArray7813, 0);
				i_17_ = 0;
			}
		}
		if ((i_17_ ^ 0xffffffff) < -1) {
			OpenGL.glDeleteTextures(i_17_, Class262_Sub14.anIntArray7813, 0);
			i_17_ = 0;
		}
		while (!aClass312_9301.method3616(0)) {
			Node_Sub32 node_sub32 = (Node_Sub32) aClass312_9301.method3619(-81);
			Class262_Sub14.anIntArray7813[i_17_++] = node_sub32.anInt7381;
			if (i_17_ == 1000) {
				OpenGL.glDeleteFramebuffersEXT(i_17_, Class262_Sub14.anIntArray7813, 0);
				i_17_ = 0;
			}
		}
		if ((i_17_ ^ 0xffffffff) < -1) {
			OpenGL.glDeleteFramebuffersEXT(i_17_, Class262_Sub14.anIntArray7813, 0);
			i_17_ = 0;
		}
		while (!aClass312_9302.method3616(0)) {
			Node_Sub32 node_sub32 = (Node_Sub32) aClass312_9302.method3619(-98);
			Class262_Sub14.anIntArray7813[i_17_++] = (int) node_sub32.aLong2797;
			anInt6264 -= node_sub32.anInt7381;
			if (i_17_ == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(i_17_, Class262_Sub14.anIntArray7813, 0);
				i_17_ = 0;
			}
		}
		if ((i_17_ ^ 0xffffffff) < -1) {
			OpenGL.glDeleteRenderbuffersEXT(i_17_, Class262_Sub14.anIntArray7813, 0);
		}
		while (!aClass312_9223.method3616(0)) {
			Node_Sub32 node_sub32 = (Node_Sub32) aClass312_9223.method3619(-92);
			OpenGL.glDeleteLists((int) node_sub32.aLong2797, node_sub32.anInt7381);
		}
		while (!aClass312_9303.method3616(0)) {
			Node node = aClass312_9303.method3619(-113);
			OpenGL.glDeleteProgramARB((int) node.aLong2797);
		}
		while (!aClass312_9304.method3616(0)) {
			Node node = aClass312_9304.method3619(-67);
			OpenGL.glDeleteObjectARB(node.aLong2797);
		}
		while (!aClass312_9223.method3616(0)) {
			Node_Sub32 node_sub32 = (Node_Sub32) aClass312_9223.method3619(-79);
			OpenGL.glDeleteLists((int) node_sub32.aLong2797, node_sub32.anInt7381);
		}
		if ((this.E() ^ 0xffffffff) < -100663297 && 60000L + aLong9312 < Class313.method3650(false)) {
			System.gc();
			aLong9312 = Class313.method3650(false);
		}
		super.e(i);
	}
	
	final void method1360(byte b) {
		if (b <= 36) {
			aBoolean9316 = false;
		}
		anInt9268++;
		method1397((byte) -22);
	}
	
	static final byte[] generateWhirpoolHash(byte b, byte[] bs, int i, int i_18_) {
		anInt9212++;
		byte[] bs_19_;
		if (i_18_ > 0) {
			bs_19_ = new byte[i];
			for (int i_20_ = 0; i > i_20_; i_20_++)
				bs_19_[i_20_] = bs[i_20_ + i_18_];
		} else {
			bs_19_ = bs;
		}
		Class380 class380 = new Class380();
		class380.method4165(60);
		class380.method4166((long) (8 * i), bs_19_, -27938);
		if (b <= 117) {
			return null;
		}
		byte[] bs_21_ = new byte[64];
		class380.method4167(bs_21_, 0, 3);
		return bs_21_;
	}
	
	final synchronized void method1400(int i, int i_22_) {
		anInt9281++;
		Node node = new Node();
		if (i_22_ != -15743) {
			method1275(-84, null, null);
		}
		node.aLong2797 = (long) i;
		aClass312_9303.method3625((byte) -54, node);
	}
	
	static final boolean method1401(int i) {
		anInt9261++;
		if (i != -6279) {
			anInt9276 = -87;
		}
		return Class194_Sub3_Sub1.aBoolean9378;
	}
	
	final void GA(int i) {
		anInt9224++;
		OpenGL.glClearColor((float) (0xff0000 & i) / 1.671168E7F, (float) (i & 0xff00) / 65280.0F, (float) (0xff & i) / 255.0F, (float) (i >>> 24) / 255.0F);
		OpenGL.glClear(16384);
	}
	
	final void method1279(int i, byte b) {
		if (b != -15) {
			generateWhirpoolHash((byte) -124, null, -95, -109);
		}
		anInt9257++;
	}
	
	final boolean m() {
		anInt9279++;
		return false;
	}
	
	final void method1275(int i, java.awt.Canvas canvas, Object object) {
		anInt9218++;
		Long var_long = (Long) object;
		if (i > -61) {
			method1321((byte) 11, null);
		}
		anOpenGL9249.releaseSurface(canvas, var_long.longValue());
	}
	
	final void method1300(int i) {
		OpenGL.glScissor(anInt6295 + anInt6280, anInt6307 + anInt6124 - anInt6333, anInt6294 - anInt6295, anInt6333 + -anInt6325);
		if (i != 0) {
			a(60, -64, 90, -20);
		}
		anInt9250++;
	}
	
	final Class213 method1372(byte b, Class207[] class207s) {
		if (b >= -118) {
			aClass312_9302 = null;
		}
		anInt9247++;
		return new Class213_Sub1(class207s);
	}
	
	final void a(Rectangle[] rectangles, int i, int i_23_, int i_24_) throws Exception_Sub1 {
		anInt9297++;
		e(i_23_, i_24_);
	}
	
	final void method1269(byte b) {
		if (enableBlending) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
		if (b <= 2) {
			aBoolean9306 = true;
		}
		anInt9265++;
	}
	
	final void method1334(int i) {
		anInt9225++;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(aFloatArray6314, 0);
		OpenGL.glMatrixMode(5888);
	}
	
	final void method1254(boolean bool) {
		if (bool != true) {
			a(0.92554986F, -1.3076545F, 0.5009772F);
		}
		OpenGL.glTexEnvi(8960, 34162, Class260.method3136(aClass94Array6296[anInt6284], 30716));
		anInt9215++;
	}
	
	final Interface15_Impl2 method1380(int i, boolean bool) {
		anInt9228++;
		if (i != 2) {
			return null;
		}
		return new Class51_Sub1(this, bool);
	}
	
	final void method1353(boolean bool) {
		anInt9243++;
		GLDrawableModel.aFloatArray5626[1] = aFloat6300 * aFloat6293;
		GLDrawableModel.aFloatArray5626[0] = aFloat6300 * aFloat6323;
		if (bool != false) {
			method1269((byte) -92);
		}
		GLDrawableModel.aFloatArray5626[2] = aFloat6300 * aFloat6365;
		GLDrawableModel.aFloatArray5626[3] = 1.0F;
		OpenGL.glLightModelfv(2899, GLDrawableModel.aFloatArray5626, 0);
	}
	
	final void e(int i, int i_26_) throws Exception_Sub1 {
		anOpenGL9249.swapBuffers();
		anInt9267++;
	}
	
	final void method1337(int i) {
		GLDrawableModel.aFloatArray5626[3] = (float) (anInt6318 >>> 24) / 255.0F;
		GLDrawableModel.aFloatArray5626[0] = (float) Node_Sub30.method2723(16711680, anInt6318) / 1.671168E7F;
		if (i != 6) {
			method1380(14, false);
		}
		GLDrawableModel.aFloatArray5626[2] = (float) Node_Sub30.method2723(anInt6318, 255) / 255.0F;
		GLDrawableModel.aFloatArray5626[1] = (float) Node_Sub30.method2723(65280, anInt6318) / 65280.0F;
		anInt9208++;
		OpenGL.glTexEnvfv(8960, 8705, GLDrawableModel.aFloatArray5626, 0);
	}
	
	final void method1354(int i, int i_27_, Interface15_Impl2 interface15_impl2) {
		anInt9229++;
		if (i_27_ == 32011) {
			aClass51_Sub1Array9309[i] = (Class51_Sub1) interface15_impl2;
		}
	}
	
	final void b(boolean bool) {
		anInt9233++;
	}
	
	final void method1289(boolean bool) {
		GLDrawableModel.aFloatArray5626[0] = aFloat6323 * aFloat6274;
		anInt9288++;
		GLDrawableModel.aFloatArray5626[3] = 1.0F;
		GLDrawableModel.aFloatArray5626[1] = aFloat6293 * aFloat6274;
		GLDrawableModel.aFloatArray5626[2] = aFloat6274 * aFloat6365;
		OpenGL.glLightfv(16384, 4609, GLDrawableModel.aFloatArray5626, 0);
		GLDrawableModel.aFloatArray5626[1] = aFloat6293 * -aFloat6272;
		GLDrawableModel.aFloatArray5626[3] = 1.0F;
		if (bool != false) {
			v();
		}
		GLDrawableModel.aFloatArray5626[0] = -aFloat6272 * aFloat6323;
		GLDrawableModel.aFloatArray5626[2] = aFloat6365 * -aFloat6272;
		OpenGL.glLightfv(16385, 4609, GLDrawableModel.aFloatArray5626, 0);
	}
	
	final synchronized void method1402(byte b, int i, int i_28_) {
		if (b <= -22) {
			anInt9220++;
			Node_Sub32 node_sub32 = new Node_Sub32(i_28_);
			node_sub32.aLong2797 = (long) i;
			aClass312_9264.method3625((byte) -54, node_sub32);
		}
	}
	
	final void d() {
		anInt9227++;
	}
	
	final void F(int i, int i_29_) {
		anInt9252++;
	}
	
	final synchronized void method1403(int i, long l) {
		anInt9216++;
		Node node = new Node();
		node.aLong2797 = l;
		aClass312_9304.method3625((byte) -54, node);
		if (i != 2) {
			method1338(null, -35);
		}
	}
	
	final void j() {
		OpenGL.glFinish();
		anInt9232++;
	}
	
	final boolean method1295(Class68 class68, Class372 class372, int i) {
		if (i != 1) {
			return false;
		}
		anInt9262++;
		return true;
	}
	
	final void method1338(Class213 class213, int i) {
		anInt9213++;
		Class207[] class207s = ((Class213_Sub1) class213).aClass207Array6911;
		int i_30_ = 0;
		boolean bool = false;
		boolean bool_31_ = false;
		boolean bool_32_ = false;
		if (i == 9422) {
			for (int i_33_ = 0; class207s.length > i_33_; i_33_++) {
				Class207 class207 = class207s[i_33_];
				Class51_Sub1 class51_sub1 = aClass51_Sub1Array9309[i_33_];
				int i_34_ = 0;
				int i_35_ = class51_sub1.method521(-11856);
				long l = class51_sub1.method515((byte) 50);
				class51_sub1.method518(97);
				for (int i_36_ = 0; (i_36_ ^ 0xffffffff) > (class207.method2042(-1) ^ 0xffffffff); i_36_++) {
					Class126 class126 = class207.method2044(15, i_36_);
					if (class126 != Class126.aClass126_1620) {
						if (class126 == Class126.aClass126_1625) {
							OpenGL.glNormalPointer(5126, i_35_, (long) i_34_ + l);
							bool_31_ = true;
						} else if (Class126.aClass126_1626 == class126) {
							OpenGL.glColorPointer(4, 5121, i_35_, l + (long) i_34_);
							bool = true;
						} else if (Class126.aClass126_1627 != class126) {
							if (Class126.aClass126_1628 == class126) {
								OpenGL.glClientActiveTexture(33984 + i_30_++);
								OpenGL.glTexCoordPointer(2, 5126, i_35_, l - -(long) i_34_);
							} else if (class126 == Class126.aClass126_1629) {
								OpenGL.glClientActiveTexture(33984 + i_30_++);
								OpenGL.glTexCoordPointer(3, 5126, i_35_, l + (long) i_34_);
							} else if (class126 == Class126.aClass126_1630) {
								OpenGL.glClientActiveTexture(i_30_++ + 33984);
								OpenGL.glTexCoordPointer(4, 5126, i_35_, l - -(long) i_34_);
							}
						} else {
							OpenGL.glClientActiveTexture(33984 - -i_30_++);
							OpenGL.glTexCoordPointer(1, 5126, i_35_, l + (long) i_34_);
						}
					} else {
						bool_32_ = true;
						OpenGL.glVertexPointer(3, 5126, i_35_, (long) i_34_ + l);
					}
					i_34_ += class126.anInt1624;
				}
			}
			if (aBoolean9306 != bool_32_) {
				if (bool_32_) {
					OpenGL.glEnableClientState(32884);
				} else {
					OpenGL.glDisableClientState(32884);
				}
				aBoolean9306 = bool_32_;
			}
			if (!bool_31_ == aBoolean9310) {
				if (bool_31_) {
					OpenGL.glEnableClientState(32885);
				} else {
					OpenGL.glDisableClientState(32885);
				}
				aBoolean9310 = bool_31_;
			}
			if (!aBoolean9307 == bool) {
				if (!bool) {
					OpenGL.glDisableClientState(32886);
				} else {
					OpenGL.glEnableClientState(32886);
				}
				aBoolean9307 = bool;
			}
			if ((anInt9311 ^ 0xffffffff) > (i_30_ ^ 0xffffffff)) {
				for (int i_37_ = anInt9311; (i_37_ ^ 0xffffffff) > (i_30_ ^ 0xffffffff); i_37_++) {
					OpenGL.glClientActiveTexture(i_37_ + 33984);
					OpenGL.glEnableClientState(32888);
				}
				anInt9311 = i_30_;
			} else if ((i_30_ ^ 0xffffffff) > (anInt9311 ^ 0xffffffff)) {
				for (int i_38_ = i_30_; i_38_ < anInt9311; i_38_++) {
					OpenGL.glClientActiveTexture(33984 - -i_38_);
					OpenGL.glDisableClientState(32888);
				}
				anInt9311 = i_30_;
			}
		}
	}
	
	final void method1313(byte b) {
		if (!aBoolean6306) {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		} else {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		}
		if (b != 108) {
			method1295(null, null, 111);
		}
		anInt9273++;
	}
	
	final void a(float f, float f_39_, float f_40_) {
		anInt9299++;
	}
	
	final void ya() {
		this.method1307(-126, true);
		anInt9209++;
		OpenGL.glClear(256);
	}
	
	final Interface13_Impl1 method1322(Class68 class68, boolean bool, int i, int i_41_, byte b, float[] fs, int i_42_, int i_43_) {
		anInt9282++;
		if (b != 5) {
			method1313((byte) -73);
		}
		if (!aBoolean9320 && (!Class371.method4094(i_43_, false) || !Class371.method4094(i, false))) {
			if (aBoolean9317) {
				return new Class134_Sub3(this, class68, i_43_, i, fs, i_41_, i_42_);
			}
			Class134_Sub4 class134_sub4 = new Class134_Sub4(this, class68, Class372.aClass372_4598, Class320_Sub19.method3753(i_43_, b + -729073633), Class320_Sub19.method3753(i, -729073628));
			class134_sub4.method1586(class68, 0, i, i_41_, fs, b ^ ~0x6abc, 0, i_42_, i_43_);
			return class134_sub4;
		}
		return new Class134_Sub4(this, class68, i_43_, i, bool, fs, i_41_, i_42_);
	}
	
	final boolean w() {
		anInt9231++;
		return false;
	}
	
	final void method1365(boolean bool, byte b) {
		anInt9236++;
		if (b >= -112) {
			aBoolean9320 = false;
		}
		if (!bool) {
			OpenGL.glDisable(32925);
		} else {
			OpenGL.glEnable(32925);
		}
	}
	
	final void method1326(boolean bool) {
		for (int i = anInt6370 - 1; (i ^ 0xffffffff) <= -1; i--) {
			OpenGL.glActiveTexture(i + 33984);
			OpenGL.glTexEnvi(8960, 8704, 34160);
			OpenGL.glTexEnvi(8960, 34161, 8448);
			OpenGL.glTexEnvi(8960, 34178, 34166);
			OpenGL.glTexEnvi(8960, 34162, 8448);
			OpenGL.glTexEnvi(8960, 34186, 34166);
		}
		anInt9278++;
		OpenGL.glTexEnvi(8960, 34186, 34168);
		OpenGL.glShadeModel(7425);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glDepthFunc(515);
		OpenGL.glPolygonMode(1028, 6914);
		OpenGL.glEnable(2884);
		OpenGL.glCullFace(1029);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
		for (int i = 0; (i ^ 0xffffffff) > -9; i++) {
			int i_44_ = 16384 + i;
			OpenGL.glLightfv(i_44_, 4608, fs, 0);
			OpenGL.glLightf(i_44_, 4615, 0.0F);
			OpenGL.glLightf(i_44_, 4616, 0.0F);
		}
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		anOpenGL9249.setSwapInterval(0);
		super.method1326(bool);
	}
	
	final void a(Interface6 interface6) {
		anInt9237++;
	}
	
	final void method1340(byte b) {
		if (aBoolean6277) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
		anInt9210++;
	}
	
	final Interface13_Impl1 method1291(Class68 class68, Class372 class372, int i, int i_45_, int i_46_) {
		anInt9240++;
		if (!aBoolean9320 && (!Class371.method4094(i_45_, false) || !Class371.method4094(i, false))) {
			if (!aBoolean9317) {
				return new Class134_Sub4(this, class68, class372, Class320_Sub19.method3753(i_45_, -729073628), Class320_Sub19.method3753(i, -729073628));
			}
			return new Class134_Sub3(this, class68, class372, i_45_, i);
		}
		return new Class134_Sub4(this, class68, class372, i_45_, i);
	}
	
	final Interface13_Impl1 method1327(Class68 class68, int i, boolean bool, int i_48_, int i_49_, int i_50_, boolean bool_51_, byte[] bs) {
		anInt9283++;
		if (bool_51_ != true) {
			return null;
		}
		if (aBoolean9320 || Class371.method4094(i, !bool_51_) && Class371.method4094(i_50_, false)) {
			return new Class134_Sub4(this, class68, i, i_50_, bool, bs, i_48_, i_49_);
		}
		if (!aBoolean9317) {
			Class134_Sub4 class134_sub4 = new Class134_Sub4(this, class68, Class372.aClass372_4594, Class320_Sub19.method3753(i, -729073628), Class320_Sub19.method3753(i_50_, -729073628));
			class134_sub4.method50(i_48_, i_49_, i_50_, -15178, bs, 0, class68, 0, i);
			return class134_sub4;
		}
		return new Class134_Sub3(this, class68, i, i_50_, bs, i_48_, i_49_);
	}
	
	final void f() {
		anInt9291++;
	}
	
	final int[] na(int i, int i_52_, int i_53_, int i_54_) {
		anInt9272++;
		int[] is = new int[i_54_ * i_53_];
		for (int i_55_ = 0; (i_54_ ^ 0xffffffff) < (i_55_ ^ 0xffffffff); i_55_++)
			OpenGL.glReadPixelsi(i, -1 + (anInt6124 + (-i_52_ + -i_55_)), i_53_, 1, 32993, anInt9321, is, i_53_ * i_55_);
		return is;
	}
	
	final Interface4 a(int i, int i_56_) {
		anInt9260++;
		return null;
	}
	
	final Renderer c() {
		anInt9222++;
		int i = -1;
		if (aString9318.indexOf("nvidia") == -1) {
			if ((aString9318.indexOf("intel") ^ 0xffffffff) != 0) {
				i = 32902;
			} else if (aString9318.indexOf("ati") != -1) {
				i = 4098;
			}
		} else {
			i = 4318;
		}
		return new Renderer(i, "OpenGL", anInt9325, aString9323, 0L);
	}
	
	final void a(int i, int i_57_, int i_58_, int i_59_) {
		anInt9277++;
	}
	
	public static void method1404(int i) {
		aClass54Array9292 = null;
		anIntArray9221 = null;
		if (i == 0) {
			aClass302_9274 = null;
		}
	}
	
	final void method1333(boolean bool) {
		anInt9293++;
		if (bool != false) {
			aBoolean9322 = true;
		}
	}
	
	final Interface20 d(int i, int i_60_) {
		anInt9235++;
		return null;
	}
	
	final void method1370(int i) {
		if (i >= -12) {
			aBoolean9315 = true;
		}
		anInt9263++;
		OpenGL.glDepthMask(aBoolean6275 && aBoolean6313);
	}
	
	final void method1310(byte b) {
		anInt9234++;
		OpenGL.glMatrixMode(5890);
		if (Class119.aClass346_1515 != aClass346Array6343[anInt6284]) {
			OpenGL.glLoadMatrixf(aClass336_Sub1Array6327[anInt6284].method3884(true, Node_Sub38_Sub8.aFloatArray10162), 0);
		} else {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glMatrixMode(5888);
		if (b != -113) {
			method1289(false);
		}
	}
	
	final Interface13_Impl2 method1287(int i, int[][] is, boolean bool, int i_61_) {
		if (i_61_ != 0) {
			return null;
		}
		anInt9287++;
		return new Class134_Sub2(this, i, bool, is);
	}
	
	final void method1319(Object object, java.awt.Canvas canvas, int i) {
		anInt9255++;
		Long var_long = (Long) object;
		if (i != -30190) {
			u();
		}
		if (!anOpenGL9249.setSurface(var_long.longValue())) {
			throw new RuntimeException();
		}
	}
	
	final void method1282(int i) {
		anInt9296++;
		if (i != 0) {
			d(94, 59);
		}
		if (!aBoolean6387) {
			OpenGL.glDisable(3089);
		} else {
			OpenGL.glEnable(3089);
		}
	}
	
	final void method1382(int i) {
		anInt9245++;
		OpenGL.glLightfv(16384, 4611, aFloatArray6292, 0);
		OpenGL.glLightfv(16385, 4611, aFloatArray6304, 0);
	}
	
	static final void method1405(byte[] bs, int i, int i_63_, int i_64_, int i_65_, int i_66_, int i_67_, byte[] bs_68_, int i_69_) {
		anInt9269++;
		int i_70_ = -(i_64_ >> 2);
		i_64_ = -(i_64_ & 0x3);
		if (i_67_ >= 0) {
			aClass54Array9292 = null;
		}
		for (int i_71_ = -i_65_; i_71_ < 0; i_71_++) {
			for (int i_72_ = i_70_; (i_72_ ^ 0xffffffff) > -1; i_72_++) {
				bs[i_63_++] += bs_68_[i_69_++];
				bs[i_63_++] += bs_68_[i_69_++];
				bs[i_63_++] += bs_68_[i_69_++];
				bs[i_63_++] += bs_68_[i_69_++];
			}
			for (int i_73_ = i_64_; (i_73_ ^ 0xffffffff) > -1; i_73_++)
				bs[i_63_++] += bs_68_[i_69_++];
			i_63_ += i_66_;
			i_69_ += i;
		}
	}
	
	GLXToolkit(OpenGL opengl, java.awt.Canvas canvas, long l, d var_d, Index class302, int i) {
		super(canvas, new Long(l), var_d, class302, i, 1);
		aMapBuffer9308 = new MapBuffer();
		aMapBuffer9314 = new MapBuffer();
		anInt9319 = 0;
		try {
			anOpenGL9249 = opengl;
			anOpenGL9249.b();
			aString9318 = OpenGL.glGetString(7936).toLowerCase();
			aString9323 = OpenGL.glGetString(7937).toLowerCase();
			if (aString9318.indexOf("microsoft") != -1 || aString9318.indexOf("brian paul") != -1 || aString9318.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			String string = OpenGL.glGetString(7938);
			String[] strings = Class106.method1120((byte) -73, string.replace('.', ' '), ' ');
			if ((strings.length ^ 0xffffffff) <= -3) {
				try {
					int i_74_ = Class350.method3998(strings[0], -1);
					int i_75_ = Class350.method3998(strings[1], -1);
					anInt9325 = i_74_ * 10 - -i_75_;
				} catch (NumberFormatException numberformatexception) {
					throw new RuntimeException("");
				}
			} else {
				throw new RuntimeException("");
			}
			if ((anInt9325 ^ 0xffffffff) > -13) {
				throw new RuntimeException("");
			}
			if (!anOpenGL9249.a("GL_ARB_multitexture")) {
				throw new RuntimeException("");
			}
			if (!anOpenGL9249.a("GL_ARB_texture_env_combine")) {
				throw new RuntimeException("");
			}
			int[] is = new int[1];
			OpenGL.glGetIntegerv(34018, is, 0);
			anInt6370 = is[0];
			if ((anInt6370 ^ 0xffffffff) > -3) {
				throw new RuntimeException("");
			}
			anInt6367 = 8;
			aBoolean9316 = anOpenGL9249.a("GL_ARB_vertex_buffer_object");
			aBoolean6342 = anOpenGL9249.a("GL_ARB_multisample");
			aBoolean9317 = anOpenGL9249.a("GL_ARB_texture_rectangle");
			aBoolean6310 = anOpenGL9249.a("GL_ARB_texture_cube_map");
			aBoolean9320 = anOpenGL9249.a("GL_ARB_texture_non_power_of_two");
			aBoolean6366 = anOpenGL9249.a("GL_EXT_texture3D");
			aBoolean9315 = anOpenGL9249.a("GL_ARB_vertex_shader");
			aBoolean9326 = anOpenGL9249.a("GL_ARB_vertex_program");
			aBoolean9322 = anOpenGL9249.a("GL_ARB_fragment_shader");
			anOpenGL9249.a("GL_ARB_fragment_program");
			anIntArray9324 = new int[anInt6370];
			anInt9321 = Stream.b() ? 33639 : 5121;
			if ((aString9323.indexOf("radeon") ^ 0xffffffff) != 0) {
				int i_76_ = 0;
				boolean bool = false;
				boolean bool_77_ = false;
				String[] strings_78_ = Class106.method1120((byte) 78, aString9323.replace('/', ' '), ' ');
				for (int i_79_ = 0; (strings_78_.length ^ 0xffffffff) < (i_79_ ^ 0xffffffff); i_79_++) {
					String string_80_ = strings_78_[i_79_];
					try {
						if (string_80_.length() > 0) {
							if ((string_80_.charAt(0) ^ 0xffffffff) == -121 && (string_80_.length() ^ 0xffffffff) <= -4 && Class290_Sub7.method3441(2, string_80_.substring(1, 3))) {
								bool_77_ = true;
								string_80_ = string_80_.substring(1);
							}
							if (string_80_.equals("hd")) {
								bool = true;
							} else {
								if (string_80_.startsWith("hd")) {
									string_80_ = string_80_.substring(2);
									bool = true;
								}
								if ((string_80_.length() ^ 0xffffffff) <= -5 && Class290_Sub7.method3441(2, string_80_.substring(0, 4))) {
									i_76_ = Class350.method3998(string_80_.substring(0, 4), -1);
									break;
								}
							}
						}
					} catch (Exception exception) {
						/* empty */
					}
				}
				if (!bool_77_ && !bool) {
					if (i_76_ >= 7000 && i_76_ <= 9250) {
						aBoolean6366 = false;
					}
					if ((i_76_ ^ 0xffffffff) <= -7001 && (i_76_ ^ 0xffffffff) >= -8000) {
						aBoolean9316 = false;
					}
				}
				aBoolean9317 &= anOpenGL9249.a("GL_ARB_half_float_pixel");
			}
			aString9318.indexOf("intel");
			if (aBoolean9316) {
				try {
					int[] is_81_ = new int[1];
					OpenGL.glGenBuffersARB(1, is_81_, 0);
				} catch (Throwable throwable) {
					throw new RuntimeException("");
				}
			}
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			this.method1233(-7751);
			throw new RuntimeException("");
		}
	}
	
	final void method1349(Class135 class135, byte b, boolean bool, boolean bool_82_, int i) {
		OpenGL.glTexEnvi(8960, 34176 - -i, Class339_Sub6.method3939(class135, 34168));
		anInt9217++;
		if (b != 19) {
			method1405(null, 1, -111, 104, -16, -109, -15, null, 54);
		}
		if (!bool) {
			OpenGL.glTexEnvi(8960, 34192 + i, !bool_82_ ? 768 : 769);
		} else {
			OpenGL.glTexEnvi(8960, 34192 - -i, !bool_82_ ? 770 : 771);
		}
	}
	
	final void u() {
		anInt9246++;
		super.u();
		if (anOpenGL9249 != null) {
			anOpenGL9249.a();
			anOpenGL9249.release();
			anOpenGL9249 = null;
		}
	}
	
	final void method1263(boolean bool) {
		OpenGL.glTexEnvi(8960, 34161, Class260.method3136(aClass94Array6351[anInt6284], 30716));
		if (bool != false) {
			aBoolean9322 = true;
		}
		anInt9294++;
	}
	
	final void method1303(Class104 class104, int i, int i_83_, int i_84_) {
		if (i < 2) {
			anInt9319 = 63;
		}
		anInt9259++;
		int i_85_;
		int i_86_;
		if (StandardSprite.aClass104_8926 == class104) {
			i_85_ = 1;
			i_86_ = 2 * i_84_;
		} else if (class104 != Class263.aClass104_3337) {
			if (Class55.aClass104_833 != class104) {
				if (class104 == Class169_Sub3.aClass104_8818) {
					i_85_ = 6;
					i_86_ = 2 + i_84_;
				} else if (class104 == Node_Sub15_Sub2.aClass104_9779) {
					i_86_ = 2 + i_84_;
					i_85_ = 5;
				} else {
					i_85_ = 0;
					i_86_ = i_84_;
				}
			} else {
				i_85_ = 4;
				i_86_ = i_84_ * 3;
			}
		} else {
			i_85_ = 3;
			i_86_ = 1 + i_84_;
		}
		OpenGL.glDrawArrays(i_85_, i_83_, i_86_);
	}
	
	final boolean method1377(Class372 class372, Class68 class68, byte b) {
		if (b != -72) {
			method1287(74, null, false, 75);
		}
		anInt9207++;
		return true;
	}
	
	final float method1379(int i) {
		anInt9244++;
		if (i < 62) {
			method1308((byte) 16);
		}
		return 0.0F;
	}
	
	final void method1276(int i, byte b, int i_87_, Interface15_Impl1 interface15_impl1, int i_88_, Class104 class104, int i_89_) {
		if (b >= -66) {
			aClass54Array9292 = null;
		}
		anInt9230++;
		int i_90_;
		int i_91_;
		if (class104 == StandardSprite.aClass104_8926) {
			i_91_ = 2 * i_89_;
			i_90_ = 1;
		} else if (Class263.aClass104_3337 != class104) {
			if (Class55.aClass104_833 == class104) {
				i_90_ = 4;
				i_91_ = 3 * i_89_;
			} else if (Class169_Sub3.aClass104_8818 == class104) {
				i_90_ = 6;
				i_91_ = 2 + i_89_;
			} else if (Node_Sub15_Sub2.aClass104_9779 != class104) {
				i_91_ = i_89_;
				i_90_ = 0;
			} else {
				i_91_ = 2 + i_89_;
				i_90_ = 5;
			}
		} else {
			i_90_ = 3;
			i_91_ = i_89_ + 1;
		}
		Class372 class372 = interface15_impl1.method55(-90);
		Class51_Sub2 class51_sub2 = (Class51_Sub2) interface15_impl1;
		class51_sub2.method518(118);
		OpenGL.glDrawElements(i_90_, i_91_, Class136.method1590((byte) -11, class372), class51_sub2.method515((byte) 50) - -(long) (i_87_ * class372.anInt4591));
	}
	
	final void method1273(int i) {
		if (i >= -20) {
			aBoolean9310 = false;
		}
		this.method1320((byte) -128);
		anInt9289++;
		int i_92_;
		for (i_92_ = 0; anInt6358 > i_92_; i_92_++) {
			Node_Sub29 node_sub29 = aNode_Sub29Array6345[i_92_];
			int i_93_ = node_sub29.method2710((byte) -63);
			int i_94_ = 16386 - -i_92_;
			float f = node_sub29.method2707(1) / 255.0F;
			GLDrawableModel.aFloatArray5626[0] = (float) node_sub29.method2705(32311);
			GLDrawableModel.aFloatArray5626[1] = (float) node_sub29.method2704(30);
			GLDrawableModel.aFloatArray5626[2] = (float) node_sub29.method2708(27433);
			GLDrawableModel.aFloatArray5626[3] = 1.0F;
			OpenGL.glLightfv(i_94_, 4611, GLDrawableModel.aFloatArray5626, 0);
			GLDrawableModel.aFloatArray5626[1] = (float) (Node_Sub30.method2723(65480, i_93_) >> 8) * f;
			GLDrawableModel.aFloatArray5626[0] = (float) Node_Sub30.method2723(255, i_93_ >> 16) * f;
			GLDrawableModel.aFloatArray5626[2] = f * (float) Node_Sub30.method2723(255, i_93_);
			GLDrawableModel.aFloatArray5626[3] = 1.0F;
			OpenGL.glLightfv(i_94_, 4609, GLDrawableModel.aFloatArray5626, 0);
			OpenGL.glLightf(i_94_, 4617, 1.0F / (float) (node_sub29.method2711(121) * node_sub29.method2711(123)));
			OpenGL.glEnable(i_94_);
		}
		for (/**/; anInt6356 > i_92_; i_92_++)
			OpenGL.glDisable(i_92_ + 16386);
		super.method1273(-39);
	}
	
	final void method1302(int i) {
		if (i == 1) {
			if (!aBoolean6340 || aBoolean6283) {
				OpenGL.glDisable(2896);
			} else {
				OpenGL.glEnable(2896);
			}
			anInt9256++;
		}
	}
	
	final void method1265(java.awt.Canvas canvas, Object object, int i) {
		anInt9242++;
		Long var_long = (Long) object;
		anOpenGL9249.surfaceResized(var_long.longValue());
	}
	
	final void method1259(int i) {
		if (aClass26_6301 != Class47.aClass26_688) {
			if (aClass26_6301 == Class339_Sub3.aClass26_8664) {
				OpenGL.glBlendFunc(1, 1);
			} else if (aClass26_6301 == Node_Sub15_Sub7.aClass26_9827) {
				OpenGL.glBlendFunc(774, 1);
			}
		} else {
			OpenGL.glBlendFunc(770, 771);
		}
		if (i < 85) {
			a(null, null, -2.3890455F, null);
		}
		anInt9219++;
	}
}
