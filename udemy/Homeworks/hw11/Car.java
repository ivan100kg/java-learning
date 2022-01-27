package Homeworks.hw11;

public class Car {
    String color;
    String engine;
    int doors;

    Car(String color, String engine){
        this.color = color;
        this.engine = engine;
    }

    public void changeDoorsCount(int i) {
        doors = i;
    }

    public static void changeColor(Car c1, Car c2) {
        String c3 = c1.color;
        c1.color = c2.color;
        c2.color = c3;
    }

    public static void main(String[] args) {
        Car c1 = new Car("red","V8");
        Car c2 = new Car("blue","V12");

        System.out.println("First car color: "+ c1.color);
        System.out.println("Second car color: "+ c2.color);
        System.out.println("Try to change colors...");
        changeColor(c1, c2);
        System.out.println("First car color: "+ c1.color);
        System.out.println("Second car color: "+ c2.color);

    }
}


