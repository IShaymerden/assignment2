import entities.*; // Импортируем классы из твоего пакета entities
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Flight> flightPool = new ArrayList<>();
        flightPool.add(new Flight("KC101", "Almaty", 180));
        flightPool.add(new Flight("KC102", "Astana", 220));
        flightPool.add(new Flight("KC103", "Astana", 150));

        System.out.println("--- Searching: Astana ---");
        for (Flight f : flightPool) {
            if (f.getDestination().equalsIgnoreCase("Astana")) {
                System.out.println(f);
            }
        }

        System.out.println("\n--- Sorting: By Capacity ---");
        Collections.sort(flightPool);
        flightPool.forEach(System.out::println);

        System.out.println("\n--- Comparison Test ---");
        Passenger p1 = new Passenger("Ali Nur", "KZ123");
        Passenger p2 = new Passenger("Ali Nur", "KZ123");
        System.out.println(p1);
        System.out.println("Are p1 and p2 equal? " + p1.equals(p2));
    }
}