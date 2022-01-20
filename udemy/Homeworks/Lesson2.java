/*
 */
package Homeworks;

public class Lesson2 {
    public static void main(String[] args){
        byte b1 = 0b1100;   // 2
        byte b3 = 014;      // 8
        byte b2 = 12;       // 10
        byte b4 = 0xC;      // 16
        
        short s1 = -0b010100010100;
        short s2 = -02424;
        short s3 = -1300;
        short s4 = -0x514;
        
        int i1 = 0b0;
        int i2 = 00;
        int i3 = 0;
        int i4 = 0x0;
        
        long l1 = 0b0111010110111100110100010101L;
        long l2 = 0726746425L;
        long l3 = 123456789L;
        long l4 = 0x75BCD15L;
        
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);
        
        float f1 = 3.14F;
        float f2 = 2.72F;
        
        double d1 = -0.0000001;
        double d2 = 12345.6789;
        
        boolean bl1 = true;
        boolean bl2 = false;
        
        System.out.println(f1);
        System.out.println(f2);
        
        System.out.println(d1);
        System.out.println(d2);
        
        System.out.println(bl1);
        System.out.println(bl2);
        
        char c1 = 'a';
        char c2 = 14;
        char c3 = '\u00aa';
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
