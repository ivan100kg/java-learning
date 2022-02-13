package Lessons.Lesson18;

public class Test6 {

    public static void maxMin(double[] arr) {
        double max = arr[0];
        double min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.print("min: " + min);
        System.out.println("\tmax: " + max);
    }

    public static void main(String[] args) {
        maxMin(new double[]{1.5, 3.14, 2.72, -98.0, 0, 9.2});
    }
}
