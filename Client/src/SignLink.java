/* SignLink - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Objects;

public class SignLink implements Runnable {
    private static int anInt3978;
    protected FileOnDisk aFileOnDisk3979 = null;
    private Object anObject3980;
    static String aString3981;
    static String aString3982;
    private Class241 aClass241_3983 = null;
    static String aString3984;
    protected boolean aBoolean3985;
    private Class241 aClass241_3986;
    private static String aString3987;
    private Callback_Sub1 aCallback_Sub1_3988;
    static String aString3989;
    private Object anObject3990;
    private Object anObject3991;
    protected FileOnDisk aFileOnDisk3992;
    private boolean aBoolean3993;
    protected FileOnDisk aFileOnDisk3994;
    static String aString3995;
    private static String aString3996;
    private Class11 aClass11_3997;
    private final Thread aThread3998;
    private static volatile long aLong3999 = 0L;
    static Method aMethod4000;
    protected EventQueue anEventQueue4002;
    protected FileOnDisk[] aFileOnDiskArray4003;
    static Method aMethod4004;
    protected boolean aBoolean4005;
    /*synthetic*/ static Class<?> aClass4006;
    /*synthetic*/ static Class<?> aClass4007;
    /*synthetic*/ static Class<?> aClass4008;
    /*synthetic*/ static Class<?> aClass4009;

    final Object method3626() {
        return anObject3991;
    }

    final Class241 method3627(int i, int i_0_, int i_2_) {
        return method3643((i << 16) + 0, 6, null, 9, (i_2_ << 16) + i_0_);
    }

    final Class241 method3628(Class<?> var_class, String string, int i) {
        if (i != 0) {
            anInt3978 = -83;
        }
        return method3643(0, 9, new Object[]{var_class, string}, i + 9, 0);
    }

    final Class241 method3629(String string, boolean bool_4_, int i) {
        return method3643(0, bool_4_ ? 22 : 1, string, 9, i);
    }

    private static FileOnDisk method3630(String string, int i, String string_5_) {
        String string_7_;
        if (i == 33) {
            string_7_ = string + "_preferences" + string_5_ + "_rc.dat";
        } else if (i == 34) {
            string_7_ = string + "_preferences" + string_5_ + "_wip.dat";
        } else {
            string_7_ = string + "_preferences" + string_5_ + ".dat";
        }
        String[] strings = {Settings.getCachePath()};
        for (String string_9_ : strings) {
            if (string_9_.length() == 0 || new File(string_9_).exists()) {
                try {
                    return new FileOnDisk(new File(string_9_, string_7_), 10000L);
                } catch (Exception exception) {
                    /* empty */
                }
            }
        }
        return null;
    }

    final Class241 method3631(String string, byte b) {
        if (b <= 70) {
            aString3987 = null;
        }
        return method3643(0, 12, string, 9, 0);
    }

    final Class241 method3632(int i) {
        return method3643(0, 3, null, 9, i);
    }

    static FileOnDisk method3633(int i, String string) {
        if (i != -15) {
            method3633(-39, null);
        }
        return method3630(aString3987, anInt3978, string);
    }

    final Class241 method3634() {
        return method3643(0, 5, null, 9, 0);
    }

    final void method3635() {
        synchronized (this) {
            aBoolean3993 = true;
            this.notifyAll();
        }
        try {
            aThread3998.join();
        } catch (InterruptedException interruptedexception) {
            /* empty */
        }
        if (aFileOnDisk3979 != null) {
            try {
                aFileOnDisk3979.method1098();
            } catch (IOException ioexception) {
                /* empty */
            }
        }
        if (aFileOnDisk3992 != null) {
            try {
                aFileOnDisk3992.method1098();
            } catch (IOException ioexception) {
                /* empty */
            }
        }
        if (aFileOnDiskArray4003 != null) {
            for (FileOnDisk fileOnDisk : aFileOnDiskArray4003) {
                if (fileOnDisk != null) {
                    try {
                        fileOnDisk.method1098();
                    } catch (IOException ioexception) {
                        /* empty */
                    }
                }
            }
        }
        do {
            if (aFileOnDisk3994 != null) {
                try {
                    aFileOnDisk3994.method1098();
                } catch (IOException ioexception) {
                    break;
                }
                break;
            }
        } while (false);
    }

    final Class241 method3636(String string) {
        return method3643(0, 16, string, 9, 0);
    }

    final boolean method3637(File file, byte[] bs) {
        try {
            FileOutputStream fileoutputstream = new FileOutputStream(file);
            fileoutputstream.write(bs, 0, bs.length);
            fileoutputstream.close();
            return true;
        } catch (IOException ioexception) {
            throw new RuntimeException();
        }
    }

    final Class241 method3638(Class<?> var_class, @SuppressWarnings("rawtypes") Class[] var_classes, String string) {
        return method3643(0, 8, new Object[]{var_class, string, var_classes}, 9, 0);
    }

    final Class241 method3639(Frame frame) {
        return method3643(0, 7, frame, 9, 0);
    }

    final boolean method3640(int i) {
        if (i < 118) {
            aClass241_3983 = null;
        }
        if (!aBoolean4005) {
            return false;
        }
        if (aBoolean3985) {
            return aClass11_3997 != null;
        }
        return anObject3980 != null;
    }

    final Class241 method3641(Runnable runnable, int i) {
        return method3643(0, 2, runnable, 9, i);
    }

    final Class241 method3642(URL url) {
        return method3643(0, 4, url, 9, 0);
    }

    private Class241 method3643(int i, int i_11_, Object object, int i_12_, int i_13_) {
        Class241 class241 = new Class241();
        class241.anObject2954 = object;
        class241.anInt2952 = i_13_;
        if (i_12_ != 9) {
            aClass241_3983 = null;
        }
        class241.anInt2957 = i_11_;
        class241.anInt2951 = i;
        synchronized (this) {
            if (aClass241_3986 == null) {
                aClass241_3986 = aClass241_3983 = class241;
            } else {
                aClass241_3986.aClass241_2955 = class241;
                aClass241_3986 = class241;
            }
            this.notify();
        }
        return class241;
    }

    final void method3644() {
        aLong3999 = Class313.method3650() + 5000L;
    }

    final Class241 method3645(int i, byte b, int[] is, Component component, Point point, int i_14_) {
        return method3643(i, 17, new Object[]{component, is, point}, 9, i_14_);
    }

    public final void run() {
        for (; ; ) {
            Class241 class241;
            synchronized (this) {
                for (; ; ) {
                    if (aBoolean3993) {
                        return;
                    }
                    if (aClass241_3983 != null) {
                        class241 = aClass241_3983;
                        aClass241_3983 = aClass241_3983.aClass241_2955;
                        if (aClass241_3983 == null) {
                            aClass241_3986 = null;
                        }
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException interruptedexception) {
                        /* empty */
                    }
                }
            }
            try {
                int i = class241.anInt2957;
                if (i == 1) {
                    if (Class313.method3650() < aLong3999) {
                        throw new IOException();
                    }
                    class241.anObject2956 = new Socket(InetAddress.getByName((String) class241.anObject2954),
                            class241.anInt2952);
                } else if (i == 22) {
                    if (aLong3999 > Class313.method3650()) {
                        throw new IOException();
                    }
                    try {
                        class241.anObject2956 = Node_Sub38_Sub14.method2834((String) class241.anObject2954, class241.anInt2952).method435();
                    } catch (IOException_Sub1 ioexception_sub1) {
                        class241.anObject2956 = ioexception_sub1.getMessage();
                        throw ioexception_sub1;
                    }
                } else if (i == 2) {
                    Thread thread = new Thread((Runnable) class241.anObject2954);
                    thread.setDaemon(true);
                    thread.start();
                    thread.setPriority(class241.anInt2952);
                    class241.anObject2956 = thread;
                } else if (i == 4) {
                    if (aLong3999 > Class313.method3650()) {
                        throw new IOException();
                    }
                    class241.anObject2956 = new DataInputStream(((URL) class241.anObject2954).openStream());
                } else if (i == 8) {
                    Object[] objects = (Object[]) class241.anObject2954;
                    if (aBoolean4005 && ((Class<?>) objects[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    class241.anObject2956 = ((Class<?>) objects[0]).getDeclaredMethod((String) objects[1], (Class[]) objects[2]);
                } else if (i == 9) {
                    Object[] objects = (Object[]) class241.anObject2954;
                    if (aBoolean4005 && ((Class<?>) objects[0]).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    class241.anObject2956 = ((Class<?>) objects[0]).getDeclaredField((String)
                            objects[1]);
                } else if (i == 18) {
                    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                    class241.anObject2956 = clipboard.getContents(null);
                } else if (i == 19) {
                    Transferable transferable = (Transferable) class241.anObject2954;
                    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                    clipboard.setContents(transferable, null);
                } else {
                    if (!aBoolean4005) {
                        throw new Exception("");
                    }
                    if (i == 3) {
                        if (Class313.method3650() < aLong3999) {
                            throw new IOException();
                        }
                        String string = (class241.anInt2952 >> 24 & 0xff) + "." + (
                                (0xffd9e4 & class241.anInt2952) >> 16) + "." + (class241.anInt2952 >>
                                8 & 0xff) + "." + (0xff & class241.anInt2952);
                        class241.anObject2956 = InetAddress.getByName(string).getHostName();
                    } else if (i == 21) {
                        if (Class313.method3650() < aLong3999) {
                            throw new IOException();
                        }
                        class241.anObject2956 = InetAddress.getByName((String) class241.anObject2954)
                                .getAddress();
                    } else if (i != 5) {
                        if (i == 6) {
                            Frame frame = new Frame("Divergent Full Screen");
                            class241.anObject2956 = frame;
                            frame.setResizable(false);
                            if (aBoolean3985) {
                                aClass11_3997.method191(frame, class241.anInt2951 >> 16, 0xffff &
                                                class241.anInt2951, 0xffff & class241.anInt2952,
                                        class241.anInt2952 >>> 16);
                            } else {
                                Class.forName("Display").getMethod("enter", new Class[]{aClass4006 ==
                                                null ? aClass4006 = method3646("java.awt.Frame") : aClass4006,
                                                Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE})
                                        .invoke(anObject3980, frame, class241.anInt2952
                                                >>> 16, 0xffff & class241.anInt2952, class241.anInt2951 >> 16, 0xffff
                                                & class241.anInt2951);
                            }
                        } else if (i == 7) {
                            if (aBoolean3985) {
                                aClass11_3997.method192((Frame) class241.anObject2954);
                            } else {
                                Class.forName("Display").getMethod("exit", new Class[0]).invoke
                                        (anObject3980);
                            }
                        } else if (i == 12) {
                            class241.anObject2956 = method3630(aString3987, anInt3978, (String)
                                    class241.anObject2954);
                        } else if (i == 13) {
                            class241.anObject2956 = method3630("", anInt3978, (String)
                                    class241.anObject2954);
                        } else if (i == 14) {
                            int i_16_ = class241.anInt2952;
                            int i_17_ = class241.anInt2951;
                            if (aBoolean3985) {
                                aCallback_Sub1_3988.method81(i_16_, i_17_);
                            } else {
                                Class.forName("Class208").getDeclaredMethod("method2046", new
                                        Class[]{Integer.TYPE, Integer.TYPE}).invoke(anObject3990,
                                        i_16_, i_17_);
                            }
                        } else if (i == 15) {
                            boolean bool = class241.anInt2952 != 0;
                            Component component = (Component) class241.anObject2954;
                            if (aBoolean3985) {
                                aCallback_Sub1_3988.method82(bool, component);
                            } else {
                                Class.forName("Class208").getDeclaredMethod("method2045", new
                                        Class[]{aClass4007 == null ? aClass4007 = method3646("java.awt.Component") : aClass4007, Boolean.TYPE}).invoke
                                        (anObject3990, component, bool);
                            }
                        } else if (!aBoolean3985 && i == 17) {
                            Object[] objects = (Object[]) class241.anObject2954;
                            Class.forName("Class208").getDeclaredMethod("method2047", new
                                    Class[]{aClass4007 == null ? aClass4007 = method3646("java.awt.Component") : aClass4007, aClass4008 == null ? aClass4008 =
                                    method3646("[I") : aClass4008, Integer.TYPE, Integer.TYPE,
                                    aClass4009 == null ? aClass4009 = method3646("java.awt.Point")
                                            : aClass4009}).invoke(anObject3990, objects[0],
                                    objects[1], class241.anInt2952, class241.anInt2951, objects[2]);
                        } else if (i == 16) {
                            try {
                                if (!aString3981.startsWith("win")) {
                                    throw new Exception();
                                }
                                String string = (String) class241.anObject2954;
                                if (!string.startsWith("http://") && !string.startsWith
                                        ("https://")) {
                                    throw new Exception();
                                }
                                String string_18_ =
                                        "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                for (int i_19_ = 0; string.length() > i_19_; i_19_++) {
                                    if (string_18_.indexOf(string.charAt(i_19_)) == -1) {
                                        throw new Exception();
                                    }
                                }
                                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + string + "\"");
                                class241.anObject2956 = null;
                            } catch (Exception exception) {
                                class241.anObject2956 = exception;
                                throw exception;
                            }
                        } else {
                            throw new Exception("");
                        }
                    } else if (aBoolean3985) {
                        class241.anObject2956 = aClass11_3997.method193();
                    } else {
                        class241.anObject2956 = Class.forName("Display").getMethod("listmodes", new
                                Class[0]).invoke(anObject3980);
                    }
                }
                class241.anInt2953 = 1;
            } catch (Throwable throwable) {
                class241.anInt2953 = 2;
            }
            synchronized (class241) {
                class241.notify();
            }
        }
    }

    SignLink(int i, String string, boolean bool) throws Exception {
        aClass241_3986 = null;
        aFileOnDisk3994 = null;
        aFileOnDisk3992 = null;
        aBoolean3985 = false;
        aString3987 = string;
        aString3995 = "1.1";
        aString3989 = "Unknown";
        aBoolean4005 = bool;
        anInt3978 = i;
        try {
            aString3989 = System.getProperty("java.vendor");
            aString3995 = System.getProperty("java.version");
        } catch (Exception exception) {
            /* empty */
        }
        if (aString3989.toLowerCase().contains("microsoft")) {
            aBoolean3985 = true;
        }
        String aString4001;
        try {
            aString4001 = System.getProperty("os.name");
        } catch (Exception exception) {
            aString4001 = "Unknown";
        }
        aString3981 = aString4001.toLowerCase();
        try {
            aString3984 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception exception) {
            aString3984 = "";
        }
        try {
            aString3982 = System.getProperty("os.version").toLowerCase();
        } catch (Exception exception) {
            aString3982 = "";
        }
        try {
            aString3996 = System.getProperty("user.home");
            if (aString3996 != null) {
                aString3996 += "/";
            }
        } catch (Exception exception) {
            /* empty */
        }
        if (aString3996 == null) {
            aString3996 = "~/";
        }
        try {
            anEventQueue4002 = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable throwable) {
            /* empty */
        }
        if (!aBoolean3985) {
            try {
                aMethod4004 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } catch (Exception exception) {
                /* empty */
            }
            try {
                aMethod4000 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
            } catch (Exception exception) {
                /* empty */
            }
        }
        Class351.method4005(anInt3978, aString3987, 15728);
        if (aBoolean4005) {
            aFileOnDisk3994 = new FileOnDisk(Objects.requireNonNull(Class351.method4004((byte) 91, null, anInt3978, "random.dat")), 25L);
            aFileOnDisk3979 = new FileOnDisk(Class351.method4003("main_file_cache.dat2", 84), 314572800L);
            aFileOnDisk3992 = new FileOnDisk(Class351.method4003("main_file_cache.idx255", 86), 1048576L);
            aFileOnDiskArray4003 = new FileOnDisk[Class150_Sub1.INDEXES_COUNT];
            for (int i_21_ = 0; i_21_ < Class150_Sub1.INDEXES_COUNT; i_21_++)
                aFileOnDiskArray4003[i_21_] = new FileOnDisk(Class351.method4003("main_file_cache.idx" + i_21_, 66), 1048576L);
            if (aBoolean3985) {
                try {
                    anObject3991 = Class.forName("Class149").newInstance();
                } catch (Throwable throwable) {
                    /* empty */
                }
            }
            try {
                if (aBoolean3985) {
                    aClass11_3997 = new Class11();
                } else {
                    anObject3980 = Class.forName("Display").newInstance();
                }
            } catch (Throwable throwable) {
                /* empty */
            }
            try {
                if (aBoolean3985) {
                    aCallback_Sub1_3988 = new Callback_Sub1();
                } else {
                    anObject3990 = Class.forName("Class208").newInstance();
                }
            } catch (Throwable throwable) {
                /* empty */
            }
        }
        if (aBoolean4005 && !aBoolean3985) {
            ThreadGroup threadgroup = Thread.currentThread().getThreadGroup();
            for (ThreadGroup threadgroup_22_ = threadgroup.getParent(); threadgroup_22_ != null; threadgroup_22_ = threadgroup.getParent())
                threadgroup = threadgroup_22_;
            Thread[] threads = new Thread[1000];
            threadgroup.enumerate(threads);
            for (Thread thread : threads) {
                if (thread != null && thread.getName().startsWith("AWT")) {
                    thread.setPriority(1);
                }
            }
        }
        aBoolean3993 = false;
        aThread3998 = new Thread(this);
        aThread3998.setPriority(10);
        aThread3998.setDaemon(true);
        aThread3998.start();
    }

    /*synthetic*/
    static Class<?> method3646(String string) {
        Class<?> var_class;
        try {
            var_class = Class.forName(string);
        } catch (ClassNotFoundException classnotfoundexception) {
            throw (NoClassDefFoundError) new NoClassDefFoundError().initCause(classnotfoundexception);
        }
        return var_class;
    }
}
