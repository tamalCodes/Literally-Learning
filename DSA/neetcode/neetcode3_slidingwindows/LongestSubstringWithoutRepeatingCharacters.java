import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {

    static void runSimplified(String str) {
        int left = 0, right = 0, length = 0;
        char ch[] = str.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();

        while (right < ch.length) {
            if (!hashMap.containsKey(ch[right])) {
                hashMap.put(ch[right], right);
                length = Math.max(length, right - left + 1);

            } else {

                if (hashMap.get(ch[right]) < left) {
                    hashMap.put(ch[right], right);
                    length = Math.max(length, right - left + 1);
                } else {
                    left = hashMap.get(ch[right]) + 1;
                    hashMap.put(ch[right], right);
                    length = Math.max(length, right - left + 1);
                }
            }
            right++;
        }

        System.out.println(length);
    }

    static void runChotu(String str) {
        int left = 0, right = 0, length = 0;
        char ch[] = str.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();

        while (right < ch.length) {
            // if (hashMap.containsKey(ch[right])) {
            // if (hashMap.get(ch[right]) < left) {
            // } else {
            // left = hashMap.get(ch[right]) + 1;
            // }
            // }

            if (hashMap.containsKey(ch[right]) && hashMap.get(ch[right]) >= left) {
                left = hashMap.get(ch[right]) + 1;
            }

            // if (hashMap.containsKey(ch[right])) {
            // left = Math.max(hashMap.get(ch[right]) + 1, left);
            // }

            hashMap.put(ch[right], right);
            length = Math.max(length, right - left + 1);
            right++;
        }

        System.out.println(length);
    }

    public static void main(String[] args) {
        String str = "adab";
        runSimplified(str);
        runChotu(str);
    }
}