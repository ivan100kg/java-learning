package Homeworks.hw28;

import java.time.*;
import java.time.format.*;

public class Hw28 {
    DateTimeFormatter tmpl1 = DateTimeFormatter.ofPattern("y, MMMM-dd !! hh:mm");
    DateTimeFormatter tmpl2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/yy");

    void watch(LocalDateTime ldt1, LocalDateTime ldt2, Period per, Duration dur) {
        while (ldt1.isBefore(ldt2)) {
            System.out.println("Working from " + ldt1.format(tmpl1));
            ldt1 = ldt1.plus(per);
            System.out.println("to " + ldt1.format(tmpl1));
            System.out.println("Having a rest from " + ldt1.format(tmpl2));
            ldt1 = ldt1.plus(dur);
            System.out.println("to " + ldt1.format(tmpl2));
        }
    }

    public static void main(String[] args) {
        Hw28 t = new Hw28();
        LocalDateTime ld1 = LocalDateTime.of(2022, 3, 3, 12, 0, 0);
        LocalDateTime ld2 = LocalDateTime.of(2022, 3, 5, 12, 0, 0);
        Period p = Period.ofDays(1);
        Duration d = Duration.ofMinutes(30);
        t.watch(ld1, ld2, p, d);
    }
}
