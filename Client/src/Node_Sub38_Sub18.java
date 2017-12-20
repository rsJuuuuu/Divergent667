/* Node_Sub38_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Node_Sub38_Sub18 extends Node_Sub38
{
	static int anInt10275;
	static int anInt10276;
	static IncommingPacket aClass192_10277 = new IncommingPacket(121, 6);
	private int anInt10278 = 6;
	static int anInt10279;
	static int anInt10280;
	static int anInt10281;
	static boolean aBoolean10282 = false;
	static String aString10283 = null;
	
	final void method2780(boolean bool, BufferedStream buffer, int i) {
		anInt10281++;
		int i_0_ = i;
		do {
			if (i_0_ != 0) {
				if ((i_0_ ^ 0xffffffff) != -2) {
					break;
				}
			} else {
				anInt10278 = buffer.readUnsignedByte();
				break;
			}
			aBoolean7463 = (buffer.readUnsignedByte() ^ 0xffffffff) == -2;
		} while (false);
		if (bool != false) {
			aClass192_10277 = null;
		}
	}
	
	final int[] method2775(int i, int i_1_) {
		anInt10276++;
		int[] is = aClass146_7460.method1645(27356, i_1_);
		if (i <= 107) {
			aString10283 = null;
		}
	while_170_:
		do {
			if (aClass146_7460.aBoolean1819) {
				int[] is_2_ = this.method2786(i_1_, 0, 0);
				int[] is_3_ = this.method2786(i_1_, 0, 1);
				int i_4_ = anInt10278;
			while_169_:
				do {
				while_168_:
					do {
					while_167_:
						do {
						while_166_:
							do {
							while_165_:
								do {
								while_164_:
									do {
									while_163_:
										do {
										while_162_:
											do {
											while_161_:
												do {
													do {
														if (i_4_ != 1) {
															if ((i_4_ ^ 0xffffffff) != -3) {
																if (i_4_ != 3) {
																	if (i_4_ != 4) {
																		if (i_4_ != 5) {
																			if (i_4_ != 6) {
																				if ((i_4_ ^ 0xffffffff) != -8) {
																					if ((i_4_ ^ 0xffffffff) != -9) {
																						if (i_4_ != 9) {
																							if (i_4_ != 10) {
																								if ((i_4_ ^ 0xffffffff) != -12) {
																									if ((i_4_ ^ 0xffffffff) != -13) {
																										break while_170_;
																									}
																								} else {
																									break while_168_;
																								}
																								break while_169_;
																							}
																						} else {
																							break while_166_;
																						}
																						break while_167_;
																					}
																				} else {
																					break while_164_;
																				}
																				break while_165_;
																			}
																		} else {
																			break while_162_;
																		}
																		break while_163_;
																	}
																} else {
																	break;
																}
																break while_161_;
															}
														} else {
															for (i_4_ = 0; (i_4_ ^ 0xffffffff) > (Class339_Sub7.anInt8728 ^ 0xffffffff); i_4_++)
																is[i_4_] = is_2_[i_4_] - -is_3_[i_4_];
															break while_170_;
														}
														for (i_4_ = 0; Class339_Sub7.anInt8728 > i_4_; i_4_++)
															is[i_4_] = is_2_[i_4_] - is_3_[i_4_];
														break while_170_;
													} while (false);
													for (i_4_ = 0; Class339_Sub7.anInt8728 > i_4_; i_4_++)
														is[i_4_] = is_3_[i_4_] * is_2_[i_4_] >> 12;
													break while_170_;
												} while (false);
												for (i_4_ = 0; (i_4_ ^ 0xffffffff) > (Class339_Sub7.anInt8728 ^ 0xffffffff); i_4_++) {
													int i_5_ = is_3_[i_4_];
													is[i_4_] = i_5_ == 0 ? 4096 : (is_2_[i_4_] << 12) / i_5_;
												}
												break while_170_;
											} while (false);
											for (i_4_ = 0; (i_4_ ^ 0xffffffff) > (Class339_Sub7.anInt8728 ^ 0xffffffff); i_4_++)
												is[i_4_] = -((4096 + -is_3_[i_4_]) * (-is_2_[i_4_] + 4096) >> 12) + 4096;
											break while_170_;
										} while (false);
										for (i_4_ = 0; (i_4_ ^ 0xffffffff) > (Class339_Sub7.anInt8728 ^ 0xffffffff); i_4_++) {
											int i_6_ = is_3_[i_4_];
											is[i_4_] = (i_6_ ^ 0xffffffff) > -2049 ? i_6_ * is_2_[i_4_] >> 11 : 4096 - ((-i_6_ + 4096) * (-is_2_[i_4_] + 4096) >> 11);
										}
										break while_170_;
									} while (false);
									for (i_4_ = 0; Class339_Sub7.anInt8728 > i_4_; i_4_++) {
										int i_7_ = is_2_[i_4_];
										is[i_4_] = i_7_ == 4096 ? 4096 : (is_3_[i_4_] << 12) / (4096 + -i_7_);
									}
									break while_170_;
								} while (false);
								for (i_4_ = 0; i_4_ < Class339_Sub7.anInt8728; i_4_++) {
									int i_8_ = is_2_[i_4_];
									is[i_4_] = (i_8_ ^ 0xffffffff) == -1 ? 0 : 4096 - (4096 + -is_3_[i_4_] << 12) / i_8_;
								}
								break while_170_;
							} while (false);
							for (i_4_ = 0; (i_4_ ^ 0xffffffff) > (Class339_Sub7.anInt8728 ^ 0xffffffff); i_4_++) {
								int i_9_ = is_2_[i_4_];
								int i_10_ = is_3_[i_4_];
								is[i_4_] = (i_10_ ^ 0xffffffff) < (i_9_ ^ 0xffffffff) ? i_9_ : i_10_;
							}
							break while_170_;
						} while (false);
						for (i_4_ = 0; (Class339_Sub7.anInt8728 ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++) {
							int i_11_ = is_3_[i_4_];
							int i_12_ = is_2_[i_4_];
							is[i_4_] = (i_11_ ^ 0xffffffff) > (i_12_ ^ 0xffffffff) ? i_12_ : i_11_;
						}
						break while_170_;
					} while (false);
					for (i_4_ = 0; Class339_Sub7.anInt8728 > i_4_; i_4_++) {
						int i_13_ = is_2_[i_4_];
						int i_14_ = is_3_[i_4_];
						is[i_4_] = i_14_ < i_13_ ? -i_14_ + i_13_ : -i_13_ + i_14_;
					}
					break while_170_;
				} while (false);
				for (i_4_ = 0; (i_4_ ^ 0xffffffff) > (Class339_Sub7.anInt8728 ^ 0xffffffff); i_4_++) {
					int i_15_ = is_3_[i_4_];
					int i_16_ = is_2_[i_4_];
					is[i_4_] = i_16_ + (i_15_ + -(i_16_ * i_15_ >> 11));
				}
			}
		} while (false);
		return is;
	}
	
	final int[][] method2778(int i, boolean bool) {
		anInt10279++;
		int[][] is = aClass348_7454.method3981(i, 3168);
		if (bool != true) {
			method2844(-73, true);
		}
	while_180_:
		do {
			if (aClass348_7454.aBoolean4300) {
				int[][] is_17_ = this.method2777(-100, 0, i);
				int[][] is_18_ = this.method2777(-124, 1, i);
				int[] is_19_ = is[0];
				int[] is_20_ = is[1];
				int[] is_21_ = is[2];
				int[] is_22_ = is_17_[0];
				int[] is_23_ = is_17_[1];
				int[] is_24_ = is_17_[2];
				int[] is_25_ = is_18_[0];
				int[] is_26_ = is_18_[1];
				int[] is_27_ = is_18_[2];
				int i_28_ = anInt10278;
			while_179_:
				do {
				while_178_:
					do {
					while_177_:
						do {
						while_176_:
							do {
							while_175_:
								do {
								while_174_:
									do {
									while_173_:
										do {
										while_172_:
											do {
											while_171_:
												do {
													do {
														if (i_28_ != 1) {
															if ((i_28_ ^ 0xffffffff) != -3) {
																if (i_28_ != 3) {
																	if ((i_28_ ^ 0xffffffff) != -5) {
																		if (i_28_ != 5) {
																			if (i_28_ != 6) {
																				if ((i_28_ ^ 0xffffffff) != -8) {
																					if (i_28_ != 8) {
																						if ((i_28_ ^ 0xffffffff) != -10) {
																							if ((i_28_ ^ 0xffffffff) != -11) {
																								if ((i_28_ ^ 0xffffffff) != -12) {
																									if (i_28_ != 12) {
																										break while_180_;
																									}
																								} else {
																									break while_178_;
																								}
																								break while_179_;
																							}
																						} else {
																							break while_176_;
																						}
																						break while_177_;
																					}
																				} else {
																					break while_174_;
																				}
																				break while_175_;
																			}
																		} else {
																			break while_172_;
																		}
																		break while_173_;
																	}
																} else {
																	break;
																}
																break while_171_;
															}
														} else {
															for (i_28_ = 0; Class339_Sub7.anInt8728 > i_28_; i_28_++) {
																is_19_[i_28_] = is_25_[i_28_] + is_22_[i_28_];
																is_20_[i_28_] = is_23_[i_28_] - -is_26_[i_28_];
																is_21_[i_28_] = is_27_[i_28_] + is_24_[i_28_];
															}
															break while_180_;
														}
														for (i_28_ = 0; (Class339_Sub7.anInt8728 ^ 0xffffffff) < (i_28_ ^ 0xffffffff); i_28_++) {
															is_19_[i_28_] = -is_25_[i_28_] + is_22_[i_28_];
															is_20_[i_28_] = -is_26_[i_28_] + is_23_[i_28_];
															is_21_[i_28_] = -is_27_[i_28_] + is_24_[i_28_];
														}
														break while_180_;
													} while (false);
													for (i_28_ = 0; i_28_ < Class339_Sub7.anInt8728; i_28_++) {
														is_19_[i_28_] = is_22_[i_28_] * is_25_[i_28_] >> 12;
														is_20_[i_28_] = is_26_[i_28_] * is_23_[i_28_] >> 12;
														is_21_[i_28_] = is_27_[i_28_] * is_24_[i_28_] >> 12;
													}
													break while_180_;
												} while (false);
												for (i_28_ = 0; i_28_ < Class339_Sub7.anInt8728; i_28_++) {
													int i_29_ = is_26_[i_28_];
													int i_30_ = is_27_[i_28_];
													int i_31_ = is_25_[i_28_];
													is_19_[i_28_] = i_31_ != 0 ? (is_22_[i_28_] << 12) / i_31_ : 4096;
													is_20_[i_28_] = i_29_ != 0 ? (is_23_[i_28_] << 12) / i_29_ : 4096;
													is_21_[i_28_] = i_30_ != 0 ? (is_24_[i_28_] << 12) / i_30_ : 4096;
												}
												break while_180_;
											} while (false);
											for (i_28_ = 0; i_28_ < Class339_Sub7.anInt8728; i_28_++) {
												is_19_[i_28_] = -((4096 - is_25_[i_28_]) * (-is_22_[i_28_] + 4096) >> 12) + 4096;
												is_20_[i_28_] = -((4096 - is_26_[i_28_]) * (4096 - is_23_[i_28_]) >> 12) + 4096;
												is_21_[i_28_] = 4096 + -((-is_24_[i_28_] + 4096) * (-is_27_[i_28_] + 4096) >> 12);
											}
											break while_180_;
										} while (false);
										for (i_28_ = 0; Class339_Sub7.anInt8728 > i_28_; i_28_++) {
											int i_32_ = is_25_[i_28_];
											int i_33_ = is_27_[i_28_];
											int i_34_ = is_26_[i_28_];
											is_19_[i_28_] = i_32_ >= 2048 ? -((-i_32_ + 4096) * (4096 + -is_22_[i_28_]) >> 11) + 4096 : i_32_ * is_22_[i_28_] >> 11;
											is_20_[i_28_] = i_34_ < 2048 ? is_23_[i_28_] * i_34_ >> 11 : -((-i_34_ + 4096) * (-is_23_[i_28_] + 4096) >> 11) + 4096;
											is_21_[i_28_] = (i_33_ ^ 0xffffffff) <= -2049 ? -((4096 - i_33_) * (4096 + -is_24_[i_28_]) >> 11) + 4096 : i_33_ * is_24_[i_28_] >> 11;
										}
										break while_180_;
									} while (false);
									for (i_28_ = 0; i_28_ < Class339_Sub7.anInt8728; i_28_++) {
										int i_35_ = is_24_[i_28_];
										int i_36_ = is_23_[i_28_];
										int i_37_ = is_22_[i_28_];
										is_19_[i_28_] = (i_37_ ^ 0xffffffff) != -4097 ? (is_25_[i_28_] << 12) / (4096 + -i_37_) : 4096;
										is_20_[i_28_] = i_36_ == 4096 ? 4096 : (is_26_[i_28_] << 12) / (4096 - i_36_);
										is_21_[i_28_] = (i_35_ ^ 0xffffffff) == -4097 ? 4096 : (is_27_[i_28_] << 12) / (4096 - i_35_);
									}
									break while_180_;
								} while (false);
								for (i_28_ = 0; (i_28_ ^ 0xffffffff) > (Class339_Sub7.anInt8728 ^ 0xffffffff); i_28_++) {
									int i_38_ = is_24_[i_28_];
									int i_39_ = is_22_[i_28_];
									int i_40_ = is_23_[i_28_];
									is_19_[i_28_] = i_39_ == 0 ? 0 : -((-is_25_[i_28_] + 4096 << 12) / i_39_) + 4096;
									is_20_[i_28_] = (i_40_ ^ 0xffffffff) != -1 ? 4096 + -((-is_26_[i_28_] + 4096 << 12) / i_40_) : 0;
									is_21_[i_28_] = (i_38_ ^ 0xffffffff) != -1 ? -((4096 + -is_27_[i_28_] << 12) / i_38_) + 4096 : 0;
								}
								break while_180_;
							} while (false);
							for (i_28_ = 0; (Class339_Sub7.anInt8728 ^ 0xffffffff) < (i_28_ ^ 0xffffffff); i_28_++) {
								int i_41_ = is_23_[i_28_];
								int i_42_ = is_26_[i_28_];
								int i_43_ = is_24_[i_28_];
								int i_44_ = is_25_[i_28_];
								int i_45_ = is_22_[i_28_];
								int i_46_ = is_27_[i_28_];
								is_19_[i_28_] = i_44_ > i_45_ ? i_45_ : i_44_;
								is_20_[i_28_] = i_42_ <= i_41_ ? i_42_ : i_41_;
								is_21_[i_28_] = i_46_ <= i_43_ ? i_46_ : i_43_;
							}
							break while_180_;
						} while (false);
						for (i_28_ = 0; Class339_Sub7.anInt8728 > i_28_; i_28_++) {
							int i_47_ = is_27_[i_28_];
							int i_48_ = is_22_[i_28_];
							int i_49_ = is_26_[i_28_];
							int i_50_ = is_25_[i_28_];
							int i_51_ = is_24_[i_28_];
							int i_52_ = is_23_[i_28_];
							is_19_[i_28_] = (i_48_ ^ 0xffffffff) < (i_50_ ^ 0xffffffff) ? i_48_ : i_50_;
							is_20_[i_28_] = (i_49_ ^ 0xffffffff) > (i_52_ ^ 0xffffffff) ? i_52_ : i_49_;
							is_21_[i_28_] = i_51_ <= i_47_ ? i_47_ : i_51_;
						}
						break while_180_;
					} while (false);
					for (i_28_ = 0; i_28_ < Class339_Sub7.anInt8728; i_28_++) {
						int i_53_ = is_25_[i_28_];
						int i_54_ = is_23_[i_28_];
						int i_55_ = is_26_[i_28_];
						int i_56_ = is_24_[i_28_];
						int i_57_ = is_22_[i_28_];
						int i_58_ = is_27_[i_28_];
						is_19_[i_28_] = i_53_ < i_57_ ? i_57_ + -i_53_ : i_53_ - i_57_;
						is_20_[i_28_] = i_55_ >= i_54_ ? i_55_ - i_54_ : i_54_ + -i_55_;
						is_21_[i_28_] = (i_56_ ^ 0xffffffff) >= (i_58_ ^ 0xffffffff) ? i_58_ - i_56_ : i_56_ - i_58_;
					}
					break while_180_;
				} while (false);
				for (i_28_ = 0; (i_28_ ^ 0xffffffff) > (Class339_Sub7.anInt8728 ^ 0xffffffff); i_28_++) {
					int i_59_ = is_23_[i_28_];
					int i_60_ = is_26_[i_28_];
					int i_61_ = is_27_[i_28_];
					int i_62_ = is_22_[i_28_];
					int i_63_ = is_24_[i_28_];
					int i_64_ = is_25_[i_28_];
					is_19_[i_28_] = -(i_62_ * i_64_ >> 11) + i_64_ + i_62_;
					is_20_[i_28_] = -(i_60_ * i_59_ >> 11) + (i_59_ + i_60_);
					is_21_[i_28_] = i_61_ + i_63_ - (i_61_ * i_63_ >> 11);
				}
			}
		} while (false);
		return is;
	}
	
	static final boolean method2844(int i, boolean bool) {
		if (bool != true) {
			method2844(-113, false);
		}
		anInt10280++;
        return !(i < 12 || i > 17);
    }
	
	public static void method2845(byte b) {
		if (b <= 121) {
			aClass192_10277 = null;
		}
		aString10283 = null;
		aClass192_10277 = null;
	}
	
	static final void method2846(int i, byte b, IComponentDefinitions widget, int i_65_) {
		anInt10275++;
		if (widget != null) {
			if (widget.anObjectArray4768 != null) {
				Node_Sub37 node_sub37 = new Node_Sub37();
				node_sub37.aWidget7437 = widget;
				node_sub37.parameters = widget.anObjectArray4768;
				ClientScriptsExecutor.method3556(node_sub37);
			}
			Class92.anInt1230 = widget.anInt4718;
			Node_Sub15_Sub9.anInt9839 = widget.ihash;
			Class87.removeWalkHere = true;
			if (b >= -90) {
				method2845((byte) -18);
			}
			Class324.anInt4087 = i_65_;
			Class201.anInt2444 = widget.anInt4698;
			Class46.anInt681 = widget.anInt4687;
			Class239.anInt2928 = widget.anInt4839;
			Class200_Sub2.anInt4943 = i;
			ClientScript.method2321(-1, widget);
		}
	}
	
	public Node_Sub38_Sub18() {
		super(2, false);
	}
}
