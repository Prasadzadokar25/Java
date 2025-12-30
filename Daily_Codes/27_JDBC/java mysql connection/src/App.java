import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;

public class App {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/<dbName>";
    private static final String USER = "<userName>";
    private static final String PASS = "<password>";

    public static void main(String[] args) throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        }
        try {
            Connection dbConnection = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected to the database successfully.");

            Statement statement = dbConnection.createStatement();
            String query = "Select * from users";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                System.out.println(resultSet.getString("name") + " " + resultSet.getString("email"));
            }

            String query2 = String.format("Update users set name = '%s' where id = %d", "prasadzadokar", 2);
            int rowsAffected = statement.executeUpdate(query2);
            System.out.println("Rows affected: " + rowsAffected);

        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());

        }
    }
}
