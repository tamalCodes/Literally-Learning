# What is collation

Collation is used for sorting a set of strings and searching within a set of strings. It is parameterized by locale and aware of Unicode. Let's take comparison and sorting features,

1. **Comparison:**

 ```javascript
 var list = ["ä", "a", "z"]; // In German,  "ä" sorts with "a" Whereas Swedish, "ä" sorts after "z"
 var l10nDE = new Intl.Collator("de");
 var l10nSV = new Intl.Collator("sv");
 console.log(l10nDE.compare("ä", "z") === -1); // true
 console.log(l10nSV.compare("ä", "z") === +1); // true
 ```

2. **Sorting:**

```javascript
var list = ["ä", "a", "z"]; // In German,  "ä" sorts with "a" Swedish, "ä" sorts after "z"
var l10nDE = new Intl.Collator("de");
var l10nSV = new Intl.Collator("sv");
console.log(list.sort(l10nDE.compare)); // [ "a", "ä", "z" ]
console.log(list.sort(l10nSV.compare)); // [ "a", "z", "ä" ]
```

# What is for...of statement

The for...of statement creates a loop iterating over iterable objects or elements such as built-in String, Array, Array-like objects (like arguments or NodeList), TypedArray, Map, Set, and user-defined iterables. The basic usage of for...of statement on arrays would be as below,

```javascript
let arrayIterable = [10, 20, 30, 40, 50];

for (let value of arrayIterable) {
  value++;
  console.log(value); // 11 21 31 41 51
}
```

# What is the output of below spread operator array

     ```javascript
     [..."John Resig"];
     ```

     The output of the array is ['J', 'o', 'h', 'n', '', 'R', 'e', 's', 'i', 'g']
     **Explanation:** The string is an iterable type and the spread operator within an array maps every character of an iterable to one element. Hence, each character of a string becomes an element within an Array.


# Is JavaScript faster than server side script

Yes, JavaScript is faster than server side scripts. Because JavaScript is a client-side script it does not require any web server’s help for its computation or calculation. So JavaScript is always faster than any server-side script like ASP, PHP, etc.



1.   # How do you combine two or more arrays

     The concat() method is used to join two or more arrays by returning a new array containing all the elements. The syntax would be as below,

     ```javascript
     array1.concat(array2, array3, ..., arrayX)
     ```

     Let's take an example of array's concatenation with veggies and fruits arrays,

     ```javascript
     var veggies = ["Tomato", "Carrot", "Cabbage"];
     var fruits = ["Apple", "Orange", "Pears"];
     var veggiesAndFruits = veggies.concat(fruits);
     console.log(veggiesAndFruits); // Tomato, Carrot, Cabbage, Apple, Orange, Pears
     ```

# What is the difference between Shallow and Deep copy

There are two ways to copy an object,

**Shallow Copy:**
Shallow copy is a bitwise copy of an object. A new object is created that an exact copy of the values in the original object. If any of the fields of object are references to other objects, just the reference addresses are i.e., only the memory address is copied.

    

```javascript
var empDetails = {
  name: "John",
  age: 25,
  expertise: "Software Developer",
};
```

to create a duplicate

```javascript
var empDetailsShallowCopy = empDetails; //Shallow copying!
```

if we change some property value in the duplicate one like this:

```javascript
empDetailsShallowCopy.name = "Johnson";
```

The above statement will also change the name of `empDetails`, since we have a shallow copy. That means we're losing the original data as well.

**Deep copy:**
A deep copy copies all fields, and makes copies of dynamically allocated memory pointed to by the fields. A deep copy occurs when an object is copied along with the objects to which it refers.

    

```javascript
 var empDetails = {
   name: "John",
   age: 25,
   expertise: "Software Developer",
 };
```

Create a deep copy by using the properties from the original object into new variable

```javascript
var empDetailsDeepCopy = {
  name: empDetails.name,
  age: empDetails.age,
  expertise: empDetails.expertise,
};
```

Now if you change `empDetailsDeepCopy.name`, it will only affect `empDetailsDeepCopy` & not `empDetails`



# How do you trim a string at the beginning or ending

The `trim` method of string prototype is used to trim on both sides of a string. But if you want to trim especially at the beginning or ending of the string then you can use `trimStart/trimLeft` and `trimEnd/trimRight` methods. Let's see an example of these methods on a greeting message,

```javascript
var greeting = "   Hello, Goodmorning!   ";

console.log(greeting); // "   Hello, Goodmorning!   "
console.log(greeting.trimStart()); // "Hello, Goodmorning!   "
console.log(greeting.trimLeft()); // "Hello, Goodmorning!   "

console.log(greeting.trimEnd()); // "   Hello, Goodmorning!"
console.log(greeting.trimRight()); // "   Hello, Goodmorning!"
```


# What is a thunk function

A thunk is just a function which delays the evaluation of the value. It doesn’t take any arguments but gives the value whenever you invoke the thunk. i.e, It is used not to execute now but it will be sometime in the future. Let's take a synchronous example,

