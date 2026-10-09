package HackerRank.October_9;

import java.util.*;

public class secondLargest {

    public static int secondLargest(int n, List<Integer> arr) {
        Integer largest = null;
        Integer secondLargest = null;

        for (int num : arr) {
            if (largest == null || num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num < largest && (secondLargest == null || num > secondLargest)) {
                secondLargest = num;
            }
        }

        return secondLargest == null ? -1 : secondLargest;
    }

    public static void main(String[] args) {

    }
}