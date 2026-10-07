package Exercise_1;
//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. 𝑥^𝑛
import java.util.*;
public class exerciseQ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number (x): ");
        int x = sc.nextInt();
        System.out.print("Enter the exponent (n): ");
        int n = sc.nextInt();
        int result = power(x, n);
        System.out.println(x + " raised to the power of " + n + " is: " + result);
    }
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }
}