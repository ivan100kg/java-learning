package Lessons.Lesson18;

public class Test1 {
    public static void main(String[] args) {
        // declaration
        int[] arr1;
        int[] arr1a = null;
        String[] arr2;
        double[][] arr3;

        // allocation
        arr1 = new int[3];
        arr2 = new String[3];

        // declaration+allocation
        double[][] arr6 = new double[10][12];   // 10 массивов, в которых массивы из 12 элем
        double[][] arr7 = new double[10][];     // 10 мвссивов в которых содерж массивы разн длины

        // static initialization
        arr1[0] = 2;
        arr1[1] = 4;
        arr1[2] = -90;


        int[][] arr;
        arr = new int[2][3];
        arr[0] = arr1;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 7;

        System.out.println(arr[0][0]);
    }
}


// 39:41