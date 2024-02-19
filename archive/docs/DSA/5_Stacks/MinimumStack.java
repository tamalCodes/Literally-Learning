import java.util.*;

public class MinimumStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minstack = new Stack<>();

    public void push(int x) {
        stack.push(x);

        if (minstack.peek() >= x)
            minstack.push(x);
    }

    public void pop() {
        if (minstack.peek().equals(stack.peek()))
            minstack.pop();
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minstack.peek();
    }
}
