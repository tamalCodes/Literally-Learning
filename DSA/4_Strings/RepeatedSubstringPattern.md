# Description

**Question: https://leetcode.com/problems/repeated-substring-pattern/**

The thing is simple we have a string say "abab" and we have to find if it is made up of repeated substring or not. In this case it is made up of "ab" repeated twice. So we have to return true.

# Approach 

The approach is simple we will start from the middle of the string and check if the string is divisible by the substring or not.

**Now the question, why middle of the string ?**

Imagine a string `aaaaaaaaaaaaaaaaaa` this has a length of 18 and if we start from the beginning we will have a substring `a` and then we will have to append it 18 times to get the original string. 

But if we start from the middle we will have a substring `aaaaaaaa` and we will have to append it only 2 times to get the original string.

So this is a slight optimization.

I guess you also have noticed that we are using `if(s.length()%i==0)` this is because if we have a sring of length 3 and we are checking for a substring of length 2 then it will not be possible to divide the string into equal parts.

So if true we do the following:

 - We find the number of times we have to append the substring to get the original string.
 - We create a new string by appending the substring the number of times we found in the previous step.
 - We check if the new string is equal to the original string or not.
 - If yes we return true.
 - If no we continue the loop.


# Code
```java
class Solution {
    public boolean repeatedSubstringPattern(String s) {

        for(int i = s.length()/2; i>=1; i--)
        {
            if(s.length()%i==0){
                int timestoAppend = s.length()/i;
                String s1 = s.substring(0,i);
                System.out.println("The small string is: " + s1);
                String ans="";

                for(int j=0; j<timestoAppend; j++)
                    ans+=s1;

                if(ans.equals(s))
                    return true;
            }
        }

        return false;
        
    }
}
```