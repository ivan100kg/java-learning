package Homeworks.hw17;

public class Hw17 {
    public static boolean compare(StringBuilder sb1, StringBuilder sb2) {
        return new String(sb1).equals(new String(sb2));
    }

    public static void main(String[] args) {
        System.out.println(compare(new StringBuilder("hey"), new StringBuilder("yo")));
        System.out.println(compare(new StringBuilder("equal"), new StringBuilder("equal")));
    }
}


