import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.net.URL;
import java.util.Properties;

public class Loader extends Applet {
    private static Properties properties = new Properties();
    private static JPanel appletPanel = new JPanel();
    static int openInterfaceId = -1;

    public static void main(String[] args) throws Exception {
        if (args.length > 0) Settings.SERVER_IP = args[0];
        Loader loader = new Loader();
        loader.doFrame();
    }

    private void loadApplet() {
        setParms();
        drawClient();
    }

    private void doFrame() {
        setParms();
        openFrame();
        drawClient();
    }

    private void setParms() {
        properties.put("cabbase", "g.cab");
        properties.put("java_arguments", "-Xmx102m -Dsun.java2d.noddraw=true");
        properties.put("colourid", "0");
        properties.put("worldid", "1");
        properties.put("lobbyid", "1");
        properties.put("lobbyaddress", Settings.SERVER_IP);
        properties.put("demoid", "0");
        properties.put("demoaddress", "");
        properties.put("modewhere", "0");
        properties.put("modewhat", "0");
        properties.put("lang", "0");
        properties.put("objecttag", "0");
        properties.put("js", "1");
        properties.put("game", "0");
        properties.put("affid", "0");
        properties.put("advert", "1");
        properties.put("settings", "wwGlrZHF5gJcZl7tf7KSRh0MZLhiU0gI0xDX6DwZ-Qk");
        properties.put("country", "0");
        properties.put("haveie6", "0");
        properties.put("havefirefox", "1");
        properties.put("cookieprefix", "");
        properties.put("cookiehost", Settings.SERVER_IP);
        properties.put("cachesubdirid", "0");
        properties.put("crashurl", "");
        properties.put("unsignedurl", "");
        properties.put("sitesettings_member", "1");
        properties.put("frombilling", "false");
        properties.put("sskey", "");
        properties.put("force64mb", "false");
        properties.put("worldflags", "8");
    }

    private void openFrame() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
        } catch (Throwable e) {
            e.getStackTrace();
        }
        JFrame appletFrame = new JFrame(Settings.SERVER_NAME);
        appletFrame.setLayout(new BorderLayout());
        appletFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        appletPanel.setLayout(new BorderLayout());
        appletPanel.add(this);
        appletPanel.setPreferredSize(new Dimension(765, 515));
        appletFrame.getContentPane().add(appletPanel, "Center");
        appletFrame.pack();
        appletFrame.setLocationRelativeTo(null);
        appletFrame.setVisible(true);
    }

    private void drawClient() {
        try {
            GameStub.provideLoaderApplet(this);
            Client client = new Client();
            client.init();
            client.start();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void init() {
        loadApplet();
    }

    @Override
    public String getParameter(String string) {
        return (String) properties.get(string);
    }

    @Override
    public URL getDocumentBase() {
        return getCodeBase();
    }

    @Override
    public URL getCodeBase() {
        URL url;
        try {
            url = new URL("http://" + Settings.SERVER_IP);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return url;
    }

}
