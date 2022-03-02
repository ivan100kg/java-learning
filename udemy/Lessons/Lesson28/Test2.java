package Lessons.Lesson28;

public class Test2 {
    public static void main(String[] args) {
//        Car c = new Car();
        Car c = Car.createCar();
    }
}

class Car {
    private Car() {
    }

    static Car createCar() {
        return new Car();
    }
}
