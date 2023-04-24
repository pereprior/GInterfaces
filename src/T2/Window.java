package T2;

import javax.swing.*;

public class Window extends JFrame {

    private static int windowID = 0;

    public Window(){
        windowID++;
        setTitle("Window "+windowID);
        setSize(200,100);

        setVisible(true);
    }

    public static void resetWindowID() {
        Window.windowID--;
    }
}
