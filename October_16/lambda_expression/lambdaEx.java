package October_16.lambda_expression;
//lambda
@FunctionalInterface 
interface Greeter{
    void greet(String name);
}
public class lambdaEx {
    public static void main(String[] args) {
        Greeter g = name -> System.out.println("Hello, " + name);
        g.greet("Wadapav");
        }
}
