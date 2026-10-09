package October_8.OOPS;
class Vehicle{
    //attribute
    String brand;

    //method
    void startEngine(){
        System.out.println(brand + " engine started.");
    }

}

//child  class
class Bike extends Vehicle{
    boolean hasCarrier;

    void kickStand(){
        System.out.println("Kickstand put down.");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Bike myBike = new Bike();
        myBike.brand = "Hunter";
        myBike.startEngine();
        myBike.kickStand();
    }
}
