/* CacheNode_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.applet.Applet;

abstract class CacheNode_Sub16 extends CacheNode {
    protected boolean aBoolean9597;
    protected boolean aBoolean9598;
    static OutcommingPacket aClass318_9599 = new OutcommingPacket(24, 7);
    static Class312 aClass312_9600 = new Class312();
    static Applet anApplet9601;
    volatile boolean aBoolean9602 = true;

    public static void method2384() {
        anApplet9601 = null;
        aClass318_9599 = null;

        aClass312_9600 = null;
    }

    abstract byte[] method2385();

    abstract int method2386();

    public CacheNode_Sub16() {
        /* empty */
    }
}
