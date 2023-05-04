package T4.Interface;

import T4.Data.Player;
import T4.Data.Team;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Objects;


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
                    System.out.println(playersList);
                } else {
                    teamsList.add(new Team(data));
                    System.out.println(teamsList);
                }
                break;
            case "VIEW TEAMS":
                nextViewPanel("Country:","League:",teamDataList(teamsList,1),teamDataList(teamsList,2));
                break;
            case "VIEW PLAYERS":
                nextViewPanel("Team:","Position:",playerDataList(playersList,1),playerDataList(playersList,2));
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

    private void nextViewPanel(String firstOption, String secondOption, ArrayList<String> firstList, ArrayList<String> secondList){
        remove(newData);
        viewData =new ViewDataPanel(firstOption,secondOption,firstList,secondList);
        add(viewData);
        revalidate();
        repaint();
    }

    private ArrayList<String> teamDataList(ArrayList<Team> teams, int columnNumber){
        ArrayList<String> teamList = new ArrayList<>();
        for(int i = 0; i<teams.size(); i++){
            if(columnNumber==1){
                teamList.add(teamsList.get(i).getCountry());
            } else if (columnNumber==2){
                teamList.add(teamsList.get(i).getLeague());
            }
        }
        return teamList;
    }

    private ArrayList<String> playerDataList(ArrayList<Player> teams, int columnNumber){
        ArrayList<String> playerList = new ArrayList<>();
        for(int i = 0; i<teams.size(); i++){
            if(columnNumber==1){
                playerList.add(playersList.get(i).getTeam());
            } else if (columnNumber==2){
                playerList.add(playersList.get(i).getPosition());
            }
        }
        return playerList;
    }

}
