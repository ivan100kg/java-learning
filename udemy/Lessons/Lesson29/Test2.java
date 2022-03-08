//package Lessons.Lesson29;
//
//import java.util.ArrayList;
//
//public class Test2 {
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
//        FindStudentsOverGrade fsog = new FindStudentsOverGrade();
//        FindStudentsUnderGrade fsug = new FindStudentsUnderGrade();
//        FindStudentsOverAge fsoa = new FindStudentsOverAge();
//        FindStudentsUnderAge fsua = new FindStudentsUnderAge();
//        FindStudentsBySex fsbs = new FindStudentsBySex();
//        FindStudentsMixCondition fsmc = new FindStudentsMixCondition();
//
//        System.out.println("fsog------------------------");
//        si.testStudents(arr, fsog);
//        System.out.println("fsug------------------------");
//        si.testStudents(arr, fsug);
//        System.out.println("fsoa------------------------");
//        si.testStudents(arr, fsoa);
//        System.out.println("fsua------------------------");
//        si.testStudents(arr, fsua);
//        System.out.println("fsbs------------------------");
//        si.testStudents(arr, fsbs);
//        System.out.println("fsmc------------------------");
//        si.testStudents(arr, fsmc);
//
//
////        si.printStudentOverGrade(arr,5.5);
////        si.printStudentBySex(arr, 'w');
////        si.printStudentUnderAge(arr, 20);
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
//    void testStudents(ArrayList<Student> aL, StudentChecks sc) {
//        for (Student s : aL) {
//            if (sc.test(s)) {
//                printStudent(s);
//            }
//        }
//    }
//}
//
//interface StudentChecks {
//    boolean test(Student s);
//}
//
//class FindStudentsOverGrade implements StudentChecks {
//    @Override
//    public boolean test(Student s) {
//        return s.avgGrade > 8.5;
//    }
//}
//
//class FindStudentsUnderGrade implements StudentChecks {
//    @Override
//    public boolean test(Student s) {
//        return s.avgGrade <= 8.5;
//    }
//}
//
//class FindStudentsOverAge implements StudentChecks {
//    @Override
//    public boolean test(Student s) {
//        return s.age > 25;
//    }
//}
//
//class FindStudentsUnderAge implements StudentChecks {
//    @Override
//    public boolean test(Student s) {
//        return s.age <= 25;
//    }
//}
//
//class FindStudentsBySex implements StudentChecks {
//    @Override
//    public boolean test(Student s) {
//        return s.sex == 'm';
//    }
//}
//
//class FindStudentsMixCondition implements StudentChecks {
//    @Override
//    public boolean test(Student s) {
//        return s.avgGrade <= 8.5 && s.sex == 'w' && s.course < 5;
//    }
//}
