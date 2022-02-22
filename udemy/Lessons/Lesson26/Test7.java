package Lessons.Lesson26;

public class Test7 {
    public static void main(String[] args) {
        Lion l = new Lion();
    }
}

class Animal {
    Animal() {
        System.out.println("Constructor of Animal");
    }

    static {
        System.out.println("static init in Animal");
    }

    {
        System.out.println("non-static init in Animal");
    }
}

class Mammal extends Animal {
    Mammal() {
        System.out.println("Constructor of Mammal");
    }

    static {
        System.out.println("static init in Mammal");
    }

    {
        System.out.println("non-static init in Mammal");
    }
}

class Lion extends Mammal {
    Lion() {
        System.out.println("Constructor of Lion");
    }

    static {
        System.out.println("static init in Lion");
    }

    {
        System.out.println("non-static init in Lion");
    }
}
