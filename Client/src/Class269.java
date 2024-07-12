/* Class269 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class269 {
    static HashTable aHashTable3465 = new HashTable(16);
    private CacheNode aCacheNode3466;
    static int anInt3467;
    private Class158 aClass158_3468;
    static Class308 aClass308_3469;
    static OutcommingPacket aClass318_3470 = new OutcommingPacket(65, 11);
    static int anInt3471;
    static boolean aBoolean3472 = true;
    static int anInt3473;

    public static void method3293() {
        aClass308_3469 = null;
        aHashTable3465 = null;
        aClass318_3470 = null;
    }

    final CacheNode method3294() {
        anInt3471++;
        CacheNode cachenode = aCacheNode3466;
        if (cachenode == aClass158_3468.aCacheNode1984) {
            aCacheNode3466 = null;
            return null;
        }
        aCacheNode3466 = cachenode.aCacheNode7035;
        return cachenode;
    }

    final CacheNode method3295() {
        anInt3467++;
        CacheNode cachenode = aClass158_3468.aCacheNode1984.aCacheNode7035;
        if (aClass158_3468.aCacheNode1984 == cachenode) {
            aCacheNode3466 = null;
            return null;
        }
        aCacheNode3466 = cachenode.aCacheNode7035;
        return cachenode;
    }

    public Class269() {
        /* empty */
    }

    Class269(Class158 class158) {
        aClass158_3468 = class158;
    }
}
