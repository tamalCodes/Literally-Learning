<!-- TOC -->

- [Types of variables in JS](#types-of-variables-in-js)
  - [Difference between let and var](#difference-between-let-and-var)
- [What is hoisting ?](#what-is-hoisting-)
- [What is a promise ?](#what-is-a-promise-)
  - [How to use a promise, in terms of an API ?](#how-to-use-a-promise-in-terms-of-an-api-)
  - [What are `.then` and `.catch` ?](#what-are-then-and-catch-)
- [What is async/await ?](#what-is-asyncawait-)
  - [Difference between promise and async/await](#difference-between-promise-and-asyncawait)
- [How browsers work](#how-browsers-work)
- [Are props immutable, if so , then why ?](#are-props-immutable-if-so--then-why-)
- [Now forget react, if we want to change props like mutate regardless of the state in parent, how can we do it , let's say in Js ?](#now-forget-react-if-we-want-to-change-props-like-mutate-regardless-of-the-state-in-parent-how-can-we-do-it--lets-say-in-js-)
- [Are objects passed by reference or by value ?](#are-objects-passed-by-reference-or-by-value-)
- [What is the difference between a controlled and uncontrolled component ?](#what-is-the-difference-between-a-controlled-and-uncontrolled-component-)
- [What is lazy loading (in depth) ?](#what-is-lazy-loading-in-depth-)
- [What is DOM ?](#what-is-dom-)
  - [Virtual DOM in react](#virtual-dom-in-react)
- [Hooks in react](#hooks-in-react)
  - [useRef hook](#useref-hook)
  - [What is the difference between useRef and useState ?](#what-is-the-difference-between-useref-and-usestate-)
  - [Explain useMemo and why it is used ?](#explain-usememo-and-why-it-is-used-)
  - [Explain useCallback and why it is used ?](#explain-usecallback-and-why-it-is-used-)
- [useReducer Hook](#usereducer-hook)

<!-- /TOC -->
# Types of variables in JS

- Const : Constant variables. Cannot be changed once declared.
- Let : Block scoped variables. Can be changed once declared.
- Var : Function scoped variables. Can be changed once declared.

## Difference between let and var

Var is function scoped and let is block scoped. This means that a variable declared with the var keyword can be accessed anywhere within the function containing it. On the other hand, a variable declared with the let keyword can be accessed only within the block in which it is defined.

```js
function myFunction() {
  var myVar = "Hello";
  let myLet = "World";

  console.log(myVar); // "Hello"
  console.log(myLet); // "World"
}

console.log(myVar); // ReferenceError: myVar is not defined

console.log(myLet); // ReferenceError: myLet is not defined
```

In this example, the myVar variable is declared using the var keyword, so it can be accessed anywhere within the myFunction() function. On the other hand, the myLet variable is declared using the let keyword, so it can only be accessed within the block in which it is defined.

# What is hoisting ?

Hoisting is a JavaScript mechanism where variables and function declarations are moved to the top of their scope before code execution. This means that if a variable is declared anywhere in a function, it is moved to the top of the function for execution regardless of whether the declaration is at the top of the function or not.

```js

function myFunction() {
  console.log(myVar); // undefined
  var myVar = "Hello";
  console.log(myVar); // "Hello"
}

myFunction();
```

In this example, the myVar variable is declared after the first console.log() statement, but it is still accessible within the function. This is because the declaration is hoisted to the top of the function before execution.

**Why does hoisting exist ?**

Hoisting exists in JavaScript because it is a compiled language. This means that before JavaScript code is executed, it is first compiled into a format that is more suitable for execution. During this compilation process, variable and function declarations are moved to the top of their scope. This allows variables and functions to be used before they are declared.

# What is a promise ?

A Promise is a proxy for a value not necessarily known when the promise is created. It allows you to associate handlers with an asynchronous action's eventual success value or failure reason. This lets asynchronous methods return values like synchronous methods: instead of immediately returning the final value, the asynchronous method returns a promise to supply the value at some point in the future.

A promise can be in one of three states:

- Pending: The initial state of a promise. It represents an operation that has not yet completed, and the promise is neither fulfilled nor rejected.

- Fulfilled: The state of a promise representing a successful operation. This is the state set when the promise's resolve() function is called.

- Rejected: The state of a promise representing a failed operation. This is the state set when the promise's reject() function is called.

## How to use a promise, in terms of an API ?

```js

const myPromise = new Promise((resolve, reject) => {
  setTimeout(() => {
    resolve("foo");
  }, 300);
});

myPromise
  .then(handleFulfilledA, handleRejectedA)
  .then(handleFulfilledB, handleRejectedB)
  .then(handleFulfilledC, handleRejectedC);



```
## What are `.then` and `.catch` ?

The then() method returns a Promise. It takes up to two arguments: callback functions for the success and failure cases of the Promise.

Example:

```js

fetch('flowers.jpg')
.then(function(response) {
  if (!response.ok) {
    throw new Error('HTTP error, status = ' + response.status);
  }
  return response.blob();
})

```

The catch() method returns a Promise and deals with rejected cases only. It behaves the same as calling Promise.prototype.then(undefined, onRejected) (in fact, calling obj.catch(onRejected) internally calls obj.then(undefined, onRejected)).

Example:

```js

fetch('flowers.jpg')
.then(function(response) {
  if (!response.ok) {
    throw new Error('HTTP error, status = ' + response.status);
  }
  return response.blob();
})
.catch(function(error) {
  console.log(error);
})

```

# What is async/await ?

The async function declaration defines an asynchronous function, which returns an AsyncFunction object. An asynchronous function is a function which operates asynchronously via the event loop, using an implicit Promise to return its result. But the syntax and structure of your code using async functions is much more like using standard synchronous functions.

The await operator is used to wait for a Promise. It can only be used inside an async function.

The await expression causes async function execution to pause until a Promise is settled (that is, fulfilled or rejected), and to resume execution of the async function after fulfillment. When resumed, the value of the await expression is that of the fulfilled Promise.

## Difference between promise and async/await

The async/await syntax is built on top of promises. It cannot be used with plain callbacks or node callbacks. Async/await is actually just syntax sugar built on top of promises. It cannot be used with plain callbacks or node callbacks. Async/await is actually just syntax sugar built on top of promises, so it can only be used with functions that return promises. The async/await syntax allows you to write asynchronous code that reads similarly to synchronous code.

```js

async function myFunction() {
  try {
    const value = await promise;
    console.log(value);
  } catch (error) {
    console.log(error);
  }
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

# Are props immutable, if so , then why ? 

In React, props are typically passed down from parent components to child components, and they are considered immutable. This means that the value of a prop passed to a component cannot be changed by that component.

The reason for this immutability is that it helps to ensure that the flow of data within a React application is predictable and easy to reason about. When a parent component passes a prop to a child component, it can be confident that the value of that prop will not change unexpectedly. This makes it easier to understand how changes in the parent component can affect the child components.

Additionally, immutability can help to optimize performance in React applications. When a component receives a new prop, React can quickly determine whether the component needs to be re-rendered based on the new value of the prop. If the prop is mutable, React would need to perform additional checks to determine whether the value has actually changed, which could be more computationally expensive.

Overall, the immutability of props in React is an important design decision that helps to ensure the predictability and performance of React applications.

# Now forget react, if we want to change props like mutate regardless of the state in parent, how can we do it , let's say in Js ? 

In JavaScript, objects are mutable by default, including objects passed as props. This means that if a component receives an object as a prop, it can modify that object directly. However, this is generally not recommended, as it can make the flow of data within the application more difficult to reason about.

If you need to change a prop value in a way that does not affect the parent state, you can create a copy of the object and modify the copy instead of the original. This can be achieved using various techniques such as the spread operator or the Object.assign() method.

```js
function MyComponent(props) {
  const modifiedProps = { ...props, someProp: "new value" };
  // use modifiedProps in the component
}
```

In this example, a new object is created using the spread operator, with all the properties of the original props object and a new value for the someProp property.

It's important to note that while this approach can work in some cases, it can still make the flow of data more difficult to reason about. It's generally recommended to keep props immutable and rely on state management techniques such as React state or Redux for managing component state.

# Are objects passed by reference or by value ?

In JavaScript, objects are passed by reference. This means that when an object is passed to a function, the function receives a reference to the object, rather than a copy of the object.

This means that if the function modifies the object, the changes will be visible outside of the function. For example:

```js
const myObject = { name: "John" };

function modifyObject(obj) {
  obj.name = "Jane";
}

modifyObject(myObject);

console.log(myObject.name); // "Jane"
```

In this example, the modifyObject() function receives a reference to the myObject object. When the function modifies the name property of the object, the change is visible outside of the function.



# What is the difference between a controlled and uncontrolled component ?

In React, a controlled component is a component that manages its own state and renders based on that state. This means that the component's state is updated using the setState() method, and the component's render method is not called directly.

An uncontrolled component, on the other hand, is a component that does not manage its own state. Instead, the component's state is managed by the DOM, and the component's render method is called directly.


# What is lazy loading (in depth) ?

Lazy loading is a technique in web development where we defer loading of non-critical resources until they are needed. This can help to improve the performance of a web page, by reducing the amount of data that needs to be loaded initially, and allowing the page to load faster.

Lazy loading is particularly useful for web pages that have a lot of resources, such as large images, videos, or scripts, that are not needed immediately. By deferring the loading of these resources until they are needed, we can reduce the initial load time of the page, and improve the user experience.

There are several ways to implement lazy loading in web development:

- Lazy loading images: This involves deferring the loading of images until they are needed, such as when the user scrolls down to the part of the page where the image is located. This can be achieved using JavaScript libraries such as LazyLoad, which can automatically detect when an image is in the viewport and load it on demand.

- Lazy loading scripts: This involves deferring the loading of JavaScript files until they are needed, such as when a user interacts with a certain part of the page. This can be achieved using defer or async attributes on the script tag, or by using JavaScript libraries such as LoadJS.

- Lazy loading modules: This involves deferring the loading of JavaScript modules until they are needed, such as when a user navigates to a certain part of the website. This can be achieved using dynamic imports in JavaScript, which allow us to load a module on demand when it is needed.

By implementing lazy loading, we can improve the performance of our web pages and provide a better user experience for our users. However, it's important to be careful not to overdo it, as lazy loading can add complexity to our code and can also have negative effects on SEO if not implemented correctly.

# What is DOM ? 

DOM stands for Document Object Model. It's a programming interface for HTML and XML documents, which provides a structured representation of the document as a tree-like structure. In other words, the DOM is a way for programs to access and manipulate the content and structure of a web page.

When a web page is loaded into a web browser, the browser creates a DOM tree based on the HTML and CSS code in the page. The DOM tree is made up of a series of nodes, each of which represents an element, attribute, or piece of content in the web page.

The DOM provides a set of APIs that allow developers to interact with the web page through the DOM tree. For example, we can use the DOM API to read or modify the content of a web page, add or remove elements from the page, and respond to user interactions like clicks or keystrokes.

## Virtual DOM in react

The Virtual DOM in React is an abstraction of the HTML DOM that is managed by React. It's a lightweight copy of the actual DOM tree, which allows React to keep track of changes to the UI and update the actual DOM only when necessary.

When we use React to build a UI, we don't directly manipulate the actual HTML DOM tree. Instead, we write JSX code that describes the UI components and their relationships to each other. React then uses this JSX code to create a Virtual DOM tree, which is a plain JavaScript object that represents the structure of the UI.

When we make changes to the UI, **React first updates the Virtual DOM tree** by comparing the previous version of the tree to the new version of the tree. This process is known as reconciliation. React then figures out the minimum number of changes required to update the actual DOM to match the new Virtual DOM tree. Finally, React updates the actual DOM with the necessary changes.

**By using the Virtual DOM**, React can optimize the process of updating the UI and avoid unnecessary re-renders of components. Because the Virtual DOM is a lightweight copy of the actual DOM, it's faster to update and manipulate. Additionally, because React only updates the actual DOM when necessary, it can avoid expensive operations like reflow and repaint, which can improve performance.

Overall, the Virtual DOM is a key part of what makes React a high-performance and efficient framework for building UIs.


# Hooks in react
## useRef hook

The useRef hook is a React hook that can be used to create a mutable ref object which will not re-render the components.

It is also used to access the DOM nodes directly.

```js
import React, { useRef } from 'react';

function MyComponent() {
  const ref = useRef();

  return <div ref={ref}>Hello</div>;
}
```

In this example, the useRef hook is used to create a ref object which is assigned to the ref variable. The ref object is then passed to the div element, which allows us to access the DOM node of the div element using the ref.current property.

## What is the difference between useRef and useState ?

The useRef hook is similar to the useState hook, but it does not cause the component to re-render when the ref object is updated.

```js
import React, { useRef, useState } from 'react';

function MyComponent() {
  const [count, setCount] = useState(0);
  const ref = useRef();

  return (
    <div>
      <div ref={ref}>Hello</div>
      <button onClick={() => setCount(count + 1)}>Increment</button>
    </div>
  );
}
```

In this example, the ref object is created using the useRef hook. The ref object is then passed to the div element, which allows us to access the DOM node of the div element using the ref.current property.

The count state is created using the useState hook. When the button is clicked, the count state is updated using the setCount() function, which causes the component to re-render.

## Explain useMemo and why it is used ?

The `useMemo()` hook is a React hook that can be used to memoize the result of a function call. This can be useful when a function call is expensive and the result of the function call needs to be reused.

> Memoization is a technique used to improve performance by caching the result of a function call.


```js
import React, { useMemo } from 'react';

function MyComponent({ value1, value2 }) {
  const result = useMemo(() => {
    console.log('Computing result...');
    return value1 + value2;
  }, [value1, value2]);

  return <div>{result}</div>;
}
```

In this example, the useMemo() hook is used to memoize the result of the addition operation. The result of the addition operation is only recomputed when the value1 or value2 props change.

## Explain useCallback and why it is used ?

In React, `useCallback` is a hook that is used to memoize a function so that it is only re-created when one of its dependencies changes. This is similar to useMemo, but instead of memoizing a value, useCallback memoizes a function.

```js

import React, { useCallback } from 'react';

function MyComponent({ value1, value2 }) {
  const handleClick = useCallback(() => {
    console.log('Clicked!');
  }, [onClick]);

  return <button onClick={handleClick}>Click me</button>;
}
```

In this example, the handleClick function is memoized using useCallback. This means that the function will only be re-created when the onClick prop changes.

# useReducer Hook

useReducer is a hook for state management, much like useState, and relies upon a kind of function called a reducer.

Reducers btw are just pure functions that take the previous state and an action, and return the next state.

useReducer can be used in many of the same ways that useState can, but is more helpful for managing state across multiple components that may involve different operations or "actions".

You will need to reach for useReducer less than useState around your app. But it is very helpful as a powerful means of managing state in smaller applications, rather than having to reach for a third-party state management library like Redux.

```js

import React, { useReducer } from 'react';

function reducer(state, action) {
  switch (action.type) {
    case 'increment':
      return { count: state.count + 1 };
    case 'decrement':
      return { count: state.count - 1 };
    default:
      throw new Error();
  }
}


function Counter({ initialCount }) {
  const [state, dispatch] = useReducer(reducer, { count: initialCount });
  return (
    <>
      Count: {state.count}
      <button onClick={() => dispatch({ type: 'increment' })}>+</button>
      <button onClick={() => dispatch({ type: 'decrement' })}>-</button>
    </>
  );
}
```

In this example, the useReducer hook is used to manage the state of the count variable. The reducer function is passed to the useReducer hook as the first argument, and the initial state is passed as the second argument.