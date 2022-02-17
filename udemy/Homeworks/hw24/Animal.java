package Homeworks.hw24;

abstract public class Animal {
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
        Mechenosec mech = new Mechenosec("Mech->Mech");
        mech.eat();
        mech.swim();
        mech.sleep();
        System.out.println(mech.name);

        Speakable sp = new Pingvin("Speak->Pin");
        sp.speak();

        Animal an = new Lion("Anim->Lion");
        an.eat();
        an.sleep();
        System.out.println(an.name);

        Mammal mamm = new Lion("Mamm->Lion");
        mamm.run();
        mamm.eat();
        mamm.sleep();
        mamm.speak();
        System.out.println(mamm.name);
    }
}
