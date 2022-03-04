package Lessons.Lesson28;

import java.time.*;
import java.time.format.*;

public class Test6 {
    public static void main(String[] args) {
        LocalDate d = LocalDate.of(2022, 3, 3);
        LocalTime t = LocalTime.of(19,29,30);
        LocalDateTime dt = LocalDateTime.of(d,t);

        DateTimeFormatter d1 = DateTimeFormatter.ISO_LOCAL_DATE;
        DateTimeFormatter d2 = DateTimeFormatter.ISO_WEEK_DATE;
        DateTimeFormatter t1 = DateTimeFormatter.ISO_LOCAL_TIME;
        DateTimeFormatter dt1 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        System.out.println(d);
        System.out.println(d.format(d1));
        System.out.println(d.format(d2));
        System.out.println(t);
        System.out.println(t.format(t1));
        System.out.println(dt);
        System.out.println(dt.format(dt1));
        System.out.println("------------------------------------\n");
        DateTimeFormatter sht = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter sh2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        DateTimeFormatter sh3 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        DateTimeFormatter sh4 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        DateTimeFormatter sh5 = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);

        System.out.println(d);
        System.out.println(d.format(sht));
        System.out.println(d.format(sh2));
        System.out.println(d.format(sh3));
        System.out.println(d.format(sh4));
        System.out.println(t.format(sh5));
        System.out.println(sh5.format(t));
        System.out.println("------------------------------------\n");

        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, ww, hh:mm");
        System.out.println(f.format(dt));
        System.out.println("------------------------------------\n");

        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate ld = LocalDate.parse("1983.01.23", f1);
        System.out.println(ld);

    }
}
