package Homeworks.hw29;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {
    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

class TestEmployee {
    void printEmployee(Employee emp) {
        System.out.println("Name: " + emp.name + ", department: " + emp.department + ", salary: " + emp.salary);
    }

    void empFilter(Predicate<Employee> emp, ArrayList<Employee> arr) {
        for (Employee e : arr) {
            if (emp.test(e)) {
                printEmployee(e);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> arr = new ArrayList<>();
        arr.add(new Employee("Ivan", "IT", 7000.0));
        arr.add(new Employee("Egor", "Cleaning", 400.0));
        arr.add(new Employee("Olga", "IT", 2520.0));
        arr.add(new Employee("Luis", "IT", 3860.0));
        arr.add(new Employee("Pedro", "IT", 4200.0));
        arr.add(new Employee("Irina", "IT", 1440.0));
        arr.add(new Employee("Maria", "Cleaning", 350.0));
        arr.add(new Employee("Oleg", "Security", 820.0));
        arr.add(new Employee("Pablo", "Security", 1100.0));

        TestEmployee t = new TestEmployee();

        t.empFilter(e -> e.department.equals("IT") && e.salary > 3000, arr);
        System.out.println("--------");
        t.empFilter(e -> e.name.startsWith("E") && e.salary != 450.0, arr);
        System.out.println("--------");
        t.empFilter(e -> e.name.equals(e.department), arr);

    }
}
