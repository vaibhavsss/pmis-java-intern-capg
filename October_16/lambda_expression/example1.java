package October_16.lambda_expression;
/*
Built-in function innterfaces
1. Predicate<T> test(t) T -> t/f 1/0
*/
import java.util.function.*;
public class example1 {
    public static void main(String[] args) {
        Function<String, Integer> getLength = name -> name.length();
        System.out.println(getLength.apply("Java"));
        System.out.println(getLength.apply("Johnny"));

    }
}
