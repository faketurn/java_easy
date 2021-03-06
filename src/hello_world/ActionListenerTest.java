package hello_world;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerTest extends Frame implements ActionListener {
    ActionListenerTest() {
        super("ActionListenerTest");
        Button b1 = new Button("ボタン1");
        b1.addActionListener(this);
        add(b1);
        setSize(200, 100);
        show();
    }

    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }

    public static void main(String[] args) {
        new ActionListenerTest();
    }
}
