package ECommerce;

public abstract class Account implements ObserverInterface {
    private int id;
    private String name;
    private String address;

    Account() {

    }

    Account(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public abstract void addToCart();

    @Override
    public void update(String event, String message) {
        System.out.println(this.getName() + " good news " + message);
    }

}
