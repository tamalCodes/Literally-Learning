---
sidebar_position: 6
description: "Different types of functions in JavaScript."
---


# Functions


A function is a block of code designed to perform a particular task. A function is executed when "something" invokes it (calls it).

```js
function myFunction(p1, p2) {
  return p1 * p2;   // The function returns the product of p1 and p2
}
```

## Types of functions

### Function statement

A JavaScript function is defined with the function keyword, followed by a name, followed by parentheses ().

```js
function helloWorld() {
    console.log("Hello World");
}
```

### Function expression

A JavaScript function can also be defined using an expression. A function expression can be stored in a variable:

```js
var x = function (a, b) {return a * b};
```



### Function declaration

A function definition (also called a function declaration, or function statement) consists of the function keyword, followed by:

- The name of the function.
- A list of parameters to the function, enclosed in parentheses and separated by commas.
```js
function name(parameter1, parameter2, parameter3) {
  // code to be executed
}
```




### Anonymous function

A function without a name is called an anonymous function. An anonymous function is often not accessible after its initial creation.

So what we have below will be giving us syntax errors because we are trying to call an anonymous function. It will simply say `SyntaxError: Function statements require a function name`, so now the question arieses - if we cannot call an anonymous function then how do we use it ?

```js
function ()
{
    console.log("WTF");
}
```

So anonymousfunctions are used in places where functions are used as values. For example, we can pass an anonymous function as an argument to another function. We can also use an anonymous function as a closure.

```js
// Anonymous function as an argument
setTimeout(function() {
    console.log("Hello World!");
}, 1000);
```

```js
// Anonymous function as a closure
var helloWorld = function() {
    console.log("Hello World!");
};
```


### Named function expression

It's the same as a function expression just the only difference is it has a name. That's legit the only difference we have between the two.

```js

// In function expression:
var a = function()
{
    console.log("WTF");
}

// In named function expression:

var a = function b()
{
    console.log("WTF");
}

```

### Lambda functions

An arrow function is a shorter syntax for a function expression and does not have its own **this, arguments, super, or new.target**. These functions are best suited for non-method functions, and they cannot be used as constructors.



### First class functions

In Javascript, functions are first class objects. First-class functions means when functions in that language are treated like any other variable.
For example, in such a language, a **function can be passed as an argument to other functions**, can be **returned by another function** and can be **assigned as a value to a variable**. For example, in the below example, handler functions assigned to a listener.



```js

const handler = () => console.log("This is a click handlerfunction");
document.addEventListener("click", handler);

  ```

```javascript
var helloWorld = function a(printfunction) {
console.log("Hello World!");

printfunction();
};

function xzz()
{
    console.log("Hello from my new desk setup");
}

helloWorld(xzz);
```





### First order function

First-order function is a function that doesn’t accept another function as an argument and doesn’t return a function as its return value.

```javascript
const firstOrder = () => console.log("I am a function!");
```



### Higher order function

Higher-order function is a function that accepts another function as an argument or returns a function as a return value or both.

```javascript
// Callback function, passed as a parameter in the higher order function
function callbackFunction(){
    console.log('I am  a callback function');
}

// higher order function
function higherOrderFunction(func){
    console.log('I am higher order function')
    func()
}

higherOrderFunction(callbackFunction);
```

### What is a unary function

Unary function (i.e. monadic) is a function that accepts exactly one argument. It stands for a single argument accepted by a function.

Let us take an example of unary function,

```javascript
const unaryFunction = (a) => console.log(a + 10); // Add 10 to the given argument and display the value
```



### Pure functions

In simple terms, pure functions do not have an internal state. Therefore, all operations performed in pure functions are not affected by their state. As a result, the same input parameters will give the same deterministic output regardless of how many times you run the function.

```js

function add(a,b) {
  return a + b
}
console.log(add(4,5))

```

This example contains a simple add() function, which gives 9 as the output. It is a very predictable output, and it does not depend on any external code. This makes the add() function a pure function.

If a function is declared pure and does not have a state, it can share many instances inside a class. Also, it is advised to avoid mutations inside pure functions.


#### Advantages of pure functions
- A pure function works as an independent function that gives the same output for the same inputs.
- Pure functions are readable because of independent behavior. Moreover, they are straightforward to debug.
- You can clone an external state into a pure function, but it does not change the purity of the function.


### Impure Functions

An impure function is a function that contains one or more side effects. It mutates data outside of its lexical scope and does not predictably produce the same output for the same input.

```js

var addNew = 0;

function add(a,b){
  addNew =1;
  return a + b + addNew
}

console.log(add(4,5))
```

In the above example, there is a variable named addNew, and it is declared outside of the add() function. But the state of that variable is changed inside the add() function. So, the add() function has a side effect on a variable outside of its scope and is therefore considered an impure function.

JavaScript doesn’t adhere to rigorous notions of function purity and immutability. Any program you develop will need impure functions to modify the state of JavaScript variables (named memory locations).

