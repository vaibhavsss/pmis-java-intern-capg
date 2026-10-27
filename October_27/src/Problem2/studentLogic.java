package Problem2;

public class studentLogic {
    private String name;
    private int rollNo;
    private double mark1;
    private double mark2;
    private double mark3;

    public studentLogic(String name, int rollNo, double mark1, double mark2, double mark3) {
        this.name = name;
        this.rollNo = rollNo;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    // Method to find Total of all marks.
    public double getTotal(){
        return this.mark1 + this.mark2 + this.mark3;
    }

    // method to calculate the average
    public double getAverage(){
        return getTotal() / 3.0;
    }

    // method to determine grade based on average
    public String getGrade(){
        double avg = getAverage();
        if (avg >= 100){
            return "A+";
        } else if (avg >=75) {
            return "A";
        } else if (avg >= 60) {
            return "B";
        } else if (avg >= 40) {
            return "C";
        } else {
            return "Fail";
        }
    }

    // Method to display student report summary in one line
    public void display(){
        System.out.printf("Roll %d | %s | Total: %.0f | Average: %.2f | Grade: %s%n",
                this.rollNo, this.name, getTotal(), getAverage(), getGrade());
    }
}
