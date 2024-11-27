package Jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JavaJdbc {
    public static void main(String[] args) {
        
        String jdbcURL = "jdbc:mysql://localhost:3306/testdb"; 
        String dbUser = "root";
        String dbPassword = "1234";

        try {
            // Connect to MySQL database
            Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
            System.out.println("Connected to the database!");
            
            // Close the connection
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error connecting to the database.");
            e.printStackTrace();
        }
    }
}
