package Lessons.Lesson25;

import org.omg.CORBA.Object;

public class NewClass {
}

class Car{
    static int a = 5;

    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.a);
        c = null;
        System.out.println(c.a);

    }
}
