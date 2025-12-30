import java.sql.*;

class Practice01 {
    public static void main(String[] arge) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db", "root", "##Prasad25");

            System.out.println("=========using statment==========");
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery("Select * from users");

            while (result.next()) {
                System.out.println(result.getString("name"));
            }

            System.out.println("=========using preparedstatement==========");

            PreparedStatement pstmt = con.prepareStatement("select * from users");
            ResultSet resultSet2 = pstmt.executeQuery();
            while (resultSet2.next()) {
                System.out.println(resultSet2.getString("name"));
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}
