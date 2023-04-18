package T1.ej2;

import javax.swing.*;

/**
 * @author Pere Prior
 */
public class Bucle {

    public static void main(String[] args) {
        StringBuilder message = new StringBuilder();
        while (true){
            String inputDialog = JOptionPane.showInputDialog(null, "Enter random text:");
            if (inputDialog.equalsIgnoreCase("fin")) {
                JOptionPane.showMessageDialog(null, message);
                break;
            }else{
                message.append(inputDialog).append("\n");
                JOptionPane.showMessageDialog(null, "The message is stored correctly");
            }
        }
    }

}
