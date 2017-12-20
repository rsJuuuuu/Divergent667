/* dxVertexLayout - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;

public class dxVertexLayout extends Class213
{
	protected IDirect3DVertexDeclaration anIDirect3DVertexDeclaration6910;
	
	dxVertexLayout(D3DToolkit d3dtoolkit, Class207[] class207s) {
		VertexElementCollection vertexelementcollection = new VertexElementCollection(d3dtoolkit.aTi9201);
		int i = 0;
		for (int i_0_ = 0; class207s.length > i_0_; i_0_++) {
			int i_1_ = 0;
			Class207 class207 = class207s[i_0_];
			for (int i_2_ = 0; i_2_ < class207.method2042(-1); i_2_++) {
				Class126 class126 = class207.method2044(15, i_2_);
				if (class126 == Class126.aClass126_1620) {
					vertexelementcollection.addElement(i_0_, 2, 0, 0, 0, i_1_);
				} else if (Class126.aClass126_1625 != class126) {
					if (Class126.aClass126_1626 == class126) {
						vertexelementcollection.addElement(i_0_, 4, 0, 10, 0, i_1_);
					} else if (class126 == Class126.aClass126_1627) {
						vertexelementcollection.addElement(i_0_, 0, 0, 5, i++, i_1_);
					} else if (Class126.aClass126_1628 != class126) {
						if (class126 == Class126.aClass126_1629) {
							vertexelementcollection.addElement(i_0_, 2, 0, 5, i++, i_1_);
						} else if (class126 == Class126.aClass126_1630) {
							vertexelementcollection.addElement(i_0_, 3, 0, 5, i++, i_1_);
						}
					} else {
						vertexelementcollection.addElement(i_0_, 1, 0, 5, i++, i_1_);
					}
				} else {
					vertexelementcollection.addElement(i_0_, 2, 0, 3, 0, i_1_);
				}
				i_1_ += class126.anInt1624;
			}
		}
		vertexelementcollection.finish();
		anIDirect3DVertexDeclaration6910 = d3dtoolkit.anIDirect3DDevice9199.a(vertexelementcollection, null);
	}
}
