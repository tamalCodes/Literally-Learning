<!-- TOC -->

- [What are closures](#what-are-closures)
  - [Uses of Closure](#uses-of-closure)
  - [Question 1](#question-1)
  - [Question 2](#question-2)
  - [What are the advantages of closures](#what-are-the-advantages-of-closures)
  - [Disadvantages of closures ?](#disadvantages-of-closures-)
  - [What is a garbage collector ? What does it do ?](#what-is-a-garbage-collector--what-does-it-do-)

<!-- /TOC -->

# What are closures

It's like a function that carries a piece of past with it wherever it goes. **A function along with it's lexical scope bundled together forms a closure.**

Each and every function in javascript has access to its lexical environment that is whatever the variables are that are defined in the parent function.  so even if this function is executed in some other scope not in its original scope but some other scope outside it is still able to remember its lexical environment and that is exactly what closures are.


```js

function outer()
{
    var outerVar = 7;
    function inner()
    {
        console.log(outerVar);
    }
    
    return inner;
}
outer()();
```

In the above code, the function `inner` is able to access the variable `outerVar` even though it is not in its lexical scope. This is because of closures. The function `inner` is able to remember its lexical scope.

**What is `outer()()` ?**

`outer()` returns the function `inner` and then we are executing the function `inner` by adding `()` to it. 

Equivalent to : 

```js
var close = outer();
close();
```

**So what happens if i modify the function to the following, will it still form a closure ?**

```js
function outer()
{
    function inner()
    {
        console.log(outerVar);
    }
    var outerVar = 7;
    return inner;
}
outer()();
```

Yes it will still form a closure because we form closures with our outer environment and not in any order so yeah. . 

**Yes, so what happens if i change `var outerVar = 7` to `let` ?**

Yeah so let is block scoped and not function scoped, but still it will form a closure, because we have the inner in the same scope as the outerVar.

**What if we nest it inside another function ?**

That will work too, we will still form a closure because we are caring about the parent's lexical scope.

```js
function outerGod(){
    var outerVar = 7;
    function outer()
    {
        function inner()
        {
            console.log(outerVar);
        }
    
        return inner;
    }
    return outer;
}

outerGod()()();
```

## Uses of Closure

1. Module Design Pattern
2. Currying
3. Memoization
4. SetTimeouts
5. Maintaining state in async world

## Question 1

```js
function x(){

    var i = 1;
    setTimeout(function(){
        console.log(i);
    }, 1000);

    console.log(i);
}

x();
```

**What do you expect to see in the console ?**

**Answer:** 1.

## Question 2

I want to print 1,2,3,4,5 with a delay of 1 second between each number.

```js
function x(){

    for(var i = 1; i <= 5; i++){
        setTimeout(function(){
            console.log(i);
        }, i*1000);
    }
}
x();
```

You write this kind of above code thinking that it will print 1,2,3,4,5 with a delay of 1 second between each number as the value of i is changing in each iteration and the timeout is also changing in each iteration. But it doesn't work like that. OUTPUT We get:

```bash
6
6
6
6
6
```

**Why is this happening ?**

**Answer:** Because of closures. The setTimeout function is a closure and it has access to the outer scope of the function x() which is the global scope. 

So when the setTimeout takes this function and stores this somewhere with a timer attached, we remember the `reference to i` not the `value to i`.

We get 6 because when the setTimeout function is executed the for loop has already finished execution and the value of i is 6.

Javascript doesnot wait for anything, so it will just execute the for loop and then execute the setTimeout function. As we are executing the setTimeout function late, we get the value of i as 6.

**How do i fix this behaviour ?**

**Answer:** We can fix this behaviour by using `let`, because `let` has block scope and not function scope. For each and every loop iteration, the `i` is a new variable everytime. Previously we were using `var` which has function scope which meant that the `i` was the same variable for all the loop iterations.


**But you need to do it without `let`**

**Answer:** We can fix this behaviour by using closures. The intuition is to provide a new copy of `i` to the `setTimeout` function everytime. 

```js
for(var i=0; i<=5; i++){
    function close(x){
        setTimeout(function(){
            console.log(x);
        }, x*1000);
    }
    close(i);
}
```

What's happening is that we are passing the value of `i` to the function `close` and then we are passing the value of `x` to the setTimeout function. So we are passing a new copy of `i` to the setTimeout function everytime.



## What are the advantages of closures

1. Data Hiding
2. Encapsulation
3. Module Design Pattern


**Can you perhaps explain  more about Data hiding ?**

So Data hiding can be done when we actually gain some privacy , such that other part of the function is not able to access the data. So we can do this by using closures. 

```js

function counter(){
    var count = 0;
    return function incrementCounter(){
        count++;
        console.log(count);
    }
}

var counter1 = counter();

counter1();
counter1();
```

So in the above code, we are able to access the variable `count` only through the function `incrementCounter` and not directly. So we are hiding the data from the outside world. This is called data hiding.

**What happens if we make another `var counter2 = counter()` ?**

The `counter1` and `counter2` will have different copies of the variable `count` and they will not interfere with each other. So we are able to create multiple copies of the variable `count` and they will not interfere with each other. This is called encapsulation.



**But this is code is not scalable enough, how do it make it better ?**

We can use a constructor function to make it better.

```js

function counter(){
    var count = 0;
    this.incrementCounter = function(){
        count++;
        console.log(count);
    }

    this.decrementCounter = function(){
        count--;
        console.log(count);
    }
}

var counter1 = new counter();

counter1.incrementCounter();
counter1.incrementCounter();
counter1.decrementCounter();
```

## Disadvantages of closures ? 

Over comsumption of memory because everytime a closure is created, it accumulates the memory. So if we are creating a lot of closures, then it will consume a lot of memory. The variables are not garbage collected till the program expires so, we need to handle this carefully.

It might also lead to memory leaks.

## What is a garbage collector ? What does it do ? 

So this is a part of the javascript engine that is responsible for memory management. Whenever it finds out that some variablesa are not longer needed it simply clears out the memory.