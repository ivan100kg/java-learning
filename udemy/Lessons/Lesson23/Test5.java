package Lessons.Lesson23;

public class Test5 {
    public static void main(String[] args) {
        Employee3 emp = new Employee3();
        Teacher3 t = new Teacher3();
        Employee3 e = new Teacher3();
        emp.sleep();
        t.sleep();
        e.sleep();


    }
}


class Employee3 {
    final String name = "ggg";

    Food eat() {
        System.out.println("I'm eating");
        return new Food();
    }

    static void sleep() {
        System.out.println("Employee sleeps");
    }

    void info() {
        System.out.println("name: " + name);
    }
}

class Teacher3 extends Employee3 {
    int students;
    String name;

    static void sleep() {
        System.out.println("Teacher sleeps");
    }

    Fruit eat() {
        System.out.println("Teacher eating");
        return new Fruit();
    }

    void teach() {
        System.out.println("I'm teaching");
    }
}