package pdevelopment.dao;

import java.lang.Thread.State;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import pdevelopment.model.User;
import pdevelopment.utils.DBConnection;

public class UserDao {

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        String query = "Select * from users";
        try {
            Connection conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(query);

            while (result.next()) {
                users.add(new User(result.getString("name"), result.getString("email")));
            }

        } catch (SQLException e) {
            System.out.println("Error in fetching the users");
        }
        return users;
    }

}
