/* Class25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class25 {
	static int anInt444;
	static int anInt445;
	static int anInt446 = 0;
	private int anInt447;
	static int anInt448;
	static int anInt449;
	static int anInt450;
	static int anInt451;
	static int anInt452 = 0;

	static final void method306(int junk, int sceneX, long l, int sceney) {
		int routeType = (0x7d32b & (int) l) >> 14;
		int calcs = ((int) l & 0x3b48d1) >> 20;
		int objectId = 0x7fffffff & (int) (l >>> 32);
		if (routeType != 10 && routeType != 11 && (routeType ^ 0xffffffff) != -23) {
			Class78.method778(calcs, sceney, 0, true, sceneX, 0, routeType, 48, 0);
		} else {
			ObjectDefinition objectdefinition = Class186.aClass112_2256
					.method1145(objectId, 63);
			int sizeX;
			int sizeY;
			if ((calcs ^ 0xffffffff) == -1 || calcs == 2) {
				sizeX = objectdefinition.anInt3055;
				sizeY = objectdefinition.anInt2986;
			} else {
				sizeX = objectdefinition.anInt2986;
				sizeY = objectdefinition.anInt3055;
			}
			int i_7_ = objectdefinition.anInt3040;
			if (calcs != 0) {
				i_7_ = (0xf & i_7_ << calcs) - -(i_7_ >> -calcs + 4);
			}
			Class78.method778(0, sceney, sizeY, true, sceneX, i_7_, 0, 127, sizeX);
		}
	}

	final void method307(int i, int i_8_) {
		OpenGL.glNewList(anInt447 + i, i_8_);
		anInt445++;
	}

	static final long method308(int i, boolean bool) {
		anInt451++;
		if (bool != false) {
			return -106L;
		}
		return 86400000L * (long) (11745 + i);
	}

	final void method309(boolean bool) {
		anInt448++;
		OpenGL.glEndList();
		if (bool != false) {
			anInt447 = 43;
		}
	}

	final void method310(char c, byte b) {
		if (b >= -13) {
			method309(false);
		}
		anInt450++;
		OpenGL.glCallList(c + anInt447);
	}

	Class25(GLToolkit gltoolkit, int i) {
		anInt447 = OpenGL.glGenLists(i);
	}
}
