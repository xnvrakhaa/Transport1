import java.util.Objects;

public class Bus extends Transport {

    private String route;

    public Bus(int id, String route) {
        super(id);
        this.route = route;
    }

    // GETTER
    public String getRoute() {
        return route;
    }

    // SETTER
    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public void show() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Bus{id=" + id + ", route='" + route + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bus)) return false;
        Bus bus = (Bus) o;
        return id == bus.id && route.equals(bus.route);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, route);
    }
}
