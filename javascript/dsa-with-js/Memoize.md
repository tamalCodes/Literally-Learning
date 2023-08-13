
# Question

Write a function called `memoize` that takes in a function and returns a memoized version of that function. The returned version of the function should cache the results of the function call and return this when the same input is provided again.

# Code

```js
function memoize(func) {
  const cache = {};

  return function (...args) {
    const key = JSON.stringify(args);

    if (!(key in cache)) {
      let sum = func(...args);
      cache[key] = sum;
    }

    return cache[key];
  };
}

function addition(x, y) {
  console.log(`Calculating for ${x}, ${y}`);
  return x + y;
}

const memoizedCalculation = memoize(addition);

const result1 = memoizedCalculation(5, 10);
const result2 = memoizedCalculation(5, 10);

console.log(result1);
console.log(result2);
```

# What's happening here ? 

`memoize()` takes in a function `func`. It has a `cache` object which will store the results of the function call. It returns a function which takes in `...args` basically any number of arguments.

Then it makes a key, say input was `[2,3]`, the key will be `"[2,3]"`. With this key, now it checks in cache, key isn't there. SO it calls the function with the arguments `func(...args);` 

The `func` is `addition` which returns the sum of the arguments. Now the sum is stored in the cache with the key `cache["[2,3]"] = 5`. And then we return the sum which is `cache[key]`.