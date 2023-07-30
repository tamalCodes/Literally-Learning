# React & Javascript Questions

### What is Hoisting ?

Hoisting is a behavior in JavaScript where variable and function declarations are moved to the top of their respective scopes during the code execution phase. This means that even if you declare a variable or function later in your code, it behaves as if it was declared at the beginning.

```javascript
console.log(a); // Output: undefined
var a = 5;
```

---

### Define Closure ?

A closure in JavaScript is a powerful and unique feature that allows a function to remember and access its outer (enclosing) scope even after the function has finished executing. It's like a function's "memory" that preserves the environment in which it was created.

```javascript
function outerFunction() {
  let outerVariable = "I'm from the outer function!";

  function innerFunction() {
    console.log(outerVariable);
  }

  return innerFunction; // Return the inner function from the outer function
}

const closureExample = outerFunction(); // closureExample now holds the inner function

closureExample(); // Output: "I'm from the outer function!"
```

---

### What is Currying ?

Currying is a functional programming concept in JavaScript (and other programming languages) that involves transforming a function that takes multiple arguments into a series of functions, each taking a single argument. The currying process allows you to partially apply the arguments and create specialized functions.

```javascript
// Regular function that takes three arguments
function add(a, b, c) {
  return a + b + c;
}

console.log(add(2, 3, 4)); // Output: 9

// Currying the add function
function curryAdd(a) {
  return function (b) {
    return function (c) {
      return a + b + c;
    };
  };
}

// Using the curried function
const curriedAdd = curryAdd(2);

console.log(curriedAdd(3)(4)); // Output: 9
```

---

### Difference between useSelector and useDispatch

<h4>useSelector </h4>

Used to extract data from the Redux store and subscribe to changes in that data. It allows components to access and read data from the store without directly connecting them using `connect` from the older Redux API.

   <br>

<b> Example: </b>

```javascript
import { useSelector } from "react-redux";

const MyComponent = () => {
  const count = useSelector((state) => state.counter); // 'counter' is a property in the Redux store
  // ...
};
```

<h4>useDispatch</h4>

Used to obtain the reference to the Redux store's `dispatch` function, which is responsible for sending actions to the store. It allows components to dispatch actions without having to import the `store` directly or manually create action objects.

   <br>

<b> Example: </b>

```javascript
import { useDispatch } from "react-redux";

const MyComponent = () => {
  const dispatch = useDispatch();

  const handleButtonClick = () => {
    dispatch({ type: "INCREMENT" }); // Dispatching an action to increment the counter
  };

  // ...
};
```

---

### Difference between useMemo and useCallback ?

<h4>useMemo</h4>
   Used to memorize the result of a computation and only recompute it when its dependencies change. It's useful when you have a costly calculation or an expensive function call that you don't want to re-run on every render.
 
   <br>

<b> Example: </b>

```javascript
import { useMemo } from "react";

const MyComponent = ({ data }) => {
  const expensiveResult = useMemo(() => {
    // Expensive computation based on data
    // Only recompute if 'data' changes
    return computeExpensiveValue(data);
  }, [data]);

  // ...
};
```

<h4>useCallback</h4>
    Used to memoize functions, particularly event handlers or any function that is passed down to child components as a prop. It ensures that the function reference remains stable across renders, preventing unnecessary re-creation of the function and potential re-rendering of child components.
   
   <br>

<b> Example: </b>

```javascript
import { useCallback } from "react";

const MyComponent = ({ onClick }) => {
  const handleClick = useCallback(() => {
    // Handle click logic
  }, []); // No dependencies, function remains the same

  return <button onClick={handleClick}>Click Me</button>;
};
```

In summary, `useMemo` is used to memoize the result of a computation, while `useCallback` is used to memoize functions.

---

### Difference between useState and useRef ?

<h4>useState</h4>
   Used to add state to functional components. It allows you to declare and manage state variables, which trigger re-renders when their values change.
   
   <br>

<b> Example: </b>

```javascript
import { useState } from "react";

const Counter = () => {
  const [count, setCount] = useState(0);

  const handleIncrement = () => {
    setCount(count + 1);
  };

  return (
    <div>
      <p>Count: {count}</p>
      <button onClick={handleIncrement}>Increment</button>
    </div>
  );
};
```

<h4>useRef</h4>
   Used to create a mutable reference that persists between renders. Unlike state variables managed by `useState`, changes to `useRef` do not trigger re-renders. It is mainly used for accessing and managing DOM elements, holding references to values that don't cause re-renders, or preserving values between renders.
   
   <br>

<b> Example: </b>

```javascript
import { useRef, useEffect } from "react";

const InputComponent = () => {
  const inputRef = useRef(null);

  useEffect(() => {
    // Focus on the input element when the component mounts
    inputRef.current.focus();
  }, []);

  return <input type="text" ref={inputRef} />;
};
```

In summary, `useState` is used to manage state variables that trigger re-renders and should be used for rendering dynamic content, while `useRef` is used to hold mutable references or preserve values between renders without causing re-renders.

---

### Define useReducer ?

The useReducer hook takes in a reducer function and an initial state value, and it returns an array containing the current state and a dispatch function. The reducer function is responsible for updating the state based on the dispatched actions.

```javascript
import React, { useReducer } from "react";

const initialState = {
  count: 0,
};

const reducer = (state, action) => {
  switch (action.type) {
    case "INCREMENT":
      return { count: state.count + 1 };
    case "DECREMENT":
      return { count: state.count - 1 };
    default:
      return state;
  }
};

const Counter = () => {
  const [state, dispatch] = useReducer(reducer, initialState);

  return (
    <div>
      <p>Count: {state.count}</p>
      <button onClick={() => dispatch({ type: "INCREMENT" })}>Increment</button>
      <button onClick={() => dispatch({ type: "DECREMENT" })}>Decrement</button>
    </div>
  );
};

export default Counter;
```

---

### What is the Context API in React? How can it be used to manage global state in an application?

Context API is a feature in React that provides a way to share data (state) between components without the need to pass props down through the component tree manually. It allows you to create global state accessible to any component in the application hierarchy without having to explicitly pass the state as props through intermediate components.

```javascript
import React, { createContext, useContext, useState } from "react";

// Step 1: Create a Context
const MyContext = createContext();

// Step 2: Create a Provider Component
const MyProvider = ({ children }) => {
  const [count, setCount] = useState(0);

  return (
    <MyContext.Provider value={{ count, setCount }}>
      {children}
    </MyContext.Provider>
  );
};

// Step 3: Use the Context Consumer
const Counter = () => {
  const { count, setCount } = useContext(MyContext);

  return (
    <div>
      <p>Count: {count}</p>
      <button onClick={() => setCount(count + 1)}>Increment</button>
      <button onClick={() => setCount(count - 1)}>Decrement</button>
    </div>
  );
};

const App = () => {
  return (
    <MyProvider>
      <Counter />
    </MyProvider>
  );
};

export default App;
```

---

### Difference between controlled v/s uncontrolled component ?

<h4>Controlled Components:</h4>

A controlled component is a component in which the component's state is controlled by the parent component or a higher-level component.

Access values as props

<br/>

<b>Examples</b>

```javascript
class ControlledComponent extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      inputValue: "",
    };
  }

  handleChange = (event) => {
    this.setState({ inputValue: event.target.value });
  };

  render() {
    return (
      <input
        type="text"
        value={this.state.inputValue}
        onChange={this.handleChange}
      />
    );
  }
}
```

<h4>Uncontrolled Components</h4>

An uncontrolled component is a component in which the component maintains its state internally, and the parent component has limited or no control over it.

Accepts values via refs

<br />

<b>Example</b>

```javascript
class UncontrolledComponent extends React.Component {
  inputRef = React.createRef();

  handleSubmit = (event) => {
    event.preventDefault();
    console.log(this.inputRef.current.value);
  };

  render() {
    return (
      <form onSubmit={this.handleSubmit}>
        <input type="text" ref={this.inputRef} />
        <button type="submit">Submit</button>
      </form>
    );
  }
}
```

---

### Difference between arrow function and normal function

The main difference between arrow functions and normal functions in JavaScript is how they handle the "this" keyword.

<h4>Arrow functions </h4>

- Do not have their own "this" context.

- They inherit the "this" value from the enclosing (lexical) scope where they are defined.

Example of an arrow function:

```javascript
const add = (a, b) => a + b;
```

<h4>Normal functions</h4>

- Normal functions have their own "this" context, which is determined by how the function is called.
- The "this" value inside a normal function depends on the context of the function call (e.g., the object calling the function).

Example of a normal function:

```javascript
function multiply(a, b) {
  return a * b;
}
```

