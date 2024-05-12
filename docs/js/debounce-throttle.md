---
sidebar_position: 7
description: "Understanding debouncing and throttling in JavaScript."
---

# Debouncing and Throttling



## Debouncing

Debouncing is a programming practice used to ensure that time-consuming tasks do not fire so often, that it stalls the performance of the web page. In other words, it limits the rate at which a function gets invoked. Suppose we have an input box and we are constantly listening to the input event on that input box. Now, if we want to perform some action on every input event, then we can do that. But, if we want to perform some action after the user has stopped typing, then we can use debouncing.

```js
// Simplified debounce function
const debounce = (func, delay) => {
    let timeoutId;
    return (...args) => {
        clearTimeout(timeoutId);
        timeoutId = setTimeout(() => {
            func(...args);
        }, delay);
    };
};

// Example usage of debounce function with a basic input event
const inputElement = document.getElementById('input');

// Function to be debounced
const handleInput = (event) => {
    console.log('Input value:', event.target.value);
};

// Debounce the handleInput function with a delay of 500 milliseconds
const debouncedInputHandler = debounce(handleInput, 500);

// Attach the debounced function to the input event
inputElement.addEventListener('input', debouncedInputHandler);


```


### Understanding details

- In our initial function, `handleInput`, we can replace it with any functionality we desire, such as making an API call or performing any other task. This function is triggered after the user has finished typing.
- The `debounce` function is the heart of our debouncing mechanism. It accepts two arguments: the `function` we want to execute after the user stops typing and the `delay` after which we want to execute that function.
- Subsequently, `debouncedInputHandler` stores the crucial function returned by the `debounce` function. This function will be invoked later when needed.
- Finally, we attach an event listener to our input element, where we invoke the `debouncedInputHandler` function along with the text input by the user.

### Workflow

- When the user starts typing, the `debouncedInputHandler` function is called with the text that the user is typing.

- Remember that the `debounce` function returns a crucial function, which we store in the `debouncedInputHandler` variable. Now, we execute this function by passing `inputText`.

- Upon invoking the `debouncedInputHandler` function, it clears any previously set timer to maintain a fresh timer. This ensures that the `handleInput` function will only execute after the most recent delay, unaffected by any prior calls.

- The `debounced` function will execute the `handleInput` function only after the specified delay (500ms), ensuring that it is triggered only when there are no further calls within that delay period.



## Throttling

Throttling is a technique in which, no matter how many times the user fires the event, the attached function will be executed only once in a given time interval. Suppose we have an input box and we are constantly listening to the input event on that input box. Now, if we want to perform some action on every input event, then we can do that. But, if we want to perform some action after a certain interval of time, then we can use throttling.

```js
// Throttle function
const throttle = (func, delay) => {
    let lastCall = 0;
    return (...args) => {
        const now = new Date().getTime();
        if (now - lastCall < delay) return;
        lastCall = now;
        func(...args);
    };
};

// Example usage of throttle function with a basic button click event
const button = document.getElementById('button');

// Function to be throttled
const handleClick = () => {
    console.log('Button clicked!');
};

// Throttle the handleClick function with a delay of 1000 milliseconds
const throttledClickHandler = throttle(handleClick, 1000);

// Attach the throttled function to the button click event
button.addEventListener('click', throttledClickHandler);
```

### Understanding details

- In our example, we have a simple button click event that triggers the `handleClick` function.
- The `throttle` function is responsible for controlling the frequency of function execution. It accepts two arguments: the `function` we want to throttle and the `delay` between each execution.
- `throttle` ensures that the provided function is not executed more frequently than the specified delay.
- We create a throttled version of the `handleClick` function using `throttle(handleClick, 1000)`, which means `handleClick` will be executed at most once every 1000 milliseconds.
- This throttled version of `handleClick` is stored in `throttledClickHandler`.
- We attach `throttledClickHandler` to the button click event, ensuring that the button click triggers the throttled function.

### Workflow

- When the button is clicked, the throttled version of the `handleClick` function (`throttledClickHandler`) is invoked.
- The `throttle` function ensures that `handleClick` is executed at most once every 1000 milliseconds.
- If the button is clicked multiple times within the 1000ms interval, only the first click will trigger the `handleClick` function. Subsequent clicks will be ignored until the next 1000ms interval begins.


