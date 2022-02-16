package Lessons.Lesson24;

public class Test3 {
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
    public void water() {
        System.out.println("Teacher is watering");
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
    public void water() {
        System.out.println("Driver is watering");
    }

    @Override
    public void swim() {
        System.out.println("Driver is swimming");
    }
}

interface Help_able {
    void help();

    void water();
}

interface Swim_able {
    void swim();
}