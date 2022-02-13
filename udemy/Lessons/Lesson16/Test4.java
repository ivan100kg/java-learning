package Lessons.Lesson16;

public class Test4 {
}

class Employee {
    double salary;
    boolean isManager;

    Employee(double salary, boolean isManager) {
        this.salary = salary;
        this.isManager = isManager;
    }
}

class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee(200.5, true);
        System.out.println("" + emp.isManager + emp.salary);
    }
}
