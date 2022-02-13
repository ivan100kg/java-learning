package Lessons.Lesson16;

public class Car {
    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    public final static int a = 5;

    public Car abc(String color) {
        Car c10 = new Car(color, "1.5");
        return c10;
    }

    public void info() {
        System.out.println("Color: " + color + "\tEngine: " + engine);
        System.out.println("Hashcode: "+this.hashCode());
        System.out.println("ToString: "+this.toString());
    }

    public static void main(String[] args) {
        Car c = new Car("Red", "V6");
        Car c2 = c.abc("black");
        c.info();
        c2.info();
    }
}

/*class TestCar {
    final static Car car = new Car("red", "V8"); // не может ссылаться на др адрес

    public static void main(String[] args) {
        car.engine = "V12"; // можно
    }
}*/
