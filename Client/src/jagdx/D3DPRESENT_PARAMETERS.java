/* D3DPRESENT_PARAMETERS - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;
import java.awt.Canvas;

public class D3DPRESENT_PARAMETERS
{
	public int BackBufferHeight = 0;
	public Canvas DeviceWindow;
	public int MultiSampleQuality;
	public int BackBufferWidth = 0;
	public int PresentationInterval = 0;
	public boolean Windowed;
	public int Flags;
	public int BackBufferCount = 0;
	public int BackBufferFormat;
	public int FullScreen_RefreshRateInHz;
	public int MultiSampleType;
	public int AutoDepthStencilFormat;
	public boolean EnableAutoDepthStencil;
	public int SwapEffect;
	
	public D3DPRESENT_PARAMETERS(Canvas canvas) {
		MultiSampleQuality = 0;
		BackBufferFormat = 0;
		MultiSampleType = 0;
		SwapEffect = 1;
		AutoDepthStencilFormat = 0;
		DeviceWindow = canvas;
	}
}
