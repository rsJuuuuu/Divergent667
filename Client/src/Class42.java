/* Class42 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

class Class42
{
	static int anInt629;
	static int anInt630;
	static Class122 aClass122_631;
	static int anInt632;
	static int anInt633;
	static int anInt634;
	private int anInt635 = 32;
	static int anInt636;
	static int anInt637;
	static int anInt638;
	static int anInt639;
	static int anInt640;
	private long aLong641;
	protected int[] anIntArray642;
	static Class181 aClass181_643;
	static int anInt644;
	static int[] anIntArray645;
	static int anInt646;
	private boolean aBoolean647 = false;
	static int anInt648;
	static int anInt649 = 16777215;
	private Node_Sub9 aNode_Sub9_650;
	protected int anInt651;
	private Node_Sub9[] aNode_Sub9Array652;
	protected int anInt653;
	private long aLong654;
	private int anInt655;
	private boolean aBoolean656;
	private int anInt657;
	private int anInt658;
	private Node_Sub9[] aNode_Sub9Array659;
	private long aLong660;
	private int anInt661;
	private int anInt662;
	
	final synchronized void method441(int i, Node_Sub9 node_sub9) {
		anInt630++;
		aNode_Sub9_650 = node_sub9;
		if (i != 11757) {
			anInt635 = -102;
		}
	}
	
	void method442() throws Exception {
		anInt629++;
	}
	
	private final void method443(int i, int i_0_) {
		anInt655 -= i_0_;
		anInt634++;
		if (i == -26994) {
			if ((anInt655 ^ 0xffffffff) > -1) {
				anInt655 = 0;
			}
			if (aNode_Sub9_650 != null) {
				aNode_Sub9_650.method2426(i_0_);
			}
		}
	}
	
	static final int method444(long l, boolean bool) {
		anInt637++;
		if (bool != false) {
			return 123;
		}
		return (int) (l / 86400000L) + -11745;
	}
	
	final synchronized void method445(int i) {
		if (i != 3) {
			aNode_Sub9Array659 = null;
		}
		if (IComponentDefinitions.aClass92_4845 != null) {
			boolean bool = true;
			for (int i_1_ = 0; i_1_ < 2; i_1_++) {
				if (IComponentDefinitions.aClass92_4845.aClass42Array1234[i_1_] == this) {
					IComponentDefinitions.aClass92_4845.aClass42Array1234[i_1_] = null;
				}
				if (IComponentDefinitions.aClass92_4845.aClass42Array1234[i_1_] != null) {
					bool = false;
				}
			}
			if (bool) {
				IComponentDefinitions.aClass92_4845.aBoolean1231 = true;
				while (IComponentDefinitions.aClass92_4845.aBoolean1232)
					Class262_Sub22.method3208(50L, false);
				IComponentDefinitions.aClass92_4845 = null;
			}
		}
		anInt639++;
		method455();
		anIntArray642 = null;
		aBoolean647 = true;
	}
	
	int method446() throws Exception {
		anInt648++;
		return anInt651;
	}
	
	void method447(int i) throws Exception {
		anInt633++;
	}
	
	public static void method448(int i) {
		aClass122_631 = null;
		int i_2_ = 120 / ((2 - i) / 34);
		aClass181_643 = null;
		anIntArray645 = null;
	}
	
	void method449() throws Exception {
		anInt640++;
	}
	
	private final void method450(boolean bool, int i, Node_Sub9 node_sub9) {
		anInt636++;
		int i_3_ = i >> 5;
		Node_Sub9 node_sub9_4_ = aNode_Sub9Array652[i_3_];
		if (bool != false) {
			method441(51, null);
		}
		if (node_sub9_4_ == null) {
			aNode_Sub9Array659[i_3_] = node_sub9;
		} else {
			node_sub9_4_.aNode_Sub9_7072 = node_sub9;
		}
		aNode_Sub9Array652[i_3_] = node_sub9;
		node_sub9.anInt7073 = i;
	}
	
	final synchronized void method451(byte b) {
		anInt644++;
		aBoolean656 = true;
		if (b != -50) {
			method443(91, 24);
		}
		try {
			method442();
		} catch (Exception exception) {
			method455();
			aLong654 = Class313.method3650(false) - -2000L;
		}
	}
	
	void method452(Component component) throws Exception {
		anInt638++;
	}
	
	final synchronized void method453(byte b) {
		anInt632++;
		if (!aBoolean647) {
			long l = Class313.method3650(false);
			try {
				if (aLong641 + 6000L < l) {
					aLong641 = l - 6000L;
				}
				for (/**/; (l ^ 0xffffffffffffffffL) < (5000L + aLong641 ^ 0xffffffffffffffffL); l = Class313.method3650(false)) {
					method443(-26994, 256);
					aLong641 += (long) (256000 / Class365.anInt4523);
				}
			} catch (Exception exception) {
				aLong641 = l;
			}
			if (anIntArray642 != null) {
				try {
					if ((aLong654 ^ 0xffffffffffffffffL) != -1L) {
						if ((aLong654 ^ 0xffffffffffffffffL) < (l ^ 0xffffffffffffffffL)) {
							return;
						}
						method447(anInt651);
						aLong654 = 0L;
						aBoolean656 = true;
					}
					int i = method446();
					if (-i + anInt657 > anInt658) {
						anInt658 = anInt657 + -i;
					}
					int i_5_ = anInt653 + anInt662;
					if ((256 + i_5_ ^ 0xffffffff) < -16385) {
						i_5_ = 16128;
					}
					if (anInt651 < i_5_ + 256) {
						anInt651 += 1024;
						if (anInt651 > 16384) {
							anInt651 = 16384;
						}
						method455();
						method447(anInt651);
						i = 0;
						if ((anInt651 ^ 0xffffffff) > (i_5_ - -256 ^ 0xffffffff)) {
							i_5_ = -256 + anInt651;
							anInt662 = i_5_ + -anInt653;
						}
						aBoolean656 = true;
					}
					while (i_5_ > i) {
						method454(anIntArray642, 256);
						i += 256;
						method449();
					}
					if (l > aLong660) {
						if (aBoolean656) {
							aBoolean656 = false;
						} else {
							if ((anInt658 ^ 0xffffffff) == -1 && (anInt661 ^ 0xffffffff) == -1) {
								method455();
								aLong654 = 2000L + l;
								return;
							}
							anInt662 = Math.min(anInt661, anInt658);
							anInt661 = anInt658;
						}
						aLong660 = 2000L + l;
						anInt658 = 0;
					}
					if (b >= -98) {
						method441(66, null);
					}
					anInt657 = i;
				} catch (Exception exception) {
					method455();
					aLong654 = 2000L + l;
				}
			}
		}
	}
	
	private final void method454(int[] is, int i) {
		int i_6_ = i;
		if (DrawableModel.aBoolean913) {
			i_6_ <<= 1;
		}
		Class311.method3602(is, 0, i_6_);
		anInt655 -= i;
		if (aNode_Sub9_650 != null && anInt655 <= 0) {
			anInt655 += Class365.anInt4523 >> 4;
			Class320_Sub19.method3755(-729073628, aNode_Sub9_650);
			method450(false, aNode_Sub9_650.method2432(), aNode_Sub9_650);
			int i_7_ = 0;
			int i_8_ = 255;
			int i_9_ = 7;
		while_11_:
			while (i_8_ != 0) {
				int i_10_;
				int i_11_;
				if (i_9_ < 0) {
					i_10_ = i_9_ & 0x3;
					i_11_ = -(i_9_ >> 2);
				} else {
					i_10_ = i_9_;
					i_11_ = 0;
				}
				for (int i_12_ = i_8_ >>> i_10_ & 0x11111111; i_12_ != 0; i_12_ >>>= 4) {
					if ((i_12_ & 0x1) != 0) {
						i_8_ &= 1 << i_10_ ^ 0xffffffff;
						Node_Sub9 node_sub9 = null;
						Node_Sub9 node_sub9_13_ = aNode_Sub9Array659[i_10_];
						while (node_sub9_13_ != null) {
							Node_Sub45 node_sub45 = node_sub9_13_.aNode_Sub45_7075;
							if (node_sub45 != null && node_sub45.anInt7552 > i_11_) {
								i_8_ |= 1 << i_10_;
								node_sub9 = node_sub9_13_;
								node_sub9_13_ = node_sub9_13_.aNode_Sub9_7072;
							} else {
								node_sub9_13_.aBoolean7074 = true;
								int i_14_ = node_sub9_13_.method2428();
								i_7_ += i_14_;
								if (node_sub45 != null) {
									node_sub45.anInt7552 += i_14_;
								}
								if (i_7_ >= anInt635) {
									break while_11_;
								}
								Node_Sub9 node_sub9_15_ = node_sub9_13_.method2429();
								if (node_sub9_15_ != null) {
									int i_16_ = node_sub9_13_.anInt7073;
									for (/**/; node_sub9_15_ != null; node_sub9_15_ = node_sub9_13_.method2431())
										method450(false, i_16_ * node_sub9_15_.method2432() >> 8, node_sub9_15_);
								}
								Node_Sub9 node_sub9_17_ = node_sub9_13_.aNode_Sub9_7072;
								node_sub9_13_.aNode_Sub9_7072 = null;
								if (node_sub9 == null) {
									aNode_Sub9Array659[i_10_] = node_sub9_17_;
								} else {
									node_sub9.aNode_Sub9_7072 = node_sub9_17_;
								}
								if (node_sub9_17_ == null) {
									aNode_Sub9Array652[i_10_] = node_sub9;
								}
								node_sub9_13_ = node_sub9_17_;
							}
						}
					}
					i_10_ += 4;
					i_11_++;
				}
				i_9_--;
			}
			for (int i_18_ = 0; i_18_ < 8; i_18_++) {
				Node_Sub9 node_sub9 = aNode_Sub9Array659[i_18_];
				aNode_Sub9Array659[i_18_] = aNode_Sub9Array652[i_18_] = null;
				Node_Sub9 node_sub9_19_;
				for (/**/; node_sub9 != null; node_sub9 = node_sub9_19_) {
					node_sub9_19_ = node_sub9.aNode_Sub9_7072;
					node_sub9.aNode_Sub9_7072 = null;
				}
			}
		}
		if (anInt655 < 0) {
			anInt655 = 0;
		}
		if (aNode_Sub9_650 != null) {
			aNode_Sub9_650.method2427(is, 0, i);
		}
		aLong641 = Class313.method3650(false);
	}
	
	void method455() {
		anInt646++;
	}
	
	public Class42() {
		aLong641 = Class313.method3650(false);
		aLong654 = 0L;
		anInt655 = 0;
		aNode_Sub9Array652 = new Node_Sub9[8];
		anInt658 = 0;
		anInt657 = 0;
		aLong660 = 0L;
		aBoolean656 = true;
		aNode_Sub9Array659 = new Node_Sub9[8];
		anInt661 = 0;
	}
}
