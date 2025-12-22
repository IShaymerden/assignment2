public class Main {
    public static void main(String[] args) {

        Flight flight1 = new Flight("KZ101", "Almaty", 180);
        Flight flight2 = new Flight("KZ101", "Almaty", 180);

        Passenger passenger1 = new Passenger("John Smith", "AA123456");
        Passenger passenger2 = new Passenger("Anna Brown", "BB654321");

        Reservation reservation1 = new Reservation(passenger1, flight1, "12A");
        Reservation reservation2 = new Reservation(passenger2, flight2, "14B");

        System.out.println(flight1);
        System.out.println(passenger1);
        System.out.println(reservation1);

        System.out.println();
        System.out.println("Compare flights:");
        System.out.println(flight1.getFlightNumber().equals(flight2.getFlightNumber()));

        System.out.println("Compare passengers:");
        System.out.println(passenger1.getPassportNumber().equals(passenger2.getPassportNumber()));
    }
}


