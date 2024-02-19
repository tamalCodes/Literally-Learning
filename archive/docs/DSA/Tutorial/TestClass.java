import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String args[]) throws Exception {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long b = scan.nextLong();
        long num = b;
        long num2 = a;
        ArrayList<Long> factor = new ArrayList<Long>();
        if (a > b) {
            num = a;
            num2 = b;
        }
        if (num == 0) {
            System.out.println("Cannot divide by zero");
            return;
        }
        int incrementer = num % 2 == 0 ? 1 : 2;
        for (long i = 1; i <= Math.sqrt(num); i += incrementer) {
            if (num % i == 0) {
                factor.add(i);
            }
            if (i != num / i) {
                factor.add(num / i);
            }
        }
        // System.out.println(Arrays.toString(factor.toArray()));
        int count = 0;
        for (int i = 0; i < factor.size(); i++) {
            if ((num2 % factor.get(i)) == 0) {
                // System.out.println( factor.get(i));
                count++;
            }
        }
        System.out.println(count);
    }
}