In general, it’s ideal to keep the impure elements of your programs distinct from the data processing, which is usually pure. Also, updating and maintaining your applications will be much easier if you confine impure elements to their particular functions.


#### Advantages of impure functions

- Impure functions can use an in-place solution to reduce the space complexity.

- In impure functions, the state can be modified to use the parent variable and call for the function compiling.



## Differences


### Function statement vs function expression

The function statement can be called before we define it in the code but it is not the same for the funciton statement. The function statement will act as a variable and will be hoisted to the top of the code with the value undefined.

```js
a();
b();

const b = function()
{
    console.log("WTF");
}


function a()
{
    console.log("WTF")
}
```

Here the function `a()` will output `WTF` but the function `b()` will throw an error because it is not defined.

### Function constructor vs function declaration

The functions which are created with `Function constructor` do not create closures to their creation contexts but they are always created in the global scope. i.e, the function can access its own local variables and global scope variables only. Whereas function declarations can access outer function variables(closures) too.



**Function Constructor:**

```javascript
var a = 100;
function createFunction() {
  var a = 200;
  return new Function("return a;");
}
console.log(createFunction()()); // 100
```

**Function declaration:**

```javascript
var a = 100;
function createFunction() {
  var a = 200;
  return function func() {
    return a;
  };
}
console.log(createFunction()()); // 200
```


### Parameters vs Arguments

Parameters are the stuff we put while we are defining the function and arguments are the stuff we put while we are calling the function.

```js
function helloWorld(parameter1, parameter2)
{
    console.log(parameter1 + parameter2);
}

helloWorld("Hello", "World");
```

The `parameter1` , `parameter2` are the parameters and the `"Hello"` , `"World"` are the arguments.



### How Higher Order Functions Work

So, suppose I want you to write a function that calculates the area and diameter of a circle. As a beginner, the first solution that comes to our mind is to write each separate function to calculate area or diameter.

```js

const radius = [1, 2, 3];

// function to calculate area of the circle
const calculateArea =  function (radius) {
    const output = [];
    for(let i = 0; i< radius.length; i++){
        output.push(Math.PI * radius[i] * radius[i]);
    }
    return output;
}

// function to calculate diameter of the circle
const calculateDiameter =  function (radius) {
    const output = [];
    for(let i = 0; i< radius.length; i++){
        output.push(2 * radius[i]);
    }
    return output;
}

console.log(calculateArea(radius));
console.log(calculateDiameter(radius))

```

But have you noticed the problem with the above code? Aren't we writing almost the same function again and again with slightly different logic? Also, the functions we have written aren't reusable, are they?

So, let's see how we can write the same code using HOFs:

```js
const radius = [1, 2, 3];

// logic to clculate area
const area = function(radius){
    return Math.PI * radius * radius;
}

// logic to calculate diameter
const diameter = function(radius){
    return 2 * radius;
}

// a reusable function to calculate area, diameter, etc
const calculate = function(radius, logic){
    const output = [];
    for(let i = 0; i < radius.length; i++){
        output.push(logic(radius[i]))
    }
    return output;
}


console.log(calculate(radius, area));
console.log(calculate(radius, diameter));
```

Now, as you can see in the above code, we have only written a single function calculate() to calculate the area and diameter of the circle. We only need to write the logic and pass it to calculate() and the function will do the job.

The code that we have written using HOFs is concise and modular. Each function is doing its own job and we are not repeating anything here.




## Callback

A callback  is a function passed into another function as an argument, which is then invoked inside the outer function to complete some kind of routine or action. This kinda gives us the abilty to make javascript work in an asynchronous manner.

```js
setTimeout(function() {
    console.log("Hello World!");
}, 5000);
```

Since javascript is an syncronous language, it will execute the code line by line. It will not be waiting for `5000` milliseconds and then execute the tasks after `5000 ms`. That's where Callback function comes into play, we achieve this kind of async behaviour such that after `5000` milliseconds the Callback function's task  will be executed.

### Callback Hell

Callback hell is a phenomenon that afflicts a JavaScript developer when he tries to execute multiple asynchronous operations one after the other. The code becomes unreadable and difficult to maintain. It is also known as pyramid of doom.

```js

apiCall1(function() {
    apiCall2(function() {
        apiCall3(function() {
            apiCall4(function() {
                // ...
            });
        });
    });
});

```

In such a case, we donot know if `apiCall1()` is gonna work properly, that might cause issues later. Basically it is the responsibiity of `apiCall1` to execute the other functions. So if `apiCall1` fails then the other functions will not be executed. That's called `inversion of control`, where you are giving the control to the `apiCall1` function to execute the other functions.

### How to avoid callback hell ?

We can avoid callback hell by using promises or async/await. Promises are a way to handle asynchronous operations in JavaScript. They are easy to manage when dealing with multiple asynchronous operations where callbacks can create callback hell leading to unmanageable code.

```js
apiCall1()
    .then(apiCall2)
    .then(apiCall3)
    .then(apiCall4)
    .catch(errorHandler);
```
