package Homeworks.hw8;

public class Hw1 {
    public static int mul3(int a, int b, int c) {
        return a*b*c;
    }

    public static void dev(int a, int b) {
        System.out.println("Integer: "+ a/b);
        System.out.println("Reminder: "+a%b);
    }
}

class TestHw1 {
    public static void main(String[] args) {
        System.out.println(Hw1.mul3(1, 2, 3));
        System.out.println(Hw1.mul3(4, 5, 6));
        Hw1.dev(34, 12);
        Hw1.dev(39, 3);
    }
}
