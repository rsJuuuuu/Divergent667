/* Class301 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class301
{
	protected Class169_Sub2[] aClass169_Sub2Array3774 = null;
	static int anInt3775;
	protected Class169_Sub3 aClass169_Sub3_3776;
	protected Class169_Sub3 aClass169_Sub3_3777;
	protected Class169_Sub3 aClass169_Sub3_3778 = null;
	protected Class169_Sub2[] aClass169_Sub2Array3779;
	protected boolean aBoolean3780;
	
	static final String method3503(int i, boolean bool, long l, int i_0_, boolean bool_1_) {
		anInt3775++;
		char c = ',';
		if (bool_1_ != true) {
			method3503(68, true, 86L, -84, false);
		}
		char c_2_ = '.';
		if (i == 0) {
			c = '.';
			c_2_ = ',';
		}
		if (i == 2) {
			c_2_ = '\u00a0';
		}
		boolean bool_3_ = false;
		if ((l ^ 0xffffffffffffffffL) > -1L) {
			l = -l;
			bool_3_ = true;
		}
		StringBuffer stringbuffer = new StringBuffer(26);
		if ((i_0_ ^ 0xffffffff) < -1) {
			for (int i_4_ = 0; i_0_ > i_4_; i_4_++) {
				int i_5_ = (int) l;
				l /= 10L;
				stringbuffer.append((char) (-((int) l * 10) + (48 + i_5_)));
			}
			stringbuffer.append(c);
		}
		int i_6_ = 0;
		for (;;) {
			int i_7_ = (int) l;
			l /= 10L;
			stringbuffer.append((char) (48 - -i_7_ - (int) l * 10));
			if ((l ^ 0xffffffffffffffffL) == -1L) {
				break;
			}
			if (bool && ++i_6_ % 3 == 0) {
				stringbuffer.append(c_2_);
			}
		}
		if (bool_3_) {
			stringbuffer.append('-');
		}
		return stringbuffer.reverse().toString();
	}
	
	Class301(GLToolkit gltoolkit) {
		aClass169_Sub3_3777 = null;
		aClass169_Sub2Array3779 = null;
		aClass169_Sub3_3776 = null;
		try {
			aBoolean3780 = gltoolkit.aBoolean6677;
			Class262.method3146(gltoolkit, true);
			if (aBoolean3780) {
				byte[] bs = Class320_Sub15.method3739((byte) -64, false, Class320_Sub28.anObject8474);
				aClass169_Sub3_3777 = new Class169_Sub3(gltoolkit, 6410, 128, 128, 16, bs, 6410);
				bs = Class320_Sub15.method3739((byte) 126, false, Class88.anObject5281);
				aClass169_Sub3_3776 = new Class169_Sub3(gltoolkit, 6410, 128, 128, 16, bs, 6410);
				Class167 class167 = gltoolkit.aClass167_6607;
				if (class167.method1751(87)) {
					bs = Class320_Sub15.method3739((byte) 127, false, Node_Sub6.anObject7050);
					aClass169_Sub3_3778 = new Class169_Sub3(gltoolkit, 6408, 128, 128, 16);
					Class169_Sub3 class169_sub3 = new Class169_Sub3(gltoolkit, 6409, 128, 128, 16, bs, 6409);
					if (class167.method1749((byte) -59, 2.0F, aClass169_Sub3_3778, class169_sub3)) {
						aClass169_Sub3_3778.method1765(-231);
					} else {
						aClass169_Sub3_3778.method1761((byte) -53);
						aClass169_Sub3_3778 = null;
					}
					class169_sub3.method1761((byte) -53);
				}
			} else {
				aClass169_Sub2Array3774 = new Class169_Sub2[16];
				for (int i = 0; i < 16; i++) {
					byte[] bs = Node_Sub38_Sub5.method2801(32768, Class320_Sub28.anObject8474, 1, 2 * i * 128 * 128);
					aClass169_Sub2Array3774[i] = new Class169_Sub2(gltoolkit, 3553, 6410, 128, 128, true, bs, 6410, false);
				}
				aClass169_Sub2Array3779 = new Class169_Sub2[16];
				for (int i = 0; i < 16; i++) {
					byte[] bs = Node_Sub38_Sub5.method2801(32768, Class88.anObject5281, 1, 128 * i * 256);
					aClass169_Sub2Array3779[i] = new Class169_Sub2(gltoolkit, 3553, 6410, 128, 128, true, bs, 6410, false);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class126.method1537(runtimeexception, "sa.<init>(" + (gltoolkit != null ? "{...}" : "null") + ')');
		}
	}
}
