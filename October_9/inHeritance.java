package October_9;

// Single level inheritance.
class Animal{
    void eats(){
        System.out.println("The animal eats something.");
    }
}
class Dog extends Animal{
    void baks() {
        System.out.println("The Dog Barks.");
    }
}
public class inHeritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eats();
        myDog.baks();
    }
}
