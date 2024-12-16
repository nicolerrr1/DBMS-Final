package Final_Project;

import java.time.LocalDate;
import java.util.Scanner;

public class EventOrganizerApp {
    public static void main(String[] args) {
        EventDAO eventDAO = new EventDAO();
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            
            System.out.println("WELCOME TO EventHub!");
            System.out.println("1. Add Event");
            System.out.println("2. View Events");
            System.out.println("3. Delete Event");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  
            switch (choice) {
                case 1:
                    
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter event name: ");
                    String eventName = scanner.nextLine();
                    System.out.print("Enter description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter event date (YYYY-MM-DD): ");
                    LocalDate date = LocalDate.parse(scanner.nextLine());

                    eventDAO.createEvent(name, eventName, description, date);
                    break;

                case 2:
                   
                    eventDAO.readEvents();
                    break;

                case 3:
                    
                    System.out.print("Enter event ID to delete: ");
                    int deleteId = scanner.nextInt();
                    eventDAO.deleteEvent(deleteId);
                    break;

                case 4:
                   
                    System.out.println("Exiting the application...");
                    scanner.close();
                    System.exit(0); 
                default:
                    System.out.println("Invalid choice.");
            }

            
            System.out.println("\nWould you like to return to the main menu? (y/n): ");
            String continueChoice = scanner.nextLine().toLowerCase();
            if (!continueChoice.equals("y")) {
                System.out.println("Goodbye!");
                break;  
            }
        }
    }
}
