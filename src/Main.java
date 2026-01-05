import entities.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Создаем объекты (как на твоем скрине)
        Flight flightAlmaty = new Flight("KC101", "Almaty", 180);
        Flight flightAstana = new Flight("KC102", "Astana", 220);

        Passenger passenger1 = new Passenger("Ali Nur", "KZ123456");
        Passenger passenger2 = new Passenger("Dana Kim", "KZ654321");

        Reservation reservation1 = new Reservation(flightAlmaty, passenger1, "12A");
        Reservation reservation2 = new Reservation(flightAstana, passenger2, "18C");

        // Вывод информации (теперь через переопределенный toString)
        System.out.println(reservation1);
        System.out.println();
        System.out.println(reservation2);

        System.out.println("\n--- Comparisons ---");

        // 1. Сравнение вместимости (как у тебя)
        if (flightAlmaty.getCapacity() > flightAstana.getCapacity()) {
            System.out.println("Flight with larger capacity: " + flightAlmaty.getDestination());
        } else {
            System.out.println("Flight with larger capacity: " + flightAstana.getDestination());
        }

        // 2. Сравнение длины имен (как у тебя)
        if (passenger1.getName().length() > passenger2.getName().length()) {
            System.out.println("Passenger with longer name: " + passenger1.getName());
        } else {
            System.out.println("Passenger with longer name: " + passenger2.getName());
        }

        // 3. Сравнение номеров мест (как у тебя)
        if (reservation1.getSeatNumber().compareTo(reservation2.getSeatNumber()) > 0) {
            System.out.println("Reservation with higher seat number: " + reservation1.getSeatNumber());
        } else {
            System.out.println("Reservation with higher seat number: " + reservation2.getSeatNumber());
        }

        // 4. НОВОЕ требование: сравнение через equals (обязательно для 2-го асаймента)
        System.out.println("\n--- Logic from Assignment 2 ---");
        System.out.println("Are passenger1 and passenger2 the same? " + passenger1.equals(passenger2));
    }
}