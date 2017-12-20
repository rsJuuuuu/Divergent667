/* wa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class wa implements Interface6
{
	protected j aJ5050;
	private long aLong5051 = 0L;
	protected xa aXa5052;
	
	private final native void Z(long l, long l_0_, long l_1_, int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, boolean bool, boolean bool_7_);
	
	public final void method19(int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, boolean bool, boolean bool_13_) {
		Z(aLong5051, aJ5050.nativeid, aXa5052.nativeid, i, i_8_, i_9_, i_10_, i_11_, i_12_, bool, bool_13_);
	}
	
	private final native void X(long l, long l_14_, long l_15_, int i, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, boolean bool, boolean bool_21_);
	
	public final void method18(int i, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, boolean bool, boolean bool_27_) {
		X(aLong5051, aJ5050.nativeid, aXa5052.nativeid, i, i_22_, i_23_, i_24_, i_25_, i_26_, bool, bool_27_);
	}
	
	wa(oa var_oa, j var_j, xa var_xa) {
		aLong5051 = var_oa.nativeid;
		aJ5050 = var_j;
		aXa5052 = var_xa;
	}
}
