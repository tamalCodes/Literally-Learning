
<!-- TOC -->

- [What is the difference between Call, Apply and Bind](#what-is-the-difference-between-call-apply-and-bind)
- [Slice, Splice 👇🏻](#slice-splice-)
  - [What is the purpose of the array slice method](#what-is-the-purpose-of-the-array-slice-method)
  - [What is the purpose of the array splice method](#what-is-the-purpose-of-the-array-splice-method)
  - [What is the difference between slice and splice](#what-is-the-difference-between-slice-and-splice)
- [How do you compare Object and Map](#how-do-you-compare-object-and-map)
- [What is the difference between == and === operators](#what-is-the-difference-between--and--operators)
- [What is memoization](#what-is-memoization)
  - [How Does Memoization Work?](#how-does-memoization-work)
  - [Closure](#closure)
  - [High Order Function](#high-order-function)
  - [Importance of Memoization](#importance-of-memoization)
  - [When to Use Memoization?](#when-to-use-memoization)
- [What is a service worker](#what-is-a-service-worker)
- [How do you manipulate DOM using a service worker](#how-do-you-manipulate-dom-using-a-service-worker)
- [How do you reuse information across service worker restarts](#how-do-you-reuse-information-across-service-worker-restarts)
- [How do I modify the url without reloading the page](#how-do-i-modify-the-url-without-reloading-the-page)
- [How do you check whether an array includes a particular value or not](#how-do-you-check-whether-an-array-includes-a-particular-value-or-not)
- [How do you compare scalar arrays](#how-do-you-compare-scalar-arrays)
- [How to get the value from get parameters](#how-to-get-the-value-from-get-parameters)
- [What is the `toLocaleString()` method ?](#what-is-the-tolocalestring-method-)
- [What is the difference between java and javascript](#what-is-the-difference-between-java-and-javascript)
- [What are the different methods to find HTML elements in DOM](#what-are-the-different-methods-to-find-html-elements-in-dom)
- [What is jQuery](#what-is-jquery)
- [Why do we call javascript as dynamic language](#why-do-we-call-javascript-as-dynamic-language)
- [What is a void operator](#what-is-a-void-operator)
- [How do you create an infinite loop](#how-do-you-create-an-infinite-loop)
- [What is ES6](#what-is-es6)
- [List down some of the features of ES6](#list-down-some-of-the-features-of-es6)
- [What is destructuring assignment](#what-is-destructuring-assignment)
- [What are default values in destructuring assignment](#what-are-default-values-in-destructuring-assignment)
- [How do you swap variables in destructuring assignment](#how-do-you-swap-variables-in-destructuring-assignment)
- [What are dynamic importss](#what-are-dynamic-importss)
- [What is collation](#what-is-collation)
- [What is for...of statement](#what-is-forof-statement)
- [What is the output of below spread operator array](#what-is-the-output-of-below-spread-operator-array)
- [Is JavaScript faster than server side script](#is-javascript-faster-than-server-side-script)
- [What is the difference between Shallow and Deep copy](#what-is-the-difference-between-shallow-and-deep-copy)
- [How do you trim a string at the beginning or ending](#how-do-you-trim-a-string-at-the-beginning-or-ending)
- [What is a thunk function](#what-is-a-thunk-function)
- [What are asynchronous thunks](#what-are-asynchronous-thunks)
- [What happens with negating an array](#what-happens-with-negating-an-array)
- [What happens if we add two arrays](#what-happens-if-we-add-two-arrays)
- [How do you remove falsy values from an array](#how-do-you-remove-falsy-values-from-an-array)
- [How do you get unique values of an array](#how-do-you-get-unique-values-of-an-array)
- [How do you map the array values without using map method](#how-do-you-map-the-array-values-without-using-map-method)
- [How do you rounding numbers to certain decimals](#how-do-you-rounding-numbers-to-certain-decimals)
- [What is the easiest way to convert an array to an object](#what-is-the-easiest-way-to-convert-an-array-to-an-object)
- [How do you create an array with some data](#how-do-you-create-an-array-with-some-data)
- [What are the placeholders from console object](#what-are-the-placeholders-from-console-object)
- [Is it possible to add CSS to console messages](#is-it-possible-to-add-css-to-console-messages)
- [What is the purpose of dir method of console object](#what-is-the-purpose-of-dir-method-of-console-object)
- [Is it possible to debug HTML elements in console](#is-it-possible-to-debug-html-elements-in-console)
- [How do you display data in a tabular format using console object](#how-do-you-display-data-in-a-tabular-format-using-console-object)
- [How do you verify that an argument is a Number or not](#how-do-you-verify-that-an-argument-is-a-number-or-not)

<!-- /TOC -->

# What is the difference between Call, Apply and Bind

The difference between Call, Apply and Bind can be explained with below examples,

**Call:** The call() method invokes a function with a given `this` value and arguments provided one by one

```javascript
var employee1 = { firstName: "John", lastName: "Rodson" };
var employee2 = { firstName: "Jimmy", lastName: "Baily" };
function invite(greeting1, greeting2) {
  console.log(
    greeting1 + " " + this.firstName + " " + this.lastName + ", " + greeting2
  );
}
invite.call(employee1, "Hello", "How are you?"); // Hello John Rodson, How you?
invite.call(employee2, "Hello", "How are you?"); // Hello Jimmy Baily, How you?
```

**Apply:** Invokes the function with a given `this` value and allows you to pass in arguments as an array

```javascript
var employee1 = { firstName: "John", lastName: "Rodson" };
var employee2 = { firstName: "Jimmy", lastName: "Baily" };

function invite(greeting1, greeting2) {
  console.log(
    greeting1 + " " + this.firstName + " " + this.lastName + ", " + greeting2
  );
}

invite.apply(employee1, ["Hello", "How are you?"]); // Hello John Rodson, How are you?
invite.apply(employee2, ["Hello", "How are you?"]); // Hello Jimmy Baily, How are you?
```

**bind:** returns a new function, allowing you to pass any number of arguments

```javascript
var employee1 = { firstName: "John", lastName: "Rodson" };
var employee2 = { firstName: "Jimmy", lastName: "Baily" };

function invite(greeting1, greeting2) {
  console.log(
    greeting1 + " " + this.firstName + " " + this.lastName + ", " + greeting2
  );
}

var inviteEmployee1 = invite.bind(employee1);
var inviteEmployee2 = invite.bind(employee2);
inviteEmployee1("Hello", "How are you?"); // Hello John Rodson, How are you?
inviteEmployee2("Hello", "How are you?"); // Hello Jimmy Baily, How are you?
```

Call and apply are pretty interchangeable. Both execute the current function immediately. You need to decide whether it’s easier to send in an array or a comma separated list of arguments. You can remember by treating Call is for **comma** (separated list) and Apply is for **Array**.

Whereas Bind creates a new function that will have `this` set to the first parameter passed to bind().

# Slice, Splice 👇🏻

## What is the purpose of the array slice method

The **slice()** method returns the selected elements in an array as a new array object. It selects the elements starting at the given start argument, and ends at the given optional end argument without including the last element. If you omit the second argument then it selects till the end.

Some of the examples of this method are,

```javascript
   let arrayIntegers = [1, 2, 3, 4, 5];
   let arrayIntegers1 = arrayIntegers.slice(0, 2); // returns [1,2]
   let arrayIntegers2 = arrayIntegers.slice(2, 3); // returns [3]
   let arrayIntegers3 = arrayIntegers.slice(4); //returns [5]
```

**Note:** Slice method won't mutate the original array but it returns the subset as a new array.

  

## What is the purpose of the array splice method

The **splice()** method is used either adds/removes items to/from an array, and then returns the removed item. The first argument specifies the array position for insertion or deletion whereas the optional second argument indicates the number of elements to be deleted. Each additional argument is added to the array.

   Some of the examples of this method are,

   ```javascript
   let arrayIntegersOriginal1 = [1, 2, 3, 4, 5];
   let arrayIntegersOriginal2 = [1, 2, 3, 4, 5];
   let arrayIntegersOriginal3 = [1, 2, 3, 4, 5];

   let arrayIntegers1 = arrayIntegersOriginal1.splice(0, 2); // returns [1, 2]; original array: [3, 4, 5]
   let arrayIntegers2 = arrayIntegersOriginal2.splice(3); // returns [4, 5]; original array: [1, 2, 3]
   let arrayIntegers3 = arrayIntegersOriginal3.splice(3, 1, "a", "b", "c"); //returns [4]; original array: [1, 2, 3, "a", "b", "c", 5]
   ```

   **Note:** Splice method modifies the original array too and returns the deleted array.

  

## What is the difference between slice and splice

Some of the major difference in a tabular form

| Slice                                        | Splice                                          |
| -------------------------------------------- | ----------------------------------------------- |
| Doesn't modify the original array(immutable) | Modifies the original array(mutable)            |
| Returns the subset of original array         | Returns the deleted elements as array           |
| Used to pick the elements from array         | Used to insert or delete elements to/from array |

  

# How do you compare Object and Map

**Objects** are similar to **Maps** in that both let you set keys to values, retrieve those values, delete keys, and detect whether something is stored at a key. Due to this reason, Objects have been used as Maps historically. But there are important differences that make using a Map preferable in certain cases.

1. The keys of an Object are Strings and Symbols, whereas they can be any value for a Map, including functions, objects, and any primitive.
2. The keys in Map are ordered while keys added to Object are not. Thus, when iterating over it, a Map object returns keys in order of insertion.
3. You can get the size of a Map easily with the size property, while the number of properties in an Object must be determined manually.
4. A Map is an iterable and can thus be directly iterated, whereas iterating over an Object requires obtaining its keys in some fashion iterating over them.
5. An Object has a prototype, so there are default keys in the map that could collide with your keys if you're not careful. As of ES5 this can bypassed by using map = Object.create(null), but this is seldom done.
6. A Map may perform better in scenarios involving frequent addition and removal of key pairs.

  

# What is the difference between == and === operators

JavaScript provides both strict(===, !==) and type-converting(==, !=) equality comparison. The strict operators take type of variable in consideration, while non-strict operators make type correction/conversion based upon values of variables. The strict operators follow the below conditions for different types,

1. Two strings are strictly equal when they have the same sequence of characters, same length, and same characters in corresponding positions.
2. Two numbers are strictly equal when they are numerically equal. i.e, Having the same number value.
      There are two special cases in this,
1. NaN is not equal to anything, including NaN.
2. Positive and negative zeros are equal to one another.
3. Two Boolean operands are strictly equal if both are true or both are false.


Some of the example which covers the above cases,

```javascript
0 == false   // true
0 === false  // false
1 == "1"     // true
1 === "1"    // false
null == undefined // true
null === undefined // false
'0' == false // true
'0' === false // false
[]==[] or []===[] //false, refer different objects in memory
{}=={} or {}==={} //false, refer different objects in memory
```

   

# What is memoization

Memoization in javascript is an optimization technique, to reduce the complexity of the application, runtime of the application, and proper utilization of resources (Time and Memory). The process consists of using an extra space (cache) for the reduction of expensive function calls (a function that recursively calls itself and it has some overlapping problem). By using memoization, we store the values that were calculated in the previously called subproblems. Then if the same subproblem is raised, we again use the stored value which reduces the time complexity as it removes the extra effort to calculate again and again for the same problem.
    

## How Does Memoization Work?

JavaScript Memoization mainly depends on two concepts:

- Closure
- High-order function

## Closure

The Closure is a combination of a function enclosed with its references to the state. A closure allows you access to an outer function's scope from an inner function. In javascript, at the time of function creation, the closure is generated.

## High Order Function

A higher-order function is a type of function that operates on other functions, they either take other functions as arguments or returns them.

## Importance of Memoization

- Memoization in javascript is an optimization technique that stores the results of function calls in a temporary data structure and then retrieves the results whenever the stored result is needed in the program. By doing this, the execution time is reduced and the CPU performance is increased

- Using Javascript Memoization we can reduce the time complexity of an application and by which the response time of the webpage will decreases (for eg. API call)


## When to Use Memoization?

- When the function is calling itself. i.e. for the recursive functions.
- When the function is pure (a function that returns the same value every time it is called). As if the value is different in each function call, then there will not be any use in storing such value. So, we can't use memoization in javascript when the function is impure.
- When the function is very complex in time(Heavy computation function). In this case, storing the results in a cache will increase the performance by reducing the time complexity, as re-computation for functions will not be performed.

   


   

   

# What is a service worker

A Service worker is basically a script (JavaScript file) that runs in the background, separate from a web page and provides features that don't need a web page or user interaction. Some of the major features of service workers are Rich offline experiences(offline first web application development), periodic background syncs, push notifications, intercept and handle network requests and programmatically managing a cache of responses.

   

# How do you manipulate DOM using a service worker

Service worker can't access the DOM directly. But it can communicate with the pages it controls by responding to messages sent via the `postMessage` interface, and those pages can manipulate the DOM.

   

# How do you reuse information across service worker restarts

The problem with service worker is that it gets terminated when not in use, and restarted when it's next needed, so you cannot rely on global state within a service worker's `onfetch` and `onmessage` handlers. In this case, service workers will have access to IndexedDB API in order to persist and reuse across restarts.


# How do I modify the url without reloading the page

The `window.location.href` property will be helpful to modify the url but it reloads the page. HTML5 introduced the `history.pushState()` and `history.replaceState()` methods, which allow you to add and modify history entries, respectively. For example, you can use pushState as below,

```javascript
window.history.pushState("page2", "Title", "/page2.html");
```

    

# How do you check whether an array includes a particular value or not

The `includes()` method is used to determine whether an array includes particular value among its entries by returning either true or false.

```javascript
var numericArray = [1, 2, 3, 4];
console.log(numericArray.includes(3)); // true
var stringArray = ["green", "yellow", "blue"];
console.log(stringArray.includes("blue")); //true
```

    

# How do you compare scalar arrays

You can use length and every method of arrays to compare two scalar(compared directly using ===) arrays. The combination of these expressions can give the expected result,

```javascript
const arrayFirst = [1, 2, 3, 4, 5];
const arraySecond = [1, 2, 3, 4, 5];
console.log(
  arrayFirst.length === arraySecond.length &&
    arrayFirst.every((value, index) => value === arraySecond[index])
); // true
```

If you would like to compare arrays irrespective of order then you should sort them before,

```javascript
const arrayFirst = [2, 3, 1, 4, 5];
const arraySecond = [1, 2, 3, 4, 5];
console.log(
  arrayFirst.length === arraySecond.length &&
    arrayFirst.sort().every((value, index) => value === arraySecond[index])
); //true
```

    

# How to get the value from get parameters

The `new URL()` object accepts the url string and `searchParams` property of this object can be used to access the get parameters. Remember that you may need to use polyfill or `window.location` to access the URL in older browsers(including IE).

- We get all params by using `url.searchParams`
- We get specific params by using `url.searchParams.get("paramName")`



```javascript
let urlString = "https://www.tamaldas.com?by-date=yes&sort=true"; 
let url = new URL(urlString);

let parameter = url.searchParams;
let parameterByName = url.searchParams.get("sort");

console.log(parameter); 
```

OUTPUT

```bash

URL 
{
  href: 'https://www.tamaldas.com/?by-date=yes&sort=true',
  origin: 'https://www.tamaldas.com',
  protocol: 'https:',
  username: '',
  password: '',
  host: 'www.tamaldas.com',
  hostname: 'www.tamaldas.com',
  port: '',
  pathname: '/',
  search: '?by-date=yes&sort=true',
  searchParams: URLSearchParams { 'by-date' => 'yes', 'sort' => 'true' },
  hash: ''
}

URLSearchParams { 'by-date' => 'yes', 'sort' => 'true' }

```
    

# What is the `toLocaleString()` method ? 

The `toLocaleString()` method returns a string with a language-sensitive representation of this date. The new locales and options arguments let applications specify the language whose formatting conventions should be used and allow to customize the behavior of the function. In older implementations, which ignore the locales and options arguments, the locale used and the form of the string returned are entirely implementation dependent.

```javascript

const d = new Date();
let text = d.toLocaleString();

console.log(d); // 2023-07-18T17:35:09.632Z
console.log(text); // 7/18/2023, 5:34:55 PM


```


    

# What is the difference between java and javascript

| Feature     | Java                           | JavaScript                        |
| ----------- | ------------------------------ | --------------------------------- |
| Typed       | It's a strongly typed language | It's a dynamically typed language |
| Paradigm    | Object-oriented programming    | Prototype-based programming       |
| Scoping     | Block scoped                   | Function-scoped                   |
| Concurrency | Thread-based                   | Event-based                       |
| Memory      | Uses more memory               | Uses less memory                  |

    

    

# What are the different methods to find HTML elements in DOM

If you want to access any element in an HTML page, you need to start with accessing the document object. Later you can use any of the below methods to find the HTML element,

1. document.getElementById(id): It finds an element by Id
2. document.getElementsByTagName(name): It finds an element by tag name
3. document.getElementsByClassName(name): It finds an element by class name

    

# What is jQuery

jQuery is a popular cross-browser JavaScript library that provides Document Object Model (DOM) traversal, event handling, animations and AJAX interactions by minimizing the discrepancies across browsers. 

```javascript
$(document).ready(function () {
  // It selects the document and apply the function on page load
  alert("Welcome to jQuery world");
});
```
    

# Why do we call javascript as dynamic language

JavaScript is a loosely typed or a dynamic language because variables in JavaScript are not directly associated with any particular value type, and any variable can be assigned/reassigned with values of all types.

```javascript
let age = 50; // age is a number now
age = "old"; // age is a string now
age = true; // age is a boolean
```

    

# What is a void operator

The `void` operator evaluates the given expression and then returns undefined(i.e, without returning value). The syntax would be as below,

```javascript
void expression;
void expression;
```

Let's display a message without any redirection or reload

```javascript
<a href="javascript:void(alert('Welcome to JS world'))">
  Click here to see a message
</a>
```

    

# How do you create an infinite loop

You can create infinite loops using for and while loops without using any expressions. The for loop construct or syntax is better approach in terms of ESLint and code optimizer tools,

```javascript
for (;;) {}
while (true) {}
``` 

# What is ES6

ES6 is the sixth edition of the javascript language and it was released in June 2015. It was initially known as ECMAScript 6 (ES6) and later renamed to ECMAScript 2015. Almost all the modern browsers support ES6 but for the old browsers there are many transpilers, like Babel.js etc.

# List down some of the features of ES6

Below are the list of some new features of ES6,

1. Support for constants or immutable variables
2. Block-scope support for variables, constants and functions
3. Arrow functions
4. Default parameters
5. Rest and Spread Parameters
6. Template Literals
7. Multi-line Strings
8. Destructuring Assignment
9. Enhanced Object Literals
10. Promises
11. Classes
12. Modules

    



    




    

# What is destructuring assignment

The destructuring assignment is a JavaScript expression that makes it possible to unpack values from arrays or properties from objects into distinct variables.
    

```javascript
var [one, two, three] = ["JAN", "FEB", "MARCH"];

console.log(one); // "JAN"
console.log(two); // "FEB"
console.log(three); // "MARCH"
```

and you can get user properties of an object using destructuring assignment,

```javascript
var { name, age } = { name: "John", age: 32 };

console.log(name); // John
console.log(age); // 32
```

    

# What are default values in destructuring assignment

A variable can be assigned a default value when the value unpacked from the array or object is undefined during destructuring assignment. It helps to avoid setting default values separately for each assignment. Let's take an example for both arrays and object use cases,

**Arrays destructuring:**

```javascript
var x, y, z;

[x = 2, y = 4, z = 6] = [10];
console.log(x); // 10
console.log(y); // 4
console.log(z); // 6
```

**Objects destructuring:**

```javascript
var { x = 2, y = 4, z = 6 } = { x: 10 };

console.log(x); // 10
console.log(y); // 4
console.log(z); // 6
```

    

# How do you swap variables in destructuring assignment

If you don't use destructuring assignment, swapping two values requires a temporary variable. Whereas using a destructuring feature, two variable values can be swapped in one destructuring expression. Let's swap two number variables in array destructuring assignment,

```javascript
var x = 10,
y = 20;

[x, y] = [y, x];
console.log(x); // 20
console.log(y); // 10
```


    

# What are dynamic importss

The dynamic imports using `import()` function syntax allows us to load modules on demand by using promises or the async/await syntax. Currently this feature is in [stage4 proposal](https://github.com/tc39/proposal-dynamic-import). The main advantage of dynamic imports is reduction of our bundle's sizes, the size/payload response of our requests and overall improvements in the user experience.
     The syntax of dynamic imports would be as below,

```javascript
import("./Module").then((Module) => Module.method());
```

# What is collation

Collation is used for sorting a set of strings and searching within a set of strings. It is parameterized by locale and aware of Unicode. Let's take comparison and sorting features,

1. **Comparison:**

 ```javascript
 var list = ["ä", "a", "z"]; // In German,  "ä" sorts with "a" Whereas Swedish, "ä" sorts after "z"
 var l10nDE = new Intl.Collator("de");
 var l10nSV = new Intl.Collator("sv");
 console.log(l10nDE.compare("ä", "z") === -1); // true
 console.log(l10nSV.compare("ä", "z") === +1); // true
 ```

2. **Sorting:**

```javascript
var list = ["ä", "a", "z"]; // In German,  "ä" sorts with "a" Swedish, "ä" sorts after "z"
var l10nDE = new Intl.Collator("de");
var l10nSV = new Intl.Collator("sv");
console.log(list.sort(l10nDE.compare)); // [ "a", "ä", "z" ]
console.log(list.sort(l10nSV.compare)); // [ "a", "z", "ä" ]
```

# What is for...of statement

The for...of statement creates a loop iterating over iterable objects or elements such as built-in String, Array, Array-like objects (like arguments or NodeList), TypedArray, Map, Set, and user-defined iterables. The basic usage of for...of statement on arrays would be as below,

```javascript
let arrayIterable = [10, 20, 30, 40, 50];

for (let value of arrayIterable) {
  value++;
  console.log(value); // 11 21 31 41 51
}
```

# What is the output of below spread operator array

     ```javascript
     [..."John Resig"];
     ```

     The output of the array is ['J', 'o', 'h', 'n', '', 'R', 'e', 's', 'i', 'g']
     **Explanation:** The string is an iterable type and the spread operator within an array maps every character of an iterable to one element. Hence, each character of a string becomes an element within an Array.


# Is JavaScript faster than server side script

Yes, JavaScript is faster than server side scripts. Because JavaScript is a client-side script it does not require any web server’s help for its computation or calculation. So JavaScript is always faster than any server-side script like ASP, PHP, etc.



1.   # How do you combine two or more arrays

     The concat() method is used to join two or more arrays by returning a new array containing all the elements. The syntax would be as below,

     ```javascript
     array1.concat(array2, array3, ..., arrayX)
     ```

     Let's take an example of array's concatenation with veggies and fruits arrays,

     ```javascript
     var veggies = ["Tomato", "Carrot", "Cabbage"];
     var fruits = ["Apple", "Orange", "Pears"];
     var veggiesAndFruits = veggies.concat(fruits);
     console.log(veggiesAndFruits); // Tomato, Carrot, Cabbage, Apple, Orange, Pears
     ```

# What is the difference between Shallow and Deep copy

There are two ways to copy an object,

**Shallow Copy:**
Shallow copy is a bitwise copy of an object. A new object is created that an exact copy of the values in the original object. If any of the fields of object are references to other objects, just the reference addresses are i.e., only the memory address is copied.

    

```javascript
var empDetails = {
  name: "John",
  age: 25,
  expertise: "Software Developer",
};
```

to create a duplicate

```javascript
var empDetailsShallowCopy = empDetails; //Shallow copying!
```

if we change some property value in the duplicate one like this:

```javascript
empDetailsShallowCopy.name = "Johnson";
```

The above statement will also change the name of `empDetails`, since we have a shallow copy. That means we're losing the original data as well.

**Deep copy:**
A deep copy copies all fields, and makes copies of dynamically allocated memory pointed to by the fields. A deep copy occurs when an object is copied along with the objects to which it refers.

    

```javascript
 var empDetails = {
   name: "John",
   age: 25,
   expertise: "Software Developer",
 };
```

Create a deep copy by using the properties from the original object into new variable

```javascript
var empDetailsDeepCopy = {
  name: empDetails.name,
  age: empDetails.age,
  expertise: empDetails.expertise,
};
```

Now if you change `empDetailsDeepCopy.name`, it will only affect `empDetailsDeepCopy` & not `empDetails`



# How do you trim a string at the beginning or ending

The `trim` method of string prototype is used to trim on both sides of a string. But if you want to trim especially at the beginning or ending of the string then you can use `trimStart/trimLeft` and `trimEnd/trimRight` methods. Let's see an example of these methods on a greeting message,

```javascript
var greeting = "   Hello, Goodmorning!   ";

console.log(greeting); // "   Hello, Goodmorning!   "
console.log(greeting.trimStart()); // "Hello, Goodmorning!   "
console.log(greeting.trimLeft()); // "Hello, Goodmorning!   "

console.log(greeting.trimEnd()); // "   Hello, Goodmorning!"
console.log(greeting.trimRight()); // "   Hello, Goodmorning!"
```


# What is a thunk function

A thunk is just a function which delays the evaluation of the value. It doesn’t take any arguments but gives the value whenever you invoke the thunk. i.e, It is used not to execute now but it will be sometime in the future. Let's take a synchronous example,

```javascript
const add = (x, y) => x + y;

const thunk = () => add(2, 3);

thunk(); // 5
```

# What are asynchronous thunks

The asynchronous thunks are useful to make network requests. Let's see an example of network requests,

```javascript
function fetchData(fn) {
  fetch("https://jsonplaceholder.typicode.com/todos/1")
    .then((response) => response.json())
    .then((json) => fn(json));
}

const asyncThunk = function () {
  return fetchData(function getData(data) {
    console.log(data);
  });
};

asyncThunk();
```

The `getData` function won't be called immediately but it will be invoked only when the data is available from API endpoint. The setTimeout function is also used to make our code asynchronous. The best real time example is redux state management library which uses the asynchronous thunks to delay the actions to dispatch.




# What happens with negating an array

Negating an array with `!` character will coerce the array into a boolean. Since Arrays are considered to be truthy So negating it will return `false`.

```javascript
console.log(![]); // false
```

# What happens if we add two arrays

If you add two arrays together, it will convert them both to strings and concatenate them. For example, the result of adding arrays would be as below,

```javascript
console.log(["a"] + ["b"]); // "ab"
console.log([] + []); // ""
console.log(![] + []); // "false", because ![] returns false.
```



# How do you remove falsy values from an array

You can apply the filter method on the array by passing Boolean as a parameter. This way it removes all falsy values(0, undefined, null, false and "") from the array.

```javascript
const myArray = [false, null, 1, 5, undefined];
myArray.filter(Boolean); // [1, 5] // is same as myArray.filter(x => x);
```

# How do you get unique values of an array

You can get unique values of an array with the combination of `Set` and rest expression/spread(...) syntax.

```javascript
console.log([...new Set([1, 2, 4, 4, 3])]); // [1, 2, 4, 3]
```



# How do you map the array values without using map method

You can map the array values without using the `map` method by just using the `from` method of Array. Let's map city names from Countries array,

```javascript
const countries = [
  { name: "India", capital: "Delhi" },
  { name: "US", capital: "Washington" },
  { name: "Russia", capital: "Moscow" },
  { name: "Singapore", capital: "Singapore" },
  { name: "China", capital: "Beijing" },
  { name: "France", capital: "Paris" },
];

const cityNames = Array.from(countries, ({ capital }) => capital);
console.log(cityNames); // ['Delhi, 'Washington', 'Moscow', 'Singapore'Beijing', 'Paris']

```




# How do you rounding numbers to certain decimals

You can round numbers to a certain number of decimals using `toFixed` method from native javascript.

```javascript
let pie = 3.141592653;
pie = pie.toFixed(3); // 3.142
```

# What is the easiest way to convert an array to an object

You can convert an array to an object with the same data using spread(...) operator.

```javascript
var fruits = ["banana", "apple", "orange", "watermelon"];
var fruitsObject = { ...fruits };
console.log(fruitsObject); // {0: "banana", 1: "apple", 2: "orange", 3"watermelon"}
```

# How do you create an array with some data

You can create an array with some data or an array with the same values using `fill` method.

```javascript
var newArray = new Array(5).fill("0");
console.log(newArray); // ["0", "0", "0", "0", "0"]
```

# What are the placeholders from console object

Below are the list of placeholders available from console object,

1. %o — It takes an object,
2. %s — It takes a string,
3. %d — It is used for a decimal or integer


```javascript
const user = { name: "John", id: 1, city: "Delhi" };
console.log(
  "Hello %s, your details %o are available in the object form",
  "John",
  user
); // Hello John, your details {name: "John", id: 1, city: "Delhi"} available in object
```

# Is it possible to add CSS to console messages

Yes, you can apply CSS styles to console messages similar to html text on the web page.

```javascript
console.log(
  "%c The text has blue color, with large font and red background",
  "color: blue; font-size: x-large; background: red"
);
```


# What is the purpose of dir method of console object

The `console.dir()` is used to display an interactive list of the properties of the specified JavaScript object as JSON.

```javascript
const user = { name: "John", id: 1, city: "Delhi" };
console.dir(user);
```

# Is it possible to debug HTML elements in console

Yes, it is possible to get and debug HTML elements in the console just like inspecting elements.

```javascript
const element = document.getElementsByTagName("body")[0];
console.log(element);
```

# How do you display data in a tabular format using console object

The `console.table()` is used to display data in the console in a tabular format to visualize complex arrays or objects.

```js
const users = [
  { name: "John", id: 1, city: "Delhi" },
  { name: "Max", id: 2, city: "London" },
  { name: "Rod", id: 3, city: "Paris" },
];
console.table(users);
```


# How do you verify that an argument is a Number or not

The combination of IsNaN and isFinite methods are used to confirm whether an argument is a number or not.

```javascript
function isNumber(n) {
  return !isNaN(parseFloat(n)) && isFinite(n);
}
```

