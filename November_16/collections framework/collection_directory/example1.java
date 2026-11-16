package collection_directory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class example1 {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("Vlad");
        name.add("Itami");
        name.add("Zuko");

        // getting the first element
        System.out.println("The first element is: " + name.getFirst());

        // getting the last element
        System.out.println("The last element is: " + name.getLast());

        // getting a specific element
        System.out.println("Your element is: " + name.get(1));

        // getting the size of the List
        System.out.println("Size of the array is: "+name.size());

        // adding the new element
        name.add("Kane");

        System.out.println(name);


    }
}
