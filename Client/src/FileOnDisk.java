/* FileOnDisk - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileOnDisk
{
	static int anInt1317;
	static double aDouble1318;
	static boolean aBoolean1319;
	static int anInt1320;
	static int anInt1321;
	static int[] anIntArray1322 = new int[1000];
	static int anInt1323;
	static int anInt1324;
	private RandomAccessFile aRandomAccessFile1325;
	static int anInt1326 = 0;
	static int anInt1327;
	private long aLong1328;
	static int[] anIntArray1329 = new int[2];
	private File aFile1330;
	static byte[][] aByteArrayArray1331;
	static boolean[] aBooleanArray1332;
	static int anInt1333;
	private long aLong1334;
	
	final void method1098(boolean bool) throws IOException {
		anInt1327++;
		if (bool != true) {
			anIntArray1329 = null;
		}
		if (aRandomAccessFile1325 != null) {
			aRandomAccessFile1325.close();
			aRandomAccessFile1325 = null;
		}
	}
	
	public static void method1099(int i) {
		if (i != 2) {
			method1099(42);
		}
		aByteArrayArray1331 = null;
		aBooleanArray1332 = null;
		anIntArray1329 = null;
		anIntArray1322 = null;
	}
	
	final void method1100(boolean bool, long l) throws IOException {
		aRandomAccessFile1325.seek(l);
		anInt1333++;
		aLong1334 = l;
		if (bool != true) {
			aLong1328 = -78L;
		}
	}
	
	final long method1101(int i) throws IOException {
		if (i != 0) {
			aLong1334 = -18L;
		}
		anInt1317++;
		return aRandomAccessFile1325.length();
	}
	
	protected final void finalize() throws Throwable {
		anInt1321++;
		if (aRandomAccessFile1325 != null) {
			//System.out.println("Warning! fileondisk " + aFile1330 + " not closed correctly using close(). Auto-closing instead. ");
			method1098(true);
		}
	}
	
	final void method1102(byte b, byte[] bs, int i, int i_0_) throws IOException {
		anInt1324++;
		if (aLong1334 + (long) i_0_ > aLong1328) {
			aRandomAccessFile1325.seek(aLong1328);
			aRandomAccessFile1325.write(1);
			throw new EOFException();
		}
		if (b != 76) {
			method1099(-84);
		}
		aRandomAccessFile1325.write(bs, i, i_0_);
		aLong1334 += (long) i_0_;
	}
	
	final int method1103(byte b, int i, byte[] bs, int i_1_) throws IOException {
		if (b != -115) {
			method1104(true);
		}
		anInt1323++;
		int i_2_ = aRandomAccessFile1325.read(bs, i_1_, i);
		if (i_2_ > 0) {
			aLong1334 += (long) i_2_;
		}
		return i_2_;
	}
	
	final File method1104(boolean bool) {
		anInt1320++;
		if (bool != false) {
			method1099(-16);
		}
		return aFile1330;
	}
	
	FileOnDisk(File file, String string, long l) throws IOException {
		l = Long.MAX_VALUE;
	/*if ((l ^ 0xffffffffffffffffL) == 0L) {
			l = Long.MAX_VALUE;
		}*/
		if (file.length() > l) {
			file.delete();
		}
		aRandomAccessFile1325 = new RandomAccessFile(file, string);
		aLong1334 = 0L;
		aFile1330 = file;
		aLong1328 = l;
		int i = aRandomAccessFile1325.read();
		if ((i ^ 0xffffffff) != 0 && !string.equals("r")) {
			aRandomAccessFile1325.seek(0L);
			aRandomAccessFile1325.write(i);
		}
		aRandomAccessFile1325.seek(0L);
	}
	
	static {
		aBoolean1319 = false;
	}
}
