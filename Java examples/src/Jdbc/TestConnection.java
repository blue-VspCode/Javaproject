package Jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb"; // Replace with your database name
        String username = "root"; // Replace with your MySQL username
        String password = "1234"; // Replace with your MySQL password

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected successfully!");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users"); // Replace with your table name

            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id")); // Replace column names as needed
                System.out.println("Name: " + resultSet.getString("name"));
            }

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
