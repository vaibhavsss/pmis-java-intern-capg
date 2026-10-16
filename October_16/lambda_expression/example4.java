package October_16.lambda_expression;

import java.util.function.Consumer;

/* 
Use case of Consumer method using lambda expression: 
Example: Send OTP to mobile number.

*/ 
public class example4 {
    public static void main(String[] args) {
        // Consumer<Integer> takes a mobile number and performs an operation
        Consumer<Long> smsNotif = mobileNumber ->
            System.out.println("Sending OTP to mobile number: " + mobileNumber);

        // Calling the Consumer using accept()
        smsNotif.accept(9370609203L);
    }
}
