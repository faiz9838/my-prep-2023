package JAVA.Swing.JPanel;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class hello extends JFrame {
    public hello() {
        super("Hello World");

        JButton btnAdd = new JButton("Add");
        JButton btnEdit = new JButton("Edit");
        JButton btnDelete = new JButton("Add");
        JButton btnView = new JButton("Edit");

        JPanel pnlMenu = new JPanel();

        // Adding button into panel
        pnlMenu.add(btnAdd);
        pnlMenu.add(btnEdit);
        pnlMenu.add(btnDelete);
        pnlMenu.add(btnView);

        btnAdd.setMnemonic('a');
        btnEdit.setMnemonic('e');
        btnDelete.setMnemonic('d');
        btnView.setMnemonic('v');

        btnAdd.setToolTipText("To add new constacts");
        btnEdit.setToolTipText("To edit existing contacts");
        btnDelete.setToolTipText("To delete existing contacts");
        btnView.setToolTipText("To view existing contacts");

        setContentPane(pnlMenu);

    }

    public static void main(String[] args) {

        hello hell = new hello();

        hell.setSize(300, 200);
        hell.setVisible(true);

        WindowListener window = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent winEvt) {
                System.exit(0);
            }

        };

        hell.addWindowListener(window);
    }

}
