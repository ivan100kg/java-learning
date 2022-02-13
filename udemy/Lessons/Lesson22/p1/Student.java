package Lessons.Lesson22.p1;

import Lessons.Lesson22.Human2;

public class Student extends Human2 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Igor");
        System.out.println(s.getName());
        System.out.println(Student.salary);
        s.work();
        Student.rest();
    }
}
