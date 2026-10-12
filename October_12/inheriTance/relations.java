package October_12.inheriTance;
// code example for "has-a-relation"
class Address{
    String city;
    String state;
    int pincode;

    // this is a constructor
    Address(String city, String state, int pincode){
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    //creating the method to display the address
    void displayAddress(){
        System.out.println(city + ", " + state + ", " + pincode);
    }
}

class Student{
    String name;
    int rollNumber;
    Address address;

    // constructor
    Student(String name, int rollNumber, Address address){
        this.name = name;
        this.rollNumber = rollNumber;
        this.address = address;
    }

    // method
    void displayProfile(){
        System.out.println("Student: " + name + ", Roll No: " + rollNumber);
        System.out.print("Lives at: ");
        address.displayAddress();
    }
}
public class relations {
    
}
