package Lessons.Lesson22;

public class Human2 {
    private String name = "John";

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    protected static int salary = 150;

    public void work() {
        System.out.println("working");
    }

    public static void rest() {
        System.out.println("have a rest");
    }
}

class Student extends Human2 {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.getName());
        System.out.println(Student.salary);
        s.work();
        Student.rest();
    }
}