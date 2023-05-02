package T4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * @author Pere Prior
 */
public class PanelCreator extends JPanel {

    private final JPanel INTERFACE_PANEL = new JPanel();
    protected final JButton FIRST_OPTION = new JButton("0");
    protected final JButton SECOND_OPTION = new JButton("1");

    public PanelCreator(String imageRoute){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        ImageIcon icon = new ImageIcon(imageRoute);
        JLabel backgroundLabel = new JLabel(icon);
        backgroundLabel.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
        INTERFACE_PANEL.add(backgroundLabel, BorderLayout.CENTER);

        FIRST_OPTION.setPreferredSize(new Dimension(200, 50));
        SECOND_OPTION.setPreferredSize(new Dimension(200, 50));

        INTERFACE_PANEL.add(FIRST_OPTION);
        INTERFACE_PANEL.add(SECOND_OPTION);
        this.add(INTERFACE_PANEL);

        JLabel authorLabel = new JLabel("Author: Pere Prior");
        authorLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
        this.add(authorLabel, BorderLayout.SOUTH);
    }
}

