package Lessons.Lesson18;

public class Test7 {
    public static void main(String[] args) {
        char[] arr = {'p', 'r', 'v', 'e', 't'};
        String s = new String(arr);

        System.out.println(s);

        StringBuilder sb = new StringBuilder("Hello World");
        sb.append(arr,2,3);
        sb.insert(2,arr,1,3);

        System.out.println(sb);
    }
}
