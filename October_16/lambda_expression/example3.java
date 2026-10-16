package October_16.lambda_expression;

import java.util.function.Consumer;

// Exxample of: consumer<T>: T -> "Hello, Hi".accept()
public class example3 {
    public static void main(String[] args) {
        Consumer<String> greeting = message -> System.out.println(message);

        greeting.accept("Hello");
        greeting.accept("Hi");
    }
}
