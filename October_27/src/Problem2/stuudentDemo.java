package Problem2;

public class stuudentDemo {
    public static void main(String[] args) {
        // Creating student objects
        studentLogic st1 = new studentLogic("Asha", 1, 80, 90, 70);
        studentLogic st2 = new studentLogic("Ravi", 2, 55,40,62);

        // displaying the grades
        st1.display();
        st2.display();
    }
}
