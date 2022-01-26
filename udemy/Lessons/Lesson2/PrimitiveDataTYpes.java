package Lessons.Lesson2;

public class PrimitiveDataTYpes {
    public static void main(String [] args){
        
        byte b1 = 10;   
        byte b2 = 127;
        
        short s1 = -38;
        short s2 = 300;
        
        int i1 = 500;
        int i2 = -2000;
        
        long l1 = 10000000000L;
        
        float f1 = 47.23F;
        
        double d1 = 36.79;
        
        char c1 = 'g';
        char c2 = '7';
        char c3 = 300;
        char c4 = '\u0500'; // 16-рич система
        
        boolean bool1 = true;
        
        int bin1 = 0b1000;
        int oct1 = 074;             // восьмеричная си
        int hex1 = 0x3C;            // 16-ричная  
        
        int a7 = 1_000_000;         // использование для удобства
        
        System.out.println(oct1);
    }    
}
