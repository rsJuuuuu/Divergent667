/* Class77 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class77
{
	static int anInt1016;
	static int anInt1017 = 1401;
	static long aLong1018;
	static int anInt1019;
	static int anInt1020;
	static int anInt1021;
	
	static final char method772(byte b, char c) {
		anInt1019++;
		@SuppressWarnings("unused")
		int i = -50 % ((-5 - b) / 54);
		int i_0_ = c;
	while_80_:
		do {
		while_79_:
			do {
			while_78_:
				do {
				while_77_:
					do {
					while_76_:
						do {
						while_75_:
							do {
							while_74_:
								do {
								while_73_:
									do {
									while_72_:
										do {
											do {
												if ((i_0_ ^ 0xffffffff) != -33 && (i_0_ ^ 0xffffffff) != -161 && i_0_ != 95 && i_0_ != 45) {
													if ((i_0_ ^ 0xffffffff) != -92 && (i_0_ ^ 0xffffffff) != -94 && i_0_ != 35) {
														if (i_0_ != 224 && i_0_ != 225 && (i_0_ ^ 0xffffffff) != -227 && (i_0_ ^ 0xffffffff) != -229 && i_0_ != 227 && (i_0_ ^ 0xffffffff) != -193 && (i_0_ ^ 0xffffffff) != -194 && i_0_ != 194 && (i_0_ ^ 0xffffffff) != -197 && (i_0_ ^ 0xffffffff) != -196) {
															if (i_0_ != 232 && i_0_ != 233 && i_0_ != 234 && (i_0_ ^ 0xffffffff) != -236 && (i_0_ ^ 0xffffffff) != -201 && i_0_ != 201 && i_0_ != 202 && i_0_ != 203) {
																if (i_0_ != 237 && (i_0_ ^ 0xffffffff) != -239 && (i_0_ ^ 0xffffffff) != -240 && (i_0_ ^ 0xffffffff) != -206 && i_0_ != 206 && i_0_ != 207) {
																	if (i_0_ != 242 && (i_0_ ^ 0xffffffff) != -244 && (i_0_ ^ 0xffffffff) != -245 && i_0_ != 246 && (i_0_ ^ 0xffffffff) != -246 && i_0_ != 210 && (i_0_ ^ 0xffffffff) != -212 && i_0_ != 212 && i_0_ != 214 && (i_0_ ^ 0xffffffff) != -214) {
																		if (i_0_ != 249 && (i_0_ ^ 0xffffffff) != -251 && (i_0_ ^ 0xffffffff) != -252 && (i_0_ ^ 0xffffffff) != -253 && (i_0_ ^ 0xffffffff) != -218 && (i_0_ ^ 0xffffffff) != -219 && i_0_ != 219 && i_0_ != 220) {
																			if ((i_0_ ^ 0xffffffff) != -232 && (i_0_ ^ 0xffffffff) != -200) {
																				if ((i_0_ ^ 0xffffffff) != -256 && i_0_ != 376) {
																					if (i_0_ != 241 && i_0_ != 209) {
																						if (i_0_ == 223) {
																							break while_79_;
																						}
																						break while_80_;
																					}
																				} else {
																					break while_77_;
																				}
																				break while_78_;
																			}
																		} else {
																			break while_75_;
																		}
																		break while_76_;
																	}
																} else {
																	break while_73_;
																}
																break while_74_;
															}
														} else {
															break;
														}
														break while_72_;
													}
												} else {
													return '_';
												}
												return c;
											} while (false);
											return 'a';
										} while (false);
										return 'e';
									} while (false);
									return 'i';
								} while (false);
								return 'o';
							} while (false);
							return 'u';
						} while (false);
						return 'c';
					} while (false);
					return 'y';
				} while (false);
				return 'n';
			} while (false);
			return 'b';
		} while (false);
		return Character.toLowerCase(c);
	}
	
	static final String method773(int i, int i_1_) {
		if (i != 225) {
			return null;
		}
		anInt1020++;
		Node_Sub3 node_sub3 = (Node_Sub3) Class56.aHashTable839.method1518(3512, (long) i_1_);
		if (node_sub3 != null) {
			Node_Sub25_Sub4 node_sub25_sub4 = node_sub3.aClass189_Sub1_6943.method1921(3455);
			if (node_sub25_sub4 != null) {
				double d = node_sub3.aClass189_Sub1_6943.method1928(i + -109);
				if ((double) node_sub25_sub4.method2678(i + 12967) <= d && d <= (double) node_sub25_sub4.method2683(-75)) {
					return node_sub25_sub4.method2682(110);
				}
			}
		}
		return null;
	}
	
	public static void method774(int i) {
		if (i != 194) {
			anInt1017 = -45;
		}
	}
	
	final int method775(int i, boolean bool, int i_2_) {
		if (bool != false) {
			method775(-98, false, 36);
		}
		anInt1016++;
		int i_3_ = (Class205.screenHeight ^ 0xffffffff) < (i ^ 0xffffffff) ? Class205.screenHeight : i;
		if (Animable_Sub4_Sub2.aClass77_10805 == this) {
			return 0;
		}
		if (Class260.aClass77_5225 == this) {
			return i_3_ + -i_2_;
		}
		if (Class67.aClass77_930 == this) {
			return (-i_2_ + i_3_) / 2;
		}
		return 0;
	}
	
	public final String toString() {
		anInt1021++;
		throw new IllegalStateException();
	}
}
