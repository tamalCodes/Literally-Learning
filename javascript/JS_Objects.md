<!-- TOC -->

- [Qustions based on Objects !](#qustions-based-on-objects-)
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

<!-- /TOC -->




# Qustions based on Objects !

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

## How do you list all properties of an object

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


## What is the difference between object and array ?

Arrays are a special kind of objects, with numbered indexes. But we usually use arrays when we want the elements to be ordered.

Objects are used when we want the elements to be named. But there are exceptions, for instance, when an array is used to store an ordered collection of objects.

## What is the difference between object and map ?

Maps are similar to Objects in that both let you set keys to values, retrieve those values, delete keys, and detect whether something is stored at a key. Because of this, Objects have been used as Maps historically; however, there are important differences between Objects and Maps that make using a Map better.

- An Object has a prototype, so there are default keys in the map. However, this can be bypassed using map = Object.create(null). The keys of an Object are Strings and Symbols, whereas they can be any value for a Map, including functions, objects, and any primitive.

## Key with spaces in objects

```js

const tamal={
  "tamal is good": true
}

console.log(tamal["tamal is good"]); // true

```

## Add property to object dynamically

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


## Q1 Find output for this: 

```js
const obj = {
  a: 1,
  b: 2,
  a:3,
}

console.log(obj); // {a: 3, b: 2}
```

The reason is that the object keys are unique. So, if you have the same key twice, the second key will overwrite the first key.

## Q2 Create a function called multiplyByTwo(obj) multiplies all the numeric property values of obj by two. 

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

