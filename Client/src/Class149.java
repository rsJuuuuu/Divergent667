/* Class149 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import com.ms.com.ComFailException;
import com.ms.directX.*;

import java.awt.*;

public class Class149 implements Interface5
{
	private int anInt5022;
	private WaveFormatEx aWaveFormatEx5023;
	private DSBufferDesc[] aDSBufferDescArray5024 = new DSBufferDesc[2];
	private int[] anIntArray5025;
	private boolean[] aBooleanArray5026 = new boolean[2];
	private int anInt5027;
	private int anInt5028;
	private int[] anIntArray5029;
	private DirectSound aDirectSound5030;
	private DSCursors[] aDSCursorsArray5031 = new DSCursors[2];
	private int[] anIntArray5032;
	private DirectSoundBuffer[] aDirectSoundBufferArray5033;
	private byte[][] aByteArrayArray5034;
	
	public final void method16(int i, int[] is) {
		int i_0_ = is.length;
		if (i_0_ != 256 * anInt5028) {
			throw new IllegalArgumentException();
		}
		int i_1_ = anIntArray5025[i] * anInt5027;
		for (int i_2_ = 0; i_2_ < i_0_; i_2_++) {
			int i_3_ = is[i_2_];
			if ((i_3_ + 8388608 & ~0xffffff) != 0) {
				i_3_ = 0x7fffff ^ i_3_ >> 31;
			}
			aByteArrayArray5034[i][i_1_ + i_2_ * 2] = (byte) (i_3_ >> 8);
			aByteArrayArray5034[i][i_1_ + i_2_ * 2 + 1] = (byte) (i_3_ >> 16);
		}
		aDirectSoundBufferArray5033[i].writeBuffer(i_1_, i_0_ * 2, aByteArrayArray5034[i], 0);
		anIntArray5025[i] = anIntArray5025[i] + i_0_ / anInt5028 & 0xffff;
		if (!aBooleanArray5026[i]) {
			aDirectSoundBufferArray5033[i].play(1);
			aBooleanArray5026[i] = true;
		}
	}
	
	public final int method12(int i, int i_4_) {
		if (!aBooleanArray5026[i]) {
			return 0;
		}
		aDirectSoundBufferArray5033[i].getCurrentPosition(aDSCursorsArray5031[i]);
		int i_5_ = aDSCursorsArray5031[i].write / anInt5027;
		int i_6_ = 0xffff & anIntArray5025[i] + -i_5_;
		if (i_4_ <= 60) {
			method15(38, (byte) -82);
		}
		if ((anIntArray5032[i] ^ 0xffffffff) > (i_6_ ^ 0xffffffff)) {
			int i_7_ = i_5_ - anIntArray5025[i] & 0xffff;
			while ((i_7_ ^ 0xffffffff) < -1) {
				i_7_ -= 256;
				method16(i, anIntArray5029);
			}
			i_6_ = 0xffff & anIntArray5025[i] - i_5_;
		}
		return i_6_;
	}
	
	public final void method14(int i, boolean bool, Component component, byte b) throws Exception {
		if (anInt5022 == 0) {
			if (i < 8000 || i > 48000) {
				throw new IllegalArgumentException();
			}
			anInt5028 = !bool ? 1 : 2;
			anInt5027 = bool ? 4 : 2;
			anIntArray5029 = new int[anInt5028 * 256];
			aDirectSound5030.initialize(null);
			if (b >= -99) {
				method17(-83, false);
			}
			aDirectSound5030.setCooperativeLevel(component, 2);
			for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > -3; i_8_++)
				aDSBufferDescArray5024[i_8_].flags = 16384;
			aWaveFormatEx5023.avgBytesPerSec = i * anInt5027;
			aWaveFormatEx5023.formatTag = 1;
			aWaveFormatEx5023.channels = anInt5028;
			aWaveFormatEx5023.blockAlign = anInt5027;
			aWaveFormatEx5023.samplesPerSec = i;
			anInt5022 = i;
			aWaveFormatEx5023.bitsPerSample = 16;
		}
	}
	
	public final void method17(int i, boolean bool) {
		if (aDirectSoundBufferArray5033[i] != null) {
			try {
				aDirectSoundBufferArray5033[i].stop();
			} catch (com.ms.com.ComFailException comfailexception) {
				/* empty */
			}
			aDirectSoundBufferArray5033[i] = null;
		}
		if (bool != true) {
			anIntArray5032 = null;
		}
	}
	
	public final void method13(int i, int i_9_, int i_10_) throws Exception {
		if ((anInt5022 ^ 0xffffffff) == -1 || aDirectSoundBufferArray5033[i_9_] != null) {
			throw new IllegalStateException();
		}
		int i_11_ = anInt5027 * 65536;
		if (aByteArrayArray5034[i_9_] == null || (aByteArrayArray5034[i_9_].length ^ 0xffffffff) != (i_11_ ^ 0xffffffff)) {
			aByteArrayArray5034[i_9_] = new byte[i_11_];
			aDSBufferDescArray5024[i_9_].bufferBytes = i_11_;
		}
		if (i_10_ != 65535) {
			aDirectSound5030 = null;
		}
		aDirectSoundBufferArray5033[i_9_] = aDirectSound5030.createSoundBuffer(aDSBufferDescArray5024[i_9_], aWaveFormatEx5023);
		aBooleanArray5026[i_9_] = false;
		anIntArray5025[i_9_] = 0;
		anIntArray5032[i_9_] = i;
	}
	
	public final void method15(int i, byte b) {
		if (b < 73) {
			method16(70, null);
		}
		try {
			aDirectSoundBufferArray5033[i].stop();
		} catch (ComFailException e) {
			e.printStackTrace();
		}
		aBooleanArray5026[i] = false;
		aDirectSoundBufferArray5033[i].setCurrentPosition(0);
		anIntArray5025[i] = 0;
	}
	
	public Class149() throws Exception {
		anIntArray5025 = new int[2];
		aDirectSoundBufferArray5033 = new DirectSoundBuffer[2];
		anIntArray5032 = new int[2];
		aByteArrayArray5034 = new byte[2][];
		aDirectSound5030 = new DirectSound();
		aWaveFormatEx5023 = new WaveFormatEx();
		for (int i = 0; (i ^ 0xffffffff) > -3; i++)
			aDSBufferDescArray5024[i] = new DSBufferDesc();
		for (int i = 0; i < 2; i++)
			aDSCursorsArray5031[i] = new DSCursors();
	}
}
