package Homeworks.hw12;

import Lessons.Lesson11.Student;

public class StudentTest {
    static void compareStudent(Student st1, Student st2) {
        System.out.println("st1 == st2 ? : " + (st1 == st2));
        System.out.println((st1 == st2) ? "st1 = st2" : "st1 != st2");
        System.out.println("st1.equals(st2) ? : " + st1.equals(st2));
        System.out.println(st1.equals(st2) ? "st1 = st2" : "st1 != st2");
    }

    static void compareFields(Student st1, Student st2) {
        if (st1.equals(st2) && st1.course == st2.course && st1.grade == st2.grade) {
            System.out.println("Students are equal");

        } else {
            System.out.println("Students are not equal");
            if (!st1.equals(st2))
                System.out.println(st1.name + " != " + st2.name);
            if (st1.course != st2.course)
                System.out.println(st1.course + " != " + st2.course);
            if (st1.grade != st2.grade)
                System.out.println(st1.grade + " != " + st2.grade);

        }
    }

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 1, 9.6);
        Student st2 = new Student("Egor", 1, 8.3);
        compareStudent(st1, st2);
        System.out.println();
        compareFields(st1, st2);
    }

}
