package Homeworks.hw22;

public class Animal {
    Animal() {
        System.out.println("I'm animal");
    }

    int eyes;

    void eat() {
        System.out.println("Animal eats");
    }

    void drink() {
        System.out.println("Animal drinks");
    }
}

class Pet extends Animal {
    Pet() {
        System.out.println("I'm pet");
        eyes = 2;
    }

    String name;
    int tail = 1;
    int paw = 4;

    void run() {
        System.out.println("Pet runs");
    }

    void jump() {
        System.out.println("Pet jumps");
    }
}

class Dog extends Pet {
    Dog(String name) {
        System.out.println("I'm a dog. My name is " + name);
    }

    void play() {
        System.out.println("Dog plays");
    }
}

class Cat extends Pet {
    Cat(String name) {
        System.out.println("I'm a cat. My name is " + name);
    }

    void sleep() {
        System.out.println("Cat sleeps");
    }
}

class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("Bart");
        Cat cat = new Cat("Kitty");
        System.out.println(dog.paw);
        cat.sleep();
    }
}

