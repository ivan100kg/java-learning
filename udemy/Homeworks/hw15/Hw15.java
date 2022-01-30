package Homeworks.hw15;

public class Hw15 {
    static void time2() {
        int hour = 0, min = -1, sec = 0;

        HOUR:
        while (hour < 6) {
            min = -1;
            MIN:
            do {
                min++;
                if (hour > 1 && min % 10 == 0) {
                    break HOUR;
                }
                sec = 0;
                SEC:
                while (sec < 60) {
                    if (sec * hour > min) {
                        continue MIN;
                    }
                    System.out.println(hour + ":" + min + ":" + sec);
                    sec++;
                }


            } while (min < 59);
            hour++;

        }
    }

    public static void main(String[] args) {
        time2();
    }

}
