package Lessons.Lesson16;

public class Test1 {

    public static void main(String[] args) {
        String s1 = new String("Hello");

        int len = s1.length();  // 5
        char a = s1.charAt(0);  // H
        int ind1 = s1.indexOf('H',1);   // -1
        int ind2 = s1.indexOf("Hel");   // 0
        boolean startW = s1.startsWith("l",2);  // true
        boolean endW = s1.startsWith("l");  // false

        System.out.println(endW);

    }
}
