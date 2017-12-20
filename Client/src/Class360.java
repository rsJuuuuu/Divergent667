/* Class360 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.io.OutputStream;

public class Class360 implements Runnable
{
	private int anInt4469 = 0;
	private int anInt4470 = 0;
	static int anInt4471;
	static int anInt4472;
	static int anInt4473;
	private IOException anIOException4474;
	private int anInt4475;
	static int anInt4476;
	private byte[] aByteArray4477;
	private OutputStream anOutputStream4478;
	private Thread aThread4479;
	static int screenWidth;
	static int anInt4481;
	
	final void method4041(int i) {
		synchronized (this) {
			if (anIOException4474 == null) {
				anIOException4474 = new IOException("");
			}
			this.notifyAll();
		}
		anInt4476++;
		try {
			aThread4479.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
		if (i != -14303) {
			anInt4470 = 113;
		}
	}
	
	public final void run() {
		anInt4472++;
		for (;;) {
			int i;
			synchronized (this) {
				for (;;) {
					if (anIOException4474 != null) {
						return;
					}
					if (anInt4470 < anInt4469) {
						i = anInt4470 + -anInt4469 + anInt4475;
					} else {
						i = -anInt4469 + anInt4470;
					}
					if ((i ^ 0xffffffff) < -1) {
						break;
					}
					try {
						anOutputStream4478.flush();
					} catch (IOException ioexception) {
						anIOException4474 = ioexception;
						return;
					}
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
			try {
				if ((anInt4475 ^ 0xffffffff) > (anInt4469 + i ^ 0xffffffff)) {
					int i_0_ = -anInt4469 + anInt4475;
					anOutputStream4478.write(aByteArray4477, anInt4469, i_0_);
					anOutputStream4478.write(aByteArray4477, 0, i + -i_0_);
				} else {
					anOutputStream4478.write(aByteArray4477, anInt4469, i);
				}
			} catch (IOException ioexception) {
				synchronized (this) {
					anIOException4474 = ioexception;
					break;
				}
			}
			synchronized (this) {
				anInt4469 = (anInt4469 + i) % anInt4475;
			}
		}
	}
	
	final void method4042(byte[] bs, int i, int i_1_, int i_2_) throws IOException {
		anInt4471++;
		if ((i ^ 0xffffffff) > -1 || i_2_ < 0 || bs.length < i_2_ + i) {
			throw new IOException();
		}
		if (i_1_ == -19032) {
			synchronized (this) {
				if (anIOException4474 != null) {
					throw new IOException(anIOException4474.toString());
				}
				int i_3_;
				if (anInt4470 < anInt4469) {
					i_3_ = -1 + anInt4469 + -anInt4470;
				} else {
					i_3_ = -1 + anInt4469 + -anInt4470 + anInt4475;
				}
				if ((i ^ 0xffffffff) < (i_3_ ^ 0xffffffff)) {
					throw new IOException("");
				}
				if (i + anInt4470 > anInt4475) {
					int i_4_ = -anInt4470 + anInt4475;
					Class311.method3608(bs, i_2_, aByteArray4477, anInt4470, i_4_);
					Class311.method3608(bs, i_2_ + i_4_, aByteArray4477, 0, -i_4_ + i);
				} else {
					Class311.method3608(bs, i_2_, aByteArray4477, anInt4470, i);
				}
				anInt4470 = (i + anInt4470) % anInt4475;
				this.notifyAll();
			}
		}
	}
	
	static final Node_Sub6 method4043(Index class302, int i, boolean bool) {
		anInt4473++;
		byte[] bs = class302.method3518((byte) -124, i);
		if (bool != false) {
			return null;
		}
		if (bs == null) {
			return null;
		}
		return new Node_Sub6(bs);
	}
	
	final void method4044(int i) {
		if (i == 0) {
			anInt4481++;
			anOutputStream4478 = new OutputStream_Sub1();
		}
	}
	
	Class360(OutputStream outputstream, int i) {
		anOutputStream4478 = outputstream;
		anInt4475 = i + 1;
		aByteArray4477 = new byte[anInt4475];
		aThread4479 = new Thread(this);
		aThread4479.setDaemon(true);
		aThread4479.start();
	}
}
