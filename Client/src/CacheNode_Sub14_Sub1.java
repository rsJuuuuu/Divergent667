/* CacheNode_Sub14_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.ref.SoftReference;

public class CacheNode_Sub14_Sub1 extends CacheNode_Sub14
{
	private SoftReference<Object> aSoftReference11029;
	
	final Object method2347(int i) {
		if (i != 27670) {
			method2350((byte) -12);
		}
		return aSoftReference11029.get();
	}
	
	CacheNode_Sub14_Sub1(Interface18 interface18, Object object, int i) {
		super(interface18, i);
		aSoftReference11029 = new SoftReference<Object>(object);
	}
	
	final boolean method2350(byte b) {
		if (b != -38) {
			method2347(13);
		}
		return true;
	}
}
