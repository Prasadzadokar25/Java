package pdevelopment.utils;

import java.sql.Connection;

public class DBConnection {
    static Connection connection;

    private static void createConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/dbapp", "root",
                    "##Prasad25");
        } catch (Exception e) {
            System.out.println("Error in DB Connection: " + e.getMessage());
        }
    }

    public static Connection getConnection() {
        if (connection == null) {
            createConnection();
        }
        return connection;
    }
}
