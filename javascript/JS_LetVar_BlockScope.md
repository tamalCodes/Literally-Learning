<!-- TOC -->

- [What is hoisting ?](#what-is-hoisting-)
  - [Why does hoisting exist ?](#why-does-hoisting-exist-)
- [Types of variables in JS](#types-of-variables-in-js)
  - [Difference between let and var](#difference-between-let-and-var)
  - [Hoisting `let` VS `var`](#hoisting-let-vs-var)
  - [Temporal dead zone](#temporal-dead-zone)
  - [Hoisting `let` VS `const`](#hoisting-let-vs-const)
- [Explaining blocks](#explaining-blocks)
  - [Block scope, lexical scope and global scope](#block-scope-lexical-scope-and-global-scope)
  - [Variables without Block Scope (Using var or Function Declarations in Non-Strict Mode):](#variables-without-block-scope-using-var-or-function-declarations-in-non-strict-mode)
  - [Variables with Block Scope (Using let and const):](#variables-with-block-scope-using-let-and-const)
- [Shadowing in javascript](#shadowing-in-javascript)
  - [Illegal shadowing](#illegal-shadowing)

<!-- /TOC -->

# What is hoisting ?

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

## Why does hoisting exist ?

Hoisting exists in JavaScript because it is a compiled language. This means that before JavaScript code is executed, it is first compiled into a format that is more suitable for execution. During this compilation process, variable and function declarations are moved to the top of their scope. This allows variables and functions to be used before they are declared.

# Types of variables in JS

- Const : Constant variables. Cannot be changed once declared.
- Let : Block scoped variables. Can be changed once declared.
- Var : Function scoped variables. Can be changed once declared.

## Difference between let and var




## Hoisting `let` VS `var`

Consider this following code 

```js
console.log(a);
console.log(b);
let a = 10;
var b = 20;

```

For `a` we would get `ReferenceError: Cannot access 'a' before initialization` and for `b` we would get a special placeholder of  `undefined`. This is because of hoisting. 

## Temporal dead zone

The time between the variable being declared and being initialized is called the temporal dead zone. 

```js
console.log(x);
console.log(a);
let a = 10;
```

In the above code, the temporal dead zone is between the `let a = 10` and `console.log(a)`. `a` will be assigned a value of `undefined` during the temporal dead zone. 

There is a difference between the `ReferenceError` that we get for `x` and `a`. For `x` we get `ReferenceError: x is not defined` and for `a` we get `ReferenceError: Cannot access 'a' before initialization`. This is because `x` is not declared at all and `a` is declared but not initialized.

Also to keep in mind that we have a reserved space for `var` in the global scope and `let` & `const` in the block scope.

## Hoisting `let` VS `const`

So both of them works the same way in terms of hoisting the only difference is that `const` is way more strict than `let`. 


```js
let a;

// we can initialize it later
a = 10;

const b;
// this will give an error
```

This is because const is meant to be initialized at the time of declaration. We can't do it later on.


# Explaining blocks

Basically a block is a set of statements wrapped in curly braces. we need to group statements together in a block when we want to execute them together. Each block has it's own lexical scope.

```javascript
{
    let a = 100;
    console.log("This is a block");
}
```

## Block scope, lexical scope and global scope


Block scope is the area within if, switch conditions or for and while loops. Generally speaking, whenever you see {curly brackets}, it is a block. In ES6, const and let keywords allow developers to declare variables in the block scope, which means those variables exist only within the corresponding block.

Lexical scope means that in a nested group of functions, the inner functions have access to the variables and other resources of their parent scope. This means that the child functions are lexically bound to the execution context of their parents. Lexical scope is sometimes also referred to as Static Scope.

Global scope refers to the context within which variables are accessible to every part of the program. If a variable is declared outside of all functions or curly braces (i.e. in the root of the program), it is said to be defined in the global scope.

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



## Variables without Block Scope (Using var or Function Declarations in Non-Strict Mode):

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

## Variables with Block Scope (Using let and const):

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

# Shadowing in javascript

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


## Illegal shadowing

```js

let a = 100;

{
    var a = 200;
    console.log(a);
}
```

This would give an error because we are trying to shadow a `let` variable with a `var` variable. This is not allowed. 