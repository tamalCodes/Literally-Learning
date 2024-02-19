---
sidebar_position: 2
description: "Objects in JS in detail"
---

# Objects
<!--
- Arrays 1
- Objects2
- Let and Var3
- Hoisting4
- Closures5
- functions6
- debouncing and throttling7
- Browsers8
- engines9 -->



## What are objects ?

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


## Object Vs Array

Arrays are a special kind of objects, with numbered indexes. But we usually use arrays when we want the elements to be ordered.

Objects are used when we want the elements to be named. But there are exceptions, for instance, when an array is used to store an ordered collection of objects.

## Object VS Map

Maps are similar to Objects in that both let you set keys to values, retrieve those values, delete keys, and detect whether something is stored at a key. Because of this, Objects have been used as Maps historically; however, there are important differences between Objects and Maps that make using a Map better.

- An Object has a prototype, so there are default keys in the map. However, this can be bypassed using map = Object.create(null). The keys of an Object are Strings and Symbols, whereas they can be any value for a Map, including functions, objects, and any primitive.

## `delete` operator in objects

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

## `in` operator in objects

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



## `.call()` method

The call() method is a predefined JavaScript method. Basically we use this method to borrow the functions/properties from another object.

```js
const person = {
  firstName:"John",
  lastName: "Doe",
  fullName: function () {
    return this.firstName + " " + this.lastName;
  }
}

// This will return "John Doe":
person.fullName();
```


### Passing more stuffs

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

## `.bind()` method

The `bind()` method is similar to the `call()` method. The only difference is that, the `call()` method executes the function immediately, but the `bind()` method returns the function with the reference to the object which can be called later on.

```js
let arr = {
    a: "Tamal",
    b: "Das",
}

function sumup(c, d){
    console.log(this.a + " " + this.b + " " + c + " " + d);
}

let callLaterOn = sumup.bind(arr, "Jeet", "Roy");
callLaterOn();
```


## `.apply()` method

The only difference between the `call()` and `apply()` method is that, in `call()` method we pass the multiple arguments one by one, but in `apply()` method we pass the arguments as an array.

```js
let arr = {
    a: "Tamal",
    b: "Das",
}

function sumup(c, d){
    console.log(this.a + " " + this.b + " " + c + " " + d);
}

// sumup.call(arr, "Jeet", "Roy");  <-- This wont work
sumup.apply(arr, ["Jeet", "Roy"]);
```

## Pollyfill



### Pollyfill for `.bind()` method




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




