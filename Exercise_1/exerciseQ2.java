package Exercise_1;
//Write a java function to print the sum of all odd numers from 1 to n.
import java.util.*;
public class exerciseQ2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("The sum of all odd numbers from 1 to " + n + " is: " + sumOfOddNumbers(n));



    }
    public static int sumOfOddNumbers(int n){
        int sum = 0;
        for(int i=1; i<=n; i+=2){
            sum += i;
        }
        return sum;
    }
}
