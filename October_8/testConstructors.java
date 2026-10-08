package October_8;
class Car{
    String color;
    String model;
    int year;

    // Constructor
    public Car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Model is: " + model);
        System.out.println("Car Color is: " + color);
        System.out.println("Car Year is: " + year + "\n");
    }

    // Method 2 to change the color of the car
    public void changeColor(String newColor) {
        color = newColor;
    }   
}

public class testConstructors {
    public static void main(String[] args) {
        Car C1 = new Car("RED", "Porsche", 2020);
        C1.displayDetails();
        C1.changeColor("BLUE");
        C1.displayDetails();
    }
}
