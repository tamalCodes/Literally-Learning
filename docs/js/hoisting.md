---
sidebar_position: 4
description: "Scopes,Let, Var, Hoisting in JS in detail"
---


# Scopes and Hoisting


## Hoisting

Hoisting is a JavaScript mechanism where variables and function declarations are moved to the top of their scope before code execution. This means that if a variable is declared anywhere in a function, it is moved to the top of the function for execution regardless of whether the declaration is at the top of the function or not.

```js

function myFunction() {
  console.log(myVar); // undefined
  var myVar = "Hello";
  console.log(myVar); // "Hello"
}

myFunction();
```

In this example, the myVar variable is declared after the first console.log() statement, but it is still accessible within the function. This is because the declaration is hoisted to the top of the function before execution.

### Need for hoisting

Hoisting exists in JavaScript because it is a compiled language. This means that before JavaScript code is executed, it is first compiled into a format that is more suitable for execution. During this compilation process, variable and function declarations are moved to the top of their scope. This allows variables and functions to be used before they are declared.



### Hoisting `let` VS `var`

Consider this following code

```js
console.log(a);
console.log(b);
let a = 10;
var b = 20;

```

For `a` we would get `ReferenceError: Cannot access 'a' before initialization` and for `b` we would get a special placeholder of  `undefined`. This is because of hoisting.

### Hoisting `let` VS `const`

So both of them works the same way in terms of hoisting the only difference is that `const` is way more strict than `let`.


```js
let a;

// we can initialize it later
a = 10;

const b;
// this will give an error
```

This is because const is meant to be initialized at the time of declaration. We can't do it later on.


## Let and Var

### var

- var is function scoped when it is declared within a function. This means that it is available and can be accessed only within that function.
- var is global scoped when it is declared outside a function. This means that it is available and can be accessed throughout the program.

```js
function myFunction() {
  if (true) {
    var x = 10;
  }

  console.log(x); // Output: 10
}

myFunction();
```

In this example, the variable `x` is declared using var inside the if statement, but it is still accessible when we try to log its value outside the if statement. This is because var does not have true block scope; it creates function-scoped variables.

### let

- let is block scoped. A block is a set of statements wrapped in curly braces. We need to group statements together in a block when we want to execute them together. Each block has its own lexical scope.
- let is not hoisted to the top of its block. If a variable is declared using let, it is only available from the point at which it is declared until the end of the block.

```js
function myFunction() {
  if (true) {
    let y = 20;
    console.log(y); // Output: 20, as 'y' is declared and used inside the block
  }

  console.log(y); // Error: 'y' is not defined, as it is only accessible inside the block
}

myFunction();
```

In this example, the variable `y` is declared using let inside the if statement. When we try to log its value outside the if statement, we get an error because it is not accessible beyond the block where it was declared.


### Can I redeclare `let` and `const` variables

No, you cannot redeclare let and const variables. If you do, it throws below error

 ```bash
 Uncaught SyntaxError: Identifier 'someVariable' has already been declared
 ```

**Explanation:** The variable declaration with `var` keyword refers to a function scope and the variable is treated as if it were declared at the top of the enclosing scope due to hoisting feature. So all the multiple declarations contributing to the same hoisted variable without any error. Let's take an example of re-declaring variables in the same scope for both var and let/const variables.

```javascript
var name = "John";
function myFunc() {
  var name = "Nick";
  var name = "Abraham"; // Re-assigned in the same function block
  alert(name); // Abraham
}
myFunc();
alert(name); // John
```

The block-scoped multi-declaration throws syntax error,

```javascript
let name = "John";
function myFunc() {
  let name = "Nick";
  let name = "Abraham"; // Uncaught SyntaxError: Identifier 'name' has been declared
  alert(name);
}

myFunc();
alert(name);
```


### Is `const` immutable ?

No, the const variable doesn't make the value immutable. But it disallows subsequent assignments(i.e, You can declare with assignment but can't assign another value later)

 ```javascript
 const userList = [];
 userList.push("John"); // Can mutate even though it can't re-assign
 console.log(userList); // ['John']
 ```

### Temporal dead zone

The time between the variable being declared and being initialized is called the temporal dead zone.

```js
console.log(x);
console.log(a);
let a = 10;
```

