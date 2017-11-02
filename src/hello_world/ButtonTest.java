package hello_world;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Checkbox;
import java.awt.CheckboxMenuItem;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.List;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class ButtonTest extends Frame implements ActionListener, ItemListener {
    public static void main(String[] args) {
        new ButtonTest();
    }

    ButtonTest() {
        super("ButtonTest");
        setSize(400, 300);
        setLayout(new FlowLayout());
        Button b1 = new Button("OK");
        add(b1);
        Label l1 = new Label("Javaの世界へようこそ!");
        add(l1);
        TextField t1 = new TextField("こんにちは");
        add(t1);
        TextArea a1 = new TextArea("Hello, world!", 3, 20);
        add(a1);
        Checkbox c1 = new Checkbox("OK?");
        add(c1);
        Choice ch1 = new Choice();
        ch1.add("みかん");
        ch1.add("りんご");
        ch1.add("タマゴ");
        add(ch1);
        List li1 = new List();
        li1.add("10");
        li1.add("20");
        li1.add("30");
        add(li1);
        show();
        setLayout(new BorderLayout());
        Scrollbar sb1 = new Scrollbar(Scrollbar.VERTICAL);
        add(sb1, BorderLayout.EAST);
        MyCanvas mc1 = new MyCanvas();
        add(mc1, BorderLayout.CENTER);

        MenuBar menuBar = new MenuBar();
        setMenuBar(menuBar);

        Menu menuFile = new Menu("ファイル");
        menuFile.addActionListener(this);
        menuBar.add(menuFile);

        MenuItem menuOpen = new MenuItem("開く...", new MenuShortcut('o'));
        menuFile.add(menuOpen);

        menuFile.addSeparator();

        MenuItem menuExit = new MenuItem("終わる");
        menuFile.add(menuExit);

        Menu menuView = new Menu("設定");
        menuView.addActionListener(this);
        menuBar.add(menuView);

        CheckboxMenuItem menuStatusBar = new CheckboxMenuItem("大きさを固定する");
        menuStatusBar.addItemListener(this);
        menuView.add(menuStatusBar);

        Menu menuSize = new Menu("ウィンドウの幅");
        menuSize.addActionListener(this);
        menuView.add(menuSize);

        MenuItem menuSizeLarge = new MenuItem("800");
        menuSize.add(menuSizeLarge);

        MenuItem menuSizeSmall = new MenuItem("400");
        menuSize.add(menuSizeSmall);

    }

    class MyCanvas extends Canvas {
        public void paint(Graphics g) {
            g.drawLine(0, 0, 520, 40);
        }
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
    }

    public void itemStateChanged(ItemEvent e) {
        CheckboxMenuItem menu =(CheckboxMenuItem)e.getSource();
        if (menu.getState()) {
            System.out.println(menu.getLabel() + " SELECTED");
        } else {
            System.out.println(menu.getLabel() + " DESELECTED");
        }
    }
}
