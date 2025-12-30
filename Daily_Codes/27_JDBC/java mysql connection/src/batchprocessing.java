import java.sql.*;

class BatchProcessing {

    public static void main(String[] args) {

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db", "root",
                "##Prasad25")) {

            Statement stmt = con.createStatement();

            while (true) {
                String name = System.console().readLine("Enter name: ");
                String email = System.console().readLine("Enter email: ");
                String query = String.format("Insert into users(name,email) values('%s','%s')", name, email);
                stmt.addBatch(query);

                String more = System.console().readLine("Do you want to add more records (y/n): ");
                if (more.equalsIgnoreCase("n")) {
                    break;

                }
            }
            int[] results = stmt.executeBatch();
            for (int i = 0; i < results.length; i++) {
                System.out.println(results[i]);
            }
            con.close();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
