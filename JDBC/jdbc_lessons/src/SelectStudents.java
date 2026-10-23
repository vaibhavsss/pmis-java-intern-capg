
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectStudents {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/pmis";
        String username = "";
        String password = "";

        String query = "SELECT * FROM students";

        try (
                Connection con = DriverManager.getConnection(url, username, password);
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(query)
        ) {
            System.out.println("Connected to MySQL successfully!");
            System.out.println("\nStudent Records");
            System.out.println("------------------------------");

            while (rs.next()) {
                String uid = rs.getString("uid");
                String name = rs.getString("full_name");
                String email = rs.getString("email_address");

                System.out.println("UID: " + uid);
                System.out.println("Name: " + name);
                System.out.println("Email: " + email);
                System.out.println("Batch: " + rs.getString("batch_no"));
                System.out.println("Course: " + rs.getString("course_type"));
                System.out.println("Stream: " + rs.getString("stream"));
                System.out.println("Passing Year: " + rs.getInt("year_of_passing"));
                System.out.println("Training Status: " + rs.getString("training_status"));
                System.out.println("------------------------------");
            }

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
