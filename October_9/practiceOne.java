package October_9;

class LivingBeing {
    String name;

    void eat() {
        System.out.println("Animal is eating");
    }
}

class PetDog extends LivingBeing {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class practiceOne {
    public static void main(String[] args) {
        PetDog dog = new PetDog();

        dog.name = "Tommy";

        System.out.println("Dog's name: " + dog.name);

        dog.eat();
        dog.bark();
    }
}