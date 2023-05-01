// Write the full code just for Implementation of default, no argument
// Constructor.

import java.util.*;

public class Solution {

    private int value;

    // This is the default constructor with no arguments
    public Solution() {
        value = 0;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        System.out.println("Value: " + obj.getValue());
        obj.setValue(10);
        System.out.println("Value: " + obj.getValue());

    }
}