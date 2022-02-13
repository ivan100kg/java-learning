package Lessons.Lesson21;

public class Test1 {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        System.out.println(a < 4 ? "true" : "false");
        int c = a < 4 ? a++ : a--;
        System.out.println(a + " " + b + " " + c);
    }
}
