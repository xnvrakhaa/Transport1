public class TransportService {

    private String serviceName;
    private Bus bus;
    private Commuter commuter;

    public TransportService(String serviceName, Bus bus, Commuter commuter) {
        this.serviceName = serviceName;
        this.bus = bus;
        this.commuter = commuter;
    }

    // GETTERS
    public String getServiceName() {
        return serviceName;
    }

    public Bus getBus() {
        return bus;
    }

    public Commuter getCommuter() {
        return commuter;
    }

    // SETTERS
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public void setCommuter(Commuter commuter) {
        this.commuter = commuter;
    }

    public void showService() {
        System.out.println("Service: " + serviceName);
        bus.show();
        commuter.show();
    }
}

