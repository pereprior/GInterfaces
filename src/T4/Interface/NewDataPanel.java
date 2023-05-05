package T4.Interface;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Pere Prior
 */
public class NewDataPanel extends JPanel {

    public enum DataType {
        TEAM, PLAYER
    }
    private final String[] TEAM_MESSAGES = new String[] {"Team Name:","Team Country:","Team League:","Coach name:"};
    private final String[] PLAYER_MESSAGES = new String[] {"Player position:","Player name:","Player birthdate:","Player height:","Player number:","Player team:"};
    protected static final ArrayList<JTextField> textFields = new ArrayList<>();
    protected JButton SAVE_BUTTON = new JButton("--> SAVE <--");
    protected JButton DATA_BUTTON = new JButton();


    public NewDataPanel(DataType dataType){
        if (dataType.equals(DataType.TEAM)){
            ImageIcon icon = new ImageIcon("/home/pprior/coach.png");
            JLabel backgroundLabel = new JLabel(icon);
            backgroundLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
            add(backgroundLabel, BorderLayout.CENTER);
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

    public static void setEmptyFields(){
        for (JTextField textField : textFields) {
            textField.setText("");
        }
    }

}
