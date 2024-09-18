package ECommerce;

import java.util.*;

class NotificationService implements ObervableInterface {
    private static NotificationService instance;
    private static List<Account> observers = new ArrayList<>();

    public static NotificationService getInstance() {
        if (instance == null) {
            instance = new NotificationService();
        }
        return instance;
    }

    @Override
    public void subscribe(Account c) {
        observers.add(c);
    }

    @Override
    public void unsubscribe(Account c) {
        observers.remove(c);
    }

    @Override
    public void notifyObservers(String Event, String message) {
        for (Account c : observers) {
            c.update(Event, message);
        }
    }

}
