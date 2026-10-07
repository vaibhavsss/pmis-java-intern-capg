package Exercise_1;

import java.util.*;
//Q5. Write a function that takes in age as input and returns if that person is eligibleto vote or not. A person of age > 18 is eligible to vote.
public class exerciseQ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you age: ");
        int age = sc.nextInt();
        if(isEligibleToVote(age)){
            System.out.println("You can vote.");
        } else{
            System.out.println("You cannot vote.");
        }
    }
    public static boolean isEligibleToVote(int age) {
        return age >= 18;
    }
}
