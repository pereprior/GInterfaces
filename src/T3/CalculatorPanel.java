package T3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Pere Prior
 */
public class CalculatorPanel extends JPanel implements ActionListener {

    private String[] printValues = {"OFF", "CE", "C", "=", "7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", " ", "0", ".", "/"};
    private JTextField resultField;
    private static StringBuilder result = new StringBuilder();

    public CalculatorPanel() {
        resultField = new JTextField();
        resultField.setText("0");
        resultField.setPreferredSize(new Dimension(275, 40));
        resultField.setEditable(false);
        this.add(resultField);

        for (String value : printValues) {
            JButton button = new JButton(value);
            button.setPreferredSize(new Dimension(65, 50));
            button.addActionListener(this);
            this.add(button);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String buttonText = e.getActionCommand();
        String sequence = "";

        switch (e.getActionCommand()){
            case "OFF":
                System.exit(0);
                break;
            case "=":
                sequence = result.append(buttonText).toString();
                result.setLength(0);
                result.append(Calculator.arithmeticOperations(sequence));
                sequence=result.toString();
                break;
            case "CE":
                result.delete(result.length() - 1, result.length());
                sequence = result.toString();
                break;
            case "C":
                result.setLength(0);
                sequence="0";
                break;
            default:
                sequence = result.append(buttonText).toString();
                break;
        }

        resultField.setText(sequence);
    }

}
