package ObserverPattern.Observable;

import java.util.ArrayList;
import java.util.List;

import ObserverPattern.Observer.NotificationAlertInterface;

public class IphoneObservable implements StockObservableInterface {
    public List<NotificationAlertInterface> observerList = new ArrayList<>();
    public int stockCount;

    @Override
    public void add(NotificationAlertInterface observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertInterface observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlertInterface observer : observerList) {
            observer.update();
        }
        System.out.println("");
    }

    @Override
    public void setStockData(int newstockcount) {
        if (stockCount == 0) {
            notifySubscribers();
        }

        stockCount = newstockcount;
    }

    public int getStockCount() {
        return stockCount;
    }
}
