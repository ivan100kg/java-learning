package Lessons.Lesson18;

public class Test5 {
    public static void main(String[] args) {
        int arr1[] = {1, 9, -8, 0, 5, 4, 1};
        int arr2[] = {1, 9, -8, 0, 5, 4, 1};
        int arr3[] = arr2;

        System.out.println(arr1 == arr2);
        System.out.println(arr3 == arr2);

        System.out.println(arr1.equals(arr2));
        System.out.println(arr3.equals(arr2));

    }
}
