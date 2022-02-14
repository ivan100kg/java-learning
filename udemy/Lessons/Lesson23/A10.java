package Lessons.Lesson23;

public class A10 {
    String s1 = "hello";
    static double d1 = 3.14;
    final int i1 = 1;

    int sum(int... i) {
        int result = 0;
        for (int a : i) {
            result += a;
        }
        return result;
    }

    static void abc() {
        System.out.println("Static method");
    }
}

class B10 extends A10 {
    String s2 = super.s1 + " friend!";
    int res = super.sum(2, 3, 4);
    double d1 = 12.9;


    public static void main(String[] args) {
        B10 b = new B10();
        System.out.println(b.s2);
        System.out.println(b.d1);
    }
}
