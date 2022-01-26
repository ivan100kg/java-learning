package Lessons.Lesson3;

public class Test6 {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        
        boolean bool1 = a>b;
        boolean bool2 = a<b;
        boolean bool3 = a<=b;   // >=
        boolean bool4 = a==b;
        boolean bool5 = a!=b;
        
        
        System.out.println(bool1 && bool2); // and
        System.out.println(bool1 || bool2); // or
        System.out.println(!bool1);         // not
        
    }
}
