package Lessons.Lesson3;

public class Test7 {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = true;
        boolean b3 = false;
        boolean b4 = false;
        
        System.out.println(b1 ^ b3); // исключающее ИЛИ
        
        System.out.println(1 & 2); // побитовое И 01&10=0
        System.out.println(4 | 8);  // побитовое ИЛИ
    }
}
