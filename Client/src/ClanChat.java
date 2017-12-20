/* ClanChat - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.DataInputStream;
import java.net.URL;

public class ClanChat
{
	static int anInt723;
	protected byte aByte724;
	static int anInt725;
	static int anInt726;
	static int anInt727;
	static int anInt728;
	static int anInt729;
	static int anInt730;
	static int anInt731;
	static int anInt732;
	static int anInt733;
	protected int anInt734;
	private HashTable aHashTable735;
	static int anInt736;
	protected int[] anIntArray737;
	protected byte aByte738;
	protected int anInt739;
	protected String[] aStringArray740;
	static int anInt741;
	private boolean aBoolean742;
	static int anInt743;
	private int anInt744;
	static int anInt745;
	static int anInt746;
	protected long aLong747;
	protected byte aByte748;
	protected int anInt749 = -1;
	protected boolean aBoolean750;
	protected byte aByte751;
	static int anInt752;
	private long[] aLongArray753;
	private int[] anIntArray754;
	static int anInt755;
	static Class151 aClass151_756 = new Class151(4, 1, 1, 1);
	protected int anInt757 = 0;
	private boolean aBoolean758;
	static int anInt759;
	static int anInt760;
	static int anInt761;
	static int anInt762;
	protected String aString763;
	static int anInt764;
	protected int anInt765;
	static int anInt766;
	static int anInt767;
	private long[] aLongArray768;
	protected String[] aStringArray769;
	protected byte[] aByteArray770;
	private int[] anIntArray771;
	
	final int method486(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
		anInt743++;
		if (i_3_ != 15883) {
			return 72;
		}
		int i_4_ = (1 << i_2_) - 1;
		int i_5_ = (i_1_ ^ 0xffffffff) == -32 ? -1 : -1 + (1 << i_1_ - -1);
		int i_6_ = i_4_ ^ i_5_;
		i <<= i_2_;
		i &= i_6_;
		int i_7_ = anIntArray754[i_0_];
		if (i == (i_6_ & i_7_)) {
			return -1;
		}
		i_7_ &= i_6_ ^ 0xffffffff;
		anIntArray754[i_0_] = Node_Sub16.method2590(i_7_, i);
		return i_0_;
	}
	
	private final void method487(byte b, int i) {
		if (aBoolean758) {
			if (aLongArray768 == null) {
				aLongArray768 = new long[i];
			} else {
				Class311.method3607(aLongArray768, 0, aLongArray768 = new long[i], 0, anInt734);
			}
		}
		anInt755++;
		if (aBoolean742) {
			if (aStringArray740 == null) {
				aStringArray740 = new String[i];
			} else {
				Class311.method3605(aStringArray740, 0, aStringArray740 = new String[i], 0, anInt734);
			}
		}
		if (aByteArray770 != null) {
			Class311.method3608(aByteArray770, 0, aByteArray770 = new byte[i], 0, anInt734);
		} else {
			aByteArray770 = new byte[i];
		}
		if (anIntArray754 != null) {
			Class311.method3609(anIntArray754, 0, anIntArray754 = new int[i], 0, anInt734);
		} else {
			anIntArray754 = new int[i];
		}
		if (anIntArray737 != null) {
			Class311.method3609(anIntArray737, 0, anIntArray737 = new int[i], 0, anInt734);
		} else {
			anIntArray737 = new int[i];
		}
		if (b < 109) {
			anInt757 = 94;
		}
	}
	
	final void method488(int i, String string, long l, int i_8_) {
		if (string != null && (string.length() ^ 0xffffffff) == -1) {
			string = null;
		}
		anInt767++;
		if (aBoolean758 != l > 0L) {
			throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + aBoolean758 + " but userhash:" + l);
		}
		if (!aBoolean742 != (string == null)) {
			throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + aBoolean742 + " but displayname:" + string);
		}
		if (l > 0L && (aLongArray768 == null || anInt734 >= aLongArray768.length) || string != null && (aStringArray740 == null || (aStringArray740.length ^ 0xffffffff) >= (anInt734 ^ 0xffffffff))) {
			method487((byte) 110, 5 + anInt734);
		}
		if (aLongArray768 != null) {
			aLongArray768[anInt734] = l;
		}
		if (aStringArray740 != null) {
			aStringArray740[anInt734] = string;
		}
		if (i != (anInt765 ^ 0xffffffff)) {
			aByteArray770[anInt734] = (byte) 0;
		} else {
			anInt765 = anInt734;
			aByteArray770[anInt734] = (byte) 126;
		}
		anIntArray754[anInt734] = 0;
		anIntArray737[anInt734] = i_8_;
		anIntArray771 = null;
		anInt734++;
	}
	
	final Long method489(byte b, int i) {
		anInt732++;
		if (aHashTable735 == null) {
			return null;
		}
		Node node = aHashTable735.method1518(3512, (long) i);
		if (b != -24) {
			method497(null, -61L, -20);
		}
		if (node == null || !(node instanceof Node_Sub44)) {
			return null;
		}
		return new Long(((Node_Sub44) node).aLong7550);
	}
	
	final int method490(String string, byte b) {
		anInt733++;
		if (string == null || (string.length() ^ 0xffffffff) == -1) {
			return -1;
		}
		for (int i = 0; (i ^ 0xffffffff) > (anInt734 ^ 0xffffffff); i++) {
			if (aStringArray740[i].equals(string)) {
				return i;
			}
		}
		return -1;
	}
	
	public static void method491(byte b) {
		if (b < 111) {
			anInt764 = -62;
		}
		aClass151_756 = null;
	}
	
	final boolean method492(String string, int i, boolean bool) {
		if (string == null) {
			string = "";
		} else if (string.length() > 80) {
			string = string.substring(0, 80);
		}
		anInt726++;
		if (aHashTable735 != null) {
			Node node = aHashTable735.method1518(3512, (long) i);
			if (node != null) {
				if (node instanceof Node_Sub18) {
					Node_Sub18 node_sub18 = (Node_Sub18) node;
					if (node_sub18.aString7149.equals(string)) {
						return false;
					}
					node_sub18.aString7149 = string;
					return true;
				}
				node.method2160((byte) 104);
			}
		} else {
			aHashTable735 = new HashTable(4);
		}
		if (bool != true) {
			return true;
		}
		aHashTable735.method1515((long) i, new Node_Sub18(string), -125);
		return true;
	}
	
	private final void method493(byte b) {
		anInt730++;
		if ((anInt734 ^ 0xffffffff) == -1) {
			anInt749 = -1;
			anInt765 = -1;
		} else {
			anInt749 = -1;
			anInt765 = -1;
			if (b <= -115) {
				int i = 0;
				byte b_9_ = aByteArray770[0];
				for (int i_10_ = 1; i_10_ < anInt734; i_10_++) {
					if (b_9_ >= aByteArray770[i_10_]) {
						if (anInt749 == -1 && (aByteArray770[i_10_] ^ 0xffffffff) == -126) {
							anInt749 = i_10_;
						}
					} else {
						if (b_9_ == 125) {
							anInt749 = i;
						}
						i = i_10_;
						b_9_ = aByteArray770[i_10_];
					}
				}
				anInt765 = i;
				if ((anInt765 ^ 0xffffffff) != 0) {
					aByteArray770[anInt765] = (byte) 126;
				}
			}
		}
	}
	
	static final boolean method494(byte b, int i, int i_11_) {
		anInt728++;
		if (b != 14) {
			return true;
		}
        return (0x800 & i) != 0;
    }
	
	final String method495(int i, int i_12_) {
		anInt731++;
		if (aHashTable735 == null) {
			return null;
		}
		Node node = aHashTable735.method1518(3512, (long) i_12_);
		if (node == null || !(node instanceof Node_Sub18)) {
			return null;
		}
		return ((Node_Sub18) node).aString7149;
	}
	
	final void method496(int i, int i_14_) {
		anInt741++;
		if (i_14_ > i || anInt734 <= i) {
			throw new RuntimeException("Invalid pos in doDeleteMember - pos:" + i + " memberCount:" + anInt734);
		}
		anInt734--;
		anIntArray771 = null;
		if (anInt734 != 0) {
			Class311.method3608(aByteArray770, 1 + i, aByteArray770, i, -i + anInt734);
			Class311.method3609(anIntArray754, 1 + i, anIntArray754, i, -i + anInt734);
			Class311.method3609(anIntArray737, i + 1, anIntArray737, i, anInt734 + -i);
			if (aLongArray768 != null) {
				Class311.method3607(aLongArray768, 1 + i, aLongArray768, i, -i + anInt734);
			}
			if (aStringArray740 != null) {
				Class311.method3605(aStringArray740, i - -1, aStringArray740, i, anInt734 - i);
			}
			if (anInt765 == i || anInt749 == i) {
				method493((byte) -126);
			}
		} else {
			anIntArray754 = null;
			aStringArray740 = null;
			aByteArray770 = null;
			anInt749 = -1;
			aLongArray768 = null;
			anIntArray737 = null;
			anInt765 = -1;
		}
	}
	
	final void method497(String string, long l, int i) {
		if (string != null && string.length() == 0) {
			string = null;
		}
		if (i > -40) {
			anInt739 = -125;
		}
		anInt760++;
		if ((l ^ 0xffffffffffffffffL) < -1L == !aBoolean758) {
			throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + aBoolean758 + " but userhash:" + l);
		}
		if (aBoolean742 == (string == null)) {
			throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + aBoolean742 + " but displayname:" + string);
		}
		if (l > 0L && (aLongArray753 == null || (aLongArray753.length ^ 0xffffffff) >= (anInt739 ^ 0xffffffff)) || string != null && (aStringArray769 == null || (anInt739 ^ 0xffffffff) <= (aStringArray769.length ^ 0xffffffff))) {
			method503(5 + anInt739, (byte) -5);
		}
		if (aLongArray753 != null) {
			aLongArray753[anInt739] = l;
		}
		if (aStringArray769 != null) {
			aStringArray769[anInt739] = string;
		}
		anInt739++;
	}
	
	final int[] method498(int i) {
		if (anIntArray771 == null) {
			String[] strings = new String[anInt734];
			anIntArray771 = new int[anInt734];
			for (int i_16_ = 0; (anInt734 ^ 0xffffffff) < (i_16_ ^ 0xffffffff); i_16_++) {
				strings[i_16_] = aStringArray740[i_16_];
				anIntArray771[i_16_] = i_16_;
			}
			Class339_Sub4.method3932((byte) 74, anIntArray771, strings);
		}
		anInt729++;
		return anIntArray771;
	}
	
	final boolean method499(byte b, int i, long l) {
		anInt736++;
		if (b != 89) {
			return false;
		}
		if (aHashTable735 == null) {
			aHashTable735 = new HashTable(4);
		} else {
			Node node = aHashTable735.method1518(3512, (long) i);
			if (node != null) {
				if (node instanceof Node_Sub44) {
					Node_Sub44 node_sub44 = (Node_Sub44) node;
					if ((node_sub44.aLong7550 ^ 0xffffffffffffffffL) == (l ^ 0xffffffffffffffffL)) {
						return false;
					}
					node_sub44.aLong7550 = l;
					return true;
				}
				node.method2160((byte) 113);
			}
		}
		aHashTable735.method1515((long) i, new Node_Sub44(l), -127);
		return true;
	}
	
	final int method500(byte b, byte b_17_, int i) {
		anInt759++;
		if (b == b_17_ || b == 127) {
			return -1;
		}
		if (anInt765 == i && ((anInt749 ^ 0xffffffff) == 0 || (aByteArray770[anInt749] ^ 0xffffffff) > -126)) {
			return -1;
		}
		if (b == aByteArray770[i]) {
			return -1;
		}
		aByteArray770[i] = b;
		method493((byte) -117);
		return i;
	}
	
	final Integer method501(int i, int i_18_) {
		if (i_18_ >= -18) {
			anInt739 = -52;
		}
		anInt723++;
		if (aHashTable735 == null) {
			return null;
		}
		Node node = aHashTable735.method1518(3512, (long) i);
		if (node == null || !(node instanceof Node_Sub32)) {
			return null;
		}
		return new Integer(((Node_Sub32) node).anInt7381);
	}
	
	final void method502(int i, byte b) {
		anInt761++;
		anInt739--;
		if (anInt739 != 0) {
			if (aLongArray753 != null) {
				Class311.method3607(aLongArray753, i + 1, aLongArray753, i, -i + anInt739);
			}
			if (aStringArray769 != null) {
				Class311.method3605(aStringArray769, 1 + i, aStringArray769, i, anInt739 + -i);
			}
		} else {
			aStringArray769 = null;
			aLongArray753 = null;
		}
		if (b != 23) {
			aByte748 = (byte) 54;
		}
	}
	
	private final void method503(int i, byte b) {
		if (aBoolean758) {
			if (aLongArray753 != null) {
				Class311.method3607(aLongArray753, 0, aLongArray753 = new long[i], 0, anInt739);
			} else {
				aLongArray753 = new long[i];
			}
		}
		anInt752++;
		if (aBoolean742) {
			if (aStringArray769 == null) {
				aStringArray769 = new String[i];
			} else {
				Class311.method3605(aStringArray769, 0, aStringArray769 = new String[i], 0, anInt739);
			}
		}
		if (b != -5) {
			anIntArray737 = null;
		}
	}
	
	final boolean method504(int i, int i_19_, int i_20_, int i_21_, int i_22_) {
		anInt745++;
		int i_23_ = (1 << i_19_) - 1;
		int i_24_ = i == 31 ? -1 : -1 + (1 << i - -1);
		if (i_22_ != 11226) {
			anInt734 = -66;
		}
		int i_25_ = i_23_ ^ i_24_;
		i_20_ <<= i_19_;
		i_20_ &= i_25_;
		if (aHashTable735 == null) {
			aHashTable735 = new HashTable(4);
		} else {
			Node node = aHashTable735.method1518(3512, (long) i_21_);
			if (node != null) {
				if (node instanceof Node_Sub32) {
					Node_Sub32 node_sub32 = (Node_Sub32) node;
					if ((i_25_ & node_sub32.anInt7381) == i_20_) {
						return false;
					}
					node_sub32.anInt7381 &= i_25_ ^ 0xffffffff;
					node_sub32.anInt7381 |= i_20_;
					return true;
				}
				node.method2160((byte) 71);
			}
		}
		aHashTable735.method1515((long) i_21_, new Node_Sub32(i_20_), -126);
		return true;
	}
	
	private final void method505(int i, BufferedStream buffer) {
		anInt725++;
		int i_26_ = buffer.readUnsignedByte();
		if (i_26_ < 1 || (i_26_ ^ 0xffffffff) < -6) {
			throw new RuntimeException("Unsupported ClanSettings version: " + i_26_);
		}
		int i_27_ = buffer.readUnsignedByte();
		if ((0x2 & i_27_) != 0) {
			aBoolean742 = true;
		}
		if ((0x1 & i_27_ ^ 0xffffffff) != -1) {
			aBoolean758 = true;
		}
		if (!aBoolean742) {
			aStringArray740 = null;
			aStringArray769 = null;
		}
		if (!aBoolean758) {
			aLongArray753 = null;
			aLongArray768 = null;
		}
		anInt757 = buffer.readInt();
		anInt744 = buffer.readInt();
		if (i_26_ <= 3 && anInt744 != 0) {
			anInt744 += 16912800;
		}
		if (i > -89) {
			method501(-24, -67);
		}
		anInt734 = buffer.readUnsignedShort();
		anInt739 = buffer.readUnsignedByte();
		aString763 = buffer.readString();
		if ((i_26_ ^ 0xffffffff) <= -5) {
			buffer.readInt();
		}
		aBoolean750 = (buffer.readUnsignedByte() ^ 0xffffffff) == -2;
		aByte751 = buffer.readByte();
		aByte748 = buffer.readByte();
		aByte738 = buffer.readByte();
		aByte724 = buffer.readByte();
		if (anInt734 > 0) {
			if (aBoolean758 && (aLongArray768 == null || aLongArray768.length < anInt734)) {
				aLongArray768 = new long[anInt734];
			}
			if (aBoolean742 && (aStringArray740 == null || anInt734 > aStringArray740.length)) {
				aStringArray740 = new String[anInt734];
			}
			if (aByteArray770 == null || aByteArray770.length < anInt734) {
				aByteArray770 = new byte[anInt734];
			}
			if (anIntArray754 == null || anInt734 > anIntArray754.length) {
				anIntArray754 = new int[anInt734];
			}
			if (anIntArray737 == null || anInt734 > anIntArray737.length) {
				anIntArray737 = new int[anInt734];
			}
			for (int i_28_ = 0; (anInt734 ^ 0xffffffff) < (i_28_ ^ 0xffffffff); i_28_++) {
				if (aBoolean758) {
					aLongArray768[i_28_] = buffer.readLong();
				}
				if (aBoolean742) {
					aStringArray740[i_28_] = buffer.readString2();
				}
				aByteArray770[i_28_] = buffer.readByte();
				if ((i_26_ ^ 0xffffffff) <= -3) {
					anIntArray754[i_28_] = buffer.readInt();
				}
				if (i_26_ >= 5) {
					anIntArray737[i_28_] = buffer.readUnsignedShort();
				} else {
					anIntArray737[i_28_] = 0;
				}
			}
			method493((byte) -128);
		}
		if (anInt739 > 0) {
			if (aBoolean758 && (aLongArray753 == null || (aLongArray753.length ^ 0xffffffff) > (anInt739 ^ 0xffffffff))) {
				aLongArray753 = new long[anInt739];
			}
			if (aBoolean742 && (aStringArray769 == null || aStringArray769.length < anInt739)) {
				aStringArray769 = new String[anInt739];
			}
			for (int i_29_ = 0; anInt739 > i_29_; i_29_++) {
				if (aBoolean758) {
					aLongArray753[i_29_] = buffer.readLong();
				}
				if (aBoolean742) {
					aStringArray769[i_29_] = buffer.readString2();
				}
			}
		}
		if ((i_26_ ^ 0xffffffff) <= -4) {
			int i_30_ = buffer.readUnsignedShort();
			if (i_30_ > 0) {
				aHashTable735 = new HashTable(i_30_ >= 16 ? 16 : Class320_Sub19.method3753(i_30_, -729073628));
				while ((i_30_-- ^ 0xffffffff) < -1) {
					int i_31_ = buffer.readInt();
					int i_32_ = i_31_ & 0x3fffffff;
					int i_33_ = i_31_ >>> 30;
					if ((i_33_ ^ 0xffffffff) == -1) {
						int i_34_ = buffer.readInt();
						aHashTable735.method1515((long) i_32_, new Node_Sub32(i_34_), -124);
					} else if ((i_33_ ^ 0xffffffff) == -2) {
						long l = buffer.readLong();
						aHashTable735.method1515((long) i_32_, new Node_Sub44(l), -123);
					} else if ((i_33_ ^ 0xffffffff) == -3) {
						String string = buffer.readString();
						aHashTable735.method1515((long) i_32_, new Node_Sub18(string), -127);
					}
				}
			}
		}
	}
	
	final Integer method506(byte b, int i, int i_35_, int i_36_) {
		anInt727++;
		if (aHashTable735 == null) {
			return null;
		}
		Node node = aHashTable735.method1518(3512, (long) i);
		if (node == null || !(node instanceof Node_Sub32)) {
			return null;
		}
		if (b != 73) {
			method501(68, 75);
		}
		int i_37_ = i_35_ != 31 ? -1 + (1 << i_35_ + 1) : -1;
		return new Integer((((Node_Sub32) node).anInt7381 & i_37_) >>> i_36_);
	}
	
	static final void method507(Throwable throwable, String string, int i) {
		if (i > -105) {
			aClass151_756 = null;
		}
		anInt766++;
		do {
			try {
				String string_38_ = "";
				if (throwable != null) {
					string_38_ = Class240.method3030(0, throwable);
				}
				if (string != null) {
					if (throwable != null) {
						string_38_ += " | ";
					}
					string_38_ += string;
				}
				Class235_Sub1.method2158((byte) -78, string_38_);
				string_38_ = IComponentDefinitions.method4147(string_38_, false, ":", "%3a");
				string_38_ = IComponentDefinitions.method4147(string_38_, false, "@", "%40");
				string_38_ = IComponentDefinitions.method4147(string_38_, false, "&", "%26");
				string_38_ = IComponentDefinitions.method4147(string_38_, false, "#", "%23");
				if (CacheNode_Sub16.anApplet9601 != null) {
					Class241 class241 = Class152.aSignLink1940.method3642((byte) -80, new URL(CacheNode_Sub16.anApplet9601.getCodeBase(), "clienterror.ws?c=" + Class320_Sub14.anInt8347 + "&u=" + (Node_Sub40.myPlayerDisplayName != null ? Node_Sub40.myPlayerDisplayName : String.valueOf(Node_Sub23.aLong7203)) + "&v1=" + SignLink.aString3989 + "&v2=" + SignLink.aString3995 + "&e=" + string_38_));
					while (class241.anInt2953 == 0)
						Class262_Sub22.method3208(1L, false);
					if (class241.anInt2953 != 1) {
						break;
					}
					DataInputStream datainputstream = (DataInputStream) class241.anObject2956;
					datainputstream.read();
					datainputstream.close();
				}
			} catch (Exception exception) {
				break;
			}
			break;
		} while (false);
	}
	
	final int method508(int i, int i_39_, int i_40_, int i_41_) {
		if (i_39_ != -23948) {
			aByte724 = (byte) -88;
		}
		anInt746++;
		int i_42_ = (i_40_ ^ 0xffffffff) != -32 ? (1 << i_40_ - -1) - 1 : -1;
		return (i_42_ & anIntArray754[i_41_]) >>> i;
	}
	
	final boolean method509(int i, int i_43_, int i_44_) {
		if (i_44_ != -553) {
			method497(null, 70L, -107);
		}
		anInt762++;
		if (aHashTable735 == null) {
			aHashTable735 = new HashTable(4);
		} else {
			Node node = aHashTable735.method1518(i_44_ ^ ~0xf90, (long) i_43_);
			if (node != null) {
				if (node instanceof Node_Sub32) {
					Node_Sub32 node_sub32 = (Node_Sub32) node;
					if (node_sub32.anInt7381 == i) {
						return false;
					}
					node_sub32.anInt7381 = i;
					return true;
				}
				node.method2160((byte) 95);
			}
		}
		aHashTable735.method1515((long) i_43_, new Node_Sub32(i), -127);
		return true;
	}
	
	ClanChat(BufferedStream buffer) {
		anInt744 = 0;
		aString763 = null;
		anInt765 = -1;
		method505(-102, buffer);
	}
	
	@SuppressWarnings("unused")
	private ClanChat() {
		anInt744 = 0;
		aString763 = null;
		anInt765 = -1;
	}
}
