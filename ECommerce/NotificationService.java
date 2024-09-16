package ECommerce;

import java.util.*;

class NotificationService {
    private static List<Customer> observers = new ArrayList<>();

    public void subscribe(Customer c) {
        observers.add(c);
    }

    public void unsubscribe(Customer c) {
        observers.remove(c);
    }

    public void notify(String Event, String message) {
        for (Customer c : observers) {
            c.update(Event, message);
        }
    }
}
