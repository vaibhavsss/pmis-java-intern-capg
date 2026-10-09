package October_9;

class CompanyEmployee {
    String name;
    double salary;

    CompanyEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class ITManager extends CompanyEmployee {
    String department;

    ITManager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
        System.out.println("Role: Manager");
    }
}

public class practiceTwo {
    public static void main(String[] args) {
        ITManager manager = new ITManager("Vlad", 50000, "IT");

        manager.displayDetails();
    }
}
