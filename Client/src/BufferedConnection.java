/* BufferedConnection - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class BufferedConnection implements Runnable
{
	static int anInt595;
	private Class241 aClass241_596;
	static int anInt597;
	static int anInt598;
	static int anInt599;
	static int anInt600;
	private boolean aBoolean601 = false;
	private byte[] aByteArray602;
	private int anInt603;
	private InputStream anInputStream604;
	private Socket aSocket605;
	static int anInt606;
	static int anInt607;
	private int anInt608;
	private int anInt609 = 0;
	static int anInt610;
	static int anInt611;
	private OutputStream anOutputStream612;
	static int anInt613;
	private boolean aBoolean614;
	static Class346 aClass346_615 = new Class346();
	static int anInt616;
	private SignLink aSignLink617;
	
	public static void method421(int i) {
		aClass346_615 = null;
		if (i != -22344) {
			method422(-55, 65, -73, 64, 7, -93, -81, 49, -103, 50, -16, 107);
		}
	}
	
	static final void method422(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_) {
		anInt597++;
		if (CacheNode_Sub15.method2379(7015, i_7_) && i_1_ == -1) {
			if (Class79.aWidgetArrayArray1082[i_7_] == null) {
				Client.method121(Class134_Sub3.aWidgetArrayArray9035[i_7_], -1, i_10_, i_2_, i_5_, i, i_6_, i_0_, i_8_, i_3_, i_9_, i_4_);
			} else {
				Client.method121(Class79.aWidgetArrayArray1082[i_7_], -1, i_10_, i_2_, i_5_, i, i_6_, i_0_, i_8_, i_3_, i_9_, i_4_);
			}
		}
	}
	
	final void method423(int i) throws IOException {
		if (i != -1650936088) {
			anInt603 = 99;
		}
		anInt607++;
		if (!aBoolean601) {
			if (aBoolean614) {
				aBoolean614 = false;
				throw new IOException();
			}
		}
	}
	
	final int method424(int i) throws IOException {
		anInt610++;
		if (aBoolean601) {
			return 0;
		}
		if (i != -1) {
			return 7;
		}
		return anInputStream604.read();
	}
	
	public final void run() {
		try {
			for (;;) {
				int i;
				int i_11_;
				synchronized (this) {
					if ((anInt608 ^ 0xffffffff) == (anInt609 ^ 0xffffffff)) {
						if (aBoolean601) {
							break;
						}
						try {
							this.wait();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
					}
					i = anInt608;
					if (anInt609 >= anInt608) {
						i_11_ = -anInt608 + anInt609;
					} else {
						i_11_ = -anInt608 + anInt603;
					}
				}
				if ((i_11_ ^ 0xffffffff) < -1) {
					try {
						anOutputStream612.write(aByteArray602, i, i_11_);
					} catch (IOException ioexception) {
						aBoolean614 = true;
					}
					anInt608 = (anInt608 - -i_11_) % anInt603;
					try {
						if (anInt609 == anInt608) {
							anOutputStream612.flush();
						}
					} catch (IOException ioexception) {
						aBoolean614 = true;
					}
				}
			}
			try {
				if (anInputStream604 != null) {
					anInputStream604.close();
				}
				if (anOutputStream612 != null) {
					anOutputStream612.close();
				}
				if (aSocket605 != null) {
					aSocket605.close();
				}
			} catch (IOException ioexception) {
				/* empty */
			}
			aByteArray602 = null;
		} catch (Exception exception) {
			ClanChat.method507(exception, null, -115);
		}
		anInt613++;
	}
	
	final void method425(int i, byte b, int i_12_, byte[] bs) throws IOException {
		anInt606++;
		if (b < 47) {
			method421(-53);
		}
		if (!aBoolean601) {
			int i_13_;
			for (/**/; (i ^ 0xffffffff) < -1; i -= i_13_) {
				i_13_ = anInputStream604.read(bs, i_12_, i);
				if ((i_13_ ^ 0xffffffff) >= -1) {
					throw new EOFException();
				}
				i_12_ += i_13_;
			}
		}
	}
	
	final void method426(byte b) {
		anInt595++;
		if (!aBoolean601) {
			if (b >= -61) {
				aClass346_615 = null;
			}
			anInputStream604 = new InputStream_Sub2();
			anOutputStream612 = new OutputStream_Sub2();
		}
	}
	
	protected final void finalize() {
		anInt611++;
		method430(20692);
	}
	
	static final void method427(Class48 class48, int i, Animable animable, byte b) {
		anInt600++;
		if ((Class23.anInt434 ^ 0xffffffff) > -51 && (class48 != null && class48.anIntArrayArray700 != null && (class48.anIntArrayArray700.length ^ 0xffffffff) < (i ^ 0xffffffff) && class48.anIntArrayArray700[i] != null)) {
			if (b != -63) {
				aClass346_615 = null;
			}
			int i_14_ = class48.anIntArrayArray700[i][0];
			int i_15_ = i_14_ >> 8;
			int i_16_ = 0x7 & i_14_ >> 5;
			if ((class48.anIntArrayArray700[i].length ^ 0xffffffff) < -2) {
				int i_17_ = (int) (Math.random() * (double) class48.anIntArrayArray700[i].length);
				if (i_17_ > 0) {
					i_15_ = class48.anIntArrayArray700[i][i_17_];
				}
			}
			int i_18_ = i_14_ & 0x1f;
			int i_19_ = 256;
			if (class48.anIntArray690 != null && class48.anIntArray692 != null) {
				i_19_ = class48.anIntArray690[i] + (int) ((double) (-class48.anIntArray690[i] + class48.anIntArray692[i]) * Math.random());
			}
			int i_20_ = class48.anIntArray701 == null ? 255 : class48.anIntArray701[i];
			if ((i_18_ ^ 0xffffffff) == -1) {
				if (animable == Class295.myPlayer) {
					if (!class48.aBoolean699) {
						Class91.method1033(i_19_, 0, i_15_, i_16_, i_20_, 0);
					} else {
						Class105.method1116(i_15_, i_16_, i_19_, (byte) 97, 0, i_20_, false);
					}
				}
			} else if ((Class213.aNode_Sub27_2512.aClass320_Sub25_7265.method3776(false) ^ 0xffffffff) != -1) {
				int i_21_ = animable.anInt5934 + -256 >> 9;
				int i_22_ = -256 + animable.anInt5940 >> 9;
				int i_23_ = animable == Class295.myPlayer ? 0 : i_18_ + (i_22_ << 8) + ((i_21_ << 16) + (animable.plane << 24));
				Node_Sub38_Sub19.aClass78Array10284[Class23.anInt434++] = new Class78(class48.aBoolean699 ? (byte) 2 : (byte) 1, i_15_, i_16_, 0, i_20_, i_23_, i_19_, animable);
			}
		}
	}
	
	final int method428(int i) throws IOException {
		anInt599++;
		if (i != 0) {
			method422(-76, 68, 102, -65, -42, 100, 0, 89, -69, -43, 81, -50);
		}
		if (aBoolean601) {
			return 0;
		}
		return anInputStream604.available();
	}
	
	final void method429(int i, int i_24_, byte[] bs, byte b) throws IOException {
		anInt598++;
		if (b == 78 && !aBoolean601) {
			if (aBoolean614) {
				aBoolean614 = false;
				throw new IOException();
			}
			if (aByteArray602 == null) {
				aByteArray602 = new byte[anInt603];
			}
			synchronized (this) {
				for (int i_25_ = 0; i_24_ > i_25_; i_25_++) {
					aByteArray602[anInt609] = bs[i + i_25_];
					anInt609 = (anInt609 + 1) % anInt603;
					if ((anInt603 + anInt608 - 100) % anInt603 == anInt609) {
						throw new IOException();
					}
				}
				if (aClass241_596 == null) {
					aClass241_596 = aSignLink617.method3641((byte) 50, this, 3);
				}
				this.notifyAll();
			}
		}
	}
	
	BufferedConnection(Socket socket, SignLink signlink, int i) throws IOException {
		anInt608 = 0;
		aBoolean614 = false;
		aSignLink617 = signlink;
		aSocket605 = socket;
		aSocket605.setSoTimeout(30000);
		aSocket605.setTcpNoDelay(true);
		anInputStream604 = aSocket605.getInputStream();
		anOutputStream612 = aSocket605.getOutputStream();
		anInt603 = i;
	}
	
	final void method430(int i) {
		anInt616++;
		if (!aBoolean601) {
			synchronized (this) {
				if (i != 20692) {
					run();
				}
				aBoolean601 = true;
				this.notifyAll();
			}
			if (aClass241_596 != null) {
				while ((aClass241_596.anInt2953 ^ 0xffffffff) == -1)
					Class262_Sub22.method3208(1L, false);
				if ((aClass241_596.anInt2953 ^ 0xffffffff) == -2) {
					try {
						((Thread) aClass241_596.anObject2956).join();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
			aClass241_596 = null;
		}
	}
}
