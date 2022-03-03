package Lessons.Lesson28;

import java.time.LocalDate;
import java.time.Period;

public class Test4 {
    static void watch(LocalDate beginning, LocalDate end, Period p) {
        LocalDate date = beginning;
        while (date.isBefore(end)) {
            System.out.println("It's time " + date + " to change the watchman");
            date = date.plus(p);
        }
    }

    public static void main(String[] args) {
        LocalDate b = LocalDate.of(2022, 3, 3);
        LocalDate e = LocalDate.of(2032, 8, 31);
        Period p = Period.ofYears(1);
        watch(b, e, p);
    }
}
