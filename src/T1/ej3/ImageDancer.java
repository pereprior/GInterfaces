package T1.ej3;

import T1.ej1.Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author Pere Prior
 */
public class ImageDancer extends JFrame{

    private final int PANEL_WIDTH = 600;
    private final int PANEL_HEIGHT = 500;

    public ImageDancer() {
        setTitle("Emoticone dance");
        setSize(PANEL_WIDTH, PANEL_HEIGHT);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentpane = getContentPane();
        JPanel panel = new JPanel();
        contentpane.add(panel);
        panel.setBackground(Color.RED);

        ImageIcon imageIcon = new ImageIcon("image.png");
        JLabel label = new JLabel(imageIcon);
        panel.add(label);

        panel.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();

                int maxX = PANEL_WIDTH - label.getWidth();
                int maxY = PANEL_HEIGHT - label.getHeight();

                if (x < 0) {
                    x = 0;
                } else if (x > maxX) {
                    x = maxX;
                }

                if (y < 0) {
                    y = 0;
                } else if (y > maxY) {
                    y = maxY;
                }

                label.setLocation(x, y);
            }
        });
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ImageDancer();
            }
        });
    }

}
