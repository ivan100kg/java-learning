package Lesson4;

public class Car {
    String color = "red";
    String engine = "V6";
    float wheight = 1000;
}

class CarTest{
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = car1;
        Car car4;   // undefined
        
        car1.color = "blue";    // the same ref        
        
        System.out.print("color: ");
        System.out.println(car3.color);
        System.out.println("wheight " + car3.wheight);
        System.out.println(car3.color);
        System.out.println(new Car().color);    // without ref
    }
}
