public class Bus {

    private int id;
    private String route;

    public Bus(int id, String route) {
        this.id = id;
        this.route = route;
    }

    // GETTERS
    public int getId() {
        return id;
    }

    public String getRoute() {
        return route;
    }

    // SETTERS
    public void setId(int id) {
        this.id = id;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public void show() {
        System.out.println("Bus ID: " + id + ", Route: " + route);
    }
}

