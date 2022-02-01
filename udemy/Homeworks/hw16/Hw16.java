package Homeworks.hw16;

public class Hw16 {
    public static void email(String s) {
        char c;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '@') {
                i++;
                while (s.charAt(i) != '.') {
                    System.out.print(s.charAt(i));
                    i++;
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        email("ya@yahoo.com; on@mail.com; ona@gmail.com;");
    }
}
