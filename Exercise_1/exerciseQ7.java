package Exercise_1;
//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
import java.util.*;
public class exerciseQ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers (enter 'x' to Stop): ");
        int positiveCount = 0;
        int negativeCount = 0;
        int zerosCount = 0;
        while(true) {
            String input = sc.next().toLowerCase();
            if(input.equals("x")) {
                break;
            }
            int number = Integer.parseInt(input);
            if(number > 0) {
                positiveCount++;
            } else if(number < 0) {
                negativeCount++;
            } else {
                zerosCount++;
            }
        }
        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Zeros: " + zerosCount);

    }
}