In summary, arrow functions are more concise and capture the "this" value from their surrounding scope, while normal functions have their own "this" context, which can lead to different behavior when using "this" inside the function.

---

### Define pure and impure components

<h4>Pure Components</h4>
Pure components are components that always produce the same output for the same input props. They do not rely on or modify any external state and have no side effects. Pure components are easier to reason about and can lead to performance optimizations since they avoid unnecessary re-renders.

<h4>Impure Components</h4>
Impure components are components that may have side effects, such as modifying external state, interacting with the DOM directly, or making API calls. Their output may not solely depend on the input props, making them harder to predict and potentially leading to unexpected behavior and performance issues.

---

### Define Higher Order Component

A Higher Order Component (HOC) is a design pattern in React (and other component-based frameworks) that allows you to enhance or modify the behavior of a component by wrapping it with another component. HOCs are functions that take a component as input and return a new component with additional functionalities or props. They are used to reuse component logic, implement cross-cutting concerns, and improve code reusability.

---

### Difference between relative and absolute in css

<h4>Relative</h4>
"Relative" positioning moves an element from its original position in the document flow while maintaining its space in the layout

<h4>Absolute</h4>
 "Absolute" positioning takes the element out of the document flow and positions it relative to its closest positioned ancestor or the document body

---

### Difference between foreach and map

<b>forEach :</b> an array method that iterates through each element of the array and executes a provided callback function for each element. It doesn't return a new array but modifies the existing array in place.

Example:

```javascript
const numbers = [1, 2, 3];
numbers.forEach((num) => console.log(num));
// Output: 1 2 3
```

<b>map:</b> an array method that iterates through each element of the array and creates a new array by transforming each element using a provided callback function. It returns a new array with the same length as the original array.

Example:

```javascript
const numbers = [1, 2, 3];
const doubledNumbers = numbers.map((num) => num * 2);
// Output: [2, 4, 6]
```

---

### Difference between event bubbling and event loop

<b>Event Bubbling:</b> It is a behavior in which an event that occurs on a nested or child element is first handled by the innermost element and then propagated or "bubbled up" through its parent elements in the DOM hierarchy. This means that if an event occurs on a deeply nested element, the event handlers of its ancestors will also be triggered.

<b>Event Loop:</b> It is a mechanism in JavaScript that manages the execution of asynchronous code. It continuously checks the call stack and the message queue for pending tasks. When the call stack is empty, it picks up tasks from the message queue and executes them one by one. This allows non-blocking execution of asynchronous code like timers, network requests, and callbacks.

---

### Difference between let, var, and const

<b>var</b>: Traditionally used. If declared outside any function, they become globally scoped. allows variables to be re-declared and updated within the same scope.

<b>let</b>: Introduced in ES6. Variables declared with let are limited to the block where they are defined. doesn't allow re-declaration of variables within the same block scope.

<b>const</b>: declare constants. Variables declared with const are block-scoped and cannot be reassigned after their initial assignment.

```javascript
var x = 10;
let y = 20;
const z = 30;

x = 15; // Valid
y = 25; // Valid
// z = 35; // Invalid, cannot reassign a constant variable

function example() {
  var innerVar = 50;
  let innerLet = 60;
  const innerConst = 70;
  // ...
}
// console.log(innerVar); // Invalid, var is function-scoped
// console.log(innerLet); // Invalid, let is block-scoped
// console.log(innerConst); // Invalid, const is block-scoped
```

---

### Why we don't use index as a key in a list

We don't use the index as a key in a list in React because it can lead to unpredictable behavior, performance issues, and state management problems. The index as a key might work when the list is static, but it fails when the list is dynamically modified. Changing the order of elements can cause unexpected behavior and performance degradation due to complete re-renders. Additionally, using the index as a key can result in stale data in components when the list changes, leading to incorrect updates and rendering bugs. To ensure proper rendering and efficient updates, it's best to use a unique identifier associated with each item in the list as the key.

---

### What is React Lifecycle ?

Mounting (phase occurs when a new component is being created and inserted into the DOM )

- componentDidMount(): This method is called immediately after a component is rendered. It's an excellent place to perform tasks like data fetching or subscribing to events.

Updating(phase occurs when a component is being re-rendered due to changes in props or state.)

- componentDidUpdate(): Triggered after a component updates, this method enables you to respond to changes in props or state. You can perform side effects or update the DOM here.

- shouldComponentUpdate(): Allows you to control if a component should re-render or not. Implement custom logic to optimize performance by preventing unnecessary renders.

- getDerivedStateFromProps(): Used to update the state based on changes in props. It's a static method that receives props and state as parameters, returning the updated state.

- render(): The heart of a React component, returning the JSX that represents the component's UI. Keep it pure and avoid mutating state or interacting with the DOM here.

Unmounting(phase occurs when a component is being removed from the DOM)

- componentWillUnmount(): Called when a component is about to be removed from the DOM. It's an opportunity to clean up any resources or subscriptions.

---

### How React's Virtual DOM works and its advantages in rendering performance ?

React's Virtual DOM is a lightweight copy of the actual DOM. When state changes, React creates a new Virtual DOM representation and compares it with the previous one. Only the differences are updated in the real DOM, reducing the need for expensive DOM manipulations.

---

### What is jsx and use of it ?

JSX stands for JavaScript XML. It is a syntax extension for JavaScript used primarily with React to describe the structure of user interfaces. JSX allows you to write HTML-like code directly within JavaScript, making it easier to define and visualize the component's structure, especially when dealing with complex user interface hierarchies.

---

### Explain different state management solutions in React, such as local component state, Redux, or MobX.

<b>Local Component State:</b> using the useState hook or the this.state approach with class components.

<b>Redux:</b> predictable state container that helps manage global application state. It follows a unidirectional data flow and keeps the application state in a single store.

<b>MobX:</b> provides simple and scalable state management with observable data.

---

### Explain the role of keys in React lists and why they are essential.

Keys help React identify each list item uniquely and efficiently update and re-render components when the list changes. They improve performance by minimizing re-renders and avoiding issues like incorrect component recycling.

```javascript
// Without keys
const itemsWithoutKeys = items.map((item) => <li>{item}</li>);

// With keys
const itemsWithKeys = items.map((item, index) => <li key={index}>{item}</li>);
```

---

### What is the significance of React Fragments, and when should you use them?

React Fragments allow you to group multiple components without introducing an additional parent element in the DOM. They are useful when you need to return multiple elements from a component's render method.

```javascript
import React, { Fragment } from "react";

const MyComponent = () => {
  return (
    <Fragment>
      <h1>Title</h1>
      <p>Paragraph 1</p>
      <p>Paragraph 2</p>
    </Fragment>
  );
};
```

---

### Explain the difference between useState and useEffect.

- `useState` is a React hook used for managing state within a functional component. It allows you to create and update state variables, enabling components to re-render when the state changes.

- `useEffect` is another React hook used for handling side effects in functional components. It allows you to perform actions, such as fetching data or subscribing to events, after the component has rendered or when certain dependencies have changed.

---

### What are React render props? How do they enable component composition and code reusability?

React render props is a pattern in React where a component's functionality is passed to other components as a prop, allowing those components to render content or access functionality dynamically. This enables component composition and code reusability by promoting a flexible and decoupled approach.

---

### How can you optimize performance in a React application? Discuss techniques like memoization, code splitting, and lazy loading.

1. Memoization: Memoization is the process of caching expensive function calls to avoid redundant computations. In React, you can use the `React.memo` higher-order component or `useMemo` hook to memoize components and prevent unnecessary re-renders.

2. Code Splitting: Code splitting involves breaking your application's bundle into smaller chunks, allowing users to only download the necessary code when they navigate to a specific route or perform certain actions. React supports code splitting through features like React.lazy and Suspense.

3. Lazy Loading: Lazy loading is a technique where you delay the loading of non-essential resources, such as images or components, until they are needed. React.lazy and Suspense can also be used for lazy loading components, loading them only when required.

By employing these techniques, you can significantly improve the performance of your React application, reduce the initial load time, and make the user experience smoother.

---

### What is server-side rendering (SSR) in React? Discuss its advantages and challenges compared to client-side rendering.

Server-side rendering (SSR) in React involves rendering React components on the server side and sending the pre-rendered HTML to the client's browser. This approach differs from client-side rendering (CSR) where the entire application is loaded in the browser, and React components are rendered there.

<b>Advantages of SSR compared to CSR:</b>
a. SEO Friendliness: SSR provides better SEO performance since search engines can crawl the pre-rendered HTML content more effectively, leading to improved search rankings.

b. Initial Load Time: SSR can reduce the initial load time of a page since the server sends pre-rendered content, allowing users to see content faster, especially on slower devices or networks.

