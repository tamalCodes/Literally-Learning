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

# Now that you understand ...

![ALT](https://i.ibb.co/Q7gmRyR/Screenshot-5.png)

The goal is simple we do have an weather station which will have a current temperature, this is actually our observable and we would have rendering the current temperature live at places such as tv display and mobile display and so on south technically these displays becomes our observer. whenever that live temperature will be changing I need to show them right there and obviously it changes after every 5 minutes I mean it refreshes after every 5 minutes so there is a chance of getting a new temperature every 5 minutes

## Solution ?

So let's take a look at the project where we have two things one will be the observable and another one will be the observer. 

- Inside of the observable we might have an interface known as talk observable where we will be having functions for adding an observer removing an observer notifying subscribers setting these stock count and so on
- inside of the iphone observable we will be implementing this stock observable interface.  we have a list the list will be for an observer list where we will be basically adding the name of the customers uh or the observers to which we need to observe.
- Basically for this purpose inside of the iphone observable we can add different kinds of observer to the list and also work with them and add some business logics to make them work.
- Then we have a notification alert interface which basically has a function known as update the purpose of that function is to obviously update the stuff whenever we will be manually calling them
- The e-mail interface for the notification takes in the string and also it takes in the observable that we were basically you know that has a lot of observers inside of them and then it actually has the update function how do we get the observable so how do we get the e-mail id everything is called from the observable.
- Inside of the iphone observable we have notifies subscribers and also these top data inside of that notify subscribers we basically loop through all the observers that are inside the observer list,  and we basically notify them that hey the stock is now out you can do whatever you want.
