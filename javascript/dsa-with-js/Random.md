<!-- TOC -->

- [Given me an array, insert a element in an array, without replacing](#given-me-an-array-insert-a-element-in-an-array-without-replacing)
- [Given me an array, delete a element in an array](#given-me-an-array-delete-a-element-in-an-array)
- [Make me a fibo series generator](#make-me-a-fibo-series-generator)
- [Make a function to check if a number is a power of 2](#make-a-function-to-check-if-a-number-is-a-power-of-2)

<!-- /TOC -->

## Given me an array, insert a element in an array, without replacing

```js
var arr = [1, 2, 3, 4, 5, 6, 7, 8];

const insertAtPos = (index, n) => {
  arr = [...arr.slice(0, index), n, ...arr.slice(index, arr.length)];
};

insertAtPos(4, 10);
console.log(arr[4]);
```

## Given me an array, delete a element in an array

```js
const deleteAtPos = (index) => {
  arr = [...arr.slice(0, index), ...arr.slice(index + 1, arr.length)];
};

deleteAtPos(4);
console.log(arr);
```

## Make me a fibo series generator

```js
function fibo(n) {
  var arr = [0, 1];

  if (n < 3) return arr.slice(0, n);

  for (let i = 0; i < n - 2; i++) arr.push(arr[i] + arr[i + 1]);

  return arr;
}

console.log(fibo(2));
```

In this case if we need fibonacci of less than 3, then depending on the input we return the array. If the input is 2, then we return the array with 2 elements, if the input is 1, then we return the array with 1 element.

Otherwise we loop from 0 to n-2 and push the sum of the last two elements in the array.

```js
arr = [0, 1];

arr.push(arr[i] + arr[i + 1]); // 0 + 1 = 1 || arr = [0,1,1]
arr.push(arr[i] + arr[i + 1]); // 1 + 1 = 2 || arr = [0,1,1,2]
arr.push(arr[i] + arr[i + 1]); // 1 + 2 = 3 || arr = [0,1,1,2,3]
arr.push(arr[i] + arr[i + 1]); // 2 + 3 = 5 || arr = [0,1,1,2,3,5]
```

## Make a function to check if a number is a power of 2

```js
function isPowerofTwo(n) {
  while (n > 1) {
    if (n % 2 !== 0) {
      console.log("Not a power of Two");
      return;
    }
    n = n / 2;
  }

  console.log("Power of Two");
}

isPowerofTwo(8);
```

In this case we take the number and mod it by 2 if I get remainders then it is not a power of 2. If I don't get any remainders then I divide the number by 2 and repeat the process. If the function is nor returned by the time the number is 1, then it is a power of 2.

````js
var message = "Global message";


function demo() {
  var message = "Function scoped Message";

  const object = {
    message: "Property inside object",
    logger: () => {
      console.log(this.message);
    },
  };
  object.logger();
}

demo();
`````


asdasd