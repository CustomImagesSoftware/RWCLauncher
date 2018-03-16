package Actions;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;

public class Discord implements ActionListener {


    public void actionPerformed(ActionEvent e) {
        String URL = "https://discord.gg/sSmHXSs";

        try {
            Desktop.getDesktop().browse(URI.create(URL));
        } catch (IOException var4) {
            ;
        }
    }
}
