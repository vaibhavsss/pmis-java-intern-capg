package model;

import jakarta.persistence.Entity;

@Entity
public class Student extends Person {
    private String major;
    // getter and setter
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
