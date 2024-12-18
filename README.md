# 🎉 Event Organizer App

## 🌟 Description

Say goodbye to event management headaches! The **Event Organizer App** is your one-stop solution for seamlessly managing events. Built with Java and powered by a robust MySQL database, this app is perfect for organizing events, storing essential details, and keeping your schedule on track. It showcases key programming concepts like JDBC connectivity, CRUD operations, and a user-friendly command-line interface.

## 🚀 Features

- 📝 **Add Event**: Quickly log your name, event title, description, and date.
- 🔍 **View Events**: Get a clear snapshot of all your events.
- ❌ **Delete Event**: Clean up your event list by removing unwanted entries.
- 💾 **Database Integration**: Your data is stored securely using a MySQL database for persistent storage.

## 🛠️ How to Run

### Prerequisites

- **☕ Java Development Kit (JDK)**: Ensure Java 8 or later is installed.
- **🐬 MySQL Server**: Install and run MySQL Server.
- **🔗 MySQL Connector/J**: Download and link it to your Java project libraries.
- **🖥 IDE or Command Line**: Choose your favorite IDE (VS Code, IntelliJ, Eclipse) or simply use the command line.

### Database Setup

1. Launch MySQL Command Line Client or Workbench.
2. Initialize the database with these SQL commands or by running the `db/init.sql` script:

   ```sql
   CREATE DATABASE eventorganizer;
   USE eventorganizer;

   CREATE TABLE events (
       id INT AUTO_INCREMENT PRIMARY KEY,
       name VARCHAR(255),
       event_name VARCHAR(255),
       description TEXT,
       event_date DATE
   );

   INSERT INTO events (name, event_name, description, event_date) VALUES
   ('Alice', 'Team Meeting', 'Monthly team discussion', '2024-12-01'),
   ('Bob', 'Workshop', 'Technical workshop on Java', '2024-12-10'),
   ('Charlie', 'Community Cleanup', 'Promoting environmental responsibility', '2025-01-01'),
   ('Dylan', 'Nicole and Cole Wedding', 'Union of two souls', '2025-05-08'),
   ('Ella', 'Holy Rosary Prayer', 'Prayers and intentions', '2025-12-08');
   ```

### Running the Application

1. Clone the repository:
   ```bash
   git clone https://github.com/nicolerrr1/DBMS-Final.git
   ```
2. Navigate to the project directory:
   ```bash
   cd DBMS-Final
   ```
3. Compile and run the main file:
   ```bash
   javac src/Final_Project/EventOrganizerApp.java
   java src/Final_Project/EventOrganizerApp
   ```
4. Follow the on-screen prompts to organize your events.

## 📂 Project Structure

```
EventOrganizerApp
|
├── .vscode
│   ├── settings.json
├── Final_Project
│   ├── Final_Project
│   │   ├── DatabaseConnection.java
│   │   ├── EventDAO.java
│   │   └── EventOrganizerApp.java
├── db
│   ├── init.sql
├── lib
│   ├── mysql-connector-j-<version>.jar
├── README.md
```

### Key Files

- **DatabaseConnection.java**: Seamlessly connects the app to the MySQL database.
- **EventDAO.java**: Handles Create, Read, Update, and Delete operations.
- **EventOrganizerApp.java**: The command-line interface for user interaction.
- **init.sql**: SQL commands to set up the database and populate sample data.

## 🎬 Example Usage

### Adding an Event

```plaintext
Enter your name: Nicole
Enter event name: Christmas Party
Enter description: Year-end celebration
Enter event date (YYYY-MM-DD): 2024-12-25
Event added successfully!
```

### Viewing Events

```plaintext
| Event ID | Name         | Event Title            | Description                          | Date       |
|----------|--------------|------------------------|--------------------------------------|------------|
| 9        | Alice        | Team Meeting          | Monthly team discussion             | 2024-12-01 |
| 11       | Charlie      | Community Cleanup     | Promoting environmental responsibility | 2025-01-01 |
| 12       | Dylan        | Nicole and Cole Wedding | Union of two souls                  | 2025-05-08 |
| 13       | Ella         | Holy Rosary Prayer    | Prayers and intentions               | 2025-12-08 |
| 14       | John Doe     | Graduation Party      | A party                              | 2025-06-15 |
| 15       | John         | Graduation Party      | A party                              | 2025-06-15 |
| 16       | Nicole       | Meeting               | Ao office meeting                    | 2024-12-30 |
```

### Deleting an Event

```plaintext
Enter event ID to delete: 9
Event deleted successfully!
```

## 👩‍💻 Author

Nicole A. Rafols | CS 2102 - Making event management effortless.
