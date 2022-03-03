package Lessons.Lesson28;

import java.time.*;

public class Test6 {
    public static void main(String[] args) {
        LocalDate b = LocalDate.of(2022, 3, 3);
        LocalTime t = LocalTime.of(19,29,30);
        LocalDateTime dt = LocalDateTime.of(b,t);

        Period p = Period.ofWeeks(2);
        Duration d = Duration.ofHours(2);

        System.out.println(b.getDayOfYear());
        System.out.println(t.getNano());

    }
}
