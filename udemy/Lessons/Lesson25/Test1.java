package Lessons.Lesson25;


import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();
        /*HelpAble help = new Teacher();

        emp1.work();
        emp2.work();
        emp3.work();
        *//*emp1.help();
        emp2.help();
        emp3.help();*//*

        Driver[] arr1 = new Driver[2];
        Driver[] arr2 = {new Driver(), new Driver()};
        Employee[] arr3 = {new Driver(), new Doctor(), new Teacher()};
        HelpAble[] arr4 = {new Driver(), new Doctor(), new Teacher()};

        ArrayList<HelpAble> list1 = new ArrayList<>();
        list1.add(new Driver());
        list1.add(new Teacher());
        list1.add(new Driver());
        System.out.println(list1);

        Employee[] arr5 = {emp1, emp2, emp3};
        for (Employee e : arr5){
            e.work();
        }*/

        System.out.println(emp1 instanceof Employee);
        System.out.println(emp1 instanceof Teacher);
        System.out.println(emp1 instanceof Driver);
        System.out.println(emp1 instanceof HelpAble);
        System.out.println(emp1 instanceof Object);
    }
}

abstract class Employee {
    void sleep() {
        System.out.println("Employee sleeps");
    }

    abstract void work();
}

class Teacher extends Employee implements HelpAble {
    void work() {
        System.out.println("Teacher works");
    }

    public void help() {
        System.out.println("Teacher helps");
    }
}

class Driver extends Employee implements HelpAble {
    void work() {
        System.out.println("Driver works");
    }

    public void help() {
        System.out.println("Driver helps");
    }

}

class Doctor extends Employee implements HelpAble {
    void work() {
        System.out.println("Doctor works");
    }

    public void help() {
        System.out.println("Doctor helps");
    }
}

interface HelpAble {
    void help();
}