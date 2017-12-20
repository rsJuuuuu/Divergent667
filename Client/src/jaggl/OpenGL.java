/* OpenGL - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaggl;
import java.awt.Canvas;
import java.util.Hashtable;

public class OpenGL
{
	private static Hashtable<Thread, OpenGL> a = new Hashtable<Thread, OpenGL>();
	protected long peer;
	private Hashtable<String, String> c;
	private Thread b;
	
	public static final native void glPixelZoom(float f, float f_0_);
	
	public final native void release();
	
	public static final native void glUniform1iARB(int i, int i_1_);
	
	public static final native void glColor3f(float f, float f_2_, float f_3_);
	
	public final native long init(Canvas canvas, int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_);
	
	public static final native void glBufferDataARBa(int i, int i_9_, long l, int i_10_);
	
	public static final native void glMultiTexCoord2i(int i, int i_11_, int i_12_);
	
	public static final native void glTexCoord3f(float f, float f_13_, float f_14_);
	
	public static final native void glReadPixelsi(int i, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, int[] is, int i_20_);
	
	public static final native void glRasterPos2i(int i, int i_21_);
	
	public static final native void glNormal3f(float f, float f_22_, float f_23_);
	
	public static final native void glGetTexImageub(int i, int i_24_, int i_25_, int i_26_, byte[] bs, int i_27_);
	
	public static final native long glCreateProgramObjectARB();
	
	public static final native void glVertexPointer(int i, int i_28_, int i_29_, long l);
	
	public static final native void glShaderSourceARB(long l, String string);
	
	public static final native void glProgramStringARB(int i, int i_30_, String string);
	
	public static final native void glGetProgramivARB(int i, int i_31_, int[] is, int i_32_);
	
	public static final native void glGenFramebuffersEXT(int i, int[] is, int i_33_);
	
	public static final native void glTexParameteri(int i, int i_34_, int i_35_);
	
	public static final native void glDeleteBuffersARB(int i, int[] is, int i_36_);
	
	public static final native void glDisable(int i);
	
	public final native void surfaceResized(long l);
	
	public static final native void glTexSubImage2Di(int i, int i_37_, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_, int[] is, int i_44_);
	
	public static final native void glGenBuffersARB(int i, int[] is, int i_45_);
	
	public static final native void glTexImage2Dub(int i, int i_46_, int i_47_, int i_48_, int i_49_, int i_50_, int i_51_, int i_52_, byte[] bs, int i_53_);
	
	public static final native void glGetInfoLogARB(long l, int i, int[] is, int i_54_, byte[] bs, int i_55_);
	
	public static final native void glColor4ub(byte b, byte b_56_, byte b_57_, byte b_58_);
	
	public final boolean a(String string) {
		if (c == null) {
			c = new Hashtable<String, String>();
			String string_59_ = glGetString(7939);
			int i = 0;
			for (;;) {
				int i_60_ = string_59_.indexOf(' ', i);
				if (i_60_ == -1) {
					break;
				}
				String string_61_ = string_59_.substring(i, i_60_).trim();
				if (string_61_.length() != 0) {
					c.put(string_61_, string_61_);
				}
				i = i_60_ - -1;
			}
			String string_62_ = string_59_.substring(i).trim();
			if ((string_62_.length() ^ 0xffffffff) != -1) {
				c.put(string_62_, string_62_);
			}
		}
		return c.containsKey(string);
	}
	
	public static final native void glUniform1fARB(int i, float f);
	
	public static final native void glVertex3f(float f, float f_63_, float f_64_);
	
	public static final native void glTexCoord2f(float f, float f_65_);
	
	public static final native void glDeleteObjectARB(long l);
	
	public final native void setPbuffer(long l);
	
	public static final native void glDetachObjectARB(long l, long l_66_);
	
	public static final native void glColor4f(float f, float f_67_, float f_68_, float f_69_);
	
	public static final native void glTexImage3Dub(int i, int i_70_, int i_71_, int i_72_, int i_73_, int i_74_, int i_75_, int i_76_, int i_77_, byte[] bs, int i_78_);
	
	static final native long glMapBufferARB(int i, int i_79_);
	
	public static final native void glEnable(int i);
	
	public static final native void glLinkProgramARB(long l);
	
	public static final native void glFramebufferRenderbufferEXT(int i, int i_80_, int i_81_, int i_82_);
	
	public static final native void glColorMask(boolean bool, boolean bool_83_, boolean bool_84_, boolean bool_85_);
	
	public static final native void glDrawPixelsub(int i, int i_86_, int i_87_, int i_88_, byte[] bs, int i_89_);
	
	public static final native void glTexImage2Di(int i, int i_90_, int i_91_, int i_92_, int i_93_, int i_94_, int i_95_, int i_96_, int[] is, int i_97_);
	
	public static final native void glGenRenderbuffersEXT(int i, int[] is, int i_98_);
	
	public final native void swapBuffers();
	
	public final native void releaseSurface(Canvas canvas, long l);
	
	public static final native int glGenLists(int i);
	
	public static final native void glTexParameterf(int i, int i_99_, float f);
	
	public static final native void glNewList(int i, int i_100_);
	
	public static final native void glGetObjectParameterivARB(long l, int i, int[] is, int i_101_);
	
	public static final native void glUseProgramObjectARB(long l);
	
	public static final native void glEnd();
	
	public static final native void glDrawBuffer(int i);
	
	public static final native long glCreateShaderObjectARB(int i);
	
	public static final native void glGetIntegerv(int i, int[] is, int i_102_);
	
	public static final native void glColorMaterial(int i, int i_103_);
	
	public final native long prepareSurface(Canvas canvas);
	
	public static final native void glGetTexImagei(int i, int i_104_, int i_105_, int i_106_, int[] is, int i_107_);
	
	public static final native void glUniformMatrix4fvARB(int i, int i_108_, boolean bool, float[] fs, int i_109_);
	
	public static final native void glDepthFunc(int i);
	
	public final native long createPbuffer(int i, int i_110_);
	
	public static final native void glDeleteTextures(int i, int[] is, int i_111_);
	
	public static final native void glColorPointer(int i, int i_112_, int i_113_, long l);
	
	public final native boolean setSurface(long l);
	
	public static final native void glFlush();
	
	public static final native void glTexCoord2i(int i, int i_114_);
	
	public static final native void glProgramLocalParameter4fARB(int i, int i_115_, float f, float f_116_, float f_117_, float f_118_);
	
	public static final native void glDrawArrays(int i, int i_119_, int i_120_);
	
	public static final native void glBlitFramebufferEXT(int i, int i_121_, int i_122_, int i_123_, int i_124_, int i_125_, int i_126_, int i_127_, int i_128_, int i_129_);
	
	public static final native void glDrawPixelsi(int i, int i_130_, int i_131_, int i_132_, int[] is, int i_133_);
	
	public static final native void glTexImage1Dub(int i, int i_134_, int i_135_, int i_136_, int i_137_, int i_138_, int i_139_, byte[] bs, int i_140_);
	
	public static final native void glAttachObjectARB(long l, long l_141_);
	
	public static final native void glMultMatrixf(float[] fs, int i);
	
	public static final native int glGetError();
	
	public final synchronized boolean b() {
		Thread thread = Thread.currentThread();
		if (attachPeer()) {
			OpenGL opengl_142_ = a.put(thread, this);
			if (opengl_142_ != null) {
				opengl_142_.b = null;
			}
			b = thread;
			return true;
		}
		return false;
	}
	
	public static final native void glFramebufferTexture3DEXT(int i, int i_143_, int i_144_, int i_145_, int i_146_, int i_147_);
	
	public static final native void glRotatef(float f, float f_148_, float f_149_, float f_150_);
	
	public static final native void glPushAttrib(int i);
	
	public static final native void glGenerateMipmapEXT(int i);
	
	public static final native void glViewport(int i, int i_151_, int i_152_, int i_153_);
	
	public static final native void glGenTextures(int i, int[] is, int i_154_);
	
	public static final native void glBindFramebufferEXT(int i, int i_155_);
	
	public final synchronized boolean a() {
		if (b != Thread.currentThread()) {
			return false;
		}
		detachPeer();
		a.remove(b);
		b = null;
		return true;
	}
	
	public static final native void glPopAttrib();
	
	public static final native void glDeleteProgramARB(int i);
	
	public static final native void glClientActiveTexture(int i);
	
	public static final native void glLightModelfv(int i, float[] fs, int i_156_);
	
	public static final native void glBindRenderbufferEXT(int i, int i_157_);
	
	public static final native void glDepthMask(boolean bool);
	
	public static final native void glTexSubImage2Dub(int i, int i_158_, int i_159_, int i_160_, int i_161_, int i_162_, int i_163_, int i_164_, byte[] bs, int i_165_);
	
	public static final native void glMatrixMode(int i);
	
	public static final native void glBufferDataARBub(int i, int i_166_, byte[] bs, int i_167_, int i_168_);
	
	public static final native void glBindBufferARB(int i, int i_169_);
	
	public static final native void glMaterialfv(int i, int i_170_, float[] fs, int i_171_);
	
	public static final native void glLoadIdentity();
	
	public static final native void glPixelStorei(int i, int i_172_);
	
	public static final native void glMultiTexCoord2f(int i, float f, float f_173_);
	
	public static final native void glGetFloatv(int i, float[] fs, int i_174_);
	
	public static final native void glPolygonMode(int i, int i_175_);
	
	public static final native void glPointSize(float f);
	
	public static final native void glRenderbufferStorageEXT(int i, int i_176_, int i_177_, int i_178_);
	
	public static final native void glFinish();
	
	public static final native void glScalef(float f, float f_179_, float f_180_);
	
	public static final native void glCullFace(int i);
	
	public static final native void glShaderSourceRawARB(long l, byte[] bs);
	
	public static final native void glTexEnvfv(int i, int i_181_, float[] fs, int i_182_);
	
	public static final native void glPixelTransferf(int i, float f);
	
	public static final native void glMultiTexCoord3i(int i, int i_183_, int i_184_, int i_185_);
	
	public static final native void glCallList(int i);
	
	public static final native void glUniformMatrix3fvARB(int i, int i_186_, boolean bool, float[] fs, int i_187_);
	
	public static final native void glBindProgramARB(int i, int i_188_);
	
	public final native void releasePbuffer(long l);
	
	public static final native void glTexEnvi(int i, int i_189_, int i_190_);
	
	public static final native void glEndList();
	
	public static final native void glCompileShaderARB(long l);
	
	public static final native void glCopyPixels(int i, int i_191_, int i_192_, int i_193_, int i_194_);
	
	public static final native void glTexImage2Df(int i, int i_195_, int i_196_, int i_197_, int i_198_, int i_199_, int i_200_, int i_201_, float[] fs, int i_202_);
	
	static final native boolean glUnmapBufferARB(int i);
	
	public static final native void glClearDepth(float f);
	
	public static final native void glVertex2i(int i, int i_203_);
	
	public static final native void glClearColor(float f, float f_204_, float f_205_, float f_206_);
	
	public static final native void glPushMatrix();
	
	public static final native void glActiveTexture(int i);
	
	public static final native void glTexSubImage2Df(int i, int i_207_, int i_208_, int i_209_, int i_210_, int i_211_, int i_212_, int i_213_, float[] fs, int i_214_);
	
	public static final native void glScissor(int i, int i_215_, int i_216_, int i_217_);
	
	public static final native void glColor3ub(byte b, byte b_218_, byte b_219_);
	
	public static final native void glClear(int i);
	
	public static final native void glDeleteLists(int i, int i_220_);
	
	public static final native int glGenProgramARB();
	
	public static final native void glFogfv(int i, float[] fs, int i_221_);
	
	public static final native void glProgramRawARB(int i, int i_222_, byte[] bs);
	
	public static final native void glTexGenfv(int i, int i_223_, float[] fs, int i_224_);
	
	public static final native void glFramebufferTexture2DEXT(int i, int i_225_, int i_226_, int i_227_, int i_228_);
	
	public static final native void glUniform4fARB(int i, float f, float f_229_, float f_230_, float f_231_);
	
	public static final native void glLightfv(int i, int i_232_, float[] fs, int i_233_);
	
	public static final native void glTexGeni(int i, int i_234_, int i_235_);
	
	public static final native void glDrawBuffersARB(int i, int[] is, int i_236_);
	
	public static final native void glLineWidth(float f);
	
	public static final native String glGetString(int i);
	
	public static final native void glTexCoordPointer(int i, int i_237_, int i_238_, long l);
	
	public static final native void glShadeModel(int i);
	
	public static final native void glLoadMatrixf(float[] fs, int i);
	
	public static final native void glBlendFunc(int i, int i_239_);
	
	public static final native int glGetUniformLocationARB(long l, String string);
	
	public static final native int glCheckFramebufferStatusEXT(int i);
	
	public static final native void glUniform3fARB(int i, float f, float f_240_, float f_241_);
	
	public static final native void glDrawElements(int i, int i_242_, int i_243_, long l);
	
	public static final native void glFogf(int i, float f);
	
	public static final native void glTexEnvf(int i, int i_244_, float f);
	
	public static final native void glRenderbufferStorageMultisampleEXT(int i, int i_245_, int i_246_, int i_247_, int i_248_);
	
	public static final native void glCopyTexSubImage3D(int i, int i_249_, int i_250_, int i_251_, int i_252_, int i_253_, int i_254_, int i_255_, int i_256_);
	
	public static final native void glFrustum(double d, double d_257_, double d_258_, double d_259_, double d_260_, double d_261_);
	
	public static final native void glUniform2fARB(int i, float f, float f_262_);
	
	private final native void detachPeer();
	
	public static final native void glDeleteFramebuffersEXT(int i, int[] is, int i_263_);
	
	public static final native void glUniformMatrix2fvARB(int i, int i_264_, boolean bool, float[] fs, int i_265_);
	
	public static final native void glCopyTexSubImage2D(int i, int i_266_, int i_267_, int i_268_, int i_269_, int i_270_, int i_271_, int i_272_);
	
	public static final native void glCopyTexImage2D(int i, int i_273_, int i_274_, int i_275_, int i_276_, int i_277_, int i_278_, int i_279_);
	
	public static final native void glOrtho(double d, double d_280_, double d_281_, double d_282_, double d_283_, double d_284_);
	
	public static final native void glBufferSubDataARBub(int i, int i_285_, int i_286_, byte[] bs, int i_287_);
	
	public static final native void glTexCoord3i(int i, int i_288_, int i_289_);
	
	public static final native void glTranslatef(float f, float f_290_, float f_291_);
	
	public static final native void glPopMatrix();
	
	public static final native void glStencilFunc(int i, int i_292_, int i_293_);
	
	private final native boolean attachPeer();
	
	public static final native void glBegin(int i);
	
	public static final native void glBindTexture(int i, int i_294_);
	
	public static final native void glReadBuffer(int i);
	
	public final native void setSwapInterval(int i);
	
	public final native boolean arePbuffersAvailable();
	
	public static final native void glReadPixelsub(int i, int i_295_, int i_296_, int i_297_, int i_298_, int i_299_, byte[] bs, int i_300_);
	
	public static final native void glDeleteRenderbuffersEXT(int i, int[] is, int i_301_);
	
	public static final native void glLightf(int i, int i_302_, float f);
	
	public static final native void glEnableClientState(int i);
	
	public static final native void glHint(int i, int i_303_);
	
	public static final native void glNormalPointer(int i, int i_304_, long l);
	
	public static final native void glAlphaFunc(int i, float f);
	
	public static final native void glProgramLocalParameter4fvARB(int i, int i_305_, float[] fs, int i_306_);
	
	public static final native void glVertex2f(float f, float f_307_);
	
	public static final native void glStencilOp(int i, int i_308_, int i_309_);
	
	public static final native void glBufferSubDataARBa(int i, int i_310_, int i_311_, long l);
	
	public static final native void glDisableClientState(int i);
	
	public static final native void glFogi(int i, int i_312_);
}
