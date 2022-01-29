package Lessons.Lesson15;

public class Test10 {
    public static void main(String[] args) {
        // nested loops
        OUTER:
        for (int hour = 0; hour < 24; hour++) {
            int min = 0;
            INNER:
            while (min < 60) {
                if (min == 20) {
                    continue OUTER;
                }
                System.out.println(hour + ":" + min);
                min++;
            }
        }
    }
}