c. Accessibility: SSR ensures that the website is accessible even if JavaScript fails to load in the user's browser.

<b>Challenges of SSR compared to CSR:</b>

a. Increased Server Load: SSR can put more strain on the server as it needs to handle the rendering process for each request.

b. Complex State Management: Handling client-side state can become more challenging in SSR, as some components might rely on client-side data and need additional handling.

c. Development Complexity: Implementing SSR might require additional configuration and setup, making development more complex compared to CSR.

---

### What is the role of React Router in a single-page application? How does it handle dynamic routing and nested routes?

React Router is used to handle navigation and routing in a single-page application (SPA) built with React. It allows developers to define multiple routes, associate them with specific components, and manage the rendering of those components based on the URL. React Router ensures that the UI updates and re-renders efficiently when the user navigates through different views without requiring a full page reload.

Dynamic Routing and Nested Routes:

React Router supports dynamic routing by allowing parameters to be passed in the URL, which can be used to fetch specific data or render dynamic content. Nested routes are used to create a hierarchical structure within the application. It enables components to be rendered within other components, making it easier to manage complex user interfaces with multiple levels of views.

---

### How would you test a React component? Discuss different testing approaches, such as unit testing, integration testing, and snapshot testing.

<b>1. Unit Testing:</b>

- Test individual units or functions in isolation using Jest
- Mock dependencies to isolate the unit being tested.

<b>2. Integration Testing:</b>

- Test the interactions between different units or components to ensure they work together correctly.
- Helps identify issues that may not be evident in unit tests.

<b>3. Snapshot Testing:</b>

- Capture a "snapshot" of a component's rendered output and compare it to a previously stored snapshot.
- Useful for detecting unintended changes to the UI.
- Quick and easy to implement, but may not catch all functional issues.

<b>4. End-to-End Testing:</b>

- Test the entire application flow from start to finish.
- Helps identify issues related to data flow and user experience.

<b>5. Component Testing with Testing Libraries:</b>

- Use testing libraries such as Enzyme to simulate user interactions and assert component behavior.
- Emphasizes testing components in a way that closely resembles how they are used by users.

<b>6. Test Coverage Analysis:</b>

- Measure how much of the codebase is covered by tests.
- Aim for high test coverage to ensure a robust and reliable application.

<b>7. Continuous Integration (CI) Testing:</b>

- Automate the testing process in CI/CD pipelines to catch issues early and ensure code quality.
- Run tests on every code commit to prevent the integration of faulty code into the main codebase.

---

### How can you handle forms in React? Explain techniques like controlled components, form validation, and handling form submission.

<b>1. Controlled Components:</b> React enables form handling through controlled components, where form elements are controlled by the component's state, giving you full control over data and behavior.

<b>2. Form Validation:</b> In React forms, you can validate user input using event handlers (e.g., onChange) and display error messages or disable submission based on validation rules. Libraries like Formik or Yup can aid in simplifying and managing form validation.

<b>3. Handling Form Submission:</b> Upon form submission, handle it through an event handler attached to the form's onSubmit attribute, accessing the form data from the component's state for further actions like sending to a server or displaying success messages.

---

### How does React handle prop drilling and what are the solutions to mitigate it ?

React handles prop drilling through the process of passing data from a parent component to a deeply nested child component, leading to cluttered and complex code. Solutions to mitigate prop drilling include using React Context API for global data sharing and employing state management libraries like Redux or MobX to centralize and simplify data access.

---

### What are the differences between React's server-side rendering (SSR) and client-side rendering (CSR)? When would you use each approach ?

Server-side rendering (SSR) renders the initial HTML content on the server and sends it to the client, allowing the page to be displayed faster and improving SEO.

Client-side rendering (CSR), renders the content on the client's browser using JavaScript after the initial HTML has been loaded, providing more interactivity.

---

### Explain the concept of code splitting in React. How can it enhance performance and improve user experience ?

Code splitting in React is the technique of breaking down a large JavaScript bundle into smaller, more manageable chunks, which are then loaded on-demand when needed. This enhances performance and improves the user experience by reducing the initial loading time of the application.

---

### What is the role of error boundaries in React? How can they help catch and handle errors in component trees ?

Error boundaries in React are components that catch and handle errors that occur within their component tree and prevent those errors from crashing the entire application. They help improve the robustness of React applications by isolating errors and allowing graceful fallbacks or error messages to be displayed to users. When an error is thrown in a component tree, the error boundary component, if present, captures the error and can display a designated fallback UI. This way, the rest of the application continues to work unaffected by the error in the isolated component tree. Error boundaries are defined using the `componentDidCatch` lifecycle method or the static `getDerivedStateFromError` method.

---

### Explain the concept of reconciliation in React. How does it determine when and how to update the DOM ?

Reconciliation in React is the process of efficiently updating the Document Object Model (DOM) to reflect changes in a component's state or props. React's reconciliation algorithm compares the previous virtual DOM representation with the new one generated after a state or prop change. It then calculates the minimal set of changes required to update the real DOM.

React uses a technique called "diffing" to determine the minimum necessary updates. It compares the virtual DOM tree's elements and their attributes to find differences between the old and new versions. By minimizing DOM manipulations, React optimizes performance and provides a smooth user experience.

---

### What is Lifting State Up in React?

Lifting State Up in React refers to the process of moving the state from a child component to its parent component to share and manage the state at a higher level.

---

### What is React context?

React context provides a way to share data between components without the need to pass it through props manually. It allows data to be accessed by any component within the context tree.

---

### What are different ways to add CSS in your app?

Different ways to add CSS in your app include inline styles, external CSS files, CSS modules, and CSS-in-JS libraries like styled-components.

---

### What is Hot Module Replacement?

Hot Module Replacement (HMR) is a feature in bundlers like Webpack that allows developers to update specific modules in the application without a full page reload, preserving the application state.

---

### What is the use of Parcel, Vite, Webpack?

Parcel, Vite, and Webpack are all module bundlers used in modern web development to bundle and optimize assets like JavaScript, CSS, and images for production.

---

### What is Tree Shaking?

Tree Shaking is the process of removing unused code (dead code) from the final bundle during the production build, reducing the application's size and improving performance.

---

### Difference b/w dependency and devDependency

In the context of npm packages, dependencies are required packages needed for the application to run, while devDependencies are packages needed only during development and testing.

---

### What is npx and npm?

npx is a command-line tool that comes with npm and allows you to run Node.js executables without globally installing them. npm is the Node Package Manager used to install and manage packages in a Node.js project.

---

### Difference b/w package .json and package-lock .json

package.json is used to specify metadata and dependencies for a project, while package-lock.json is automatically generated by npm to lock dependency versions for reproducible builds.

---

### Difference between console .log(< HeaderComponent/>) and console .log(HeaderComponent())

console.log(<HeaderComponent/>) will log the actual JSX representation of the HeaderComponent

console.log(HeaderComponent()) will log the result of invoking the function HeaderComponent().

---

### What is React.Fragment?

React.Fragment is a built-in component that allows returning multiple elements without adding an additional DOM element to the output.

---

### What is the purpose of dependency array in useEffect? What is the difference when it is used and when it is not used?

The dependency array in useEffect specifies the dependencies that trigger the effect when they change. If the dependency array is empty, the effect runs only once after the initial render.

---

### What if 2 components are given will the state change in one component will effect the other component’s state (child)?

No, the state change in one component will not directly affect another component's state unless the state is passed down through props and gets updated at the parent level.

---

### What is the use of return in useEffect ?

In useEffect, the return statement is used to perform cleanup tasks like cancelling subscriptions or removing event listeners when the component unmounts.

---

### How does React handle routing and navigation?

React handles routing and navigation using libraries like React Router, which manages the application's URLs and renders different components based on the current URL.

---

### How to managing data inside React ?

State is the core for managing data in React. It represents the current state of your component and can be updated using setState.

Props allow you to pass data from parent components to child components. It's a one-way flow of data.

Context provides a way to share data across the component tree without passing props explicitly. It's useful for global state management.

React Hooks, like useState and useEffect, enable functional components to manage state and handle side effects. They make data management more concise and readable.

Redux is a popular state management library for larger applications. It provides a centralized store for managing data and enables predictable state updates.

GraphQL is a query language for APIs that allows you to fetch and update data efficiently. It simplifies data management by enabling you to request only the data you need.

Debugging tools like React DevTools and Redux DevTools can greatly assist in managing and inspecting data within your React application

---

### New features in ES6

1. **Let and Const Declarations:**

2. **Arrow Functions:**

3. **Spread Operator:**

4. **Default Parameters:**

5. **Classes:**

6. **Modules:**

7. **Promises:**

8. **Iterators and Generators:** Introduced iteration protocols and generator functions to iterate over collections.

