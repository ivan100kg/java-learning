package Lessons.Lesson17;
class Car{}

public class Test1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Good day");
        StringBuilder sb3 = new StringBuilder(50);
        StringBuilder sb4 = new StringBuilder(sb2);

        System.out.println(sb2.length());
        System.out.println(sb2.charAt(0));
        System.out.println(sb2.indexOf("Go", 0));
        System.out.println(sb2.substring(1, 5));

        System.out.println(sb2.subSequence(1, 5));
        System.out.println(sb2.append(12));
        System.out.println(sb2.insert(0, new Car()));   // добавить вначало объект Car
        System.out.println(sb2.insert(20, " AAAAA "));
        System.out.println(sb2.delete(0, 21));
        System.out.println(sb2.deleteCharAt(sb2.length()-1));   // delete the last symbol
        System.out.println(sb2.reverse());
        System.out.println(sb2.replace(0, 1, "Ж"));
        System.out.println(sb4.capacity());
        System.out.println(sb1.capacity());




    }
}
