package Entity;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("MANAGER")
public class Manager extends Employee {
    @Column(name = "team_size")
    private int teamSize;

    @Column(name = "bonus")
    private double bonus;

    //constructors
    public Manager() {}

    public Manager(String name, double salary, String department, int teamSize, double bonus) {
        super(name, salary, department);
        this.teamSize = teamSize;
        this.bonus = bonus;
    }

    // getters and setters

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Manager{"+
                "id=" + getId() +
                ", name="+ getName() + '\'' +
                ", salary="+ getSalary() +
                ", department="+getDepartment() + '\''+
                ", teamsize="+ teamSize +
                ", bonus="+ bonus+
                '}';
    }
}
