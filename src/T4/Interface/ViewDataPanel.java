package T4.Interface;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * @author Pere Prior
 */
public class ViewDataPanel extends JPanel {

    public ViewDataPanel(String firstOption, String secondOption, ArrayList<String> list1, ArrayList<String> list2){
        JMenuBar menuBar = new JMenuBar();
        JMenu firstMenu = new JMenu(firstOption);
        JMenu secondMenu = new JMenu(secondOption);

        for(String item : list1) {
            JMenuItem menuItem = new JMenuItem(item);
            firstMenu.add(menuItem);
        }

        for(String item : list2) {
            JMenuItem menuItem = new JMenuItem(item);
            secondMenu.add(menuItem);
        }

        menuBar.add(firstMenu);
        menuBar.add(secondMenu);
        add(menuBar);

        JList<String> dataList = new JList<>(new String[]{});
        add(dataList);
    }

}
