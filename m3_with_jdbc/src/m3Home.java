
import java.sql.SQLException;
import java.sql.Connection;

import java.sql.*;

class P1 {

    public static void main(String[] arfs) {

        String url = "jdbc:mysql://localhost:3306/m3project";
        String name = "root";
        String password = "##Prasad25";

        try {
            Connection connection = DriverManager.getConnection(url, name, password);

            String query = "select * from users";
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("user_id"));
            }

        } catch (SQLException e) {

        }
    }
}