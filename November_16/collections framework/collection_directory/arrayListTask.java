package collection_directory;

import java.util.ArrayList;
import java.util.Collection;

public class arrayListTask {
    public static void main(String[] args) {
        Collection<String> students = new ArrayList<>();
        students.add("Vaibhav");
        students.add("Rahul");
        students.add("Amit");
        students.add("Sneha");

        // print all students names
        System.out.println("Students: " + students);

        // check if "Rahul" exists
        System.out.println("Is Rahul present? " + students.contains("Rahul")); // true

        // Remove "Amit".
        System.out.println("After removing Amit: " +students.remove("Amit"));

        // Print the total number of students remaining.
        System.out.println("Total Students: " +students.size());

        // Check whether the collection is empty.
        System.out.println(students.isEmpty());

    }
}
