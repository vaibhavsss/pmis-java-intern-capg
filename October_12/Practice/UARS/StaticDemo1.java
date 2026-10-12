package October_12.Practice.UARS;

public class StaticDemo1 {
    public static void main(String[] args) {
        System.out.println("Initial user count: " + UserAccount.getTotalUsers());
        System.out.println("\n");
        UserAccount user1 = new UserAccount("Aarav");
        System.out.println("New user created, with name: " + user1.getUsername());

        UserAccount user2 = new UserAccount("Priya");
        System.out.println("New user created, with name: " + user2.getUsername());

        UserAccount user3 = new UserAccount("Rohan");
        System.out.println("New user created, with name: " + user3.getUsername());

        // Displaying the final total users
        System.out.println("Total users: " + UserAccount.getTotalUsers());
    }
}
