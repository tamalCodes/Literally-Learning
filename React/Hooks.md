<!-- TOC -->

- [What are even hooks ?](#what-are-even-hooks-)
- [How did hooks help us ?](#how-did-hooks-help-us-)
- [What are states in component ?](#what-are-states-in-component-)
  - [Before hooks did the components have state ?](#before-hooks-did-the-components-have-state-)
  - [If we have `const x = 10;` is that a state too ?](#if-we-have-const-x--10-is-that-a-state-too-)
- [What is lifecycle ?](#what-is-lifecycle-)
  - [Mounting Phase:](#mounting-phase)
  - [Updating Phase:](#updating-phase)
  - [Error Handling Phase:](#error-handling-phase)
- [`UseMemo()` hook](#usememo-hook)
- [`UseCallback()` hook](#usecallback-hook)
  - [A more detailed explanation](#a-more-detailed-explanation)
- [`useContext()` Hook](#usecontext-hook)
- [What is the difference between useRef and useState ?](#what-is-the-difference-between-useref-and-usestate-)
- [Difference between `useMemo()` and `useCallback()` ?](#difference-between-usememo-and-usecallback-)

<!-- /TOC -->



# What are even hooks ? 

Well they are functions that let you "hook into" React state and lifecycle features from function components. Hooks don't work inside classes — they let you use React without classes.

# How did hooks help us ? 

Hooks revolutionized React development by simplifying state management, promoting reusability, and enhancing the separation of concerns in components. They eliminated the need for class-based components and complex lifecycle methods, leading to cleaner and more organized code. Custom hooks further extended the benefits of hooks, allowing developers to create reusable, encapsulated logic. The introduction of hooks significantly improved the coding experience, making React development more intuitive, efficient, and maintainable.

# What are states in component ?

State is a JavaScript object that stores a component's dynamic data and determines the component's behavior. It is managed internally by the component itself and can only be updated by the component itself. State is used to store data that can change over time, such as user input, network responses, and UI events.

## Before hooks did the components have state ? 

Yes, before the introduction of hooks in React, components could still have state. Stateful components were commonly created using class-based components, where state was managed through the this.state property. Class-based components had a constructor method to initialize the state and various lifecycle methods (e.g., componentDidMount, componentDidUpdate, etc.) to handle state updates and side effects.

```js
import React, { Component } from 'react';

class Counter extends Component {
  constructor(props) {
    super(props);
    this.state = {
      count: 0,
    };
  }

  incrementCount() {
    this.setState({ count: this.state.count + 1 });
  }

  render() {
    return (
      <div>
        <p>Count: {this.state.count}</p>
        <button onClick={() => this.incrementCount()}>Increment</button>
      </div>
    );
  }
}
```

While class-based components were widely used, they sometimes led to complex and less reusable code. Hooks were introduced as a way to simplify state management and side effects in functional components, making it easier to work with state and promoting better code organization and reusability.

## If we have `const x = 10;` is that a state too ?

No, const x = 10; is not considered state in the context of React components.

In React, "state" refers to any data that can change over time and affects the rendering of a component. It is used to manage dynamic values that can be modified and trigger re-rendering of the component when they change.

The code const x = 10; is simply assigning the value 10 to a constant variable x, which means x has a fixed value of 10 throughout the component's life cycle. This is not considered state because it doesn't change during the component's rendering or interaction with the user.

In contrast, React state is typically used when you want to track and update data that can change in response to user actions, network requests, or other events. This dynamic behavior is what makes state essential for building interactive and responsive user interfaces.


# What is lifecycle ?

In React, the term "lifecycle" refers to the different stages that a component goes through from its creation to its removal from the DOM. During each stage of a component's lifecycle, React provides developers with specific methods that can be overridden to perform actions or handle behaviors related to that particular stage.

The React component lifecycle can be divided into three main phases:

## Mounting Phase:

This is the initial phase when a component is being created and inserted into the DOM.
It involves methods that are called when the component is being mounted.
Lifecycle methods in this phase are called in the following order: constructor(), static getDerivedStateFromProps(), render(), and componentDidMount().


## Updating Phase:

This phase occurs when a component's props or state change, causing it to re-render.
It involves methods that are called when the component is being updated.
Lifecycle methods in this phase are called in the following order: static getDerivedStateFromProps(), shouldComponentUpdate(), render(), getSnapshotBeforeUpdate(), and componentDidUpdate().
Unmounting Phase:

This phase occurs when a component is being removed from the DOM.
It involves methods that are called when the component is being unmounted.
The only lifecycle method in this phase is componentWillUnmount(), which allows developers to perform cleanup tasks before the component is removed.
Additionally, there is a newer error handling phase introduced in React 16:

## Error Handling Phase:
This phase is related to handling errors that occur during rendering, lifecycle methods, or inside child components.
It involves two error handling methods: static getDerivedStateFromError() and componentDidCatch().
It's essential to understand the component lifecycle because it provides developers with opportunities to perform specific tasks at different stages of a component's existence. However, with the introduction of React Hooks, the traditional class-based lifecycle methods are being replaced in favor of using functional components with hooks like useState, useEffect, etc. These hooks provide a more straightforward and predictable way to manage component behavior without relying on class components and their lifecycle methods.



# `UseMemo()` hook

The `useMemo()`  is a React Hook that lets you cache the result of a calculation between re-renders. This can be useful when you have a calculation that is expensive to perform, such as a complex algorithm or a database query.

```js
import React, { useMemo } from 'react';

function MyComponent() {
  const [count, setCount] = useState(0);

  const result = useMemo(() => {
    // Perform expensive calculation here
    return count * 2;
  }, [count]);

  return (
    <div>
      <div>Result: {result}</div>
      <button onClick={() => setCount(count + 1)}>Increment</button>
    </div>
  );
}
```

This will be called only when the count state changes & when the component is re-rendered.

# `UseCallback()` hook

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

## A more detailed explanation 

See everytime a component re-renders, all of its functions are re-created. This is because functions are objects in JavaScript, and objects are created every time they are referenced. 

UseCallback will preserve the identity of the function between re-renders, so that it is only re-created when one of its dependencies changes. This can be useful when you have a function that is expensive to create, such as a function that performs a complex calculation or a database query.

```js
# `useReducer()` Hook

useReducer is a hook for state management, much like useState, and relies upon a kind of function called a reducer.

Reducers btw are just pure functions that take the previous state and an action, and return the next state.

useReducer can be used in many of the same ways that useState can, but is more helpful for managing state across multiple components that may involve different operations or "actions".

You will need to reach for useReducer less than useState around your app. But it is very helpful as a powerful means of managing state in smaller applications, rather than having to reach for a third-party state management library like Redux.

```jsx

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

# `useContext()` Hook

useContext is a React Hook that lets you read and subscribe to context from your component. It's similar to the useState hook, but instead of managing state, it lets you access context from anywhere in your component tree.

```jsx
```



# What is the difference between useRef and useState ?

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

# Difference between `useMemo()` and `useCallback()` ?

useMemo and useCallback are both hooks in React that help optimize the performance of functional components by memoizing values or functions. Let's break down their differences in simple terms:

useMemo: This hook is used to memoize a value and recompute it only when its dependencies change. It takes a function and an array of dependencies as arguments. The function is executed initially and whenever any dependency in the array changes. The result of the function is stored and returned as the memoized value.


```jsx
import React, { useMemo } from 'react';

const MyComponent = ({ a, b }) => {
  const sum = useMemo(() => {
    console.log('Computing sum...');
    return a + b;
  }, [a, b]);

  return <div>{sum}</div>;
};
```

In this example, the sum value is memoized using useMemo. The function inside useMemo computes the sum of a and b. If either a or b changes, the function will recompute the sum and update the memoized value. Otherwise, it will use the previously memoized value without recomputing.

useCallback: This hook is used to memoize a function and return the same instance of the function until its dependencies change. It takes a function and an array of dependencies as arguments. The function is memoized and returned as a callback. The callback will remain the same unless any of the dependencies change.

```jsx
import React, { useCallback } from 'react';

const MyComponent = ({ onClick }) => {
  const handleClick = useCallback(() => {
    console.log('Button clicked!');
    onClick();
  }, [onClick]);

  return <button onClick={handleClick}>Click me</button>;
};
```

In this example, the handleClick function is memoized using useCallback. The function is defined inline and will be memoized. If the onClick dependency changes, the memoized function will be updated. Otherwise, it will return the same function instance, preventing unnecessary re-renders of child components that receive handleClick as a prop.

To summarize, useMemo is used to memoize a value and recomputes it when dependencies change, while useCallback is used to memoize a function and return the same function instance unless dependencies change. Both hooks help optimize performance by preventing unnecessary re-computations or re-renders.





