package Exercise_1;

import java.util.*;
//Q4. Write a function that takes in the radius as input and returns the circumference of a circle.

public class exerciseQ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius (r): ");
        double r = sc.nextDouble();
        System.out.println("The circumference of the circle is: " + circumference(r));
    }

    public static double circumference(double r){
        return 2 * 3.1415 * r;
    }
}
