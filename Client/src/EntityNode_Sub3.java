/* EntityNode_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

class EntityNode_Sub3 extends EntityNode
{
	static IncommingPacket aClass192_5959 = new IncommingPacket(14, 3);
	protected EntityNode_Sub3 anEntityNode_Sub3_5960;
	protected EntityNode_Sub3 anEntityNode_Sub3_5961;
	static int anInt5962;
	static int anInt5963;
	static int anInt5964;
	static int anInt5965;
	
	final void method937(boolean bool) {
		anInt5963++;
		if (anEntityNode_Sub3_5960 != null) {
			anEntityNode_Sub3_5960.anEntityNode_Sub3_5961 = anEntityNode_Sub3_5961;
			anEntityNode_Sub3_5961.anEntityNode_Sub3_5960 = anEntityNode_Sub3_5960;
			if (bool == true) {
				anEntityNode_Sub3_5960 = null;
				anEntityNode_Sub3_5961 = null;
			}
		}
	}
	
	public static void method938(int i) {
		aClass192_5959 = null;
		if (i <= 46) {
			aClass192_5959 = null;
		}
	}
	
	static final void method939() {
		Class203.method2028(1, Class159.anInt1995);
	}
	
	static final boolean method940(int i, int i_0_, int i_1_) {
		anInt5962++;
		if (i != -1) {
			anInt5965 = -15;
		}
        return (i_1_ & 0x180 ^ 0xffffffff) != -1;
    }
	
	public EntityNode_Sub3() {
		/* empty */
	}
	
	static final void method941(int i, BufferedStream buffer) {
		anInt5964++;
		byte[] bs = new byte[i];
		if (Class366.aSeekableFile4529 != null) {
			try {
				Class366.aSeekableFile4529.method3577(0L, false);
				Class366.aSeekableFile4529.method3574(bs, (byte) -1);
				int i_2_;
				for (i_2_ = 0; (i_2_ ^ 0xffffffff) > -25; i_2_++) {
					if (bs[i_2_] != 0) {
						break;
					}
				}
				if ((i_2_ ^ 0xffffffff) <= -25) {
					throw new IOException();
				}
			} catch (Exception exception) {
				for (int i_3_ = 0; i_3_ < 24; i_3_++)
					bs[i_3_] = (byte) -1;
			}
		}
		buffer.writeBytes(24, bs, 0);
	}
}
