/* Class357 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class357 {
    private final byte[] aByteArray4427;
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

    public static void method4025() {
        aClass192_4444 = null;
        aClass318_4441 = null;
    }

    final int method4026(char c, int i) {
        anInt4432++;
        if (aByteArrayArray4433 != null) {
            return aByteArrayArray4433[i][c];
        }
        return 0;
    }

    final int method4027(int i) {
        anInt4437++;
        return 0xff & aByteArray4427[i];
    }

    final int method4028(String string, GLSprite[] glSprites, int i) {
        anInt4438++;
        return method4029(Class330.aStringArray4126, new int[]{i}, glSprites, string);
    }

    final int method4029(String[] strings, int[] is, GLSprite[] glSprites, String string) {
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
        int i_11_ = string.length();
        for (int i_12_ = 0; i_11_ > i_12_; i_12_++) {
            int i_13_ = 0xff & Class26.method312(string.charAt(i_12_));
            int i_14_ = 0;
            if (i_13_ == 60) {
                i_7_ = i_12_;
            } else {
                int i_15_;
                if (i_7_ == -1) {
                    i_14_ += method4027(i_13_);
                    i_15_ = i_12_;
                    if (aByteArrayArray4433 != null && i_8_ != -1) {
                        i_14_ += aByteArrayArray4433[i_8_][i_13_];
                    }
                    i_8_ = i_13_;
                } else {
                    if (i_13_ != 62) {
                        continue;
                    }
                    i_15_ = i_7_;
                    String string_16_ = string.substring(1 + i_7_, i_12_);
                    i_7_ = -1;
                    if (string_16_.equals("br")) {
                        strings[i_9_] = string.substring(i_3_, i_12_ + 1);
                        i_9_++;
                        if (i_9_ >= strings.length) {
                            return 0;
                        }
                        i_2_ = 0;
                        i_3_ = 1 + i_12_;
                        i_4_ = -1;
                        i_8_ = -1;
                        continue;
                    } else if (string_16_.equals("lt")) {
                        i_14_ += method4027(60);
                        if (aByteArrayArray4433 != null && i_8_ != -1) {
                            i_14_ += aByteArrayArray4433[i_8_][60];
                        }
                        i_8_ = 60;
                    } else if (string_16_.equals("gt")) {
                        i_14_ += method4027(62);
                        if (aByteArrayArray4433 != null && i_8_ != -1) {
                            i_14_ += aByteArrayArray4433[i_8_][62];
                        }
                        i_8_ = 62;
                    } else if (string_16_.equals("nbsp")) {
                        i_14_ += method4027(160);
                        if (aByteArrayArray4433 != null && i_8_ != -1) {
                            i_14_ += aByteArrayArray4433[i_8_][160];
                        }
                        i_8_ = 160;
                    } else if (string_16_.equals("shy")) {
                        i_14_ += method4027(173);
                        if (aByteArrayArray4433 != null && i_8_ != -1) {
                            i_14_ += aByteArrayArray4433[i_8_][173];
                        }
                        i_8_ = 173;
                    } else if (string_16_.equals("times")) {
                        i_14_ += method4027(215);
                        if (aByteArrayArray4433 != null && i_8_ != -1) {
                            i_14_ += aByteArrayArray4433[i_8_][215];
                        }
                        i_8_ = 215;
                    } else if (string_16_.equals("euro")) {
                        i_14_ += method4027(8364);
                        if (aByteArrayArray4433 != null && i_8_ != -1) {
                            i_14_ += aByteArrayArray4433[i_8_][8364];
                        }
                        i_8_ = 8364;
                    } else if (string_16_.equals("copy")) {
                        i_14_ += method4027(169);
                        if (aByteArrayArray4433 != null && i_8_ != -1) {
                            i_14_ += aByteArrayArray4433[i_8_][169];
                        }
                        i_8_ = 169;
                    } else if (string_16_.equals("reg")) {
                        i_14_ += method4027(174);
                        if (aByteArrayArray4433 != null && i_8_ != -1) {
                            i_14_ += aByteArrayArray4433[i_8_][174];
                        }
                        i_8_ = 174;
                    } else if (string_16_.startsWith("img=") && glSprites != null) {
                        try {
                            int i_17_ = Class350.method3998(string_16_.substring(4), -1);
                            i_14_ += glSprites[i_17_].method1197();
                            i_8_ = -1;
                        } catch (Exception exception) {
                            /* empty */
                        }
                    }
                    i_13_ = -1;
                }
                if (i_14_ > 0) {
                    i_2_ += i_14_;
                    if (is != null) {
                        if (i_13_ == 32) {
                            i_4_ = i_12_;
                            i_6_ = 1;
                            i_5_ = i_2_;
                        }
                        if (i_2_ > is[i_9_ >= is.length ? -1 + is.length : i_9_]) {
                            if (i_4_ < 0) {
                                strings[i_9_] = string.substring(i_3_, i_15_);
                                if (strings.length <= ++i_9_) {
                                    return 0;
                                }
                                i_3_ = i_15_;
                                i_2_ = i_14_;
                                i_8_ = -1;
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
                        if (i_13_ == 45) {
                            i_5_ = i_2_;
                            i_6_ = 0;
                            i_4_ = i_12_;
                        }
                    }
                }
            }
        }
        if (string.length() > i_3_) {
            strings[i_9_] = string.substring(i_3_);
            i_9_++;
        }
        return i_9_;
    }

    final int method4030(GLSprite[] glsprites, String string, int i_18_) {
        anInt4443++;
        int i_19_ = method4029(Class330.aStringArray4126, new int[]{i_18_}, glsprites, string);
        int i_20_ = 0;
        for (int i_21_ = 0; i_21_ < i_19_; i_21_++) {
            int i_22_ = method4031(119, glsprites, Class330.aStringArray4126[i_21_]);
            if (i_22_ > i_20_) {
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
                if (c == 62 && i_23_ != -1) {
                    String string_28_ = string.substring(i_23_ + 1, i_27_);
                    i_23_ = -1;
                    switch (string_28_) {
                        case "lt":
                            c = '<';
                            break;
                        case "gt":
                            break;
                        case "nbsp":
                            c = '\u00a0';
                            break;
                        case "shy":
                            c = '\u00ad';
                            break;
                        case "times":
                            c = '\u00d7';
                            break;
                        case "euro":
                            c = '\u20ac';
                            break;
                        case "copy":
                            c = '\u00a9';
                            break;
                        case "reg":
                            c = '\u00ae';
                            break;
                        default:
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
                }
                if (i_23_ == -1) {
                    i_25_ += 0xff & aByteArray4427[0xff & Class26.method312(c)];
                    if (aByteArrayArray4433 != null && i_24_ != -1) {
                        i_25_ += aByteArrayArray4433[i_24_][c];
                    }
                    i_24_ = c;
                }
            }
        }
        return i_25_;
    }

    final String method4032(String string, GLSprite[] glsprites, int i) {
        anInt4440++;
        if (method4031(104, glsprites, string) <= i) {
            return string;
        }
        i -= method4031(103, null, "...");
        int i_31_ = -1;
        int i_32_ = -1;
        int i_33_ = 0;
        int i_34_ = string.length();
        String string_35_ = "";
        for (int i_36_ = 0; i_34_ > i_36_; i_36_++) {
            char c = string.charAt(i_36_);
            if (c == 60) {
                i_31_ = i_36_;
            } else {
                if (c == 62 && i_31_ != -1) {
                    String string_37_ = string.substring(i_31_ + 1, i_36_);
                    i_31_ = -1;
                    switch (string_37_) {
                        case "lt":
                            c = '<';
                            break;
                        case "gt":
                            break;
                        case "nbsp":
                            c = '\u00a0';
                            break;
                        case "shy":
                            c = '\u00ad';
                            break;
                        case "times":
                            c = '\u00d7';
                            break;
                        case "euro":
                            c = '\u20ac';
                            break;
                        case "copy":
                            c = '\u00a9';
                            break;
                        case "reg":
                            c = '\u00ae';
                            break;
                        default:
                            if (string_37_.startsWith("img=") && glsprites != null) {
                                try {
                                    int i_38_ = Class350.method3998(string_37_.substring(4), -1);
                                    i_33_ += glsprites[i_38_].method1197();
                                    i_32_ = -1;
                                    if (i < i_33_) {
                                        return string_35_ + "...";
                                    }
                                    string_35_ = string.substring(0, 1 + i_36_);
                                } catch (Exception exception) {
                                    /* empty */
                                }
                            }
                            continue;
                    }
                }
                if (i_31_ == -1) {
                    i_33_ += 0xff & aByteArray4427[Class26.method312(c) & 0xff];
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

    final int method4033(String string) {
        anInt4435++;
        return method4031(105, null, string);
    }

    Class357(byte[] bs) {
        BufferedStream buffer = new BufferedStream(bs);
        int i = buffer.readUnsignedByte();
        if (i != 0) {
            throw new RuntimeException("");
        }
        boolean bool = buffer.readUnsignedByte() == 1;
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
            for (int i_44_ = 0; i_44_ < 256; i_44_++) {
                bs_43_[i_44_] = new byte[is[i_44_]];
                byte b = 0;
                for (int i_45_ = 0; bs_43_[i_44_].length > i_45_; i_45_++) {
                    b += buffer.readByte();
                    bs_43_[i_44_][i_45_] = b;
                }
            }
            byte[][] bs_46_ = new byte[256][];
            for (int i_47_ = 0; i_47_ < 256; i_47_++) {
                bs_46_[i_47_] = new byte[is[i_47_]];
                byte b = 0;
                for (int i_48_ = 0; i_48_ < bs_46_[i_47_].length; i_48_++) {
                    b += buffer.readByte();
                    bs_46_[i_47_][i_48_] = b;
                }
            }
            aByteArrayArray4433 = new byte[256][256];
            for (int i_49_ = 0; i_49_ < 256; i_49_++) {
                if (i_49_ != 32 && i_49_ != 160) {
                    for (int i_50_ = 0; i_50_ < 256; i_50_++) {
                        if (i_50_ != 32 && i_50_ != 160) {
                            aByteArrayArray4433[i_49_][i_50_] = (byte) Class190.method1939(is_41_, i_50_, is, i_49_, bs_43_, aByteArray4427, bs_46_);
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

    final int method4034(int i, int i_51_, String string, GLSprite[] glsprites) {
        anInt4428++;
        if (i_51_ == 0) {
            i_51_ = anInt4430;
        }
        int i_52_ = method4029(Class330.aStringArray4126, new int[]{i}, glsprites, string);
        int i_53_ = i_51_ * (i_52_ - 1);
        return i_53_ + anInt4434 + anInt4442;
    }
}
