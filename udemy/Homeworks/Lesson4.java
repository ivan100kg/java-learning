package Homeworks;

public class Lesson4 {
    
}

class Student{
    int id;
    String first_name;
    String last_name;
    int study_year;
    float math_grade;
    float eco_grade;
    float fore_grade;
}

class StudentTest{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        
        s1.first_name = "Egor";
        s1.last_name = "Black";
        s1.study_year = 2020;
        s1.math_grade = 3;
        s1.eco_grade = 4;
        s1.fore_grade = 4;
        
        s2.first_name = "Isaac";
        s2.last_name = "Bob";
        s2.study_year = 2020;
        s2.math_grade = 3;
        s2.eco_grade = 4;
        s2.fore_grade = 3;
        
        s3.first_name = "John";
        s3.last_name = "Smith";
        s3.study_year = 2020;
        s3.math_grade = 5;
        s3.eco_grade = 4;
        s3.fore_grade = 5;
        
        System.out.println(s1.first_name + " " + s1.last_name + ""
                + ": average grade = " + (s1.math_grade+s1.eco_grade
                + s1.fore_grade)/3);
        System.out.println(s2.first_name + " " + s2.last_name + ""
                + ": average grade = " + (s2.math_grade+s2.eco_grade
                + s2.fore_grade)/3);
        System.out.println(s3.first_name + " " + s3.last_name + ""
                + ": average grade = " + (s3.math_grade+s3.eco_grade
                + s3.fore_grade)/3);
    }
    
}