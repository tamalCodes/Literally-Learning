<!-- TOC -->

- [How do you list all properties of an object](#how-do-you-list-all-properties-of-an-object)
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
- [Can I redeclare let and const variables](#can-i-redeclare-let-and-const-variables)
- [Is const variable makes the value immutable](#is-const-variable-makes-the-value-immutable)
- [What is destructuring assignment](#what-is-destructuring-assignment)
- [What are default values in destructuring assignment](#what-are-default-values-in-destructuring-assignment)
- [How do you swap variables in destructuring assignment](#how-do-you-swap-variables-in-destructuring-assignment)
- [What are dynamic importss](#what-are-dynamic-importss)

<!-- /TOC -->



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

| Feature   | Java                            | JavaScript                         |
|-----------|---------------------------------|------------------------------------|
| Typed     | It's a strongly typed language  | It's a dynamically typed language   |
| Paradigm  | Object-oriented programming    | Prototype-based programming        |
| Scoping   | Block scoped                    | Function-scoped                    |
| Concurrency | Thread-based                  | Event-based                        |
| Memory    | Uses more memory                | Uses less memory                   |

    

    

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

    



    

# Can I redeclare let and const variables

No, you cannot redeclare let and const variables. If you do, it throws below error

 ```bash
 Uncaught SyntaxError: Identifier 'someVariable' has already been declared
 ```

**Explanation:** The variable declaration with `var` keyword refers to a function scope and the variable is treated as if it were declared at the top of the enclosing scope due to hoisting feature. So all the multiple declarations contributing to the same hoisted variable without any error. Let's take an example of re-declaring variables in the same scope for both var and let/const variables.

```javascript
var name = "John";
function myFunc() {
  var name = "Nick";
  var name = "Abraham"; // Re-assigned in the same function block
  alert(name); // Abraham
}
myFunc();
alert(name); // John
```

The block-scoped multi-declaration throws syntax error,

```javascript
let name = "John";
function myFunc() {
  let name = "Nick";
  let name = "Abraham"; // Uncaught SyntaxError: Identifier 'name' has been declared
  alert(name);
}

myFunc();
alert(name);
```

    

# Is const variable makes the value immutable

No, the const variable doesn't make the value immutable. But it disallows subsequent assignments(i.e, You can declare with assignment but can't assign another value later)

 ```javascript
 const userList = [];
 userList.push("John"); // Can mutate even though it can't re-assign
 console.log(userList); // ['John']
 ```


    

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