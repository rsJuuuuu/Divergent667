/* Class201_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.nio.ByteBuffer;

public class Class201_Sub1 extends Class201 {
    private ByteBuffer aByteBuffer6909;

    final void method2021(byte[] bs) {
        aByteBuffer6909 = ByteBuffer.allocateDirect(bs.length);
        aByteBuffer6909.position(0);
        aByteBuffer6909.put(bs);
    }

    Class201_Sub1() {
        /* empty */
    }

    final byte[] method2020(int i_0_) {
        byte[] bs = new byte[32768];
        aByteBuffer6909.position(i_0_);
        aByteBuffer6909.get(bs, 0, 32768);

        return bs;
    }

    final byte[] method2022() {
        byte[] bs = new byte[aByteBuffer6909.capacity()];
        aByteBuffer6909.position(0);
        aByteBuffer6909.get(bs);
        return bs;
    }
}
