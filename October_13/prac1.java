package October_13;
/*
Given a string of numbers separated by commas, extract each number and calculate the total sum. 
 */
public class prac1 {
    public static void main(String[] args) {
        String input = "20,30,10,11,22";
        String[] parts = input.split(",");
        int total = 0;

        for (String part:parts){
            total += Integer.parseInt(part);
        }
        System.out.println("Total sum: " + total);
    }
}
