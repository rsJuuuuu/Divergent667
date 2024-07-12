/* HardwareInfo - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.hardware_info;

public class HardwareInfo {
    public static native String[][] getDXDiagDisplayDevicesProps();

    public static native String[] getOpenGLProps();

    public static native String[] getDXDiagSystemProps();

    public static native int[] getCPUInfo();
}
