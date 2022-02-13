package Homeworks.hw14;

public class Hw14 {
    static void time() {
        HOUR:
        for (int hour = 0; hour < 6; hour++) {
            MIN:
            for (int min = 0; min < 60; min++) {
                if (hour > 1 && min % 10 == 0) {
                    break HOUR;
                }
                for (int sec = 0; sec < 60; sec++) {
                    if (sec * hour > min) {
                        continue MIN;
                    }
                    System.out.println(hour + ":" + min + ":" + sec);
                }
            }
        }
    }

    public static void main(String[] args) {
        time();
    }
}
