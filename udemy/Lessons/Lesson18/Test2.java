package Lessons.Lesson18;

public class Test2 {
    public static void main(String[] args) {
        String arr0[];
        String[] arr1;
        int[][] arr2;

        arr1 = new String[3];
        arr2 = new int[3][];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = "num " + i;
            System.out.println(arr1[i]);
        }

        arr2[0] = new int[5];
        arr2[1] = new int[2];
        arr2[2] = new int[7];

        int[] ar = new int[]{900};
    }
}
