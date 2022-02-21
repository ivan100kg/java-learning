package Lessons.Lesson26;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        Car c1 = new Car("red", "V4");
        Car c2 = new Car("red", "V4");
        Car c3 = new Car("black", "V8");
        Car c4 = new Car("black", "V8");
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3);

        // test
        /*Object o = new Car("blue", "1.6");
        Car c4 = (Car) o;
        System.out.println(((Car) o).color);
        System.out.println(c4.engine);*/

        ArrayList<Car> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        System.out.println(c1.equals(c2));
    }
}

class Car {
    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car c2 = (Car) obj;
            return color.equals(c2.color) && engine.equals(c2.engine);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return color + " car with " + engine;
    }
}
