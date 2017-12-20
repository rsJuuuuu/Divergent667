/* Animable_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

public class Animable_Sub3_Sub1 extends Animable_Sub3
{
	protected int anInt10996;
	static int anInt10997;
	static int anInt10998;
	static int anInt10999;
	static int anInt11000;
	protected int anInt11001;
	private boolean aBoolean11002;
	protected int anInt11003;
	static OutcommingPacket aClass318_11004 = new OutcommingPacket(37, -1);
	protected int anInt11005;
	static int anInt11006;
	protected int anInt11007 = -1;
	static Model[] aModelArray11008 = new Model[4];
	static int anInt11009;
	protected int anInt11010;
	private int anInt11011;
	static int anInt11012 = 0;
	static int anInt11013;
	static float aFloat11014;
	static int anInt11015;
	static int anInt11016;
	static Class234 aClass234_11017;
	static int anInt11018;
	protected int anInt11019;
	
	public static void method923(int i) {
		aModelArray11008 = null;
		if (i != 7528) {
			method923(100);
		}
		aClass234_11017 = null;
		aClass318_11004 = null;
	}
	
	final int method818(byte b) {
		anInt11015++;
		ItemDefinitions itemdefinition = EntityNode_Sub3_Sub1.aClass86_9166.method1010(anInt10996, 14434);
		int i = itemdefinition.anInt1919;
		if (anInt11010 != -1) {
			ItemDefinitions itemdefinition_0_ = EntityNode_Sub3_Sub1.aClass86_9166.method1010(anInt11010, 14434);
			if (itemdefinition_0_.anInt1919 > i) {
				i = itemdefinition_0_.anInt1919;
			}
		}
		if ((anInt11007 ^ 0xffffffff) != 0) {
			ItemDefinitions itemdefinition_2_ = EntityNode_Sub3_Sub1.aClass86_9166.method1010(anInt11007, 14434);
			if ((itemdefinition_2_.anInt1919 ^ 0xffffffff) < (i ^ 0xffffffff)) {
				i = itemdefinition_2_.anInt1919;
			}
		}
		return i;
	}
	
	static final byte[] method924(byte b, File file, int i) {
		anInt11006++;
		try {
			byte[] bs = new byte[i];
			if (b != 22) {
				method923(82);
			}
			Class150.method1653(file, 127, bs, i);
			return bs;
		} catch (java.io.IOException ioexception) {
			return null;
		}
	}
	
	final boolean method813(int i) {
		anInt10997++;
		if (i != 0) {
			anInt11011 = -87;
		}
		return aBoolean11002;
	}
	
	final int method823(byte b) {
		anInt10998++;
		if (b != -21) {
			return -65;
		}
		return anInt11011;
	}
	
	final void method820(GraphicsToolkit graphicstoolkit, int i) {
		if (i == -5) {
			anInt11013++;
		}
	}
	
	final Class171 method809(GraphicsToolkit graphicstoolkit, int i) {
		if (i > -93) {
			method809(null, 61);
		}
		anInt10999++;
		return null;
	}
	
	final int method817(int i) {
		if (i != 2) {
			return -14;
		}
		anInt11016++;
		return -10;
	}
	
	final boolean method810(int i, int i_3_, boolean bool, GraphicsToolkit graphicstoolkit) {
		anInt11009++;
		if (bool != false) {
			method809(null, 104);
		}
		Class336 class336 = graphicstoolkit.A();
		class336.method3854(anInt5934, anInt5937 + -10, anInt5940);
		ItemDefinitions itemdefinition = EntityNode_Sub3_Sub1.aClass86_9166.method1010(anInt10996, 14434);
		DrawableModel drawablemodel = itemdefinition.method1689(null, 131072, null, anInt11003, graphicstoolkit, 89);
		if (drawablemodel != null && (!Node_Sub15_Sub10.aBoolean9850 ? drawablemodel.method624(i_3_, i, class336, true, itemdefinition.anInt1919) : drawablemodel.method621(i_3_, i, class336, true, itemdefinition.anInt1919, Class308.anInt3912))) {
			return true;
		}
		if ((anInt11010 ^ 0xffffffff) != 0) {
			ItemDefinitions itemdefinition_4_ = EntityNode_Sub3_Sub1.aClass86_9166.method1010(anInt11010, 14434);
			drawablemodel = itemdefinition_4_.method1689(null, 131072, null, anInt11005, graphicstoolkit, 116);
			if (drawablemodel != null && (Node_Sub15_Sub10.aBoolean9850 ? drawablemodel.method621(i_3_, i, class336, true, itemdefinition_4_.anInt1919, Class308.anInt3912) : drawablemodel.method624(i_3_, i, class336, true, itemdefinition_4_.anInt1919))) {
				return true;
			}
		}
		if ((anInt11007 ^ 0xffffffff) != 0) {
			ItemDefinitions itemdefinition_5_ = EntityNode_Sub3_Sub1.aClass86_9166.method1010(anInt11007, 14434);
			drawablemodel = itemdefinition_5_.method1689(null, 131072, null, anInt11001, graphicstoolkit, 118);
			if (drawablemodel != null && (!Node_Sub15_Sub10.aBoolean9850 ? drawablemodel.method624(i_3_, i, class336, true, itemdefinition_5_.anInt1919) : drawablemodel.method621(i_3_, i, class336, true, itemdefinition_5_.anInt1919, Class308.anInt3912))) {
				return true;
			}
		}
		return false;
	}
	
	final boolean method814(byte b) {
		anInt11018++;
		return false;
	}
	
	Animable_Sub3_Sub1(int i, int i_6_, int i_7_, int i_8_, int i_9_) {
		super(i, i_6_, i_7_, i_8_, i_9_);
		aBoolean11002 = false;
		anInt11011 = 0;
		anInt11010 = -1;
		anInt11019 = 0;
	}
	
	final EntityNode_Sub6 method807(int i, GraphicsToolkit graphicstoolkit) {
		anInt11000++;
		Class256 class256 = Class290_Sub7.method3442(plane, anInt5934 >> Class36.anInt549, anInt5940 >> Class36.anInt549);
		Animable_Sub1 animable_sub1 = Class270_Sub1_Sub1.method3303(plane, anInt5934 >> Class36.anInt549, anInt5940 >> Class36.anInt549);
		int i_10_ = 0;
		if (class256 != null && class256.aMobile3239.aBoolean9121) {
			i_10_ = class256.aMobile3239.method817(2);
		}
		if (animable_sub1 != null && (-i_10_ ^ 0xffffffff) > (animable_sub1.aShort9102 ^ 0xffffffff)) {
			i_10_ = -animable_sub1.aShort9102;
		}
		if (i_10_ != anInt11019) {
			anInt5937 -= anInt11019;
			anInt11019 = i_10_;
			anInt5937 += i_10_;
		}
		Class336 class336 = graphicstoolkit.A();
		class336.method3862();
		if (anInt11019 == 0) {
			Plane plane = Class320_Sub10.aPlaneArray8300[aByte5931];
			int i_14_ = anInt11011 << 1;
			int i_15_ = i_14_;
			int i_16_ = -i_14_ / 2;
			int i_17_ = -i_15_ / 2;
			int i_18_ = plane.method3260(anInt5940 + i_17_, -122, i_16_ + anInt5934);
			int i_19_ = i_14_ / 2;
			int i_20_ = -i_15_ / 2;
			int i_21_ = plane.method3260(anInt5940 - -i_20_, -125, i_19_ + anInt5934);
			int i_22_ = -i_14_ / 2;
			int i_23_ = i_15_ / 2;
			int i_24_ = plane.method3260(i_23_ + anInt5940, -117, anInt5934 + i_22_);
			int i_25_ = i_14_ / 2;
			int i_26_ = i_15_ / 2;
			int i_27_ = plane.method3260(anInt5940 - -i_26_, -123, i_25_ + anInt5934);
			int i_28_ = (i_21_ ^ 0xffffffff) < (i_18_ ^ 0xffffffff) ? i_18_ : i_21_;
			int i_29_ = i_27_ > i_24_ ? i_24_ : i_27_;
			int i_30_ = (i_21_ ^ 0xffffffff) > (i_27_ ^ 0xffffffff) ? i_21_ : i_27_;
			int i_31_ = i_18_ >= i_24_ ? i_24_ : i_18_;
			if (i_15_ != 0) {
				int i_32_ = 0x3fff & (int) (2607.5945876176133 * Math.atan2((double) (-i_29_ + i_28_), (double) i_15_));
				if ((i_32_ ^ 0xffffffff) != -1) {
					class336.method3859(i_32_);
				}
			}
			if (i_14_ != 0) {
				int i_33_ = 0x3fff & (int) (Math.atan2((double) (-i_30_ + i_31_), (double) i_14_) * 2607.5945876176133);
				if (i_33_ != 0) {
					class336.method3868(-i_33_);
				}
			}
			int i_34_ = i_27_ + i_18_;
			if ((i_24_ + i_21_ ^ 0xffffffff) > (i_34_ ^ 0xffffffff)) {
				i_34_ = i_21_ + i_24_;
			}
			i_34_ = (i_34_ >> 1) + -anInt5937;
			if ((i_34_ ^ 0xffffffff) != -1) {
				class336.method3863(0, i_34_, 0);
			}
		}
		class336.method3863(anInt5934, -10 + anInt5937, anInt5940);
		EntityNode_Sub6 entitynode_sub6 = Class345.method3972(true, (byte) 69, 3);
		anInt11011 = 0;
		aBoolean11002 = false;
		if (anInt11007 != -1) {
			DrawableModel drawablemodel = EntityNode_Sub3_Sub1.aClass86_9166.method1010(anInt11007, 14434).method1689(null, 2048, null, anInt11001, graphicstoolkit, 83);
			if (drawablemodel != null) {
				if (!Node_Sub15_Sub10.aBoolean9850) {
					drawablemodel.method611(class336, entitynode_sub6.anEntityNode_Sub5Array5995[2], 0);
				} else {
					drawablemodel.method622(class336, entitynode_sub6.anEntityNode_Sub5Array5995[2], Class308.anInt3912, 0);
				}
				aBoolean11002 |= drawablemodel.F();
				anInt11011 = drawablemodel.ma();
			}
		}
		if ((anInt11010 ^ 0xffffffff) != 0) {
			DrawableModel drawablemodel = EntityNode_Sub3_Sub1.aClass86_9166.method1010(anInt11010, 14434).method1689(null, 2048, null, anInt11005, graphicstoolkit, 68);
			if (drawablemodel != null) {
				if (!Node_Sub15_Sub10.aBoolean9850) {
					drawablemodel.method611(class336, entitynode_sub6.anEntityNode_Sub5Array5995[1], 0);
				} else {
					drawablemodel.method622(class336, entitynode_sub6.anEntityNode_Sub5Array5995[1], Class308.anInt3912, 0);
				}
				aBoolean11002 |= drawablemodel.F();
				if (drawablemodel.ma() > anInt11011) {
					anInt11011 = drawablemodel.ma();
				}
			}
		}
		DrawableModel drawablemodel = EntityNode_Sub3_Sub1.aClass86_9166.method1010(anInt10996, 14434).method1689(null, 2048, null, anInt11003, graphicstoolkit, 127);
		if (drawablemodel != null) {
			if (!Node_Sub15_Sub10.aBoolean9850) {
				drawablemodel.method611(class336, entitynode_sub6.anEntityNode_Sub5Array5995[0], 0);
			} else {
				drawablemodel.method622(class336, entitynode_sub6.anEntityNode_Sub5Array5995[0], Class308.anInt3912, 0);
			}
			aBoolean11002 |= drawablemodel.F();
			if ((drawablemodel.ma() ^ 0xffffffff) < (anInt11011 ^ 0xffffffff)) {
				anInt11011 = drawablemodel.ma();
			}
		}
		return entitynode_sub6;
	}
}
