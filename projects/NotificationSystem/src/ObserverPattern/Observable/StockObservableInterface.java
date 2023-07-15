package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertInterface;

public interface StockObservableInterface {
    public void add(NotificationAlertInterface observer);

    public void remove(NotificationAlertInterface observer);

    public void notifySubscribers();

    public void setStockData(int newStockAdded);

    public int getStockCount();
}