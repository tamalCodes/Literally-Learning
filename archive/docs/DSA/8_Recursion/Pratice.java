public class Pratice {

  // static void printFibonacci(int n) {

  // int a = 0, b = 1;
  // int c = 0;

  // for (int i = 0; i < n - 1; i++) {
  // c = a + b;
  // a = b;
  // b = c;
  // }

  // System.out.println(c);
  // }

  // static int recursiveFibonacci(int n) {
  // if (n <= 1)
  // return n;
  // return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
  // }

  static double calcPower(double x, int n) {
    if (n == 0)
      return 1.00000;

    return x * calcPower(x, n - 1);
  }

  public static void main(String[] args) {
    System.out.println(calcPower(2.00000, 1));
  }
}