package ECommerce;

import java.util.*;

public class ProductService {
    private static List<Product> products = new ArrayList<>();
    private static ProductService instance;

    public static ProductService getInstance() {
        if (instance == null) {
            instance = new ProductService();
        }
        return instance;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public void deleteProduct(Product product) {
        products.remove(product);

    }

}
