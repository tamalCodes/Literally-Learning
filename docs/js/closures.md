---
sidebar_position: 5
description: "Understanding Closures and Events in JavaScript."
---

# Closures & Events

## Closures

It's like a function that carries a piece of past with it wherever it goes. **A function along with it's lexical scope bundled together forms a closure.**

Each and every function in javascript has access to its lexical environment that is whatever the variables are that are defined in the parent function.  so even if this function is executed in some other scope not in its original scope but some other scope outside it is still able to remember its lexical environment and that is exactly what closures are.


```js

function outer()
{
    var outerVar = 7;
    function inner()
    {
        console.log(outerVar);
    }

    return inner;
}
outer()();
```

In the above code, the function `inner` is a closure as it is able to access the variable `outerVar`  even though we donot have the `outerVar` in the function `inner`.

**Why is this happening ?**

Because of lexical scopes. As we studied, closure is a function along with it's lexical scope bundled together. Lexical scope of `inner()` is basically whatever the variables are defined in the parent function `outer()`.

**What is `outer()()` ?**

`outer()` returns the function `inner` and then we are executing the function `inner` by adding `()` to it.

Equivalent to :

```js
var close = outer();
close();
```

**So what happens if i modify the function to the following, will it still form a closure ?**

```js
function outer()
{
    function inner()
    {
        console.log(outerVar);
    }
    var outerVar = 7;
    return inner;
}
outer()();
```

Yes it will still form a closure because we form closures with our outer environment and not in any order so yeah. .

**Yes, so what happens if i change `var outerVar = 7` to `let` ?**

Yeah so let is block scoped and not function scoped, but still it will form a closure, because we have the inner in the same scope as the outerVar.

**What if we nest it inside another function ?**

That will work too, we will still form a closure because we are caring about the parent's lexical scope.

```js
function outerGod(){
    var outerVar = 7;
    function outer()
    {
        function inner()
        {
            console.log(outerVar);
        }

        return inner;
    }
    return outer;
}

outerGod()()();
```



### Uses of Closure

1. Module Design Pattern
2. Currying
3. Memoization
4. SetTimeouts
5. Maintaining state in async world

### Advantages

1. Data Hiding
2. Encapsulation
3. Module Design Pattern


**Can you perhaps explain  more about Data hiding ?**

So Data hiding can be done when we actually gain some privacy , such that other part of the function is not able to access the data. So we can do this by using closures.

```js

function counter(){
    var count = 0;
    return function incrementCounter(){
        count++;
        console.log(count);
    }
}

var counter1 = counter();

counter1();
counter1();
```

So in the above code, we are able to access the variable `count` only through the function `incrementCounter` and not directly. So we are hiding the data from the outside world. This is called data hiding.

**What happens if we make another `var counter2 = counter()` ?**

The `counter1` and `counter2` will have different copies of the variable `count` and they will not interfere with each other. So we are able to create multiple copies of the variable `count` and they will not interfere with each other. This is called encapsulation.



**But this is code is not scalable enough, how do it make it better ?**

We can use a constructor function to make it better.

```js

function counter(){
    var count = 0;
    this.incrementCounter = function(){
        count++;
        console.log(count);
    }

    this.decrementCounter = function(){
        count--;
        console.log(count);
    }
}

var counter1 = new counter();

counter1.incrementCounter();
counter1.incrementCounter();
counter1.decrementCounter();
```

### Disadvantages

Over comsumption of memory because everytime a closure is created, it accumulates the memory. So if we are creating a lot of closures, then it will consume a lot of memory. The variables are not garbage collected till the program expires so, we need to handle this carefully.

It might also lead to memory leaks.


## Questions

### Question 1

```js
function x(){

    var i = 1;
    setTimeout(function(){
        console.log(i);
    }, 1000);

    console.log(i);
}

x();
```

**What do you expect to see in the console ?**

**Answer:** 1.

### Question 2

I want to print 1,2,3,4,5 with a delay of 1 second between each number.

```js
function x(){

    for(var i = 1; i <= 5; i++){
        setTimeout(function(){
            console.log(i);
        }, i*1000);
    }
}
x();
```

You write this kind of above code thinking that it will print 1,2,3,4,5 with a delay of 1 second between each number as the value of i is changing in each iteration and the timeout is also changing in each iteration. But it doesn't work like that. OUTPUT We get:

```bash
6
6
6
6
6
```

**Why is this happening ?**

**Answer:** Because of closures. The setTimeout function is a closure and it has access to the outer scope of the function x() which is the global scope.

So when the setTimeout takes this function and stores this somewhere with a timer attached, we remember the `reference to i` not the `value to i`.

We get 6 because when the setTimeout function is executed the for loop has already finished execution and the value of i is 6.

Javascript doesnot wait for anything, so it will just execute the for loop and then execute the setTimeout function. As we are executing the setTimeout function late, we get the value of i as 6.

**How do i fix this behaviour ?**

**Answer:** We can fix this behaviour by using `let`, because `let` has block scope and not function scope. For each and every loop iteration, the `i` is a new variable everytime. Previously we were using `var` which has function scope which meant that the `i` was the same variable for all the loop iterations.


**But you need to do it without `let`**

**Answer:** We can fix this behaviour by using closures. The intuition is to provide a new copy of `i` to the `setTimeout` function everytime.

```js
for(var i=0; i<=5; i++){
    function close(x){
        setTimeout(function(){
            console.log(x);
        }, x*1000);
    }
    close(i);
}
```

