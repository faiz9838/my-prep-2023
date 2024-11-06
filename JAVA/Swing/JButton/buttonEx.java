package JAVA.Swing.JButton;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class buttonEx extends JFrame {

    public buttonEx() {
        super("Buttons");

        JButton btn1 = new JButton("Button 1");

        JButton btn2 = new JButton("Button 2");

        JPanel pnl = new JPanel();

        pnl.add(btn1);
        pnl.add(btn2);

        btn1.setToolTipText("Button 1");
        btn2.setToolTipText("Button 2");

        setContentPane(pnl);
    }

    public static void main(String[] args) {

        buttonEx btns = new buttonEx();
        btns.setSize(300, 200);
        btns.setVisible(true);
        WindowFocusListener window = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent event) {
                System.exit(0);
            }
        };
        btns.addWindowFocusListener(window);
    }
}
