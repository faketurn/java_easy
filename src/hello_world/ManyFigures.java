package hello_world;

public class ManyFigures extends MyFrame {
    public void run() {
//        setColor(0, 128, 0);
//        fillRect(30, 80, 10, 100);

        int windowX = 30;
        int windowY = 40;
        int x = 20;
        int y = 20;

//        つづらおり
//        for (int i = 0; i <= 10; i++) {
//            setColor(0, 128, 0);
//            fillRect(x * i + windowX, y * i + windowY, 10, 120);
//        }

////        なだれ
//        for (int i = 0; i <= 10; i++) {
//            setColor(0, 100, 0);
//            fillRect(x * i + windowX, y, 10, i * 10);
//        }

//        グラデーション
        for (int i = 0; i <= 10; i++) {
            setColor(i * 20, i * 20, i * 20);
            fillRect(x * i + windowX, y + windowY, 10, 120);
        }
    }

}
