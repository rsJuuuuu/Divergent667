/* Class42_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.SourceDataLine;

public class Class42_Sub1 extends Class42
{
	private SourceDataLine aSourceDataLine5551;
	private byte[] aByteArray5552;
	private int anInt5553;
	private boolean aBoolean5554 = false;
	private AudioFormat anAudioFormat5555;
	static Class aClass5556;
	
	final void method442() throws LineUnavailableException {
		aSourceDataLine5551.flush();
		if (aBoolean5554) {
			aSourceDataLine5551.close();
			aSourceDataLine5551 = null;
			DataLine.Info info = new DataLine.Info(aClass5556 == null ? aClass5556 = method456("javax.sound.sampled.SourceDataLine") : aClass5556, anAudioFormat5555, anInt5553 << (!DrawableModel.aBoolean913 ? 1 : 2));
			aSourceDataLine5551 = (SourceDataLine) AudioSystem.getLine(info);
			aSourceDataLine5551.open();
			aSourceDataLine5551.start();
		}
	}
	
	final void method449() {
		int i = 256;
		if (DrawableModel.aBoolean913) {
			i <<= 1;
		}
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			int i_1_ = anIntArray642[i_0_];
			if ((i_1_ + 8388608 & ~0xffffff) != 0) {
				i_1_ = 0x7fffff ^ i_1_ >> 31;
			}
			aByteArray5552[i_0_ * 2] = (byte) (i_1_ >> 8);
			aByteArray5552[i_0_ * 2 + 1] = (byte) (i_1_ >> 16);
		}
		aSourceDataLine5551.write(aByteArray5552, 0, i << 1);
	}
	
	final void method447(int i) throws LineUnavailableException {
		try {
			DataLine.Info info = new DataLine.Info(aClass5556 == null ? aClass5556 = method456("javax.sound.sampled.SourceDataLine") : aClass5556, anAudioFormat5555, i << (!DrawableModel.aBoolean913 ? 1 : 2));
			aSourceDataLine5551 = (SourceDataLine) AudioSystem.getLine(info);
			aSourceDataLine5551.open();
			aSourceDataLine5551.start();
			anInt5553 = i;
		} catch (LineUnavailableException lineunavailableexception) {
			if (1 != Node_Sub12.method2545(i, 858993459)) {
				method447(Class320_Sub19.method3753(i, -729073628));
			} else {
				aSourceDataLine5551 = null;
				throw lineunavailableexception;
			}
		}
	}
	
	final void method455() {
		if (null != aSourceDataLine5551) {
			aSourceDataLine5551.close();
			aSourceDataLine5551 = null;
		}
	}
	
	Class42_Sub1() {
		/* empty */
	}
	
	final int method446() {
		return anInt5553 - (aSourceDataLine5551.available() >> (!DrawableModel.aBoolean913 ? 1 : 2));
	}
	
	final void method452(Component component) {
		Mixer.Info[] infos = AudioSystem.getMixerInfo();
		if (null != infos) {
			Mixer.Info[] infos_2_ = infos;
			for (int i = 0; (i ^ 0xffffffff) > (infos_2_.length ^ 0xffffffff); i++) {
				Mixer.Info info = infos_2_[i];
				if (null != info) {
					String string = info.getName();
					if (null != string && (string.toLowerCase().indexOf("soundmax") ^ 0xffffffff) <= -1) {
						aBoolean5554 = true;
					}
				}
			}
		}
		anAudioFormat5555 = new AudioFormat((float) Class365.anInt4523, 16, !DrawableModel.aBoolean913 ? 1 : 2, true, false);
		aByteArray5552 = new byte[256 << (DrawableModel.aBoolean913 ? 2 : 1)];
	}
	
	static Class method456(String string) {
		Class var_class;
		try {
			var_class = Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw (NoClassDefFoundError) new NoClassDefFoundError().initCause(classnotfoundexception);
		}
		return var_class;
	}
}
