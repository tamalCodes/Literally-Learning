# Question

Given an integer n, return a counter function. This counter function initially returns n and then returns 1 more than the previous value every subsequent time it is called `(n, n + 1, n + 2, etc)`.

# Code

```js
const createCounter = (n) => {
  return function () {
    console.log(n++);
  };
};

const counter = createCounter(10);
counter();
counter();
counter();
counter();
```

# So what's happening here?

- `createCounter` is a function which takes in a number and returns a function. The function returned by `createCounter` is a closure. It has access to the variable `n` which was passed to `createCounter`. <br/><br/>

- The variable n is a free variable. A free variable is one which is not a local variable nor a parameter of the function. <br/><br/>

- As in closures we can remember the value of the free variable n even after the function `createCounter` has finished executing. <br/><br/>

- So when we call `counter()` for the first time, it prints 10. Then it increments the value of n to 11. When we call counter() again, it prints 11 and increments the value of n to 12 and so on
