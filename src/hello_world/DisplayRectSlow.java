package hello_world;

public class DisplayRectSlow extends MyFrame {
    public void run() {
        int x = 30;
        int y = 50;
        while (x <= 270) {
            clear();
            setColor(0, 128, 0);
//            fillRect(x, y, 10, 100);
//            x += 7;
//            y += 7;

//            円のアニメ
//            fillOval(x, y, 50, 50);
//            x += 10;
            sleep(0.03);
        }
    }

}