---

### Common pseudo code with set time interval function

Here's a common pseudo code with `setInterval` function, which executes a specified function at regular intervals:

```javascript
// Pseudo code for a simple counter using setInterval

// Initialize a variable to store the count
let count = 0;

// Define the function to be executed at each interval
function incrementCounter() {
  // Increment the count
  count++;

  // Display the count
  console.log(`Count: ${count}`);

  // Check if the count reaches a certain limit (e.g., 10)
  if (count === 10) {
    // Stop the interval when the condition is met
    clearInterval(intervalId);
    console.log("Interval stopped.");
  }
}

// Set the interval to execute the function every 1 second (1000 milliseconds)
const intervalId = setInterval(incrementCounter, 1000);
```

---

### Implementation of promises and async- await.

**Promises:**

Promises provide a way to handle asynchronous operations in a more structured and readable manner. They can be in one of three states: `pending`, `fulfilled`, or `rejected`.

```javascript
// Function that returns a Promise
function simulateAsyncOperation() {
  return new Promise((resolve, reject) => {
    // Simulate an asynchronous operation (e.g., API call or setTimeout)
    setTimeout(() => {
      const randomNum = Math.random();
      if (randomNum > 0.5) {
        resolve(`Success: ${randomNum}`);
      } else {
        reject(`Error: ${randomNum}`);
      }
    }, 1000); // Simulate 1 second delay
  });
}

// Using the Promise
simulateAsyncOperation()
  .then((result) => {
    console.log(result);
  })
  .catch((error) => {
    console.error(error);
  });
```

**async/await:**

`async/await` is syntactic sugar built on top of Promises, providing a more synchronous-like way of writing asynchronous code. It makes asynchronous code look more like synchronous code, making it easier to read and understand.

```javascript
// Function using async/await
async function simulateAsyncOperation() {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      const randomNum = Math.random();
      if (randomNum > 0.5) {
        resolve(`Success: ${randomNum}`);
      } else {
        reject(`Error: ${randomNum}`);
      }
    }, 1000);
  });
}

// Using async/await
async function performAsyncOperation() {
  try {
    const result = await simulateAsyncOperation();
    console.log(result);
  } catch (error) {
    console.error(error);
  }
}

performAsyncOperation();
```

---

### Reverse an Array:

```javascript
const originalArray = [1, 2, 3, 4, 5];
const reversedArray = originalArray.reverse();
console.log(reversedArray);
```

---

### Remove Duplicates from an Array

```javascript
const arrayWithDuplicates = [1, 2, 2, 3, 4, 4, 5];
const uniqueArray = Array.from(new Set(arrayWithDuplicates));
console.log(uniqueArray);
```

---

### Reverse a String:

```javascript
const originalString = "hello";
const reversedString = originalString.split("").reverse().join("");
console.log(reversedString);
```

---

### Flatten a Multidimensional Array:

```javascript
const multidimensionalArray = [
  [1, 2],
  [3, 4],
  [5, 6],
];
const flattenedArray = multidimensionalArray.flat();
console.log(flattenedArray);
```

---

### Use Filter, Map, and Reduce Methods:

```javascript
const numbers = [1, 2, 3, 4, 5];

// Filter - get even numbers
const evenNumbers = numbers.filter((num) => num % 2 === 0);

// Map - double each number
const doubledNumbers = numbers.map((num) => num * 2);

// Reduce - sum all numbers
const sum = numbers.reduce((acc, num) => acc + num, 0);

console.log(evenNumbers);
console.log(doubledNumbers);
console.log(sum);
```

---

### Merge Arrays

```javascript
const array1 = [1, 2, 3];
const array2 = [4, 5, 6];
const mergedArray = [...array1, ...array2];
console.log(mergedArray);
```

---

### Sort an Array

```javascript
const unsortedArray = [3, 1, 5, 2, 4];
const sortedArray = unsortedArray.sort((a, b) => a - b);
console.log(sortedArray);
```

---

### Check Palindrome

```javascript
function isPalindrome(str) {
  const reversedStr = str.split("").reverse().join("");
  return str === reversedStr;
}

console.log(isPalindrome("racecar")); // true
console.log(isPalindrome("hello")); // false
```

---

### Fibonacci Series

```javascript
function fibonacci(n) {
  if (n <= 1) return [0];
  const series = [0, 1];
  for (let i = 2; i < n; i++) {
    series.push(series[i - 1] + series[i - 2]);
  }
  return series;
}

console.log(fibonacci(7)); // [0, 1, 1, 2, 3, 5, 8]
```

---

### Find Longest Word in a String

```javascript
function longestWord(str) {
  const words = str.split(" ");
  return words.reduce(
    (longest, word) => (word.length > longest.length ? word : longest),
    ""
  );
}

console.log(longestWord("The quick brown fox jumps over the lazy dog")); // "jumps"
```

---

### Find Longest Common String from Array of Strings

```javascript
function longestCommonString(arr) {
  if (arr.length === 0) return "";
  const sortedArr = arr.sort((a, b) => a.length - b.length);
  const shortestStr = sortedArr[0];

  for (let i = shortestStr.length; i > 0; i--) {
    for (let j = 0; j <= shortestStr.length - i; j++) {
      const substring = shortestStr.substr(j, i);
      if (arr.every((str) => str.includes(substring))) {
        return substring;
      }
    }
  }

  return "";
}

const stringArray = ["apple", "apricot", "apply", "appetite"];
console.log(longestCommonString(stringArray)); // "app"
```

---

### Count Characters Occurring in an Array

```javascript
function countCharacters(arr) {
  const charCount = {};
  arr
    .join("")
    .split("")
    .forEach((char) => {
      charCount[char] = (charCount[char] || 0) + 1;
    });
  return charCount;
}

const charArray = ["a", "b", "a", "c", "b", "a", "d"];
console.log(countCharacters(charArray)); // { a: 3, b: 2, c: 1, d: 1 }
```

---

### Find First Pair Whose Sum is Zero

```javascript
function findPairWithZeroSum(arr) {
  const seenNumbers = new Set();
  for (let num of arr) {
    const complement = -num;
    if (seenNumbers.has(complement)) {
      return [num, complement];
    }
    seenNumbers.add(num);
  }
  return null;
}

const numbersArray = [2, 4, -2, -4, 6];
console.log(findPairWithZeroSum(numbersArray)); // [2, -2]
```

---

### Unique Values in Two Arrays

```javascript
function uniqueValues(arr1, arr2) {
  const uniqueSet = new Set([...arr1, ...arr2]);
  return Array.from(uniqueSet);
}

const array1 = [1, 2, 3];
const array2 = [3, 4, 5];
console.log(uniqueValues(array1, array2)); // [1, 2, 3, 4, 5]
```

---

### Objects and Classes in JavaScript

In JavaScript, objects are data structures that store properties and methods. They can be created using object literals or constructors.

ES6 introduced the class syntax, which provides a more familiar and traditional way of defining objects in JavaScript.

Object Literal:

```javascript
const person = {
  name: "John",
  age: 30,
  sayHello: function () {
    console.log(`Hello, my name is ${this.name}.`);
  },
};
```

Class Syntax:

```javascript
class Person {
  constructor(name, age) {
    this.name = name;
    this.age = age;
  }

  sayHello() {
    console.log(`Hello, my name is ${this.name}.`);
  }
}

const john = new Person("John", 30);
john.sayHello();
```

---

### Difference between Class-based and Functional-based Components

Class-based Components:

```javascript
import React, { Component } from "react";

class MyClassComponent extends Component {
  render() {
    return <div>Class-based Component</div>;
  }
}
```

Functional Components (Hooks-based):

```javascript
import React from "react";

function MyFunctionalComponent() {
  return <div>Functional Component</div>;
}
```

Class-based components are based on ES6 classes and extend from the `Component` class provided by React. They have their own state and lifecycle methods.

On the other hand, functional components are simpler and rely on React hooks (introduced in React 16.8) for managing state and lifecycle behavior.

---

### How to Write Custom Hooks:\*\*

Custom hooks are reusable functions that encapsulate stateful logic in React. They are created using the `use` prefix and typically leverage built-in hooks.

Example:

```javascript
import { useState, useEffect } from "react";

function useFetchData(url) {
  const [data, setData] = useState(null);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    fetch(url)
      .then((response) => response.json())
      .then((data) => {
        setData(data);
        setLoading(false);
      })
      .catch((error) => {
        console.error("Error fetching data:", error);
        setLoading(false);
      });
  }, [url]);

  return { data, loading };
}
```

You can use this custom hook in any component to fetch data from an API and manage loading state:

