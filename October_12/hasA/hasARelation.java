package October_12.hasA;
class Battery{
    int capacityMah;
     //constructor
     Battery(int capaityMah){
        this.capacityMah = capaityMah;
     }
     //method
     void drain(){
        System.out.println("Battery capacity: " + capacityMah);
     }
}
class Camera{
    int pixels;

    // constructor
    Camera(int pixels){
        this.pixels = pixels;
    }

    //method
    void hasPixels(){
        System.out.println("Phone has: " + pixels + " in it's telephoto lens.");
    }
}
class Phone{
    String brand;
    Battery battery;
    Camera camera;

    // constructor
    Phone(String brand, Battery battery, Camera camera){
        this.brand = brand;
        this.battery = battery;
        this.camera = camera;
    }

    //method for Phone
    void workingPhone(){
        System.out.println("This is a " + brand + "flagship phone.");
        battery.drain();
        camera.hasPixels();
    }
}



public class hasARelation {
    
}