```javascript
const add = (x, y) => x + y;

const thunk = () => add(2, 3);

thunk(); // 5
```

# What are asynchronous thunks

The asynchronous thunks are useful to make network requests. Let's see an example of network requests,

```javascript
function fetchData(fn) {
  fetch("https://jsonplaceholder.typicode.com/todos/1")
    .then((response) => response.json())
    .then((json) => fn(json));
}

const asyncThunk = function () {
  return fetchData(function getData(data) {
    console.log(data);
  });
};

asyncThunk();
```

The `getData` function won't be called immediately but it will be invoked only when the data is available from API endpoint. The setTimeout function is also used to make our code asynchronous. The best real time example is redux state management library which uses the asynchronous thunks to delay the actions to dispatch.




# What happens with negating an array

Negating an array with `!` character will coerce the array into a boolean. Since Arrays are considered to be truthy So negating it will return `false`.

```javascript
console.log(![]); // false
```

# What happens if we add two arrays

If you add two arrays together, it will convert them both to strings and concatenate them. For example, the result of adding arrays would be as below,

```javascript
console.log(["a"] + ["b"]); // "ab"
console.log([] + []); // ""
console.log(![] + []); // "false", because ![] returns false.
```



# How do you remove falsy values from an array

You can apply the filter method on the array by passing Boolean as a parameter. This way it removes all falsy values(0, undefined, null, false and "") from the array.

```javascript
const myArray = [false, null, 1, 5, undefined];
myArray.filter(Boolean); // [1, 5] // is same as myArray.filter(x => x);
```

# How do you get unique values of an array

You can get unique values of an array with the combination of `Set` and rest expression/spread(...) syntax.

```javascript
console.log([...new Set([1, 2, 4, 4, 3])]); // [1, 2, 4, 3]
```



# How do you map the array values without using map method

You can map the array values without using the `map` method by just using the `from` method of Array. Let's map city names from Countries array,

```javascript
const countries = [
  { name: "India", capital: "Delhi" },
  { name: "US", capital: "Washington" },
  { name: "Russia", capital: "Moscow" },
  { name: "Singapore", capital: "Singapore" },
  { name: "China", capital: "Beijing" },
  { name: "France", capital: "Paris" },
];

const cityNames = Array.from(countries, ({ capital }) => capital);
console.log(cityNames); // ['Delhi, 'Washington', 'Moscow', 'Singapore'Beijing', 'Paris']

```




# How do you rounding numbers to certain decimals

You can round numbers to a certain number of decimals using `toFixed` method from native javascript.

```javascript
let pie = 3.141592653;
pie = pie.toFixed(3); // 3.142
```

# What is the easiest way to convert an array to an object

You can convert an array to an object with the same data using spread(...) operator.

```javascript
var fruits = ["banana", "apple", "orange", "watermelon"];
var fruitsObject = { ...fruits };
console.log(fruitsObject); // {0: "banana", 1: "apple", 2: "orange", 3"watermelon"}
```

# How do you create an array with some data

You can create an array with some data or an array with the same values using `fill` method.

```javascript
var newArray = new Array(5).fill("0");
console.log(newArray); // ["0", "0", "0", "0", "0"]
```

# What are the placeholders from console object

Below are the list of placeholders available from console object,

1. %o — It takes an object,
2. %s — It takes a string,
3. %d — It is used for a decimal or integer


```javascript
const user = { name: "John", id: 1, city: "Delhi" };
console.log(
  "Hello %s, your details %o are available in the object form",
  "John",
  user
); // Hello John, your details {name: "John", id: 1, city: "Delhi"} available in object
```

# Is it possible to add CSS to console messages

Yes, you can apply CSS styles to console messages similar to html text on the web page.

```javascript
console.log(
  "%c The text has blue color, with large font and red background",
  "color: blue; font-size: x-large; background: red"
);
```


# What is the purpose of dir method of console object

The `console.dir()` is used to display an interactive list of the properties of the specified JavaScript object as JSON.

```javascript
const user = { name: "John", id: 1, city: "Delhi" };
console.dir(user);
```

# Is it possible to debug HTML elements in console

Yes, it is possible to get and debug HTML elements in the console just like inspecting elements.

```javascript
const element = document.getElementsByTagName("body")[0];
console.log(element);
```

# How do you display data in a tabular format using console object

The `console.table()` is used to display data in the console in a tabular format to visualize complex arrays or objects.

```js
const users = [
  { name: "John", id: 1, city: "Delhi" },
  { name: "Max", id: 2, city: "London" },
  { name: "Rod", id: 3, city: "Paris" },
];
console.table(users);
```


# How do you verify that an argument is a Number or not

The combination of IsNaN and isFinite methods are used to confirm whether an argument is a number or not.

```javascript
function isNumber(n) {
  return !isNaN(parseFloat(n)) && isFinite(n);
}
```