In the above code, the temporal dead zone is between the `let a = 10` and `console.log(a)`. `a` will be assigned a value of `undefined` during the temporal dead zone.

There is a difference between the `ReferenceError` that we get for `x` and `a`. For `x` we get `ReferenceError: x is not defined` and for `a` we get `ReferenceError: Cannot access 'a' before initialization`. This is because `x` is not declared at all and `a` is declared but not initialized.

Also to keep in mind that we have a reserved space for `var` in the global scope and `let` & `const` in the block scope.


## Scopes

### Block scope

Block scope is the area within if, switch conditions or for and while loops. Generally speaking, whenever you see `{curly brackets}`, it is a block. In ES6, const and let keywords allow developers to declare variables in the block scope, which means those variables exist only within the corresponding block.

### Lexical scope

Lexical scope means that in a nested group of functions, the inner functions have access to the variables and other resources of their parent scope. This means that the child functions are lexically bound to the execution context of their parents. Lexical scope is sometimes also referred to as Static Scope.

### Global scope

Global scope refers to the context within which variables are accessible to every part of the program. If a variable is declared outside of all functions or curly braces (i.e. in the root of the program), it is said to be defined in the global scope.


### Detailed example

```js

let a = 10;

function myFunction() {
  let b = 20;

  function myInnerFunction() {
    let c = 30;
    console.log(a); // 10
    console.log(b); // 20
    console.log(c); // 30
  }

  myInnerFunction();
}

myFunction();

console.log(a); // 10

console.log(b); // ReferenceError: b is not defined

console.log(c); // ReferenceError: c is not defined

```

In the above code, we can see that `a` is accessible from everywhere because it is declared in the global scope. `b` is accessible only inside `myFunction` because it is declared in the block scope of `myFunction`. `c` is accessible only inside `myInnerFunction` because it is declared in the block scope of `myInnerFunction`.



### Variables without Block Scope
`(Using var or Function Declarations in Non-Strict Mode)`

In JavaScript, when you declare a variable using var or create a function without using strict mode, the variable you declare inside a block of code (between curly braces {}) is not limited to that block. It can be accessed from anywhere within the entire function or script that encloses the block.


```js

function exampleFunction() {
  if (true) {
    var x = 10; // This variable is accessible throughout the function
  }

  console.log(x); // Output: 10, even though 'x' was declared inside the block
}

exampleFunction();
```

In this example, the variable `x` is declared inside the block (the if statement), but it is still accessible when we try to log its value outside the block. This is because var does not have true block scope; it creates function-scoped variables.

### Variables with Block Scope

`(Using let and const):`

In modern JavaScript, you can use let and const to create variables with true block scope. This means that if you declare a variable using let or const inside a block, it will only be accessible within that block, and its effects will not persist beyond the block.


```js

function exampleFunction() {
  if (true) {
    let y = 20; // This variable is only accessible within this block
    const z = 30; // This constant is also only accessible within this block
    console.log(y); // Output: 20, as 'y' is declared and used inside the block
  }

  console.log(y); // Error: 'y' is not defined, as it is only accessible inside the block
  console.log(z); // Error: 'z' is not defined, as it is only accessible inside the block
}

exampleFunction();
```

In this example, the variables `y` and `z` are declared using let and const, respectively, inside the block (the if statement). When we try to log their values outside the block, we get errors because they are not accessible beyond the block where they were declared.

Using let and const for block-scoped variables helps prevent unintended side effects and makes the code more predictable and easier to maintain. It is considered best practice in modern JavaScript development.


## Shadowing

```js

var a = 100;

{
    var a = 200;
    console.log(a);
}

console.log(a);

```

Here the output would be `200` and `200`. This is because `var a = 100;` is in the global scope and `var a = 200;` even if it is in the block, we learnt that `var` is function/global scoped. So the `var a = 200;` is actually shadowing the `var a = 100;` in the global scope ie they are acting as the same variable.

```js

let a = 100;

{
    let a = 200;
    console.log(a);
}

console.log(a);

```

Here the output would be `200` and `100`. This is because `let a = 100;` is in the global scope and `let a = 200;` is in the block scope. So they are two different variables. **SAME FOR CONST.**


### Illegal shadowing

```js

let a = 100;

{
    var a = 200;
    console.log(a);
}
```

This would give an error because we are trying to shadow a `let` variable with a `var` variable. This is not allowed.

