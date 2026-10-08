package Exercise_1;
import java.util.*;

// Write a function that calculates the Greatest Common Divisor of 2 numbers. 
public class exerciseQ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        int gcd = findGCD(num1, num2);
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }

    public static int findGCD(int a, int b){
        if (b == 0){
            return a;
        }else{
            return findGCD(b, a % b);
        }
    }
}
