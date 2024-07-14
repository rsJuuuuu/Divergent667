/* Class123 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;

public class Class123 {
    protected Class365 aClass365_1557;
    private final Class312 aClass312_1558 = new Class312();
    static int anInt1559;
    static int anInt1560;
    static int anInt1561;
    static IncommingPacket aClass192_1562 = new IncommingPacket(57, -2);
    static int anInt1563;
    static Class129 aClass129_1564 = new Class129(2);
    protected Class241 aClass241_1565;
    private final BufferedStream aBuffer1566;
    private int anInt1567 = 0;
    static int anInt1568;
    static int anInt1569;
    protected Packet aPacket1570;
    protected IsaacCipher anIsaacCipher1571;
    protected int anInt1572;
    protected IncommingPacket aClass192_1573;
    protected IncommingPacket aClass192_1574;
    protected int anInt1575;
    protected IncommingPacket incomming_packet;
    protected int anInt1577;
    protected int anInt1578;
    protected int anInt1579;
    protected boolean aBoolean1580;
    protected int anInt1581;
    protected IncommingPacket aClass192_1582;
    private int anInt1583;
    protected boolean aBoolean1584;

    public static void method1509() {
        aClass192_1562 = null;

        aClass129_1564 = null;
    }

    final void method1510(int i) {
        if (Class174.clientCycle % 50 == 0) {
            anInt1572 = anInt1583;
            anInt1577 = anInt1575;
            anInt1583 = 0;
            anInt1575 = 0;
        }
        if (i > -62) {
            anInt1572 = -99;
        }
        anInt1560++;
    }

    final void method1511(byte b) {
        anInt1563++;
        aClass312_1558.method3614();
        anInt1567 = 0;
        if (b <= 35) {
            anInt1583 = -42;
        }
    }

    final void method1512() throws IOException {
        anInt1561++;
        if (aClass365_1557 != null && anInt1567 > 0) {
            aBuffer1566.offset = 0;
            for (; ; ) {
                Node_Sub13 node_sub13 = (Node_Sub13) aClass312_1558.method3613();
                if (node_sub13 == null || aBuffer1566.buffer.length - aBuffer1566.offset < node_sub13.anInt7114) {
                    break;
                }
                aBuffer1566.writeBytes(node_sub13.anInt7114, node_sub13.aPacket7113.buffer, 0);
                anInt1567 -= node_sub13.anInt7114;
                node_sub13.method2160();
                node_sub13.aPacket7113.method2202();
                node_sub13.method2547(false);
            }
            aClass365_1557.method4067(aBuffer1566.buffer, aBuffer1566.offset);
            anInt1579 = 0;
            anInt1583 += aBuffer1566.offset;
        }
    }

    final void method1513() {
        anInt1569++;
        if (aClass365_1557 != null) {
            aClass365_1557.method4062(-2);
            aClass365_1557 = null;
        }
    }

    final void sendPacket(Node_Sub13 node_sub13) {
        anInt1559++;
        aClass312_1558.method3625(node_sub13);
        node_sub13.anInt7114 = node_sub13.aPacket7113.offset;
        node_sub13.aPacket7113.offset = 0;
        anInt1567 += node_sub13.anInt7114;
    }

    public Class123() {
        aBuffer1566 = new BufferedStream(1350);
        aPacket1570 = new Packet(15000);
        incomming_packet = null;
        anInt1581 = 0;
        anInt1579 = 0;
        aBoolean1580 = false;
        aBoolean1584 = true;
        anInt1578 = 0;
    }
}
