package Lessons.Lesson23;

public class Test2 {
    public static Object abc() {
        return new StringBuilder("hey");
    }

    public static void main(String[] args) {
        Doctor doc = new Doctor();
        Teacher teacher = new Teacher();
        Driver driver = new Driver();
        Employee emp = new Employee();

        Employee emp2 = new Doctor();
        Employee emp3 = new Teacher();
        Employee emp4 = new Driver();
        Employee emp5 = new Surgeon();
        Object obj = new Doctor();

        doc.heal();
        emp2.sleep();
        System.out.println(obj.getClass());

        Object sb = abc();
        System.out.println(sb.getClass());
        System.out.println(sb);
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

class Doctor extends Employee {
    void heal() {
        System.out.println("I'm healing");
    }
}

class Teacher extends Employee {
    int students;

    void teach() {
        System.out.println("I'm teaching");
    }
}

class Driver extends Employee {
    String model;

    void drive() {
        System.out.println("I'm driving");
    }
}

class Surgeon extends Doctor {
    String knife;

    void operation() {
        System.out.println("I'll cut you!");
    }
}
