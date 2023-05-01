import java.util.*;

public class Solution {

    // method to demonstrate call by value
    public static void callByValue(int num) {
        System.out.println("Inside callByValue method before changing the value, num = " + num);

        // change the value of num
        num = 10;

        System.out.println("Inside callByValue method after changing the value, num = " + num);
    }

    // method to demonstrate call by reference
    public static void callByReference(int[] arr) {
        System.out.println("Inside callByReference method before changing the value, arr[0] = " + arr[0]);

        // change the value of arr[0]
        arr[0] = 10;

        System.out.println("Inside callByReference method after changing the value, arr[0] = " + arr[0]);
    }

    // main method
    public static void main(String[] args) {
        // call callByValue method
        int num = 5;
        System.out.println("Before calling the callByValue method, num = " + num);
        callByValue(num);
        System.out.println("After calling the callByValue method, num = " + num);

        // call callByReference method
        int[] arr = { 5, 6, 7 };
        System.out.println("Before calling the callByReference method, arr[0] = " + arr[0]);
        callByReference(arr);
        System.out.println("After calling the callByReference method, arr[0] = " + arr[0]);
    }
}
