package JAVA.Swing.TextArea;

import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

public class example extends JPanel {
    JLabel lblFirstName, lblLastName, lblAddress;
    JTextField txtFirstName, txtLastName;
    TextArea txtAreaAddress;

    example() {
        setLayout(null);

        lblFirstName = new JLabel("First name: ");
        lblLastName = new JLabel("Last name: ");
        txtFirstName = new JTextField(15);
        txtLastName = new JTextField(15);
        lblAddress = new JLabel("Address: ");
        txtAreaAddress = new TextArea(10, 10);

        lblFirstName.setBounds(10, 20, 120, 25);
        txtFirstName.setBounds(150, 20, 210, 25);
        lblLastName.setBounds(10, 60, 180, 25);
        txtLastName.setBounds(150, 60, 210, 25);
        lblAddress.setBounds(10, 100, 250, 25);
        txtAreaAddress.setBounds(150, 100, 280, 100);

        add(lblFirstName);
        add(txtFirstName);
        add(lblLastName);
        add(txtLastName);
        add(lblAddress);
        add(txtAreaAddress);

    }

    public static void main(String[] args) {
        example ex = new example();
        JFrame frm = new JFrame("Login Form");
        frm.setContentPane(ex);
        frm.setSize(500, 350);
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
