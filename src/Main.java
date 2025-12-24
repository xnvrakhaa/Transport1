public class Main {

    public static void main(String[] args) {

        Bus bus1 = new Bus(1, "City Center");
        Bus bus2 = new Bus(2, "University");

        // Using setters
        bus2.setRoute("City Center");

        Commuter commuter = new Commuter("Alikhan", "Monthly");
        commuter.setTicket("Student");

        TransportService service =
                new TransportService("Morning", bus1, commuter);

        service.showService();

        // Using getters for comparison
        if (bus1.getRoute().equals(bus2.getRoute())) {
            System.out.println("Buses have the same route");
        } else {
            System.out.println("Buses have different routes");
        }
    }
}
