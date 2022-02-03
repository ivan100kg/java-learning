package Homeworks.hw18;

public class Hw18 {
    public static int[] to_sort(int[] arr) {
        if (arr.length < 2) return arr;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = to_sort(new int[]{3, -9, 0, -58, 111, -1080, 720});
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        String[][] arr2 = {{"hello", "world"}, {"burn", "hell"}};
        Hw18_2 obj = new Hw18_2();
        obj.showArray(arr2);
    }
}

class Hw18_2 {
    public void showArray(String[][] arr) {
        System.out.println("{ {" + arr[0][0] + ", " + arr[0][1] + "},{" + arr[1][0] + "},{" + arr[1][0] + "," + arr[1][1] + "} }");
    }
}
