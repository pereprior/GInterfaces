package T4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {

    private final PanelCreator panel = new PanelCreator("/home/pprior/main.png");

    public Menu() {
        setSize(275, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.FIRST_OPTION.addActionListener(this);
        panel.FIRST_OPTION.setText("TEAMS MANAGER");
        panel.SECOND_OPTION.addActionListener(this);
        panel.SECOND_OPTION.setText("PLAYERS MANAGER");

        add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("0")){
            this.remove(panel);
        }
    }
}
