/* Class112 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class112
{
	static int anInt1419;
	static int anInt1420;
	private Class353 aClass353_1421;
	private int anInt1422;
	static int anInt1423;
	protected boolean aBoolean1424 = false;
	static int anInt1425;
	static int anInt1426;
	private Class61 aClass61_1427 = new Class61(64);
	static int anInt1428;
	static int anInt1429;
	private Index aClass302_1430;
	protected boolean aBoolean1431;
	static int anInt1432;
	protected Index aClass302_1433;
	protected Class61 aClass61_1434 = new Class61(500);
	protected Class61 aClass61_1435 = new Class61(30);
	protected Class61 aClass61_1436 = new Class61(50);
	protected int anInt1437;
	private String[] aStringArray1438;
	
	final void method1140(int i) {
		synchronized (aClass61_1427) {
			aClass61_1427.method602((byte) -121);
		}
		anInt1426++;
		synchronized (aClass61_1434) {
			aClass61_1434.method602((byte) -119);
		}
		synchronized (aClass61_1435) {
			aClass61_1435.method602((byte) -125);
		}
		synchronized (aClass61_1436) {
			if (i > -9) {
				aBoolean1431 = false;
			}
			aClass61_1436.method602((byte) -117);
		}
	}
	
	final void method1141(boolean bool, int i) {
		anInt1420++;
		if (!bool != !aBoolean1431) {
			aBoolean1431 = bool;
			method1142(52);
			if (i != 32648) {
				aClass61_1435 = null;
			}
		}
	}
	
	final void method1142(int i) {
		anInt1429++;
		if (i < 13) {
			aStringArray1438 = null;
		}
		synchronized (aClass61_1427) {
			aClass61_1427.method608(false);
		}
		synchronized (aClass61_1434) {
			aClass61_1434.method608(false);
		}
		synchronized (aClass61_1435) {
			aClass61_1435.method608(false);
		}
		synchronized (aClass61_1436) {
			aClass61_1436.method608(false);
		}
	}
	
	final void method1143(int i, boolean bool) {
		anInt1425++;
		if (!bool != !aBoolean1424 && i == -2098) {
			aBoolean1424 = bool;
			method1142(109);
		}
	}
	
	final void method1144(int i, int i_0_) {
		if (i != 64) {
			aClass302_1433 = null;
		}
		aClass61_1427 = new Class61(i_0_);
		anInt1419++;
	}
	
	final ObjectDefinition method1145(int i, int i_1_) {
		anInt1432++;
		if (i_1_ <= 29) {
			return null;
		}
		ObjectDefinition objectdefinition;
		synchronized (aClass61_1427) {
			objectdefinition = (ObjectDefinition) aClass61_1427.method607((long) i, 0);
		}
		if (objectdefinition != null) {
			return objectdefinition;
		}
		byte[] bs;
		synchronized (aClass302_1430) {
			bs = aClass302_1430.method3524(false, Class300.method3499(i, (byte) -6), Class374.method4112(1, i));
		}
		objectdefinition = new ObjectDefinition();
		objectdefinition.objectId = i;
		objectdefinition.aClass112_3028 = this;
		objectdefinition.aStringArray2980 = aStringArray1438.clone();
		if (bs != null) {
			objectdefinition.method3042((byte) 123, new BufferedStream(bs));
		}
		objectdefinition.method3043(5);
		if (objectdefinition.aBoolean3016) {
			objectdefinition.anInt3010 = 0;
			objectdefinition.aBoolean3034 = false;
		}
		if (!aBoolean1431 && objectdefinition.aBoolean3002) {
			objectdefinition.aStringArray2980 = null;
			objectdefinition.anIntArray2981 = null;
		}
		synchronized (aClass61_1427) {
			aClass61_1427.method601(objectdefinition, 25566, (long) i);
		}
		return objectdefinition;
	}
	
	final void method1146(int i, int i_2_) {
		anInt1428++;
		if (i_2_ == 500) {
			synchronized (aClass61_1427) {
				aClass61_1427.method598(i, -11819);
			}
			synchronized (aClass61_1434) {
				aClass61_1434.method598(i, -11819);
			}
			synchronized (aClass61_1435) {
				aClass61_1435.method598(i, i_2_ + -12319);
			}
			synchronized (aClass61_1436) {
				aClass61_1436.method598(i, -11819);
			}
		}
	}
	
	final void method1147(int i, int i_3_) {
		anInt1423++;
		anInt1437 = i;
		synchronized (aClass61_1434) {
			aClass61_1434.method608(false);
		}
		synchronized (aClass61_1435) {
			aClass61_1435.method608(false);
		}
		synchronized (aClass61_1436) {
			aClass61_1436.method608(false);
		}
		if (i_3_ != 29988) {
			method1140(-121);
		}
	}
	
	Class112(Class353 class353, int i, boolean bool, Index class302, Index class302_4_) {
		aClass302_1433 = class302_4_;
		aClass353_1421 = class353;
		anInt1422 = i;
		aClass302_1430 = class302;
		aBoolean1431 = bool;
		if (aClass302_1430 != null) {
			int i_5_ = -1 + aClass302_1430.method3526(-20871);
			aClass302_1430.method3537(-2, i_5_);
		}
		if (Node_Sub38_Sub34.aClass353_10443 != aClass353_1421) {
			aStringArray1438 = new String[] { null, null, null, null, null, null };
		} else {
			aStringArray1438 = new String[] { null, null, null, null, null, Class22.aClass22_385.method297(anInt1422) };
		}
	}
}
