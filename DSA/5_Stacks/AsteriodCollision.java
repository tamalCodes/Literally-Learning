import java.util.Stack;

public class AsteriodCollision {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {

            while (!stack.isEmpty()
                    && (asteroids[i] < 0 && stack.peek() >= 0)) {
                if (stack.peek() == Math.abs(asteroids[i])) {
                    stack.pop();
                    asteroids[i] = 0;
                    break;
                }

                if (Math.abs(asteroids[i]) > stack.peek()) {
                    stack.pop();
                } else {
                    asteroids[i] = 0;
                    break;
                }
            }

            if (asteroids[i] != 0)
                stack.push(asteroids[i]);

        }

        int[] remainingAsteriods = new int[stack.size()];

        while (!stack.isEmpty()) {
            remainingAsteriods[stack.size() - 1] = stack.peek();
            stack.pop();
        }

        for (int i = 0; i < remainingAsteriods.length; i++) {
            System.out.print(remainingAsteriods[i] + " ");
        }
        String path = "WTF";
        char[] arr = path.toCharArray();

        return remainingAsteriods;
    }

    public static void main(String[] args) {
        int[] asteroids = { 8, -8 };
        // int[] asteroids = { -1, 10, 2, -3 };
        asteroidCollision(asteroids);
    }
}
