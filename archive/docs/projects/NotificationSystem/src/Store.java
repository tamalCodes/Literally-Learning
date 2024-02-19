import ObserverPattern.Observable.IphoneObservable;
import ObserverPattern.Observable.StockObservableInterface;
import ObserverPattern.Observer.EmailNotificationAlert;
import ObserverPattern.Observer.NotificationAlertInterface;

public class Store {
    public static void main(String[] args) throws Exception {

        StockObservableInterface iphone = new IphoneObservable();

        NotificationAlertInterface observer1 = new EmailNotificationAlert("tamalcodes1@gmail.com", iphone);
        NotificationAlertInterface observer2 = new EmailNotificationAlert("tamalcodes2@gmail.com", iphone);
        NotificationAlertInterface observer3 = new EmailNotificationAlert("tamalcodes3@gmail.com", iphone);

        iphone.add(observer1);
        iphone.add(observer2);
        iphone.add(observer3);

        iphone.setStockData(10);
        // iphone.setStockData(0);
        iphone.setStockData(100);
    }
}
