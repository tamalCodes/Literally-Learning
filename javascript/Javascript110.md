
<!-- TOC -->

- [Understand the call stack](#understand-the-call-stack)
  - [So how are code executed ?](#so-how-are-code-executed-)
- [The super powers](#the-super-powers)
  - [So how do we access these super powers ?](#so-how-do-we-access-these-super-powers-)
- [Callback queue and event loop](#callback-queue-and-event-loop)
  - [Behind the scenes of `setTimeout()`](#behind-the-scenes-of-settimeout)
  - [`setTimeout()` breaks trust](#settimeout-breaks-trust)
  - [`setTimeout(0)` is not 0](#settimeout0-is-not-0)
  - [Behind the scenes of DOM api](#behind-the-scenes-of-dom-api)
  - [Behind the scenes of `fetch()`](#behind-the-scenes-of-fetch)
- [Why do we even need callback queue ?](#why-do-we-even-need-callback-queue-)
- [Starvation of callback queue](#starvation-of-callback-queue)

<!-- /TOC -->

# Understand the call stack 

So javascript is a synchronous single threaded language so it has a call stack and it can do one thing at a time. And call stack doesn't have a timer so whatever you are gonna be putting inside of there will be immediately executed.


## So how are code executed ?

So this call stack is actually present inside the javascript engine,  and whenever any javascript code is to be run a global execution context is created and that is pushed inside of the call stack first. 

 - Then suppose we have a function so anything for that function will be pushed into the call stack and that function will be executed and popped out from the call stack

 - And once that is done then we pop out the global execution context from the call stack.


# The super powers

We want to do a lot of things with javascript we need a timer we need something to access location something to access the different kind of storage servers across the world and so on.  but with our call stack all of those functionalities are limited and so we take the help of our browsers superpower.  

So in such cases we take the help of web api's to do our task.

- setTimeout()
- localStorage
- DOM Apis
- fetch()
- console.log()
- location

All of these are a part of the browsers web apis even the, document. Stuff we write.
So if we write window.setTimeout(), or anything - we access those super powers basically. 

We don’t need to write window as it’s in global scope/object

## So how do we access these super powers ?

So we access these super powers by writing `window.setTimeout()` or `window.localStorage` or `window.document` and so on. But since we are in the global scope we don't need to write window as it is in the global scope. So we can just write `setTimeout()` or `localStorage` or `document` and so on.

As soon as we would write `console.log()` we are actually using the `console.log()` method of the `window` object. 

# Callback queue and event loop

The task of the event loop is to check if the call stack is empty and if it is empty then it will check if there is anything in the callback queue and if there is anything in the callback queue then it will push it into the call stack.

The task of the callback queue is to store all the callback functions that are ready to be executed.

## Behind the scenes of `setTimeout()`

Take a look at the code:

```javascript

console.log('1');
setTimeout(() => {
    console.log('2');
}, 5000);
console.log('3');

```

- So when we run this code, the first thing that happens is that the global execution context is created and pushed into the call stack.

- Then the first `console.log('1')` is executed and popped out from the call stack.

- Then the `setTimeout()` is executed and popped out from the call stack.

- Now the `setTimeout()` is a web api and it has a timer of 5 seconds so it will be pushed into the **callback queue after 5 seconds**.

- Then the `console.log('3')` is executed and popped out from the call stack.

- Now the call stack is empty and the event loop will check if the call stack is empty and if it is empty then it will check if there is anything in the callback queue and if there is anything in the callback queue then it will push it into the call stack.

- So after 5 seconds the `setTimeout()` will be pushed into the call stack and executed and popped out from the call stack.

- So the event loop will keep on checking if the call stack is empty and if it is empty then it will check if there is anything in the callback queue and if there is anything in the callback queue then it will push it into the call stack.


## `setTimeout()` breaks trust

So as we have heard the timeout method is actually breaking the trust but how is it able to do so ?

It's very simple as we already studied all of these kind of things like the timeout fetch and everything first goes into the callback queue and after that it comes into the call stack so for example take into consideration of huge amount of code

People there is a million lines of code that is being executed in the call stack,  and suppose we say that it takes about 10 seconds for that code to execute and only after that the call stack will be empty and time out will be pushed inside the call stack.

Now here's the trick inside of our timeout we set a timer for five seconds but it will be executed after 10 seconds because the call stack was super busy in executing other things so that is the reason why it seems that the set timeout is breaking our trust.

## `setTimeout(0)` is not 0

So we have seen that the `setTimeout()` is breaking our trust but what about the `setTimeout(0)` ?

So the thing is that the `setTimeout(0)` is not 0 it is actually 4 milliseconds. So the thing is that the `setTimeout()` is not actually a part of the javascript engine it is a part of the web api's and the web api's are not a part of the javascript engine they are a part of the browser. So the browser has a minimum time of 4 milliseconds for the `setTimeout()`.




## Behind the scenes of DOM api

Consider this following code:

```javascript

console.log('1');

document.getElementById('btn').addEventListener('click', () => {
    console.log('2');
});

console.log('3');

```

- So when we run this code, the first thing that happens is that the global execution context is created and pushed into the call stack.

- Then the first `console.log('1')` is executed and popped out from the call stack.

- Then we call the DOM api it will find the element with the id `btn` and add an event listener to it and then it sits there.

- Also, the `console.log('3')` is executed and popped out from the call stack.

- Now as soon as we click the button the event listener will be pushed into the callback queue and then the event loop will push it into the call stack and execute it and pop it out from the call stack.


## Behind the scenes of `fetch()`

```javascript

console.log("Start");

setTimeout(function cbT(){
    console.log("Callback cbT");
}, 5000);


fetch('https://api.github.com/users')
    .then(function cbF(){
        console.log("Callback cbF");
    });

console.log("End");

```

Everything works the same, except the fact that anything that come through the promises OR mutation observers will end up in the `Micro Task queue.` which is of higher priority than the callback queue.

So here, `cbF()` will be pushed into the `Micro Task queue` and then the event loop will push it into the call stack and execute it and pop it out from the call stack and after that `cbT()` will be pushed into the `callback queue` and then the event loop will push it into the call stack and execute it and pop it out from the call stack.


# Why do we even need callback queue ?

See the thing is if the user was to click the button multiple times then the event listener would be pushed into the callback queue multiple times and the event loop would push it into the call stack multiple times and execute it multiple times. That is the reason why we maintain a callback queue.



# Starvation of callback queue

If our micro task queue is full then the callback queue will starve and the callback queue will not be able to push anything into the call stack as the event loop will keep on pushing the micro task queue into the call stack.