package T1.ej1;

import javax.swing.*;

/**
 * @author Pere Prior
 */
public class Window extends JFrame {

    private JFrame frame;

    public Window() {
        frame = new JFrame();
        frame.setTitle("MAIN WINDOW");
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JDialog dialog = new JDialog(this, false);
        dialog.setTitle("SECONDARY WINDOW");
        dialog.setSize(200, 100);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }

}
