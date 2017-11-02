package hello_world;

public class Car extends Vehicle {
    public Car(int x, int y, int vx, int vy) {
        super(x, y, vx, vy);
    }
    public void draw(MyFrame frame) {
        frame.fillRect(x + 10, y, 20, 10);
        frame.fillRect(x, y + 10, 40, 10);
        frame.fillOval(x + 5, y + 20, 10, 10);
        frame.fillOval(x + 25, y + 20, 10, 10);
    }
}
