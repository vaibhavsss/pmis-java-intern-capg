package Exercise_2;

import java.util.*;

class Employee {
    // 1. Private fields (Encapsulation)
    private int id;
    private String name;
    private double salary;

    // 2. Parameterized Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        if (salary >= 0) {
            this.salary = salary;
        } else {
            this.salary = 0.0;
        }
    }

    // 3. Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // 4. Setter with validation
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Error: Salary cannot be negative.");
        }
    }

    // 5. Business logic method
    public void giveRaise(double percent) {
        if (percent > 0) {
            double raiseAmount = this.salary * (percent / 100.0);
            this.salary += raiseAmount;
            System.out.println(name + " received a " + percent + "% raise. New Salary: ₹" + this.salary);
        } else {
            System.out.println("Raise percentage must be positive.");
        }
    }
}

public class problemSet1 {
    public static void main(String[] args) {
        // Create an employee instance
        Employee emp = new Employee(101, "Vlad", 50000.0);
        System.out.println("Initial Salary: ₹" + emp.getSalary());

        // Apply an 8% raise
        emp.giveRaise(8);

        // Attempt invalid update
        emp.setSalary(-25000);

        // Final check
        System.out.println("Final Verified Salary: ₹" + emp.getSalary());
    }
}