# Question 1: Find output along with explanation

```js
function A(x){
    function B(y){
        function C(z){
            console.log(x+y+z);
        }
        C(3);
    }
    B(2);
}
A(1);
```

**Answer:** Well the output will be 6, because the function C is called inside the function B and the function B is called inside the function A. So the value of x will be 1, the value of y will be 2 and the value of z will be 3. So the output will be 6.

This happens because of closure. The function C has access to the variables of function B and function B has access to the variables of function A. But the function A does not have access to the variables of function B and function C. This is called closure.

## What happens if i move `console.log` before the function C?

In that case we will be getting the  `ReferenceError: z is not defined`.


# Question 2: Find output along with explanation

```js
function map(f,a)
{
    let result = [];
    let i;
    
    for(i=0;i!=a.length; i++){
        result[i] = f(a[i]);
    }
    
    return result;
}

const f = function(x){
    return x*x*x;
}

let numbers = [0,1,2,5,10];
let cube = map(f, numbers);
console.log(cube);
```

The output will be `[ 0, 1, 8, 125, 1000 ]` which is basically the cube of the numbers.