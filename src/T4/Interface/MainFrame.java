package T4.Interface;

import T4.Data.Player;
import T4.Data.Team;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * @author Pere Prior
 */
public class MainFrame extends JFrame implements ActionListener {

    private MenuPanel menu;
    private NewDataPanel newData;
    private ViewDataPanel viewData;
    private ArrayList<Player> playersList = new ArrayList<>();
    private ArrayList<Team> teamsList = new ArrayList<>();


    public MainFrame() {
        setSize(300, 375);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menu = new MenuPanel("main.png","TEAMS MANAGER","PLAYERS MANAGER");
        menu.FIRST_OPTION.addActionListener(this);
        menu.SECOND_OPTION.addActionListener(this);
        add(menu);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()){
            case "TEAMS MANAGER":
                nextAddPanel(NewDataPanel.DataType.TEAM);
                break;
            case "PLAYERS MANAGER":
                nextAddPanel(NewDataPanel.DataType.PLAYER);
                break;
            case "--> SAVE <--":
                ArrayList<String> data = NewDataPanel.getTextFromFields();
                if(data.size()>5){
                    playersList.add(new Player(data));
                    JOptionPane.showMessageDialog(null,"The new player is added correctly");
                } else {
                    teamsList.add(new Team(data));
                    JOptionPane.showMessageDialog(null,"The new team is added correctly");
                }
                NewDataPanel.setEmptyFields();
                break;
            case "VIEW TEAMS":
                if (teamsList.isEmpty()){
                    JOptionPane.showMessageDialog(null,"There's no elements");
                } else {
                    nextViewPanel("TEAMS:",teamDataList(teamsList),true);
                }
                break;
            case "VIEW PLAYERS":
                if (playersList.isEmpty()){
                    JOptionPane.showMessageDialog(null,"There's no elements");
                } else {
                    nextViewPanel("PLAYERS:",playerDataList(playersList),false);
                }
                break;
            case "<-- RETURN <--":
                NewDataPanel.textFields.clear();
                remove(viewData);
                add(menu);
                revalidate();
                repaint();
                break;
        }
    }

    private void nextAddPanel(NewDataPanel.DataType dataType){
        remove(menu);
        newData =new NewDataPanel(dataType);
        newData.SAVE_BUTTON.addActionListener(this);
        newData.DATA_BUTTON.addActionListener(this);
        add(newData);
        revalidate();
        repaint();
    }

    private void nextViewPanel(String firstOption, ArrayList<String> firstList, boolean isTeam){
        remove(newData);
        if(isTeam){
            viewData =new ViewDataPanel(firstOption,firstList,teamsList);
        } else {
            viewData =new ViewDataPanel(firstOption,firstList,playersList);
        }
        viewData.EXIT_BUTTON.addActionListener(this);
        add(viewData);
        revalidate();
        repaint();
    }

    private ArrayList<String> teamDataList(ArrayList<Team> teams){
        ArrayList<String> teamList = new ArrayList<>();
        for(int i = 0; i<teams.size(); i++){
            teamList.add(teamsList.get(i).getName());
        }
        return teamList;
    }

    private ArrayList<String> playerDataList(ArrayList<Player> teams){
        ArrayList<String> playerList = new ArrayList<>();
        for(int i = 0; i<teams.size(); i++){
            playerList.add(playersList.get(i).getName());
        }
        return playerList;
    }

}
