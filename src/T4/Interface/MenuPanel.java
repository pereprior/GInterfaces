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
    private JMenu menuArchive, menuEdit, menuView, menuLanguage;
    private JMenuItem itemSave, itemNew, itemDark, itemEs, itemEn;

    public MenuPanel(String imageRoute, String firstOption, String secondOption){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        Language language =new Language(Language.spanish);
        this.setLayout(new BorderLayout());
        JMenuBar myBar = new JMenuBar();
        menuArchive = new JMenu(language.getProperty("menuArchive"));
        itemSave = new JMenuItem(language.getProperty("itemSave"));
        itemNew = new JMenuItem(language.getProperty("itemNew"));
        itemNew.setEnabled(false);
        menuArchive.add(itemSave);
        menuArchive.add(itemNew);

        menuEdit = new JMenu(language.getProperty("menuEdit"));

        menuView = new JMenu(language.getProperty("menuView"));
        itemDark = new JMenuItem(language.getProperty("itemDark"));
        menuLanguage = new JMenu(language.getProperty("menuLanguage"));
        menuView.add(itemDark);
        menuView.addSeparator();
        menuView.add(menuLanguage);
        itemEs = new JMenuItem(language.getProperty("itemEs"));
        itemEn = new JMenuItem(language.getProperty("itemEn"));
        itemEs.addActionListener((e)-> changeLanguage(Language.spanish));
        itemEn.addActionListener((e)-> changeLanguage(Language.english));
        menuLanguage.add(itemEn);
        menuLanguage.add(itemEs);

        myBar.add(menuArchive);
        myBar.add(menuEdit);
        myBar.add(menuView);

        add(myBar, BorderLayout.NORTH);

        ImageIcon icon = new ImageIcon("/home/pprior/"+imageRoute);
        JLabel backgroundLabel = new JLabel(icon);
        backgroundLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 15, 0));
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

    public void changeLanguage(int newLang){
        Language language = new Language(newLang);
        menuArchive.setText(language.getProperty("menuArchive"));
        itemNew.setText(language.getProperty("itemNew"));
        itemSave.setText(language.getProperty("itemSave"));
        menuEdit.setText(language.getProperty("menuEdit"));
        menuView.setText(language.getProperty("menuView"));
        itemDark.setText(language.getProperty("itemDark"));
        menuLanguage.setText(language.getProperty("menuLanguage"));
        itemEn.setText(language.getProperty("itemEn"));
        itemEs.setText(language.getProperty("itemEs"));
    }
}

