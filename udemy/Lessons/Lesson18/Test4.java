package Lessons.Lesson18;

import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        int arr1[] = {1, 9, -8, 0, 5, 4, 1};
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        Arrays.sort(arr1);

        for (int j : arr1) {
            System.out.print(j + " ");
        }
        System.out.println();

        int ind1 = Arrays.binarySearch(arr1, -8);
        System.out.println(ind1);

        System.out.println(arr1);
        System.out.println(arr1.toString());
    }
}
