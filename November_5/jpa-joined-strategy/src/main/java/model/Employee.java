package model;

import jakarta.persistence.Entity;

@Entity
public class Employee extends Person {
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private double salary;
}
