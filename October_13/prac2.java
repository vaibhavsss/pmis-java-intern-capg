package October_13;
/*Problem 2: Count character types in a password 
Task: Given a password string, count how many uppercase letters, 
lowercase letters, digits, and special characters it contains. 
Key concept: Built-in static utility methods of Character. 
 */
public class prac2 {
    public static void main(String[] args) {
        String text = "Pass@1234_Mumbai";
        int upper = 0, lower = 0, digits = 0, special = 0;
        for (char ch : text.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                upper++;
            }else if (Character.isLowerCase(ch)){
                lower++;
            }else if (Character.isDigit(ch)){
                digits++;
            }else {
                special++;
            }
        }
        System.out.println("Uppercase: " + upper);
        System.out.println("Uppercase: " + lower);
        System.out.println("Uppercase: " + digits);
        System.out.println("Uppercase: " + special);

    }
}
