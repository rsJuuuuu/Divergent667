/* CacheNode_Sub20_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.lang.ref.SoftReference;
import java.util.Objects;

public class CacheNode_Sub20_Sub2 extends CacheNode_Sub20 {
    private final SoftReference<Object> aSoftReference11094;

    final Object method2409() {
        return Objects.requireNonNull(aSoftReference11094).get();
    }

    final boolean method2411() {
        return true;
    }

    CacheNode_Sub20_Sub2(Object object, int i) {
        super(i);
        aSoftReference11094 = new SoftReference<>(object);
    }
}
