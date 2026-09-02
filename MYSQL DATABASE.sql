CREATE DATABASE hotel_booking;

USE hotel_booking;

CREATE TABLE rooms (
    room_id INT PRIMARY KEY,
    room_type VARCHAR(50) NOT NULL,
    room_rate DOUBLE NOT NULL
);

CREATE TABLE bookings (
    booking_id INT AUTO_INCREMENT PRIMARY KEY,
    room_id INT NOT NULL,
    guest_name VARCHAR(100) NOT NULL,
    check_in DATE NOT NULL,
    check_out DATE NOT NULL,
    room_rate DOUBLE NOT NULL,
    FOREIGN KEY (room_id) REFERENCES rooms(room_id)
);

INSERT INTO rooms VALUES
(101, 'Standard', 2000.00),
(102, 'Deluxe', 3000.00),
(103, 'Suite', 5000.00);