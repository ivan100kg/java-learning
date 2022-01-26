package Lessons.Lesson10;
import Lessons.Lesson9.*;   // all classes
import static Lessons.Lesson9.Car.count;    
// import Lessons.Lesson8.*;   // the same classes' names
import java.lang.*; // default package

public class A {
    public static void main(String[] args) {
        Lessons.Lesson9.Car car1 = new Lessons.Lesson9.Car("blue", "1.6");
        Car car2 = new Car("black", "V12");
        car1.changeColor("red");
        car2.changeColor("pink");
        Student st1 = new Student();
        System.out.println(st1.b);

        B b = new B();
        System.out.println(b.s1);
        System.out.println(b.s2);
        System.out.println(b.s3);

        System.out.println(count);
        
    }
}

class B{
    Student st2 = new Student();
    java.lang.String s1 = new java.lang.String("a");    //
    String s2 = new String("b");
    String s3 = "c";
}
