package Lessons.Lesson4;

public class Car {
    Car(){System.out.println("Without params constructor");}    // default constructor
    Car(String color, String eng, float wh){
        System.out.println("Custom constructor");
        this.color = color; // this.color
        this.engine = eng;  //  |
        wheight = wh;       //  |
    }                       //  |
    String color;   // <--------+
    String engine;
    float wheight;
    
}

class CarTest{
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("pink","1.2",900);
        Car car3 = car1;
        Car car4;   // undefined
        
        car1.color = "blue";    // the same ref        
        
        System.out.print("color: ");
        System.out.println(car3.color);
        System.out.println("wheight " + car3.wheight);
        System.out.println(car3.color);
        System.out.println(new Car().color);    // without ref
        
        System.out.println();
        System.out.println(car2.color);
    }
}
