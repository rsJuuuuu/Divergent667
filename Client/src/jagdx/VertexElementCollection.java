/* VertexElementCollection - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;
import jaclib.peer.os;
import jaclib.peer.ti;

public class VertexElementCollection extends os
{
	public final native void addElement(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_);
	
	private final native void init();
	
	public VertexElementCollection(ti var_ti) {
		super(var_ti);
		init();
	}
	
	public final native void reset();
	
	public final native void finish();
}
