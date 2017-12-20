/* Class280 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class280
{
	static int anInt3569;
	static int anInt3570 = 0;
	
	static final int method3378(int i, int i_0_, byte b, int i_1_) {
		anInt3569++;
		i_1_ &= 0x3;
		if ((i_1_ ^ 0xffffffff) == -1) {
			return i;
		}
		if (i_1_ == 1) {
			return 7 - i_0_;
		}
		if (b < 124) {
			method3378(82, -34, (byte) -4, 119);
		}
		if ((i_1_ ^ 0xffffffff) == -3) {
			return 7 + -i;
		}
		return i_0_;
	}
}
