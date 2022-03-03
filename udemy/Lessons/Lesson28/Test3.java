package Lessons.Lesson28;

import java.time.*;

public class Test3 {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2014, 5, 31);
        LocalDate ld2 = LocalDate.of(2012, 6, 12);
        LocalTime lt1 = LocalTime.of(15, 30);
        LocalTime lt2 = LocalTime.of(17, 10, 12, 12345);
        LocalDateTime ldt1 = LocalDateTime.of(2015, Month.MAY, 10, 17, 25);
        LocalDateTime ldt2 = LocalDateTime.of(2025, Month.JANUARY, 1, 7, 5, 13);

        boolean b = ld1.isAfter(ld2);
        System.out.println(b);

    }
}