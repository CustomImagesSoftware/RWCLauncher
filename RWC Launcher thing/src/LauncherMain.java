import Actions.Discord;
import Actions.LiveMap;
import Actions.Website;

import javax.swing.*;

public class LauncherMain {


    public static final String NAME = "RWC Resources";
    public static final int WIDTH = 400;
    public static final int HEIGHT = 600;

    private static JFrame frame = new JFrame(NAME);
    private static JPanel panel = new JPanel();

    private static JButton launch = new JButton("Play");
    private static JButton web = new JButton("Server Website");
    private static JButton tcnews = new JButton("Traincraft News");
    private static JButton discord = new JButton("Join Our Discord Server");
    private static JButton livemap = new JButton("Live Map");

    public static void window(){

        panel.add(launch);
        panel.add(web);
        panel.add(tcnews);
        panel.add(discord);
        panel.add(livemap);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.setVisible(true);

        frame.add(panel);

        web.addActionListener(new Website());
        livemap.addActionListener(new LiveMap());
        discord.addActionListener(new Discord());


    }




    public static void main(String args[]){
        window();
    }



}
