# Concepts

**Least Significant Digit:** <br>
In a positional numeral system, such as our decimal system (0-9), each digit in a number holds a different place value. The rightmost digit is the least significant digit, and each subsequent digit holds a progressively higher place value. The least significant digit is the one that contributes the least to the overall value of the number.

For example, in the number 123, the digit 3 is the least significant digit, while the digit 1 is the most significant digit because it contributes the most to the overall value of the number.

In the context of converting an integer to its Excel column title, we are treating the integer as if it were a number in a base-26 positional numeral system, where each digit corresponds to a letter. We process the digits from right to left, just like in our decimal system.

<br>
<br>

**Modulus Operation:**<br>
The modulus operation calculates the remainder when one number is divided by another. In our case, we are using the modulus operation to extract the least significant digit from the columnNumber.

When we take the modulus of columnNumber by 26, we are effectively calculating the remainder when columnNumber is divided by 26. This remainder corresponds to the value of the least significant digit in our "base-26" system. This is why we are using the modulus operation – it helps us isolate and understand the value of the least significant digit.

For example, when columnNumber is 701, taking 701 % 26 gives us 25, which means that the least significant digit in our base-26 system corresponds to the 25th letter in the alphabet, which is 'Y'.

Using the modulus operation allows us to peel off the least significant digit and work with it independently, just like how we would extract the units digit in our decimal system. It's a way to "break down" the number into its digit components, starting from the least significant digit.

# Code


```java
public class ExcelSheetColumn {
    public static String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            char currentChar = (char) (columnNumber % 26 + 'A');
            result.insert(0, currentChar);
            columnNumber /= 26;
        }

        return result.toString();
    }

    public static void main(String[] args) {

        System.out.println(convertToTitle(701));
    }

}
```
