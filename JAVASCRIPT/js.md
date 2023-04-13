## What are the different data types present in javascript?

To know the type of a JavaScript variable, we can use the typeof operator.

###  Primitive types

**String** - It represents a series of characters and is written with quotes. A string can be represented using a single or a double quote.



```js
var str = "Vivek Singh Bisht"; //using double quotes
var str2 = 'John Doe'; //using single quotes
```

**Number** - It represents a number and can be written with or without decimals.

```js
var x = 3; //without decimal
var y = 3.6; //with decimal
```
**BigInt** - This data type is used to store numbers which are above the limitation of the Number data type. It can store large integers and is represented by adding “n” to an integer literal.


```js
var bigInteger =  234567890123456789012345678901234567890;
```

**Boolean** - It represents a logical entity and can have only two values : true or false. Booleans are generally used for conditional testing.


```js
var a = 2;
var b =  3;
var c =  2;
(a == b) // returns false
(a == c) //returns true
```

**Undefined** - When a variable is declared but not assigned, it has the value of undefined and it’s type is also undefined.


```js
var x; // value of x is undefined
var y = undefined; // we can also set the value of a variable as undefined
```


**Null** - It represents a non-existent or a invalid value.


```js
var z = null;
```


**Symbol** - It is a new data type introduced in the ES6 version of javascript. It is used to store an anonymous and unique value.


```js
var symbol1 = Symbol('symbol');
typeof of primitive types :
typeof "John Doe" // Returns "string"
typeof 3.14 // Returns "number"
typeof true // Returns "boolean"
typeof 234567890123456789012345678901234567890n // Returns bigint
typeof undefined // Returns "undefined"
typeof null // Returns "object" (kind of a bug in JavaScript)
typeof Symbol('symbol') // Returns Symbol
```


### Non-primitive types

Primitive data types can store only a single value. To store multiple and complex values, non-primitive data types are used.
Object - Used to store collection of data.


Example:
```js
// Collection of data in key-value pairs

var obj1 = {
   x:  43,
   y:  "Hello world!",
   z: function(){
      return this.x;
   }
}
      
// Collection of data as an ordered list
     
var array1 = [5, "Hello", true, 4.1]; 
```

**Note**- It is important to remember that any data type that is not a primitive data type, is of Object type in javascript.


## Explain Hoisting in javascript.

Hoisting is the default behaviour of javascript where all the variable and function declarations are moved on top.