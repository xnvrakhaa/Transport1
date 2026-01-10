import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Creating objects
        Bus bus1 = new Bus(1, "City Center");
        Bus bus2 = new Bus(2, "University");
        Bus bus3 = new Bus(3, "City Center");

        Commuter commuter = new Commuter("Ali", "Monthly");
        commuter.setTicket("Student");

        TransportService service =
                new TransportService("Morning", bus1, commuter);

        service.showService();

        // Polymorphism
        Transport transport = bus1;
        transport.show();

        // Data pool
        List<Bus> buses = new ArrayList<>();
        buses.add(bus1);
        buses.add(bus2);
        buses.add(bus3);

        // Filtering
        System.out.println("\nFiltered (City Center):");
        buses.stream()
                .filter(b -> b.getRoute().equals("City Center"))
                .forEach(System.out::println);

        // Searching
        Bus found = buses.stream()
                .filter(b -> b.getId() == 2)
                .findFirst()
                .orElse(null);

        System.out.println("\nFound bus: " + found);

        // Sorting
        System.out.println("\nSorted by ID:");
        buses.sort(Comparator.comparingInt(Bus::getId));
        buses.forEach(System.out::println);

        // equals demonstration
        System.out.println("\nEquals check:");
        System.out.println(bus1.equals(bus3));
    }
}

