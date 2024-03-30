package staticProject;
import java.util.*;
class BookingSystem {
    private boolean[] seats;

    public BookingSystem(int numberOfSeats) {
        seats = new boolean[numberOfSeats]; // Initialize seat array
    }

    public synchronized boolean bookSeat(int seatNumber) {
        if (seatNumber < 0 || seatNumber >= seats.length) {
            System.out.println("Invalid seat number.");
            return false;
        }

        if (seats[seatNumber]) {
            System.out.println("Seat " + seatNumber + " is already booked.");
            return false;
        } else {
            seats[seatNumber] = true; // Book the seat
            System.out.println("Seat " + seatNumber + " booked successfully.");
            return true;
        }
    }
}

class User extends Thread {
    private BookingSystem bookingSystem;
    private int seatNumber;

    public User(BookingSystem bookingSystem, int seatNumber) {
        this.bookingSystem = bookingSystem;
        this.seatNumber = seatNumber;
    }

    public void run() {
        bookingSystem.bookSeat(seatNumber); // Attempt to book the seat
    }
}

public class MovieBookingExample {
    public static void main(String[] args) {
        BookingSystem bookingSystem = new BookingSystem(10); // 10 seats available

        // Two users trying to book seat number 5 concurrently
        User user1 = new User(bookingSystem, 5);
        User user2 = new User(bookingSystem, 4);

        user1.start();
        user2.start();
    }
}