```javascript
function MyComponent() {
  const { data, loading } = useFetchData("https://api.example.com/data");
  // Use data and loading in the component's render logic
  // ...
}
```

---

### Pagination:\*\*

Pagination is a common UI pattern used to split a large dataset into smaller pages to improve user experience. In React, you can implement pagination by maintaining state for the current page number and using array slicing to display the relevant data.

Here's a simple pagination example using an array of items:

```javascript
import React, { useState } from "react";

function MyComponent({ itemsPerPage }) {
  const [currentPage, setCurrentPage] = useState(1);
  const items = [
    /* your array of data */
  ];

  const indexOfLastItem = currentPage * itemsPerPage;
  const indexOfFirstItem = indexOfLastItem - itemsPerPage;
  const currentItems = items.slice(indexOfFirstItem, indexOfLastItem);

  return (
    <div>
      {/* Render your currentItems */}
      {currentItems.map((item) => (
        <div key={item.id}>{item.name}</div>
      ))}

      {/* Pagination buttons */}
      <button
        onClick={() => setCurrentPage(currentPage - 1)}
        disabled={currentPage === 1}
      >
        Previous
      </button>
      <button
        onClick={() => setCurrentPage(currentPage + 1)}
        disabled={indexOfLastItem >= items.length}
      >
        Next
      </button>
    </div>
  );
}
```

---

### Where to use Context and where to use Redux

Context is suitable for simple state sharing within a small part of your application.

Redux is more appropriate for handling larger-scale state management with a global store.

---

### Redux Thunk, Redux Saga, RTK (Redux Toolkit)

1. **Redux Thunk:** Redux Thunk is a middleware that allows you to write action creators that return functions instead of plain objects. These functions can perform asynchronous operations (e.g., API calls) and dispatch actions when the operations complete.

2. **Redux Saga:** Redux Saga is a middleware that uses ES6 generators to manage side effects in your Redux application. It allows you to handle complex asynchronous operations using a more declarative style.

3. **Redux Toolkit (RTK):** Redux Toolkit is an official opinionated library for Redux that simplifies and streamlines common Redux use cases. It includes utilities for creating Redux stores, defining reducers, and writing actions in a more concise way.

When to use each:

- Use Redux Thunk when you have straightforward asynchronous actions and want a simple middleware solution.
- Use Redux Saga when you have complex asynchronous actions with advanced control flow and error handling requirements.
- Use Redux Toolkit when you want a more opinionated and streamlined way to work with Redux, including built-in support for Redux Thunk and other middlewares.

---

### Demonstrate Use of State and Props Using Examples

State and Props are two essential concepts in React for managing and passing data.

1. Example of State:

```jsx
import React, { useState } from "react";

function Counter() {
  const [count, setCount] = useState(0);

  const increment = () => {
    setCount(count + 1);
  };

  return (
    <div>
      <h2>Counter: {count}</h2>
      <button onClick={increment}>Increment</button>
    </div>
  );
}
```

In this example, we use the `useState` hook to define a `count` state variable and a `setCount` function to update it. Clicking the "Increment" button updates the state, and the component re-renders with the updated value.

2. Example of Props:

```jsx
import React from "react";

function Greeting(props) {
  return <h2>Hello, {props.name}!</h2>;
}

function App() {
  return <Greeting name="John" />;
}
```

In this example, we pass a `name` prop to the `Greeting` component. The `Greeting` component receives this prop through its function parameter (`props`) and renders a personalized greeting.

Props are used to pass data from parent components to child components, allowing you to customize the behavior and content of components dynamically.

In summary, state is used for managing component-specific data that can change over time, while props are used for passing data from parent to child components.

---

### Output of `arr = new Array(3);`

The code creates an array with a length of 3 but without any elements.

```javascript
const arr = new Array(3);
console.log(arr); // Output: [ <3 empty items> ]
```

---

### Event Bubbling and Capturing

<b>Event Capturing:</b>

The event starts from the topmost ancestor element and travels down the DOM hierarchy to the target element. It is also known as "capture phase."

<b>Event Bubbling:</b>

After the event reaches the target element, it "bubbles" up through its ancestors in reverse order, back to the topmost ancestor. It is also known as "bubbling phase."

---

### Deep Copy and Shallow Copy

Deep Copy creates a new copy of an object with all its nested objects and properties. It means the copied object and its properties do not share any references with the original object.

Shallow Copy, on the other hand, creates a new copy of the object but only copies the top-level properties. The nested objects inside the copied object still share references with the original object.

Here's how you can perform deep and shallow copying:

```javascript
// Deep Copy
const obj = { a: 1, b: { c: 2 } };
const deepCopy = JSON.parse(JSON.stringify(obj));

// Shallow Copy
const shallowCopy = Object.assign({}, obj);
```

---

### Call, Apply, and Bind

`call`, `apply`, and `bind` are methods available on all functions in JavaScript and are used to change the context (`this` value) of a function.

- `call`: Invokes the function with a specified `this` value and arguments passed individually.

```javascript
function greet(name) {
  console.log(`Hello, ${name}! I am ${this.title}.`);
}

const person = { title: "Mr." };
greet.call(person, "John"); // Output: "Hello, John! I am Mr."
```

- `apply`: Invokes the function with a specified `this` value and arguments passed as an array.

```javascript
function greet(name) {
  console.log(`Hello, ${name}! I am ${this.title}.`);
}

const person = { title: "Mr." };
greet.apply(person, ["John"]); // Output: "Hello, John! I am Mr."
```

- `bind`: Returns a new function with the specified `this` value and arguments (if provided) bound to it. It does not invoke the function immediately.

```javascript
function greet(name) {
  console.log(`Hello, ${name}! I am ${this.title}.`);
}

const person = { title: "Mr." };
const boundGreet = greet.bind(person);
boundGreet("John"); // Output: "Hello, John! I am Mr."
```

---

### Recursion

Recursion is a programming technique where a function calls itself to solve a problem. It is useful when a problem can be broken down into smaller, similar sub-problems.

Example of a simple recursive function to calculate factorial:

```javascript
function factorial(n) {
  if (n === 0 || n === 1) {
    return 1;
  } else {
    return n * factorial(n - 1);
  }
}

console.log(factorial(5)); // Output: 120 (5! = 5 * 4 * 3 * 2 * 1 = 120)
```

---

### Prototypical Inheritance

Prototypical inheritance is an object-oriented programming concept in JavaScript where objects can inherit properties and methods from other objects known as prototypes. Each object has a hidden property called the prototype, enabling inheritance from its prototype object. When accessing a property or method on an object, JavaScript first checks the object itself, then follows the prototype chain until it finds the property or reaches the end (null). This mechanism allows for code reuse, simplifying object creation and promoting a hierarchical structure of objects in JavaScript.

---

### What is 'this' mean in JavaScript?

In JavaScript, 'this' is a special keyword that refers to the context within which a function is executed. The value of 'this' depends on how the function is called, and it can have different meanings in different contexts:

- In the global scope, 'this' refers to the global object (e.g., 'window' in browsers, 'global' in Node.js).

- Inside a function called as a method of an object, 'this' refers to the object itself.

- When using constructor functions or classes to create objects, 'this' refers to the newly created instance of the object.

- In arrow functions, 'this' retains the value from the surrounding lexical context.

---

### What is the data structure of the DOM?

The DOM is organized in the following way:

- <b>Document node:</b> The top-level node, representing the entire document.

- <b>Element nodes:</b> Nodes representing HTML elements (e.g., < div >, < p >, < h1 > ).

- <b>Attribute nodes:</b> Nodes representing attributes of elements.

- <b>Text nodes:</b> Nodes representing the text within elements.

- <b>Comment nodes:</b> Nodes representing comments within the HTML.

---

### Stack and Queue in JavaScript

<b>Stack:</b> A stack is a linear data structure that follows the Last In, First Out (LIFO) principle. It means that the last element added to the stack will be the first one to be removed.

```javascript
// Creating a stack
const stack = [];

// Pushing elements onto the stack
stack.push(1);
stack.push(2);
stack.push(3);

// Popping elements from the stack
const topElement = stack.pop(); // Removes and returns 3
```

<b>Queue:</b> A queue is a linear data structure that follows the First In, First Out (FIFO) principle. It means that the first element added to the queue will be the first one to be removed.

```javascript
// Creating a queue
const queue = [];

// Enqueue (add) elements to the queue
queue.push(1);
queue.push(2);
queue.push(3);

// Dequeue (remove) elements from the queue
const firstElement = queue.shift(); // Removes and returns 1
```

---

### Checking if an image element is loaded on a page

In JavaScript, you can check if an image element is loaded on a page by attaching an event listener to the 'load' event of the image. The 'load' event is triggered when the image has been successfully loaded.

