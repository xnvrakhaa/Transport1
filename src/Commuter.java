public class Commuter {

    private String name;
    private String ticket;

    public Commuter(String name, String ticket) {
        this.name = name;
        this.ticket = ticket;
    }

    // GETTERS
    public String getName() {
        return name;
    }

    public String getTicket() {
        return ticket;
    }

    // SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public void show() {
        System.out.println("Name: " + name + ", Ticket: " + ticket);
    }
}