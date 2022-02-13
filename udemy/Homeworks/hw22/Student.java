package Homeworks.hw22;

public class Student {
    private StringBuilder name;
    private int course;
    private int grade;

    public void setName(StringBuilder name) {
        if (name.length() >= 3) {
            this.name = name;
        }
    }

    public void setCourse(int course) {
        if (course >= 1 && course <= 4) {
            this.course = course;
        }
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade < 10) {
            this.grade = grade;
        }
    }

    public void showInfo() {
        System.out.println("name: " + name);
        System.out.println("course: " + course);
        System.out.println("grade: " + grade);
    }

}

class TestStudent {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName(new StringBuilder("Gregory"));
        s.setGrade(9);
        s.setCourse(4);
        s.showInfo();
    }


}
