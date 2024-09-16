package ECommerce;

/**
 * Customer
 */
public class Customer {
    private int id;
    private String name;
    private String address;

    Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String address() {
        return this.address;
    }

    public void update(String event, String message) {
        System.out.println(this.name + " good news " +message);
    }

    @Override
    public String toString() {
        return "Customer{name='" + name + "', address='" + address + "'}";
    }
}