package entities;

import java.util.Objects;

public class Flight implements Comparable<Flight> {
    private String flightNumber;
    private String destination;
    private int capacity;

    public Flight(String flightNumber, String destination, int capacity) {
        this.flightNumber = flightNumber;
        this.destination = destination;

        setCapacity(capacity);
    }

    public String getFlightNumber() { return flightNumber; }
    public String getDestination() { return destination; }
    public int getCapacity() { return capacity; }

    public void setCapacity(int capacity) {
        if (capacity > 0) { // Checking for negative capacity
            this.capacity = capacity;
        } else {

            System.out.println("Warning: Capacity for flight " + flightNumber + " must be positive. Setting to 1.");
            this.capacity = 1;
        }
    }
    //Regular Setter
    public void setDestination(String destination) {
        this.destination = destination;
    }
    //Overloading!!!
    public void setDestination(String destination, String countryCode) {
        this.destination = destination + " (" + countryCode + ")";
    }

    @Override
    public int compareTo(Flight other) {
        return Integer.compare(this.capacity, other.capacity);
    }

    @Override
    public String toString() {
        return "Flight: " + flightNumber + " to " + destination + ", Capacity: " + capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return Objects.equals(flightNumber, flight.flightNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightNumber);
    } //For normal collection operating
}
