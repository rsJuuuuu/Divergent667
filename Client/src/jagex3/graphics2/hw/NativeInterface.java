/* NativeInterface - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagex3.graphics2.hw;

public class NativeInterface
{
	protected long peer;
	
	public final native void copyNormals(short[] ses, short[] ses_0_, short[] ses_1_, byte[] bs, float f, float f_2_, int i, int i_3_, int i_4_, long l);
	
	public final native void release();
	
	public final native void copyLighting(short[] ses, byte[] bs, short[] ses_5_, short[] ses_6_, short[] ses_7_, short[] ses_8_, byte[] bs_9_, int i, int i_10_, short[] ses_11_, int i_12_, int i_13_, int i_14_, long l);
	
	private final native void init(int i, int i_15_);
	
	public NativeInterface(int i, int i_16_) {
		init(i, i_16_);
	}
	
	public final native void initTextureMetrics(int i, byte b, byte b_17_);
	
	public final native void setSunColour(float f, float f_18_, float f_19_, float f_20_, float f_21_);
	
	public final native void setSunDirection(float f, float f_22_, float f_23_);
	
	public final native void copyPositions(int[] is, int[] is_24_, int[] is_25_, short[] ses, int i, int i_26_, int i_27_, long l);
	
	public final native void copyTexCoords(float[] fs, float[] fs_28_, int i, int i_29_, int i_30_, long l);
	
	public final native void setAmbient(float f);
	
	public final native void copyColours(short[] ses, byte[] bs, short[] ses_31_, int i, short[] ses_32_, int i_33_, int i_34_, int i_35_, long l);
}
