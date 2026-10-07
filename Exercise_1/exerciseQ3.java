package Exercise_1;
// write a function that takes in two numbers and returns the greater of the two.
import java.util.*;
public class exerciseQ3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        double n1 = sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        double n2 = sc.nextDouble();
        double greater = greaterOfTwo(n1, n2);
        System.out.println("The greater of the two numbers is: " + greater);
    }
    public static double greaterOfTwo(double n1, double n2){
        return (n1 > n2) ? n1 : n2;
    }
}
