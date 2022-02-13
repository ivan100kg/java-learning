package Lessons.Lesson16;

public class Test2 {
    public static void main(String[] args) {
        String s1 = new String("Hello");

        String s10 = s1.substring(1,3); // el
        String s11 = s1.replace('H','G');   // Gello
        String s12 = s1.replace("Hel","G"); // Glo
        String s13 = s11.concat(s12);

//        System.out.println(s11);
        System.out.println(s13);
    }
}
