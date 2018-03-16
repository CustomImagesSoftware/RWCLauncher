package Actions;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;

public class LiveMap implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        String URL = "http://172.106.2.226:8181/#";

        try {
            Desktop.getDesktop().browse(URI.create(URL));
        } catch (IOException var4) {
            ;
        }
    }
}
