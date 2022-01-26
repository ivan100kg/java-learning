
package Lesson5;

public class Car2 {
    Car2(){
        System.out.println("Constructor");
    }
    String color;
    String engine;
    int speed;
    
    int gas(int x){
        return speed+=x;
    }
    
    int tor(int x){
        return speed-=x;
    }
    
    void show(){
        System.out.println("color: "+color+" engine: "+engine+"speed: "+speed);
    }
}
class TestCar2{
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        c1.color = "white";
        c1.engine = "1.6";
        c1.speed = 60;
        
        c1.show();
        c1.gas(20);
        c1.show();
        c1.tor(40);
        c1.show();
    }
    
}
