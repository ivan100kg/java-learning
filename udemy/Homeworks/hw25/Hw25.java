package Homeworks.hw25;

public class Hw25 {
}

abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void eat();

    abstract void sleep();
}

abstract class Fish extends Animal {
    Fish(String name) {
        super(name);
    }

    void sleep() {
        System.out.println("Fishes are sleeping deeply");
    }

    abstract void swim();
}

abstract class Bird extends Animal implements Speakable {
    Bird(String name) {
        super(name);
    }

    public void speak() {
        System.out.println(name + " sings");
    }

    abstract void fly();
}

abstract class Mammal extends Animal implements Speakable {
    Mammal(String name) {
        super(name);
    }

    abstract void run();
}

interface Speakable {
    default void speak() {
        System.out.println("Somebody speaks");
    }
}

class Mechenosec extends Fish {
    String name;

    Mechenosec(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void swim() {
        System.out.println("Mechenosec bla bla bla swim");
    }

    @Override
    void eat() {
        System.out.println("Mechenosec bla bla bla eat");
    }
}

class Pingvin extends Bird {
    Pingvin(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void fly() {
        System.out.println("Pingvin bla bla bla fly");

    }

    @Override
    void eat() {
        System.out.println("Pingvin bla bla bla eat");
    }

    @Override
    void sleep() {
        System.out.println("Pingvin bla bla bla sleep");

    }

    @Override
    public void speak() {
        System.out.println("Pingvin can't sing like bird!");
    }
}

class Lion extends Mammal {
    Lion(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void run() {
        System.out.println("Lion bla bla bla run");

    }

    @Override
    void eat() {
        System.out.println("Lion bla bla bla eat");

    }

    @Override
    void sleep() {
        System.out.println("Lion bla bla bla sleep");

    }
}

class TestAll {
    public static void main(String[] args) {
        Speakable[] speakableArr = {new Lion("lionS"), new Pingvin("pingvinS")};
        Animal[] animalArr = {new Lion("lionA"), new Mechenosec("mechA"), new Pingvin("pingvinS")};

//        for (Speakable s : speakableArr){
        for (Animal s : animalArr) {
            System.out.println("--------------------------------");
            if (s instanceof Animal) {
                ((Animal) s).eat();
                System.out.println("Animal");
            }
            if (s instanceof Fish) {
                ((Fish) s).eat();
                System.out.println("Fish");

            }
            if (s instanceof Bird) {
                ((Bird) s).eat();
                System.out.println("Bird");

            }
            if (s instanceof Mammal) {
                ((Mammal) s).eat();
                System.out.println("Mammal");

            }
            if (s instanceof Speakable) {
                ((Animal) s).eat();
                System.out.println("Speakable");

            }
            if (s instanceof Mechenosec) {
                ((Mechenosec) s).eat();
                System.out.println("Mechenosec");

            }
            if (s instanceof Pingvin) {
                ((Pingvin) s).eat();
                System.out.println("Pingvin");

            }
            if (s instanceof Lion) {
                ((Lion) s).eat();
                System.out.println("Lion");

            }


        }
    }
}
