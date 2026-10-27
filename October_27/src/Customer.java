import java.util.List;
import java.util.ArrayList;

public class Customer {

    private String name;
    private List<Rental> rentalHistory;

    // constructor
    public Customer(String name) {
        this.name = name;
        this.rentalHistory = new ArrayList<>();
    }

    //getter method
    public String getName() {
        return name;
    }

    public void addRental(Rental rental){
        rentalHistory.add(rental);
    }

    public List<Rental> getRentalHistory() {
        return rentalHistory;
    }
}