What's happening is that we are passing the value of `i` to the function `close` and then we are passing the value of `x` to the setTimeout function. So we are passing a new copy of `i` to the setTimeout function everytime.





---

## Garbage Collector

So this is a part of the javascript engine that is responsible for memory management. Whenever it finds out that some variablesa are not longer needed it simply clears out the memory.


## Event Listners

```js

document.getElementById("myBtn").addEventListener("click", function shoutAtuser() {
    console.log("Hello World!")
});

```

Here we are adding an event listner to the button with the id `myBtn` and we are adding a callback function to it. So when the button is clicked the callback function will be put inside the event queue and will be executed when the call stack is empty.

### Closures with Event Listners

Suppose in Javascript we wanna make something such that we are keeping a track of how many times a button was clicked. Well one solution could have been to simply use a global variable and increment it everytime the button is clicked. But that's not a good solution because we are using a global variable and we know that global variables can be acessed all throughout.

So we can use closures to do so.

```javascript
function attachEventListners()
{
    let count = 0;
    document.getElementById("myBtn").addEventListener("click", function shoutAtuser() {
        console.log("Hello World!", ++count);
    });
}
```

Here the `shoutAtuser` function has access to the `count` variable and everytime the button is clicked the `count` variable will be incremented.


### Cleanup

Well event listners are heavy, so it  form closures whenever we are attaching an event listners, it consumes some memory.

It cannot free up the `count`, that's why we need to remove them too. Imagine having 1000s of buttons, with so many listners. It will be a huge memory leak.

If we remove the event listners then the garbage collector will be able to free up the memory.

```javascript
function attachEventListners()
{
    let count = 0;
    document.getElementById("myBtn").addEventListener("click", function shoutAtuser() {
        console.log("Hello World!", ++count);
    });
}

function removeEventListners()
{
    document.getElementById("myBtn").removeEventListener("click", shoutAtuser);
}
```
### Event Flow

Event flow is the order in which event is received on the web page. When you click an element that is nested in various other elements, before your click actually reaches its destination, or target element, it must trigger the click event for each of its parent elements first, starting at the top with the global window object.


1. Top to Bottom(Event Capturing)
2. Bottom to Top (Event Bubbling)

### Event bubbling

Event bubbling is a type of event propagation where the event first triggers on the innermost target element, and then successively triggers on the ancestors (parents) of the target element in the same nesting hierarchy till it reaches the outermost DOM element.

### Event capturing

Event capturing is a type of event propagation where the event is first captured by the outermost element, and then successively triggers on the descendants (children) of the target element in the same nesting hierarchy till it reaches the innermost DOM element.

### `preventDefault()` Method

The preventDefault() method cancels the event if it is cancelable, meaning that the default action or behaviour that belongs to the event will not occur. For example, prevent form submission when clicking on submit button and prevent opening the page URL when clicking on hyperlink are some common use cases.

```javascript
document
.getElementById("link")
.addEventListener("click", function (event) {
event.preventDefault();
});
```

## Memoization

Memoization in javascript is an optimization technique, to reduce the complexity of the application, runtime of the application, and proper utilization of resources (Time and Memory). The process consists of using an extra space (cache) for the reduction of expensive function calls (a function that recursively calls itself and it has some overlapping problem). By using memoization, we store the values that were calculated in the previously called subproblems. Then if the same subproblem is raised, we again use the stored value which reduces the time complexity as it removes the extra effort to calculate again and again for the same problem.



### How Does Memoization Work?

Imagine this kind of system:

```js
const multiply = (n) =>{
    return normalFunction = () => {
        console.log("This was executed");
    }
}

const m = multiply(10);

m();
m();
m();
m();
m();
```

The function is getting called every time. Bad use-case if we have expensive tasks inside the function. So we can use memoization to store the result of the function and return it if the function is called again with the same input.

We use closures, to store our cache and have the ability to get it's value.


```js
const multiply = (n) => {
  const cache = {};

    return (closureFunction = () => {
      if (n in cache)
        console.log("We found it", cache[n]);
      else {
        console.log("Didn't find");
        cache[n] = n * 10;
      }
    });

};

const m = multiply(10);

m();
m();
m();
m();
m();
```


The output will be:

```js
Didn't find
We found it 100
We found it 100
We found it 100
We found it 100
```

That's the beauty of closure, we can store the value of the free variable even after the function has finished executing.

We are returning a `closureFunction` which is literally a closure, and has acess to `cache` even after the function `multiply` has finished executing.

So we remember the value of `cache` and then check if my key `n` is present in the cache, if it is present then we return the value of `cache[n]` else we store the value of `n * 10` in the cache and return it.



### Importance of Memoization

- Memoization in javascript is an optimization technique that stores the results of function calls in a temporary data structure and then retrieves the results whenever the stored result is needed in the program. By doing this, the execution time is reduced and the CPU performance is increased

- Using Javascript Memoization we can reduce the time complexity of an application and by which the response time of the webpage will decreases (for eg. API call)


### When to Use Memoization?

- When the function is calling itself. i.e. for the recursive functions.
- When the function is pure (a function that returns the same value every time it is called). As if the value is different in each function call, then there will not be any use in storing such value. So, we can't use memoization in javascript when the function is impure.
- When the function is very complex in time(Heavy computation function). In this case, storing the results in a cache will increase the performance by reducing the time complexity, as re-computation for functions will not be performed.
