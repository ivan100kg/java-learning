package Lessons.Lesson19;

public class Test5 {
    public static void main(String[] args) {
        String[] students = {"Ivanov", "Petrov", "Sidorov"};
        String[] exams = {"calculus", "linear algebra", "geometry"};
        for (String s : students) {
            for (String j : exams) {
                System.out.println(s + ": " + j);
            }
        }
    }
}
