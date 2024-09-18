package ECommerce;

/**
 * Customer
 */
public class Customer extends Account {

    Customer(String name, String address) {
        super(name, address);
    }

    @Override
    public String toString() {
        return "Customer{name='" + super.getName() + "', address='" + super.getAddress() + "'}";
    }

    @Override
    public void addToCart() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addToCart'");
    }
}