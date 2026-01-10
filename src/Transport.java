public abstract class Transport {

    protected int id;

    public Transport(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public abstract void show();
}
