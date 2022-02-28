package Lessons.Lesson27;

public class Test12 {
    static void abc() {
        int[] array = {1, 2, 3};
        try {
            System.out.println(array[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            String s = null;    // inner try needs
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerExc");
        }
    }

    public static void main(String[] args) {
        abc();
    }
}

