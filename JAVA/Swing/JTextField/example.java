package JAVA.Swing.JTextField;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

public class example extends JPanel {
    JLabel lblUsername;
    JLabel lblPassword;

    JTextField txtUsername;
    JPasswordField userPassowrd;

    example() {
        lblUsername = new JLabel("Username: ");
        txtUsername = new JTextField(10);
        lblPassword = new JLabel("Password: ");
        userPassowrd = new JPasswordField(10);

        userPassowrd.setEchoChar('*');

        txtUsername.setToolTipText("Enter username");
        userPassowrd.setToolTipText("Enter a password");

        add(lblUsername);
        add(txtUsername);
        add(lblPassword);
        add(userPassowrd);

    }

    public static void main(String[] args) {
        example ex = new example();
        JFrame frm = new JFrame();
        frm.setContentPane(ex);
        frm.setSize(200, 150);
        frm.setVisible(true);

        WindowListener window = new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent Event) {
                System.exit(0);
            }

        };

        frm.addWindowListener(window);
    }
}
