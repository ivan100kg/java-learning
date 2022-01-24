package Lesson6;

public class MethodOverloading {
    void show(int i1){
        System.out.println(i1);
    }
    
    
    void show(boolean b1){
        System.out.println(b1);
    }
    
    void show(String s1){
        System.out.println(s1);
    }
}

class MethodOverloadingTest{
    public static void main(String[] args) {
        MethodOverloading mO = new MethodOverloading();
        
        int a = 500;
        boolean b = true;
        String s = "lalala";
        
        mO.show(a);
        mO.show(b);
        mO.show(s);
    }
}


