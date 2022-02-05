package Lessons.Lesson19;

public class Test2 {
    static void sum(int... a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }

    static void sum2(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        sum(1, 2, 3);
        sum2(new int[]{1, 2, 3});
        sum();
    }


}