```javascript
const imageElement = document.getElementById("myImage");

imageElement.addEventListener("load", () => {
  console.log("Image loaded successfully!");
});

// If the image is already cached and loaded before the event listener is attached,
// you can check the `complete` property to see if it has finished loading.
if (imageElement.complete) {
  console.log("Image already loaded!");
}
```

---

### Event delegation

Event delegation is a JavaScript technique where a single event listener is attached to a parent element to handle events on its child elements, utilizing event bubbling to determine the target element. This optimizes event handling, especially when dealing with dynamic or numerous child elements.

---

### Worker in JavaScript

A Worker is a JavaScript feature for running background tasks in a separate thread, enabling concurrent processing without blocking the main UI thread, ensuring a responsive web application.

---

### What is “use strict “ and why do we need it.

"use strict" is a special pragma in JavaScript that enables strict mode. When you include "use strict" at the beginning of a script or a function, it enforces a stricter set of rules and error-checking in your code. It helps you write more reliable and secure JavaScript code by disallowing certain unsafe and error-prone practices.

Reasons for using "use strict":

- Catching common coding mistakes: Strict mode helps detect and throw errors for common coding errors that might otherwise go unnoticed in normal JavaScript mode.

- Safer code: Strict mode disallows some dangerous or less predictable features of JavaScript, making the code safer and easier to maintain.

- Future-proofing: Enabling strict mode helps ensure that your code will continue to work correctly with future versions of JavaScript as new language features are introduced.

- Improved performance: Some JavaScript engines can optimize strict mode code better, resulting in potential performance improvements.

---

### Why is "use strict" a string and not a reserved keyword

"use strict" is not a reserved keyword because it was introduced later in the ECMAScript 5 (ES5) standard.

Making it a string was a design decision to maintain backward compatibility with older JavaScript engines that might not recognize the "use strict" pragma.

### What is eval with "use strict

When you use "use strict" in a script or a function, it affects the scope in which it is used. However, using eval in strict mode can introduce some complexities.

If you evaluate a string with eval in strict mode, the code inside eval will also be executed in strict mode. However, this behavior is different from non-strict mode, where eval creates variables in the global scope.

Example of eval in non-strict mode:

```javascript
"use strict";

eval("var x = 10;"); // Creates a variable 'x' in the strict mode scope
console.log(x); // Throws a ReferenceError: x is not defined
```

---

### What happens when I delete some object or variables in strict mode ?

In strict mode, deleting variables, function names, or function arguments using the 'delete' operator is not allowed, and it results in a TypeError.

Example:

```javascript
"use strict";

var x = 10;
console.log(x); // Output: 10

delete x; // Throws a TypeError: Cannot delete property 'x' of [object Object]

function foo() {
  console.log("Hello");
}

delete foo; // Throws a TypeError: Cannot delete property 'foo' of [object Object]
```

---

### Write a polyfill for bind function

The 'bind' function in JavaScript is used to create a new function that, when called, has its 'this' keyword set to a specified value. Here's a basic polyfill for the 'bind' function:

```javascript
if (!Function.prototype.bind) {
  Function.prototype.bind = function (context, ...args) {
    const originalFunction = this;
    return function (...innerArgs) {
      return originalFunction.apply(context, args.concat(innerArgs));
    };
  };
}
```

Now you can use the 'bind' function just like in modern JavaScript:

```javascript
function greet(greeting) {
  console.log(greeting + " " + this.name);
}

const person = { name: "John" };

const boundGreet = greet.bind(person, "Hello");
boundGreet(); // Output: Hello John
```

---

### Given an expression string exp , write a program to examine whether the pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp.

Example:
Input: expz = “[()]{}{[()()]()}”m
Output: Balanced

Input: exp = “[(])”
Output: Not Balanced

```JAVASCRIPT
function isBalanced(exp) {
  const stack = [];
  const openBrackets = ['[', '(', '{'];
  const closeBrackets = [']', ')', '}'];
  const bracketPairs = { ']': '[', ')': '(', '}': '{' };

  for (let i = 0; i < exp.length; i++) {
    const char = exp[i];

    if (openBrackets.includes(char)) {
      stack.push(char);
    } else if (closeBrackets.includes(char)) {
      const matchingBracket = bracketPairs[char];
      const topBracket = stack.pop();

      if (matchingBracket !== topBracket) {
        return false;
      }
    }
  }

  return stack.length === 0; // If the stack is empty, the expression is balanced.
}

// Test cases
console.log(isBalanced("[()]{}{[()()]()}")); // Output: true
console.log(isBalanced("[(])")); // Output: false

```

### What is the output of below program and Explain about your output

for (var i = 1; i < 5; i++) {
setTimeout(() => console.log(i), 1000 \* i);
}

```
Output
// it will be generated after 1sec
5
5
5
5

```

---

### Write a program for debounce function

A debounce function is used to control the frequency of calls to a particular function, especially in scenarios where the function may be called multiple times in quick succession (e.g., events like scrolling or resizin).

```javascript
function debounce(func, delay) {
  let timeoutId;

  return function (...args) {
    clearTimeout(timeoutId);
    timeoutId = setTimeout(() => func.apply(this, args), delay);
  };
}
```

---

### How many types of storage are there in Web Application?

- **LocalStorage:** Stores key-value pairs in the user's browser with no expiration date.
- **SessionStorage:** Similar to LocalStorage, but data is cleared when the browser session ends.
- **Cookies:** Small pieces of data with an expiration date, sent with HTTP requests.
- **IndexedDB:** Stores large amounts of structured data in the user's browser.
- **Cache API:** Temporarily stores data in the browser's cache for improved performance.

---

### If there is a for loop running over some time and your browser is not responding on that particular time. What will you do to make browser available and always responding to the user?

To keep the browser responsive during a long-running for loop, you can use "chunking" or "yielding." Break the loop into smaller chunks with a delay between each chunk using setTimeout. Here's an example:

```javascript
function performLongRunningTask() {
  const data = [
    /* Some data */
  ];
  const chunkSize = 1000; // Adjust the chunk size as needed

  let index = 0;

  function processChunk() {
    for (let i = 0; i < chunkSize && index < data.length; i++) {
      // Process data[index]
      index++;
    }

    if (index < data.length) {
      setTimeout(processChunk, 0); // Use a small delay to yield to the browser
    }
  }

  processChunk();
}
```

---

### What is Service Worker ?

A service worker is a background script that acts as a proxy between web applications and the network. It enables offline caching, push notifications, and background synchronization. Service workers intercept network requests, allowing developers to create a better offline experience and improve web app performance.

---

### What is Defer and async ?

<b> Defer:</b> Scripts with the defer attribute are downloaded in the background while the HTML is parsed. They execute after HTML parsing but before DOMContentLoaded, in the order they appear.

<b>Async:</b> Scripts with the async attribute are downloaded asynchronously while HTML parsing continues. They execute as soon as they are downloaded, potentially out of order based on download completion.

---

### What is the difference between inline vs inline-block ?

<b> Inline:</b> Elements with `display: inline` are placed within the same line as text content, not starting on a new line. They only take up the space needed by their content and have no width or height properties.

<b> Inline-Block:</b> Elements with `display: inline-block` are also in the same line as text content, but they can have width and height properties, and other block-level properties can be applied. They maintain the flow of text around them.

---

### What is the difference between svg vs canvas ?

<b> SVG (Scalable Vector Graphics): </b> XML-based format for precise and scalable graphics on the web. Ideal for icons and illustrations. Can be styled with CSS and easily manipulated using JavaScript.

<b> Canvas:</b> Bitmap-based API for drawing graphics with JavaScript. Raster-based, suitable for complex animations and games. Cannot be manipulated with CSS, requires redrawing for changes.

---

### What is pseudo-class ?

In CSS, pseudo-classes are keywords prefixed with a colon (:) that select and style elements based on their state or specific characteristics. Examples include :hover, :active, and :focus.

---

### What is difference between function expression and function declaration ?

<b>Function Declaration:</b> Function declarations are hoisted to the top of their scope. They can be called before they appear in the code because they are available throughout the entire scope.

```javawscript

function myFunc() {
  // Function logic here
}

```

<b>Function Expression:</b> Function expressions are not hoisted. They behave like other variables and are only available after the line where they are defined.

```javascript
const myFunc = function () {
  // Function logic here
};
```

---

### Write a program for sum(1)(2) ?

```javascript
function sum(a) {
  return function (b) {
    return a + b;
  };
}

const result = sum(1)(2);
console.log(result); // Output: 3
```

---

### What the multiple ways to create object ?

1. Object Literal:

```javascript
const person = {
  name: "John",
  age: 30,
};
```

2. Constructor Function:

