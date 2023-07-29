//! QUESTION: https://www.lintcode.com/problem/659/
//! MEDIUM

//* DESC */
// Design an algorithm to encode a list of strings to a string. 
// The encoded string is then sent over the network and is decoded back to the original list of strings.
// Input: ["lint","code","love","you"]
// Output: ["lint","code","love","you"]

// * How to form a encoded string from a List of strings ? 
// The way that we are encoding the string is by adding the length of the string and then adding a "#" and then adding the string itself
// So for the string "lint" we will have 4#lint
// The advantage of this is that we can easily decode the string by just looking for the "#" and then getting the length of the string from before the "#", and then substringing the string from after the "#"

// * How to decode the encoded string ?

// The idea is simple, we run a loop through the whole string
// As soon as we will find a "#", we can then substring the char before it to get a lenght of the string
// For 4#lint5#xyzyz, as soon as we go to #, we get the length as 4

// The next idea is to substring 4 characters after the #

// For 4#lint5#xyzyz we will get the length as 4, and then we will substring the string from j+1 that is 'l' 
// upto j+len+1 that points at '5' but since we are substringing it, we won't include '5', so it will go upto 't'
// Then we will get 'lint' and then we will add it to the list of strings

//* What if the string itself contains a "#" ? Like "l#ove"

// Since we are adding '5#' before the 'l#ove', we will substring the 5 characters
// and literally end up with 'l#ove'

import java.util.*;

public class EncodeDecode {

    public String encode(List<String> strs) {
        String encoded = "";

        for (String s : strs) {
            encoded += Integer.toString(s.length()) + "#" + s;
        }

        return encoded;

    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();

        int i = 0;

        // 4#lint4#code4#l#ove3#you

        while (i < str.length()) {

            int j = i;

            while (str.charAt(j) != '#') {
                j++;
            }
            // after this j will point to #

            int len = Integer.parseInt(str.substring(i, j));

            // we then substring 4 from 4#
            // Then we use the 4 to substring the main word 👇🏻

            strs.add(str.substring(j + 1, j + len + 1));
            i = j + len + 1;
        }
        return strs;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // List<String> strs = { "lint", "code", "love", "you" };

        List<String> strs = new ArrayList<>();
        strs.add("lint");
        strs.add("code");
        strs.add("l#ove");
        strs.add("you");

        EncodeDecode obj = new EncodeDecode();
        String encoded = obj.encode(strs);
        System.out.println(encoded);

        List<String> decoded = obj.decode(encoded);
        System.out.println(decoded);

    }
}