package Lessons.Lesson16;

public class Test3 {
    public static void main(String[] args) {
        int i1 = 5;
        int i2 = 6;
        String s = "ok";
        String s1 = 5 + "ok"; // так можно

        System.out.println(i1 + i2 + s);        // 11ok
        System.out.println("" + i1 + i2 + s);   // 56ok
        System.out.println(s1);
    }
}
