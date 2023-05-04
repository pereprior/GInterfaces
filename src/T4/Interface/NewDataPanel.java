package T4.Interface;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * @author Pere Prior
 */
public class NewDataPanel extends JPanel {

    public enum DataType {
        TEAM, PLAYER
    }
    private final String[] TEAM_MESSAGES = new String[] {"League country:","League name:","Team name:","Trainer name:"};
    private final String[] PLAYER_MESSAGES = new String[] {"Player position:","Player name:","Player birthdate:","Player height:","Player number:","Player team:"};
    private static final ArrayList<JTextField> textFields = new ArrayList<>();
    protected JButton SAVE_BUTTON = new JButton("--> SAVE <--");
    protected JButton DATA_BUTTON = new JButton();


    public NewDataPanel(DataType dataType){
        if (dataType.equals(DataType.TEAM)){
            createInputs(TEAM_MESSAGES);
        } else if (dataType.equals(DataType.PLAYER)){
            createInputs(PLAYER_MESSAGES);
        }

        if (dataType.equals(DataType.TEAM)){
            DATA_BUTTON.setText("VIEW TEAMS");
        } else if (dataType.equals(DataType.PLAYER)){
            DATA_BUTTON.setText("VIEW PLAYERS");
        }
        SAVE_BUTTON.setPreferredSize(new Dimension(130, 40));
        DATA_BUTTON.setPreferredSize(new Dimension(130, 40));
        add(SAVE_BUTTON);
        add(DATA_BUTTON);
    }

    private void createInputs(String[] messages) {
        for (String message : messages) {
            add(new JLabel(message));
            JTextField textField = new JTextField();
            textField.setPreferredSize(new Dimension(225, 25));
            add(textField);
            textFields.add(textField);
        }
    }

    public static ArrayList<String> getTextFromFields(){
        ArrayList<String> arrayList = new ArrayList<>();
        for (JTextField textField : textFields) {
            arrayList.add(textField.getText());
        }
        return arrayList;
    }

}
