package Lessons.Lesson28;

import java.time.*;

public class Test5 {
    public static void main(String[] args) {
        LocalDate b = LocalDate.of(2022, 3, 3);
        Period p = Period.ofMonths(3);
        System.out.println(b.plus(p));
        Duration d = Duration.ofSeconds(12);
        LocalDateTime ldt1 = LocalDateTime.of(2015, Month.MAY, 10, 17, 25);
        System.out.println(ldt1.plus(d));
        System.out.println(ldt1.getDayOfWeek());

    }
}
