# Question

[Valid Parentheses](https://leetcode.com/problems/valid-parentheses) https://github.com/tamalCodes/literally-learning/labels/Easy


Given a string s containing just the characters `'(', ')', '{', '}', '[' and ']'`, determine if the input string is valid.

An input string is valid if:

- Open brackets must be closed by the same type of brackets.
- Open brackets must be closed in the correct order.
- Every close bracket has a corresponding open bracket of the same type.


# Examples

```shell
Input: s = "()[]{}"
Output: true
```

```shell
Input: s = "([)]"
Output: false
```

```shell
Input: s = "{()}"
Output: true
```

# Intuition

So in this question the very first thing that we do is basically define a `HashMap` because I don't really want to use a huge `else-if` or `switch case` statements and whatever.  the keys inside of the `HashMap` all of them are the opening brackets and the values that we have are the closing bracket.

- First of all define our stack and would take one element from our array if it is our opening bracket of any type we will simply push it inside of our stack. 

- And then If i got another opening bracket we will again push that same opening bracket inside of our stack.

- Now as soon as we encounter any closing brackets first of all we then check if our stack is empty or if the first element in the stack is not equals to the opening bracket of the same type

```shell
INPUT: }  <-- Current input


INPUT: (  <-- First element in stack
INPUT: {
```

- Now the first el in stack is `(` so we check the `HashMap` where the pair is `'(', ')'` and since the Current input is **not equal to the value in the pair** `} != )` that means that we have got something invalid so we basically return false

- because the string would have been something like this:` { ( }` which is invalid else if it was valid then we simply pop out the first element so that we don't have that pair anymore.


```shell
INPUT: )  <-- Current input


INPUT: (  <-- First element in stack
INPUT: {

```

So now the first element in stack is `(` so we check the HashMap where the pair is `(, )` and since the Current input is equal to the value in the pair `) == )` that means that we have got something valid so we basically pop out the first element so that we don't have that pair anymore.

```shell

STACK: { <-- First element in stack
```


- and then finally we do a final check if our stack is empty we then return to that means everything was valid else false



# Code

```java
import java.util.*;

public class ValidParantheses {

    static void puttoMap(HashMap<Character, Character> map) {
        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');
    }

    static boolean checkValid(String br) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        puttoMap(map);

        for (char ch : br.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.empty() || map.get(stack.peek()) != ch)
                    return false;
                stack.pop();

            }
        }

        if (stack.isEmpty())
            return true;

        return false;

    }

    public static void main(String[] args) {
        String br = "((";
        boolean isvalid = checkValid(br);
        System.out.println(isvalid);
    }
}
```