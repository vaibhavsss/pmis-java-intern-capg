class CoffeeWallet {
    // Attributes
    String customerName;
    double balance;

    // Constructor
    CoffeeWallet(String customerName, double balance) {
        this.customerName = customerName;
        this.balance = balance;
    }

    // Add funds
    void addFunds(double amount) {
        balance += amount;
        System.out.println("Added ₹" + amount);
        System.out.println("Current balance: ₹" + balance);
    }

    // Purchase
    void purchase(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Purchase successful!");
            System.out.println("Amount spent: Rs." + amount);
            System.out.println("Current balance: Rs." + balance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    // Account overview
    void displayOverview() {
        System.out.println("Customer: " + customerName);
        System.out.println("Balance: Rs." + balance);
    }
}

public class constructor_questions {
    public static void main(String[] args) {
        // Opening wallet with ₹500
        CoffeeWallet wallet = new CoffeeWallet("Vaibhav", 500);

        // Account overview
        wallet.displayOverview();

        // Top up with ₹200
        wallet.addFunds(200);

        // Buy ₹150 snack
        wallet.purchase(150);

        // Attempt to buy ₹800 item
        wallet.purchase(800);

        // Final overview
        wallet.displayOverview();
    }
}