package Lessons.Lesson12;

public class Test10 {
    static void maximum(int i1, int i2, int i3) {
        if (i1 > i2 && i1 > i3) {
            System.out.println(i1 + " the biggest number");
        } else if (i2 > i1 && i2 > i3) {
            System.out.println(i2 + " the biggest number");
        } else {
            System.out.println(i3 + " the biggest number");
        }
    }

    public static void main(String[] args) {
        int a = 20;
        if (a < 20) {
            System.out.println(true);
        } else if (a > 20) {
            System.out.println(false);
        } else {
            System.out.println(20);
        }

        if (true && false || !false && a == 0 || a <= 200)
            a = 0;

        System.out.println(a);

        a = 10;
        double b = a;
        System.out.println(b);
        System.out.println("int a 10 == double b 10.0 ? " + (a == b));

        String s1 = "abc";
        String s2 = "cba";
        String s3 = "abc";

        System.out.println(s1 + " == " + s2 + " " + (s1 == s2));

        maximum(12, -9, 900);

        // ternary
        System.out.println(a > b ? "Ivan" : "Arkady");
        int h = (a > b) ? 100 : -7;
        System.out.println(h);
    }
}
