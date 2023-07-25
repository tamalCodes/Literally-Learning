<!-- TOC -->

- [How do you flatten multi dimensional arrays](#how-do-you-flatten-multi-dimensional-arrays)
- [What is the easiest multi condition checking](#what-is-the-easiest-multi-condition-checking)
- [How do you capture browser back button](#how-do-you-capture-browser-back-button)
- [How do you disable right click in the web page](#how-do-you-disable-right-click-in-the-web-page)
- [What are wrapper objects](#what-are-wrapper-objects)
- [What is AJAX](#what-is-ajax)
- [What is the difference between shim and polyfill](#what-is-the-difference-between-shim-and-polyfill)
- [What is babel](#what-is-babel)
- [Is Node.js completely single threaded](#is-nodejs-completely-single-threaded)
- [What is the easiest way to resize an array](#what-is-the-easiest-way-to-resize-an-array)
- [What are the differences between arguments object and rest parameter](#what-are-the-differences-between-arguments-object-and-rest-parameter)
- [What are the differences between spread operator and rest parameter](#what-are-the-differences-between-spread-operator-and-rest-parameter)

<!-- /TOC -->

# How do you flatten multi dimensional arrays

Flattening bi-dimensional arrays is trivial with Spread operator.

```javascript
const biDimensionalArr = [11, [22, 33], [44, 55], [66, 77], 88, 99];
const flattenArr = [].concat(...biDimensionalArr); // [11, 22, 33, 44, 55, 6677, 88, 99]
```

But you can make it work with multi-dimensional arrays by recursive calls,

```javascript
function flattenMultiArray(arr) {
  const flattened = [].concat(...arr);
  return flattened.some((item) => Array.isArray(item))
    ? flattenMultiArray(flattened)
    : flattened;
}
const multiDimensionalArr = [11, [22, 33], [44, [55, 66, [77, [88]], 99]]];
const flatArr = flattenMultiArray(multiDimensionalArr); // [11, 22, 33, 44, 66, 77, 88, 99]
```
     
Also you can use the `flat` method of Array.
     
```javascript
const arr = [1, [2,3], 4, 5, [6,7]];
const fllattenArr = arr.flat(); // [1, 2, 3, 4, 5, 6, 7]
     
// And for multiDemensional arrays
const multiDimensionalArr = [11, [22, 33], [44, [55, 66, [77, [88]], 99]]];
const oneStepFlat = multiDimensionalArr.flat(1); // [11, 22, 33, 44, [55, 66, [77, [88]], 99]]
const towStep = multiDimensionalArr.flat(2); // [11, 22, 33, 44, 55, 66, [77, [88]], 99]
const fullyFlatArray = multiDimensionalArr.flat(Infinity); // [11, 22, 33, 44, 55, 66, 77, 88, 99]
```

    

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

 

# What is the easiest way to resize an array

The length property of an array is useful to resize or empty an array quickly. Let's apply length property on number array to resize the number of elements from 5 to 2,

```javascript
var array = [1, 2, 3, 4, 5];
console.log(array.length); // 5

array.length = 2;
console.log(array.length); // 2
console.log(array); // [1,2]
```

and the array can be emptied too

```javascript
var array = [1, 2, 3, 4, 5];
array.length = 0;
console.log(array.length); // 0
console.log(array); // []
```

# What are the differences between arguments object and rest parameter

There are three main differences between arguments object and rest parameters

1. The arguments object is an array-like but not an array. Whereas the rest parameters are array instances.
2. The arguments object does not support methods such as sort, map, forEach, or pop. Whereas these methods can be used in rest parameters.
3. The rest parameters are only the ones that haven’t been given a separate name, while the arguments object contains all arguments passed to the function

# What are the differences between spread operator and rest parameter

Rest parameter collects all remaining elements into an array. Whereas Spread operator allows iterables( arrays / objects / strings ) to be expanded into single arguments/elements. i.e, Rest parameter is opposite to the spread operator.