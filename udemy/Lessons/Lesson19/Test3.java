package Lessons.Lesson19;

public class Test3 {
    public static void main(String[] args) {
        int[] array = {0, 6, 4, 1};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
