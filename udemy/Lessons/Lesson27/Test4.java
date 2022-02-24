package Lessons.Lesson27;

public class Test4 {
    public static void main(String[] args) {
        int[] array = {4, 8, 1};
        System.out.println("This is an array");
        try {
            System.out.println(array[1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException was caught " + e);
        } catch (Throwable e) {
            System.out.println("Any throwable");
        } finally {
            System.out.println("Good day!");
        }
    }
}
