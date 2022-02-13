package Lessons.Lesson15;

public class Test9 {
    public static void main(String[] args) {
        int hour = 0;

        OUTER:
        do {
            int min = 0;
            INNER:
            while (min < 60) {
                System.out.println(hour + ":" + min);
                min++;
            }
            hour++;
        } while (hour < 24);
    }
}
