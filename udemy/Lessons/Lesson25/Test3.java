package Lessons.Lesson25;

public class Test3 {
    public static void main(String[] args) {
        Employee2 emp1 = new Doctor2();
        Employee2 emp2 = new Teacher2();
        Employee2 emp3 = new Driver2();
        Employee2 emp = new Employee2();
       /* Doctor2 d1 = (Doctor2) emp1;
        HelpAble2 h = new Doctor2();
        System.out.println(d1.specialization);
        System.out.println(((Doctor2) emp1).specialization);
        ((Driver2) emp3).drive();
        h.help();
        ((Doctor2) h).heal();*/

//        Driver2 d = (Driver2) emp;
//        d.drive();

//        System.out.println(h == emp2);

        Employee2[] arr = {emp1, emp2, emp3,emp};
        for (Employee2 e : arr){
            if (e instanceof Driver2) {
                ((Driver2) e).drive();
            }
        }
    }
}

class Employee2 {
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

class Doctor2 extends Employee2 implements HelpAble2 {
    String specialization = "surgeon";

    void heal() {
        System.out.println("I'm healing");
    }

    @Override
    public void help() {
        System.out.println("Doctor helps");
    }
}

class Teacher2 extends Employee2 {
    int students;

    void heal() {
        System.out.println("I'm teaching");
    }
}

class Driver2 extends Employee2 {
    String model;

    void drive() {
        System.out.println("I'm driving");
    }
}

interface HelpAble2 {
    void help();
}