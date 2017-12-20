/* CacheNode_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

public class CacheNode_Sub6 extends CacheNode
{
	static int anInt9478;
	protected int anInt9479 = 0;
	static Class57 aClass57_9480;
	static int anInt9481;
	static int anInt9482;
	static int anInt9483;
	static int anInt9484;
	static int anInt9485;
	
	static final Class365 method2311(Socket socket, int i, byte b) throws IOException {
		anInt9478++;
		return new Class365_Sub1(socket, i);
	}
	
	public static void method2312(int i) {
		aClass57_9480 = null;
		if (i <= 120) {
			anInt9485 = -122;
		}
	}
	
	static final String method2313(byte b, long l) {
		anInt9481++;
		if ((l ^ 0xffffffffffffffffL) >= -1L || l >= 6582952005840035281L) {
			return null;
		}
		if (l % 37L == 0L) {
			return null;
		}
		int i = 0;
		for (long l_1_ = l; (l_1_ ^ 0xffffffffffffffffL) != -1L; l_1_ /= 37L)
			i++;
		StringBuffer stringbuffer = new StringBuffer(i);
		while ((l ^ 0xffffffffffffffffL) != -1L) {
			long l_3_ = l;
			l /= 37L;
			char c = Class174.aCharArray2095[(int) (l_3_ + -(37L * l))];
			if ((c ^ 0xffffffff) == -96) {
				int i_4_ = -1 + stringbuffer.length();
				stringbuffer.setCharAt(i_4_, Character.toUpperCase(stringbuffer.charAt(i_4_)));
				c = '\u00a0';
			}
			stringbuffer.append(c);
		}
		stringbuffer.reverse();
		stringbuffer.setCharAt(0, Character.toUpperCase(stringbuffer.charAt(0)));
		return stringbuffer.toString();
	}
	
	private final void method2314(int i, BufferedStream buffer, byte b) {
		if (b >= -93) {
			aClass57_9480 = null;
		}
		if ((i ^ 0xffffffff) == -3) {
			anInt9479 = buffer.readUnsignedShort();
		}
		anInt9484++;
	}
	
	final void method2315(BufferedStream buffer, int i) {
		if (i != 0) {
			method2312(-108);
		}
		for (;;) {
			int i_5_ = buffer.readUnsignedByte();
			if ((i_5_ ^ 0xffffffff) == -1) {
				break;
			}
			method2314(i_5_, buffer, (byte) -110);
		}
		anInt9482++;
	}
}
