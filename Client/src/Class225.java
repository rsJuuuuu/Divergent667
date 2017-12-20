/* Class225 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class225
{
	static int anInt2673;
	static Class257 aClass257_2674;
	static int anInt2675 = 1;
	static boolean aBoolean2676;
	static int anInt2677;
	static Class336 aClass336_2678;
	static OutcommingPacket aClass318_2679;
	static Class261[][][] aClass261ArrayArrayArray2680;
	
	static final void method2107(int i, IComponentDefinitions widget, int i_0_, int i_1_) {
		if (Class87.removeWalkHere) {
			Class267 class267 = Class324.anInt4087 != -1 ? Class188_Sub2_Sub2.aClass36_9366.method394(Class324.anInt4087, -96) : null;
			if (Client.method113(widget).method2744((byte) 119) && (Class200_Sub2.anInt4943 & 0x20 ^ 0xffffffff) != -1 && (class267 == null || (widget.method4156(class267.anInt3443, 18131, Class324.anInt4087) ^ 0xffffffff) != (class267.anInt3443 ^ 0xffffffff))) {
				Node_Sub38_Sub27.anInt10388++;
				Node_Sub32.method2731(false, widget.anInt4718, 0L, widget.anInt4687, widget.ihash, Class84.aString1148, 18, true, Class201.anInt2444, Class66.aString5177 + " -> " + widget.aString4779, (long) (widget.anInt4687 << 0 | widget.ihash), (byte) -18, false);
			}
		}
		anInt2677++;
		for (int i_2_ = 9; (i_2_ ^ 0xffffffff) <= -6; i_2_--) {
			String string = Node_Sub34.method2742(widget, i_2_, i + -20579);
			if (string != null) {
				Node_Sub30.anInt7351++;
				Node_Sub32.method2731(false, widget.anInt4718, (long) (i_2_ - -1), widget.anInt4687, widget.ihash, string, 1002, true, Node_Sub30.method2722(i_2_, widget, 7113), widget.aString4779, (long) (widget.ihash | widget.anInt4687 << 0), (byte) -18, false);
			}
		}
		String string = Class205.method2033(widget, (byte) -104);
		if (string != null) {
			EntityNode_Sub6.anInt5993++;
			Node_Sub32.method2731(false, widget.anInt4718, 0L, widget.anInt4687, widget.ihash, string, 12, true, widget.anInt4748, widget.aString4779, (long) (widget.anInt4687 << 0 | widget.ihash), (byte) -18, false);
		}
		for (int i_3_ = 4; i_3_ >= 0; i_3_--) {
			String string_4_ = Node_Sub34.method2742(widget, i_3_, i + -20579);
			if (string_4_ != null) {
				Node_Sub32.method2731(false, widget.anInt4718, (long) (1 + i_3_), widget.anInt4687, widget.ihash, string_4_, 20, true, Node_Sub30.method2722(i_3_, widget, 7113), widget.aString4779, (long) (widget.ihash | widget.anInt4687 << 0), (byte) -18, false);
				Node_Sub30.anInt7351++;
			}
		}
		if (Client.method113(widget).method2746(9336)) {
			Node_Sub16.anInt7136++;
			if (widget.aString4784 != null) {
				Node_Sub32.method2731(false, widget.anInt4718, 0L, widget.anInt4687, widget.ihash, widget.aString4784, 10, true, -1, "", (long) (widget.ihash | widget.anInt4687 << 0), (byte) -18, false);
			} else {
				Node_Sub32.method2731(false, widget.anInt4718, 0L, widget.anInt4687, widget.ihash, Class22.aClass22_373.method297(Class35.language), 10, true, -1, "", (long) (widget.ihash | widget.anInt4687 << 0), (byte) -18, false);
			}
		}
		if (i != -6608) {
			anInt2675 = 8;
		}
	}
	
	static final void method2108(int i, short[] ses, int i_5_, String[] strings, int i_6_) {
		if ((i_5_ ^ 0xffffffff) > (i ^ 0xffffffff)) {
			int i_7_ = (i + i_5_) / 2;
			int i_8_ = i_5_;
			String string = strings[i_7_];
			strings[i_7_] = strings[i];
			strings[i] = string;
			short s = ses[i_7_];
			ses[i_7_] = ses[i];
			ses[i] = s;
			for (int i_9_ = i_5_; (i_9_ ^ 0xffffffff) > (i ^ 0xffffffff); i_9_++) {
				if (string == null || strings[i_9_] != null && strings[i_9_].compareTo(string) < (i_9_ & 0x1)) {
					String string_10_ = strings[i_9_];
					strings[i_9_] = strings[i_8_];
					strings[i_8_] = string_10_;
					short s_11_ = ses[i_9_];
					ses[i_9_] = ses[i_8_];
					ses[i_8_++] = s_11_;
				}
			}
			strings[i] = strings[i_8_];
			strings[i_8_] = string;
			ses[i] = ses[i_8_];
			ses[i_8_] = s;
			method2108(i_8_ - 1, ses, i_5_, strings, i_6_);
			method2108(i, ses, i_8_ - -1, strings, i_6_);
		}
		if (i_6_ != -25575) {
			anInt2675 = 7;
		}
		anInt2673++;
	}
	
	public static void method2109(int i) {
		aClass318_2679 = null;
		aClass257_2674 = null;
		aClass261ArrayArrayArray2680 = null;
		if (i == 20) {
			aClass336_2678 = null;
		}
	}
	
	static {
		aClass257_2674 = new Class257(3, 4);
		aClass318_2679 = new OutcommingPacket(28, 3);
	}
}
