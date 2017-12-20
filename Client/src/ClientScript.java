/* CacheNode_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ClientScript extends CacheNode
{
	public static int anInt9496;
	protected String name;
	static Class216 aClass216_9498;
	protected int anInt9499;
	protected int[] opcodes;
	protected long[] longValues;
	protected int anInt9502;
	protected HashTable[] aHashTableArray9503;
	protected String[] stringValues;
	protected Class212 aClass212_9505;
	protected int anInt9506;
	protected int anInt9507;
	protected int[] intValues;
	static int anInt9509;
	static boolean aBoolean9510 = false;
	protected int anInt9511;
	protected int anInt9512;
	static int anInt9513;
	
	static final void method2321(int i, IComponentDefinitions widget) {
		if (widget.anInt4824 == Node_Sub12.anInt5453) {
			Class195.aBooleanArray2387[widget.anInt4703] = true;
		}
		anInt9509++;
		if (i != -1) {
			method2321(122, null);
		}
	}
	
	static final boolean method2322(int i, int i_0_, int i_1_) {
		if (i < 41) {
			return false;
		}
		anInt9513++;
        return (0x400 & i_0_ ^ 0xffffffff) != -1;
    }
	
	public static void method2323(int i) {
		@SuppressWarnings("unused")
		int i_2_ = 28 % ((-48 - i) / 36);
		aClass216_9498 = null;
	}
}
