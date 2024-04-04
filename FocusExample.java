import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class FocusExample {
    JFrame frame;
    JTextArea text1,text2;
    JTextArea textArea;
    FocusExample(){

        frame = new JFrame("Focus Demo");
        frame.add(text1);
        frame.add(text2);
        frame.setSize(500, 500);
        frame.getContentPane().setBackground(new Color(0, 0, 0));
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        text1.setBounds(null);
        frame.setVisible(true);
        
        text1.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                textArea.append("Focus gained in TextField 1\n");
            }

            @Override
            public void focusLost(FocusEvent e) {
                textArea.append("Focus lost in TextField 1\n");
            }
        });
        text2.addFocusListener(new FocusListener() { 
            @Override
            public void focusGained(FocusEvent e) {
                textArea.append("Focus gained in TextField 2\n");
            }

            @Override
            public void focusLost(FocusEvent e) {
                textArea.append("Focus lost in TextField 2\n");
            }
        });
    }
}
