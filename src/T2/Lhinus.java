package T2;

import javax.swing.*;

public class Lhinus extends JFrame {

    public Lhinus(){
        this.setTitle("Lhinus the Destroyer");
        this.setBounds(750,300,250,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        LhinusOptions options = new LhinusOptions();
        this.add(options);
    }

}
