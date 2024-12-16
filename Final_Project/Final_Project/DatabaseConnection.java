package Final_Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public static Connection connect() {
        try {
            String url = "jdbc:mysql://localhost:3306/EventOrganizer";  
            String username = "root";  
            String password = "nicole"; 

            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection to MySQL established successfully!");
            return connection;
        } catch (SQLException e) {
            System.err.println("Error connecting to MySQL: " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        connect();
    }
}
