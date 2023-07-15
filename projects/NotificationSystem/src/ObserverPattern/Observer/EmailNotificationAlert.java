package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObservableInterface;

public class EmailNotificationAlert implements NotificationAlertInterface {
    String emailID;
    StockObservableInterface observable;

    public EmailNotificationAlert(String emailID, StockObservableInterface observable) {
        this.emailID = emailID;
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("Mail sent to: " + emailID);

    }

}
