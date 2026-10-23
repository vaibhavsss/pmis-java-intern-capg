
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertStudent {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/pmis";
        String username = "";
        String password = "";

        String query = "INSERT INTO students " +
                "(sl_no, batch_no, uid, email_address, full_name, gender) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        try (
                Connection con = DriverManager.getConnection(
                        url, username, password);
                PreparedStatement pstmt = con.prepareStatement(query)
        ) {
            pstmt.setInt(1, 9999);
            pstmt.setString(2, "JDBC_DEMO");
            pstmt.setString(3, "JDBC001");
            pstmt.setString(4, "jdbc001@example.com");
            pstmt.setString(5, "Test Student");
            pstmt.setString(6, "Male");

            int rows = pstmt.executeUpdate();

            System.out.println(rows + " student record inserted.");

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
