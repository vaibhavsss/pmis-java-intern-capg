public class vehicleRentalShop {
    public static void main(String[] args) {
        RentalShop shop = new RentalShop();

        Vehicle swift = new Car("C1", "Swift Dzire", 1525.0);
        Vehicle activa = new Bike("A1", "Activa 5G", 400.0);
        Vehicle tataAce = new Truck("D1", "Tata Ace", 2500.0);

        shop.addVehicle(swift);
        shop.addVehicle(activa);
        shop.addVehicle(tataAce);

        Customer asha = new Customer("Asha");
        Customer ravi = new Customer("Ravi");

        try {
            shop.rent("A1", asha, 8);
        } catch (RentalException e) {
            System.out.println(e.getMessage());
        }

        try {
            shop.rent("D1", ravi, 2);
        } catch (RentalException e){
            System.out.println(e.getMessage());
        }

        try {
            shop.rent("C1", ravi, 3);
        }catch (RentalException e){
            System.out.println(e.getMessage());
        }

        shop.giveBack("A1");
        shop.showAvailable();

    }
}
