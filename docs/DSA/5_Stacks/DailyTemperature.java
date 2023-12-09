import java.util.Arrays;
import java.util.Stack;

public class DailyTemperature {

    static class Pair {
        int value;
        int index;

        public Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Pair> stack = new Stack<>();
        int[] arr = new int[temperatures.length];
        Arrays.fill(arr, 0);

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > stack.peek().value) {
                arr[stack.peek().index] = i - stack.peek().index;
                stack.pop();
            }

            stack.push(new Pair(temperatures[i], i));
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] t = { 30, 40, 50, 60 };
        dailyTemperatures(t);
    }
}
