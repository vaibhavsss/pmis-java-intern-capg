package October_8.OOPS;
// abstract parent class
abstract class PaymentGateway{
    //Concrete method (shared behavior)
    void printReceipt(){
        System.out.println("Receipt generated.");
    }

    //Astratc method: No body, child MUsT implement this
    abstract void processPayment(double amount);
}

//Concrete Child Class 1
class UPIPayment extends PaymentGateway{
    @Override
    void processPayment(double amount){
        System.out.println("Processing ₹"+amount+" via UPI QR code.");
    }
}
//Concrete Child Class 2
class CreditCardPayment extends PaymentGateway {
    @Override
    void processPayment(double amount){
        System.out.println("Processing ₹" + amount + " via Card Swipe and OTP.");
    }
}
public class abstraction {
    public static void main(String[] args) {
        PaymentGateway payment = new UPIPayment();
        payment.processPayment(250.0);
        payment.printReceipt();
    }
}
