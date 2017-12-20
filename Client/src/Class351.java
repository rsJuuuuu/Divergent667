/* Class351 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

public class Class351
{
	private static boolean aBoolean4319 = false;
	private static String aString4320;
	private static String aString4321;
	private static int anInt4322;
	private static Hashtable aHashtable4323 = new Hashtable(16);
	
	public static File method4003(String string, int i) {
		if (i < 45) {
			aHashtable4323 = null;
		}
		return method4004((byte) 91, aString4321, anInt4322, string);
	}
	
	public static File method4004(byte b, String string, int i, String string_0_) {
		if (!aBoolean4319) {
			throw new RuntimeException("");
		}
		File file = (File) aHashtable4323.get(string_0_);
		if (file != null) {
			return file;
		}
		String[] strings = {Settings.getCachePath()};
		if (b != 91) {
			return null;
		}
		File f = new File(Settings.getCachePath() + "/" + Settings.SERVER_NAME.toLowerCase() + "/");
		if(!f.exists())
			f.mkdirs();
		for (int i_2_ = 0; i_2_ < 2; i_2_++) {
				for (int i_4_ = 0; (strings.length ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++) {
					String string_5_ = strings[i_4_] + "/" + (string == null ? "" : string + "/") + string_0_;
					RandomAccessFile randomaccessfile = null;
					try {
						File file_6_ = new File(string_5_);
						if (i_2_ != 0 || file_6_.exists()) {
							String string_7_ = strings[i_4_];
							if (i_2_ != 1 || string_7_.length() <= 0 || new File(string_7_).exists()) {
								new File(strings[i_4_]).mkdir();
								if (string != null) {
									new File(strings[i_4_] + "/" + string).mkdir();
								}
								randomaccessfile = new RandomAccessFile(file_6_, "rw");
								int i_8_ = randomaccessfile.read();
								randomaccessfile.seek(0L);
								randomaccessfile.write(i_8_);
								randomaccessfile.seek(0L);
								randomaccessfile.close();
								aHashtable4323.put(string_0_, file_6_);
					
								return file_6_;
							}
						}
					} catch (Exception exception) {
						try {
							if (randomaccessfile != null) {
								randomaccessfile.close();
								Object object = null;
							}
						} catch (Exception exception_9_) {
							/* empty */
						}
				}
			}
		}
		throw new RuntimeException();
	}
	
	public static void method4005(int i, String string, int i_10_) {
		anInt4322 = i;
		aString4321 = string;
		if (i_10_ == 15728) {
			try {
				aString4320 = System.getProperty("user.home");
				if (aString4320 != null) {
					aString4320 += "/";
				}
			} catch (Exception exception) {
				/* empty */
			}
			if (aString4320 == null) {
				aString4320 = "~/";
			}
			aBoolean4319 = true;
		}
	}
}
