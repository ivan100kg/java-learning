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
        String emails = "";
        while (s.contains("@")) {
            emails += s.substring(s.indexOf('@') + 1, s.indexOf('.')) + '\n';
            s = s.substring(s.indexOf('.') + 1);
        }
        System.out.println(emails);
    }

    public static void main(String[] args) {
        String s = "ya@yahoo.com; on@mail.com; ona@gmail.com;";
//        email(s);
        email2(s);
    }
}
