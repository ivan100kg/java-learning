package Lessons.Lesson15;

public class Test3 {
    public static void main(String[] args) {
        boolean b = true;   // some flag
        int a = 1;

        while (b) {
            System.out.println(a);
            if (a % 3 == 0 && a % 7 == 0) {
                b = false;  // or break
            }
            a++;
        }
    }
}
