package T1.ej1;

import javax.swing.*;

/**
 * @author Pere Prior
 */
public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Window();
            }
        });
    }

}
