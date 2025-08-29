package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {
		// Database credentials
        String url = "jdbc:postgresql://localhost:5432/studentdb"; // DB name
        String user = "postgres"; // your PostgreSQL username
        String password = "asp22"; // your PostgreSQL password

        try {
            // Load PostgreSQL JDBC Driver
            Class.forName("org.postgresql.Driver");

            // Connect to Database
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to Database successfully!");

            // Create Statement
            Statement stmt = con.createStatement();

            // Execute Query
            String query = "SELECT * FROM students";
            ResultSet rs = stmt.executeQuery(query);

            // Print Results
            System.out.println("ID | Name     | Age | Grade");
            System.out.println("----------------------------");
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("name") + " | " +
                    rs.getInt("age") + " | " +
                    rs.getString("grade")
                );
            }

            // Close Connection
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
