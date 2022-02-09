package Lessons.Lesson22;

public class Human {
    final String sex;

    private String name;
    private int age;
    private int weight;
    private boolean clever;

    Human(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 130) {
            this.age = age;
        }
    }

    public void setWeight(int weight) {
        if (weight > 0 && weight < 400) {
            this.weight = weight;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void showInfo(){
        System.out.println("name: "+getName());
        System.out.println("age: "+getAge());
        System.out.println("weight: "+getWeight());
    }

    public boolean isClever() {
        return clever;
    }

    public void setClever(boolean clever) {
        this.clever = clever;
    }
}

class Test {
    public static void main(String[] args) {
        Human h = new Human("M");
        h.setAge(39);
        h.setName("Ivan");
        h.setWeight(99);
        h.showInfo();
    }
}
