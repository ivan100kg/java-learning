package Lessons.Lesson9;

public class Car {
    private String color;
    public String engine;
    public static int count;

    public Car(String color, String engine) {
        count++;
        this.color = color;
        this.engine = engine;
    }

    public void showColor() {
        System.out.println("Color: " + color);
    }

    public void changeColor(String color) {
        System.out.println("Color is changed to " + color);
        int price = 5000;
        this.color = color;
        price += 1000;
        int $s = 9;
        int _$_ = 12;
    }

    public static void main(String[] args) {
        Car car = new Car("blue", "V8");
        car.changeColor("red");
        car.showColor();
        car.color = "blue";
        car.showColor();
    }
}
