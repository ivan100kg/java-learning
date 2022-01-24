package Homeworks;

import static Homeworks.StudentTest.average;

public class Lesson4 {
    
}

class Student{
    Student(int id,
            String first_name,
            String last_name,
            int study_year,
            float math_grade,
            float eco_grade,
            float fore_grade){
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.study_year = study_year;
        this.math_grade = math_grade;
        this.eco_grade = eco_grade;
        this.fore_grade = fore_grade;
    }
    
    Student(int id,
            String first_name,
            String last_name,
            int study_year){
        this(id,first_name,last_name,study_year,0,0,0);
    }
    
    Student(){
        this(0,null,null,0,0,0,0);
    }
    
    int id;
    String first_name;
    String last_name;
    int study_year;
    float math_grade;
    float eco_grade;
    float fore_grade;
    
    void info(){
        System.out.println("id: "+ id);
        System.out.println(first_name +" "+ last_name);
        System.out.println("Study year: "+ study_year);
        System.out.println("Math grade: "+ math_grade);
        System.out.println("Economical grade: "+ eco_grade);
        System.out.println("Foreign grade: "+ fore_grade);
    }
    
}

class StudentTest{
    static float average(Student s){
        return (s.math_grade+s.eco_grade+s.fore_grade)/3;
    }
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
                + ": average grade = " + average(s1));
        System.out.println(s2.first_name + " " + s2.last_name + ""
                + ": average grade = " + average(s1));
        System.out.println(s3.first_name + " " + s3.last_name + ""
                + ": average grade = " + average(s1));
        
        // homework 6
        Student st1 = new Student(1,"Jon","Snow",1999,7.3f,8.6f,9.0f);
        Student st2 = new Student(2,"Sansa","Stark",2006);
        Student st3 = new Student();
        
        st1.info();
        st2.info();
        st3.info();
    }
    
}