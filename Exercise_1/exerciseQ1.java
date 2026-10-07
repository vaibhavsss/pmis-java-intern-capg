package Exercise_1;
import java.util.*;
public class exerciseQ1 {
    public static void main(String[] args) {
        //Q1. Enter 3 numbers from the user and make a function to print their average.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter the third number: ");
        double num3 = sc.nextDouble();
        double average = calculateAverage(num1, num2, num3);
        System.out.println("The average of the three numbers is: " + average + ".");
    }

    public static double calculateAverage(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}
