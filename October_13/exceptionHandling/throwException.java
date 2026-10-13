package October_13.exceptionHandling;
import java.util.*;
public class throwException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if (age<0) {
            throw new IllegalArgumentException(
                "Age cannot be negative"
            );
        } else if (age>=1 && age<=100){
            System.out.println("Age: " + age);
        }else{
            System.out.println("Your age is not possible, possibbly dead.");
        }
    }    
}
