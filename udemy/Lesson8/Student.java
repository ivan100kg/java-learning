package Lesson8;

public class Student {

    String name;
    int course;
    static int count = 0;

    public Student(String n, int c) {
        name = n;
        course = c;
        count++;
        System.out.println("Student #" + count + " is created");
    }
}

class StudentTest {

    public static void main(String[] args) {
        Student s1 = new Student("Ivan", 1);
        Student s2 = new Student("Petr", 1);
        Student s3 = new Student("Inna", 1);

        System.out.println(Student.count);
    }
}
