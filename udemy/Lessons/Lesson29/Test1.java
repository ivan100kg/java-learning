//package Lessons.Lesson29;
//
//import java.util.ArrayList;
//
//public class Test1 {
//    public static void main(String[] args) {
//        ArrayList<Student> arr = new ArrayList<>();
//        Student st1 = new Student("Ivan", 'm', 39, 5, 9.6);
//        Student st2 = new Student("Egor", 'm', 31, 3, 8.4);
//        Student st3 = new Student("Sarah", 'w', 18, 2, 7.7);
//        Student st4 = new Student("Pedro", 'm', 23, 2, 2.5);
//        Student st5 = new Student("Lisa", 'w', 64, 1, 5.0);
//        arr.add(st1);
//        arr.add(st2);
//        arr.add(st3);
//        arr.add(st4);
//        arr.add(st5);
//
//        StudentInfo si = new StudentInfo();
////        si.printStudentOverGrade(arr,5.5);
////        si.printStudentBySex(arr, 'w');
//        si.printStudentUnderAge(arr, 20);
//    }
//
//}
//
//class Student {
//    String name;
//    char sex;
//    int age;
//    int course;
//    double avgGrade;
//
//    Student(String name, char sex, int age, int course, double avgGrade) {
//        this.name = name;
//        this.sex = sex;
//        this.age = age;
//        this.course = course;
//        this.avgGrade = avgGrade;
//    }
//}
//
//class StudentInfo {
//    void printStudent(Student st) {
//        System.out.print("name: " + st.name);
//        System.out.print("\tsex: " + st.sex);
//        System.out.print("\tage: " + st.age);
//        System.out.print("\tcourse: " + st.course);
//        System.out.println("\tavgGrade: " + st.avgGrade);
//    }
//
//    void printStudentOverGrade(ArrayList<Student> aL, double avgGrade) {
//        for (Student s : aL) {
//            if (s.avgGrade > avgGrade) {
//                printStudent(s);
//            }
//        }
//    }
//
//    void printStudentUnderGrade(ArrayList<Student> aL, double avgGrade) {
//        for (Student s : aL) {
//            if (s.avgGrade < avgGrade) {
//                printStudent(s);
//            }
//        }
//    }
//
//    void printStudentOverAge(ArrayList<Student> aL, int age) {
//        for (Student s : aL) {
//            if (s.age > age) {
//                printStudent(s);
//            }
//        }
//    }
//
//    void printStudentUnderAge(ArrayList<Student> aL, int age) {
//        for (Student s : aL) {
//            if (s.age < age) {
//                printStudent(s);
//            }
//        }
//    }
//
//    void printStudentBySex(ArrayList<Student> aL, char sex) {
//        for (Student s : aL) {
//            if (s.sex == sex) {
//                printStudent(s);
//            }
//        }
//    }
//
//    void printStudentMixConditions(ArrayList<Student> aL, double avgGrade, int age, char sex) {
//        for (Student s : aL) {
//            if (s.avgGrade > avgGrade && s.sex == sex && s.age < age) {
//                printStudent(s);
//            }
//        }
//    }
//}