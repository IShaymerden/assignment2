public class Reservation {
    private Passenger passenger;
    private Flight flight;
    private String seatNumber;

    public Reservation(Passenger passenger, Flight flight, String seatNumber) {
        this.passenger = passenger;
        this.flight = flight;
        this.seatNumber = seatNumber;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "passenger=" + passenger +
                ", flight=" + flight +
                ", seatNumber='" + seatNumber + '\'' +
                '}';
    }
}

