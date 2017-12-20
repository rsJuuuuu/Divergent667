package com.fox.components;

import com.fox.Settings;
import com.fox.listeners.ButtonListener;
import com.fox.utils.Utils;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicProgressBarUI;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class AppFrame extends JFrame {
    private static final long serialVersionUID = -3130053101521666537L;
    private static Point initialClick;

    public static int appWidth, appHeight;

    public AppFrame() {

        setPreferredSize(Settings.frameSize);

        appWidth = (int) getPreferredSize().getWidth();
        appHeight = (int) getPreferredSize().getHeight();

        setUndecorated(true);
        setTitle(Settings.SERVER_NAME);
        setLayout(null);
        getRootPane().setBorder(new LineBorder(Color.BLACK));
        getContentPane().setBackground(Settings.backgroundColor);

        addMenuBar();
        addNewsBox();
        addLinks();
        //addHeader();
        addPlayButton();
        addProgressBar();
        setIconImage(Settings.getIconImage().getImage());
        addMouseListener();
        pack();
    }

    public static JProgressBar pbar;

    private void addProgressBar() {
        pbar = new JProgressBar();

        pbar.setUI(new BasicProgressBarUI() {
            protected Color getSelectionBackground() {
                return Settings.primaryColor;
            }

            protected Color getSelectionForeground() {
                return Settings.primaryColor;
            }
        });

        pbar.setBounds(100, appHeight - 35, appWidth - 100, 35);
        pbar.setBackground(Settings.backgroundColor.darker());
        pbar.setBorderPainted(false);
        pbar.setStringPainted(true);
        pbar.setString("Click Launch to play " + Settings.SERVER_NAME + "!");
        pbar.setBorder(new EmptyBorder(0, 0, 0, 0));
        pbar.setForeground(new Color(25, 25, 25));
        Utils.setFont(pbar, "OpenSans-Regular.ttf", 13);
        add(pbar);
    }

    public static Control playButton = new Control("Launch");

    private void addPlayButton() {
        playButton.setActionCommand("play");
        playButton.setBackground(Settings.primaryColor);
        playButton.addActionListener(new ButtonListener());
        // (appWidth / 2) - (167 / 2)
        playButton.setBounds(0, appHeight - 35, 100, 35);
        Utils.setFont(playButton, "OpenSans-Regular.ttf", 16);
        add(playButton);
    }

    public static JLabel tooltip;
    public static IconLabel serverTime;
    public static IconLabel playerCount;

    private void addLinks() {
        tooltip = new JLabel("");
        tooltip.setBounds(135, appHeight - 120, 335, 25);
        tooltip.setHorizontalAlignment(SwingConstants.CENTER);
        Utils.setFont(tooltip, "OpenSans-Light.ttf", 16);
        tooltip.setForeground(Settings.tooltipColor);
        add(tooltip);

        if (Settings.addLinks) {
            IconLabel forum = new IconLabel("\uf086", "Community", 50);
            forum.setBounds(135, 170, 64, 64);
            add(forum);

            IconLabel hs = new IconLabel("\uf080", "Leaderboards", 50);
            hs.setBounds(205, 170, 64, 64);
            add(hs);

            IconLabel shop = new IconLabel("\uf07a", "Shopping Center", 50);
            shop.setBounds(275, 170, 64, 64);
            add(shop);

            IconLabel vote = new IconLabel("\uf046", "Vote for Us", 50);
            vote.setBounds(345, 172, 64, 64);
            add(vote);

            IconLabel web = new IconLabel("\uf188", "Report an Issue", 50);
            web.setBounds(415, 172, 64, 64);
            add(web);
        }

        if (Settings.enableMusicPlayer) {
            IconLabel music = new IconLabel("\uf205", "Music", "FontAwesome.ttf", 16);
            music.setBounds(appWidth - 32, appHeight - 60, 24, 18);
            add(music);

            IconLabel musicLabel = new IconLabel("Music", 12);
            musicLabel.setBounds(appWidth - 75, appHeight - 60, 36, 18);
            add(musicLabel);
        }

        serverTime = new IconLabel("Server Time: 1:50 PM", 12);
        serverTime.setBounds(appWidth - 170, 25, 175, 18);
        add(serverTime);

		/*playerCount = new IconLabel("There are 10 player(s) Online!", 12);
		playerCount.setForeground(Color.white);
		playerCount.setBounds(65, 105, 200, 18);
		add(playerCount);*/
		
		/*JButton player = new JButton("Stop Music");
		player.setBounds(520, 378, 75, 16);
		add(player);*/
    }

    String serverStatus = "...";

    private void addNewsBox() {


        IconLabel facebook = new IconLabel("\uf082", "Facebook", 32);
        facebook.setBounds(appWidth - 35, 30, 36, 36);

        if (Settings.facebook.length() > 1) {
            add(facebook);
        }

        IconLabel twitter = new IconLabel("\uf099", "Twitter", 32);
        twitter.setBounds(appWidth - 35, 65, 36, 36);

        if (Settings.twitter.length() > 1) {
            add(twitter);
        }

        IconLabel youtube = new IconLabel("\uf167", "Youtube", 32);
        youtube.setBounds(appWidth - 35, 100, 36, 36);

        if (Settings.youtube.length() > 1) {
            add(youtube);
        }

        final int red = Settings.primaryColor.getRed();
        final int green = Settings.primaryColor.getGreen();
        final int blue = Settings.primaryColor.getBlue();

        JLabel status1 = new JLabel("Welcome to " + Settings.SERVER_NAME + "!");
        status1.setForeground(Settings.primaryColor);
        status1.setHorizontalAlignment(SwingConstants.CENTER);
        status1.setBounds(0, 25, appWidth, 75);
        Utils.setFont(status1, "OpenSans-Light.ttf", 32);
        add(status1);

        final JLabel status2 = new JLabel("<html>We are currently " + serverStatus + "!</html>");

        new Thread() {
            public void run() {
                serverStatus = Utils.hostAvailabilityCheck() ?
                        "<font color='rgb(" + red + ", " + green + ", " + blue + ")'>Online</font>" :
                        "<font color=red>Offline</font>";
                status2.setText("<html>We are currently " + serverStatus + "!</html>");
            }
        }.start();

        status2.setForeground(Color.WHITE);
        status2.setHorizontalAlignment(SwingConstants.CENTER);
        status2.setBounds(0, 75, appWidth, 30);
        Utils.setFont(status2, "OpenSans-Light.ttf", 14);
        add(status2);
    }

    private void addMenuBar() {
        MenuBar bar = new MenuBar(this);
        bar.setBounds(0, 0, appWidth, 25);
        add(bar);
    }

    private void addHeader() {
        JLabel logo = new JLabel(Utils.getImage("logo.png"));
        logo.setBounds(30, 55, 350, 60);
        add(logo);

        JLabel head = new JLabel(" ");
        head.setOpaque(true);
        head.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.2f));
        head.setBounds(-1, 25, appWidth, 114);
        add(head);
    }

    private void addMouseListener() {
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                initialClick = e.getPoint();
                getComponentAt(initialClick);
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {

                int iX = initialClick.x;
                int iY = initialClick.y;

                if (iX >= 0 && iX <= getPreferredSize().getWidth() && iY >= 0 && iY <= 25) {
                    int thisX = getLocation().x;
                    int thisY = getLocation().y;

                    int xMoved = (thisX + e.getX()) - (thisX + initialClick.x);
                    int yMoved = (thisY + e.getY()) - (thisY + initialClick.y);

                    int X = thisX + xMoved;
                    int Y = thisY + yMoved;
                    setLocation(X, Y);
                }
            }
        });
    }

}
