/* HardwareInfo - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.hardware_info;

public class HardwareInfo
{
	public static final native String[][] getDXDiagDisplayDevicesProps();
	
	public static final native String[] getOpenGLProps();
	
	public static final native String[] getDXDiagSystemProps();
	
	public static final native int[] getCPUInfo();
}
