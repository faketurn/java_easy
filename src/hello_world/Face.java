package hello_world;

public class Face {
    int x;
    int y;
    int vx;
    int vy;

    public Face(int x, int y, int vx, int vy) {
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
    }
    public void draw(MyFrame frame) {
        frame.fillOval(x, y, 50, 100);
        frame.fillOval(x + 100, y, 50, 100);
        frame.fillRect(x,  y + 160, 150, 10);
    }
    public void move() {
        x += vx;
        y += vy;
    }

}
