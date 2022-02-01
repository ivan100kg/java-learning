package Homeworks.hw16;

public class Hw16 {
    public static void email(String s) {
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c == '@') {
                i++;
                while (s.charAt(i) != '.') {
                    c = s.charAt(i);
                    System.out.print(c);
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
