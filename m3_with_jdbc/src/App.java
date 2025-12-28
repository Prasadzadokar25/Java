
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class App {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/m3project";
        String user = "root";
        String password = "##Prasad25";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Database connected!");

            Statement statement = connection.createStatement();

            String query = "SELECT * FROM users";
            ResultSet resultSet = statement.executeQuery(query);

            String insertQuery = "insert into users (user_id,user_name,marks,city,age) values (?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

            preparedStatement.setInt(1, 13);
            preparedStatement.setString(2, "prasas zadokar");
            preparedStatement.setInt(3, 88);
            preparedStatement.setString(4, "mumbai");
            preparedStatement.setInt(5, 22);

            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Rows inserted: " + rowsAffected);

            while (resultSet.next()) {
                int id = resultSet.getInt("user_id");
                String name = resultSet.getString("user_name");
                System.out.println("user: " + id + ", Name: " + name);
            }

            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

        }
    }
}