```javascript
function Person(name, age) {
  this.name = name;
  this.age = age;
}

const john = new Person("John", 30);
```

3. Object.create():

```javascript
const personPrototype = {
  sayHello() {
    console.log(
      `Hello, my name is ${this.name} and I'm ${this.age} years old.`
    );
  },
};

const john = Object.create(personPrototype);
john.name = "John";
john.age = 30;
```

4. Class (Introduced in ECMAScript 2015):

```javascript
class Person {
  constructor(name, age) {
    this.name = name;
    this.age = age;
  }

  sayHello() {
    console.log(
      `Hello, my name is ${this.name} and I'm ${this.age} years old.`
    );
  }
}

const john = new Person("John", 30);
```

5. Factory Function (Returning Objects):

```javascript
function createPerson(name, age) {
  return {
    name: name,
    age: age,
    sayHello() {
      console.log(
        `Hello, my name is ${this.name} and I'm ${this.age} years old.`
      );
    },
  };
}

const john = createPerson("John", 30);
```

6. ES6 Object.assign():

```javascript
const personDefaults = {
  name: "Unknown",
  age: 0,
};

const john = Object.assign({}, personDefaults, { name: "John", age: 30 });
```

7. Spread Syntax (Introduced in ECMAScript 2015):

```javascript
const personDefaults = {
  name: "Unknown",
  age: 0,
};

const john = { ...personDefaults, name: "John", age: 30 };
```

---

### What is the difference between Object.create vs new ?

`Object.create`: Creates a new object with a specified prototype.

```javascript
const protoObj = { x: 10 };
const newObj = Object.create(protoObj);
```

`new`: Used to create instances of constructor functions. It returns a new object instance, and the constructor function's prototype becomes the prototype of the new object.

```javascript
function MyClass() {
  this.x = 10;
}

const obj = new MyClass();
```

---

### Write a program for shallow compare vs deep compare ?

<b>Shallow compare:</b> Compares only the top-level properties of objects based on their memory references.

<b>Deep compare:</b> Compares all properties of objects, including nested objects and arrays, based on their values by recursive traversal.

Example :

```javascript
// Shallow compare
const obj1 = { x: 10, y: { z: 20 } };
const obj2 = { x: 10, y: { z: 20 } };
console.log(obj1 === obj2); // Shallow comparison - false

// Deep compare
function deepCompare(obj1, obj2) {
  return JSON.stringify(obj1) === JSON.stringify(obj2);
}

console.log(deepCompare(obj1, obj2)); // Deep comparison - true
```

---

### What is the difference between **proto ** vs prototype ?

`__proto__`: A non-standard property in JavaScript (pre-ECMAScript 6) used to access an object's prototype. Not recommended due to potential lack of support.

`prototype`: A property in constructor functions to set the prototype for objects created with `new`. Standard and widely used for prototype-based inheritance.

---

### What is the prototype chain ?

The prototype chain in JavaScript is the mechanism of inheritance where properties and methods are looked up in an object's prototype and its chain of prototypes until the property is found or the end of the chain is reached (i.e., the prototype is null).

```javascript
const obj = { x: 10 };
console.log(obj.x); // 10
console.log(obj.toString()); // Inherits toString from Object.prototype
```

---

### What is Prototype inheritance ?

Prototype inheritance is the mechanism through which objects in JavaScript inherit properties and methods from other objects. When an object is created, it inherits properties and methods from its prototype, forming a prototype chain.

```javascript
function Person(name) {
  this.name = name;
}

Person.prototype.sayHello = function () {
  console.log(`Hello, my name is ${this.name}.`);
};

const john = new Person("John");
john.sayHello(); // Outputs: Hello, my name is John.
```

---

### What is Promise, Why we should have to use it instead of call back ?

A Promise is a cleaner and more structured way to handle asynchronous operations compared to traditional callbacks.

Advantages :

<b>Chaining:</b> Promises allow you to chain multiple asynchronous operations together, making the code more readable and avoiding callback hell.

<b>Error Handling:</b> Promises have built-in error handling through the .catch() method, which makes it easier to handle errors in asynchronous operations.

<b>Sequencing:</b> Promises ensure that asynchronous operations are executed in a specific order, making it easier to reason about the flow of the code.

<b>Promise.all():</b> This method allows you to wait for multiple promises to resolve simultaneously, which can be very useful in certain scenarios.

---

### What is the difference between prevent default vs stop propagation ?

`preventDefault()`: Used in event handlers to stop the default behavior of an event, like preventing a link from navigating to its URL when clicked.

```javascript
document.getElementById("myLink").addEventListener("click", function (event) {
  event.preventDefault();
  // Your custom handling code here
});
```

`stopPropagation()`: Used to prevent the event from bubbling up to parent elements, ensuring it doesn't trigger on nested elements' parents.

```javascript
document.getElementById("myButton").addEventListener("click", function (event) {
  event.stopPropagation();
  // This event will not trigger on parent elements
});
```

---

### Since both promise and setTimeout is async function which will execute first if both is available in queue at time T.

`Promises:` Promises are resolved/rejected asynchronously, and their callbacks are executed in the next iteration of the event loop after the current synchronous code has finished executing.

`setTimeout:` The callback function provided to setTimeout is executed asynchronously after the specified delay.

So, if both a promise and a setTimeout are in the event queue at the same time, the promise will be executed first since it follows the asynchronous execution pattern in the event loop.

---

### What is Job Queue

The Job Queue (or microtask queue) in the JavaScript event loop handles microtasks, which are tasks executed after the current task but before rendering or other tasks from the event queue. Promises, async/await, and MutationObserver use the job queue for their callbacks. After finishing the current task, the JavaScript engine executes all microtasks in the order they were added before moving on to the next task in the regular event queue. This prioritization ensures more predictable handling of asynchronous operations.

---

### What is CORS issue ?

CORS stands for Cross-Origin Resource Sharing, a security feature in web browsers to prevent unauthorized access to resources from a different domain. Browsers block such requests by default, and servers must include specific CORS headers to allow requests from other domains (e.g., Access-Control-Allow-Origin, Access-Control-Allow-Methods).

---

### Explain about Redux architecture

Redux is a predictable state management library for JavaScript applications, commonly used with frameworks like React. It follows the Flux architecture pattern and provides a centralized store to manage the application state. The main components of Redux are:

<b>Store:</b> The single source of truth that holds the entire application state.

<b>Actions:</b> Plain JavaScript objects that represent events or user interactions. They must have a type property that describes the action.

<b>Reducers:</b> Pure functions that specify how the application's state changes in response to actions. Reducers take the current state and an action as input and return a new state.

<b>Dispatch:</b> A method to send actions to the store, which triggers state changes.

<b>Subscribe:</b> A method to register callback functions that will be called whenever the state in the store is updated.

The unidirectional data flow in Redux ensures that changes to the state are predictable and that all state changes are handled by reducers, making it easier to debug and test applications.

---

### What is Middleware

Middleware sits between the action dispatch and the reducer, allowing developers to intercept and modify actions before they reach the reducer. It is used for various purposes like logging, handling asynchronous actions (e.g., API requests), and caching. Each middleware can access the dispatched action and application state and can pass the action to the next middleware or prevent it from reaching the reducer.

---

### Difference between task and microtask queue ?

<b>Task Queue:</b> Contains asynchronous tasks like I/O operations, timers, DOM events. Lower priority than microtasks.

<b>Microtask Queue:</b> Holds microtasks, executed before the next repaint. Higher priority than tasks. Includes Promises, mutation observer callbacks, etc.

---

### How to stop an fetch request ?

To stop a Fetch request, you can use the AbortController and AbortSignal interfaces, which allow you to signal the fetch request to abort. Here's an example:

```javascript
const controller = new AbortController();
const signal = controller.signal;

fetch(url, { signal })
  .then((response) => response.json())
  .then((data) => {
    // Process the fetched data
  })
  .catch((error) => {
    if (error.name === "AbortError") {
      console.log("Fetch aborted.");
    } else {
      console.error("Error fetching data:", error);
    }
  });

// To abort the request, call the `abort` method on the controller
controller.abort();
```

---

### How to destroy setTimeout call ?

To cancel a setTimeout call before it executes, you can use the clearTimeout function and pass the timer ID returned by the setTimeout function. Here's an example:

```javascript
const timerId = setTimeout(() => {
  console.log("This message will not be shown.");
}, 2000);

// To cancel the setTimeout call
clearTimeout(timerId);
```

---

### How will you implement denounce or throttle function for a search field ?

Debouncing and throttling are techniques used to control the frequency of event execution, such as when handling search input to reduce unnecessary API calls. Here's an example of implementing debounce for a search field:

```javascript
function debounce(func, delay) {
  let timeoutId;

  return function (...args) {
    clearTimeout(timeoutId);
    timeoutId = setTimeout(() => func.apply(this, args), delay);
  };
}

