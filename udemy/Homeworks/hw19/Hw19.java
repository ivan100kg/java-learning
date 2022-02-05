package Homeworks.hw19;

public class Hw19 {
    public static String[] abc(String[]... arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i].length;
        }

        String[] result = new String[total];
        for (int i = 0, k = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result[k] = arr[i][j];
                k++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] s1 = {"Hello", "Moto"};
        String[] s2 = {"Bye", "My", "Friend"};
        String[] result = abc(s1, s2);

        for (int i = 0; i < result.length; i++) {
            for (String a : args) {
                if (result[i].equals(a)) {
                    result[i] = null;
                }
            }
            System.out.print(result[i] + " ");
        }

    }
}



