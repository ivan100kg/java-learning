package Lessons.Lesson3;

public class Test8 {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int c = (++a - b)*2;    // приоритет операций
        
        char s = 'a';
        
        System.out.println(s+a);    // 'a' переводится к числу ASCII
        
    }
}
