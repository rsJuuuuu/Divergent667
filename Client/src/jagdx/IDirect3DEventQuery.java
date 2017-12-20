/* IDirect3DEventQuery - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;
import jaclib.peer.IUnknown;
import jaclib.peer.ti;

public class IDirect3DEventQuery extends IUnknown
{
	public final native int Issue();
	
	IDirect3DEventQuery(ti var_ti) {
		super(var_ti);
	}
	
	public final native int IsSignaled();
}
