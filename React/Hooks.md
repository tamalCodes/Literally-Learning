<!-- TOC -->

- [Hooks in react](#hooks-in-react)
  - [`UseMemo()` hook](#usememo-hook)
  - [`UseCallback()` hook](#usecallback-hook)
  - [`useReducer()` Hook](#usereducer-hook)
  - [`useContext()` Hook](#usecontext-hook)
  - [What is the difference between useRef and useState ?](#what-is-the-difference-between-useref-and-usestate-)
  - [Difference between `useMemo()` and `useCallback()` ?](#difference-between-usememo-and-usecallback-)

<!-- /TOC -->




# Hooks in react

## `UseMemo()` hook

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

## `UseCallback()` hook

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

## `useReducer()` Hook

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

## `useContext()` Hook

useContext is a React Hook that lets you read and subscribe to context from your component. It's similar to the useState hook, but instead of managing state, it lets you access context from anywhere in your component tree.

```jsx
```



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

## Difference between `useMemo()` and `useCallback()` ?

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





