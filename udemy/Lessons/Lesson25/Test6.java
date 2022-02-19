package Lessons.Lesson25;

public class Test6 {
    public static void main(String[] args) {
        byte b = 10;
        int a = b;
        double d = 100;
        double d1 = 'a';
        long l = b;
        double d2 = 189.345;
        b = (byte) 900000;
        System.out.println(b);

        int i10 = 111111;
        short s10 = (short) i10;
        System.out.println(s10);

        char c = (char) -100;
        System.out.println(c);

        int i = 5;
        long lo = 10;
        System.out.println(i+lo);

        byte b1 = 3;
        byte b2 = 2;
        byte b3 = 1;

        System.out.println(b1++);
    }
}
