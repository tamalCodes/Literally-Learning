---
sidebar_position: 1
description: "Basic must know operations on arrays."
---

# Arrays

## Flatenning an array

Flatenning basically means converting a multi-dimensional or nested array into a one-dimensional array. You can use the `flat()` method to flatten an array. The `flat()` method creates a new array with all sub-array elements concatenated into it recursively up to the specified depth.

```js
const multiDimensionalArray = [1, 2, [3, 4, [5, 6]]];
console.log(multiDimensionalArray.flat()); // [1, 2, 3, 4, [5, 6]]
console.log(multiDimensionalArray.flat(2)); // [1, 2, 3, 4, 5, 6]
```

### With spread Operator

```js
const multiDimensionalArray = [1, 2, [3, 4, [5, 6]]];
console.log([].concat(...multiDimensionalArray)); // [1, 2, 3, 4, [5, 6]]
```


## Resizing an array

The length property of an array is useful to resize or empty an array quickly. Let's apply length property on number array to resize the number of elements from 5 to 2,

```js
var array = [1, 2, 3, 4, 5];
array.length = 2;
```


## Reversing an array

The `reverse()` method reverses the order of the elements in an array but it mutates the original array. Let's take a simple example to demonistrate this case,

```js
const originalArray = [1, 2, 3, 4, 5];
const newArray = originalArray.reverse();

console.log(newArray);
console.log(originalArray);
```

## Spread VS Rest Operator

The spread operator is used to split up array elements or object properties whereas the rest operator is used to merge a list of function arguments into an array. Let's take an example of both,

```js
// Spread operator
const oldArray = [1, 2, 3];
const newArray = [...oldArray, 4, 5]; // [1, 2, 3, 4, 5]

// Rest operator
function sortArgs(...args) {
  return args.sort();
}
```

### More details

Suppose your are not sure how many arguments you are going to pass to a function. In that case, you can use the rest operator to pass an indefinite number of arguments to a function. The rest operator is denoted by three dots `...` followed by the name of the array that will contain the rest of the arguments. The rest operator must be the last argument to a function.

```js
function sum(...args) {
  return args.reduce((a, b) => a + b, 0);
}

console.log(sum(1, 2, 3, 4));
```


The spread operator is the opposite of the rest operator. It allows you to spread an array into another array, or an object into another object. The spread operator is denoted by three dots `...` followed by the name of the array/object that you want to spread. The spread operator must be followed by something, otherwise it will throw an error.

```js
const arr1 = [1, 2, 3];
const arr2 = [4, 5, 6];

const arr3 = [...arr1, ...arr2];
console.log(arr3); // [1, 2, 3, 4, 5, 6]

const obj1 = { name: 'John', age: 22 };
const obj2 = { address: 'London', phone: '1234567890' };

const obj3 = { ...obj1, ...obj2 };
console.log(obj3); // { name: 'John', age: 22, address: 'London', phone: '1234567890' }
```

## Slice, Splice 👇🏻

### Slice

The **slice()** method returns the selected elements in an array as a new array object. It selects the elements starting at the given start argument, and ends at the given optional end argument without including the last element. If you omit the second argument then it selects till the end.

Some of the examples of this method are,

```js title="Slice method"
let arrayIntegers = [1, 2, 3, 4, 5];
let arrayIntegers1 = arrayIntegers.slice(0, 2);
let arrayIntegers2 = arrayIntegers.slice(2, 3);
let arrayIntegers3 = arrayIntegers.slice(4);
```

**Note:** Slice method won't mutate the original array but it returns the subset as a new array.

### Splice

The **splice()** method is used either adds/removes items to/from an array, and then returns the removed item. The first argument specifies the array position for insertion or deletion whereas the optional second argument indicates the number of elements to be deleted. Each additional argument is added to the array.

Some of the examples of this method are,

```js
let arrayIntegersOriginal1 = [1, 2, 3, 4, 5];
let arrayIntegersOriginal2 = [1, 2, 3, 4, 5];
let arrayIntegersOriginal3 = [1, 2, 3, 4, 5];

let arrayIntegers1 = arrayIntegersOriginal1.splice(0, 2); // returns [1, 2]; original array: [3, 4, 5]
let arrayIntegers2 = arrayIntegersOriginal2.splice(3); // returns [4, 5]; original array: [1, 2, 3]
let arrayIntegers3 = arrayIntegersOriginal3.splice(3, 1, "a", "b", "c"); //returns [4]; original array: [1, 2, 3, "a", "b", "c", 5]
```

**Note:** Splice method modifies the original array too and returns the deleted array.


## Shallow Copy VS Deep Copy

There are two ways to copy an object,

**Shallow Copy:**
Shallow copy is a bitwise copy of an object. A new object is created that an exact copy of the values in the original object. If any of the fields of object are references to other objects, just the reference addresses are i.e., only the memory address is copied.

```js
var empDetails = {
  name: "John",
  age: 25,
  expertise: "Software Developer",
};
```

to create a duplicate

```js
var empDetailsShallowCopy = empDetails; //Shallow copying!
```

if we change some property value in the duplicate one like this:

```js
empDetailsShallowCopy.name = "Johnson";
```

The above statement will also change the name of `empDetails`, since we have a shallow copy. That means we're losing the original data as well.

**Deep copy:**
A deep copy copies all fields, and makes copies of dynamically allocated memory pointed to by the fields. A deep copy occurs when an object is copied along with the objects to which it refers.

```js
var empDetails = {
  name: "John",
  age: 25,
  expertise: "Software Developer",
};
```

Create a deep copy by using the properties from the original object into new variable

```js
var empDetailsDeepCopy = {
  name: empDetails.name,
  age: empDetails.age,
  expertise: empDetails.expertise,
};
```

Now if you change `empDetailsDeepCopy.name`, it will only affect `empDetailsDeepCopy` & not `empDetails`


## How do you get unique values of an array

You can get unique values of an array with the combination of `Set` and rest expression/spread(...) syntax.

```js
console.log([...new Set([1, 2, 4, 4, 3])]); // [1, 2, 4, 3]
```
