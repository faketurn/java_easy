package hello_world;

public class Truck extends Vehicle {
    public Truck(int x, int y, int vx, int vy) {
        super(x, y, vx, vy);
    }
    public void draw(MyFrame frame) {
        frame.fillRect(x + 40, y, 10, 10);
        frame.fillRect(x, y + 10, 50, 10);
        frame.fillOval(x + 5, y + 20, 10, 10);
        frame.fillOval(x + 15, y + 20, 10, 10);
        frame.fillOval(x + 40, y + 20, 10, 10);
    }
}
