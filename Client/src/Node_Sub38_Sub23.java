/* Node_Sub38_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Node_Sub38_Sub23 extends Node_Sub38
{
	static int anInt10326;
	private int anInt10327 = 2048;
	static int anInt10328;
	static OutcommingPacket aClass318_10329 = new OutcommingPacket(19, 3);
	static int anInt10330;
	static int anInt10331;
	private int anInt10332;
	private int anInt10333 = 2;
	private int anInt10334 = 5;
	private int anInt10335;
	static int anInt10336;
	private short[] aShortArray10337 = new short[512];
	static int anInt10338;
	static int anInt10339;
	private int anInt10340;
	private byte[] aByteArray10341;
	static int anInt10342;
	static CacheNode_Sub13 aCacheNode_Sub13_10343;
	static Class124 aClass124_10344;
	static short aShort10345;
	static int anInt10346 = -1;
	static int anInt10347;
	
	private final void method2861(byte b) {
		anInt10338++;
		Random random = new Random((long) anInt10335);
		if (b < 97) {
			method2862(null, 73, -116, 76);
		}
		aShortArray10337 = new short[512];
		if (anInt10327 > 0) {
			for (int i = 0; i < 512; i++)
				aShortArray10337[i] = (short) Class330.method3838(-5208, anInt10327, random);
		}
	}
	
	static final void method2862(IComponentDefinitions widget, int i, int i_0_, int i_1_) {
		if (i_1_ != -8525) {
			method2864(22);
		}
		anInt10336++;
		if (widget.aByte4851 != 0) {
			if (widget.aByte4851 != 1) {
				if (widget.aByte4851 == 2) {
					widget.anInt4762 = -widget.anInt4695 + (i_0_ + -widget.anInt4816);
				} else if ((widget.aByte4851 ^ 0xffffffff) != -4) {
					if ((widget.aByte4851 ^ 0xffffffff) == -5) {
						widget.anInt4762 = (i_0_ - widget.anInt4695) / 2 + (i_0_ * widget.anInt4816 >> 14);
					} else {
						widget.anInt4762 = -(widget.anInt4816 * i_0_ >> 14) + -widget.anInt4695 + i_0_;
					}
				} else {
					widget.anInt4762 = widget.anInt4816 * i_0_ >> 14;
				}
			} else {
				widget.anInt4762 = widget.anInt4816 + (-widget.anInt4695 + i_0_) / 2;
			}
		} else {
			widget.anInt4762 = widget.anInt4816;
		}
		if ((widget.aByte4720 ^ 0xffffffff) == -1) {
			widget.anInt4679 = widget.anInt4850;
		} else if (widget.aByte4720 == 1) {
			widget.anInt4679 = widget.anInt4850 + (i - widget.anInt4809) / 2;
		} else if (widget.aByte4720 != 2) {
			if ((widget.aByte4720 ^ 0xffffffff) == -4) {
				widget.anInt4679 = widget.anInt4850 * i >> 14;
			} else if (widget.aByte4720 == 4) {
				widget.anInt4679 = (-widget.anInt4809 + i) / 2 + (i * widget.anInt4850 >> 14);
			} else {
				widget.anInt4679 = -(i * widget.anInt4850 >> 14) + i - widget.anInt4809;
			}
		} else {
			widget.anInt4679 = -widget.anInt4809 + (i + -widget.anInt4850);
		}
		if (Class54.aBoolean817 && (Client.method113(widget).settingsHash != 0 || widget.type == 0)) {
			if (widget.anInt4679 < 0) {
				widget.anInt4679 = 0;
			} else if (i < widget.anInt4809 + widget.anInt4679) {
				widget.anInt4679 = i + -widget.anInt4809;
			}
			if ((widget.anInt4762 ^ 0xffffffff) > -1) {
				widget.anInt4762 = 0;
			} else if (widget.anInt4762 - -widget.anInt4695 > i_0_) {
				widget.anInt4762 = i_0_ + -widget.anInt4695;
			}
		}
	}
	
	public Node_Sub38_Sub23() {
		super(0, true);
		anInt10332 = 1;
		aByteArray10341 = new byte[512];
		anInt10340 = 5;
		anInt10335 = 0;
	}
	
	final void method2780(boolean bool, BufferedStream buffer, int i) {
		if (bool == false) {
			anInt10326++;
			int i_2_ = i;
		while_209_:
			do {
			while_208_:
				do {
				while_207_:
					do {
					while_206_:
						do {
						while_205_:
							do {
								do {
									if ((i_2_ ^ 0xffffffff) != -1) {
										if ((i_2_ ^ 0xffffffff) != -2) {
											if (i_2_ != 2) {
												if ((i_2_ ^ 0xffffffff) != -4) {
													if (i_2_ != 4) {
														if ((i_2_ ^ 0xffffffff) != -6) {
															if ((i_2_ ^ 0xffffffff) == -7) {
																break while_208_;
															}
															break while_209_;
														}
													} else {
														break while_206_;
													}
													break while_207_;
												}
											} else {
												break;
											}
											break while_205_;
										}
									} else {
										anInt10334 = anInt10340 = buffer.readUnsignedByte();
										return;
									}
									anInt10335 = buffer.readUnsignedByte();
									return;
								} while (false);
								anInt10327 = buffer.readUnsignedShort();
								return;
							} while (false);
							anInt10333 = buffer.readUnsignedByte();
							return;
						} while (false);
						anInt10332 = buffer.readUnsignedByte();
						return;
					} while (false);
					anInt10334 = buffer.readUnsignedByte();
					return;
				} while (false);
				anInt10340 = buffer.readUnsignedByte();
			} while (false);
		}
	}
	
	static final void method2863(int i) {
		anInt10328++;
		if (Class87.removeWalkHere) {
			IComponentDefinitions widget = Node_Sub3.method2169(i ^ 0x4b17, Class46.anInt681, Node_Sub15_Sub9.anInt9839);
			if (widget != null && widget.anObjectArray4771 != null) {
				Node_Sub37 node_sub37 = new Node_Sub37();
				node_sub37.parameters = widget.anObjectArray4771;
				node_sub37.aWidget7437 = widget;
				ClientScriptsExecutor.method3556(node_sub37);
			}
			if (i != -19316) {
				method2862(null, 60, -116, -94);
			}
			Class239.anInt2928 = -1;
			Class87.removeWalkHere = false;
			Class92.anInt1230 = -1;
			if (widget != null) {
				ClientScript.method2321(-1, widget);
			}
		}
	}
	
	final void method2785(int i) {
		aByteArray10341 = Class169_Sub3.method1778(anInt10335, true);
		if (i != 7) {
			anInt10340 = 6;
		}
		anInt10330++;
		method2861((byte) 120);
	}
	
	final int[] method2775(int i, int i_3_) {
		anInt10339++;
		int[] is = aClass146_7460.method1645(27356, i_3_);
		if (i <= 107) {
			method2862(null, -42, 121, -79);
		}
		if (aClass146_7460.aBoolean1819) {
			int i_4_ = 2048 + Node_Sub25_Sub1.anIntArray9941[i_3_] * anInt10340;
			int i_5_ = i_4_ >> 12;
			int i_6_ = i_5_ - -1;
			int i_7_ = 0;
		while_217_:
			for (/**/; (Class339_Sub7.anInt8728 ^ 0xffffffff) < (i_7_ ^ 0xffffffff); i_7_++) {
				Animable_Sub1.anInt9098 = Class134_Sub2.anInt9024 = Class58.anInt862 = Class92.anInt1229 = 2147483647;
				int i_8_ = 2048 + anInt10334 * CacheNode_Sub3.anIntArray9442[i_7_];
				int i_9_ = i_8_ >> 12;
				int i_10_ = 1 + i_9_;
				for (int i_11_ = -1 + i_5_; (i_11_ ^ 0xffffffff) >= (i_6_ ^ 0xffffffff); i_11_++) {
					int i_12_ = 0xff & aByteArray10341[0xff & (anInt10340 > i_11_ ? i_11_ : -anInt10340 + i_11_)];
					for (int i_13_ = -1 + i_9_; (i_10_ ^ 0xffffffff) <= (i_13_ ^ 0xffffffff); i_13_++) {
						int i_14_ = 2 * (0xff & aByteArray10341[i_12_ + ((i_13_ ^ 0xffffffff) <= (anInt10334 ^ 0xffffffff) ? -anInt10334 + i_13_ : i_13_) & 0xff]);
						int i_15_ = -(i_13_ << 12) - (aShortArray10337[i_14_++] - i_8_);
						int i_16_ = -(i_11_ << 12) - (aShortArray10337[i_14_] - i_4_);
						int i_17_ = anInt10332;
						int i_18_;
					while_213_:
						do {
						while_212_:
							do {
							while_211_:
								do {
								while_210_:
									do {
										do {
											if ((i_17_ ^ 0xffffffff) != -2) {
												if (i_17_ != 3) {
													if (i_17_ != 4) {
														if ((i_17_ ^ 0xffffffff) != -6) {
															if ((i_17_ ^ 0xffffffff) == -3) {
																break while_211_;
															}
															break while_212_;
														}
													} else {
														break;
													}
													break while_210_;
												}
											} else {
												i_18_ = i_15_ * i_15_ + i_16_ * i_16_ >> 12;
												break while_213_;
											}
											i_15_ = i_15_ >= 0 ? i_15_ : -i_15_;
											i_16_ = (i_16_ ^ 0xffffffff) <= -1 ? i_16_ : -i_16_;
											i_18_ = (i_15_ ^ 0xffffffff) >= (i_16_ ^ 0xffffffff) ? i_16_ : i_15_;
											break while_213_;
										} while (false);
										i_15_ = (int) (4096.0 * Math.sqrt((double) ((float) ((i_15_ ^ 0xffffffff) > -1 ? -i_15_ : i_15_) / 4096.0F)));
										i_16_ = (int) (4096.0 * Math.sqrt((double) ((float) (i_16_ < 0 ? -i_16_ : i_16_) / 4096.0F)));
										i_18_ = i_16_ + i_15_;
										i_18_ = i_18_ * i_18_ >> 12;
										break while_213_;
									} while (false);
									i_16_ *= i_16_;
									i_15_ *= i_15_;
									i_18_ = (int) (Math.sqrt(Math.sqrt((double) ((float) (i_16_ + i_15_) / 1.6777216E7F))) * 4096.0);
									break while_213_;
								} while (false);
								i_18_ = (i_15_ >= 0 ? i_15_ : -i_15_) + ((i_16_ ^ 0xffffffff) > -1 ? -i_16_ : i_16_);
								break while_213_;
							} while (false);
							i_18_ = (int) (Math.sqrt((double) ((float) (i_16_ * i_16_ + i_15_ * i_15_) / 1.6777216E7F)) * 4096.0);
						} while (false);
						if (i_18_ < Animable_Sub1.anInt9098) {
							Class92.anInt1229 = Class58.anInt862;
							Class58.anInt862 = Class134_Sub2.anInt9024;
							Class134_Sub2.anInt9024 = Animable_Sub1.anInt9098;
							Animable_Sub1.anInt9098 = i_18_;
						} else if ((i_18_ ^ 0xffffffff) <= (Class134_Sub2.anInt9024 ^ 0xffffffff)) {
							if (i_18_ >= Class58.anInt862) {
								if ((i_18_ ^ 0xffffffff) > (Class92.anInt1229 ^ 0xffffffff)) {
									Class92.anInt1229 = i_18_;
								}
							} else {
								Class92.anInt1229 = Class58.anInt862;
								Class58.anInt862 = i_18_;
							}
						} else {
							Class92.anInt1229 = Class58.anInt862;
							Class58.anInt862 = Class134_Sub2.anInt9024;
							Class134_Sub2.anInt9024 = i_18_;
						}
					}
				}
				int i_19_ = anInt10333;
			while_215_:
				do {
				while_214_:
					do {
						do {
							if ((i_19_ ^ 0xffffffff) != -1) {
								if (i_19_ != 1) {
									if (i_19_ != 3) {
										if (i_19_ != 4) {
											if ((i_19_ ^ 0xffffffff) == -3) {
												break while_215_;
											}
											continue while_217_;
										}
									} else {
										break;
									}
									break while_214_;
								}
							} else {
								is[i_7_] = Animable_Sub1.anInt9098;
								continue while_217_;
							}
							is[i_7_] = Class134_Sub2.anInt9024;
							continue while_217_;
						} while (false);
						is[i_7_] = Class58.anInt862;
						continue while_217_;
					} while (false);
					is[i_7_] = Class92.anInt1229;
					continue while_217_;
				} while (false);
				is[i_7_] = -Animable_Sub1.anInt9098 + Class134_Sub2.anInt9024;
			}
		}
		return is;
	}
	
	public static void method2864(int i) {
		aClass124_10344 = null;
		if (i != -22994) {
			aCacheNode_Sub13_10343 = null;
		}
		aCacheNode_Sub13_10343 = null;
		aClass318_10329 = null;
	}
	
	static final void method2865(byte b) {
		anInt10342++;
		if (!Node_Sub3.aBoolean6948) {
			@SuppressWarnings("unused")
			int i = -80 / ((b - -18) / 46);
			Class291.aFloat3666 += (-Class291.aFloat3666 + -24.0F) / 2.0F;
			Node_Sub3.aBoolean6948 = true;
			Node_Sub25_Sub1.aBoolean9950 = true;
		}
	}
	
	static final boolean method2866(boolean bool) {
		anInt10331++;
		if ((Class151.anInt1843 ^ 0xffffffff) != -4) {
			return false;
		}
		if (Node_Sub38_Sub8.anInt10163 != 0 || (Class4.anInt124 ^ 0xffffffff) != -1) {
			return false;
		}
		if (bool != false) {
			aClass124_10344 = null;
		}
		return true;
	}
	
	static {
		aClass124_10344 = new Class124(50);
		anInt10347 = -1;
	}
}
