# Question

![ALT](https://i.ibb.co/52w5F7t/Screenshot-2.png)

So this kind of question was actually being asked in walmart so the question for this one was pretty simple it was about to implement the notify me button for amazon.

So the thing was whenever a product would go out of stock and multiple users would have clicked on the notify me button how would that button actually notify all those users we would need to implement that particular thing.

## What's Observer Design Pattern ?

![ALT](https://i.ibb.co/9qxZNqY/Screenshot-3.png)

So we have two different things inside of our observer design pattern. the very first thing is having an observable which is to whose task is basically to keep on observing, whenever it states change it will be cheering the observer that hey my state has changed and you are now free to execute any kind of function that you were looking for.

![ALT](https://i.ibb.co/Z1tz0LL/Screenshot-4.png)

So we do have a lot of interfaces especially for the observable and the observer. for the observer we gonna have a list and other functions like add remove notify and also set data. imagine the subscribe and unsubscribe model for the react it's almost the same technically but it has also a lot of differences to be honest.

The first thing that we see here registration that's about adding an observer interface object the remove is to remove the same after we have we are done with updating the user. same goes for the other functions like notify and also set data.

And also it's a one to many kind of relationship because one particular observable can be observed by a lot of other observers.

And in the concreete class for the Observavle we would have:

```java

addObserver(Observer observer) {
    observers.add(observer);
}

removeObserver(Observer observer) {
    observers.remove(observer);
}

notifyObservers() {
    for(Observer observer : observers) {
        observer.update();
    }
}


setData() {
    this.data = data;
    notifyObservers();
}

```

# Now that you understand ...

![ALT](https://i.ibb.co/Q7gmRyR/Screenshot-5.png)

The goal is simple we do have an weather station which will have a current temperature, this is actually our observable and we would have rendering the current temperature live at places such as tv display and mobile display and so on south technically these displays becomes our observer. whenever that live temperature will be changing I need to show them right there and obviously it changes after every 5 minutes I mean it refreshes after every 5 minutes so there is a chance of getting a new temperature every 5 minutes

## Solution ?

Let's make out observable

```java

public interface NotificationAlertObserver{
    public void update();
}

public class MobileNotificationAlert implements NotificationAlertObserver {
    public int stockCount;
    public MobileNotificationAlert(int stockCount) {
        this.stockCount = stockCount;
    }

    @Override
    public void update() {
        System.out.println("Mobile Notification Alert: " + stockCount);
    }
}

public class EmailNotificationAlert implements NotificationAlertObserver {
    String emailID;
    StockObservable observable;

    public EmailNotificationAlert(String emailID, StockObservable observable) {
        this.emailID = emailID;
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("Email Notification Alert: " + emailID + " " + observable.getStockCount());
    }

    
}

public interface StockObservable {
   public void add(NotificationAlertObserver observer);

   public void remove(NotificationAlertObserver observer);

   public void notifySubscribers();

   public void setStockData(int newStockAdded);

   public int getStockCount();
}

public class IPhoneObservable implements StockObservable{
    public List <NotificationAlertObserver> observerList = new ArrayList<>();
    public int stockCount;

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver observer : observerList) {
            observer.update();
        }
    }

    @Override
    public void setStockData(int newStockAdded) {
        this.stockCount = newStockAdded;
        notifySubscribers();
    }

    @Override
    public void setStockCount(int stockCount) {
        if(stockCount==0) {
            notifySubscribers();
        }
        stockCount+= newStockAdded;
    }

    public int getStockCount() {
        return stockCount;
    }
}


public class Store{
    public static void main(String[] args) {
        StocksObservable iphonestockObservable = new IPhoneObservable();

        NotificationAlertObserver observer1 = new EmailNotificationAlert(emailid:"tamalcodes@gmail.com", iphonestockObservable);
        NotificationAlertObserver observer1 = new EmailNotificationAlert(emailid:"tamalcodes2@gmail.com", iphonestockObservable);
        NotificationAlertObserver observer1 = new EmailNotificationAlert(emailid:"tamalcodes3@gmail.com", iphonestockObservable);

        iphonestockObservable.add(observer1);
        iphonestockObservable.add(observer2);
        iphonestockObservable.add(observer3);

        iphonestockObservable.setStockData(10);
    }
}



```
