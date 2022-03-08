package Lessons.Lesson29;

public class A { // класс в методе которого используется интерфейс
    // метод, один парам которого интерфейс I
    static void foo(double b, I i, int a) {
        // в методе класса идет вызов метода интерфейса i.bar(param)
        System.out.println(a + " Hi " + i.bar(" bla-bla ") + b);
    }

    static void foo2(I2 i) {
        System.out.println("Override I2.bar() " + i.bar(10));
    }

    public static void main(String[] args) {
        // вызываем метод класса и переопределяем метод интерфейса на месте.
        foo(2.72, (String s) -> { // здесь идет переопределение метода
            return "everyone" + s;      // интерфейса, без создания доп класса.
        }, 12);                     // (String s) мож просто (s) - параметр
        // {return "everyone" + s;} - тело
        foo2((int i) -> {
            i += 10;
            return i;
        });
    }
}

// чтобы использовать lambda выражения в интерфейсе дол быть только 1 метод
interface I {               // интерфейс с 1 абстрактным методом
    String bar(String s);   // метод который дол быть переопределен
}

interface I2 {
    int bar(int i);
}
