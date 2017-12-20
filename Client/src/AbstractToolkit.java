/* AbstractToolkit - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaclib.memory.heap.NativeHeapBuffer;
import jagex3.graphics2.hw.NativeInterface;

import java.awt.Canvas;
import java.awt.Dimension;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;

abstract class AbstractToolkit extends GraphicsToolkit
{
	static int anInt6075;
	static int anInt6076;
	static int anInt6077;
	static int anInt6078;
	static int anInt6079;
	static int anInt6080;
	static int anInt6081;
	static int anInt6082;
	static int anInt6083;
	protected NativeHeap aNativeHeap6084;
	static int anInt6085;
	static int anInt6086;
	static int anInt6087;
	private Class312 aClass312_6088 = new Class312();
	static int anInt6089;
	static int anInt6090;
	static int anInt6091;
	static int anInt6092;
	static int anInt6093;
	private Hashtable<Canvas, Object> aHashtable6094;
	static int anInt6095;
	static int anInt6096;
	static int anInt6097;
	static int anInt6098;
	static int anInt6099;
	private int anInt6100;
	static int anInt6101;
	static int anInt6102;
	static int anInt6103;
	static int anInt6104;
	static int anInt6105;
	static int anInt6106;
	static int anInt6107;
	static int anInt6108;
	static int anInt6109;
	static int anInt6110;
	static int anInt6111;
	static int anInt6112;
	static int anInt6113;
	static int anInt6114;
	static int anInt6115;
	static int anInt6116;
	private Object anObject6117;
	static int anInt6118;
	protected Object anObject6119;
	static int anInt6120;
	static int anInt6121;
	static int anInt6122;
	static int anInt6123;
	protected int anInt6124;
	static int anInt6125;
	static int anInt6126;
	static int anInt6127;
	protected long aLong6128;
	static int anInt6129;
	static int anInt6130;
	static int anInt6131;
	static int anInt6132;
	private int anInt6133;
	static int anInt6134;
	static int anInt6135;
	static int anInt6136;
	static int anInt6137;
	static int anInt6138;
	static int anInt6139;
	static int anInt6140;
	static int anInt6141;
	static int anInt6142;
	static int anInt6143;
	static int anInt6144;
	static int anInt6145;
	static int anInt6146;
	static int anInt6147;
	static int anInt6148;
	static int anInt6149;
	static int anInt6150;
	static int anInt6151;
	static int anInt6152;
	static int anInt6153;
	static int anInt6154;
	static int anInt6155;
	static int anInt6156;
	static int anInt6157;
	static int anInt6158;
	static int anInt6159;
	static int anInt6160;
	static int anInt6161;
	static int anInt6162;
	static int anInt6163;
	static int anInt6164;
	static int anInt6165;
	static int anInt6166;
	protected Index aClass302_6167;
	static int anInt6168;
	static int anInt6169;
	static int anInt6170;
	protected NativeHeapBuffer aNativeHeapBuffer6171;
	static int anInt6172;
	static int anInt6173;
	static int anInt6174;
	static int anInt6175;
	static int anInt6176;
	static int anInt6177;
	static int anInt6178;
	static int anInt6179;
	static int anInt6180;
	static int anInt6181;
	static int anInt6182;
	static int anInt6183;
	static int anInt6184;
	static int anInt6185;
	static int anInt6186;
	static int anInt6187;
	static int anInt6188;
	static int anInt6189;
	static int anInt6190;
	static int anInt6191;
	static int anInt6192;
	protected NativeInterface aNativeInterface6193;
	static int anInt6194;
	static int anInt6195;
	static int anInt6196;
	static int anInt6197;
	static int anInt6198;
	static int anInt6199;
	static int anInt6200;
	static int anInt6201;
	static int anInt6202;
	static int anInt6203;
	static int anInt6204;
	static int anInt6205;
	static int anInt6206;
	static int anInt6207;
	static int anInt6208;
	static int anInt6209;
	static int anInt6210;
	static int anInt6211;
	static int anInt6212;
	static int anInt6213;
	static int anInt6214;
	static int anInt6215;
	static int anInt6216;
	static int anInt6217;
	static int anInt6218;
	static int anInt6219;
	static int anInt6220;
	static int anInt6221;
	static int anInt6222;
	static int anInt6223;
	static int anInt6224;
	static int anInt6225;
	static int anInt6226;
	static int anInt6227;
	static int anInt6228;
	static int anInt6229;
	static int anInt6230;
	static int anInt6231;
	static int anInt6232;
	static int anInt6233;
	static int anInt6234;
	static int anInt6235;
	private java.awt.Canvas aCanvas6236;
	static int anInt6237;
	static int anInt6238;
	protected int anInt6239;
	static int anInt6240;
	static int anInt6241;
	static int anInt6242;
	static int anInt6243;
	static int anInt6244;
	static int anInt6245;
	static int anInt6246;
	protected Class5 aClass5_6247;
	static int anInt6248;
	static int anInt6249;
	static int anInt6250;
	protected java.awt.Canvas aCanvas6251;
	static int anInt6252;
	static int anInt6253;
	static int anInt6254;
	static int anInt6255;
	static int anInt6256;
	static int anInt6257;
	static int anInt6258;
	static int anInt6259;
	protected int anInt6260;
	protected boolean aBoolean6261 = true;
	protected Class336_Sub1 aClass336_Sub1_6262 = new Class336_Sub1();
	static int anInt6263;
	protected int anInt6264;
	static int anInt6265;
	protected int anInt6266;
	protected Class336_Sub1 aClass336_Sub1_6267 = new Class336_Sub1();
	protected Class336_Sub1 aClass336_Sub1_6268 = new Class336_Sub1();
	protected Class336_Sub1 aClass336_Sub1_6269 = new Class336_Sub1();
	private Class336_Sub1 aClass336_Sub1_6270 = new Class336_Sub1();
	private Class336_Sub1 aClass336_Sub1_6271 = new Class336_Sub1();
	protected float aFloat6272;
	private float[] aFloatArray6273;
	protected float aFloat6274;
	protected boolean aBoolean6275;
	protected int anInt6276;
	protected boolean aBoolean6277;
	private float aFloat6278;
	protected boolean aBoolean6279;
	protected int anInt6280;
	private Class290 aClass290_6281;
	protected float aFloat6282;
	protected boolean aBoolean6283;
	protected int anInt6284 = 0;
	private float[] aFloatArray6285;
	protected int anInt6286;
	private int anInt6287;
	protected boolean aBoolean6288;
	protected int anInt6289;
	private Class307 aClass307_6290;
	private int anInt6291;
	protected float[] aFloatArray6292;
	protected float aFloat6293;
	protected int anInt6294;
	protected int anInt6295;
	protected Class94[] aClass94Array6296;
	private boolean aBoolean6297;
	protected float aFloat6298;
	protected boolean aBoolean6299;
	protected float aFloat6300;
	protected Class26 aClass26_6301;
	protected float aFloat6302;
	protected Class56 aClass56_6303;
	protected float[] aFloatArray6304;
	private float[] aFloatArray6305;
	protected boolean aBoolean6306;
	protected int anInt6307;
	protected float aFloat6308;
	private Interface13[] anInterface13Array6309;
	protected boolean aBoolean6310;
	protected float aFloat6311;
	private Stream aStream6312;
	protected boolean aBoolean6313;
	protected float[] aFloatArray6314;
	private int anInt6315;
	private float[] aFloatArray6316;
	protected float aFloat6317;
	protected int anInt6318;
	protected int anInt6319;
	protected int anInt6320;
	private float[] aFloatArray6321;
	private boolean aBoolean6322;
	protected float aFloat6323;
	private int anInt6324;
	protected int anInt6325;
	private boolean aBoolean6326;
	protected Class336_Sub1[] aClass336_Sub1Array6327;
	protected float aFloat6328;
	private int anInt6329;
	protected boolean enableBlending;
	protected int anInt6331;
	protected int anInt6332;
	protected int anInt6333;
	private int anInt6334;
	protected int anInt6335;
	private float aFloat6336;
	protected int anInt6337;
	protected boolean aBoolean6338;
	private int anInt6339;
	protected boolean aBoolean6340;
	protected int anInt6341;
	protected boolean aBoolean6342;
	protected Class346[] aClass346Array6343;
	private int anInt6344;
	protected Node_Sub29[] aNode_Sub29Array6345;
	private boolean aBoolean6346;
	private Class270_Sub1 aClass270_Sub1_6347;
	private boolean aBoolean6348;
	private int anInt6349;
	protected int anInt6350;
	protected Class94[] aClass94Array6351;
	private boolean aBoolean6352;
	private Class287 aClass287_6353;
	private int anInt6354;
	protected int anInt6355;
	protected int anInt6356;
	protected Interface13 anInterface13_6357;
	protected int anInt6358;
	private float[] aFloatArray6359;
	protected int anInt6360;
	private int anInt6361;
	protected int anInt6362;
	private float aFloat6363;
	protected int anInt6364;
	protected float aFloat6365;
	protected boolean aBoolean6366;
	protected int anInt6367;
	protected int anInt6368;
	private Class290[] aClass290Array6369;
	protected int anInt6370;
	protected float aFloat6371;
	protected int anInt6372;
	protected Class213 aClass213_6373;
	protected StandardDrawableModel[] aStandardDrawableModelArray6374;
	private Interface15_Impl2 anInterface15_Impl2_6375;
	private Interface15_Impl2 anInterface15_Impl2_6376;
	private Class213 aClass213_6377;
	private Class336_Sub1 aClass336_Sub1_6378;
	private Class213 aClass213_6379;
	protected StandardDrawableModel[] aStandardDrawableModelArray6380;
	private Interface15_Impl1 anInterface15_Impl1_6381;
	protected Class213 aClass213_6382;
	protected Class213 aClass213_6383;
	private Interface15_Impl2 anInterface15_Impl2_6384;
	protected Class213 aClass213_6385;
	private Class213 aClass213_6386;
	protected boolean aBoolean6387;
	private int anInt6388;
	/*synthetic*/ static Class<?> aClass6389;
	
	final void k(int i) {
		anInt6097++;
	}
	
	private final void method1247(int i) {
		method1353(false);
		anInt6125++;
		method1289(false);
		method1302(1);
		method1273(-64);
		method1382(118);
		method1333(false);
		method1313((byte) 108);
		method1340((byte) 74);
		method1370(-47);
		method1308((byte) 125);
		method1374((byte) 102);
		method1269((byte) 21);
		method1259(92);
		method1284(14);
		if (i != 5) {
			method1319(null, null, -18);
		}
		for (int i_0_ = -1 + anInt6370; (i_0_ ^ 0xffffffff) <= -1; i_0_--) {
			method1362(255, i_0_);
			method1263(false);
			method1254(true);
			method1255((byte) -12);
		}
		method1337(6);
		method1261((byte) -18);
		method1334(-38);
		method1360((byte) 117);
		method1293(125);
	}
	
	final int E() {
		anInt6211++;
		return anInt6260 - (-anInt6266 + -anInt6264);
	}
	
	final void ZA(int i, float f, float f_1_, float f_2_, float f_3_, float f_4_) {
		anInt6215++;
		boolean bool = i != anInt6329;
		if (bool || aFloat6274 != f || f_1_ != aFloat6272) {
			anInt6329 = i;
			aFloat6272 = f_1_;
			aFloat6274 = f;
			if (bool) {
				aFloat6323 = (float) (0xff0000 & anInt6329) / 1.671168E7F;
				aFloat6293 = (float) (0xff00 & anInt6329) / 65280.0F;
				aFloat6365 = (float) (0xff & anInt6329) / 255.0F;
				method1353(false);
			}
			aNativeInterface6193.setSunColour(aFloat6323, aFloat6293, aFloat6365, f, f_1_);
			method1289(false);
		}
		if (f_2_ != aFloatArray6285[0] || f_3_ != aFloatArray6285[1] || aFloatArray6285[2] != f_4_) {
			aFloatArray6285[2] = f_4_;
			aFloatArray6285[1] = f_3_;
			aFloatArray6285[0] = f_2_;
			aFloatArray6273[2] = -f_4_;
			aFloatArray6273[0] = -f_2_;
			aFloatArray6273[1] = -f_3_;
			float f_5_ = (float) (1.0 / Math.sqrt((double) (f_3_ * f_3_ + f_2_ * f_2_ + f_4_ * f_4_)));
			aFloatArray6292[2] = f_5_ * f_4_;
			aFloatArray6292[0] = f_2_ * f_5_;
			aFloatArray6292[1] = f_3_ * f_5_;
			aFloatArray6304[1] = -aFloatArray6292[1];
			aFloatArray6304[0] = -aFloatArray6292[0];
			aFloatArray6304[2] = -aFloatArray6292[2];
			aNativeInterface6193.setSunDirection(aFloatArray6292[0], aFloatArray6292[1], aFloatArray6292[2]);
			method1382(-61);
			anInt6286 = (int) (256.0F * f_4_ / f_3_);
			anInt6337 = (int) (f_2_ * 256.0F / f_3_);
		}
		method1333(false);
	}
	
	final Node_Sub29 a(int i, int i_6_, int i_7_, int i_8_, int i_9_, float f) {
		anInt6093++;
		return new Node_Sub29_Sub2(i, i_6_, i_7_, i_8_, i_9_, f);
	}
	
	final void za(int i, int i_10_, int i_11_, int i_12_, int i_13_) {
		anInt6246++;
		method1373(1);
		method1336(-2, i_12_);
		method1304(0, 0, InterfaceSettings.aClass135_7421);
		method1366((byte) -57, InterfaceSettings.aClass135_7421, 0);
		method1277((byte) 61, i_13_);
		aClass336_Sub1_6262.method3877(1.0F, (byte) -112, (float) i_11_, (float) i_11_);
		aClass336_Sub1_6262.method3863(i, i_10_, 0);
		method1266((byte) 109);
		method1365(false, (byte) -128);
		method1354(0, 32011, anInterface15_Impl2_6384);
		method1338(aClass213_6377, 9422);
		method1303(Class169_Sub3.aClass104_8818, 68, 0, 256);
		method1365(true, (byte) -122);
		method1366((byte) -99, Class106.aClass135_1354, 0);
		method1304(0, 0, Class106.aClass135_1354);
	}
	
	final void method1248(Class336_Sub1 class336_sub1, boolean bool) {
		if (bool != true) {
			method1281(-96);
		}
		anInt6204++;
		aClass336_Sub1_6262.method3857(class336_sub1);
		aBoolean6261 = false;
		method1315((byte) -101);
	}
	
	final void T(int i, int i_14_, int i_15_, int i_16_) {
		anInt6168++;
		boolean bool = false;
		if ((anInt6295 ^ 0xffffffff) > (i ^ 0xffffffff)) {
			anInt6295 = i;
			bool = true;
		}
		if ((anInt6294 ^ 0xffffffff) < (i_15_ ^ 0xffffffff)) {
			anInt6294 = i_15_;
			bool = true;
		}
		if ((anInt6325 ^ 0xffffffff) > (i_14_ ^ 0xffffffff)) {
			bool = true;
			anInt6325 = i_14_;
		}
		if (anInt6333 > i_16_) {
			anInt6333 = i_16_;
			bool = true;
		}
		if (bool) {
			if (!aBoolean6387) {
				aBoolean6387 = true;
				method1282(0);
			}
			method1300(0);
			method1375(72);
		}
	}
	
	final void Q(int i, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, byte[] bs, int i_22_, int i_23_) {
		anInt6160++;
	}
	
	final boolean l() {
		anInt6135++;
		return false;
	}
	
	final int method1249(byte b) {
		if (b != 114) {
			method1322(null, false, -19, -16, (byte) 78, null, 104, 113);
		}
		anInt6208++;
		return anInt6315;
	}
	
	final boolean x() {
		anInt6219++;
		return true;
	}
	
	final int b(int i, int i_24_) {
		anInt6098++;
		return i_24_ ^ i & i_24_;
	}
	
	final int method1250(int i) {
		if (i != 0) {
			method1356(60, true);
		}
		anInt6091++;
		return anInt6284;
	}
	
	abstract void method1251(byte b);
	
	final Interface13_Impl1 method1252(int i, byte[] bs, Class68 class68, int i_25_, byte b, boolean bool) {
		if (b != -3) {
			method1356(-32, false);
		}
		anInt6134++;
		return method1327(class68, i_25_, bool, 0, 0, i, true, bs);
	}
	
	final GLSprite a(int i, int i_26_, boolean bool) {
		anInt6182++;
		return new StandardSprite(this, i, i_26_, bool);
	}
	
	final int M() {
		anInt6108++;
		return anInt6388;
	}
	
	private final void method1253(byte b) {
		if (b == 10) {
			if (!aBoolean6352) {
				float[] fs = aFloatArray6321;
				float f = (float) anInt6364;
				float f_27_ = (float) anInt6335;
				float f_28_ = aFloat6363 * (float) -anInt6331 / (float) anInt6362;
				float f_29_ = aFloat6363 * (float) -anInt6341 / (float) anInt6289;
				float f_30_ = (float) (-anInt6341 + anInt6239) * aFloat6363 / (float) anInt6289;
				float f_31_ = aFloat6363 * (float) (anInt6124 + -anInt6331) / (float) anInt6362;
				if (f_30_ != f_29_ && f_31_ != f_28_) {
					fs[11] = 0.0F;
					fs[10] = 1.0F / (f - f_27_);
					fs[7] = 0.0F;
					fs[4] = 0.0F;
					fs[12] = (f_29_ + f_30_) / (f_29_ - f_30_);
					fs[9] = 0.0F;
					fs[15] = 1.0F;
					fs[13] = (f_31_ + f_28_) / (f_31_ - f_28_);
					fs[3] = 0.0F;
					fs[14] = f / (f - f_27_);
					fs[0] = 2.0F / (-f_29_ + f_30_);
					fs[6] = 0.0F;
					fs[2] = 0.0F;
					fs[8] = 0.0F;
					fs[5] = 2.0F / (f_31_ - f_28_);
					fs[1] = 0.0F;
				} else {
					fs[11] = 0.0F;
					fs[13] = 0.0F;
					fs[1] = 0.0F;
					fs[6] = 0.0F;
					fs[15] = 1.0F;
					fs[8] = 0.0F;
					fs[9] = 0.0F;
					fs[10] = 1.0F;
					fs[5] = 1.0F;
					fs[0] = 1.0F;
					fs[14] = 0.0F;
					fs[12] = 0.0F;
					fs[3] = 0.0F;
					fs[4] = 0.0F;
					fs[7] = 0.0F;
					fs[2] = 0.0F;
				}
				method1352((byte) 119);
				aBoolean6352 = true;
			}
			anInt6081++;
		}
	}
	
	abstract void method1254(boolean bool);
	
	final void a(int i, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_, aa var_aa, int i_37_, int i_38_, int i_39_, int i_40_, int i_41_) {
		anInt6111++;
	}
	
	final void method1255(byte b) {
		if (b == -12) {
			if (aClass346Array6343[anInt6284] != Class119.aClass346_1515) {
				aClass346Array6343[anInt6284] = Class119.aClass346_1515;
				aClass336_Sub1Array6327[anInt6284].method3862();
				method1257(9);
			}
			anInt6152++;
		}
	}
	
	private final void method1256(byte b) {
		if (b != 127) {
			o();
		}
		anInt6263++;
		if (!aBoolean6346) {
			float[] fs = aFloatArray6359;
			float f = (float) (anInt6364 * -anInt6341) / (float) anInt6289;
			float f_42_ = (float) (anInt6364 * (-anInt6341 + anInt6239)) / (float) anInt6289;
			float f_43_ = (float) (anInt6331 * anInt6364) / (float) anInt6362;
			float f_44_ = (float) ((anInt6331 + -anInt6124) * anInt6364) / (float) anInt6362;
			if (f != f_42_ && f_43_ != f_44_) {
				float f_45_ = 2.0F * (float) anInt6364;
				fs[0] = f_45_ / (f_42_ - f);
				fs[6] = 0.0F;
				fs[1] = 0.0F;
				fs[3] = 0.0F;
				fs[13] = 0.0F;
				fs[12] = 0.0F;
				fs[14] = aFloat6336 = (float) (anInt6335 * anInt6364) / (float) (anInt6364 - anInt6335);
				fs[7] = 0.0F;
				fs[9] = (f_44_ + f_43_) / (f_43_ - f_44_);
				fs[10] = aFloat6278 = (float) anInt6335 / (float) (-anInt6335 + anInt6364);
				fs[15] = 0.0F;
				fs[2] = 0.0F;
				fs[4] = 0.0F;
				fs[8] = (f + f_42_) / (-f + f_42_);
				fs[11] = -1.0F;
				fs[5] = f_45_ / (f_43_ - f_44_);
			} else {
				fs[13] = 0.0F;
				fs[15] = 1.0F;
				fs[4] = 0.0F;
				fs[3] = 0.0F;
				fs[6] = 0.0F;
				fs[12] = 0.0F;
				fs[10] = 1.0F;
				fs[5] = 1.0F;
				fs[1] = 0.0F;
				fs[7] = 0.0F;
				fs[11] = 0.0F;
				fs[9] = 0.0F;
				fs[8] = 0.0F;
				fs[0] = 1.0F;
				fs[14] = 0.0F;
				fs[2] = 0.0F;
			}
			method1328(b + -222);
			aBoolean6346 = true;
		}
	}
	
	private final void method1257(int i) {
		if (i == 9) {
			method1310((byte) -113);
			anInt6224++;
			if (aClass290_6281 != null) {
				aClass290_6281.method3421(false);
			}
		}
	}
	
	final Interface13_Impl1 method1258(boolean bool, int i, boolean bool_46_, int i_47_, int[] is) {
		anInt6110++;
		if (bool_46_ != true) {
			aFloat6323 = 1.8776237F;
		}
		return method1367(-6331, i_47_, is, 0, 0, bool, i);
	}
	
	abstract void method1259(int i);
	
	final Class270 c(int i, int i_48_, int i_49_, int i_50_, int i_51_, int i_52_) {
		anInt6186++;
		return new Class270_Sub1_Sub1(this, i, i_48_, i_49_, i_50_, i_51_, i_52_);
	}
	
	private final void method1260(byte b) {
		anInt6143++;
		if (!aBoolean6326) {
			float[] fs = aFloatArray6316;
			aBoolean6326 = true;
			if (anInt6239 != 0 && (anInt6124 ^ 0xffffffff) != -1) {
				fs[6] = 0.0F;
				fs[2] = 0.0F;
				fs[10] = 0.5F;
				fs[11] = 0.0F;
				fs[15] = 1.0F;
				fs[8] = 0.0F;
				fs[5] = -2.0F / (float) anInt6124;
				fs[13] = 1.0F;
				fs[1] = 0.0F;
				fs[9] = 0.0F;
				fs[7] = 0.0F;
				fs[12] = -1.0F;
				fs[3] = 0.0F;
				fs[4] = 0.0F;
				fs[14] = 0.5F;
				fs[0] = 2.0F / (float) anInt6239;
			} else {
				fs[10] = 1.0F;
				fs[9] = 0.0F;
				fs[1] = 0.0F;
				fs[4] = 0.0F;
				fs[12] = 0.0F;
				fs[5] = 1.0F;
				fs[6] = 0.0F;
				fs[14] = 0.0F;
				fs[15] = 1.0F;
				fs[11] = 0.0F;
				fs[13] = 0.0F;
				fs[8] = 0.0F;
				fs[3] = 0.0F;
				fs[2] = 0.0F;
				fs[7] = 0.0F;
				fs[0] = 1.0F;
			}
		}
		if (b != 2) {
			anInt6333 = 109;
		}
	}
	
	abstract void method1261(byte b);
	
	final void a(int i, int i_53_, int i_54_, int i_55_, int i_56_, int i_57_, int i_58_, int i_59_, int i_60_) {
		anInt6141++;
		float f = (float) -i + (float) i_54_;
		float f_61_ = (float) i_55_ - (float) i_53_;
		if (f != 0.0F || f_61_ != 0.0F) {
			float f_62_ = (float) (1.0 / Math.sqrt((double) (f * f + f_61_ * f_61_)));
			f_61_ *= f_62_;
			f *= f_62_;
		} else {
			f = 1.0F;
		}
		method1373(1);
		method1336(-2, i_56_);
		method1304(0, 0, InterfaceSettings.aClass135_7421);
		method1366((byte) 113, InterfaceSettings.aClass135_7421, 0);
		method1277((byte) 61, i_57_);
		method1320((byte) -119);
		method1365(false, (byte) -128);
		i_60_ %= i_58_ + i_59_;
		float f_63_ = (float) i_58_ * f;
		float f_64_ = (float) i_58_ * f_61_;
		float f_65_ = 0.0F;
		float f_66_ = 0.0F;
		float f_67_ = f_63_;
		float f_68_ = f_64_;
		if ((i_58_ ^ 0xffffffff) <= (i_60_ ^ 0xffffffff)) {
			f_68_ = (float) (i_58_ - i_60_) * f_61_;
			f_67_ = f * (float) (i_58_ + -i_60_);
		} else {
			f_66_ = f_61_ * (float) (-i_60_ + (i_58_ - -i_59_));
			f_65_ = f * (float) (i_58_ - -i_59_ + -i_60_);
		}
		float f_69_ = f_65_ + (float) i;
		float f_70_ = f_66_ + (float) i_53_;
		float f_71_ = (float) i_59_ * f;
		float f_72_ = f_61_ * (float) i_59_;
		for (;;) {
			if ((i_54_ ^ 0xffffffff) < (i ^ 0xffffffff)) {
				if ((float) i_54_ < f_69_) {
					break;
				}
				if (f_69_ + f_67_ > (float) i_54_) {
					f_67_ = (float) i_54_ - f_69_;
				}
			} else {
				if (f_69_ < (float) i_54_) {
					break;
				}
				if (f_67_ + f_69_ < (float) i_54_) {
					f_67_ = (float) i_54_ - f_69_;
				}
			}
			if (i_55_ > i_53_) {
				if (f_70_ > (float) i_55_) {
					break;
				}
				if ((float) i_55_ < f_70_ + f_68_) {
					f_68_ = -f_70_ + (float) i_55_;
				}
			} else {
				if (f_70_ < (float) i_55_) {
					break;
				}
				if ((float) i_55_ > f_70_ + f_68_) {
					f_68_ = -f_70_ + (float) i_55_;
				}
			}
			if (!method1381(f_69_ + f_67_, 0.0F, f_69_, f_68_ + f_70_, f_70_, 0.0F, 5)) {
				return;
			}
			f_69_ += f_71_ + f_67_;
			method1348(1);
			f_70_ += f_68_ + f_72_;
			f_67_ = f_63_;
			f_68_ = f_64_;
		}
		method1365(true, (byte) -115);
		method1366((byte) 65, Class106.aClass135_1354, 0);
		method1304(0, 0, Class106.aClass135_1354);
	}
	
	abstract Interface13_Impl3 method1262(Class68 class68, byte[] bs, byte b, int i, int i_73_, int i_74_);
	
	final Class336 y() {
		anInt6087++;
		return new Class336_Sub1();
	}
	
	abstract void method1263(boolean bool);
	
	final Class336_Sub1 method1264(boolean bool) {
		if (bool != false) {
			return null;
		}
		anInt6203++;
		return aClass336_Sub1_6262;
	}
	
	final boolean z() {
		anInt6130++;
		return aClass290Array6369[3].method3414((byte) -121);
	}
	
	abstract void method1265(java.awt.Canvas canvas, Object object, int i);
	
	final void method1266(byte b) {
		anInt6228++;
		aBoolean6261 = false;
		method1315((byte) -101);
		if (b < 103) {
			anInt6286 = 64;
		}
	}
	
	final void DA(int i, int i_75_, int i_76_, int i_77_) {
		anInt6331 = i_75_;
		anInt6289 = i_76_;
		anInt6116++;
		anInt6362 = i_77_;
		anInt6341 = i;
		method1359(74);
		method1286(28214);
		method1376(530);
		method1375(88);
	}
	
	static final void method1267(GraphicsToolkit graphicstoolkit, int i, int i_78_, int i_79_, int i_80_, int i_81_, int i_82_, boolean bool, boolean bool_83_) {
		CacheNode_Sub18.aGraphicsToolkit9607 = graphicstoolkit;
		Class22.anInt427 = i;
		Class188_Sub2.aBoolean6868 = Class22.anInt427 > 1 && CacheNode_Sub18.aGraphicsToolkit9607.s();
		Class36.anInt549 = i_78_;
		Class179.anInt2129 = 1 << Class36.anInt549;
		Class135.anInt1692 = Class179.anInt2129 >> 1;
		Math.sqrt((double) (Class135.anInt1692 * Class135.anInt1692 + Class135.anInt1692 * Class135.anInt1692));
		Class159.anInt1995 = i_79_;
		Class328.anInt4115 = i_80_;
		Node_Sub50.anInt7623 = i_81_;
		Node_Sub9_Sub1.anInt9656 = i_82_;
		Class146.aClass10_1815 = Class290_Sub3.method3429(true);
		Class194_Sub2.method1970(27);
		Class256.aClass261ArrayArrayArray3240 = new Class261[i_79_][Class328.anInt4115][Node_Sub50.anInt7623];
		Node_Sub38_Sub37.aPlaneArray10466 = new Plane[i_79_];
		if (bool) {
			Player.anIntArrayArray11128 = new int[Class328.anInt4115][Node_Sub50.anInt7623];
			Class320_Sub18.aByteArrayArray8379 = new byte[Class328.anInt4115][Node_Sub50.anInt7623];
			Class146.aShortArrayArray1802 = new short[Class328.anInt4115][Node_Sub50.anInt7623];
			Class225.aClass261ArrayArrayArray2680 = new Class261[1][Class328.anInt4115][Node_Sub50.anInt7623];
			Class368.aPlaneArray4548 = new Plane[1];
		} else {
			Player.anIntArrayArray11128 = null;
			Class320_Sub18.aByteArrayArray8379 = null;
			Class146.aShortArrayArray1802 = null;
			Class225.aClass261ArrayArrayArray2680 = null;
			Class368.aPlaneArray4548 = null;
		}
		if (bool_83_) {
			Class91.aLongArrayArrayArray1228 = new long[i_79_][i_80_][i_81_];
			Class143.aClass326Array1771 = new Class326[65535];
			Class147.aBooleanArray1820 = new boolean[65535];
			Class188_Sub1_Sub1.anInt9337 = 0;
		} else {
			Class91.aLongArrayArrayArray1228 = null;
			Class143.aClass326Array1771 = null;
			Class147.aBooleanArray1820 = null;
			Class188_Sub1_Sub1.anInt9337 = 0;
		}
		Node_Sub38_Sub17.method2842(false);
		Class303.anAnimableArray3827 = new Animable[2];
		SeekableFile.anAnimableArray3884 = new Animable[2];
		Node_Sub36.anAnimableArray7429 = new Animable[2];
		Class32.anAnimableArray516 = new Animable[10000];
		Node_Sub42.anInt7527 = 0;
		Class262_Sub15.anAnimableArray7817 = new Animable[5000];
		Class348.anInt4290 = 0;
		Node_Sub52.aMobileArray7648 = new Mobile[5000];
		Class63.anInt923 = 0;
		Class139.aBooleanArrayArray1730 = new boolean[Node_Sub9_Sub1.anInt9656 + Node_Sub9_Sub1.anInt9656 + 1][Node_Sub9_Sub1.anInt9656 + Node_Sub9_Sub1.anInt9656 + 1];
		Class75.aBooleanArrayArray1002 = new boolean[Node_Sub9_Sub1.anInt9656 + Node_Sub9_Sub1.anInt9656 + 2][Node_Sub9_Sub1.anInt9656 + Node_Sub9_Sub1.anInt9656 + 2];
		Node_Sub38_Sub7.anIntArray10150 = new int[Node_Sub9_Sub1.anInt9656 + Node_Sub9_Sub1.anInt9656 + 2];
		Node_Sub36_Sub3.aClass179_10058 = Node_Sub36_Sub3.aClass179_10062;
		if (Class188_Sub2.aBoolean6868) {
			Class234.aBooleanArrayArrayArray2790 = new boolean[i_79_][Node_Sub9_Sub1.anInt9656 + Node_Sub9_Sub1.anInt9656 + 1][Node_Sub9_Sub1.anInt9656 + Node_Sub9_Sub1.anInt9656 + 1];
			Class150_Sub2.aBooleanArrayArrayArray8960 = new boolean[i_79_][][];
			if (GraphicsToolkit.aClass33Array1549 != null) {
				Class262_Sub8.method3169();
			}
			GraphicsToolkit.aClass33Array1549 = new Class33[Class22.anInt427];
			CacheNode_Sub18.aGraphicsToolkit9607.j(GraphicsToolkit.aClass33Array1549.length + 1);
			CacheNode_Sub18.aGraphicsToolkit9607.k(0);
			for (int i_84_ = 0; i_84_ < GraphicsToolkit.aClass33Array1549.length; i_84_++) {
				GraphicsToolkit.aClass33Array1549[i_84_] = new Class33(i_84_ + 1, CacheNode_Sub18.aGraphicsToolkit9607);
				new Thread(GraphicsToolkit.aClass33Array1549[i_84_], "wr" + i_84_).start();
			}
			int i_85_;
			if (Class22.anInt427 == 2) {
				i_85_ = 4;
				Class290.anInt3655 = 2;
			} else if (Class22.anInt427 == 3) {
				i_85_ = 6;
				Class290.anInt3655 = 3;
			} else {
				i_85_ = 8;
				Class290.anInt3655 = 4;
			}
			Class364.aClass273Array4513 = new Class273[i_85_];
			for (int i_86_ = 0; i_86_ < i_85_; i_86_++)
				Class364.aClass273Array4513[i_86_] = new Class273(Node_Sub40.aStringArrayArray7505[Class22.anInt427 - 2][i_86_]);
		} else {
			Class290.anInt3655 = 1;
		}
		Node_Sub38_Sub25.anIntArray10358 = new int[Class290.anInt3655 - 1];
		Class270_Sub2.anIntArray8039 = new int[Class290.anInt3655 - 1];
	}
	
	final void method1268(int i) {
		anInt6103++;
		if (i != 0) {
			p();
		}
		if ((anInt6334 ^ 0xffffffff) != -9) {
			method1368((byte) -118);
			method1371(true, false);
			method1347(1, true);
			method1307(i + -102, true);
			method1277((byte) 61, 1);
			anInt6334 = 8;
		}
	}
	
	abstract void method1269(byte b);
	
	final int c(int i, int i_87_) {
		anInt6244++;
		return i_87_ | i;
	}
	
	final void method1270(byte b, float f) {
		anInt6157++;
		if (b < -70) {
			if (aFloat6363 != f) {
				aFloat6363 = f;
				method1359(113);
			}
		}
	}
	
	private final void method1271(int i, int i_88_, Class104 class104) {
		anInt6197++;
		method1354(i, 32011, anInterface15_Impl2_6375);
		method1338(aClass213_6379, 9422);
		method1303(class104, 36, 0, i_88_);
	}
	
	final GLSprite a(int i, int i_89_, int i_90_, int i_91_, boolean bool) {
		anInt6187++;
		StandardSprite standardsprite = new StandardSprite(this, i_90_, i_91_, bool);
		standardsprite.method1195(0, 0, i_90_, i_91_, i, i_89_);
		return standardsprite;
	}
	
	static final void method1272(int i, File file, boolean bool) {
		anInt6172++;
		if (Class66_Sub1.anObject8988 == null) {
			Class381.method4172(-124);
		}
		try {
			if (i != 0) {
				method1267(null, -51, 39, 90, 103, -123, -5, true, true);
			}
			Class<?> var_class = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
			Method method = var_class.getDeclaredMethod("dumpHeap", aClass6389 == null ? aClass6389 = method1383("java.lang.String") : aClass6389, Boolean.TYPE);
			method.invoke(Class66_Sub1.anObject8988, file.getAbsolutePath(), new Boolean(bool));
		} catch (Exception exception) {
			//System.out.println("HeapDump error:");
			exception.printStackTrace();
		}
	}
	
	void method1273(int i) {
		anInt6158++;
		anInt6356 = anInt6358;
		if (i >= -20) {
			anInt6333 = -112;
		}
		anInt6358 = 0;
	}
	
	final void a(Class198 class198, int i) {
		aClass287_6353.method3397(class198, i, 0, this);
		anInt6101++;
	}
	
	final boolean k() {
		anInt6082++;
		return true;
	}
	
	final void method1274(byte b, boolean bool) {
		method1336(-2, b | (b << 24 | b << 16 | b << 8));
		if (bool != false) {
			B();
		}
		anInt6265++;
	}
	
	void u() {
		if (!aBoolean6322) {
			for (Node node = aClass312_6088.method3613(65280); node != null; node = aClass312_6088.method3620(16776960))
				((za_Sub2) node).method2995((byte) -115);
			Enumeration<Canvas> enumeration = aHashtable6094.keys();
			while (enumeration.hasMoreElements()) {
				java.awt.Canvas canvas = enumeration.nextElement();
				method1275(-96, canvas, aHashtable6094.get(canvas));
			}
			Class160.method1727(false, (byte) 73, true);
			aNativeInterface6193.release();
			aBoolean6322 = true;
		}
		anInt6226++;
	}
	
	abstract void method1275(int i, java.awt.Canvas canvas, Object object);
	
	abstract void method1276(int i, byte b, int i_92_, Interface15_Impl1 interface15_impl1, int i_93_, Class104 class104, int i_94_);
	
	final void method1277(byte b, int i) {
		if (anInt6344 != i) {
			boolean bool;
			Class26 class26;
			boolean bool_95_;
			if ((i ^ 0xffffffff) != -2) {
				if (i != 2) {
					if ((i ^ 0xffffffff) != -129) {
						class26 = Class231.aClass26_2750;
						bool = false;
						bool_95_ = false;
					} else {
						bool = true;
						class26 = Node_Sub15_Sub7.aClass26_9827;
						bool_95_ = true;
					}
				} else {
					class26 = Class339_Sub3.aClass26_8664;
					bool = false;
					bool_95_ = true;
				}
			} else {
				bool = true;
				class26 = Class47.aClass26_688;
				bool_95_ = true;
			}
			if (!aBoolean6279 == bool) {
				aBoolean6279 = bool;
				method1284(b + -47);
			}
			if (bool_95_ != enableBlending) {
				enableBlending = bool_95_;
				method1269((byte) 106);
			}
			if (class26 != aClass26_6301) {
				aClass26_6301 = class26;
				method1259(101);
			}
			anInt6344 = i;
			anInt6334 &= ~0x1c;
		}
		anInt6243++;
		if (b != 61) {
			c(-53, -111, 97, -41, -124, -52);
		}
	}
	
	final void method1278(byte b, int i) {
		if ((i ^ 0xffffffff) == -2) {
			method1318(-30, Class117_Sub1.aClass94_4924, Class117_Sub1.aClass94_4924);
		} else if (i != 0) {
			if ((i ^ 0xffffffff) != -3) {
				if ((i ^ 0xffffffff) != -4) {
					if ((i ^ 0xffffffff) == -5) {
						method1318(-30, GameStub.aClass94_11, GameStub.aClass94_11);
					}
				} else {
					method1318(-30, Class116.aClass94_5075, Class236.aClass94_2898);
				}
			} else {
				method1318(-30, Class117_Sub1.aClass94_4924, Class385.aClass94_4911);
			}
		} else {
			method1318(-30, Class116.aClass94_5075, Class116.aClass94_5075);
		}
		if (b == -12) {
			anInt6136++;
		}
	}
	
	final Class336 n() {
		anInt6259++;
		return aClass336_Sub1_6267;
	}
	
	final void a(Class270 class270) {
		aClass270_Sub1_6347 = (Class270_Sub1) class270;
		anInt6175++;
	}
	
	abstract void method1279(int i, byte b);
	
	private final void method1280(byte b) {
		anInt6155++;
		anInterface15_Impl2_6384 = method1380(2, false);
		anInterface15_Impl2_6384.method37(12, 3096, -12093);
		for (int i = 0; i < 4; i++) {
			jaclib.memory.Buffer buffer = anInterface15_Impl2_6384.method40(-17, true);
			if (buffer != null) {
				Stream stream = method1324(true, buffer);
				stream.a(0.0F);
				stream.a(0.0F);
				stream.a(0.0F);
				for (int i_96_ = 0; i_96_ <= 256; i_96_++) {
					double d = 3.141592653589793 * (double) (i_96_ * 2) / 256.0;
					float f = (float) Math.cos(d);
					float f_97_ = (float) Math.sin(d);
					if (Stream.b()) {
						stream.a(f_97_);
						stream.a(f);
						stream.a(0.0F);
					} else {
						stream.b(f_97_);
						stream.b(f);
						stream.b(0.0F);
					}
				}
				stream.c();
				if (anInterface15_Impl2_6384.method39(-104)) {
					break;
				}
			}
		}
		if (b <= 108) {
			k(39);
		}
		aClass213_6377 = method1372((byte) -121, new Class207[] { new Class207(Class126.aClass126_1620) });
	}
	
	private final void method1281(int i) {
		anInt6201++;
		if (aClass56_6303 != Class366.aClass56_4527) {
			Class56 class56 = aClass56_6303;
			aClass56_6303 = Class366.aClass56_4527;
			if (!class56.method566(120)) {
				method1305(false);
			}
			method1253((byte) 10);
			aFloatArray6314 = aFloatArray6321;
			method1350(false);
			anInt6334 &= ~0x7;
		}
		if (i > -102) {
			aFloat6336 = 1.0407325F;
		}
	}
	
	abstract void method1282(int i);
	
	final int e() {
		anInt6198++;
		return anInt6367 + -2;
	}
	
	final int XA() {
		anInt6085++;
		return anInt6335;
	}
	
	final void method1283(byte b) {
		if (b == -128) {
			anInt6129++;
			method1271(0, 2, Class169_Sub3.aClass104_8818);
		}
	}
	
	final void a(za var_za) {
		aNativeHeap6084 = ((za_Sub2) var_za).aNativeHeap10510;
		anInt6188++;
		aNativeHeapBuffer6171 = aNativeHeap6084.a(32768, false);
	}
	
	final int r(int i, int i_98_, int i_99_, int i_100_, int i_101_, int i_102_, int i_103_) {
		anInt6230++;
		int i_104_ = 0;
		float f = aClass336_Sub1_6267.aFloat8542 + (aClass336_Sub1_6267.aFloat8556 * (float) i_99_ + (aClass336_Sub1_6267.aFloat8508 * (float) i_98_ + (float) i * aClass336_Sub1_6267.aFloat8547));
		float f_105_ = aClass336_Sub1_6267.aFloat8542 + ((float) i_102_ * aClass336_Sub1_6267.aFloat8556 + (aClass336_Sub1_6267.aFloat8547 * (float) i_100_ + (float) i_101_ * aClass336_Sub1_6267.aFloat8508));
		if (!((float) anInt6364 > f) || !((float) anInt6364 > f_105_)) {
			if ((float) anInt6335 < f && (float) anInt6335 < f_105_) {
				i_104_ |= 0x20;
			}
		} else {
			i_104_ |= 0x10;
		}
		int i_106_ = (int) ((aClass336_Sub1_6267.aFloat8530 * (float) i + (float) i_98_ * aClass336_Sub1_6267.aFloat8531 + aClass336_Sub1_6267.aFloat8529 * (float) i_99_ + aClass336_Sub1_6267.aFloat8550) * (float) anInt6289 / (float) i_103_);
		int i_107_ = (int) ((float) anInt6289 * (aClass336_Sub1_6267.aFloat8550 + (aClass336_Sub1_6267.aFloat8530 * (float) i_100_ + (float) i_101_ * aClass336_Sub1_6267.aFloat8531 + aClass336_Sub1_6267.aFloat8529 * (float) i_102_)) / (float) i_103_);
		if ((float) i_106_ < aFloat6298 && aFloat6298 > (float) i_107_) {
			i_104_ |= 0x1;
		} else if ((float) i_106_ > aFloat6317 && (float) i_107_ > aFloat6317) {
			i_104_ |= 0x2;
		}
		int i_108_ = (int) ((float) anInt6362 * (aClass336_Sub1_6267.aFloat8538 * (float) i_98_ + aClass336_Sub1_6267.aFloat8544 * (float) i + (float) i_99_ * aClass336_Sub1_6267.aFloat8535 + aClass336_Sub1_6267.aFloat8521) / (float) i_103_);
		int i_109_ = (int) ((aClass336_Sub1_6267.aFloat8535 * (float) i_102_ + ((float) i_100_ * aClass336_Sub1_6267.aFloat8544 + aClass336_Sub1_6267.aFloat8538 * (float) i_101_) + aClass336_Sub1_6267.aFloat8521) * (float) anInt6362 / (float) i_103_);
		if (!(aFloat6282 > (float) i_108_) || !((float) i_109_ < aFloat6282)) {
			if ((float) i_108_ > aFloat6308 && aFloat6308 < (float) i_109_) {
				i_104_ |= 0x8;
			}
		} else {
			i_104_ |= 0x4;
		}
		return i_104_;
	}
	
	abstract void method1284(int i);
	
	final void method1285(int i) {
		anInt6075++;
		Enumeration<Canvas> enumeration = aHashtable6094.keys();
		while (enumeration.hasMoreElements()) {
			java.awt.Canvas canvas = enumeration.nextElement();
			method1275(-106, canvas, aHashtable6094.get(canvas));
		}
		anInterface15_Impl2_6375.method38(false);
		anInterface15_Impl2_6376.method38(false);
		anInterface15_Impl2_6384.method38(false);
		for (int i_110_ = i; i_110_ < 7; i_110_++)
			aStandardDrawableModelArray6374[i_110_].method690(0);
		aClass287_6353.method3396((byte) -74);
		anInterface15_Impl1_6381.method38(false);
	}
	
	private final void method1286(int i) {
		anInt6194++;
		aBoolean6346 = false;
		if (i != 28214) {
			aFloat6298 = 1.0441684F;
		}
		method1256((byte) 127);
		if (aClass56_6303 == Class274.aClass56_4971) {
			method1350(false);
		}
	}
	
	final void L(int i, int i_111_, int i_112_) {
		anInt6120++;
		if ((anInt6276 ^ 0xffffffff) != (i ^ 0xffffffff) || anInt6355 != i_111_ || (i_112_ ^ 0xffffffff) != (anInt6372 ^ 0xffffffff)) {
			anInt6276 = i;
			anInt6355 = i_111_;
			anInt6372 = i_112_;
			method1317((byte) 40);
			method1308((byte) 85);
		}
	}
	
	final void EA(int i, int i_113_, int i_114_, int i_115_) {
		anInt6212++;
		if (!aBoolean6288) {
			throw new RuntimeException("");
		}
		anInt6315 = i_113_;
		anInt6287 = i_114_;
		anInt6324 = i;
		anInt6339 = i_115_;
		if (aBoolean6348) {
			aClass290Array6369[3].method3420(12);
			aClass290Array6369[3].method3416((byte) -56);
		}
	}
	
	abstract Interface13_Impl2 method1287(int i, int[][] is, boolean bool, int i_116_);
	
	final void method1288(int i) {
		if (i == 0) {
			if (anInt6334 != 4) {
				method1331(i + -14);
				method1371(false, false);
				method1296(122, false);
				method1347(i + 1, false);
				method1307(-84, false);
				method1332(i ^ 0x3, false, -2, false);
				method1277((byte) 61, 1);
				method1278((byte) -12, 0);
				anInt6334 = 4;
			}
			anInt6227++;
		}
	}
	
	abstract void method1289(boolean bool);
	
	final Class336_Sub1 method1290(byte b) {
		if (b != 86) {
			aFloat6272 = 0.26983792F;
		}
		anInt6109++;
		return aClass336_Sub1Array6327[anInt6284];
	}
	
	abstract Interface13_Impl1 method1291(Class68 class68, Class372 class372, int i, int i_117_, int i_118_);
	
	final void U(int i, int i_119_, int i_120_, int i_121_, int i_122_) {
		anInt6169++;
		a(i, i_119_, i - -i_120_, i_119_, i_121_, i_122_);
	}
	
	final Class336_Sub1 method1292(byte b) {
		if (b != -82) {
			return null;
		}
		anInt6207++;
		return aClass336_Sub1_6270;
	}
	
	abstract void method1293(int i);
	
	final za a(int i) {
		anInt6184++;
		za_Sub2 var_za_Sub2 = new za_Sub2(i);
		aClass312_6088.method3625((byte) -54, var_za_Sub2);
		return var_za_Sub2;
	}
	
	final boolean r() {
		anInt6090++;
		return true;
	}
	
	private final void method1294(byte b) {
		anInt6180++;
		if (b == -34) {
			aBoolean6326 = false;
			if (aClass56_6303 == Class54.aClass56_823) {
				method1260((byte) 2);
				method1350(false);
			}
		}
	}
	
	final void aa(int i, int i_123_, int i_124_, int i_125_, int i_126_, int i_127_) {
		method1373(1);
		anInt6138++;
		method1336(-2, i_126_);
		method1304(0, 0, InterfaceSettings.aClass135_7421);
		method1366((byte) -68, InterfaceSettings.aClass135_7421, 0);
		method1277((byte) 61, i_127_);
		aClass336_Sub1_6262.method3877(1.0F, (byte) -112, (float) i_125_, (float) i_124_);
		aClass336_Sub1_6262.method3863(i, i_123_, 0);
		method1266((byte) 123);
		method1365(false, (byte) -122);
		method1283((byte) -128);
		method1365(true, (byte) -114);
		method1366((byte) 64, Class106.aClass135_1354, 0);
		method1304(0, 0, Class106.aClass135_1354);
	}
	
	abstract boolean method1295(Class68 class68, Class372 class372, int i);
	
	final void method1296(int i, boolean bool) {
		anInt6149++;
		if (i < 110) {
			method1299(120);
		}
		if (aBoolean6340 == !bool) {
			aBoolean6340 = bool;
			method1302(1);
			anInt6334 &= ~0x7;
		}
	}
	
	final void f(int i, int i_128_) {
		anInt6079++;
		if (i != anInt6364 || i_128_ != anInt6335) {
			anInt6335 = i_128_;
			anInt6364 = i;
			method1286(28214);
			method1359(-88);
			method1317((byte) 40);
		}
	}
	
	final void method1297(int i, Class346 class346) {
		anInt6177++;
		aClass346Array6343[anInt6284] = class346;
		if (i != -21029) {
			method1265(null, null, -43);
		}
		method1257(9);
	}
	
	final GLSprite a(Class383 class383, boolean bool) {
		anInt6076++;
		GLSprite glsprite;
		if ((class383.anInt4897 ^ 0xffffffff) != -1 && class383.anInt4900 != 0) {
			int[] is = new int[class383.anInt4897 * class383.anInt4900];
			int i = 0;
			int i_129_ = 0;
			if (class383.aByteArray4905 != null) {
				for (int i_130_ = 0; class383.anInt4900 > i_130_; i_130_++) {
					for (int i_131_ = 0; class383.anInt4897 > i_131_; i_131_++) {
						is[i_129_++] = Node_Sub16.method2590(class383.anIntArray4904[Node_Sub30.method2723(class383.aByteArray4903[i], 255)], class383.aByteArray4905[i] << 24);
						i++;
					}
				}
			} else {
				for (int i_132_ = 0; (i_132_ ^ 0xffffffff) > (class383.anInt4900 ^ 0xffffffff); i_132_++) {
					for (int i_133_ = 0; i_133_ < class383.anInt4897; i_133_++) {
						int i_134_ = class383.anIntArray4904[class383.aByteArray4903[i++] & 0xff];
						is[i_129_++] = (i_134_ ^ 0xffffffff) == -1 ? 0 : Node_Sub16.method2590(i_134_, -16777216);
					}
				}
			}
			glsprite = this.method1235(class383.anInt4897, class383.anInt4897, class383.anInt4900, is, 0, 7468);
		} else {
			glsprite = this.method1235(1, 1, 1, new int[1], 0, 7468);
		}
		glsprite.method1178(class383.anInt4902, class383.anInt4898, class383.anInt4901, class383.anInt4899);
		return glsprite;
	}
	
	final Interface15_Impl1 method1298(int i, int i_135_) {
		if (i != 0) {
			aFloat6302 = -1.5301926F;
		}
		anInt6252++;
		if ((2 * i_135_ ^ 0xffffffff) < (anInterface15_Impl1_6381.method57((byte) -126) ^ 0xffffffff)) {
			anInterface15_Impl1_6381.method56(-1696, i_135_);
		}
		return anInterface15_Impl1_6381;
	}
	
	private final void method1299(int i) {
		if (aCanvas6236 == null) {
			anInt6100 = anInt6133 = 1;
		} else {
			Dimension dimension = aCanvas6236.getSize();
			anInt6133 = dimension.height;
			anInt6100 = dimension.width;
		}
		anInt6092++;
		anInt6124 = anInt6133;
		anInt6239 = anInt6100;
		method1294((byte) -34);
		method1286(28214);
		method1359(69);
		method1261((byte) -18);
		method1375(118);
		method1376(530);
		la();
		if (i > -78) {
			aClass336_Sub1_6267 = null;
		}
	}
	
	abstract void method1300(int i);
	
	private final void method1301(int i) {
		anInt6099++;
		anInterface15_Impl2_6375 = method1380(2, false);
		anInterface15_Impl2_6375.method37(28, 140, -12093);
		for (int i_136_ = 0; (i_136_ ^ 0xffffffff) > -5; i_136_++) {
			jaclib.memory.Buffer buffer = anInterface15_Impl2_6375.method40(113, true);
			if (buffer != null) {
				Stream stream = method1324(true, buffer);
				if (Stream.b()) {
					stream.a(0.0F);
					stream.a(0.0F);
					stream.a(0.0F);
					stream.a(0.0F);
					stream.a(0.0F);
					stream.a(0.0F);
					stream.a(0.0F);
					stream.a(0.0F);
					stream.a(1.0F);
					stream.a(0.0F);
					stream.a(0.0F);
					stream.a(1.0F);
					stream.a(0.0F);
					stream.a(1.0F);
					stream.a(1.0F);
					stream.a(1.0F);
					stream.a(0.0F);
					stream.a(1.0F);
					stream.a(1.0F);
					stream.a(1.0F);
					stream.a(1.0F);
					stream.a(1.0F);
					stream.a(0.0F);
					stream.a(0.0F);
					stream.a(1.0F);
					stream.a(0.0F);
					stream.a(1.0F);
					stream.a(0.0F);
					stream.a(0.0F);
					stream.a(0.0F);
					stream.a(0.0F);
					stream.a(0.0F);
					stream.a(0.0F);
					stream.a(0.0F);
					stream.a(0.0F);
				} else {
					stream.b(0.0F);
					stream.b(0.0F);
					stream.b(0.0F);
					stream.b(0.0F);
					stream.b(0.0F);
					stream.b(0.0F);
					stream.b(0.0F);
					stream.b(0.0F);
					stream.b(1.0F);
					stream.b(0.0F);
					stream.b(0.0F);
					stream.b(1.0F);
					stream.b(0.0F);
					stream.b(1.0F);
					stream.b(1.0F);
					stream.b(1.0F);
					stream.b(0.0F);
					stream.b(1.0F);
					stream.b(1.0F);
					stream.b(1.0F);
					stream.b(1.0F);
					stream.b(1.0F);
					stream.b(0.0F);
					stream.b(0.0F);
					stream.b(1.0F);
					stream.b(0.0F);
					stream.b(1.0F);
					stream.b(0.0F);
					stream.b(0.0F);
					stream.b(0.0F);
					stream.b(0.0F);
					stream.b(0.0F);
					stream.b(0.0F);
					stream.b(0.0F);
					stream.b(0.0F);
				}
				stream.c();
				if (anInterface15_Impl2_6375.method39(123)) {
					break;
				}
			}
		}
		aClass213_6379 = method1372((byte) -123, new Class207[] { new Class207(new Class126[] { Class126.aClass126_1620, Class126.aClass126_1628, Class126.aClass126_1628 }) });
		if (i <= 117) {
			aFloat6323 = 1.5852143F;
		}
	}
	
	final void a(java.awt.Canvas canvas, int i, int i_137_) {
		anInt6106++;
		Object object = null;
		if (canvas != null && aCanvas6251 != canvas) {
			if (aHashtable6094.containsKey(canvas)) {
				object = aHashtable6094.get(canvas);
			}
		} else {
			object = anObject6117;
		}
		if (object == null) {
			throw new RuntimeException();
		}
		method1265(canvas, object, 62);
		if (aCanvas6236 == canvas) {
			method1299(-87);
		}
	}
	
	abstract void method1302(int i);
	
	abstract void method1303(Class104 class104, int i, int i_138_, int i_139_);
	
	final void C(boolean bool) {
		aBoolean6275 = bool;
		anInt6080++;
		method1370(-31);
	}
	
	final void method1304(int i, int i_140_, Class135 class135) {
		method1349(class135, (byte) 19, false, false, i);
		if (i_140_ != 0) {
			aFloat6302 = -1.3785723F;
		}
		anInt6173++;
	}
	
	private final void method1305(boolean bool) {
		aBoolean6297 = bool;
		anInt6206++;
		if (aClass290_6281 != null) {
			aClass290_6281.method3413(49);
		}
		method1293(124);
	}
	
	final void a(java.awt.Canvas canvas) {
		anInt6078++;
		anObject6117 = null;
		aCanvas6236 = null;
		if (canvas != null && aCanvas6251 != canvas) {
			if (aHashtable6094.containsKey(canvas)) {
				anObject6117 = aHashtable6094.get(canvas);
				aCanvas6236 = canvas;
			}
		} else {
			aCanvas6236 = aCanvas6251;
			anObject6117 = anObject6119;
		}
		if (aCanvas6236 == null || anObject6117 == null) {
			throw new RuntimeException();
		}
		method1319(anObject6117, aCanvas6236, -30190);
		method1299(-92);
	}
	
	final Class336_Sub1 method1306(int i) {
		anInt6146++;
		if (i != 7) {
			return null;
		}
		return aClass336_Sub1Array6327[anInt6284];
	}
	
	final Class336 A() {
		anInt6238++;
		return aClass336_Sub1_6378;
	}
	
	final void a(Class336 class336) {
		aClass336_Sub1_6267 = (Class336_Sub1) class336;
		anInt6218++;
		aClass336_Sub1_6269.method3857(aClass336_Sub1_6267);
		aClass336_Sub1_6269.method3888((byte) 81);
		aClass336_Sub1_6270.method3873(aClass336_Sub1_6269, (byte) 117);
		aClass336_Sub1_6268.method3873(aClass336_Sub1_6267, (byte) 127);
		if (aClass56_6303.method566(48)) {
			method1305(false);
		}
	}
	
	final void method1307(int i, boolean bool) {
		if (i <= -65) {
			anInt6183++;
			if (!aBoolean6313 != !bool) {
				aBoolean6313 = bool;
				method1370(-69);
				anInt6334 &= ~0x1f;
			}
		}
	}
	
	abstract void method1308(byte b);
	
	final void P(int i, int i_141_, int i_142_, int i_143_, int i_144_) {
		anInt6178++;
		a(i, i_141_, i, i_142_ + i_141_, i_143_, i_144_);
	}
	
	final void b(int i) {
		anInt6132++;
	}
	
	abstract void method1309(int i);
	
	abstract void method1310(byte b);
	
	Class290 method1311(int i, int i_145_) {
		anInt6213++;
		if (i != -22838) {
			return null;
		}
		int i_146_ = i_145_;
	while_1_:
		do {
		while_0_:
			do {
				do {
					if (i_146_ != 6) {
						if (i_146_ != 1) {
							if (i_146_ != 2) {
								if (i_146_ != 7) {
									break while_1_;
								}
							} else {
								break;
							}
							break while_0_;
						}
					} else {
						return new Class290_Sub5(this);
					}
					return new Class290_Sub4(this);
				} while (false);
				return new Class290_Sub2(this, aClass5_6247);
			} while (false);
			return new Class290_Sub7(this);
		} while (false);
		return new Class290_Sub6(this);
	}
	
	final void method1312(byte b, Interface13 interface13) {
		if (interface13 != anInterface13Array6309[anInt6284]) {
			anInterface13Array6309[anInt6284] = interface13;
			if (interface13 != null) {
				interface13.method42(false);
			} else {
				method1251((byte) 71);
			}
			anInt6334 &= ~0x1;
		}
		if (b != -21) {
			B();
		}
		anInt6131++;
	}
	
	abstract void method1313(byte b);
	
	final void b(java.awt.Canvas canvas) {
		anInt6153++;
		if (aCanvas6251 == canvas) {
			throw new RuntimeException();
		}
		if (aHashtable6094.containsKey(canvas)) {
			method1275(-74, canvas, aHashtable6094.get(canvas));
			aHashtable6094.remove(canvas);
		}
	}
	
	private final void method1314(int i, boolean bool, byte b, int i_147_, int i_148_, boolean bool_149_) {
		bool &= z();
		anInt6148++;
		if (b < -30) {
			if (!bool && ((i ^ 0xffffffff) == -5 || (i ^ 0xffffffff) == -9 || i == 9)) {
				i = 2;
				i_148_ = (i ^ 0xffffffff) != -5 ? 1 : i_147_ & 0x1;
				i_147_ = 0;
			}
			if ((i ^ 0xffffffff) != -1 && bool_149_) {
				i |= ~0x7fffffff;
			}
			if ((i ^ 0xffffffff) != (anInt6354 ^ 0xffffffff)) {
				if ((anInt6354 ^ 0xffffffff) != -1) {
					aClass290Array6369[0x7fffffff & anInt6354].method3411(-8668);
				}
				if ((i ^ 0xffffffff) == -1) {
					aClass290_6281 = null;
				} else {
					aClass290_6281 = aClass290Array6369[i & 0x7fffffff];
					aClass290_6281.method3422(-127, bool_149_);
					aClass290_6281.method3417(bool_149_, false);
					aClass290_6281.method3415(true, i_147_, i_148_);
				}
				anInt6349 = i_147_;
				anInt6291 = i_148_;
				anInt6354 = i;
			} else if ((anInt6354 ^ 0xffffffff) != -1) {
				aClass290Array6369[anInt6354 & 0x7fffffff].method3417(bool_149_, false);
				if ((anInt6349 ^ 0xffffffff) != (i_147_ ^ 0xffffffff) || anInt6291 != i_148_) {
					aClass290Array6369[0x7fffffff & anInt6354].method3415(true, i_147_, i_148_);
					anInt6291 = i_148_;
					anInt6349 = i_147_;
				}
			}
		}
	}
	
	final void j(int i) {
		anInt6196++;
		if ((i ^ 0xffffffff) != -2) {
			throw new IllegalArgumentException("");
		}
	}
	
	private final void method1315(byte b) {
		if (b != -101) {
			method1258(false, 61, true, 45, null);
		}
		anInt6174++;
		if (Class54.aClass56_823 == aClass56_6303) {
			float f = method1379(105);
			aClass336_Sub1_6262.method3875(0.0F, f, (byte) 103, f);
		}
		aBoolean6297 = false;
		method1360((byte) 51);
		if (aClass290_6281 != null) {
			aClass290_6281.method3410(30);
		}
	}
	
	final void KA(int i, int i_150_, int i_151_, int i_152_) {
		anInt6245++;
		if (i <= 0 && (-1 + anInt6239 ^ 0xffffffff) >= (i_151_ ^ 0xffffffff) && (i_150_ ^ 0xffffffff) >= -1 && -1 + anInt6124 <= i_152_) {
			la();
		} else {
			anInt6294 = (anInt6239 ^ 0xffffffff) <= (i_151_ ^ 0xffffffff) ? i_151_ : 0;
			anInt6295 = (i ^ 0xffffffff) > -1 ? 0 : i;
			anInt6325 = (i_150_ ^ 0xffffffff) > -1 ? 0 : i_150_;
			anInt6333 = anInt6239 < i_152_ ? 0 : i_152_;
			if (!aBoolean6387) {
				aBoolean6387 = true;
				method1282(0);
			}
			method1300(0);
			method1375(118);
		}
	}
	
	final int method1316(int i) {
		if (i != -2) {
			return -80;
		}
		anInt6181++;
		return anInt6324;
	}
	
	private final void method1317(byte b) {
		if (aClass290_6281 != null) {
			aClass290_6281.method3416((byte) -56);
		}
		if (b != 40) {
			aFloat6371 = -0.8928218F;
		}
		anInt6202++;
		method1374((byte) 87);
	}
	
	final void method1318(int i, Class94 class94, Class94 class94_153_) {
		if (i != -30) {
			aFloatArray6292 = null;
		}
		anInt6102++;
		boolean bool = false;
		if (aClass94Array6351[anInt6284] != class94_153_) {
			aClass94Array6351[anInt6284] = class94_153_;
			method1263(false);
			bool = true;
		}
		if (aClass94Array6296[anInt6284] != class94) {
			aClass94Array6296[anInt6284] = class94;
			method1254(true);
			bool = true;
		}
		if (bool) {
			anInt6334 &= ~0x1d;
		}
	}
	
	final void ra(int i, int i_154_, int i_155_, int i_156_) {
		aBoolean6288 = true;
		anInt6339 = i_156_;
		anInt6104++;
		anInt6287 = i_155_;
		anInt6324 = i;
		anInt6315 = i_154_;
	}
	
	abstract void method1319(Object object, java.awt.Canvas canvas, int i);
	
	final boolean o() {
		anInt6162++;
		return false;
	}
	
	final void method1320(byte b) {
		if (b <= -77) {
			anInt6127++;
			aClass336_Sub1_6262.method3862();
			aBoolean6261 = true;
			method1315((byte) -101);
		}
	}
	
	final void a(int i, int i_157_, int i_158_, int i_159_, int i_160_, int i_161_, int i_162_) {
		anInt6210++;
		float f = (float) -i + (float) i_158_;
		float f_163_ = (float) i_159_ - (float) i_157_;
		float f_164_ = 0.0F;
		float f_165_ = 1.0F;
		if (f != 0.0F || f_163_ != 0.0F) {
			f_165_ = (float) Math.sqrt((double) (f_163_ * f_163_ + f * f));
			f_164_ = (float) Math.atan2((double) f_163_, (double) f);
		}
		method1373(1);
		method1336(-2, i_160_);
		method1304(0, 0, InterfaceSettings.aClass135_7421);
		method1366((byte) 111, InterfaceSettings.aClass135_7421, 0);
		method1277((byte) 61, i_162_);
		aClass336_Sub1_6262.method3877(1.0F, (byte) -112, (float) i_161_, f_165_);
		aClass336_Sub1_6262.method3863(0, -i_161_ / 2, 0);
		aClass336_Sub1_6262.method3868(0x3fff & (int) (2607.5945876176133 * (double) f_164_));
		aClass336_Sub1_6262.method3863(i, i_157_, 0);
		method1266((byte) 122);
		method1365(false, (byte) -117);
		method1283((byte) -128);
		method1365(true, (byte) -115);
		method1366((byte) -61, Class106.aClass135_1354, 0);
		method1304(0, 0, Class106.aClass135_1354);
	}
	
	final void a(int i, Node_Sub29[] node_sub29s) {
		anInt6190++;
		for (int i_166_ = 0; i > i_166_; i_166_++)
			aNode_Sub29Array6345[i_166_] = node_sub29s[i_166_];
		anInt6358 = i;
		if (aClass56_6303.method566(79)) {
			method1273(-36);
		}
	}
	
	final void xa(float f) {
		if (aFloat6300 != f) {
			aFloat6300 = f;
			aNativeInterface6193.setAmbient(f);
			method1353(false);
			method1333(false);
		}
		anInt6237++;
	}
	
	abstract void method1321(byte b, Class139 class139);
	
	final void a(int i, int i_167_, int i_168_, int i_169_, int i_170_, int i_171_) {
		anInt6154++;
		float f = (float) -i + (float) i_168_;
		float f_172_ = (float) i_169_ - (float) i_167_;
		if (f == 0.0F && f_172_ == 0.0F) {
			f = 1.0F;
		} else {
			float f_173_ = (float) (1.0 / Math.sqrt((double) (f * f + f_172_ * f_172_)));
			f *= f_173_;
			f_172_ *= f_173_;
		}
		if (method1381(f + (float) i_168_, 0.0F, (float) i, (float) i_169_ + f_172_, (float) i_167_, 0.0F, 5)) {
			method1373(1);
			method1336(-2, i_170_);
			method1304(0, 0, InterfaceSettings.aClass135_7421);
			method1366((byte) 76, InterfaceSettings.aClass135_7421, 0);
			method1277((byte) 61, i_171_);
			method1320((byte) -97);
			method1365(false, (byte) -127);
			method1348(1);
			method1365(true, (byte) -124);
			method1366((byte) -128, Class106.aClass135_1354, 0);
			method1304(0, 0, Class106.aClass135_1354);
		}
	}
	
	abstract Interface13_Impl1 method1322(Class68 class68, boolean bool, int i, int i_174_, byte b, float[] fs, int i_175_, int i_176_);
	
	final void method1323(byte b) {
		if (b == 28) {
			if (anInt6334 != 2) {
				method1331(127);
				method1371(false, false);
				method1296(120, false);
				method1347(1, false);
				method1307(b + -108, false);
				method1332(3, false, -2, false);
				anInt6334 = 2;
			}
			anInt6147++;
		}
	}
	
	final Stream method1324(boolean bool, jaclib.memory.Buffer buffer) {
		aStream6312.a(buffer);
		anInt6142++;
		if (bool != true) {
			method1370(104);
		}
		return aStream6312;
	}
	
	final void method1325(int i) {
		anInt6250++;
		Hashtable<Canvas, Object> hashtable = new Hashtable<Canvas, Object>();
		if (aHashtable6094 != null && !aHashtable6094.isEmpty()) {
			Enumeration<Canvas> enumeration = aHashtable6094.keys();
			while (enumeration.hasMoreElements()) {
				java.awt.Canvas canvas = enumeration.nextElement();
				hashtable.put(canvas, method1351(canvas, i + -98));
			}
		}
		aHashtable6094 = hashtable;
		method1301(124);
		method1355(i ^ 0x7e);
		method1280((byte) 111);
		aClass287_6353.method3399(this, i);
	}
	
	final boolean s() {
		anInt6209++;
		return false;
	}
	
	final void la() {
		anInt6086++;
		anInt6294 = anInt6239;
		anInt6295 = 0;
		anInt6325 = 0;
		anInt6333 = anInt6124;
		if (aBoolean6387) {
			aBoolean6387 = false;
			method1282(0);
		}
		method1375(80);
	}
	
	void method1326(boolean bool) {
		if (bool != false) {
			anInt6329 = 18;
		}
		anInt6077++;
		method1247(5);
	}
	
	abstract Interface13_Impl1 method1327(Class68 class68, int i, boolean bool, int i_177_, int i_178_, int i_179_, boolean bool_180_, byte[] bs);
	
	final void a(int i, int i_181_, int i_182_, int i_183_, int i_184_, int i_185_, int i_186_, int i_187_, int i_188_, int i_189_, int i_190_, int i_191_, int i_192_) {
		anInt6248++;
	}
	
	private final void method1328(int i) {
		aFloatArray6359[14] = aFloat6336;
		anInt6249++;
		aFloatArray6359[10] = aFloat6278;
		aFloat6302 = ((float) -anInt6335 + aFloatArray6359[14]) / aFloatArray6359[10];
		if (i > -44) {
			aClass290_6281 = null;
		}
	}
	
	final int method1329(int i) {
		if (i != 512) {
			return 123;
		}
		anInt6229++;
		return anInt6287;
	}
	
	final boolean t() {
		anInt6123++;
		return aBoolean6342;
	}
	
	final NativeHeapBuffer method1330(boolean bool, int i, int i_193_) {
		anInt6200++;
		return aNativeHeap6084.a(i_193_, bool);
	}
	
	private final void method1331(int i) {
		anInt6166++;
		if (aClass56_6303 != Class54.aClass56_823) {
			Class56 class56 = aClass56_6303;
			aClass56_6303 = Class54.aClass56_823;
			if (class56.method566(115)) {
				method1305(false);
			}
			method1260((byte) 2);
			aFloatArray6314 = aFloatArray6316;
			method1350(false);
			anInt6334 &= ~0x18;
		}
	}
	
	final void method1332(int i, boolean bool, int i_196_, boolean bool_197_) {
		anInt6255++;
		if (i != 3) {
			aBoolean6288 = true;
		}
		if (anInt6361 != i_196_ || aBoolean6348 == !aBoolean6288) {
			Interface13_Impl1 interface13_impl1 = null;
			int i_198_ = 0;
			byte b = 0;
			int i_199_ = 0;
			byte b_200_ = !aBoolean6288 ? (byte) 0 : (byte) 3;
			if ((i_196_ ^ 0xffffffff) <= -1) {
				interface13_impl1 = aClass307_6290.method3581((byte) -45, i_196_);
				Class91 class91 = aD1543.method10(i_196_, -8217);
				if ((class91.aByte1211 ^ 0xffffffff) == -1 && (class91.aByte1203 ^ 0xffffffff) == -1) {
					method1255((byte) -12);
				} else {
					int i_201_ = class91.aBoolean1204 ? 64 : 128;
					int i_202_ = i_201_ * 50;
					Class336_Sub1 class336_sub1 = method1306(7);
					class336_sub1.method3870(0.0F, 0, (float) (anInt6332 % i_202_ * class91.aByte1203) / (float) i_202_, (float) (class91.aByte1211 * (anInt6332 % i_202_)) / (float) i_202_);
					method1297(-21029, BufferedConnection.aClass346_615);
				}
				i_198_ = class91.anInt1202;
				if (!aBoolean6288) {
					b = class91.aByte1213;
					b_200_ = class91.aByte1214;
					i_199_ = class91.anInt1206;
				}
			} else {
				method1255((byte) -12);
			}
			method1314(b_200_, bool_197_, (byte) -72, b, i_199_, bool);
			if (aClass290_6281 == null) {
				method1312((byte) -21, interface13_impl1);
				method1278((byte) -12, i_198_);
			} else {
				aClass290_6281.method3419(interface13_impl1, i_198_, (byte) 92);
			}
			aBoolean6348 = aBoolean6288;
			anInt6361 = i_196_;
		}
		anInt6334 &= ~0x7;
	}
	
	abstract void method1333(boolean bool);
	
	final void H(int i, int i_203_, int i_204_, int[] is) {
		anInt6096++;
		float f = aClass336_Sub1_6267.method3882((float) i_204_, (float) i_203_, (float) i, true);
		int i_205_;
		int i_206_;
		if (f < -0.0078125F || f > 0.0078125F) {
			i_206_ = (int) ((float) anInt6289 * aClass336_Sub1_6267.method3878((float) i_203_, (float) i_204_, (float) i, false) / f);
			i_205_ = (int) ((float) anInt6362 * aClass336_Sub1_6267.method3876(5, (float) i_204_, (float) i, (float) i_203_) / f);
		} else {
			i_205_ = anInt6331;
			i_206_ = anInt6341;
		}
		is[1] = (int) ((float) i_205_ - aFloat6282);
		is[0] = (int) ((float) i_206_ - aFloat6298);
		is[2] = (int) f;
	}
	
	abstract void method1334(int i);
	
	final void method1335(boolean bool) {
		anInt6240++;
		if ((anInt6334 ^ 0xffffffff) != -17) {
			method1281(-116);
			method1371(true, !bool);
			method1347(1, true);
			method1307(-96, true);
			method1277((byte) 61, 1);
			anInt6334 = 16;
		}
		if (bool != true) {
			method1370(82);
		}
	}
	
	final void d(int i, int i_207_, int i_208_, int i_209_, int i_210_, int i_211_) {
		anInt6170++;
		float f = method1379(102);
		method1373(1);
		method1336(-2, i_210_);
		method1304(0, 0, InterfaceSettings.aClass135_7421);
		method1366((byte) -60, InterfaceSettings.aClass135_7421, 0);
		method1277((byte) 61, i_211_);
		aClass336_Sub1_6262.method3877(1.0F, (byte) -112, (float) (-1 + i_209_), (float) (i_208_ + -1));
		aClass336_Sub1_6262.method3875(0.0F, -f + (float) i_207_, (byte) 103, (float) i - f);
		method1266((byte) 127);
		method1365(false, (byte) -124);
		method1271(0, 4, Class263.aClass104_3337);
		method1365(true, (byte) -124);
		method1366((byte) 110, Class106.aClass135_1354, 0);
		method1304(0, 0, Class106.aClass135_1354);
	}
	
	final void method1336(int i, int i_212_) {
		anInt6222++;
		if (i_212_ != anInt6318) {
			anInt6318 = i_212_;
			method1337(6);
		}
		if (i != -2) {
			aClass94Array6296 = null;
		}
	}
	
	abstract void method1337(int i);
	
	final void X(int i) {
		anInt6105++;
		anInt6350 = 0;
		for (/**/; (i ^ 0xffffffff) < -2; i >>= 1)
			anInt6350++;
		anInt6320 = 1 << anInt6350;
	}
	
	abstract void method1338(Class213 class213, int i);
	
	final void A(int i, aa var_aa, int i_213_, int i_214_) {
		anInt6242++;
		aa_Sub2 var_aa_Sub2 = (aa_Sub2) var_aa;
		Interface13_Impl1 interface13_impl1 = var_aa_Sub2.anInterface13_Impl1_5489;
		method1323((byte) 28);
		method1312((byte) -21, interface13_impl1);
		method1277((byte) 61, 1);
		method1318(-30, Class117_Sub1.aClass94_4924, Class117_Sub1.aClass94_4924);
		method1304(0, 0, InterfaceSettings.aClass135_7421);
		method1336(-2, i);
		aClass336_Sub1_6262.method3877(0.0F, (byte) -112, (float) anInt6124, (float) anInt6239);
		method1266((byte) 110);
		aClass336_Sub1Array6327[0].method3877(1.0F, (byte) -112, interface13_impl1.method49((float) anInt6124, (byte) -51), interface13_impl1.method45((float) anInt6239, -101));
		aClass336_Sub1Array6327[0].method3875(0.0F, interface13_impl1.method49((float) -i_214_, (byte) -48), (byte) 103, interface13_impl1.method45((float) -i_213_, 92));
		aClass346Array6343[0] = BufferedConnection.aClass346_615;
		method1257(9);
		method1283((byte) -128);
		method1255((byte) -12);
		method1304(0, 0, Class106.aClass135_1354);
	}
	
	final void method1339(int i) {
		method1376(530);
		anInt6258++;
		method1350(false);
		if (i <= 95) {
			method1330(true, -45, 92);
		}
	}
	
	abstract void method1340(byte b);
	
	final void HA(int i, int i_215_, int i_216_, int i_217_, int[] is) {
		anInt6257++;
		float f = aClass336_Sub1_6267.method3882((float) i_216_, (float) i_215_, (float) i, true);
		if ((float) anInt6364 > f || f > (float) anInt6335) {
			is[0] = is[1] = is[2] = -1;
		} else {
			int i_218_ = (int) ((float) anInt6289 * aClass336_Sub1_6267.method3878((float) i_215_, (float) i_216_, (float) i, false) / (float) i_217_);
			int i_219_ = (int) ((float) anInt6362 * aClass336_Sub1_6267.method3876(5, (float) i_216_, (float) i, (float) i_215_) / (float) i_217_);
			is[1] = (int) ((float) i_219_ - aFloat6282);
			is[2] = (int) f;
			is[0] = (int) (-aFloat6298 + (float) i_218_);
		}
	}
	
	final void method1341(byte b, boolean bool) {
		anInt6112++;
		if (aBoolean6306 == !bool) {
			aBoolean6306 = bool;
			method1313((byte) 108);
		}
	}
	
	final Class336_Sub1 method1342(int i) {
		anInt6217++;
		return aClass336_Sub1_6269;
	}
	
	static final boolean method1343(byte b) {
		anInt6121++;
		if (Animable_Sub2_Sub1.aBoolean10628) {
			try {
				Class2.method167("showVideoAd", Class96.anApplet1270, (byte) -126);
				return true;
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		return false;
	}
	
	final int method1344(int i) {
		if (i >= -105) {
			return 67;
		}
		anInt6223++;
		return anInt6339;
	}
	
	final Interface13_Impl1 method1345(int i, float[] fs, Class68 class68, boolean bool, boolean bool_221_, int i_222_) {
		if (bool != false) {
			method1299(67);
		}
		anInt6159++;
		return method1322(class68, bool_221_, i_222_, 0, (byte) 5, fs, 0, i);
	}
	
	final void b(java.awt.Canvas canvas, int i, int i_223_) {
		anInt6163++;
		if (canvas == aCanvas6251) {
			throw new RuntimeException();
		}
		if (!aHashtable6094.containsKey(canvas)) {
			if (!canvas.isShowing()) {
				throw new RuntimeException();
			}
			try {
				Class<?> var_class = Class.forName("java.awt.Canvas");
				Method method = var_class.getMethod("setIgnoreRepaint", Boolean.TYPE);
				method.invoke(canvas, Boolean.TRUE);
			} catch (Exception exception) {
				/* empty */
			}
			Object object = method1351(canvas, -72);
			if (object == null) {
				throw new RuntimeException();
			}
			aHashtable6094.put(canvas, object);
		}
	}
	
	final boolean a() {
		anInt6256++;
		return true;
	}
	
	final boolean p() {
		anInt6232++;
		return true;
	}
	
	abstract Interface15_Impl1 method1346(boolean bool, byte b);
	
	final void K(int[] is) {
		anInt6114++;
		is[1] = anInt6325;
		is[2] = anInt6294;
		is[3] = anInt6333;
		is[0] = anInt6295;
	}
	
	void e(int i) {
		if (aClass307_6290 != null) {
			aClass307_6290.method3582((byte) -3);
		}
		anInt6241++;
		anInt6332 = i & 0x7fffffff;
	}
	
	final void method1347(int i, boolean bool) {
		anInt6192++;
		if (aBoolean6277 == !bool) {
			aBoolean6277 = bool;
			method1340((byte) 58);
			anInt6334 &= ~0x1f;
		}
		if (i != 1) {
			method1380(-12, true);
		}
	}
	
	private final void method1348(int i) {
		method1354(0, 32011, anInterface15_Impl2_6376);
		anInt6139++;
		method1338(aClass213_6386, 9422);
		method1303(StandardSprite.aClass104_8926, 87, 0, i);
	}
	
	abstract void method1349(Class135 class135, byte b, boolean bool, boolean bool_224_, int i);
	
	final void q() {
		if (aClass307_6290 != null) {
			aClass307_6290.method3580((byte) 120);
		}
		anInt6176++;
	}
	
	final void a(int[] is) {
		is[0] = anInt6239;
		anInt6122++;
		is[1] = anInt6124;
	}
	
	private final void method1350(boolean bool) {
		method1334(-114);
		if (bool != false) {
			aFloat6274 = -0.025888432F;
		}
		anInt6137++;
		if (aClass290_6281 != null) {
			aClass290_6281.method3412(0);
		}
	}
	
	abstract Object method1351(java.awt.Canvas canvas, int i);
	
	final GLSprite a(int[] is, int i, int i_225_, int i_226_, int i_227_, boolean bool) {
		anInt6233++;
		return new StandardSprite(this, i_226_, i_227_, is, i, i_225_);
	}
	
	private final void method1352(byte b) {
		aFloat6371 = (float) anInt6335;
		anInt6191++;
		if (b <= 113) {
			anInt6333 = 40;
		}
	}
	
	abstract void method1353(boolean bool);
	
	abstract void method1354(int i, int i_228_, Interface15_Impl2 interface15_impl2);
	
	final Class52 a(Class357 class357, Class383[] class383s, boolean bool) {
		anInt6199++;
		return new Class52_Sub1(this, class357, class383s, bool);
	}
	
	AbstractToolkit(java.awt.Canvas canvas, Object object, d var_d, Index class302, int i, int i_229_) {
		super(var_d);
		aBoolean6275 = true;
		aFloat6272 = -1.0F;
		anInt6276 = -1;
		anInt6289 = 512;
		aBoolean6279 = true;
		aFloat6302 = 3584.0F;
		aFloatArray6273 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };
		aBoolean6283 = false;
		anInt6287 = -1;
		anInt6295 = 0;
		anInt6320 = 8;
		aFloatArray6304 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };
		aBoolean6322 = false;
		aFloat6300 = 1.0F;
		aBoolean6277 = false;
		aFloat6293 = 1.0F;
		anInt6329 = 16777215;
		anInt6291 = 0;
		aFloatArray6292 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };
		anInt6325 = 0;
		enableBlending = true;
		anInt6307 = 0;
		anInt6331 = 0;
		aBoolean6306 = true;
		aFloat6323 = 1.0F;
		anInt6280 = 0;
		aFloatArray6285 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };
		anInt6341 = 0;
		aFloatArray6321 = new float[16];
		aBoolean6340 = false;
		aFloatArray6305 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };
		aBoolean6348 = false;
		anInt6315 = -1;
		aBoolean6338 = true;
		anInt6355 = -1;
		aFloatArray6314 = aFloatArray6305;
		anInt6362 = 512;
		anInt6335 = 3584;
		aClass26_6301 = Class47.aClass26_688;
		aClass56_6303 = Class133.aClass56_1686;
		aBoolean6346 = false;
		aFloatArray6316 = new float[16];
		anInt6354 = 0;
		anInt6339 = 0;
		anInt6361 = -1;
		aBoolean6326 = false;
		anInt6349 = 0;
		anInt6364 = 50;
		aFloat6365 = 1.0F;
		anInt6350 = 3;
		anInt6294 = 0;
		anInt6333 = 0;
		anInt6368 = 128;
		aBoolean6297 = false;
		aClass290Array6369 = new Class290[10];
		aFloat6363 = 1.0F;
		aBoolean6313 = false;
		aFloat6274 = -1.0F;
		anInt6344 = 1;
		aFloatArray6359 = new float[16];
		aBoolean6352 = false;
		aFloat6371 = 3584.0F;
		anInt6372 = 0;
		aStream6312 = new Stream();
		aStandardDrawableModelArray6374 = new StandardDrawableModel[7];
		aStandardDrawableModelArray6380 = new StandardDrawableModel[7];
		aClass336_Sub1_6378 = new Class336_Sub1();
		try {
			aClass302_6167 = class302;
			anObject6117 = anObject6119 = object;
			anInt6319 = i;
			aCanvas6236 = aCanvas6251 = canvas;
			Dimension dimension = canvas.getSize();
			anInt6360 = i_229_;
			anInt6124 = anInt6133 = dimension.height;
			anInt6239 = anInt6100 = dimension.width;
			Class110.method1132(0, true, false);
			if (aD1543 == null) {
				aNativeInterface6193 = new NativeInterface(0, anInt6360);
				aClass307_6290 = null;
			} else {
				aClass307_6290 = new Class307(this, aD1543);
				aNativeInterface6193 = new NativeInterface(aD1543.method6(100), anInt6360);
				for (int i_230_ = 0; i_230_ < aD1543.method6(120); i_230_++) {
					Class91 class91 = aD1543.method10(i_230_, -8217);
					if (class91 != null) {
						aNativeInterface6193.initTextureMetrics(i_230_, class91.aByte1225, class91.aByte1217);
					}
				}
			}
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			this.method1233(-7751);
			throw new RuntimeException("");
		}
	}
	
	final Plane a(int i, int i_231_, int[][] is, int[][] is_232_, int i_233_, int i_234_, int i_235_) {
		anInt6205++;
		return new StandardPlane(this, i_234_, i_235_, i, i_231_, is, is_232_, i_233_);
	}
	
	final void a(int i, int i_236_, int i_237_, int i_238_, int i_239_, int i_240_, aa var_aa, int i_241_, int i_242_) {
		anInt6118++;
	}
	
	private final void method1355(int i) {
		anInterface15_Impl2_6376 = method1380(2, true);
		anInt6225++;
		anInterface15_Impl2_6376.method37(12, 24, -12093);
		if (i <= -125) {
			aClass213_6386 = method1372((byte) -121, new Class207[] { new Class207(Class126.aClass126_1620) });
		}
	}
	
	final void method1356(int i, boolean bool) {
		anInt6165++;
		if (!aBoolean6283 != !bool) {
			aBoolean6283 = bool;
			method1302(1);
		}
		if (i != 1) {
			method1329(-112);
		}
	}
	
	final void a(boolean bool) {
		anInt6253++;
	}
	
	final int i() {
		anInt6145++;
		return anInt6364;
	}
	
	final float[] method1357(byte b) {
		anInt6140++;
		if (b != 86) {
			aBoolean6322 = false;
		}
		return aFloatArray6305;
	}
	
	final void c(int i) {
		anInt6126++;
	}
	
	final void a(Class198 class198) {
		anInt6231++;
		aClass287_6353.method3397(class198, -1, 0, this);
	}
	
	final void method1358(int i) {
		aClass346Array6343 = new Class346[anInt6370];
		aClass94Array6296 = new Class94[anInt6370];
		aClass94Array6351 = new Class94[anInt6370];
		aClass336_Sub1Array6327 = new Class336_Sub1[anInt6370];
		anInt6179++;
		anInterface13Array6309 = new Interface13[anInt6370];
		for (int i_244_ = 0; (i_244_ ^ 0xffffffff) > (anInt6370 ^ 0xffffffff); i_244_++) {
			aClass94Array6296[i_244_] = Class116.aClass94_5075;
			aClass94Array6351[i_244_] = Class116.aClass94_5075;
			aClass346Array6343[i_244_] = Class119.aClass346_1515;
			aClass336_Sub1Array6327[i_244_] = new Class336_Sub1();
		}
		aNode_Sub29Array6345 = new Node_Sub29[anInt6367 - 2];
		anInterface13_6357 = method1291(Class99.aClass68_1290, Class372.aClass372_4594, 1, 1, -93);
		a(new za_Sub2(262144));
		aClass213_6373 = method1372((byte) -122, new Class207[] { new Class207(new Class126[] { Class126.aClass126_1620, Class126.aClass126_1628 }) });
		aClass213_6383 = method1372((byte) -123, new Class207[] { new Class207(new Class126[] { Class126.aClass126_1620, Class126.aClass126_1626 }) });
		aClass213_6382 = method1372((byte) -122, new Class207[] { new Class207(Class126.aClass126_1620), new Class207(Class126.aClass126_1626), new Class207(Class126.aClass126_1628), new Class207(Class126.aClass126_1625) });
		aClass213_6385 = method1372((byte) -128, new Class207[] { new Class207(Class126.aClass126_1620), new Class207(Class126.aClass126_1626), new Class207(Class126.aClass126_1628) });
		for (int i_245_ = 0; i_245_ < 7; i_245_++) {
			aStandardDrawableModelArray6380[i_245_] = new StandardDrawableModel(this, 0, 0, false, false);
			aStandardDrawableModelArray6374[i_245_] = new StandardDrawableModel(this, 0, 0, true, true);
		}
		aClass287_6353 = new Class287(this);
		anInterface15_Impl1_6381 = method1346(true, (byte) 102);
		method1325(-1);
		aClass5_6247 = new Class5(this);
		aClass290Array6369[1] = method1311(-22838, 1);
		aClass290Array6369[2] = method1311(-22838, 2);
		aClass290Array6369[4] = method1311(-22838, 4);
		aClass290Array6369[5] = method1311(-22838, 5);
		aClass290Array6369[6] = method1311(-22838, 6);
		aClass290Array6369[7] = method1311(-22838, 7);
		aClass290Array6369[3] = method1311(-22838, 3);
		aClass290Array6369[8] = method1311(-22838, 8);
		aClass290Array6369[9] = method1311(-22838, 9);
		if (!aClass290Array6369[2].method3414((byte) -56)) {
			aClass290Array6369[2] = method1311(-22838, 0);
		}
		if (!aClass290Array6369[4].method3414((byte) -121)) {
			aClass290Array6369[4] = aClass290Array6369[2];
		}
		if (!aClass290Array6369[8].method3414((byte) -73)) {
			aClass290Array6369[8] = aClass290Array6369[4];
		}
		if (!aClass290Array6369[9].method3414((byte) -117)) {
			aClass290Array6369[9] = aClass290Array6369[8];
		}
		method1326(false);
		la();
		this.h();
	}
	
	private final void method1359(int i) {
		aBoolean6352 = false;
		anInt6164++;
		method1253((byte) 10);
		if (aClass56_6303 == Class366.aClass56_4527) {
			method1350(false);
		}
	}
	
	abstract void method1360(byte b);
	
	final float[] method1361(float[] fs, int i) {
		fs[8] = aFloatArray6314[2];
		anInt6150++;
		fs[12] = aFloatArray6314[3];
		fs[0] = aFloatArray6314[0];
		fs[4] = aFloatArray6314[1];
		fs[5] = aFloatArray6314[5];
		fs[13] = aFloatArray6314[7];
		fs[9] = aFloatArray6314[6];
		fs[1] = aFloatArray6314[4];
		fs[2] = aFloatArray6314[8];
		fs[14] = aFloatArray6314[11];
		fs[3] = aFloatArray6314[12];
		fs[i] = aFloatArray6314[13];
		fs[6] = aFloatArray6314[9];
		fs[10] = aFloatArray6314[10];
		fs[11] = aFloatArray6314[14];
		fs[15] = aFloatArray6314[15];
		return fs;
	}
	
	final void method1362(int i, int i_247_) {
		if ((i_247_ ^ 0xffffffff) != (anInt6284 ^ 0xffffffff)) {
			anInt6284 = i_247_;
			method1309(i + -362);
		}
		anInt6235++;
		if (i != 255) {
			j(-117);
		}
	}
	
	abstract void method1363(int i, byte b, Class135 class135, boolean bool);
	
	final void method1364(int i, boolean bool) {
		anInt6189++;
		if (!aBoolean6338 == bool) {
			aBoolean6338 = bool;
			method1308((byte) 84);
		}
		if (i != -28858) {
			B();
		}
	}
	
	abstract void method1365(boolean bool, byte b);
	
	final void method1366(byte b, Class135 class135, int i) {
		method1363(i, (byte) 98, class135, false);
		anInt6107++;
	}
	
	abstract Interface13_Impl1 method1367(int i, int i_249_, int[] is, int i_250_, int i_251_, boolean bool, int i_252_);
	
	private final void method1368(byte b) {
		if (b >= -110) {
			aFloat6317 = -0.09793644F;
		}
		anInt6185++;
		if (aClass56_6303 != Class274.aClass56_4971) {
			Class56 class56 = aClass56_6303;
			aClass56_6303 = Class274.aClass56_4971;
			if (!class56.method566(121)) {
				method1305(false);
			}
			method1256((byte) 127);
			aFloatArray6314 = aFloatArray6359;
			method1350(false);
			anInt6334 &= ~0x7;
		}
	}
	
	final boolean B() {
		anInt6221++;
		return true;
	}
	
	final boolean b() {
		anInt6234++;
		return true;
	}
	
	final void pa() {
		anInt6214++;
		aBoolean6288 = false;
	}
	
	final Interface13_Impl2 method1369(int i) {
		if (i >= -95) {
			method1331(-55);
		}
		anInt6195++;
		if (aClass270_Sub1_6347 != null) {
			return aClass270_Sub1_6347.method3298((byte) 79);
		}
		return null;
	}
	
	final void da(int i, int i_253_, int i_254_, int[] is) {
		anInt6095++;
		float f = aClass336_Sub1_6267.method3882((float) i_254_, (float) i_253_, (float) i, true);
		int i_255_;
		int i_256_;
		if (!(f < -0.0078125F) && !(f > 0.0078125F)) {
			i_255_ = anInt6341;
			i_256_ = anInt6331;
		} else {
			i_255_ = (int) ((float) anInt6289 * aClass336_Sub1_6267.method3878((float) i_253_, (float) i_254_, (float) i, false) / f);
			i_256_ = (int) ((float) anInt6362 * aClass336_Sub1_6267.method3876(5, (float) i_254_, (float) i, (float) i_253_) / f);
		}
		is[0] = (int) (-aFloat6298 + (float) i_255_);
		is[2] = (int) f;
		is[1] = (int) (-aFloat6282 + (float) i_256_);
	}
	
	abstract void method1370(int i);
	
	final void method1371(boolean bool, boolean bool_257_) {
		if (bool_257_ != false) {
			anInterface15_Impl2_6376 = null;
		}
		if (!aBoolean6299 != !bool) {
			aBoolean6299 = bool;
			method1308((byte) 92);
			anInt6334 &= ~0x1f;
		}
		anInt6156++;
	}
	
	abstract Class213 method1372(byte b, Class207[] class207s);
	
	private final void method1373(int i) {
		anInt6113++;
		if (i != 1) {
			method1305(true);
		}
		if ((anInt6334 ^ 0xffffffff) != -2) {
			method1331(127);
			method1371(false, false);
			method1296(126, false);
			method1347(1, false);
			method1307(-103, false);
			method1332(3, false, -2, false);
			method1278((byte) -12, 1);
			method1312((byte) -21, anInterface13_6357);
			anInt6334 = 1;
		}
	}
	
	final aa a(int i, int i_258_, int[] is, int[] is_259_) {
		anInt6151++;
		return Class213_Sub1.method2057(is, is_259_, -16777216, i, this, i_258_);
	}
	
	abstract void method1374(byte b);
	
	private final void method1375(int i) {
		anInt6144++;
		aFloat6317 = (float) (anInt6294 + -anInt6341);
		aFloat6298 = (float) (anInt6295 + -anInt6341);
		aFloat6308 = (float) (anInt6333 + -anInt6331);
		aFloat6282 = (float) (anInt6325 - anInt6331);
		if (i <= 71) {
			aClass307_6290 = null;
		}
	}
	
	final void method1376(int i) {
		if (Class133.aClass56_1686 != aClass56_6303) {
			Class56 class56 = aClass56_6303;
			aClass56_6303 = Class133.aClass56_1686;
			if (class56.method566(70)) {
				method1305(false);
			}
			aFloatArray6314 = aFloatArray6305;
			anInt6334 &= ~0x1f;
		}
		if (i != 530) {
			X(22);
		}
		anInt6089++;
	}
	
	abstract boolean method1377(Class372 class372, Class68 class68, byte b);
	
	final DrawableModel a(Model model, int i, int i_260_, int i_261_, int i_262_) {
		anInt6220++;
		return new StandardDrawableModel(this, model, i, i_261_, i_262_, i_260_);
	}
	
	final int[] Y() {
		anInt6083++;
		return new int[] { anInt6341, anInt6331, anInt6289, anInt6362 };
	}
	
	final Class336_Sub1 method1378(int i) {
		if (i != 50) {
			method1318(-72, null, null);
		}
		anInt6216++;
		if (!aBoolean6297) {
			aClass336_Sub1_6271.method3883(aClass336_Sub1_6269, aClass336_Sub1_6262);
			aBoolean6297 = true;
		}
		return aClass336_Sub1_6271;
	}
	
	abstract float method1379(int i);
	
	abstract Interface15_Impl2 method1380(int i, boolean bool);
	
	private final boolean method1381(float f, float f_263_, float f_264_, float f_265_, float f_266_, float f_267_, int i) {
		anInt6115++;
		jaclib.memory.Buffer buffer = anInterface15_Impl2_6376.method40(-18, true);
		if (buffer == null) {
			return false;
		}
		Stream stream = method1324(true, buffer);
		if (!Stream.b()) {
			stream.b(f_264_);
			stream.b(f_266_);
			stream.b(f_267_);
			stream.b(f);
			stream.b(f_265_);
			stream.b(f_263_);
		} else {
			stream.a(f_264_);
			stream.a(f_266_);
			stream.a(f_267_);
			stream.a(f);
			stream.a(f_265_);
			stream.a(f_263_);
		}
		if (i != 5) {
			return true;
		}
		stream.c();
		return anInterface15_Impl2_6376.method39(-53);
	}
	
	final int JA(int i, int i_268_, int i_269_, int i_270_, int i_271_, int i_272_) {
		anInt6161++;
		int i_273_ = 0;
		float f = aClass336_Sub1_6267.aFloat8508 * (float) i_268_ + aClass336_Sub1_6267.aFloat8547 * (float) i + aClass336_Sub1_6267.aFloat8556 * (float) i_269_ + aClass336_Sub1_6267.aFloat8542;
		if (f < 1.0F) {
			f = 1.0F;
		}
		float f_274_ = aClass336_Sub1_6267.aFloat8542 + (aClass336_Sub1_6267.aFloat8547 * (float) i_270_ + (float) i_271_ * aClass336_Sub1_6267.aFloat8508 + aClass336_Sub1_6267.aFloat8556 * (float) i_272_);
		if (f_274_ < 1.0F) {
			f_274_ = 1.0F;
		}
		if ((float) anInt6364 > f && f_274_ < (float) anInt6364) {
			i_273_ |= 0x10;
		} else if ((float) anInt6335 < f && (float) anInt6335 < f_274_) {
			i_273_ |= 0x20;
		}
		int i_275_ = (int) ((float) anInt6289 * ((float) i_269_ * aClass336_Sub1_6267.aFloat8529 + ((float) i * aClass336_Sub1_6267.aFloat8530 + (float) i_268_ * aClass336_Sub1_6267.aFloat8531) + aClass336_Sub1_6267.aFloat8550) / f);
		int i_276_ = (int) ((float) anInt6289 * (aClass336_Sub1_6267.aFloat8550 + (aClass336_Sub1_6267.aFloat8530 * (float) i_270_ + aClass336_Sub1_6267.aFloat8531 * (float) i_271_ + (float) i_272_ * aClass336_Sub1_6267.aFloat8529)) / f_274_);
		if (!(aFloat6298 > (float) i_275_) || !(aFloat6298 > (float) i_276_)) {
			if (aFloat6317 < (float) i_275_ && (float) i_276_ > aFloat6317) {
				i_273_ |= 0x2;
			}
		} else {
			i_273_ |= 0x1;
		}
		int i_277_ = (int) ((aClass336_Sub1_6267.aFloat8521 + ((float) i * aClass336_Sub1_6267.aFloat8544 + aClass336_Sub1_6267.aFloat8538 * (float) i_268_ + aClass336_Sub1_6267.aFloat8535 * (float) i_269_)) * (float) anInt6362 / f);
		int i_278_ = (int) ((aClass336_Sub1_6267.aFloat8544 * (float) i_270_ + aClass336_Sub1_6267.aFloat8538 * (float) i_271_ + (float) i_272_ * aClass336_Sub1_6267.aFloat8535 + aClass336_Sub1_6267.aFloat8521) * (float) anInt6362 / f_274_);
		if (!((float) i_277_ < aFloat6282) || !(aFloat6282 > (float) i_278_)) {
			if ((float) i_277_ > aFloat6308 && (float) i_278_ > aFloat6308) {
				i_273_ |= 0x8;
			}
		} else {
			i_273_ |= 0x4;
		}
		return i_273_;
	}
	
	abstract void method1382(int i);
	
	final void f(int i) {
		anInt6254++;
		if ((i ^ 0xffffffff) > -129 || i > 1024) {
			throw new IllegalArgumentException();
		}
		if (aClass307_6290 != null) {
			aClass307_6290.method3580((byte) 124);
		}
		anInt6368 = i;
	}
	
	/*synthetic*/ static Class<?> method1383(String string) {
		Class<?> var_class;
		try {
			var_class = Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw (NoClassDefFoundError) new NoClassDefFoundError().initCause(classnotfoundexception);
		}
		return var_class;
	}
}
