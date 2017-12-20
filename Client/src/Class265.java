/* Class265 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DBaseTexture;

abstract class Class265
{
	protected Class228 aClass228_3363 = Node_Sub38_Sub5.aClass228_10123;
	protected boolean aBoolean3364;
	protected D3DToolkit aD3DToolkit3365;
	protected Class372 aClass372_3366;
	protected Class68 aClass68_3367;
	
	void method41(byte b, Class228 class228) {
		aClass228_3363 = class228;
		if (b >= -104) {
			method3232(-19);
		}
	}
	
	abstract IDirect3DBaseTexture method3232(int i);
	
	Class265(D3DToolkit d3dtoolkit, Class68 class68, Class372 class372, boolean bool, int i) {
		aClass68_3367 = class68;
		aBoolean3364 = bool;
		aClass372_3366 = class372;
		aD3DToolkit3365 = d3dtoolkit;
	}
}
