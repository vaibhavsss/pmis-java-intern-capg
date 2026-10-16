package October_16.lambda_expression;

import java.util.function.Function;
import java.util.*;
/*
Lambda Function:

Function<T, R> variable = var -> var * var;

*/
public class example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        Function<Integer, Integer> square = sq -> sq * sq;
        System.out.println("The square of " + a + " is: "+square.apply(a));
    }
}
