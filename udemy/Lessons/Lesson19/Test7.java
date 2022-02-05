package Lessons.Lesson19;

public class Test7 {
    public static void main(String[] args) {
        int[] array = {0, 6, 4, 1};
        for (int i : array) {
            i = 3;
        }
        System.out.println(array[0]);

        String[] arr = {"Hello", "World"};
        for (String s : arr) {
            s += "_changed";
        }
        System.out.println(arr[0]);

        StringBuilder[] arr_sb = new StringBuilder[]{new StringBuilder("Hello"),
                new StringBuilder("World")};
        for (StringBuilder sb : arr_sb) {
            sb.insert(0, "changed_");
        }
        System.out.println(arr_sb[0]);
    }
}