const searchInput = document.getElementById("searchInput");
const searchHandler = () => {
  // Your search logic here
};

const debouncedSearchHandler = debounce(searchHandler, 300);
searchInput.addEventListener("input", debouncedSearchHandler);
```

---

### How will you get result of two promises in onetime ?

To get results from two promises simultaneously, you can use Promise.all. It takes an array of promises and returns a new promise that fulfills with an array of all resolved values or rejects with the reason of the first rejected promise. Here's an example:

```javascript
const promise1 = fetch(url1).then((response) => response.json());
const promise2 = fetch(url2).then((response) => response.json());

Promise.all([promise1, promise2])
  .then(([result1, result2]) => {
    // Use result1 and result2 here
  })
  .catch((error) => {
    // Handle errors here
  });
```

---

### Difference between this binding in regular function vs. Arrow function ?

In regular functions, the value of this is determined by how the function is called. It can change depending on the calling context. For example, when a function is called as a method of an object, this refers to the object. When called in the global scope, this typically refers to the global object (e.g., window in the browser, global in Node.js).

In contrast, arrow functions do not have their own this context. Instead, they inherit the value of this from the surrounding scope (the closest non-arrow function). This behavior is called "lexical this."

---

### Difference between mobile first and desktop first approach ?

<b>Mobile First Approach:</b> Prioritizes mobile devices, with CSS styles written for mobile layouts first and then adapted for larger screens using media queries. Focuses on speed and simplicity for smooth mobile experiences.

<b>Desktop First Approach:</b> Focuses on desktop computers initially, with CSS styles tailored for larger screens. May use graceful degradation to adjust layouts for smaller screens, but primary focus is on desktop optimization.

---

### What is stringify?

IN a JSON method, stringify is used to transform a JavaScript object into a string.
JSON is a common structure to receive and send data between the web server and
the client, and when we wish to send data to the webserver, the object ought to be a
string

---

### State the difference between == and ===?

== denotes abstract equality operator, and it inspects if two values are equal or not apart from their data types. Automatically, it transforms the type of both the operands and compares them.
Example:

```javascript
1 == "1"; //true
1 == 1; // true
```

=== denotes identity equality operator, and it inspects the values of both the
operands and their data type. The outcome of the operation will be true considering
both the operands are equal and have the same data type, or else it returns false.

Example:

```javascript
1 === 1; //true
1 === "1"; // false
```

---

### Immediately Invoked Function Expression (IIFE)

An IIFE is a JavaScript design pattern that involves defining and immediately executing a function. It encapsulates code within its own scope, avoiding variable conflicts with other parts of the program. The function is invoked as soon as it's defined, making it a self-invoking anonymous function.

---

### How does priority queue works

A priority queue is a data structure that stores elements along with their associated priorities. It allows efficient retrieval and removal of the element with the highest (or lowest) priority. The basic idea of how a priority queue works can be summarized in the following steps:

1. **Insertion:** Elements are inserted into the priority queue along with their priority values. The priority value determines the order in which elements will be retrieved from the queue.

2. **Priority Order Maintenance:** The priority queue maintains the elements in a way that ensures the highest priority element is at the front of the queue, making it easily accessible.

3. **Retrieval:** When you want to access an element from the priority queue, you can retrieve the element with the highest priority (in a max priority queue) or the lowest priority (in a min priority queue) without having to search through the entire data structure.

4. **Removal:** After retrieval, the element is usually removed from the priority queue, and the structure is updated to maintain its priority order.

5. **Time Complexity:** The efficiency of a priority queue depends on its underlying implementation. Common implementations like binary heaps or Fibonacci heaps ensure that insertion, retrieval, and removal operations can be performed in O(log n) time complexity, where n is the number of elements in the priority queue.

In summary, a priority queue is designed to efficiently manage elements based on their priorities, allowing quick access to the element with the highest (or lowest) priority.

---

### Web APIs - SOAP, REST API, Rate Limiting

Web APIs (Application Programming Interfaces) are sets of rules and protocols that allow different software applications to communicate and interact with each other over the internet. They enable developers to access certain functionalities or data of a service or application without requiring direct access to the underlying code.

1. SOAP (Simple Object Access Protocol) API: SOAP is a protocol for exchanging structured information in web services. It uses XML as the message format and typically operates over HTTP or SMTP. SOAP APIs provide a standardized way for different systems to communicate and are often used in enterprise environments due to their strict contract-based approach.

2. REST (Representational State Transfer) API: REST is an architectural style for designing networked applications, and REST APIs are built based on this style. REST APIs use standard HTTP methods (GET, POST, PUT, DELETE) to perform CRUD (Create, Read, Update, Delete) operations on resources. They typically use lightweight data formats like JSON or XML for data exchange and are widely used due to their simplicity and scalability.

3. Rate Limiting: Rate limiting is a technique used by APIs to control the number of requests a user or client can make within a specific time period. It helps prevent abuse or overloading of the API servers and ensures fair usage across all clients. Rate limits are usually defined in requests per second (RPS) or requests per minute (RPM) and are enforced by the server. When a client exceeds the allowed rate, the server may respond with an error or delay the requests until the rate limit window resets.

---

### Explain the concept of RESTful API versioning.

RESTful API versioning is a practice used to manage changes and updates to a web API while ensuring backward compatibility. It involves creating distinct versions of the API to handle different implementations and modifications without disrupting existing clients' functionality

---

### Redux vs. Flux

Flux is an architectural pattern for managing application state, and Redux is a specific implementation of that pattern. Redux is heavily influenced by Flux but has some differences, such as using a single store, immutable state, and pure reducers.

---

### Redux Saga

Redux Saga is a middleware library for Redux that helps manage side effects, such as handling asynchronous actions, API calls, and more. It uses generator functions to make handling asynchronous actions more readable and maintainable.

---

### mapStateToProps() vs. mapDispatchToProps()

These are functions used to connect Redux state and actions to React component props.

- `mapStateToProps()` is used to map parts of the Redux state to the component props.
- `mapDispatchToProps()` is used to map Redux actions to the component props.

---

### Is javascript a statically typed or a dynamically typed language?

JavaScript is a dynamically typed language. In a dynamically typed language, the
type of a variable is checked during run-time in contrast to a statically typed
language, where the type of a variable is checked during compile-time

---

### Explain passed by value and passed by reference.

- **Passed by value:** In this method of parameter passing, a copy of the value is made, and the copy is sent to the function or method as an argument. Any changes made to the parameter inside the function do not affect the original variable outside the function.

- **Passed by reference:** In this method of parameter passing, the memory address (reference) of the variable is sent to the function as an argument. As a result, any changes made to the parameter inside the function directly affect the original variable outside the function.

---

### What is a Temporal Dead Zone?

Temporal Dead Zone is a behaviour that occurs with variables declared using let and
const keywords. It is a behaviour where we try to access a variable before it is
initialized.

---

### Write a polyfill of map function ?

```javascript
// Check if the native map function is not available (polyfill only if needed)
if (!Array.prototype.map) {
  Array.prototype.map = function (callback, thisArg) {
    if (typeof callback !== "function") {
      throw new TypeError("Callback must be a function");
    }

    const arr = this;
    const newArr = [];
    const len = arr.length;

    for (let i = 0; i < len; i++) {
      if (i in arr) {
        // Call the callback with the current element, index, and the original array
        const result = callback.call(thisArg, arr[i], i, arr);

        // Add the result of the callback to the new array
        newArr.push(result);
      }
    }

    return newArr;
  };
}
```

This polyfill checks if the native `map` function is available on the `Array.prototype`. If it's not available (i.e., `!Array.prototype.map`), it defines the `map` function on the prototype.

The `map` function takes two parameters: a callback function and an optional `thisArg` to be used as the context when calling the callback. It iterates through the array, calling the callback function for each element, and creates a new array with the results returned by the callback.

This polyfill ensures that the `map` function behaves as expected and is available on older browsers or environments that do not support it natively. However, modern environments and browsers generally already have the `map` function built into the `Array.prototype`, so you usually won't need this polyfill in modern web development.

---

### How will I check whether the response of an API is an integer (Not Number) ?

```javascript
function isInteger(value) {
  return typeof value === "number" && Number.isInteger(value);
}

// Example usage with API response
fetch("https://api.example.com/data")
  .then((response) => response.json())
  .then((data) => {
    if (isInteger(data)) {
      console.log("The API response is an integer.");
    } else {
      console.log("The API response is not an integer.");
    }
  })
  .catch((error) => {
    console.error("Error fetching data:", error);
  });
```
