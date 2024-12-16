package Final_Project;

import java.time.LocalDate;

public class EventManager {

    private EventDAO eventDAO = new EventDAO();

    public void addEvent(String name, String eventName, String description, LocalDate eventDate) {
        eventDAO.createEvent(name, eventName, description, eventDate);
    }

    public void viewEvents() {
        eventDAO.readEvents();
    }

    public void deleteEvent(int eventId) {
        eventDAO.deleteEvent(eventId);
    }
}
