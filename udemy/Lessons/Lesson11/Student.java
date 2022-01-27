package Lessons.Lesson11;

public class Student {
    public String name;
    public int course;
    public double grade;

    public Student(String name, int course, double grade){
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public static void swap(Student s1, Student s2){
        Student s3 = s1;
        s1 = s2;
        s2 = s3;
    }

    public static void changeName(Student st1){
        st1.name = "Changed";
    }

    public static void main(String[] args) {
        Student st1 = new Student("Igor", 1, 7.6);
        Student st2 = new Student("Egor", 1, 5.3);
       
        System.out.println(st1.name);
        swap(st1, st2);
        System.out.println(st1.name);

        System.out.println();

        System.out.println(st2.name);
        changeName(st2);
        System.out.println(st2.name);

    }
}
