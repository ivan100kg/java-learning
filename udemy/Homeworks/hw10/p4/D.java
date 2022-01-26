package Homeworks.hw10.p4;
import Homeworks.hw10.p1.A;
import Homeworks.hw10.p1.p2.p3.C;
import Homeworks.hw10.p4.p5.E;
import static Homeworks.hw10.p1.p2.B.*;



public class D {
    public static void main(String[] args) {
        A a1 = new A();
        C c1 = new C();
        E e1 = new E();
        int b1 = b; // static from B

        System.out.println(a1.a);
        System.out.println(c1.c);
        System.out.println(e1.e);
        System.out.println(b1);
    }
}
