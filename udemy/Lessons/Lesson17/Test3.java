package Lessons.Lesson17;

public class Test3 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello ");
        StringBuffer sbf1 = new StringBuffer("World!");
        String s1 = new String(sb1);
        String s2 = new String(sbf1);

        System.out.println(s1+s2);
    }
}
