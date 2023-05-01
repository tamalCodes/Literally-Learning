// Implementation of parameterized constructor

public class Solution {

    private int value;

    // This is the parameterized constructor with one argument
    public Solution(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {

        Solution obj = new Solution(10);

        System.out.println("Value: " + obj.getValue());
        obj.setValue(20);
        System.out.println("Value: " + obj.getValue());

    }
}