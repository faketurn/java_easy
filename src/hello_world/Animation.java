package hello_world;

public class Animation extends MyFrame {
    public void run() {
        int x = 30;
        int y = 50;

        for (int i = 0; i < 2; i++) {
            while (x <= 170) {
                clear();
                setColor(0, 128, 0);
                fillRect(x, y, 10, 100);
                x += 5;
                sleep(0.05);
            }
            if (i >= 1) {
                break;
            }
            while (x >= 50) {
                clear();
                setColor(0, 128, 0);
                fillRect(x, y, 10, 100);
                x -= 5;
                sleep(0.05);
            }
        }


//        X字の動き無限ループ
//        while (true) {
//            while (x <= 310) {
//                clear();
//                setColor(0, 100, 0);
//                fillRect(x, y, 10, 100);
//                x += 4;
//                y += 3;
//                sleep(0.05);
//            }
//
//            while (x >= 30) {
//                clear();
//
//                setColor(0, 128, 0);
//                fillRect(x, y, 10, 100);
//                x -= 5;
//                sleep(0.05);
//            }
//
//            while (x <= 310) {
//                clear();
//
//                setColor(0, 128, 0);
//                fillRect(x, y, 10, 100);
//                x += 4;
//                y -= 3;
//                sleep(0.05);
//            }
//
//            while (x >= 30) {
//                clear();
//
//                setColor(0, 128, 0);
//                fillRect(x, y, 10, 100);
//                x -= 5;
//                sleep(0.05);
//            }
//        }

//      while (y >= 50) {
//      clear();
//
//      setColor(0, 128, 0);
//      fillRect(x, y, 10, 100);
//      y -= 5;
//      sleep(0.05);
//  }
    }

}
