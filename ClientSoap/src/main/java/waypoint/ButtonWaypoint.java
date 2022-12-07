package waypoint;

import java.awt.*;
import java.util.Objects;
import javax.print.attribute.standard.Media;
import javax.swing.*;
import javax.swing.plaf.IconUIResource;

public class ButtonWaypoint extends JButton {

    public ButtonWaypoint() {
        setContentAreaFilled(false);
        ImageIcon ic = new ImageIcon("C:/Users/user/OneDrive/Bureau/Polytech/mwsoc/Nouveau dossier (2)/javaSwingGoogleMaps/src/main/java/waypoint/pin.png");
        if(ic.getImageLoadStatus() == MediaTracker.COMPLETE){
            System.out.println("Image successfully loaded!");
        }
        setIcon(ic);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setSize(new Dimension(50, 50));
    }
}
