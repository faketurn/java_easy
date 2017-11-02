package hello_world;

import java.util.Vector;

public class DisplayCarVector extends MyFrame {
    public void run() {
        Vector<Car> cars = new Vector<Car>();

        int x = 1;
        cars.add(new Car(30, 30, x, 0));
        cars.add(new Car(30, 60, x, 0));
        cars.add(new Car(30, 90, x, 0));
        cars.add(new Car(30, 120, x, 0));
        cars.add(new Car(30, 150, x, 0));

        for (int i = 0; i < 30; i++) {
            clear();
            for (int j = 0; j < cars.size(); j++) {
                cars.get(j).draw(this);
                cars.get(j).move();
            }
            sleep(0.05);
        }
    }

}
