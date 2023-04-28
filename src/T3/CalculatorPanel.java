package T3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Pere Prior
 */
public class CalculatorPanel extends JPanel implements ActionListener {

    private static final String[] PRINT_VALUES = {"OFF", "C", "CE", "=", "7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", " ", "0", ".", "/"};
    private static final StringBuilder RESULT = new StringBuilder();
    private final JTextField resultField;

    public CalculatorPanel() {
        resultField = new JTextField();
        resultField.setText("0");
        resultField.setPreferredSize(new Dimension(275, 40));
        resultField.setEditable(false);
        this.add(resultField);

        for (String value : PRINT_VALUES) {
            JButton button = new JButton(value);
            button.setPreferredSize(new Dimension(65, 50));
            button.addActionListener(this);
            this.add(button);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String buttonText = e.getActionCommand();

        if (resultField.getText().equals("NaN")) {
            RESULT.setLength(0);
        }

        switch (e.getActionCommand()){
            case "OFF":
                System.exit(0);
                break;
            case "=":
                String sequence = RESULT.append(buttonText).toString();
                RESULT.setLength(0);
                RESULT.append(Calculator.arithmeticOperations(sequence));
                break;
            case "CE":
                if(!RESULT.isEmpty()){
                    RESULT.delete(RESULT.length() - 1, RESULT.length());
                }
                break;
            case "C":
                RESULT.setLength(0);
                break;
            default:
                RESULT.append(buttonText);
                break;
        }

        resultField.setText(RESULT.toString());
    }

}
