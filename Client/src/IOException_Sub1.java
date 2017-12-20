/* IOException_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

@SuppressWarnings("serial")
public class IOException_Sub1 extends IOException
{
	static int anInt84 = -1;
	static Class128 aClass128_85;
	static int anInt86;
	static int anInt87;
	
	static final boolean method131(boolean bool, byte b) {
		if (bool != true) {
			method131(true, (byte) -127);
		}
		anInt86++;
		int i = b & 0xff;
		if ((i ^ 0xffffffff) == -1) {
			return false;
		}
        return !(i >= 128 && (i ^ 0xffffffff) > -161 && Class204.aCharArray2455[-128 + i] == 0);
    }
	
	IOException_Sub1(String string) {
		super(string);
	}
	
	public static void method132(int i) {
		if (i != -128) {
			anInt84 = 38;
		}
		aClass128_85 = null;
	}
	
	static final void method133(int i, Index index30, SignLink signlink) {
		Class239.index30 = index30;
		anInt87++;
		Class117_Sub1.aString4931 = "";
		Animable_Sub1_Sub1.aSignLink10616 = signlink;
		if (i == 255) {
			if (!Class223.aString2660.startsWith("win")) {
				if (!Class223.aString2660.startsWith("linux")) {
					if (Class223.aString2660.startsWith("mac")) {
						Class117_Sub1.aString4931 += "macos/";
					}
				} else {
					Class117_Sub1.aString4931 += "linux/";
				}
			} else {
				Class117_Sub1.aString4931 += "windows/";
			}
			if (!Animable_Sub1_Sub1.aSignLink10616.aBoolean3985) {
				if (Class223.aString2656.startsWith("amd64") || Class223.aString2656.startsWith("x86_64")) {
					Class117_Sub1.aString4931 += "x86_64/";
				} else if (Class223.aString2656.startsWith("i386") || Class223.aString2656.startsWith("i486") || Class223.aString2656.startsWith("i586") || Class223.aString2656.startsWith("x86")) {
					Class117_Sub1.aString4931 += "x86/";
				} else if (Class223.aString2656.startsWith("ppc")) {
					Class117_Sub1.aString4931 += "ppc/";
				} else {
					Class117_Sub1.aString4931 += "universal/";
				}
			} else {
				Class117_Sub1.aString4931 += "msjava/";
			}
		}
	}
}
