/* Node_Sub46 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Font;

public class Node_Sub46 extends Node
{
	static int anInt7553;
	protected short aShort7554;
	static Font aFont7555;
	
	static final boolean method2948(int i) {
		anInt7553++;
		try {
			Class271 class271 = new Class271();
			byte[] bs = class271.method3312(HashTable.aByteArray1601, true);
			Class97.method1077(i ^ ~0x3ec0, bs);
			if (i != 16062) {
				aFont7555 = null;
			}
			return true;
		} catch (Exception exception) {
			return false;
		}
	}
	
	public Node_Sub46() {
		/* empty */
	}
	
	public static void method2949(int i) {
		aFont7555 = null;
		if (i != -1570) {
			method2948(-22);
		}
	}
	
	Node_Sub46(short s) {
		aShort7554 = s;
	}
}
