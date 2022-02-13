package Lessons.Lesson12;

public class Car {
    int doors;
    double engine;

    Car(double engine, int doors) {
        this.engine = engine;
        this.doors = doors;
    }
}

class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car(1.9, 4);
        Car car2 = new Car(1.8, 5);

        if (car1.engine > car2.engine) {
            System.out.println("Первый мощнее");
            if (car1.doors > car2.doors) {
                System.out.println("И дверей больше");
            } else {
                System.out.println("Но дверей не больше");
            }
        } else {
            System.out.println("Второй мощнее");

        }

        System.out.println("car1 == car2 ? : "+ (car1==car2));
        System.out.println("car1.equals(car2) : "+ car1.equals(car2));

    }
}
