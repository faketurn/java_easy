package hello_world;

public class Car {
    int x;
    int y;
    int vx;
    int vy;

    public Car(int x, int y, int vx, int vy) {
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
    }
    public void draw(MyFrame frame) {
        frame.fillRect(x + 10, y, 20, 10);
        frame.fillRect(x, y + 10, 40, 10);
        frame.fillOval(x + 5, y + 20, 10, 10);
        frame.fillOval(x + 25, y + 20, 10, 10);
    }
    public void move() {
        x += vx;
        y += vy;
    }

}
