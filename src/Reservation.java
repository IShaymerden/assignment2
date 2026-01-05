package entities;

public class Reservation {
    private Flight flight;
    private Passenger passenger;
    private String seatNumber;

    public Reservation(Flight flight, Passenger passenger, String seatNumber) {
        this.flight = flight;
        this.passenger = passenger;
        this.seatNumber = seatNumber;
    }

    @Override
    public String toString() {
        return "Reservation Details:\n" + passenger + "\n" + flight + "\nSeat: " + seatNumber;
    }
}


