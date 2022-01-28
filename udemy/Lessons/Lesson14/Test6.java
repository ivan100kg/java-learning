package Lessons.Lesson14;

public class Test6 {
    public static void time() {
        OUTER: for (int hour = 0; hour < 24; hour++) {
            INNER: for (int min = 0; min < 60; min++) {
                if (min >= 5) {
                    continue OUTER;
                }
                for (int sec = 0; sec < 60; sec++) {
                    System.out.println(hour + ":" + min + ":" + sec);
                    if (sec == 30) {
                        break;
//                        break INNER;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        time();
    }
}
