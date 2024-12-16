CREATE DATABASE IF NOT EXISTS EventOrganizer;

USE EventOrganizer;

CREATE TABLE IF NOT EXISTS events (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    event_name VARCHAR(255) NOT NULL,
    description TEXT,
    event_date DATE
);
