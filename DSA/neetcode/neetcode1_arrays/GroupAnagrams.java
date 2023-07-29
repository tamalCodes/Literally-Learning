//! QUESTION: https://leetcode.com/problems/group-anagrams/
//! Leetcode MEDIUM
//! VIDEO: https://www.youtube.com/watch?v=-c0hUQHIkSY

//* Desc */
// Given an array of strings strs, group the anagrams together. You can return the answer in any order.
// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

//* Brute force */
// I can take a string, and then find out all the anagrams of that string and then store them in a list
// Then I can take another string and do the same thing
// after that i can return the list of lists

//* Optimized approach */
// I will take a string, after that I will now sort it.
// The reason to sort it is all the anagrams will have the same sorted string
// Once i have sorted the string, i will look in the hashmap if i already have that string as a key
// if I don't have it i will add that sorted string as a key, and then add the unsorted string as a value FOR THAT KEY
// if i ALREADY have that key, i will just add the unsorted string as a value FOR THAT KEY
// As i will be doing this for all the strings, i will have all the anagrams of a particular string as values for that key
// Finally i will just return the values of the hashmap in a List of List format

//* Explanations */
// suppose: { "eat", "tea", "tan", "ate", "nat", "bat" }
// I come to "eat", sorted: aet
// Hashmap : 

// KEY    |     VALUE
// aet    |     eat

// Then i come to "tea", sorted: aet
// As the key already exists, i'll add the unsorted value "tea"
// Hashmap : 

// KEY    |     VALUE
// aet    |     eat, tea

// tan
// The sorted string is: ant, which doesn't exist as a key, so i'll add it as a key and add the unsorted value "tan"
// Hashmap : 

// KEY    |     VALUE
// aet    |     eat, tea
// ant    |     tan

// ate
// The sorted string is: aet, which already exists as a key, so i'll add the unsorted value "ate"
// Hashmap : 

// KEY    |     VALUE
// aet    |     eat, tea, ate
// ant    |     tan

// and in the end, i will just return the values of the hashmap in a List of List format

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] inputArr) {
        Map<String, List<String>> ans = new HashMap<>();

        // traverse through the whole array
        for (String str : inputArr) {
            // sort the string

            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String Sorted_str = new String(charArray);

            // check & put the key in map

            if (!ans.containsKey(Sorted_str)) {
                ans.put(Sorted_str, new ArrayList<>());
            }

            // Add the unsorted value FOR THAT KEY

            ans.get(Sorted_str).add(str);
        }

        return new ArrayList<>(ans.values());

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };

        List<List<String>> ans = new ArrayList<>();
        ans = groupAnagrams(strs);
        System.out.println(ans);
    }
}
