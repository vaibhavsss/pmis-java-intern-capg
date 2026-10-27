public class Bike extends Vehicle{
    public Bike(String id, String model, double dailyRate) {
        super(id, model, dailyRate);
    }

    @Override
    public double calculateRent(int days) {
        double total = getDailyRate() * days;
            if (days >= 7){
                total *= 0.90; // 10% discount for 7 or more days.
            }
            return total;
    }

    @Override
    public String getVehicleType() {
        return "Bike";
    }
}
