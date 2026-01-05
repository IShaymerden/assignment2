package entities;

import java.util.Objects;

public class Passenger extends Person {
    private String passportNumber;

    public Passenger(String name, String passportNumber) {
        super(name);
        this.passportNumber = passportNumber;
    }

    public String getPassportNumber() { return passportNumber; }
    public void setPassportNumber(String passportNumber) { this.passportNumber = passportNumber; }

    @Override
    public String toString() {
        return "Passenger: " + getName() + ", Passport: " + passportNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Passenger)) return false;
        Passenger p = (Passenger) o;
        return Objects.equals(passportNumber, p.passportNumber);
    }



    @Override
    public int hashCode() {
        return Objects.hash(passportNumber);
    }
}
