package ECommerce;

public interface ObervableInterface {
    public void subscribe(Account c);

    public void unsubscribe(Account c);

    public void notifyObservers(String Event, String message);
}
