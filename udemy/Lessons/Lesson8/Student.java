package Lessons.Lesson8;

// import javax.sound.sampled.SourceDataLine;

public class Student {

    String name;
    int course;
    static int count = 0;
    int a;

    public Student(String n, int c) {
        name = n;
        course = c;
        count++;
        System.out.println("Student #" + count + " is created");
    }

    public static void showCount() {
        System.out.println("Total students created: "+ count);
    }

    public void info() {
        System.out.println("Welcome to the Student class!!!");
    }

    void abc() {
        a++;
        count++;
    }

    static void def() {
        // a++; // нельзя в статич методе управлять перем объектов
        count++;
        Student st2 = new Student("Leo",2);
        st2.a++;    // так можно
    }
}

class StudentTest {

    public static void main(String[] args) {
        // Student s1 = new Student("Ivan", 1);
        // Student s2 = new Student("Petr", 1);
        // Student s3 = new Student("Inna", 1);

        // System.out.println(Student.count);
        // Student.showCount();
        // s3.showCount();

        // Student.abc();  // impossible
        Student.def();  // possible
        Student st3 = new Student("Henry", 30);
        st3.abc();
        
    }
}
