package Lessons.Lesson13;

public class Test1 {
}


class Student {
    double grade;

    Student(double grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student(5);

/*        if (st1.grade == 2) {
            System.out.println("Student is terrible");
        } else if (st1.grade == 3) {
            System.out.println("Student is bad");
        } else if (st1.grade == 4) {
            System.out.println("Student is good");
        } else if (st1.grade == 5) {
            System.out.println("Student is brilliant");
        } else {
            System.out.println("Wrong grade");
        }*/

        switch ((int) st1.grade) {
            case 2:
                System.out.println("Student is terrible");
                break;
            case 3:
                System.out.println("Student is bad");
                break;
            case 4:
                System.out.println("Student is good");
                break;
            case 5:
                System.out.println("Student is brilliant");
                break;
            default:
                System.out.println("Wrong grade");
        }
    }
}
