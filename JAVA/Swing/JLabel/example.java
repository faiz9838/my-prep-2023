package JAVA.Swing.JLabel;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class example extends JPanel {
    public example() {
        JLabel lblOne = new JLabel("The login username or password is not");
        add(lblOne);

        JLabel lblTwo = new JLabel("Please enter correct username and password");
        add(lblTwo);
    }

    public static void main(String[] args) {
        JFrame frm = new JFrame("Invalid Login");
        example lblLogin = new example();
        frm.getContentPane().add("Center", lblLogin);
        frm.setSize(300, 200);
        frm.setVisible(true);

        frm.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent Event) {
                System.exit(0);
            }
        });

    }
}
