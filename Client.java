public class Client {
    String name;
    boolean vip;
    double limit;

    public Client (String name, boolean vip, double limit) {
        this.name = name;
        this.vip = vip;
        this.limit = limit;
    }
    
    @Override
    public String toString() {
        return "Client{" + "name=" + name + ", vip=" + vip + ", limit=" + limit + "}";
    }
}