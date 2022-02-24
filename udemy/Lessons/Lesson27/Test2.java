package Lessons.Lesson27;

public class Test2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        String s = null;
        try {
            System.out.println(array[2]);
            s.length();
        }
        catch (ArrayIndexOutOfBoundsException exIndex){
            System.out.println("1 fuck "+exIndex);
        }
        catch (NullPointerException exNull){
            System.out.println("2 fuck "+ exNull);
        }
    }
}
