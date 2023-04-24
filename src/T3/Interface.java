package T3;


import javax.swing.*;
import java.awt.*;

/**
 * @author Pere Prior
 */
public class Interface extends JFrame {

    public Interface(){
        this.setSize(300,375);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setUndecorated(true);
        setLocationRelativeTo(null);

        CalculatorPanel options = new CalculatorPanel();
        options.setBorder(BorderFactory.createEmptyBorder(15, 0, 0, 0));
        this.add(options);

        JLabel authorLabel = new JLabel("Author: Pere Prior");
        authorLabel.setHorizontalAlignment(JLabel.CENTER);
        authorLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
        this.add(authorLabel, BorderLayout.SOUTH);
    }

}
