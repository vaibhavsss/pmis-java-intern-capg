package collection_directory;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        List<String> programmingLanguages = new ArrayList<>();

        // adding elements
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("C++");
        programmingLanguages.add("JavaScript");

        // printing complete ArrayList
        System.out.println("Programming languages are:" + programmingLanguages);

        // print the element at index 2
        System.out.println("The index 2 element is: " + programmingLanguages.get(2));

        // Replace "Python" with "SQL"
        programmingLanguages.set(1, "SQL");
        System.out.println("After replacing Python: " + programmingLanguages);

        // Remove "C++" from the list.
        programmingLanguages.remove("C++");
        System.out.println("After removing C++: " + programmingLanguages);

        // Check whether "Java" exists using contains()
        programmingLanguages.contains("Java");

        // Print the total number of elements using size().
        System.out.println(programmingLanguages.size());

        // Print all remaining elements using an enhanced for loop.
        for (String prg : programmingLanguages) {
            System.out.println(prg);
        }

        // Check whether the ArrayList is empty.
        System.out.println("Is empty?" + programmingLanguages.isEmpty());


    }
}
