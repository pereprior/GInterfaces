package T4.Interface;

import T4.Data.Player;
import T4.Data.Team;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * @author Pere Prior
 */
public class ViewDataPanel extends JPanel {

    protected JButton EXIT_BUTTON;

    public ViewDataPanel(String firstOption, ArrayList<String> list, ArrayList<?> arrayList){
        JMenuBar menuBar = new JMenuBar();
        JMenu firstMenu = new JMenu(firstOption);
        printTeamsData(list, firstMenu, arrayList);
        menuBar.add(firstMenu);
        add(menuBar);
        JList<String> dataList = new JList<>(new String[]{});
        add(dataList);

        Object o = arrayList.get(0);
        ImageIcon icon;
        if (o instanceof Team){
            icon = new ImageIcon("/home/pprior/team.png");
        } else if (o instanceof Player){
            icon = new ImageIcon("/home/pprior/player.png");
        } else {
            throw new IllegalArgumentException();
        }
        JLabel backgroundLabel = new JLabel(icon);
        backgroundLabel.setBorder(BorderFactory.createEmptyBorder(20, 21, 40, 20));
        add(backgroundLabel, BorderLayout.CENTER);

        EXIT_BUTTON = new JButton("<-- RETURN <--");
        EXIT_BUTTON.setPreferredSize(new Dimension(200, 50));
        add(EXIT_BUTTON);
    }

    private void printTeamsData(ArrayList<String> list, JMenu firstMenu, ArrayList<?> dataList){
        for(int i = 0; i<list.size(); i++) {
            JMenuItem menuItem = new JMenuItem(list.get(i));
            int finalI = i;
            menuItem.addActionListener(e -> {
                JOptionPane.showMessageDialog(null, dataList.get(finalI).toString());
            });
            firstMenu.add(menuItem);
        }
    }

}
