package Lessons.Lesson24;

public class Test3 {
    public static void main(String[] args) {
       /* Z z = new Z();
        Swim_able s = new Z();
        z.swim();
        s.swim();*/

        Help_able h = new Driver();
        Swim_able s = new Driver();
        Employee e = new Driver();

        System.out.println(h.a);
    }
}

class Employee {
    String name;
    int age;
    int experience;
    double salary = 100.0f;

    void eat() {
        System.out.println("I'm eating");
    }

    void sleep() {
        System.out.println("zzzZZZ");
    }

    void info() {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("experience: " + experience);
        System.out.println("salary: " + salary);
    }
}

class Teacher extends Employee implements Help_able {
    int students;

    void teach() {
        System.out.println("I'm teaching");
    }

    @Override
    public void help() {
        System.out.println("Teacher is help");
    }

    @Override
    public void water(String s) {
        System.out.println("Teacher is watering with " + s);
    }
}

class Driver extends Employee implements Help_able, Swim_able {
    String model;

    void heal() {
        System.out.println("I'm driving");
    }

    @Override
    public void help() {
        System.out.println("Driver is help");
    }

    @Override
    public void water(String s) {
        System.out.println("Driver is watering with " + s);
    }

    @Override
    public void swim() {
        System.out.println("Driver is swimming");
    }
}

interface Help_able {
    int a = 10;

    void help();

    void water(String thing);
}

interface Swim_able {
    void swim();
}

abstract class Y implements Swim_able{

}

abstract class X extends Y{

}

class Z extends Y {

    @Override
    public void swim() {
        System.out.println("I finally did it!");
    }
}