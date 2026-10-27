import java.util.ArrayList;
import java.util.List;

public class RentalShop {
    private List<Vehicle> fleet;

    public RentalShop() {
        this.fleet = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public Rental rent(String vehicleId, Customer customer, int days) throws RentalException {
        Vehicle targetVehicle = null;

        for (Vehicle v : fleet) {
            if (v.getId().equalsIgnoreCase(vehicleId)) {
                targetVehicle = v;
                break;
            }
        }

        if (targetVehicle == null) {
            throw new RentalException("Error: Vehicle with ID " + vehicleId + " not found");
        }

        if (!targetVehicle.isAvailable()) {
            throw new RentalException("Error: " + targetVehicle.getVehicleType() + " "
                    + targetVehicle.getModel() + " (" + targetVehicle.getId() + ") is already rented");
        }

        targetVehicle.setAvailable(false);
        Rental rental = new Rental(targetVehicle, customer, days);
        customer.addRental(rental);

        System.out.printf("%s rented %s %s (%s) for %d days = %.2f%n",
                customer.getName(),
                targetVehicle.getVehicleType(),
                targetVehicle.getModel(),
                targetVehicle.getId(),
                days,
                rental.getTotalCost());

        return rental;
    }

    public void giveBack(String vehicleId) {
        for (Vehicle v : fleet) {
            if (v.getId().equalsIgnoreCase(vehicleId)) {
                v.setAvailable(true);
                return;
            }
        }
    }

    public void showAvailable() {
        System.out.println("Available vehicles:");
        for (Vehicle v : fleet) {
            if (v.isAvailable()) {
                System.out.println("  " + v.getVehicleType() + " " + v.getModel() + " (" + v.getId() + ")");
            }
        }
    }
}