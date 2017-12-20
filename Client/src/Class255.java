/* Class255 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class255
{
	protected int anInt3214;
	protected int anInt3215 = -1;
	private int anInt3216;
	protected Class186 aClass186_3217;
	static boolean aBoolean3218 = false;
	private int anInt3219;
	static int anInt3220;
	private int anInt3221;
	private String aString3222 = "";
	protected int anInt3223;
	static int anInt3224;
	static int anInt3225;
	private int anInt3226;
	static int anInt3227;
	static int anInt3228;
	protected int anInt3229;
	protected int anInt3230;
	protected int anInt3231;
	static int anInt3232;
	static int anInt3233;
	protected int anInt3234;
	protected int anInt3235;
	static int anInt3236;
	
	final GLSprite method3111(GraphicsToolkit graphicstoolkit, int i) {
		anInt3225++;
		if (i < (anInt3219 ^ 0xffffffff)) {
			return null;
		}
		GLSprite glsprite = (GLSprite) aClass186_3217.aClass61_2258.method607((long) anInt3219, 0);
		if (glsprite == null) {
			method3115(-1, graphicstoolkit);
			glsprite = (GLSprite) aClass186_3217.aClass61_2258.method607((long) anInt3219, 0);
		}
		return glsprite;
	}
	
	final GLSprite method3112(int i, GraphicsToolkit graphicstoolkit) {
		anInt3224++;
		if (anInt3216 < 0) {
			return null;
		}
		if (i < 64) {
			method3116(null, (byte) 62, -12);
		}
		GLSprite glsprite = (GLSprite) aClass186_3217.aClass61_2258.method607((long) anInt3216, 0);
		if (glsprite == null) {
			method3115(-1, graphicstoolkit);
			glsprite = (GLSprite) aClass186_3217.aClass61_2258.method607((long) anInt3216, 0);
		}
		return glsprite;
	}
	
	final GLSprite method3113(GraphicsToolkit graphicstoolkit, byte b) {
		anInt3232++;
		if (anInt3226 < 0) {
			return null;
		}
		if (b >= -81) {
			anInt3214 = -124;
		}
		GLSprite glsprite = (GLSprite) aClass186_3217.aClass61_2258.method607((long) anInt3226, 0);
		if (glsprite == null) {
			method3115(-1, graphicstoolkit);
			glsprite = (GLSprite) aClass186_3217.aClass61_2258.method607((long) anInt3226, 0);
		}
		return glsprite;
	}
	
	final GLSprite method3114(int i, GraphicsToolkit graphicstoolkit) {
		anInt3233++;
		if (anInt3221 < i) {
			return null;
		}
		GLSprite glsprite = (GLSprite) aClass186_3217.aClass61_2258.method607((long) anInt3221, 0);
		if (glsprite == null) {
			method3115(i + -1, graphicstoolkit);
			glsprite = (GLSprite) aClass186_3217.aClass61_2258.method607((long) anInt3221, 0);
		}
		return glsprite;
	}
	
	private final void method3115(int i, GraphicsToolkit graphicstoolkit) {
		anInt3220++;
		Index class302 = aClass186_3217.aClass302_2260;
		if (anInt3221 >= 0 && aClass186_3217.aClass61_2258.method607((long) anInt3221, 0) == null && class302.method3510(anInt3221, (byte) 63)) {
			Class383 class383 = Class383.method4191(class302, anInt3221);
			aClass186_3217.aClass61_2258.method601(graphicstoolkit.a(class383, true), 25566, (long) anInt3221);
		}
		if (i >= (anInt3219 ^ 0xffffffff) && aClass186_3217.aClass61_2258.method607((long) anInt3219, 0) == null && class302.method3510(anInt3219, (byte) 63)) {
			Class383 class383 = Class383.method4191(class302, anInt3219);
			aClass186_3217.aClass61_2258.method601(graphicstoolkit.a(class383, true), 25566, (long) anInt3219);
		}
		if ((anInt3216 ^ 0xffffffff) <= -1 && aClass186_3217.aClass61_2258.method607((long) anInt3216, 0) == null && class302.method3510(anInt3216, (byte) 63)) {
			Class383 class383 = Class383.method4191(class302, anInt3216);
			aClass186_3217.aClass61_2258.method601(graphicstoolkit.a(class383, true), 25566, (long) anInt3216);
		}
		if ((anInt3226 ^ 0xffffffff) <= -1 && aClass186_3217.aClass61_2258.method607((long) anInt3226, 0) == null && class302.method3510(anInt3226, (byte) 63)) {
			Class383 class383 = Class383.method4191(class302, anInt3226);
			aClass186_3217.aClass61_2258.method601(graphicstoolkit.a(class383, true), i + 25567, (long) anInt3226);
		}
	}
	
	private final void method3116(BufferedStream buffer, byte b, int i) {
		if ((i ^ 0xffffffff) == -2) {
			anInt3235 = buffer.readUnsignedShort();
		} else if (i == 2) {
			anInt3229 = buffer.read24BitInteger();
		} else if ((i ^ 0xffffffff) != -4) {
			if ((i ^ 0xffffffff) != -5) {
				if (i == 5) {
					anInt3219 = buffer.readUnsignedShort();
				} else if ((i ^ 0xffffffff) != -7) {
					if (i != 7) {
						if (i == 8) {
							aString3222 = buffer.method2180((byte) 101);
						} else if ((i ^ 0xffffffff) != -10) {
							if (i != 10) {
								if ((i ^ 0xffffffff) == -12) {
									anInt3215 = 0;
								} else if (i == 12) {
									anInt3234 = buffer.readUnsignedByte();
								} else if (i != 13) {
									if ((i ^ 0xffffffff) == -15) {
										anInt3215 = buffer.readUnsignedShort();
									}
								} else {
									anInt3214 = buffer.readShort();
								}
							} else {
								anInt3230 = buffer.readShort();
							}
						} else {
							anInt3231 = buffer.readUnsignedShort();
						}
					} else {
						anInt3223 = buffer.readShort();
					}
				} else {
					anInt3226 = buffer.readUnsignedShort();
				}
			} else {
				anInt3216 = buffer.readUnsignedShort();
			}
		} else {
			anInt3221 = buffer.readUnsignedShort();
		}
		anInt3228++;
		if (b >= -12) {
			method3115(-43, null);
		}
	}
	
	final String method3117(int i, boolean bool) {
		anInt3227++;
		String string = aString3222;
		for (;;) {
			int i_0_ = string.indexOf("%1");
			if ((i_0_ ^ 0xffffffff) > -1) {
				break;
			}
			string = string.substring(0, i_0_) + Node_Sub29_Sub2.method2715((byte) 9, false, i) + string.substring(2 + i_0_);
		}
		if (bool != true) {
			method3117(-15, true);
		}
		return string;
	}
	
	final void method3118(boolean bool, BufferedStream buffer) {
		for (;;) {
			int i = buffer.readUnsignedByte();
			if (i == 0) {
				break;
			}
			method3116(buffer, (byte) -16, i);
		}
		anInt3236++;
		if (bool != false) {
			method3111(null, 93);
		}
	}
	
	public Class255() {
		anInt3221 = -1;
		anInt3223 = 0;
		anInt3226 = -1;
		anInt3216 = -1;
		anInt3230 = 0;
		anInt3229 = 16777215;
		anInt3231 = 70;
		anInt3214 = 0;
		anInt3219 = -1;
		anInt3235 = -1;
		anInt3234 = -1;
	}
}
