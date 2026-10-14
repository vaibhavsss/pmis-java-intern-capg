package October_13;

import java.util.*;

/*
Problem 3: Filter odd numbers from an ArrayList 
Task: Create an ArrayList<Integer> with mixed numbers, remove all odd numbers,
 and print the remaining list. 
Key concept: Autoboxing, unboxing, and collections requiring wrapper types instead of primitives. 
Key concept: Integer cache between -128 and 127.  */
public class prac3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        // Autoboxing: primitive ints become Integer objects.
        numbers.add(21);    
        numbers.add(22);
        numbers.add(20);
        numbers.add(31);

        List<Integer> evens = new ArrayList<>();

        for (Integer num : numbers){
            //Unboxing
            if (num % 2 == 0) {
                evens.add(num);
            }
        }
        System.out.println("Even numbers: " + evens);

    }
}
