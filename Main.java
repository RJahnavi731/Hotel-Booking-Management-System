package com.jv7.booking;

public class Main {
    public static void main(String[] args) {
        BookingSystem bookingSystem = new BookingSystem();

        bookingSystem.addRoom(new Room(1, 2000, "Deluxe"));
        bookingSystem.addRoom(new Room(2, 3000, "suite"));
        bookingSystem.addRoom(new Room(3, 4000, "king Room"));

        Guest guest = new Guest(1, "Mark", 91879767890l);
       
        bookingSystem.addGuest(guest);
        

        bookingSystem.addGuest(new Guest(2, "Rex", 98576498678l));
        bookingSystem.addGuest(new Guest(3, "Kris", 96354783567l));

        try {
            bookingSystem.bookRoom(2, 2, "2024-10-15", "2024-10-20");
            System.out.println("Room booked successfully!");
        } catch (RoomNotFoundException | GuestNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            bookingSystem.bookRoom(3, 6, "2024-10-15", "2024-10-20");
            System.out.println("Room booked successfully!");
        } catch (RoomNotFoundException | GuestNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            bookingSystem.cancelBooking(7);
            System.out.println("Booking canceled successfully!");
        } catch (BookingNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
