/* D3DLIGHT - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;
import jaclib.peer.os;
import jaclib.peer.ti;

public class D3DLIGHT extends os
{
	public final native void SetSpotParams(float f, float f_0_, float f_1_);
	
	public final native void SetPosition(float f, float f_2_, float f_3_);
	
	public D3DLIGHT(ti var_ti) {
		super(var_ti);
		Init();
	}
	
	public final native void SetRange(float f);
	
	public final native void SetSpecular(float f, float f_4_, float f_5_, float f_6_);
	
	private final native void Init();
	
	public final native void SetDiffuse(float f, float f_7_, float f_8_, float f_9_);
	
	public final native void SetType(int i);
	
	public final native void SetAttenuation(float f, float f_10_, float f_11_);
	
	public final native void SetAmbient(float f, float f_12_, float f_13_, float f_14_);
	
	public final native void SetDirection(float f, float f_15_, float f_16_);
}
