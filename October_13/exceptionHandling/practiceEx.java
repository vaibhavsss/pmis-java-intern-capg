package October_13.exceptionHandling;

public class practiceEx {
    public static void main(String[] args) {
            int balance = 5000;
    int withdrawl = 7000;

    try{
        if (withdrawl > balance) {
            throw new IllegalArgumentException(
                "Insufficeint balance."
            );
        }
        balance -= withdrawl;
        System.out.println("Withdrawl was successfull");
        System.out.println("Remaining. balance: " + balance);
    } catch(IllegalArgumentException e){
        System.out.println(e.getMessage());
    }
    System.out.println("Program completed");
    }
}
