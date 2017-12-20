/* za_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.memory.heap.NativeHeap;

public class za_Sub1 extends za
{
	protected NativeHeap aNativeHeap10506;
	static int anInt10507;
	static int anInt10508;
	
	static final void method2992(int i, int i_0_, BufferedStream buffer) {
		anInt10508++;
		if (i > 90) {
			do {
				if (Class366.aSeekableFile4529 != null) {
					try {
						Class366.aSeekableFile4529.method3577(0L, false);
						Class366.aSeekableFile4529.method3570(5033, i_0_, 24, buffer.buffer);
					} catch (Exception exception) {
						break;
					}
					break;
				}
			} while (false);
		}
	}
	
	final void method2993(boolean bool) {
		aNativeHeap10506.b();
		anInt10507++;
		if (bool != false) {
			aNativeHeap10506 = null;
		}
	}
	
	za_Sub1(int i) {
		aNativeHeap10506 = new NativeHeap(i);
	}
}
