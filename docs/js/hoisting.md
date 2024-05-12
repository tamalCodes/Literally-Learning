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
a = 10; // we can initialize it later

const b; // this will give an error
```

This is because const is meant to be initialized at the time of declaration. We can't do it later on.


## Let and Var

### var

- Function scoped when it is declared within a function. Available only within that function.
- Global scoped when it is declared outside a function. Available globally.

```js
function myFunction() {
  if (true) {
    var x = 10;
  }

  console.log(x); // Output: 10
}

myFunction();
```

In this example, the variable `x` is declared using var inside the if statement, but it is still accessible when we try to log its value outside the if statement. This is because **var does not have true block scope**; it creates function-scoped variables.

### let

- Block scoped. A block is a set of statements wrapped in curly braces. Each block has its own lexical scope.
- Not hoisted to the top of its block. If a variable is declared using let, it is only available from the point at which it is declared until the end of the block.

```js
function myFunction() {
  if (true) {
    let y = 20;
    console.log(y); // Output: 20, as 'y' is declared inside the block
  }

  console.log(y); // Error: 'y' is not defined, as outside the block
}

myFunction();
```


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

The time between the **variable being declared** and **being initialized** is called the temporal dead zone.

```js
console.log(x);
console.log(a);
let a = 10;
```

In the above code, the temporal dead zone is between the `let a = 10` and `console.log(a)`. `a` will be assigned a value of `undefined` during the temporal dead zone.

For `x` we get `ReferenceError: x is not defined` and for `a` we get `ReferenceError: Cannot access 'a' before initialization`. This is because `x` is not declared at all and `a` is declared but not initialized.


## Scopes

### Block scope

Block scope is the area within if, switch conditions or for and while loops. Generally speaking, whenever you see `{curly brackets}`, it is a block. In ES6, const and let keywords allow developers to declare variables in the block scope, which means those variables exist only within the corresponding block.

### Lexical scope

Lexical scope means that in a nested group of functions, the inner functions have access to the variables and other resources of their parent scope. This means that the child functions are lexically bound to the execution context of their parents. Lexical scope is sometimes also referred to as Static Scope.

### Global scope

Global scope refers to the context within which variables are accessible to every part of the program. If a variable is declared outside of all functions or curly braces (i.e. in the root of the program), it is said to be defined in the global scope.



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

 `x` is declared inside the block (the if statement), but it is still accessible when we try to log its value outside the block. This is because **var does not have true block scope;** it creates **function-scoped** variables.

### Variables with Block Scope

`(Using let and const):`



```js
function exampleFunction() {
  if (true) {
    let x = 10; // block scoped, only acessible here.
  }

  console.log(x); // Output: ReferenceError: x is not defined
}

exampleFunction();
```

In this example, the variable `x` is declared using let inside the block, and it is not accessible outside the block. This demonstrates the true block scope behavior of let and const.


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

