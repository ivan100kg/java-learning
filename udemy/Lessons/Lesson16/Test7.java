package Lessons.Lesson16;

public class Test7 {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "Yahooooo!";
        String s3 = s1.concat(s2).trim().replace("Yah", "Wow").substring(6, 10);

        System.out.println(s3);

        System.out.println(s1.substring(s1.indexOf('W')));
    }
}
