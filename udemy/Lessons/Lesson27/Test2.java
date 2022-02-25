package Lessons.Lesson27;

public class Test2 {
    void abc() throws Exception {

    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        try {
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException exIndex) {
            System.out.println("1 fuck " + exIndex);
        }
    }
}
