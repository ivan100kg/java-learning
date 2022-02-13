package Lessons.Lesson23;

public class Test3 {
    public static void main(String[] args) {
        Teacher2 t = new Teacher2();
//        t.eat();
        Employee2 e = new Employee2();
//        e.eat();


        Employee2 emp = new Teacher2();
        emp.eat();

    }
}

class Food {

}

class Fruit extends Food {

}

class Employee2 {
    String name;
    int age;
    int experience;
    double salary = 100.0f;

    Food eat() {
        System.out.println("I'm eating");
        return new Food();
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

class Teacher2 extends Employee2 {
    int students;

    Fruit eat() {
        System.out.println("Teacher eating");
        return new Fruit();
    }

    void teach() {
        System.out.println("I'm teaching");
    }
}