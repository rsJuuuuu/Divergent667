/* GLPlane - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.Stream;
import jaggl.OpenGL;

public class GLPlane extends Plane
{
	private int[][][] anIntArrayArrayArray7908;
	protected int[][][] anIntArrayArrayArray7909;
	static int anInt7910;
	protected int anInt7911;
	static int anInt7912;
	private int[][][] anIntArrayArrayArray7913;
	private Class312 aClass312_7914 = new Class312();
	private int anInt7915 = -2 + anInt3410;
	static int anInt7916;
	static int anInt7917;
	static int[] anIntArray7918 = new int[8];
	private int anInt7919;
	static int anInt7920;
	static int anInt7921;
	static int anInt7922;
	static int anInt7923;
	private int[][][] anIntArrayArrayArray7924;
	protected short[][] aShortArrayArray7925;
	protected GLToolkit aGLToolkit7926;
	static int anInt7927;
	static int anInt7928;
	protected int[][][] anIntArrayArrayArray7929;
	static int anInt7930;
	private Class137 aClass137_7931;
	private int anInt7932;
	private int anInt7933;
	protected int[][][] anIntArrayArrayArray7934;
	static int anInt7935;
	private Node_Sub33[][][] aNode_Sub33ArrayArrayArray7936;
	static int anInt7937 = 0;
	private byte[][] aByteArrayArray7938;
	static int anInt7939;
	static int anInt7940;
	static int anInt7941;
	static int anInt7942;
	static int anInt7943;
	private int anInt7944;
	protected Class69 aClass69_7945;
	private float[][] aFloatArrayArray7946;
	private float[][] aFloatArrayArray7947;
	private int anInt7948;
	private HashTable aHashTable7949;
	static boolean[][] aBooleanArrayArray7950 = { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };
	private byte[][] aByteArrayArray7951;
	private Class69 aClass69_7952;
	protected Class69 aClass69_7953;
	protected Class69 aClass69_7954;
	private Node_Sub33[] aNode_Sub33Array7955;
	private Interface9 anInterface9_7956;
	private float[][] aFloatArrayArray7957;
	
	final void method3252(int i, int i_0_, int i_1_, boolean[][] bools, boolean bool, int i_2_) {
		method3262(bool, bools, 123, i, -1, i_1_, i_0_, i_2_);
		anInt7941++;
	}
	
	final void method3250(Node_Sub29 node_sub29, int[] is) {
		anInt7916++;
		aClass312_7914.method3625((byte) -54, new Node_Sub26(aGLToolkit7926, this, node_sub29, is));
	}
	
	private final void method3261(r_Sub2 var_r_Sub2, int i, byte b, int i_3_) {
		anInt7921++;
		int[] is = anIntArrayArrayArray7929[i][i_3_];
		int[] is_4_ = anIntArrayArrayArray7909[i][i_3_];
		if (b <= -29) {
			int i_5_ = is.length;
			if ((aGLToolkit7926.anIntArray6747.length ^ 0xffffffff) > (i_5_ ^ 0xffffffff)) {
				aGLToolkit7926.anIntArray6747 = new int[i_5_];
				aGLToolkit7926.anIntArray6749 = new int[i_5_];
			}
			int[] is_6_ = aGLToolkit7926.anIntArray6747;
			int[] is_7_ = aGLToolkit7926.anIntArray6749;
			for (int i_8_ = 0; (i_5_ ^ 0xffffffff) < (i_8_ ^ 0xffffffff); i_8_++) {
				is_6_[i_8_] = is[i_8_] >> aGLToolkit7926.anInt6611;
				is_7_[i_8_] = is_4_[i_8_] >> aGLToolkit7926.anInt6611;
			}
			int i_9_ = 0;
			while (i_9_ < i_5_) {
				int i_10_ = is_6_[i_9_];
				int i_11_ = is_7_[i_9_++];
				int i_12_ = is_6_[i_9_];
				int i_13_ = is_7_[i_9_++];
				int i_14_ = is_6_[i_9_];
				int i_15_ = is_7_[i_9_++];
				if ((i_13_ + -i_15_) * (i_10_ + -i_12_) + -((-i_11_ + i_13_) * (-i_12_ + i_14_)) > 0) {
					var_r_Sub2.method2370(i_10_, i_11_, i_12_, i_13_, i_15_, i_14_, 67);
				}
			}
		}
	}
	
	final void method3255(int i, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, boolean[][] bools) {
		anInt7912++;
		if (anInt7948 > 0) {
			aGLToolkit7926.method1424(8);
			aGLToolkit7926.method1478(false, (byte) -53);
			aGLToolkit7926.method1451(false, -31277);
			aGLToolkit7926.method1449(-75, false);
			aGLToolkit7926.method1415(771, false);
			aGLToolkit7926.method1460(0, 3);
			aGLToolkit7926.method1489(-2, -2);
			aGLToolkit7926.method1444(-2, null);
			Node_Sub9_Sub5.aFloatArray9765[5] = (float) i_17_ / (128.0F * (float) anInt3398 * (float) aGLToolkit7926.anInt6567);
			Node_Sub9_Sub5.aFloatArray9765[0] = (float) i_17_ / ((float) aGLToolkit7926.anInt6474 * (128.0F * (float) anInt3398));
			Node_Sub9_Sub5.aFloatArray9765[2] = 0.0F;
			Node_Sub9_Sub5.aFloatArray9765[15] = 1.0F;
			Node_Sub9_Sub5.aFloatArray9765[8] = 0.0F;
			Node_Sub9_Sub5.aFloatArray9765[9] = 0.0F;
			Node_Sub9_Sub5.aFloatArray9765[13] = 1.0F - ((float) (i_17_ * i_21_) / 128.0F + (float) (i_16_ * 2)) / (float) aGLToolkit7926.anInt6567;
			Node_Sub9_Sub5.aFloatArray9765[14] = 0.0F;
			Node_Sub9_Sub5.aFloatArray9765[6] = 0.0F;
			Node_Sub9_Sub5.aFloatArray9765[11] = 0.0F;
			Node_Sub9_Sub5.aFloatArray9765[3] = 0.0F;
			Node_Sub9_Sub5.aFloatArray9765[12] = -(((float) -(2 * i) + (float) (i_17_ * i_18_) / 128.0F) / (float) aGLToolkit7926.anInt6474) + -1.0F;
			Node_Sub9_Sub5.aFloatArray9765[1] = 0.0F;
			Node_Sub9_Sub5.aFloatArray9765[10] = 0.0F;
			Node_Sub9_Sub5.aFloatArray9765[4] = 0.0F;
			Node_Sub9_Sub5.aFloatArray9765[7] = 0.0F;
			OpenGL.glMatrixMode(5889);
			OpenGL.glLoadMatrixf(Node_Sub9_Sub5.aFloatArray9765, 0);
			Node_Sub9_Sub5.aFloatArray9765[12] = 0.0F;
			Node_Sub9_Sub5.aFloatArray9765[15] = 1.0F;
			Node_Sub9_Sub5.aFloatArray9765[10] = 0.0F;
			Node_Sub9_Sub5.aFloatArray9765[9] = 1.0F;
			Node_Sub9_Sub5.aFloatArray9765[14] = 0.0F;
			Node_Sub9_Sub5.aFloatArray9765[8] = 0.0F;
			Node_Sub9_Sub5.aFloatArray9765[0] = 1.0F;
			Node_Sub9_Sub5.aFloatArray9765[5] = 0.0F;
			Node_Sub9_Sub5.aFloatArray9765[7] = 0.0F;
			Node_Sub9_Sub5.aFloatArray9765[6] = 1.0F;
			Node_Sub9_Sub5.aFloatArray9765[4] = 0.0F;
			Node_Sub9_Sub5.aFloatArray9765[11] = 0.0F;
			Node_Sub9_Sub5.aFloatArray9765[2] = 0.0F;
			Node_Sub9_Sub5.aFloatArray9765[1] = 0.0F;
			Node_Sub9_Sub5.aFloatArray9765[3] = 0.0F;
			Node_Sub9_Sub5.aFloatArray9765[13] = 0.0F;
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadMatrixf(Node_Sub9_Sub5.aFloatArray9765, 0);
			if ((0x7 & anInt7911) == 0) {
				aGLToolkit7926.method1451(false, -31277);
			} else {
				aGLToolkit7926.method1451(true, -31277);
				aGLToolkit7926.method1430((byte) 62);
			}
			aGLToolkit7926.method1482((byte) -47, aClass69_7952, aClass69_7953, aClass69_7945, aClass69_7954);
			if (aGLToolkit7926.aFloatBuffer6661.buffer.length >= 2 * anInt7919) {
				aGLToolkit7926.aFloatBuffer6661.offset = 0;
			} else {
				aGLToolkit7926.aFloatBuffer6661 = new FloatBuffer(anInt7919 * 2);
			}
			int i_22_ = 0;
			FloatBuffer floatbuffer = aGLToolkit7926.aFloatBuffer6661;
			if (aGLToolkit7926.aBoolean6736) {
				for (int i_23_ = i_19_; i_23_ < i_21_; i_23_++) {
					int i_24_ = i_23_ * anInt3408 - -i_18_;
					for (int i_25_ = i_18_; i_20_ > i_25_; i_25_++) {
						if (bools[i_25_ + -i_18_][-i_19_ + i_23_]) {
							short[] ses = aShortArrayArray7925[i_24_];
							if (ses != null) {
								for (int i_26_ = 0; (i_26_ ^ 0xffffffff) > (ses.length ^ 0xffffffff); i_26_++) {
									i_22_++;
									floatbuffer.writeShort(ses[i_26_] & 0xffff);
								}
							}
						}
						i_24_++;
					}
				}
			} else {
				for (int i_27_ = i_19_; (i_27_ ^ 0xffffffff) > (i_21_ ^ 0xffffffff); i_27_++) {
					int i_28_ = i_27_ * anInt3408 + i_18_;
					for (int i_29_ = i_18_; i_29_ < i_20_; i_29_++) {
						if (bools[i_29_ - i_18_][-i_19_ + i_27_]) {
							short[] ses = aShortArrayArray7925[i_28_];
							if (ses != null) {
								for (int i_30_ = 0; (i_30_ ^ 0xffffffff) > (ses.length ^ 0xffffffff); i_30_++) {
									floatbuffer.method2191(-74, ses[i_30_] & 0xffff);
									i_22_++;
								}
							}
						}
						i_28_++;
					}
				}
			}
			if (i_22_ > 0) {
				Class200_Sub2 class200_sub2 = new Class200_Sub2(aGLToolkit7926, 5123, floatbuffer.buffer, floatbuffer.offset);
				aGLToolkit7926.method1477((byte) 101, 0, 4, class200_sub2, i_22_);
			}
		}
	}
	
	final void CA(r var_r, int i, int i_31_, int i_32_, int i_33_, boolean bool) {
		anInt7939++;
		if (aClass137_7931 != null && var_r != null) {
			int i_34_ = -(i_31_ * aGLToolkit7926.anInt6732 >> 8) + i >> aGLToolkit7926.anInt6611;
			int i_35_ = -(i_31_ * aGLToolkit7926.anInt6717 >> 8) + i_32_ >> aGLToolkit7926.anInt6611;
			aClass137_7931.method1595((byte) 78, i_34_, i_35_, var_r);
		}
	}
	
	final void YA() {
		anInt7943++;
		if (anInt7948 <= 0) {
			aClass137_7931 = null;
		} else {
			byte[][] bs = new byte[1 + anInt3408][anInt3404 - -1];
			for (int i = 1; i < anInt3408; i++) {
				for (int i_36_ = 1; i_36_ < anInt3404; i_36_++)
					bs[i][i_36_] = (byte) ((aByteArrayArray7951[i][i_36_] >> 1) + (aByteArrayArray7951[i + 1][i_36_] >> 3) + ((aByteArrayArray7951[i - 1][i_36_] >> 2) + (aByteArrayArray7951[i][i_36_ + -1] >> 2)) + (aByteArrayArray7951[i][1 + i_36_] >> 3));
			}
			aNode_Sub33Array7955 = new Node_Sub33[aHashTable7949.method1519((byte) -90)];
			aHashTable7949.method1523((byte) -122, aNode_Sub33Array7955);
			for (int i = 0; (aNode_Sub33Array7955.length ^ 0xffffffff) < (i ^ 0xffffffff); i++)
				aNode_Sub33Array7955[i].method2739(73, anInt7948);
			int i = 24;
			if (anIntArrayArrayArray7908 != null) {
				i += 4;
			}
			if ((0x7 & anInt7911 ^ 0xffffffff) != -1) {
				i += 12;
			}
			jaclib.memory.heap.NativeHeapBuffer nativeheapbuffer = aGLToolkit7926.aNativeHeap6609.a(anInt7948 * i, false);
			Stream stream = new Stream(nativeheapbuffer);
			Node_Sub33[] node_sub33s = new Node_Sub33[anInt7948];
			int i_37_ = Class215.method2072(anInt7948 / 4, true);
			if ((i_37_ ^ 0xffffffff) > -2) {
				i_37_ = 1;
			}
			HashTable hashtable = new HashTable(i_37_);
			Node_Sub33[] node_sub33s_38_ = new Node_Sub33[anInt7944];
			for (int i_39_ = 0; anInt3408 > i_39_; i_39_++) {
				for (int i_40_ = 0; (anInt3404 ^ 0xffffffff) < (i_40_ ^ 0xffffffff); i_40_++) {
					if (anIntArrayArrayArray7934[i_39_][i_40_] != null) {
						Node_Sub33[] node_sub33s_41_ = aNode_Sub33ArrayArrayArray7936[i_39_][i_40_];
						int[] is = anIntArrayArrayArray7929[i_39_][i_40_];
						int[] is_42_ = anIntArrayArrayArray7909[i_39_][i_40_];
						int[] is_43_ = anIntArrayArrayArray7913[i_39_][i_40_];
						int[] is_44_ = anIntArrayArrayArray7934[i_39_][i_40_];
						int[] is_45_ = anIntArrayArrayArray7924 == null ? null : anIntArrayArrayArray7924[i_39_][i_40_];
						int[] is_46_ = anIntArrayArrayArray7908 == null ? null : anIntArrayArrayArray7908[i_39_][i_40_];
						if (is_43_ == null) {
							is_43_ = is_44_;
						}
						float f = aFloatArrayArray7946[i_39_][i_40_];
						float f_47_ = aFloatArrayArray7947[i_39_][i_40_];
						float f_48_ = aFloatArrayArray7957[i_39_][i_40_];
						float f_49_ = aFloatArrayArray7946[i_39_][1 + i_40_];
						float f_50_ = aFloatArrayArray7947[i_39_][1 + i_40_];
						float f_51_ = aFloatArrayArray7957[i_39_][1 + i_40_];
						float f_52_ = aFloatArrayArray7946[1 + i_39_][1 + i_40_];
						float f_53_ = aFloatArrayArray7947[i_39_ - -1][1 + i_40_];
						float f_54_ = aFloatArrayArray7957[1 + i_39_][1 + i_40_];
						float f_55_ = aFloatArrayArray7946[i_39_ + 1][i_40_];
						float f_56_ = aFloatArrayArray7947[i_39_ - -1][i_40_];
						float f_57_ = aFloatArrayArray7957[i_39_ - -1][i_40_];
						int i_58_ = bs[i_39_][i_40_] & 0xff;
						int i_59_ = bs[i_39_][1 + i_40_] & 0xff;
						int i_60_ = 0xff & bs[1 + i_39_][i_40_ - -1];
						int i_61_ = bs[1 + i_39_][i_40_] & 0xff;
						int i_62_ = 0;
					while_102_:
						for (int i_63_ = 0; i_63_ < is_44_.length; i_63_++) {
							Node_Sub33 node_sub33 = node_sub33s_41_[i_63_];
							for (int i_64_ = 0; i_62_ > i_64_; i_64_++) {
								if (node_sub33 == node_sub33s_38_[i_64_]) {
									continue while_102_;
								}
							}
							node_sub33s_38_[i_62_++] = node_sub33;
						}
						short[] ses = aShortArrayArray7925[i_39_ + anInt3408 * i_40_] = new short[is_44_.length];
						for (int i_65_ = 0; i_65_ < is_44_.length; i_65_++) {
							int i_66_ = (i_39_ << anInt3410) + is[i_65_];
							int i_67_ = (i_40_ << anInt3410) - -is_42_[i_65_];
							int i_68_ = i_66_ >> anInt7915;
							int i_69_ = i_67_ >> anInt7915;
							int i_70_ = is_44_[i_65_];
							int i_71_ = is_43_[i_65_];
							int i_72_ = is_45_ == null ? 0 : is_45_[i_65_];
							long l = (long) i_71_ << 48 | (long) i_70_ << 32 | (long) (i_68_ << 16) | (long) i_69_;
							int i_73_ = is[i_65_];
							int i_74_ = is_42_[i_65_];
							int i_75_ = 74;
							int i_76_ = 0;
							float f_77_ = 1.0F;
							float f_78_;
							float f_79_;
							float f_80_;
							if (i_73_ != 0 || i_74_ != 0) {
								if ((i_73_ ^ 0xffffffff) == -1 && i_74_ == anInt3398) {
									f_79_ = f_51_;
									i_75_ -= i_59_;
									f_78_ = f_50_;
									f_80_ = f_49_;
								} else if ((anInt3398 ^ 0xffffffff) == (i_73_ ^ 0xffffffff) && (anInt3398 ^ 0xffffffff) == (i_74_ ^ 0xffffffff)) {
									i_75_ -= i_60_;
									f_79_ = f_54_;
									f_78_ = f_53_;
									f_80_ = f_52_;
								} else if ((anInt3398 ^ 0xffffffff) == (i_73_ ^ 0xffffffff) && i_74_ == 0) {
									i_75_ -= i_61_;
									f_78_ = f_56_;
									f_80_ = f_55_;
									f_79_ = f_57_;
								} else {
									float f_81_ = (float) i_73_ / (float) anInt3398;
									float f_82_ = (float) i_74_ / (float) anInt3398;
									float f_83_ = f + f_81_ * (-f + f_55_);
									float f_84_ = f_81_ * (-f_47_ + f_56_) + f_47_;
									float f_85_ = f_48_ + (-f_48_ + f_57_) * f_81_;
									float f_86_ = f_49_ + (-f_49_ + f_52_) * f_81_;
									float f_87_ = f_50_ + (f_53_ - f_50_) * f_81_;
									f_80_ = f_83_ + f_82_ * (-f_83_ + f_86_);
									float f_88_ = (-f_51_ + f_54_) * f_81_ + f_51_;
									f_78_ = (-f_84_ + f_87_) * f_82_ + f_84_;
									f_79_ = (-f_85_ + f_88_) * f_82_ + f_85_;
									int i_89_ = ((-i_58_ + i_61_) * i_73_ >> anInt3410) + i_58_;
									int i_90_ = i_59_ + (i_73_ * (i_60_ + -i_59_) >> anInt3410);
									i_75_ -= (i_74_ * (-i_89_ + i_90_) >> anInt3410) + i_89_;
								}
							} else {
								f_78_ = f_47_;
								i_75_ -= i_58_;
								f_79_ = f_48_;
								f_80_ = f;
							}
							if ((i_70_ ^ 0xffffffff) != 0) {
								int i_91_ = i_75_ * (0x7f & i_70_) >> 7;
								if ((i_91_ ^ 0xffffffff) > -3) {
									i_91_ = 2;
								} else if (i_91_ > 126) {
									i_91_ = 126;
								}
								i_76_ = Class85.anIntArray1158[0xff80 & i_70_ | i_91_];
								if ((anInt7911 & 0x7 ^ 0xffffffff) == -1) {
									f_77_ = f_79_ * aGLToolkit7926.aFloatArray6664[2] + (f_78_ * aGLToolkit7926.aFloatArray6664[1] + f_80_ * aGLToolkit7926.aFloatArray6664[0]);
									f_77_ = aGLToolkit7926.aFloat6737 + f_77_ * (!(f_77_ > 0.0F) ? aGLToolkit7926.aFloat6648 : aGLToolkit7926.aFloat6645);
								}
							}
							Node node = null;
							if ((anInt7933 - 1 & i_66_ ^ 0xffffffff) == -1 && (-1 + anInt7933 & i_67_) == 0) {
								node = hashtable.method1518(3512, l);
							}
							int i_92_;
							if (node == null) {
								int i_93_;
								if ((i_70_ ^ 0xffffffff) != (i_71_ ^ 0xffffffff)) {
									int i_94_ = (0x7f & i_71_) * i_75_ >> 7;
									if ((i_94_ ^ 0xffffffff) <= -3) {
										if ((i_94_ ^ 0xffffffff) < -127) {
											i_94_ = 126;
										}
									} else {
										i_94_ = 2;
									}
									i_93_ = Class85.anIntArray1158[i_71_ & 0xff80 | i_94_];
									if ((0x7 & anInt7911) == 0) {
										float f_95_ = aGLToolkit7926.aFloatArray6664[1] * f_78_ + f_80_ * aGLToolkit7926.aFloatArray6664[0] + f_79_ * aGLToolkit7926.aFloatArray6664[2];
										f_95_ = (!(f_77_ > 0.0F) ? aGLToolkit7926.aFloat6648 : aGLToolkit7926.aFloat6645) * f_77_ + aGLToolkit7926.aFloat6737;
										int i_96_ = (i_93_ & 0xffb3c0) >> 16;
										int i_97_ = i_93_ >> 8 & 0xff;
										i_96_ *= f_95_;
										int i_98_ = i_93_ & 0xff;
										if ((i_96_ ^ 0xffffffff) <= -1) {
											if ((i_96_ ^ 0xffffffff) < -256) {
												i_96_ = 255;
											}
										} else {
											i_96_ = 0;
										}
										i_97_ *= f_95_;
										if (i_97_ < 0) {
											i_97_ = 0;
										} else if ((i_97_ ^ 0xffffffff) < -256) {
											i_97_ = 255;
										}
										i_98_ *= f_95_;
										if (i_98_ < 0) {
											i_98_ = 0;
										} else if (i_98_ > 255) {
											i_98_ = 255;
										}
										i_93_ = i_96_ << 16 | i_97_ << 8 | i_98_;
									}
								} else {
									i_93_ = i_76_;
								}
								if (!aGLToolkit7926.aBoolean6736) {
									stream.b((float) i_66_);
									stream.b((float) (i_72_ + this.method3260(i_67_, -112, i_66_)));
									stream.b((float) i_67_);
									stream.d((byte) (i_93_ >> 16));
									stream.d((byte) (i_93_ >> 8));
									stream.d((byte) i_93_);
									stream.d(-1);
									stream.b((float) i_66_);
									stream.b((float) i_67_);
									if (anIntArrayArrayArray7908 != null) {
										stream.b((float) (is_46_ == null ? 0 : is_46_[i_65_] - 1));
									}
									if ((0x7 & anInt7911) != 0) {
										stream.b(f_80_);
										stream.b(f_78_);
										stream.b(f_79_);
									}
								} else {
									stream.a((float) i_66_);
									stream.a((float) (i_72_ + this.method3260(i_67_, -110, i_66_)));
									stream.a((float) i_67_);
									stream.d((byte) (i_93_ >> 16));
									stream.d((byte) (i_93_ >> 8));
									stream.d((byte) i_93_);
									stream.d(-1);
									stream.a((float) i_66_);
									stream.a((float) i_67_);
									if (anIntArrayArrayArray7908 != null) {
										stream.a((float) (is_46_ == null ? 0 : -1 + is_46_[i_65_]));
									}
									if ((0x7 & anInt7911 ^ 0xffffffff) != -1) {
										stream.a(f_80_);
										stream.a(f_78_);
										stream.a(f_79_);
									}
								}
								i_92_ = anInt7932++;
								ses[i_65_] = (short) i_92_;
								if ((i_70_ ^ 0xffffffff) != 0) {
									node_sub33s[i_92_] = node_sub33s_41_[i_65_];
								}
								hashtable.method1515(l, new Node_Sub46(ses[i_65_]), -125);
							} else {
								ses[i_65_] = ((Node_Sub46) node).aShort7554;
								i_92_ = ses[i_65_] & 0xffff;
								if (i_70_ != -1 && node_sub33s[i_92_].aLong2797 > node_sub33s_41_[i_65_].aLong2797) {
									node_sub33s[i_92_] = node_sub33s_41_[i_65_];
								}
							}
							for (int i_99_ = 0; i_99_ < i_62_; i_99_++)
								node_sub33s_38_[i_99_].method2734(i_76_, i_75_, f_77_, i_92_, -28663);
							anInt7919++;
						}
					}
				}
			}
			for (int i_100_ = 0; (anInt7932 ^ 0xffffffff) < (i_100_ ^ 0xffffffff); i_100_++) {
				Node_Sub33 node_sub33 = node_sub33s[i_100_];
				if (node_sub33 != null) {
					node_sub33.method2737((byte) 125, i_100_);
				}
			}
			for (int i_101_ = 0; i_101_ < anInt3408; i_101_++) {
				for (int i_102_ = 0; (i_102_ ^ 0xffffffff) > (anInt3404 ^ 0xffffffff); i_102_++) {
					short[] ses = aShortArrayArray7925[i_101_ + i_102_ * anInt3408];
					if (ses != null) {
						int i_103_ = 0;
						int i_104_ = 0;
						while (ses.length > i_104_) {
							int i_105_ = 0xffff & ses[i_104_++];
							int i_106_ = 0xffff & ses[i_104_++];
							int i_107_ = ses[i_104_++] & 0xffff;
							Node_Sub33 node_sub33 = node_sub33s[i_105_];
							Node_Sub33 node_sub33_108_ = node_sub33s[i_106_];
							Node_Sub33 node_sub33_109_ = node_sub33s[i_107_];
							Node_Sub33 node_sub33_110_ = null;
							if (node_sub33 != null) {
								node_sub33.method2738(i_101_, i_103_, true, i_102_);
								node_sub33_110_ = node_sub33;
							}
							if (node_sub33_108_ != null) {
								node_sub33_108_.method2738(i_101_, i_103_, true, i_102_);
								if (node_sub33_110_ == null || (node_sub33_110_.aLong2797 ^ 0xffffffffffffffffL) < (node_sub33_108_.aLong2797 ^ 0xffffffffffffffffL)) {
									node_sub33_110_ = node_sub33_108_;
								}
							}
							if (node_sub33_109_ != null) {
								node_sub33_109_.method2738(i_101_, i_103_, true, i_102_);
								if (node_sub33_110_ == null || (node_sub33_110_.aLong2797 ^ 0xffffffffffffffffL) < (node_sub33_109_.aLong2797 ^ 0xffffffffffffffffL)) {
									node_sub33_110_ = node_sub33_109_;
								}
							}
							if (node_sub33_110_ != null) {
								if (node_sub33 != null) {
									node_sub33_110_.method2737((byte) 105, i_105_);
								}
								if (node_sub33_108_ != null) {
									node_sub33_110_.method2737((byte) 97, i_106_);
								}
								if (node_sub33_109_ != null) {
									node_sub33_110_.method2737((byte) 103, i_107_);
								}
								node_sub33_110_.method2738(i_101_, i_103_, true, i_102_);
							}
							i_103_++;
						}
					}
				}
			}
			stream.c();
			anInterface9_7956 = aGLToolkit7926.method1459(-1, i, nativeheapbuffer, false, stream.a());
			aClass69_7945 = new Class69(anInterface9_7956, 5126, 3, 0);
			aClass69_7952 = new Class69(anInterface9_7956, 5121, 4, 12);
			int i_111_;
			if (anIntArrayArrayArray7908 != null) {
				i_111_ = 28;
				aClass69_7954 = new Class69(anInterface9_7956, 5126, 3, 16);
			} else {
				i_111_ = 24;
				aClass69_7954 = new Class69(anInterface9_7956, 5126, 2, 16);
			}
			if ((anInt7911 & 0x7) != 0) {
				aClass69_7953 = new Class69(anInterface9_7956, 5126, 3, i_111_);
			}
			long[] ls = new long[aNode_Sub33Array7955.length];
			for (int i_112_ = 0; i_112_ < aNode_Sub33Array7955.length; i_112_++) {
				Node_Sub33 node_sub33 = aNode_Sub33Array7955[i_112_];
				ls[i_112_] = node_sub33.aLong2797;
				node_sub33.method2735((byte) -92, anInt7932);
			}
			ObjectDefinition.method3045(ls, aNode_Sub33Array7955, false);
			if (aClass137_7931 != null) {
				aClass137_7931.method1594((byte) -111);
			}
		}
		anIntArrayArrayArray7929 = anIntArrayArrayArray7909 = null;
		aHashTable7949 = null;
		anIntArrayArrayArray7908 = null;
		anIntArrayArrayArray7924 = null;
		anIntArrayArrayArray7913 = null;
		aByteArrayArray7951 = null;
		anIntArrayArrayArray7934 = null;
		aNode_Sub33ArrayArrayArray7936 = null;
		aFloatArrayArray7946 = aFloatArrayArray7947 = aFloatArrayArray7957 = null;
	}
	
	final void method3257(int i, int i_113_) {
		anInt7942++;
	}
	
	final void ka(int i, int i_114_, int i_115_) {
		if ((i_115_ ^ 0xffffffff) < (aByteArrayArray7951[i][i_114_] & 0xff ^ 0xffffffff)) {
			aByteArrayArray7951[i][i_114_] = (byte) i_115_;
		}
		anInt7910++;
	}
	
	final void wa(r var_r, int i, int i_116_, int i_117_, int i_118_, boolean bool) {
		anInt7928++;
		if (aClass137_7931 != null && var_r != null) {
			int i_119_ = i + -(i_116_ * aGLToolkit7926.anInt6732 >> 8) >> aGLToolkit7926.anInt6611;
			int i_120_ = -(aGLToolkit7926.anInt6717 * i_116_ >> 8) + i_117_ >> aGLToolkit7926.anInt6611;
			aClass137_7931.method1598(i_120_, var_r, i_119_, (byte) 63);
		}
	}
	
	final boolean method3256(r var_r, int i, int i_121_, int i_122_, int i_123_, boolean bool) {
		anInt7940++;
		if (aClass137_7931 == null || var_r == null) {
			return false;
		}
		int i_124_ = i + -(i_121_ * aGLToolkit7926.anInt6732 >> 8) >> aGLToolkit7926.anInt6611;
		int i_125_ = -(i_121_ * aGLToolkit7926.anInt6717 >> 8) + i_122_ >> aGLToolkit7926.anInt6611;
		return aClass137_7931.method1597(1, i_124_, var_r, i_125_);
	}
	
	GLPlane(GLToolkit gltoolkit, int i, int i_126_, int i_127_, int i_128_, int[][] is, int[][] is_129_, int i_130_) {
		super(i_127_, i_128_, i_130_, is);
		aGLToolkit7926 = gltoolkit;
		aByteArrayArray7951 = new byte[i_127_ + 1][i_128_ + 1];
		aNode_Sub33ArrayArrayArray7936 = new Node_Sub33[i_127_][i_128_][];
		anIntArrayArrayArray7913 = new int[i_127_][i_128_][];
		anInt7911 = i_126_;
		aShortArrayArray7925 = new short[i_127_ * i_128_][];
		aFloatArrayArray7946 = new float[1 + anInt3408][1 + anInt3404];
		anIntArrayArrayArray7909 = new int[i_127_][i_128_][];
		anIntArrayArrayArray7929 = new int[i_127_][i_128_][];
		aFloatArrayArray7947 = new float[1 + anInt3408][anInt3404 + 1];
		anIntArrayArrayArray7934 = new int[i_127_][i_128_][];
		aByteArrayArray7938 = new byte[i_127_][i_128_];
		anIntArrayArrayArray7924 = new int[i_127_][i_128_][];
		aFloatArrayArray7957 = new float[1 + anInt3408][anInt3404 + 1];
		anInt7933 = 1 << anInt7915;
		for (int i_131_ = 1; (anInt3404 ^ 0xffffffff) < (i_131_ ^ 0xffffffff); i_131_++) {
			for (int i_132_ = 1; (i_132_ ^ 0xffffffff) > (anInt3408 ^ 0xffffffff); i_132_++) {
				int i_133_ = is_129_[i_132_ + 1][i_131_] + -is_129_[i_132_ + -1][i_131_];
				int i_134_ = -is_129_[i_132_][i_131_ - 1] + is_129_[i_132_][i_131_ - -1];
				float f = (float) (1.0 / Math.sqrt((double) (i_134_ * i_134_ + (i_130_ * (4 * i_130_) + i_133_ * i_133_))));
				aFloatArrayArray7946[i_132_][i_131_] = (float) i_133_ * f;
				aFloatArrayArray7947[i_132_][i_131_] = (float) (-i_130_ * 2) * f;
				aFloatArrayArray7957[i_132_][i_131_] = f * (float) i_134_;
			}
		}
		aHashTable7949 = new HashTable(128);
		if ((0x10 & anInt7911) != 0) {
			aClass137_7931 = new Class137(aGLToolkit7926, this);
		}
	}
	
	final void U(int i, int i_135_, int[] is, int[] is_136_, int[] is_137_, int[] is_138_, int[] is_139_, int[] is_140_, int[] is_141_, int[] is_142_, int i_143_, int i_144_, int i_145_, boolean bool) {
		anInt7922++;
		if (is_136_ != null && anIntArrayArrayArray7924 == null) {
			anIntArrayArrayArray7924 = new int[anInt3408][anInt3404][];
		}
		if (is_138_ != null && anIntArrayArrayArray7908 == null) {
			anIntArrayArrayArray7908 = new int[anInt3408][anInt3404][];
		}
		d var_d = aGLToolkit7926.aD1543;
		anIntArrayArrayArray7929[i][i_135_] = is;
		anIntArrayArrayArray7909[i][i_135_] = is_137_;
		anIntArrayArrayArray7934[i][i_135_] = is_139_;
		anIntArrayArrayArray7913[i][i_135_] = is_140_;
		if (anIntArrayArrayArray7908 != null) {
			anIntArrayArrayArray7908[i][i_135_] = is_138_;
		}
		if (anIntArrayArrayArray7924 != null) {
			anIntArrayArrayArray7924[i][i_135_] = is_136_;
		}
		Node_Sub33[] node_sub33s = aNode_Sub33ArrayArrayArray7936[i][i_135_] = new Node_Sub33[is_139_.length];
		for (int i_146_ = 0; i_146_ < is_139_.length; i_146_++) {
			int i_147_ = is_141_[i_146_];
			int i_148_ = is_142_[i_146_];
			if ((0x20 & anInt7911) != 0 && (i_147_ ^ 0xffffffff) != 0 && var_d.method10(i_147_, -8217).aBoolean1223) {
				i_147_ = -1;
				i_148_ = 128;
			}
			long l = (long) i_147_ | ((long) i_145_ << 48 | (long) i_144_ << 42 | (long) i_143_ << 28 | (long) (i_148_ << 14));
			Node node;
			for (node = aHashTable7949.method1518(3512, l); node != null; node = aHashTable7949.method1524((byte) 84)) {
				Node_Sub33 node_sub33 = (Node_Sub33) node;
				if ((node_sub33.anInt7400 ^ 0xffffffff) == (i_147_ ^ 0xffffffff) && (float) i_148_ == node_sub33.aFloat7389 && (i_143_ ^ 0xffffffff) == (node_sub33.anInt7401 ^ 0xffffffff) && node_sub33.anInt7403 == i_144_ && (node_sub33.anInt7392 ^ 0xffffffff) == (i_145_ ^ 0xffffffff)) {
					break;
				}
			}
			if (node != null) {
				node_sub33s[i_146_] = (Node_Sub33) node;
			} else {
				node_sub33s[i_146_] = new Node_Sub33(this, i_147_, i_148_, i_143_, i_144_, i_145_);
				aHashTable7949.method1515(l, node_sub33s[i_146_], -125);
			}
		}
		if (bool) {
			aByteArrayArray7938[i][i_135_] = (byte) Node_Sub16.method2590(aByteArrayArray7938[i][i_135_], 1);
		}
		if ((anInt7944 ^ 0xffffffff) > (is_139_.length ^ 0xffffffff)) {
			anInt7944 = is_139_.length;
		}
		anInt7948 += is_139_.length;
	}
	
	final void method3259(int i, int i_149_, int i_150_, boolean[][] bools, boolean bool, int i_151_, int i_152_) {
		anInt7930++;
		method3262(bool, bools, 113, i, i_151_, i_150_, i_149_, i_152_);
	}
	
	private final void method3262(boolean bool, boolean[][] bools, int i, int i_153_, int i_154_, int i_155_, int i_156_, int i_157_) {
		anInt7923++;
		if (aNode_Sub33Array7955 != null) {
			int i_158_ = 1 + i_155_ + i_155_;
			i_158_ *= i_158_;
			if (i_158_ > aGLToolkit7926.anIntArray6748.length) {
				aGLToolkit7926.anIntArray6748 = new int[i_158_];
			}
			if ((aGLToolkit7926.aFloatBuffer6661.buffer.length ^ 0xffffffff) > (anInt7919 * 2 ^ 0xffffffff)) {
				aGLToolkit7926.aFloatBuffer6661 = new FloatBuffer(anInt7919 * 2);
			}
			int i_159_ = i_153_ - i_155_;
			int i_160_ = i_159_;
			if ((i_159_ ^ 0xffffffff) > -1) {
				i_159_ = 0;
			}
			int i_161_ = i_156_ + -i_155_;
			int i_162_ = i_161_;
			if (i_161_ < 0) {
				i_161_ = 0;
			}
			int i_163_ = i_153_ - -i_155_;
			if ((-1 + anInt3408 ^ 0xffffffff) > (i_163_ ^ 0xffffffff)) {
				i_163_ = -1 + anInt3408;
			}
			int i_164_ = i_155_ + i_156_;
			if ((i_164_ ^ 0xffffffff) < (anInt3404 + -1 ^ 0xffffffff)) {
				i_164_ = anInt3404 + -1;
			}
			int i_165_ = 0;
			int[] is = aGLToolkit7926.anIntArray6748;
			for (int i_166_ = i_159_; i_166_ <= i_163_; i_166_++) {
				boolean[] bools_167_ = bools[i_166_ - i_160_];
				for (int i_168_ = i_161_; i_164_ >= i_168_; i_168_++) {
					if (bools_167_[i_168_ - i_162_]) {
						is[i_165_++] = i_166_ + i_168_ * anInt3408;
					}
				}
			}
			if ((i_154_ ^ 0xffffffff) == 0) {
				aGLToolkit7926.method1470(1);
			} else {
				aGLToolkit7926.method1407((byte) -111, (float) i_154_);
				aGLToolkit7926.method1421(1);
			}
			aGLToolkit7926.method1451((anInt7911 & 0x7) != 0, -31277);
			for (int i_169_ = 0; (i_169_ ^ 0xffffffff) > (aNode_Sub33Array7955.length ^ 0xffffffff); i_169_++)
				aNode_Sub33Array7955[i_169_].method2732(0, is, i_165_);
			if (!aClass312_7914.method3616(0)) {
				int i_170_ = aGLToolkit7926.anInt6678;
				int i_171_ = aGLToolkit7926.anInt6691;
				aGLToolkit7926.L(0, i_171_, aGLToolkit7926.anInt6692);
				aGLToolkit7926.method1451(false, -31277);
				aGLToolkit7926.method1415(771, false);
				aGLToolkit7926.method1460(128, 3);
				aGLToolkit7926.method1489(-2, -2);
				aGLToolkit7926.method1444(-2, aGLToolkit7926.aClass169_Sub2_6683);
				aGLToolkit7926.method1474(-43, 7681, 8448);
				aGLToolkit7926.method1464(34166, 770, 0, (byte) -51);
				aGLToolkit7926.method1472(-116, 0, 770, 34167);
				for (Node node = aClass312_7914.method3613(65280); node != null; node = aClass312_7914.method3620(16776960)) {
					Node_Sub26 node_sub26 = (Node_Sub26) node;
					node_sub26.method2685(i_153_, bools, (byte) -125, i_155_, i_156_);
				}
				aGLToolkit7926.method1464(5890, 768, 0, (byte) -51);
				aGLToolkit7926.method1472(-60, 0, 770, 5890);
				aGLToolkit7926.method1444(-2, null);
				aGLToolkit7926.L(i_170_, i_171_, aGLToolkit7926.anInt6692);
			}
			if (aClass137_7931 != null) {
				OpenGL.glPushMatrix();
				OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
				aGLToolkit7926.method1482((byte) -77, null, null, aClass69_7945, aClass69_7954);
				aClass137_7931.method1596(i_153_, bool, true, i_156_, bools, i_155_);
				OpenGL.glPopMatrix();
			}
		}
		if (i <= 98) {
			anInt7920 = -75;
		}
	}
	
	final r fa(int i, int i_172_, r var_r) {
		anInt7917++;
		if ((0x1 & aByteArrayArray7938[i][i_172_]) == 0) {
			return null;
		}
		int i_173_ = anInt3398 >> aGLToolkit7926.anInt6611;
		r_Sub2 var_r_Sub2 = (r_Sub2) var_r;
		r_Sub2 var_r_Sub2_174_;
		if (var_r_Sub2 == null || !var_r_Sub2.method2373(i_173_, 0, i_173_)) {
			var_r_Sub2_174_ = new r_Sub2(aGLToolkit7926, i_173_, i_173_);
		} else {
			var_r_Sub2_174_ = var_r_Sub2;
			var_r_Sub2_174_.method2374(-8);
		}
		var_r_Sub2_174_.method2372(i_173_, 0, (byte) 62, i_173_, 0);
		method3261(var_r_Sub2_174_, i, (byte) -120, i_172_);
		return var_r_Sub2_174_;
	}
	
	final void method3253(int i, int i_175_, int[] is, int[] is_176_, int[] is_177_, int[] is_178_, int[] is_179_, int[] is_180_, int[] is_181_, int[] is_182_, int[] is_183_, int[] is_184_, int[] is_185_, int i_186_, int i_187_, int i_188_, boolean bool) {
		anInt7935++;
		int i_189_ = is_182_.length;
		int[] is_190_ = new int[3 * i_189_];
		int[] is_191_ = new int[i_189_ * 3];
		int[] is_192_ = new int[3 * i_189_];
		int[] is_193_ = new int[3 * i_189_];
		int[] is_194_ = new int[3 * i_189_];
		int[] is_195_ = new int[i_189_ * 3];
		int[] is_196_ = is_176_ == null ? null : new int[3 * i_189_];
		int[] is_197_ = is_178_ == null ? null : new int[i_189_ * 3];
		int i_198_ = 0;
		for (int i_199_ = 0; (i_199_ ^ 0xffffffff) > (i_189_ ^ 0xffffffff); i_199_++) {
			int i_200_ = is_179_[i_199_];
			int i_201_ = is_180_[i_199_];
			int i_202_ = is_181_[i_199_];
			is_190_[i_198_] = is[i_200_];
			is_191_[i_198_] = is_177_[i_200_];
			is_192_[i_198_] = is_182_[i_199_];
			is_194_[i_198_] = is_184_[i_199_];
			is_195_[i_198_] = is_185_[i_199_];
			is_193_[i_198_] = is_183_ == null ? is_182_[i_199_] : is_183_[i_199_];
			if (is_176_ != null) {
				is_196_[i_198_] = is_176_[i_200_];
			}
			if (is_178_ != null) {
				is_197_[i_198_] = is_178_[i_200_];
			}
			i_198_++;
			is_190_[i_198_] = is[i_201_];
			is_191_[i_198_] = is_177_[i_201_];
			is_192_[i_198_] = is_182_[i_199_];
			is_194_[i_198_] = is_184_[i_199_];
			is_195_[i_198_] = is_185_[i_199_];
			is_193_[i_198_] = is_183_ == null ? is_182_[i_199_] : is_183_[i_199_];
			if (is_176_ != null) {
				is_196_[i_198_] = is_176_[i_201_];
			}
			if (is_178_ != null) {
				is_197_[i_198_] = is_178_[i_201_];
			}
			i_198_++;
			is_190_[i_198_] = is[i_202_];
			is_191_[i_198_] = is_177_[i_202_];
			is_192_[i_198_] = is_182_[i_199_];
			is_194_[i_198_] = is_184_[i_199_];
			is_195_[i_198_] = is_185_[i_199_];
			is_193_[i_198_] = is_183_ == null ? is_182_[i_199_] : is_183_[i_199_];
			if (is_176_ != null) {
				is_196_[i_198_] = is_176_[i_202_];
			}
			if (is_178_ != null) {
				is_197_[i_198_] = is_178_[i_202_];
			}
			i_198_++;
		}
		U(i, i_175_, is_190_, is_196_, is_191_, is_197_, is_192_, is_193_, is_194_, is_195_, i_186_, i_187_, i_188_, bool);
	}
	
	public static void method3263(byte b) {
		anIntArray7918 = null;
		aBooleanArrayArray7950 = null;
		if (b <= 110) {
			method3263((byte) 99);
		}
	}
	
	static final char method3264(char c, boolean bool) {
		anInt7927++;
		if (c == 198) {
			return 'E';
		}
		if (c == 230) {
			return 'e';
		}
		if (bool != true) {
			anIntArray7918 = null;
		}
		if ((c ^ 0xffffffff) == -224) {
			return 's';
		}
		if (c == 338) {
			return 'E';
		}
		if (c == 339) {
			return 'e';
		}
		return '\0';
	}
}
