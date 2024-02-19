---
sidebar_position: 9
description: "In-depth JS engines and their workflow."
---

# Javascript Engines


## Javascript runtime environment

So the javascript runtime environment can have a lot of things inside of it it is basically a container that is actually needed to run a piece of code or run the javascript code. We can have javascript engine inside of it along with the callback queue microtask queue api or outer environments and so on.

And there are few apis which have same name and which are present inside the browser as well as node js for example the set timeout. So the set timeout is api is present inside the runtime environment of the browser as well as  console you do the console dot log right so it is the api console is the api which is present inside the runtime environment of the browser as well as node and there could be different apis for browser as well as node so these apis name.


## JS Engine

Well, it's a program that executes JavaScript code. All browsers have built-in JS engines. Node.js also has a JS engine. The most popular JS engines are:

- V8 (Chrome, Node.js, Opera, Edge)
- SpiderMonkey (Firefox)
- JavaScriptCore (Safari)


### Workflow

Also let's understand how everything is working inside of the javascript engine so whenever we get the code the first thing that we do is parsing,  then we compile the code and after that we successfully execute the code that we have

We also do have something in our tokens so whenever we are passing something to the javascript engine like `let a = 100`;  this gets broken down into multiple tokens and then we also do have a syntax parser that helps us generate an abstract syntax tree for the code that we have wrote.  and after this is finished we generally passed down the abstract syntax tree to the compilation phase

### Compilation phase

We need to understand a difference between `compiler` and `interpreter`.

In case of `interpreter` it will start executing the code line by line without knowing what is going to happen in the next line. And in case of `compiler` we will be going through  we will be going through the whole code compile that is generated an optimized version of it and only then it will be executed.

So both of the different types of compilation processes has different pros and cons the `interpreter` will will be very fast but the `compiler` will be giving us a much more efficient code.

#### Just in Time compilation

**Now the question arises if javascript is actually an interpreted language or a compiled language**

Well from what I have learned it is kind of both because it will first interpret it line by line and while it is getting interpreted line by line and generated into byte code before execution the compiler also keeps talking to it and tries to optimize the code as much as possible

**`Just in time compilation` is a combination of both interpreter and compiler so it will first interpret the code line by line and then it will compile the code and then it will execute the code so it is a combination of both interpreter and compiler**


#### Ahead of time compilation

**`Ahead of time compilation` is a compilation process where the code is compiled before the execution of the code so it is a compilation process that happens before the execution of the code**

We have stuffs like `inlining`, `copy elision`, `dead code elimination` and so on. So these are the things that are happening inside the compilation phase and then we will be getting the optimized code and then we will be executing the code and then we will be getting the output of the code that we have written.

### Execution phase

So after the compilation phase is finished we will be getting the optimized code and then we will be executing the code and then we will be getting the output of the code that we have written.

And inside the whole execution phase finally we do have a lot of things like the memory heap call stack and also the other functionalities that we previously discussed on how javascript code is getting executed line by line and so on so basically that's how everything sums up and that's how beautifully javascript code is finally executed.


We also have a `memory heap`, it is a place where the memory allocation happens. It is constantly in sync with the call stack and the garbage collector.
