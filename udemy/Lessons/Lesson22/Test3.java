package Lessons.Lesson22;

public class Test3 {
    static void increaseSalary005(Employee emp) {
        emp.salary += emp.salary * 0.05;
    }

    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.name = "Ivan";
        doc.age = 50;
        doc.experience = 25;
//        doc.specialization = "surgeon";
        doc.eat();
        doc.sleep();
        doc.heal();
        doc.info();
        increaseSalary005(doc);
        doc.info();
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
//    String specialization;

    void heal() {
        System.out.println("I'm healing");
    }
}

class surgeon extends Doctor{
    String knife;
    void operation(){
        System.out.println("I'll cut you!");
    }
}

class Teacher extends Employee {
    int students;

    void heal() {
        System.out.println("I'm teaching");
    }
}

class Driver extends Employee {
    String model;

    void heal() {
        System.out.println("I'm driving");
    }
}
