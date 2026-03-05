package OOPS_Demo1;

// Abstraction
abstract class Employee {

    private int id;          // Encapsulation
    private String name;     // Encapsulation

    // Constructor
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter methods (Encapsulation)
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Abstract method
    abstract void calculateSalary();
}

// Inheritance
class Developer extends Employee {

    Developer(int id, String name) {
        super(id, name);
    }

    // Method Overriding (Polymorphism)
    void calculateSalary() {
        System.out.println("Developer salary: 60000");
    }
}

class Manager extends Employee {

    Manager(int id, String name) {
        super(id, name);
    }

    // Method Overriding (Polymorphism)
    void calculateSalary() {
        System.out.println("Manager salary: 90000");
    }
}

public class CompanyTest {

    public static void main(String[] args) {

        Employee e1 = new Developer(101, "Rahul");
        Employee e2 = new Manager(102, "Priya");

        System.out.println(e1.getId() + " " + e1.getName());
        e1.calculateSalary();

        System.out.println(e2.getId() + " " + e2.getName());
        e2.calculateSalary();
    }
}