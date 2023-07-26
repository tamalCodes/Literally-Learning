<!-- TOC -->

- [What is the easiest multi condition checking](#what-is-the-easiest-multi-condition-checking)
- [How do you capture browser back button](#how-do-you-capture-browser-back-button)
- [How do you disable right click in the web page](#how-do-you-disable-right-click-in-the-web-page)
- [What are wrapper objects](#what-are-wrapper-objects)
- [What is AJAX](#what-is-ajax)
- [What is the difference between shim and polyfill](#what-is-the-difference-between-shim-and-polyfill)
- [What is babel](#what-is-babel)
- [Is Node.js completely single threaded](#is-nodejs-completely-single-threaded)

<!-- /TOC -->


    

# What is the easiest multi condition checking

You can use `indexOf` to compare input with multiple values instead of checking each value as one condition.

```javascript
// Verbose approach
if (
input === "first" ||
input === 1 ||
input === "second" ||
input === 2
) {
someFunction();
}
// Shortcut
if (["first", 1, "second", 2].indexOf(input) !== -1) {
 someFunction();
}
```

    

# How do you capture browser back button

The `window.onbeforeunload` method is used to capture browser back button events. This is helpful to warn users about losing the current data.

```javascript
window.onbeforeunload = function () {
alert("You work will be lost");
};
```

    

# How do you disable right click in the web page

The right click on the page can be disabled by returning false from the `oncontextmenu` attribute on the body element.

```html
<body oncontextmenu="return false;"></body>
```

    

# What are wrapper objects

Primitive Values like string, number and boolean don't have properties and methods but they are temporarily converted or coerced to an object(Wrapper object) when you try to perform actions on them. For example, if you apply toUpperCase() method on a primitive string value, it does not throw an error but returns uppercase of the string.

```javascript
let name = "john";

console.log(name.toUpperCase());
```


Behind the scenes treated as `console.log(new String(name).toUpperCase());`

i.e, Every primitive except null and undefined have Wrapper Objects and the list of wrapper objects are String,Number,Boolean,Symbol and BigInt.

    

# What is AJAX

AJAX stands for Asynchronous JavaScript and XML and it is a group of related technologies(HTML, CSS, JavaScript, XMLHttpRequest API etc) used to display data asynchronously. i.e. We can send data to the server and get data from the server without reloading the web page.

# What is the difference between shim and polyfill

A shim is a library that brings a new API to an older environment, using only the means of that environment. It isn't necessarily restricted to a web application. For example, es5-shim.js is used to emulate ES5 features on older browsers (mainly pre IE9).
     
Whereas polyfill is a piece of code (or plugin) that provides the technology that you, the developer, expect the browser to provide natively.
     
In a simple sentence, A polyfill is a shim for a browser API.
    

# What is babel

Babel is a JavaScript transpiler to convert ECMAScript 2015+ code into a backwards compatible version of JavaScript in current and older browsers or environments. Some of the main features are listed below,

1. Transform syntax
2. Polyfill features that are missing in your target environment (using @babel/polyfill)
3. Source code transformations (or codemods)

    

# Is Node.js completely single threaded

Node is a single thread, but some of the functions included in the Node.js standard library(e.g, fs module functions) are not single threaded. i.e, Their logic runs outside of the Node.js single thread to improve the speed and performance of a program.

 

