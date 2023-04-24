package T2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

/**
 * @author Pere Prior
 */
public class LhinusOptions extends JPanel implements ActionListener {

    JButton windowCreator = new JButton("Window Creator");
    JButton windowDestructor = new JButton("Window Destructor");
    Stack<Window> windows = new Stack<>();

    public LhinusOptions(){
        add(windowCreator);
        add(windowDestructor);
        windowCreator.addActionListener(this);
        windowDestructor.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == windowCreator){
            windows.add(new Window());
        }else if(ae.getSource()== windowDestructor){
            windows.pop().setVisible(false);
            Window.resetWindowID();
        }
    }
}
