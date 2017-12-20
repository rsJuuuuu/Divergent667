/* Class200 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class200
{
	private GLToolkit aGLToolkit2439;
	protected jaclib.memory.Buffer aBuffer2440;
	
	final void method2012(byte[] bs, int i) {
		if (aBuffer2440 == null || aBuffer2440.getSize() < i) {
			aBuffer2440 = aGLToolkit2439.aNativeHeap6609.a(i, false);
		}
		aBuffer2440.a(bs, 0, 0, i);
	}
	
	Class200(GLToolkit gltoolkit, byte[] bs, int i) {
		aGLToolkit2439 = gltoolkit;
		aBuffer2440 = aGLToolkit2439.aNativeHeap6609.a(i, false);
		if (bs != null) {
			aBuffer2440.a(bs, 0, 0, i);
		}
	}
	
	Class200(GLToolkit gltoolkit, jaclib.memory.Buffer buffer) {
		aGLToolkit2439 = gltoolkit;
		aBuffer2440 = buffer;
	}
}
