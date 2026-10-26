
package October_15;

class StudentRecord<T, U> {
    private T name;
    private U rollNumber;

    public StudentRecord(T name, U rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

public class genericClass {
    public static void main(String[] args) {

        StudentRecord<String, Integer> student =
                new StudentRecord<String, Integer>("Vaibhav", 101);

        student.display();
    }
}
