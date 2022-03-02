package Lessons.Lesson28;

import java.time.*;

public class Test1 {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        LocalDate birthday = LocalDate.of(1983,1,23);
        System.out.println(birthday);
        LocalTime timeT = LocalTime.of(20,58);
        System.out.println(timeT);
        System.out.println(LocalTime.of(20,58,50));
        System.out.println(LocalTime.of(20,58,50, 199));
        System.out.println(LocalDateTime.of(1, 1, 1,1,1, 1, 1));
    }
}
