package Homeworks.hw16;

public class Hw16 {
    public static void email(String s) {
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

    public static void email2(String s) {
        while (s.contains("@")) {
            System.out.println(s.substring(s.indexOf('@') + 1, s.indexOf('.')));
            s = s.substring(s.indexOf('.') + 1);
        }
    }

    public static void main(String[] args) {
        String s = "ya@yahoo.com; on@mail.com; ona@gmail.com;";
//        email(s);
        email2(s);
    }
}
