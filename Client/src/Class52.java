/* Class52 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

abstract class Class52
{
	static int anInt784;
	static int anInt785;
	static int anInt786;
	static int anInt787;
	static CacheNode_Sub13 aCacheNode_Sub13_788;
	private Class357 aClass357_789;
	static int anInt790;
	static int anInt791;
	static int anInt792;
	static int anInt793;
	static int anInt794;
	static int anInt795;
	static int anInt796;
	static int anInt797;
	static int anInt798;
	private GraphicsToolkit aGraphicsToolkit799;
	static int anInt800 = 0;
	static int anInt801;
	static int anInt802;
	static int anInt803;
	static int anInt804;
	static int anInt805;
	static int anInt806;
	
	final int method525(GLSprite[] glsprites, int i, int i_0_, int i_1_, int i_2_, String string, int[] is, int i_3_, Random random, int i_4_) {
		anInt792++;
		if (string == null) {
			return 0;
		}
		random.setSeed((long) i);
		int i_5_ = 192 - -(random.nextInt() & 0x1f);
		method534(1, i_5_ << 24 | i_0_ & 0xffffff, i_5_ << 24 | 0xffffff & i_3_);
		int i_6_ = string.length();
		int[] is_7_ = new int[i_6_];
		if (i_2_ != 8906) {
			method534(-14, -66, -70);
		}
		int i_8_ = 0;
		for (int i_9_ = 0; (i_6_ ^ 0xffffffff) < (i_9_ ^ 0xffffffff); i_9_++) {
			is_7_[i_9_] = i_8_;
			if ((0x3 & random.nextInt() ^ 0xffffffff) == -1) {
				i_8_++;
			}
		}
		method529(is_7_, string, i_1_, glsprites, i_4_, null, true, is);
		return i_8_;
	}
	
	abstract void method526(char c, int i, int i_10_, int i_11_, boolean bool, aa var_aa, int i_12_, int i_13_);
	
	final void method527(int i, int i_14_, int i_15_, int i_16_, int i_17_, String string, int i_18_, int i_19_) {
		anInt790++;
		if (string != null) {
			method534(i_19_ ^ ~0x42e, i_17_, i_18_);
			if (i_19_ != -1072) {
				aGraphicsToolkit799 = null;
			}
			double d = -((double) i / 8.0) + 7.0;
			if (d < 0.0) {
				d = 0.0;
			}
			int i_20_ = string.length();
			int[] is = new int[i_20_];
			for (int i_21_ = 0; i_20_ > i_21_; i_21_++)
				is[i_21_] = (int) (Math.sin((double) i_15_ + (double) i_21_ / 1.5) * d);
			method529(null, string, i_16_, null, -(aClass357_789.method4033((byte) -6, string) / 2) + i_14_, is, true, null);
		}
	}
	
	static final void method528(int i, int i_22_) {
		anInt793++;
		if (i != 255) {
			aCacheNode_Sub13_788 = null;
		}
		CacheNode_Sub2 cachenode_sub2 = Class320_Sub19.method3754(i ^ 0xfc, 4, (long) i_22_);
		cachenode_sub2.method2291((byte) 121);
	}
	
	private final void method529(int[] is, String string, int i, GLSprite[] glsprites, int i_23_, int[] is_24_, boolean bool, int[] is_25_) {
		i -= aClass357_789.anInt4430;
		anInt786++;
		int i_26_ = -1;
		int i_27_ = -1;
		int i_28_ = 0;
		int i_29_ = string.length();
		if (bool != true) {
			method532((byte) -47);
		}
		for (int i_30_ = 0; i_29_ > i_30_; i_30_++) {
			char c = (char) (Class26.method312(string.charAt(i_30_), (byte) -81) & 0xff);
			if (c == 60) {
				i_26_ = i_30_;
			} else {
				if (c == 62 && i_26_ != -1) {
					String string_31_ = string.substring(1 + i_26_, i_30_);
					i_26_ = -1;
					if (string_31_.equals("lt")) {
						c = '<';
					} else if (string_31_.equals("gt")) {
						c = '>';
					} else if (string_31_.equals("nbsp")) {
						c = '\u00a0';
					} else if (string_31_.equals("shy")) {
						c = '\u00ad';
					} else if (string_31_.equals("times")) {
						c = '\u00d7';
					} else if (!string_31_.equals("euro")) {
						if (string_31_.equals("copy")) {
							c = '\u00a9';
						} else {
							if (!string_31_.equals("reg")) {
								if (string_31_.startsWith("img=")) {
									try {
										int i_32_;
										if (is == null) {
											i_32_ = 0;
										} else {
											i_32_ = is[i_28_];
										}
										int i_33_;
										if (is_24_ == null) {
											i_33_ = 0;
										} else {
											i_33_ = is_24_[i_28_];
										}
										i_28_++;
										int i_34_ = Class350.method3998(string_31_.substring(4), -1);
										GLSprite glsprite = glsprites[i_34_];
										int i_35_ = is_25_ == null ? glsprite.method1186() : is_25_[i_34_];
										glsprite.method1191(i_32_ + i_23_, i_33_ + -i_35_ + (i + aClass357_789.anInt4430), 1, 0, 1);
										i_27_ = -1;
										i_23_ += glsprites[i_34_].method1197();
									} catch (Exception exception) {
										/* empty */
									}
								} else {
									method540(-119, string_31_);
								}
								continue;
							}
							c = '\u00ae';
						}
					} else {
						c = '\u20ac';
					}
				}
				if (i_26_ == -1) {
					if ((i_27_ ^ 0xffffffff) != 0) {
						i_23_ += aClass357_789.method4026(c, i_27_, 255);
					}
					int i_36_;
					if (is == null) {
						i_36_ = 0;
					} else {
						i_36_ = is[i_28_];
					}
					int i_37_;
					if (is_24_ == null) {
						i_37_ = 0;
					} else {
						i_37_ = is_24_[i_28_];
					}
					if (c != 32) {
						if ((CacheNode_Sub4.anInt9465 & ~0xffffff) != 0) {
							fa(c, 1 + i_23_ + i_36_, i_37_ + (i - -1), CacheNode_Sub4.anInt9465, true);
						}
						fa(c, i_23_ + i_36_, i_37_ + i, Class270_Sub2_Sub2.anInt10558, false);
					} else if (Class25.anInt446 > 0) {
						Class150_Sub3.anInt8970 += Class25.anInt446;
						i_23_ += Class150_Sub3.anInt8970 >> 8;
						Class150_Sub3.anInt8970 &= 0xff;
					}
					i_28_++;
					int i_38_ = aClass357_789.method4027(c, !bool);
					if ((Class339.anInt4204 ^ 0xffffffff) != 0) {
						aGraphicsToolkit799.method1242((int) (0.7 * (double) aClass357_789.anInt4430) + i, Class339.anInt4204, i_23_, false, i_38_);
					}
					if ((Class370.anInt4568 ^ 0xffffffff) != 0) {
						aGraphicsToolkit799.method1242(aClass357_789.anInt4430 + i, Class370.anInt4568, i_23_, false, i_38_);
					}
					i_23_ += i_38_;
					i_27_ = c;
				}
			}
		}
	}
	
	static final Node_Sub38 method530(int i, int i_39_) {
		anInt803++;
		int i_40_ = i;
	while_64_:
		do {
		while_63_:
			do {
			while_62_:
				do {
				while_61_:
					do {
					while_60_:
						do {
						while_59_:
							do {
							while_58_:
								do {
								while_57_:
									do {
									while_56_:
										do {
										while_55_:
											do {
											while_54_:
												do {
												while_53_:
													do {
													while_52_:
														do {
														while_51_:
															do {
															while_50_:
																do {
																while_49_:
																	do {
																	while_48_:
																		do {
																		while_47_:
																			do {
																			while_46_:
																				do {
																				while_45_:
																					do {
																					while_44_:
																						do {
																						while_43_:
																							do {
																							while_42_:
																								do {
																								while_41_:
																									do {
																									while_40_:
																										do {
																										while_39_:
																											do {
																											while_38_:
																												do {
																												while_37_:
																													do {
																													while_36_:
																														do {
																														while_35_:
																															do {
																															while_34_:
																																do {
																																while_33_:
																																	do {
																																	while_32_:
																																		do {
																																		while_31_:
																																			do {
																																			while_30_:
																																				do {
																																				while_29_:
																																					do {
																																					while_28_:
																																						do {
																																						while_27_:
																																							do {
																																								do {
																																									if ((i_40_ ^ 0xffffffff) != -1) {
																																										if (i_40_ != 1) {
																																											if (i_40_ != 2) {
																																												if ((i_40_ ^ 0xffffffff) != -4) {
																																													if (i_40_ != 4) {
																																														if (i_40_ != 5) {
																																															if ((i_40_ ^ 0xffffffff) != -7) {
																																																if (i_40_ != 7) {
																																																	if ((i_40_ ^ 0xffffffff) != -9) {
																																																		if ((i_40_ ^ 0xffffffff) != -10) {
																																																			if ((i_40_ ^ 0xffffffff) != -11) {
																																																				if (i_40_ != 11) {
																																																					if (i_40_ != 12) {
																																																						if (i_40_ != 13) {
																																																							if ((i_40_ ^ 0xffffffff) != -15) {
																																																								if (i_40_ != 15) {
																																																									if ((i_40_ ^ 0xffffffff) != -17) {
																																																										if ((i_40_ ^ 0xffffffff) != -18) {
																																																											if (i_40_ != 18) {
																																																												if (i_40_ != 19) {
																																																													if ((i_40_ ^ 0xffffffff) != -21) {
																																																														if ((i_40_ ^ 0xffffffff) != -22) {
																																																															if ((i_40_ ^ 0xffffffff) != -23) {
																																																																if ((i_40_ ^ 0xffffffff) != -24) {
																																																																	if ((i_40_ ^ 0xffffffff) != -25) {
																																																																		if (i_40_ != 25) {
																																																																			if (i_40_ != 26) {
																																																																				if ((i_40_ ^ 0xffffffff) != -28) {
																																																																					if ((i_40_ ^ 0xffffffff) != -29) {
																																																																						if ((i_40_ ^ 0xffffffff) != -30) {
																																																																							if ((i_40_ ^ 0xffffffff) != -31) {
																																																																								if (i_40_ != 31) {
																																																																									if (i_40_ != 32) {
																																																																										if ((i_40_ ^ 0xffffffff) != -34) {
																																																																											if ((i_40_ ^ 0xffffffff) != -35) {
																																																																												if (i_40_ != 35) {
																																																																													if ((i_40_ ^ 0xffffffff) != -37) {
																																																																														if (i_40_ != 37) {
																																																																															if (i_40_ != 38) {
																																																																																if (i_40_ != 39) {
																																																																																	break while_64_;
																																																																																}
																																																																															} else {
																																																																																break while_62_;
																																																																															}
																																																																															break while_63_;
																																																																														}
																																																																													} else {
																																																																														break while_60_;
																																																																													}
																																																																													break while_61_;
																																																																												}
																																																																											} else {
																																																																												break while_58_;
																																																																											}
																																																																											break while_59_;
																																																																										}
																																																																									} else {
																																																																										break while_56_;
																																																																									}
																																																																									break while_57_;
																																																																								}
																																																																							} else {
																																																																								break while_54_;
																																																																							}
																																																																							break while_55_;
																																																																						}
																																																																					} else {
																																																																						break while_52_;
																																																																					}
																																																																					break while_53_;
																																																																				}
																																																																			} else {
																																																																				break while_50_;
																																																																			}
																																																																			break while_51_;
																																																																		}
																																																																	} else {
																																																																		break while_48_;
																																																																	}
																																																																	break while_49_;
																																																																}
																																																															} else {
																																																																break while_46_;
																																																															}
																																																															break while_47_;
																																																														}
																																																													} else {
																																																														break while_44_;
																																																													}
																																																													break while_45_;
																																																												}
																																																											} else {
																																																												break while_42_;
																																																											}
																																																											break while_43_;
																																																										}
																																																									} else {
																																																										break while_40_;
																																																									}
																																																									break while_41_;
																																																								}
																																																							} else {
																																																								break while_38_;
																																																							}
																																																							break while_39_;
																																																						}
																																																					} else {
																																																						break while_36_;
																																																					}
																																																					break while_37_;
																																																				}
																																																			} else {
																																																				break while_34_;
																																																			}
																																																			break while_35_;
																																																		}
																																																	} else {
																																																		break while_32_;
																																																	}
																																																	break while_33_;
																																																}
																																															} else {
																																																break while_30_;
																																															}
																																															break while_31_;
																																														}
																																													} else {
																																														break while_28_;
																																													}
																																													break while_29_;
																																												}
																																											} else {
																																												break;
																																											}
																																											break while_27_;
																																										}
																																									} else {
																																										return new Node_Sub38_Sub17();
																																									}
																																									return new Node_Sub38_Sub26();
																																								} while (false);
																																								return new Node_Sub38_Sub33();
																																							} while (false);
																																							return new Node_Sub38_Sub25();
																																						} while (false);
																																						return new Node_Sub38_Sub11();
																																					} while (false);
																																					return new Node_Sub38_Sub12();
																																				} while (false);
																																				return new Node_Sub38_Sub35();
																																			} while (false);
																																			return new Node_Sub38_Sub18();
																																		} while (false);
																																		return new Node_Sub38_Sub37();
																																	} while (false);
																																	return new Node_Sub38_Sub38();
																																} while (false);
																																return new Node_Sub38_Sub14();
																															} while (false);
																															return new Node_Sub38_Sub3();
																														} while (false);
																														return new Node_Sub38_Sub4();
																													} while (false);
																													return new Node_Sub38_Sub34();
																												} while (false);
																												return new Node_Sub38_Sub29();
																											} while (false);
																											return new Node_Sub38_Sub23();
																										} while (false);
																										return new Node_Sub38_Sub39();
																									} while (false);
																									return new Node_Sub38_Sub9();
																								} while (false);
																								return new Node_Sub38_Sub8_Sub1();
																							} while (false);
																							return new Node_Sub38_Sub10();
																						} while (false);
																						return new Node_Sub38_Sub30();
																					} while (false);
																					return new Node_Sub38_Sub2();
																				} while (false);
																				return new Node_Sub38_Sub16();
																			} while (false);
																			return new Node_Sub38_Sub31();
																		} while (false);
																		return new Node_Sub38_Sub21();
																	} while (false);
																	return new Node_Sub38_Sub5();
																} while (false);
																return new Node_Sub38_Sub6();
															} while (false);
															return new Node_Sub38_Sub28();
														} while (false);
														return new Node_Sub38_Sub7();
													} while (false);
													return new Node_Sub38_Sub24();
												} while (false);
												return new Node_Sub38_Sub13();
											} while (false);
											return new Node_Sub38_Sub36();
										} while (false);
										return new Node_Sub38_Sub32();
									} while (false);
									return new Node_Sub38_Sub19();
								} while (false);
								return new Node_Sub38_Sub27();
							} while (false);
							return new Node_Sub38_Sub22();
						} while (false);
						return new Node_Sub38_Sub1();
					} while (false);
					return new Node_Sub38_Sub20();
				} while (false);
				return new Node_Sub38_Sub15();
			} while (false);
			return new Node_Sub38_Sub8();
		} while (false);
		i_40_ = 15 / ((-30 - i_39_) / 62);
		return null;
	}
	
	private final void method531(byte b, int i, String string) {
		anInt796++;
		int i_41_ = 0;
		boolean bool = false;
		int i_42_ = -117 % ((28 - b) / 37);
		for (int i_43_ = 0; (string.length() ^ 0xffffffff) < (i_43_ ^ 0xffffffff); i_43_++) {
			char c = string.charAt(i_43_);
			if (c == '<') {
				bool = true;
			} else if (c != '>') {
				if (!bool && c == ' ') {
					i_41_++;
				}
			} else {
				bool = false;
			}
		}
		if ((i_41_ ^ 0xffffffff) < -1) {
			Class25.anInt446 = (i - aClass357_789.method4033((byte) -6, string) << 8) / i_41_;
		}
	}
	
	public static void method532(byte b) {
		if (b > -65) {
			method532((byte) -3);
		}
		aCacheNode_Sub13_788 = null;
	}
	
	private final void method533(GLSprite[] glsprites, int i, int i_44_, String string, int i_45_, boolean bool, aa var_aa, int i_46_, int[] is) {
		i_46_ -= aClass357_789.anInt4430;
		anInt806++;
		int i_47_ = -1;
		if (bool == true) {
			int i_48_ = -1;
			int i_49_ = string.length();
			for (int i_50_ = 0; (i_49_ ^ 0xffffffff) < (i_50_ ^ 0xffffffff); i_50_++) {
				char c = (char) (0xff & Class26.method312(string.charAt(i_50_), (byte) -54));
				if (c == 60) {
					i_47_ = i_50_;
				} else {
					if (c == 62 && i_47_ != -1) {
						String string_51_ = string.substring(1 + i_47_, i_50_);
						i_47_ = -1;
						if (string_51_.equals("lt")) {
							c = '<';
						} else if (!string_51_.equals("gt")) {
							if (string_51_.equals("nbsp")) {
								c = '\u00a0';
							} else if (string_51_.equals("shy")) {
								c = '\u00ad';
							} else if (!string_51_.equals("times")) {
								if (!string_51_.equals("euro")) {
									if (string_51_.equals("copy")) {
										c = '\u00a9';
									} else {
										if (!string_51_.equals("reg")) {
											if (string_51_.startsWith("img=")) {
												try {
													int i_52_ = Class350.method3998(string_51_.substring(4), -1);
													GLSprite glsprite = glsprites[i_52_];
													int i_53_ = is != null ? is[i_52_] : glsprite.method1186();
													if ((Class270_Sub2_Sub2.anInt10558 & ~0xffffff ^ 0xffffffff) == 16777215) {
														glsprite.method1191(i_45_, -i_53_ + (aClass357_789.anInt4430 + i_46_), 1, 0, 1);
													} else {
														glsprite.method1191(i_45_, -i_53_ + i_46_ + aClass357_789.anInt4430, 0, Class270_Sub2_Sub2.anInt10558 & ~0xffffff | 0xffffff, 1);
													}
													i_48_ = -1;
													i_45_ += glsprites[i_52_].method1197();
												} catch (Exception exception) {
													/* empty */
												}
											} else {
												method540(-66, string_51_);
											}
											continue;
										}
										c = '\u00ae';
									}
								} else {
									c = '\u20ac';
								}
							} else {
								c = '\u00d7';
							}
						} else {
							c = '>';
						}
					}
					if (i_47_ == -1) {
						if (i_48_ != -1) {
							i_45_ += aClass357_789.method4026(c, i_48_, 255);
						}
						if ((c ^ 0xffffffff) == -33) {
							if (Class25.anInt446 > 0) {
								Class150_Sub3.anInt8970 += Class25.anInt446;
								i_45_ += Class150_Sub3.anInt8970 >> 8;
								Class150_Sub3.anInt8970 &= 0xff;
							}
						} else if (var_aa == null) {
							if ((CacheNode_Sub4.anInt9465 & ~0xffffff ^ 0xffffffff) != -1) {
								fa(c, 1 + i_45_, i_46_ - -1, CacheNode_Sub4.anInt9465, true);
							}
							fa(c, i_45_, i_46_, Class270_Sub2_Sub2.anInt10558, false);
						} else {
							if ((CacheNode_Sub4.anInt9465 & ~0xffffff) != 0) {
								method526(c, 1 + i_45_, i_46_ - -1, CacheNode_Sub4.anInt9465, true, var_aa, i_44_, i);
							}
							method526(c, i_45_, i_46_, Class270_Sub2_Sub2.anInt10558, false, var_aa, i_44_, i);
						}
						int i_54_ = aClass357_789.method4027(c, false);
						if ((Class339.anInt4204 ^ 0xffffffff) != 0) {
							aGraphicsToolkit799.method1242(i_46_ + (int) (0.7 * (double) aClass357_789.anInt4430), Class339.anInt4204, i_45_, false, i_54_);
						}
						if ((Class370.anInt4568 ^ 0xffffffff) != 0) {
							aGraphicsToolkit799.method1242(1 + (aClass357_789.anInt4430 + i_46_), Class370.anInt4568, i_45_, false, i_54_);
						}
						i_48_ = c;
						i_45_ += i_54_;
					}
				}
			}
		}
	}
	
	private final void method534(int i, int i_55_, int i_56_) {
		if (i != 1) {
			aCacheNode_Sub13_788 = null;
		}
		Class25.anInt446 = 0;
		Class270_Sub2_Sub2.anInt10558 = Node_Sub25_Sub4.anInt10011 = i_55_;
		anInt784++;
		Class150_Sub3.anInt8970 = 0;
		Class370.anInt4568 = -1;
		Class339.anInt4204 = -1;
		if (i_56_ == -1) {
			i_56_ = 0;
		}
		CacheNode_Sub4.anInt9465 = Node_Sub25_Sub4.anInt10009 = i_56_;
	}
	
	final int method535(int i, int[] is, int i_57_, String string, aa var_aa, GLSprite[] glsprites, int i_58_, int i_59_, int i_60_, int i_61_, int i_62_, int i_63_, int i_64_, int i_65_, int i_66_, int i_67_) {
		anInt798++;
		if (i_60_ <= 70) {
			method536(98, 77, -16, null, 105, 89, null, null);
		}
		return method539(i_64_, 2, i_57_, i_59_, glsprites, 0, i, i_58_, i_67_, i_61_, var_aa, i_65_, i_66_, i_63_, i_62_, is, string);
	}
	
	abstract void fa(char c, int i, int i_68_, int i_69_, boolean bool);
	
	final void method536(int i, int i_70_, int i_71_, String string, int i_72_, int i_73_, GLSprite[] glsprites, int[] is) {
		if (i_72_ == -238946248) {
			anInt794++;
			if (string != null) {
				method534(1, i, i_70_);
				method533(glsprites, 0, 0, string, i_73_, true, null, i_71_, is);
			}
		}
	}
	
	final void method537(int i, byte b, int i_74_, String string, int i_75_, int i_76_) {
		if (b >= 95) {
			anInt785++;
			if (string != null) {
				method534(1, i_76_, i);
				method533(null, 0, 0, string, -(aClass357_789.method4033((byte) -6, string) / 2) + i_74_, true, null, i_75_, null);
			}
		}
	}
	
	final void method538(int i, int i_77_, String string, int i_78_, int i_79_, int i_80_) {
		anInt804++;
		if (string != null) {
			method534(i_79_, i_80_, i_78_);
			method533(null, 0, 0, string, i, true, null, i_77_, null);
		}
	}
	
	final int method539(int i, int i_81_, int i_82_, int i_83_, GLSprite[] glsprites, int i_84_, int i_85_, int i_86_, int i_87_, int i_88_, aa var_aa, int i_89_, int i_90_, int i_91_, int i_92_, int[] is, String string) {
		anInt795++;
		if (string == null) {
			return 0;
		}
		if (i_81_ != 2) {
			method539(-69, 108, -103, 49, null, 53, -66, 62, 11, 81, null, -110, -87, -20, 114, null, null);
		}
		method534(1, i_82_, i_83_);
		if ((i_89_ ^ 0xffffffff) == -1) {
			i_89_ = aClass357_789.anInt4430;
		}
		int[] is_93_;
		if ((i_89_ + (aClass357_789.anInt4442 + aClass357_789.anInt4434) ^ 0xffffffff) >= (i_87_ ^ 0xffffffff) || (i_87_ ^ 0xffffffff) <= (i_89_ - -i_89_ ^ 0xffffffff)) {
			is_93_ = new int[] { i_90_ };
		} else {
			is_93_ = null;
		}
		int i_94_ = aClass357_789.method4029(Class9.aStringArray167, is_93_, -78, glsprites, string);
		if ((i_84_ ^ 0xffffffff) == 0) {
			i_84_ = i_87_ / i_89_;
			if ((i_84_ ^ 0xffffffff) >= -1) {
				i_84_ = 1;
			}
		}
		if ((i_84_ ^ 0xffffffff) < -1 && (i_84_ ^ 0xffffffff) >= (i_94_ ^ 0xffffffff)) {
			i_94_ = i_84_;
			Class9.aStringArray167[i_84_ - 1] = aClass357_789.method4032(Class9.aStringArray167[i_84_ + -1], glsprites, i_90_, i_81_ + -3);
		}
		if (i == 3 && i_94_ == 1) {
			i = 1;
		}
		int i_95_;
		if ((i ^ 0xffffffff) != -1) {
			if ((i ^ 0xffffffff) == -2) {
				i_95_ = (-aClass357_789.anInt4442 + -aClass357_789.anInt4434 + (i_87_ - i_89_ * (-1 + i_94_))) / 2 + aClass357_789.anInt4434 + i_86_;
			} else if (i == 2) {
				i_95_ = -(i_89_ * (i_94_ - 1)) + (-aClass357_789.anInt4442 + (i_87_ + i_86_));
			} else {
				int i_96_ = (-aClass357_789.anInt4434 + i_87_ + -aClass357_789.anInt4442 - i_89_ * (i_94_ - 1)) / (1 + i_94_);
				if ((i_96_ ^ 0xffffffff) > -1) {
					i_96_ = 0;
				}
				i_89_ += i_96_;
				i_95_ = i_86_ + (aClass357_789.anInt4434 - -i_96_);
			}
		} else {
			i_95_ = aClass357_789.anInt4434 + i_86_;
		}
		for (int i_97_ = 0; (i_94_ ^ 0xffffffff) < (i_97_ ^ 0xffffffff); i_97_++) {
			if ((i_92_ ^ 0xffffffff) != -1) {
				if (i_92_ != 1) {
					if ((i_92_ ^ 0xffffffff) == -3) {
						method533(glsprites, i_85_, i_88_, Class9.aStringArray167[i_97_], i_91_ + (i_90_ + -aClass357_789.method4033((byte) -6, Class9.aStringArray167[i_97_])), true, var_aa, i_95_, is);
					} else if (i_94_ - 1 == i_97_) {
						method533(glsprites, i_85_, i_88_, Class9.aStringArray167[i_97_], i_91_, true, var_aa, i_95_, is);
					} else {
						method531((byte) 93, i_90_, Class9.aStringArray167[i_97_]);
						method533(glsprites, i_85_, i_88_, Class9.aStringArray167[i_97_], i_91_, true, var_aa, i_95_, is);
						Class25.anInt446 = 0;
					}
				} else {
					method533(glsprites, i_85_, i_88_, Class9.aStringArray167[i_97_], i_91_ - -((i_90_ - aClass357_789.method4033((byte) -6, Class9.aStringArray167[i_97_])) / 2), true, var_aa, i_95_, is);
				}
			} else {
				method533(glsprites, i_85_, i_88_, Class9.aStringArray167[i_97_], i_91_, true, var_aa, i_95_, is);
			}
			i_95_ += i_89_;
		}
		return i_94_;
	}
	
	private final void method540(int i, String string) {
		try {
			if (string.startsWith("col=")) {
				Class270_Sub2_Sub2.anInt10558 = Class270_Sub2_Sub2.anInt10558 & ~0xffffff | Class10.method187(string.substring(4), 16, true) & 0xffffff;
			} else if (string.equals("/col")) {
				Class270_Sub2_Sub2.anInt10558 = Class270_Sub2_Sub2.anInt10558 & ~0xffffff | Node_Sub25_Sub4.anInt10011 & 0xffffff;
			}
			if (!string.startsWith("argb=")) {
				if (string.equals("/argb")) {
					Class270_Sub2_Sub2.anInt10558 = Node_Sub25_Sub4.anInt10011;
				} else if (!string.startsWith("str=")) {
					if (string.equals("str")) {
						Class339.anInt4204 = Class270_Sub2_Sub2.anInt10558 & ~0xffffff | 0x800000;
					} else if (!string.equals("/str")) {
						if (!string.startsWith("u=")) {
							if (string.equals("u")) {
								Class370.anInt4568 = Class270_Sub2_Sub2.anInt10558 & ~0xffffff;
							} else if (!string.equals("/u")) {
								if (!string.equalsIgnoreCase("shad=-1")) {
									if (string.startsWith("shad=")) {
										CacheNode_Sub4.anInt9465 = Class270_Sub2_Sub2.anInt10558 & ~0xffffff | Class10.method187(string.substring(5), 16, true);
									} else if (string.equals("shad")) {
										CacheNode_Sub4.anInt9465 = ~0xffffff & Class270_Sub2_Sub2.anInt10558;
									} else if (string.equals("/shad")) {
										CacheNode_Sub4.anInt9465 = Node_Sub25_Sub4.anInt10009;
									} else if (string.equals("br")) {
										method534(1, Node_Sub25_Sub4.anInt10011, Node_Sub25_Sub4.anInt10009);
									}
								} else {
									CacheNode_Sub4.anInt9465 = 0;
								}
							} else {
								Class370.anInt4568 = -1;
							}
						} else {
							Class370.anInt4568 = ~0xffffff & Class270_Sub2_Sub2.anInt10558 | Class10.method187(string.substring(2), 16, true);
						}
					} else {
						Class339.anInt4204 = -1;
					}
				} else {
					Class339.anInt4204 = ~0xffffff & Class270_Sub2_Sub2.anInt10558 | Class10.method187(string.substring(4), 16, true);
				}
			} else {
				Class270_Sub2_Sub2.anInt10558 = Class10.method187(string.substring(5), 16, true);
			}
		} catch (Exception exception) {
			/* empty */
		}
		anInt797++;
		if (i >= -23) {
			method536(-98, 105, -36, null, 25, 51, null, null);
		}
	}
	
	final void method541(int i, int i_98_, String string, int i_99_, int i_100_, int i_101_, int i_102_) {
		anInt805++;
		if (string != null) {
			method534(1, i_100_, i);
			int i_103_ = string.length();
			int[] is = new int[i_103_];
			int[] is_104_ = new int[i_103_];
			if (i_102_ == 16777215) {
				for (int i_105_ = 0; (i_103_ ^ 0xffffffff) < (i_105_ ^ 0xffffffff); i_105_++) {
					is[i_105_] = (int) (5.0 * Math.sin((double) i_105_ / 5.0 + (double) i_98_ / 5.0));
					is_104_[i_105_] = (int) (5.0 * Math.sin((double) i_105_ / 3.0 + (double) i_98_ / 5.0));
				}
				method529(is, string, i_101_, null, -(aClass357_789.method4033((byte) -6, string) / 2) + i_99_, is_104_, true, null);
			}
		}
	}
	
	final void method542(int i, int i_106_, int i_107_, String string, int i_108_, int i_109_, int i_110_) {
		anInt787++;
		if (string != null) {
			method534(1, i_106_, i_110_);
			int i_111_ = string.length();
			if (i == 5) {
				int[] is = new int[i_111_];
				for (int i_112_ = 0; i_111_ > i_112_; i_112_++)
					is[i_112_] = (int) (5.0 * Math.sin((double) i_112_ / 2.0 + (double) i_107_ / 5.0));
				method529(null, string, i_109_, null, i_108_ - aClass357_789.method4033((byte) -6, string) / 2, is, true, null);
			}
		}
	}
	
	final void method543(byte b, int i, String string, int i_113_, int i_114_, int i_115_) {
		anInt802++;
		int i_116_ = -65 % ((43 - b) / 37);
		if (string != null) {
			method534(1, i_113_, i_114_);
			method533(null, 0, 0, string, i + -aClass357_789.method4033((byte) -6, string), true, null, i_115_, null);
		}
	}
	
	static final void method544(int i, int i_117_, int i_118_, int i_119_, byte b) {
		anInt791++;
		za_Sub2.anInt10513 = i_118_;
		Node_Sub25_Sub1.anInt9936 = i;
		if (b >= -124) {
			method528(89, -7);
		}
		Class262_Sub4.anInt7722 = i_117_;
		Class384.anInt4906 = i_119_;
	}
	
	final int method545(int[] is, int i, int i_120_, int i_121_, int[] is_122_, int i_123_, int i_124_, Random random, String string, int i_125_, int i_126_, GLSprite[] glsprites, int i_127_, int i_128_, int i_129_) {
		anInt801++;
		if (string == null) {
			return 0;
		}
		random.setSeed((long) i_127_);
		int i_130_ = 192 + (0x1f & random.nextInt());
		method534(1, i_130_ << 24 | 0xffffff & i_123_, i_130_ << 24 | i_126_ & 0xffffff);
		int i_131_ = string.length();
		int[] is_132_ = new int[i_131_];
		int i_133_ = i_121_;
		for (int i_134_ = 0; (i_131_ ^ 0xffffffff) < (i_134_ ^ 0xffffffff); i_134_++) {
			is_132_[i_134_] = i_133_;
			if ((0x3 & random.nextInt()) == 0) {
				i_133_++;
			}
		}
		int i_135_ = i_125_;
		int i_136_ = aClass357_789.anInt4434 + i_128_;
		if (i_129_ != 1) {
			if (i_129_ == 2) {
				i_136_ = i_128_ + i_124_ + -aClass357_789.anInt4442;
			}
		} else {
			i_136_ += (-aClass357_789.anInt4434 + i_124_ + -aClass357_789.anInt4442) / 2;
		}
		int i_137_ = -1;
		if ((i ^ 0xffffffff) != -2) {
			if (i == 2) {
				i_137_ = i_133_ + aClass357_789.method4033((byte) -6, string);
				i_135_ += i_120_ - i_137_;
			}
		} else {
			i_137_ = i_133_ + aClass357_789.method4033((byte) -6, string);
			i_135_ += (-i_137_ + i_120_) / 2;
		}
		method529(is_132_, string, i_136_, glsprites, i_135_, null, true, is_122_);
		if (is != null) {
			if ((i_137_ ^ 0xffffffff) == 0) {
				i_137_ = i_133_ + aClass357_789.method4033((byte) -6, string);
			}
			is[3] = aClass357_789.anInt4442 + aClass357_789.anInt4434;
			is[0] = i_135_;
			is[2] = i_137_;
			is[1] = -aClass357_789.anInt4434 + i_136_;
		}
		return i_133_;
	}
	
	Class52(GraphicsToolkit graphicstoolkit, Class357 class357) {
		aGraphicsToolkit799 = graphicstoolkit;
		aClass357_789 = class357;
	}
}
