/* IUnknown - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.peer;

public class IUnknown extends Peer {

    protected IUnknown(ti var_ti) {
        reference = new IUnknownReference(this, var_ti);
    }

    public final long a(int i) {
        return super.a();
    }
}
