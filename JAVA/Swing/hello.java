package JAVA.Swing;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class hello extends JFrame {
    public static void main(String[] args) {
        JFrame frm = new JFrame("Welcome");
        Container contianer = frm.getContentPane();
        contianer.add(new Label("Faiz Ahmad", JLabel.CENTER));
        frm.setSize(200, 200);
        frm.setVisible(true);

        WindowListener window = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

        };
        frm.addWindowListener(window);

    }

}
