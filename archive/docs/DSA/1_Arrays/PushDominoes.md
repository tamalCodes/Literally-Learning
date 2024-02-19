## Question Name : Push Dominoes

[Link to the question](https://leetcode.com/problems/push-dominoes/description/) https://github.com/tamalCodes/literally-learning/labels/Medium

There are n dominoes in a line, and we place each domino vertically upright. In the beginning, we simultaneously push some of the dominoes either to the left or to the right.

After each second, each domino that is falling to the left pushes the adjacent domino on the left. Similarly, the dominoes falling to the right push their adjacent dominoes standing on the right.

When a vertical domino has dominoes falling on it from both sides, it stays still due to the balance of the forces.

For the purposes of this question, we will consider that a falling domino expends no additional force to a falling or already fallen domino.

You are given a string dominoes representing the initial state where:

`dominoes[i] = 'L'`, if the ith domino has been pushed to the left, <br/>
`dominoes[i] = 'R'`, if the ith domino has been pushed to the right, and <br/>
`dominoes[i] = '.'`, if the ith domino has not been pushed. <br/> <br/>
Return a string representing the final state.

## Code

```java
import java.util.HashSet;
import java.util.Set;

class PushDominoes {
    public static String pushDominoes(String dominoes) {

        StringBuilder currentSb = new StringBuilder(dominoes);
        Set<String> set = new HashSet();
        set.add(dominoes);

        do {
            StringBuilder newSb = new StringBuilder();

            for (int i = 0; i < currentSb.length(); i++) {

                if (currentSb.charAt(i) == 'L') {
                    newSb.append('L');

                    if (i == 1 && currentSb.charAt(0) == '.')
                        newSb.replace(i - 1, i, "L");
                    else if (i > 1 && currentSb.charAt(i - 1) == '.' && currentSb.charAt(i - 2) != 'R')
                        newSb.replace(i - 1, i, "L");

                } else if (currentSb.charAt(i) == 'R') {
                    newSb.append('R');

                    if (i == currentSb.length() - 2 && currentSb.charAt(currentSb.length() - 1) == '.') {
                        newSb.replace(i + 1, i + 2, "R");
                        i++;
                    } else if (i < currentSb.length() - 2 && currentSb.charAt(i + 1) == '.'
                            && currentSb.charAt(i + 2) != 'L') {
                        newSb.replace(i + 1, i + 2, "R");
                        i++;
                    }

                } else {
                    newSb.append('.');
                }
            }

            currentSb.setLength(0);
            currentSb = newSb;

        } while (set.add(currentSb.toString()));

        return currentSb.toString();
    }

    public static void main(String[] args) {
        System.out.println("The new dominoes are: " + pushDominoes(".L.R...LR..L.."));
    }
}

```

## Solution Explanation

The intuition is to keep revamping the string until we can't add any more string to the set. If we can't add any more string to the set, we have achieved the final state.

We are using a set to keep track of the strings that we have already seen. If we have already seen a string, we don't need to revamp it again.


**After Getting a character**

## Case 1: If we get a L

`.L` <br/>

If the 2nd character is L, and the first character is ., we need to replace the first character with L. <br/>

`..L` <br/>
`R.L` <br/>

If after the second character, we get a `L` and before it we have a `.` **AND** the character before the `.` is not `R`, we need to replace the `.` with `L` <br/>

`..L` will become `.LL` in the first iteration <br/>


## Case 2: If we get a R

`R.` <br/>

If the second last character is `R` and the last character is `.`, we need to replace the last character with `R` and then we do `i++` because the `i` was at `R` so now that i+1 has been played with we need to do the `i++` <br/>

`R..` <br/>
`R.L` <br/>

If we get a `R` and after it we get a `.` and after the `.` we don't get a `L`, we need to replace the `.` with `R` and then we do `i++` because the `i` was at `R` so now that i+1 has been played with we need to do the `i++` <br/>

## Replacement

`newSb.replace(i + 1, i + 2, "R");` <br/>

Here `i+1` is the start index and `i+2` is the end index. When replacing in a stringbuilder we need to give the end index as the index after the last index that we want to replace. <br/>
