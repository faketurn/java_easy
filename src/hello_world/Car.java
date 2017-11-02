package hello_world;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Car extends Vehicle implements KeyListener {
    public Car(int x, int y, int vx, int vy) {
        super(x, y, vx, vy);
    }
    public void draw(MyFrame frame) {
        frame.fillRect(x + 10, y, 20, 10);
        frame.fillRect(x, y + 10, 40, 10);
        frame.fillOval(x + 5, y + 20, 10, 10);
        frame.fillOval(x + 25, y + 20, 10, 10);
    }
    @Override
    public void keyTyped(KeyEvent e) {
        // TODO 自動生成されたメソッド・スタブ

    }
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            vx -= 5;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            vx += 5;
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            vy -= 5;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            vy += 5;
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            vx = 0;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            vx = 0;
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            vy = 0;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            vy = 0;
        }
    }
}
