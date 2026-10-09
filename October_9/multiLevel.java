package October_9;
// Parent class
class Device{
    void smartphone(){
        System.out.println("This is a Smartphone device.");
    }
}
// Child Class 1
class Android extends Device{
    void operatingSystem(){
        System.out.println("This smartphone is Android.");
    }
}
// Child Class 2
class Motorola extends Android{
    void thePhone(){
        System.out.println("Hello, Moto!!");
    }
}

//Main class that implements the inhheritance.
public class multiLevel {
    public static void main(String[] args) {
        Motorola myMoto = new Motorola();
        myMoto.smartphone();
        myMoto.operatingSystem();
        myMoto.thePhone();
    }
}
