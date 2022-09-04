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
												if (i_0_ != 32 && i_0_ != 160 && i_0_ != 95 && i_0_ != 45) {
													if (i_0_ != 91 && i_0_ != 93 && i_0_ != 35) {
														if (i_0_ != 224 && i_0_ != 225 && i_0_ != 226 && i_0_ != 228 && i_0_ != 227 && i_0_ != 192 && i_0_ != 193 && i_0_ != 194 && i_0_ != 196 && i_0_ != 195) {
															if (i_0_ != 232 && i_0_ != 233 && i_0_ != 234 && i_0_ != 235 && i_0_ != 200 && i_0_ != 201 && i_0_ != 202 && i_0_ != 203) {
																if (i_0_ != 237 && i_0_ != 238 && i_0_ != 239 && i_0_ != 205 && i_0_ != 206 && i_0_ != 207) {
																	if (i_0_ != 242 && i_0_ != 243 && i_0_ != 244 && i_0_ != 246 && i_0_ != 245 && i_0_ != 210 && i_0_ != 211 && i_0_ != 212 && i_0_ != 214 && i_0_ != 213) {
																		if (i_0_ != 249 && i_0_ != 250 && i_0_ != 251 && i_0_ != 252 && i_0_ != 217 && i_0_ != 218 && i_0_ != 219 && i_0_ != 220) {
																			if (i_0_ != 231 && i_0_ != 199) {
																				if (i_0_ == 255 || i_0_ == 376) {
																					break while_77_;
																				} else if (i_0_ != 241 && i_0_ != 209) {
																					if (i_0_ == 223) {
																						break while_79_;
																					}
																					break while_80_;
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
		int i_3_ = i < Class205.screenHeight ? Class205.screenHeight : i;
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
