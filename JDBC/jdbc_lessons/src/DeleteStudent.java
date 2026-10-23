
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteStudent {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/pmis";
        String username = "";
        String password = "";

        String query = "DELETE FROM students WHERE uid = ?";

        try (
                Connection con = DriverManager.getConnection(
                        url, username, password);
                PreparedStatement pstmt = con.prepareStatement(query)
        ) {
            pstmt.setString(1, "JDBC001");

            int rows = pstmt.executeUpdate();

            if (rows > 0) {
                System.out.println("Student record deleted successfully!");
            } else {
                System.out.println("No student found with the given UID.");
            }

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
