/*
Create a parent class Employee with common properties.
Create two child classes:

Developer

Manager

Each employee should have different salary calculation. */

package Inheritance;

class Employee {

    int id;
    String name;
    double baseSalary;

    Employee(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    double calculateSalary() {
        return baseSalary;
    }
}

class Developer extends Employee {

    double bonus;

    Developer(int id, String name, double baseSalary, double bonus) {
        super(id, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }
}

class Manager extends Employee {

    double allowance;

    Manager(int id, String name, double baseSalary, double allowance) {
        super(id, name, baseSalary);
        this.allowance = allowance;
    }

    @Override
    double calculateSalary() {
        return baseSalary + allowance;
    }
}

public class CompanyTest {

    public static void main(String[] args) {

        Developer dev = new Developer(101, "Rahul", 50000, 10000);
        Manager mgr = new Manager(102, "Priya", 70000, 15000);

        dev.displayDetails();
        System.out.println("Developer Salary: " + dev.calculateSalary());

        System.out.println();

        mgr.displayDetails();
        System.out.println("Manager Salary: " + mgr.calculateSalary());
    }
}