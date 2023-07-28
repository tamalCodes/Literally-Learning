<!-- TOC -->

- [What are objects ?](#what-are-objects-)
- [How do you list all properties of an object](#how-do-you-list-all-properties-of-an-object)
- [What is the difference between object and array ?](#what-is-the-difference-between-object-and-array-)
- [What is the difference between object and map ?](#what-is-the-difference-between-object-and-map-)
- [Key with spaces in objects](#key-with-spaces-in-objects)
- [Add property to object dynamically](#add-property-to-object-dynamically)
- [`delete` operator in objects](#delete-operator-in-objects)
- [`in` operator in objects](#in-operator-in-objects)
- [Q1 Find output for this:](#q1-find-output-for-this)
- [Q2 Create a function called multiplyByTwo(obj) multiplies all the numeric property values of obj by two.](#q2-create-a-function-called-multiplybytwoobj-multiplies-all-the-numeric-property-values-of-obj-by-two)
- [How browsers work](#how-browsers-work)
- [Rest \& Spread Operators `...`](#rest--spread-operators-)
- [`.call()` method](#call-method)
  - [What if i wanna pass more stuffs ?](#what-if-i-wanna-pass-more-stuffs-)
- [`.apply()` method](#apply-method)
- [`.bind()` method](#bind-method)
  - [Pollyfill for `.bind()` method](#pollyfill-for-bind-method)

<!-- /TOC -->



# What are objects ? 

Objects are one of the most important data types in JavaScript. They allow us to store keyed collections of various data and more complex entities. In JavaScript, objects penetrate almost every aspect of the language. So we must understand them first before going in-depth anywhere else. This is how object looks like: 

```js

const person = {
  name: "John",
  age: 20,
  hobbies: ["reading", "coding"],
  greet: function () {
    console.log("Hello, I am " + this.name);
  },
};

```

# How do you list all properties of an object

You can use the `Object.getOwnPropertyNames()` method which returns an array of all properties found directly in a given object. Let's the usage of it in an example,

```javascript
const newObject = {
  a: 1,
  b: 2,
  c: 3,
};

console.log(Object.getOwnPropertyNames(newObject));
["a", "b", "c"];
```


# What is the difference between object and array ?

Arrays are a special kind of objects, with numbered indexes. But we usually use arrays when we want the elements to be ordered.

Objects are used when we want the elements to be named. But there are exceptions, for instance, when an array is used to store an ordered collection of objects.

# What is the difference between object and map ?

Maps are similar to Objects in that both let you set keys to values, retrieve those values, delete keys, and detect whether something is stored at a key. Because of this, Objects have been used as Maps historically; however, there are important differences between Objects and Maps that make using a Map better.

- An Object has a prototype, so there are default keys in the map. However, this can be bypassed using map = Object.create(null). The keys of an Object are Strings and Symbols, whereas they can be any value for a Map, including functions, objects, and any primitive.

# Key with spaces in objects

```js

const tamal={
  "tamal is good": true
}

console.log(tamal["tamal is good"]); // true

```

# Add property to object dynamically

```js

const person = {
  name: "John",
  age: 20,
  hobbies: ["reading", "coding"],
  greet: function () {
    console.log("Hello, I am " + this.name);
  },
};

person["address"] = "Kolkata";

console.log(person); // {name: "John", age: 20, hobbies: Array(2), greet: ƒ, address: "Kolkata"}

```

# `delete` operator in objects

The delete operator removes a given property from an object. On successful deletion, it will return true, else false will be returned.

```js

const person = {
  name: "John",
  age: 20,
  hobbies: ["reading", "coding"],
  greet: function () {
    console.log("Hello, I am " + this.name);
  },
};

delete person.age;

console.log(person); // {name: "John", hobbies: Array(2), greet: ƒ}

```

# `in` operator in objects

The in operator returns true if the specified property is in the specified object or its prototype chain.

```js

const person = {
  name: "John",
  age: 20,
  hobbies: ["reading", "coding"],
  greet: function () {
    console.log("Hello, I am " + this.name);
  },
};

console.log("name" in person); // true

for (let key in person) {
  console.log(key); // name, age, hobbies, greet
  console.log(person[key]); // John, 20, ["reading", "coding"], ƒ () { console.log("Hello, I am " + this.name); }
}
```


# Q1 Find output for this: 

```js
const obj = {
  a: 1,
  b: 2,
  a:3,
}

console.log(obj); // {a: 3, b: 2}
```

The reason is that the object keys are unique. So, if you have the same key twice, the second key will overwrite the first key.

# Q2 Create a function called multiplyByTwo(obj) multiplies all the numeric property values of obj by two. 

```js
let nums:{
  a:100,
  b:200,
  c:"hello world",
}
```






# How browsers work

Here's a brief overview of how browsers work:

- User enters a URL: When a user enters a URL in the browser's address bar, the browser sends a request to the server hosting the website.

- Server sends the web page: The server responds with an HTML document that contains the website's content.

- Parsing the HTML document: The browser then parses the HTML document, creating a Document Object Model (DOM) that represents the structure of the page.

- Fetching additional resources: If the HTML document references additional resources such as stylesheets or JavaScript files, the browser fetches those resources from the server.

- Rendering the page: The browser then uses the DOM and any additional resources to render the page and display it to the user.

- Responding to user interaction: As the user interacts with the page, the browser listens for events such as clicks or scrolls and responds accordingly.

- Caching: To improve performance, browsers may cache resources such as images or scripts, so they don't have to be downloaded again on subsequent requests.

Overall, browsers use a complex combination of networking, parsing, rendering, and user interaction to provide users with a seamless web browsing experience.


# Rest & Spread Operators `...` 

**Challenges.**

Suppose your are not sure how many arguments you are going to pass to a function. In that case, you can use the rest operator to pass an indefinite number of arguments to a function. The rest operator is denoted by three dots `...` followed by the name of the array that will contain the rest of the arguments. The rest operator must be the last argument to a function.

```js
function sum(...args) {
  return args.reduce((a, b) => a + b, 0);
}

console.log(sum(1, 2, 3, 4));
```


The spread operator is the opposite of the rest operator. It allows you to spread an array into another array, or an object into another object. The spread operator is denoted by three dots `...` followed by the name of the array/object that you want to spread. The spread operator must be followed by something, otherwise it will throw an error.

```js
const arr1 = [1, 2, 3];
const arr2 = [4, 5, 6];

const arr3 = [...arr1, ...arr2];
console.log(arr3); // [1, 2, 3, 4, 5, 6]

const obj1 = { name: 'John', age: 22 };
const obj2 = { address: 'London', phone: '1234567890' };

const obj3 = { ...obj1, ...obj2 };
console.log(obj3); // { name: 'John', age: 22, address: 'London', phone: '1234567890' }
```

# `.call()` method

The call() method is a predefined JavaScript method. Basically we use this method to borrow the functions from another place.

For example: 

```js
let arr = {
    a: "Tamal",
    b: "Das",
    sumup: function(){
        console.log(this.a + " " + this.b);
    }
}

let brr = {
    a: "Jeet",
    b: "Roy",
    sumup: function(){
        console.log(this.a + " " + this.b);
    }
}

arr.sumup.call(brr);
```

Here inside of `arr` we have a function called `sumup` that basically takes in two arguments and prints them. Now we want to use this function inside of `brr` object. So we can use the `call()` method to do that.

To use the call method, first write the original function name, then write the `call()` method and inside of the `call()` method write the object name from where you want to borrow the details. 

In our case we wrote `.call(brr)` which borrows the details from `brr` object.

**NOTE:** We can also take out the `sumup` function from the `arr` object and then use it like `sumup.call(arr)`.

## What if i wanna pass more stuffs ? 

Remember the first thing to pass will always be the reference whose details we want to borrow. After that we can pass as many arguments as we want. 

```js

let arr = {
    a: "Tamal",
    b: "Das",
}

function sumup(c, d){
    console.log(this.a + " " + this.b + " " + c + " " + d);
}

sumup.call(arr, "Jeet", "Roy");
```

# `.apply()` method

The only difference between the `call()` and `apply()` method is that, in `call()` method we pass the arguments one by one, but in `apply()` method we pass the arguments as an array. 

```js
let arr = {
    a: "Tamal",
    b: "Das",
}

function sumup(c, d){
    console.log(this.a + " " + this.b + " " + c + " " + d);
}

sumup.apply(arr, ["Jeet", "Roy"]);
```

# `.bind()` method

The `bind()` method is similar to the `call()` method. The only difference is that, the `call()` method executes the function immediately, but the `bind()` method returns the function with the reference to the object which can be called later on.

```js
let arr = {
    a: "Tamal",
    b: "Das",
}

function sumup(c, d){
    console.log(this.a + " " + this.b + " " + c + " " + d);
}

let brr = sumup.bind(arr, "Jeet", "Roy");
brr();
```

## Pollyfill for `.bind()` method

**BTW what's a pollyfill ?**

A polyfill is a piece of code (usually JavaScript on the Web) used to provide modern functionality on older browsers that do not natively support it.


Okay, now that we know wtf is a pollyfill, let's see how we can create a pollyfill for the `.bind()` method.

```js

let arr = {
    a: "Tamal",
    b: "Das",
}

function sumup(c, d){
    console.log(this.a + " " + this.b + " " + c + " " + d);
}

// without pollyfill
let brr = sumup.bind(arr, "Jeet", "Roy");
brr();

// with pollyfill
Function.prototype.mybind = function(...args){
    let obj = this;
    let params = args.slice(1);
    return function(...args2){
        obj.apply(args[0], [...params, ...args2]);
    }
}

let crr = sumup.mybind(arr, "Jeet", "Roy");
crr();
```

**DETAILED EXPLANATION:**

- First we created a function called `mybind` that accepts `...args` as arguments just like we did in `sumup.bind(arr, "Jeet", "Roy")`.
- Then we do `let obj = this`. In JS, this refers to the context in which the function is called.SO if you `console.log(obj);` you will get `[Function: sumup]`.
- The params are sliced versions, excluding the first one. You will get `[ 'Jeet', 'Roy' ]`
- `obj.apply(args[0], [...params, ...args2]);` is basically the same as  `sumup.bind(arr, "Jeet", "Roy");`