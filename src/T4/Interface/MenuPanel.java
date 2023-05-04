package T4.Interface;

import javax.swing.*;
import java.awt.*;

/**
 * @author Pere Prior
 */
public class MenuPanel extends JPanel {

    private final JPanel INTERFACE_PANEL = new JPanel();
    protected final JButton FIRST_OPTION = new JButton();
    protected final JButton SECOND_OPTION = new JButton();

    public MenuPanel(String imageRoute, String firstOption, String secondOption){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        ImageIcon icon = new ImageIcon("/home/pprior/"+imageRoute);
        JLabel backgroundLabel = new JLabel(icon);
        backgroundLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 15, 0));
        INTERFACE_PANEL.add(backgroundLabel, BorderLayout.CENTER);

        FIRST_OPTION.setPreferredSize(new Dimension(200, 50));
        FIRST_OPTION.setText(firstOption);
        SECOND_OPTION.setPreferredSize(new Dimension(200, 50));
        SECOND_OPTION.setText(secondOption);

        INTERFACE_PANEL.add(FIRST_OPTION);
        INTERFACE_PANEL.add(SECOND_OPTION);

        JLabel authorLabel = new JLabel("Author: Pere Prior");
        authorLabel.setHorizontalAlignment(JLabel.CENTER);
        authorLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
        this.add(authorLabel);
        this.add(INTERFACE_PANEL);
    }
}

