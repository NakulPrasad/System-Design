package ECommerce;

import java.util.UUID;

public class Product {
    private UUID id = UUID.randomUUID();
    private String title;
    private String description;
    private int quantity = 6;

    Product(String title, String description) {
        this.title = title;
        this.description = description;
    }

    Product(String title, String description, int quantity) {
        this.title = title;
        this.description = description;
        this.quantity = quantity;
    }

    public UUID getProductID() {
        return this.id;
    }

    public void setTitle() {

    }

    public void setDescription() {

    }

    public void setQuantity() {

    }

    public void update(String title, String description) {
        this.title = title;
        this.description = description;

    }

    public int getQuantity() {
        return this.quantity;
    }

    @Override
    public String toString() {
        return "Product{name='" + title + "', description='" + description + "'}";
    }

}
