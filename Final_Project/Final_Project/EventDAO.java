package Final_Project;

import java.sql.*;
import java.time.LocalDate;

public class EventDAO {

    // Method to add a new event
    public void createEvent(String name, String eventName, String description, LocalDate eventDate) {
        String query = "INSERT INTO events (name, event_name, event_description, event_date) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.connect();
             PreparedStatement stmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, name);
            stmt.setString(2, eventName);
            stmt.setString(3, description);
            stmt.setDate(4, Date.valueOf(eventDate));

            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                try (ResultSet rs = stmt.getGeneratedKeys()) {
                    if (rs.next()) {
                        int generatedId = rs.getInt(1);
                        System.out.println("Event added successfully! Event ID: " + generatedId);
                    }
                }
            }
        } catch (SQLException e) {
            System.err.println("Error adding event: " + e.getMessage());
        }
    }

    // Method to read all events
    public void readEvents() {
        String query = "SELECT * FROM events";
        try (Connection conn = DatabaseConnection.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                                   ", Name: " + rs.getString("name") +
                                   ", Event Name: " + rs.getString("event_name") +
                                   ", Description: " + rs.getString("event_description") +
                                   ", Date: " + rs.getDate("event_date"));
            }
        } catch (SQLException e) {
            System.err.println("Error reading events: " + e.getMessage());
        }
    }

    // Method to delete an event by ID
    public void deleteEvent(int eventId) {
        String query = "DELETE FROM events WHERE id = ?";
        try (Connection conn = DatabaseConnection.connect();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, eventId);

            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Event with ID " + eventId + " deleted successfully.");
            } else {
                System.out.println("Event with ID " + eventId + " not found.");
            }
        } catch (SQLException e) {
            System.err.println("Error deleting event: " + e.getMessage());
        }
    }
}
