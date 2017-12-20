/* Class357 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class357
{
	private byte[] aByteArray4427;
	static int anInt4428;
	static int anInt4429 = 0;
	protected int anInt4430;
	static int anInt4431;
	static int anInt4432;
	private byte[][] aByteArrayArray4433;
	protected int anInt4434;
	static int anInt4435;
	static int anInt4436;
	static int anInt4437;
	static int anInt4438;
	static float aFloat4439;
	static int anInt4440;
	static OutcommingPacket aClass318_4441 = new OutcommingPacket(26, 16);
	protected int anInt4442;
	static int anInt4443;
	static IncommingPacket aClass192_4444 = new IncommingPacket(13, 1);
	
	public static void method4025(byte b) {
		aClass192_4444 = null;
		if (b >= -57) {
			method4025((byte) -116);
		}
		aClass318_4441 = null;
	}
	
	final int method4026(char c, int i, int i_0_) {
		if (i_0_ != 255) {
			anInt4434 = 21;
		}
		anInt4432++;
		if (aByteArrayArray4433 != null) {
			return aByteArrayArray4433[i][c];
		}
		return 0;
	}
	
	final int method4027(int i, boolean bool) {
		anInt4437++;
		if (bool != false) {
			aClass192_4444 = null;
		}
		return 0xff & aByteArray4427[i];
	}
	
	final int method4028(String string, GLSprite[] glsprites, byte b, int i) {
		anInt4438++;
		int i_1_ = -104 % ((b - 19) / 58);
		return method4029(Class330.aStringArray4126, new int[] { i }, -110, glsprites, string);
	}
	
	final int method4029(String[] strings, int[] is, int i, GLSprite[] glsprites, String string) {
		anInt4431++;
		if (string == null) {
			return 0;
		}
		int i_2_ = 0;
		int i_3_ = 0;
		int i_4_ = -1;
		int i_5_ = 0;
		int i_6_ = 0;
		int i_7_ = -1;
		int i_8_ = -1;
		int i_9_ = 0;
		int i_10_ = 49 % ((14 - i) / 43);
		int i_11_ = string.length();
		for (int i_12_ = 0; (i_12_ ^ 0xffffffff) > (i_11_ ^ 0xffffffff); i_12_++) {
			int i_13_ = 0xff & Class26.method312(string.charAt(i_12_), (byte) -28);
			int i_14_ = 0;
			if ((i_13_ ^ 0xffffffff) == -61) {
				i_7_ = i_12_;
			} else {
				int i_15_;
				if ((i_7_ ^ 0xffffffff) != 0) {
					if ((i_13_ ^ 0xffffffff) != -63) {
						continue;
					}
					i_15_ = i_7_;
					String string_16_ = string.substring(1 + i_7_, i_12_);
					i_7_ = -1;
					if (!string_16_.equals("br")) {
						if (string_16_.equals("lt")) {
							i_14_ += method4027(60, false);
							if (aByteArrayArray4433 != null && i_8_ != -1) {
								i_14_ += aByteArrayArray4433[i_8_][60];
							}
							i_8_ = 60;
						} else if (!string_16_.equals("gt")) {
							if (string_16_.equals("nbsp")) {
								i_14_ += method4027(160, false);
								if (aByteArrayArray4433 != null && i_8_ != -1) {
									i_14_ += aByteArrayArray4433[i_8_][160];
								}
								i_8_ = 160;
							} else if (!string_16_.equals("shy")) {
								if (!string_16_.equals("times")) {
									if (!string_16_.equals("euro")) {
										if (!string_16_.equals("copy")) {
											if (string_16_.equals("reg")) {
												i_14_ += method4027(174, false);
												if (aByteArrayArray4433 != null && (i_8_ ^ 0xffffffff) != 0) {
													i_14_ += aByteArrayArray4433[i_8_][174];
												}
												i_8_ = 174;
											} else if (string_16_.startsWith("img=") && glsprites != null) {
												try {
													int i_17_ = Class350.method3998(string_16_.substring(4), -1);
													i_14_ += glsprites[i_17_].method1197();
													i_8_ = -1;
												} catch (Exception exception) {
													/* empty */
												}
											}
										} else {
											i_14_ += method4027(169, false);
											if (aByteArrayArray4433 != null && i_8_ != -1) {
												i_14_ += aByteArrayArray4433[i_8_][169];
											}
											i_8_ = 169;
										}
									} else {
										i_14_ += method4027(8364, false);
										if (aByteArrayArray4433 != null && i_8_ != -1) {
											i_14_ += aByteArrayArray4433[i_8_][8364];
										}
										i_8_ = 8364;
									}
								} else {
									i_14_ += method4027(215, false);
									if (aByteArrayArray4433 != null && i_8_ != -1) {
										i_14_ += aByteArrayArray4433[i_8_][215];
									}
									i_8_ = 215;
								}
							} else {
								i_14_ += method4027(173, false);
								if (aByteArrayArray4433 != null && i_8_ != -1) {
									i_14_ += aByteArrayArray4433[i_8_][173];
								}
								i_8_ = 173;
							}
						} else {
							i_14_ += method4027(62, false);
							if (aByteArrayArray4433 != null && (i_8_ ^ 0xffffffff) != 0) {
								i_14_ += aByteArrayArray4433[i_8_][62];
							}
							i_8_ = 62;
						}
					} else {
						strings[i_9_] = string.substring(i_3_, i_12_ - -1);
						i_9_++;
						if ((strings.length ^ 0xffffffff) >= (i_9_ ^ 0xffffffff)) {
							return 0;
						}
						i_2_ = 0;
						i_3_ = 1 + i_12_;
						i_4_ = -1;
						i_8_ = -1;
						continue;
					}
					i_13_ = -1;
				} else {
					i_14_ += method4027(i_13_, false);
					i_15_ = i_12_;
					if (aByteArrayArray4433 != null && (i_8_ ^ 0xffffffff) != 0) {
						i_14_ += aByteArrayArray4433[i_8_][i_13_];
					}
					i_8_ = i_13_;
				}
				if (i_14_ > 0) {
					i_2_ += i_14_;
					if (is != null) {
						if ((i_13_ ^ 0xffffffff) == -33) {
							i_4_ = i_12_;
							i_6_ = 1;
							i_5_ = i_2_;
						}
						if ((is[(is.length ^ 0xffffffff) >= (i_9_ ^ 0xffffffff) ? -1 + is.length : i_9_] ^ 0xffffffff) > (i_2_ ^ 0xffffffff)) {
							if (i_4_ < 0) {
								strings[i_9_] = string.substring(i_3_, i_15_);
								if ((++i_9_ ^ 0xffffffff) <= (strings.length ^ 0xffffffff)) {
									return 0;
								}
								i_3_ = i_15_;
								i_2_ = i_14_;
								i_8_ = -1;
								i_4_ = -1;
							} else {
								strings[i_9_] = string.substring(i_3_, -i_6_ + i_4_ + 1);
								i_9_++;
								if (strings.length <= i_9_) {
									return 0;
								}
								i_3_ = 1 + i_4_;
								i_4_ = -1;
								i_2_ -= i_5_;
								i_8_ = -1;
							}
						}
						if ((i_13_ ^ 0xffffffff) == -46) {
							i_5_ = i_2_;
							i_6_ = 0;
							i_4_ = i_12_;
						}
					}
				}
			}
		}
		if (string.length() > i_3_) {
			strings[i_9_] = string.substring(i_3_, string.length());
			i_9_++;
		}
		return i_9_;
	}
	
	final int method4030(GLSprite[] glsprites, int i, String string, int i_18_) {
		anInt4443++;
		int i_19_ = method4029(Class330.aStringArray4126, new int[] { i_18_ }, 92, glsprites, string);
		int i_20_ = 0;
		for (int i_21_ = i; i_21_ < i_19_; i_21_++) {
			int i_22_ = method4031(119, glsprites, Class330.aStringArray4126[i_21_]);
			if ((i_20_ ^ 0xffffffff) > (i_22_ ^ 0xffffffff)) {
				i_20_ = i_22_;
			}
		}
		return i_20_;
	}
	
	final int method4031(int i, GLSprite[] glsprites, String string) {
		anInt4436++;
		if (string == null) {
			return 0;
		}
		int i_23_ = -1;
		if (i < 99) {
			aClass192_4444 = null;
		}
		int i_24_ = -1;
		int i_25_ = 0;
		int i_26_ = string.length();
		for (int i_27_ = 0; i_26_ > i_27_; i_27_++) {
			char c = string.charAt(i_27_);
			if (c == 60) {
				i_23_ = i_27_;
			} else {
				if (c == 62 && (i_23_ ^ 0xffffffff) != 0) {
					String string_28_ = string.substring(i_23_ + 1, i_27_);
					i_23_ = -1;
					if (string_28_.equals("lt")) {
						c = '<';
					} else if (string_28_.equals("gt")) {
						c = '>';
					} else if (!string_28_.equals("nbsp")) {
						if (!string_28_.equals("shy")) {
							if (string_28_.equals("times")) {
								c = '\u00d7';
							} else if (string_28_.equals("euro")) {
								c = '\u20ac';
							} else if (string_28_.equals("copy")) {
								c = '\u00a9';
							} else if (string_28_.equals("reg")) {
								c = '\u00ae';
							} else {
								if (string_28_.startsWith("img=") && glsprites != null) {
									try {
										int i_29_ = Class350.method3998(string_28_.substring(4), -1);
										i_24_ = -1;
										i_25_ += glsprites[i_29_].method1197();
									} catch (Exception exception) {
										/* empty */
									}
								}
								continue;
							}
						} else {
							c = '\u00ad';
						}
					} else {
						c = '\u00a0';
					}
				}
				if ((i_23_ ^ 0xffffffff) == 0) {
					i_25_ += 0xff & aByteArray4427[0xff & Class26.method312(c, (byte) -64)];
					if (aByteArrayArray4433 != null && i_24_ != -1) {
						i_25_ += aByteArrayArray4433[i_24_][c];
					}
					i_24_ = c;
				}
			}
		}
		return i_25_;
	}
	
	final String method4032(String string, GLSprite[] glsprites, int i, int i_30_) {
		anInt4440++;
		if ((i ^ 0xffffffff) <= (method4031(104, glsprites, string) ^ 0xffffffff)) {
			return string;
		}
		i -= method4031(103, null, "...");
		int i_31_ = i_30_;
		int i_32_ = -1;
		int i_33_ = 0;
		int i_34_ = string.length();
		String string_35_ = "";
		for (int i_36_ = 0; (i_36_ ^ 0xffffffff) > (i_34_ ^ 0xffffffff); i_36_++) {
			char c = string.charAt(i_36_);
			if (c == 60) {
				i_31_ = i_36_;
			} else {
				if ((c ^ 0xffffffff) == -63 && (i_31_ ^ 0xffffffff) != 0) {
					String string_37_ = string.substring(i_31_ - -1, i_36_);
					i_31_ = -1;
					if (!string_37_.equals("lt")) {
						if (!string_37_.equals("gt")) {
							if (!string_37_.equals("nbsp")) {
								if (string_37_.equals("shy")) {
									c = '\u00ad';
								} else if (!string_37_.equals("times")) {
									if (string_37_.equals("euro")) {
										c = '\u20ac';
									} else if (string_37_.equals("copy")) {
										c = '\u00a9';
									} else if (string_37_.equals("reg")) {
										c = '\u00ae';
									} else {
										if (string_37_.startsWith("img=") && glsprites != null) {
											try {
												int i_38_ = Class350.method3998(string_37_.substring(4), i_30_);
												i_33_ += glsprites[i_38_].method1197();
												i_32_ = -1;
												if ((i_33_ ^ 0xffffffff) < (i ^ 0xffffffff)) {
													return string_35_ + "...";
												}
												string_35_ = string.substring(0, 1 + i_36_);
											} catch (Exception exception) {
												/* empty */
											}
										}
										continue;
									}
								} else {
									c = '\u00d7';
								}
							} else {
								c = '\u00a0';
							}
						} else {
							c = '>';
						}
					} else {
						c = '<';
					}
				}
				if ((i_31_ ^ 0xffffffff) == 0) {
					i_33_ += 0xff & aByteArray4427[Class26.method312(c, (byte) -42) & 0xff];
					if (aByteArrayArray4433 != null && i_32_ != -1) {
						i_33_ += aByteArrayArray4433[i_32_][c];
					}
					i_32_ = c;
					int i_39_ = i_33_;
					if (aByteArrayArray4433 != null) {
						i_39_ += aByteArrayArray4433[c][46];
					}
					if (i < i_39_) {
						return string_35_ + "...";
					}
					string_35_ = string.substring(0, 1 + i_36_);
				}
			}
		}
		return string;
	}
	
	final int method4033(byte b, String string) {
		anInt4435++;
		if (b != -6) {
			return 120;
		}
		return method4031(105, null, string);
	}
	
	Class357(byte[] bs) {
		BufferedStream buffer = new BufferedStream(bs);
		int i = buffer.readUnsignedByte();
		if (i != 0) {
			throw new RuntimeException("");
		}
		boolean bool = (buffer.readUnsignedByte() ^ 0xffffffff) == -2;
		aByteArray4427 = new byte[256];
		buffer.readBytes(aByteArray4427, 0, 256);
		if (bool) {
			int[] is = new int[256];
			for (int i_40_ = 0; i_40_ < 256; i_40_++)
				is[i_40_] = buffer.readUnsignedByte();
			int[] is_41_ = new int[256];
			for (int i_42_ = 0; i_42_ < 256; i_42_++)
				is_41_[i_42_] = buffer.readUnsignedByte();
			byte[][] bs_43_ = new byte[256][];
			for (int i_44_ = 0; (i_44_ ^ 0xffffffff) > -257; i_44_++) {
				bs_43_[i_44_] = new byte[is[i_44_]];
				byte b = 0;
				for (int i_45_ = 0; (i_45_ ^ 0xffffffff) > (bs_43_[i_44_].length ^ 0xffffffff); i_45_++) {
					b += buffer.readByte();
					bs_43_[i_44_][i_45_] = b;
				}
			}
			byte[][] bs_46_ = new byte[256][];
			for (int i_47_ = 0; (i_47_ ^ 0xffffffff) > -257; i_47_++) {
				bs_46_[i_47_] = new byte[is[i_47_]];
				byte b = 0;
				for (int i_48_ = 0; i_48_ < bs_46_[i_47_].length; i_48_++) {
					b += buffer.readByte();
					bs_46_[i_47_][i_48_] = b;
				}
			}
			aByteArrayArray4433 = new byte[256][256];
			for (int i_49_ = 0; (i_49_ ^ 0xffffffff) > -257; i_49_++) {
				if ((i_49_ ^ 0xffffffff) != -33 && (i_49_ ^ 0xffffffff) != -161) {
					for (int i_50_ = 0; i_50_ < 256; i_50_++) {
						if ((i_50_ ^ 0xffffffff) != -33 && (i_50_ ^ 0xffffffff) != -161) {
							aByteArrayArray4433[i_49_][i_50_] = (byte) Class190.method1939(is_41_, 255, i_50_, is, i_49_, bs_43_, aByteArray4427, bs_46_);
						}
					}
				}
			}
			anInt4430 = is_41_[32] + is[32];
		} else {
			anInt4430 = buffer.readUnsignedByte();
		}
		buffer.readUnsignedByte();
		buffer.readUnsignedByte();
		anInt4434 = buffer.readUnsignedByte();
		anInt4442 = buffer.readUnsignedByte();
	}
	
	final int method4034(int i, int i_51_, String string, GLSprite[] glsprites, byte b) {
		anInt4428++;
		if ((i_51_ ^ 0xffffffff) == -1) {
			i_51_ = anInt4430;
		}
		int i_52_ = method4029(Class330.aStringArray4126, new int[] { i }, -54, glsprites, string);
		if (b >= -34) {
			method4032(null, null, 99, 75);
		}
		int i_53_ = i_51_ * (i_52_ - 1);
		return i_53_ + anInt4434 - -anInt4442;
	}
}
