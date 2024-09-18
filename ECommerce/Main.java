package ECommerce;

public class Main {
    static CustomerService customerService = CustomerService.getInstance();
    static ProductService productService = ProductService.getInstance();

    public static void main(String[] args) {
        Customer customer = new Customer("nakul", "hirapur");
        customerService.addCustomer(customer);
        Product product = new Product("Apple", "Watch");
        productService.addProduct(product);
        System.out.println(getStatus());
        productService.deleteProduct(product);
        System.out.println(getStatus());

        // notification
        NotificationService notificationService = NotificationService.getInstance();
        notificationService.subscribe(customer);
        notificationService.notifyObservers("BookReturn", "Godzilla returns");
        Product product1 = new Product("Apple Pro", "Watch");
        productService.productBack(product1);
    }

    public static String getStatus() {
        return new String(
                customerService.getCustomers() + "\n" + productService.getProducts());
    }

}
