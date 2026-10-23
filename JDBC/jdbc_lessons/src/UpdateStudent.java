
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateStudent {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/pmis";
        String username = "";
        String password = "";

        String query =
                "UPDATE students SET training_status = ? WHERE uid = ?";

        try (
                Connection con = DriverManager.getConnection(
                        url, username, password);
                PreparedStatement pstmt = con.prepareStatement(query)
        ) {
            pstmt.setString(1, "Completed");
            pstmt.setString(2, "JDBC001");

            int rows = pstmt.executeUpdate();

            if (rows > 0) {
                System.out.println("Student record updated successfully!");
            } else {
                System.out.println("No student found with the given UID.");
            }

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
