package Lessons.Lesson29;

import java.util.ArrayList;
import java.util.function.*;

public class Test6 {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<>();
        Student st1 = new Student("Ivan", 'm', 39, 5, 9.6);
        Student st2 = new Student("Egor", 'm', 31, 3, 8.4);
        Student st3 = new Student("Sarah", 'w', 18, 2, 7.7);
        Student st4 = new Student("Pedro", 'm', 23, 2, 2.5);
        Student st5 = new Student("Lisa", 'w', 64, 1, 5.0);
        arr.add(st1);
        arr.add(st2);
        arr.add(st3);
        arr.add(st4);
        arr.add(st5);

        StudentInfo si = new StudentInfo();

        for (Student s : arr) {
            System.out.println(s.name);
        }
        System.out.println("-------------");
        arr.removeIf(x -> x.name.endsWith("a"));
        for (Student s : arr) {
            System.out.println(s.name);
        }

//        System.out.println("fsog------------------------");
//        si.testStudents(arr, (Student s) -> {
//            return s.avgGrade > 8.5;
//        });
//        System.out.println("fsug------------------------");
//        si.testStudents(arr, (Student s) -> {
//            return s.avgGrade <= 8.5;
//        });
//        System.out.println("fsoa------------------------");
//        si.testStudents(arr, (Student s) -> {
//            return s.age > 25;
//        });
//        System.out.println("fsua------------------------");
//        si.testStudents(arr, (Student s) -> {
//            return s.age <= 25;
//        });
//        System.out.println("fsbs------------------------");
//        si.testStudents(arr, (Student s) -> {
//            return s.sex == 'm';
//        });
//        System.out.println("fsmc------------------------");
//        si.testStudents(arr, (Student s) -> {
//            return s.avgGrade <= 8.5 && s.sex == 'w' && s.course < 4;
//        });
    }
}

class Student {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo {
    void printStudent(Student st) {
        System.out.print("name: " + st.name);
        System.out.print("\tsex: " + st.sex);
        System.out.print("\tage: " + st.age);
        System.out.print("\tcourse: " + st.course);
        System.out.println("\tavgGrade: " + st.avgGrade);
    }

    void testStudents(ArrayList<Student> aL, Predicate<Student> t) {
        for (Student s : aL) {
            if (t.test(s)) {
                printStudent(s);
            }
        }
    }
}

