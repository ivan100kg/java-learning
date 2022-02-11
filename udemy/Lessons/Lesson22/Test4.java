package Lessons.Lesson22;

public class Test4 {

}

class Human3 {

    Human3(String f, String l) {
        System.out.println("Human3(String f, String l)");
        firstname = f;
        lastname = l;
    }

    Human3(String f) {
        this(f, "Snow");
        System.out.println("Human3(String f)");
    }

    Human3() {
        this("Jon", "Snow");
        System.out.println("Human3()");
    }

    String firstname = "Jon";
    String lastname;

    void info() {
        System.out.println("First name: " + firstname + ". Last name: " + lastname + ".");
    }
}

class Student3 extends Human3 {
    Student3() {
        this("Gizmo");
        System.out.println("Student3()");
    }

    Student3(String s) {
        super(s);
        System.out.println("Student3(String s)");
    }

    public static void main(String[] args) {
        Student3 s1 = new Student3("Ron");
        Student3 s2 = new Student3();
        s1.info();
        s2.info();

    }
}