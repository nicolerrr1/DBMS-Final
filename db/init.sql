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
