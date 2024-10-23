package com.jv7.booking;


import java.util.ArrayList;
import java.util.List;
public class BookingSystem {
    private List<Room> rooms;
    private List<Guest> guests;
    private List<Booking> bookings;

    public BookingSystem() {
        rooms = new ArrayList<>();
        guests = new ArrayList<>();
        bookings = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    public void bookRoom(int RoomId, int GuestId, String ArrivalDate, String DepartureDate)
            throws RoomNotFoundException, GuestNotFoundException {
        Room room = findRoomById(RoomId);
        Guest guest = findGuestById(GuestId);
        Booking booking = new Booking(bookings.size() + 1, RoomId, GuestId, ArrivalDate, DepartureDate, "Booked");
        bookings.add(booking);
    }

    public Room findRoomById(int id) throws RoomNotFoundException {
        for (Room room : rooms) {
            if (room.getid() == id) {
                return room;
            }
        }
        throw new RoomNotFoundException("room" + " " + id + " " + "is not found");
    }

    public Guest findGuestById(int id) throws GuestNotFoundException {
        for (Guest guest : guests) {
            if (guest.getid() == id) {
                return guest;
            }
        }
        throw new GuestNotFoundException("Guest" + " " + id + " " + "is not found");
    }

    public void cancelBooking(int bookingId) throws BookingNotFoundException {
        Booking booking = findBookingById(bookingId);
        booking.setStatus("Booking is canceled");
    }

    public Booking findBookingById(int id) throws BookingNotFoundException {
        for (Booking booking : bookings) {
            if (booking.getid() == id) {
                return booking;
            }
        }
        throw new BookingNotFoundException("Booking" + " " + id + " " + "is not found");
    }
}

