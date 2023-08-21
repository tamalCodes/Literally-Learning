// Question: https://leetcode.com/problems/baseball-game/description/
// Approach:  I am not making it very large as the code is very simple we get different  imports and based on that we do different very easy tasks on the stack

import java.util.*;

public class BaseballRules {

    public static int calTotal(Stack<Integer> stack) {
        int sum = 0;
        for (int element : stack) {
            sum += element;
        }

        return sum;
    }

    public static int calPoints(String[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (String s : arr) {
            if (s == "+") {

                int a = stack.get(stack.size() - 2);
                int b = stack.get(stack.size() - 1);
                stack.push(a + b);

            } else if (s == "D") {
                stack.push(2 * stack.peek());

            } else if (s == "C") {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(s));
            }
        }

        return calTotal(stack);
    }

    public static void main(String[] args) {
        String[] arr = { "1", "C" };
        int totalPoints = calPoints(arr);
        System.out.println(totalPoints);
    }
}
