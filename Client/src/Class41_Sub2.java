/* Class41_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

public class Class41_Sub2 extends Class41
{
	private ProxySelector aProxySelector5548 = ProxySelector.getDefault();
	static Class aClass5549;
	static Class aClass5550;
	
	private final Socket method438(byte b, Proxy proxy) throws IOException {
		if (proxy.type() == Proxy.Type.DIRECT) {
			return method434(false);
		}
		java.net.SocketAddress socketaddress = proxy.address();
		if (!(socketaddress instanceof InetSocketAddress)) {
			return null;
		}
		if (b != -68) {
			aProxySelector5548 = null;
		}
		InetSocketAddress inetsocketaddress = (InetSocketAddress) socketaddress;
		if (proxy.type() == Proxy.Type.HTTP) {
			String string = null;
			try {
				Class var_class = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
				Method method = var_class.getDeclaredMethod("getProxyAuth", aClass5549 == null ? aClass5549 = method440("java.lang.String") : aClass5549, Integer.TYPE);
				method.setAccessible(true);
				Object object = method.invoke(null, inetsocketaddress.getHostName(), new Integer(inetsocketaddress.getPort()));
				if (null != object) {
					Method method_0_ = var_class.getDeclaredMethod("supportsPreemptiveAuthorization");
					method_0_.setAccessible(true);
					if (((Boolean) method_0_.invoke(object)).booleanValue()) {
						Method method_1_ = var_class.getDeclaredMethod("getHeaderName");
						method_1_.setAccessible(true);
						Method method_2_ = var_class.getDeclaredMethod("getHeaderValue", aClass5550 == null ? aClass5550 = method440("java.net.URL") : aClass5550, aClass5549 == null ? aClass5549 = method440("java.lang.String") : aClass5549);
						method_2_.setAccessible(true);
						String string_3_ = (String) method_1_.invoke(object);
						String string_4_ = (String) method_2_.invoke(object, new URL("https://" + aString625 + "/"), "https");
						string = string_3_ + ": " + string_4_;
					}
				}
			} catch (Exception exception) {
				/* empty */
			}
			return method439(inetsocketaddress.getHostName(), inetsocketaddress.getPort(), string);
		}
		if (proxy.type() == Proxy.Type.SOCKS) {
			Socket socket = new Socket(proxy);
			socket.connect(new InetSocketAddress(aString625, anInt624));
			return socket;
		}
		return null;
	}
	
	private final Socket method439(String string, int i, String string_5_) throws IOException {
		Socket socket = new Socket(string, i);
		socket.setSoTimeout(10000);
		OutputStream outputstream = socket.getOutputStream();
		if (string_5_ == null) {
			outputstream.write(("CONNECT " + aString625 + ":" + anInt624 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			outputstream.write(("CONNECT " + aString625 + ":" + anInt624 + " HTTP/1.0\n" + string_5_ + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
		}
		outputstream.flush();
		BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String string_6_ = bufferedreader.readLine();
		if (string_6_ != null) {
			if (string_6_.startsWith("HTTP/1.0 200") || string_6_.startsWith("HTTP/1.1 200")) {
				return socket;
			}
			if (string_6_.startsWith("HTTP/1.0 407") || string_6_.startsWith("HTTP/1.1 407")) {
				int i_7_ = 0;
				String string_8_ = "proxy-authenticate: ";
				for (string_6_ = bufferedreader.readLine(); string_6_ != null && (i_7_ ^ 0xffffffff) > -51; string_6_ = bufferedreader.readLine()) {
					if (string_6_.toLowerCase().startsWith(string_8_)) {
						string_6_ = string_6_.substring(string_8_.length()).trim();
						int i_9_ = string_6_.indexOf(' ');
						if (-1 != i_9_) {
							string_6_ = string_6_.substring(0, i_9_);
						}
						throw new IOException_Sub1(string_6_);
					}
					i_7_++;
				}
				throw new IOException_Sub1("");
			}
		}
		outputstream.close();
		bufferedreader.close();
		socket.close();
		return null;
	}
	
	final Socket method435(int i) throws IOException {
		boolean bool = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!bool) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		boolean bool_10_ = Settings.PORT_ID == anInt624;
		List list;
		List list_11_;
		try {
			list = aProxySelector5548.select(new URI((bool_10_ ? "https" : "http") + "://" + aString625));
			list_11_ = aProxySelector5548.select(new URI((!bool_10_ ? "https" : "http") + "://" + aString625));
			if (i != 30749) {
				aProxySelector5548 = null;
			}
		} catch (URISyntaxException urisyntaxexception) {
			return method434(false);
		}
		list.addAll(list_11_);
		Object[] objects = list.toArray();
		IOException_Sub1 ioexception_sub1 = null;
		Object[] objects_12_ = objects;
		for (int i_13_ = 0; (i_13_ ^ 0xffffffff) > (objects_12_.length ^ 0xffffffff); i_13_++) {
			Object object = objects_12_[i_13_];
			Proxy proxy = (Proxy) object;
			Socket socket;
			try {
				Socket socket_14_ = method438((byte) -68, proxy);
				if (null == socket_14_) {
					continue;
				}
				socket = socket_14_;
			} catch (IOException_Sub1 ioexception_sub1_15_) {
				ioexception_sub1 = ioexception_sub1_15_;
				continue;
			} catch (IOException ioexception) {
				continue;
			}
			return socket;
		}
		if (ioexception_sub1 != null) {
			throw ioexception_sub1;
		}
		return method434(false);
	}
	
	static Class method440(String string) {
		Class var_class;
		try {
			var_class = Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			throw (NoClassDefFoundError) new NoClassDefFoundError().initCause(classnotfoundexception);
		}
		return var_class;
	}
}
