import java.util.HashMap;

class MinimumWindowSubstring {
    public static String minWindow(String s, String t) {

        if (s == null || t == null)
            return "";

        String potentialAnswer = "";
        String finalAnswer = "";

        // define maps
        HashMap<Character, Integer> tmap = new HashMap<>();
        HashMap<Character, Integer> smap = new HashMap<>();

        // add all the character of t in the tmap Hashmap
        for (char ch : t.toCharArray())
            tmap.put(ch, tmap.getOrDefault(ch, 0) + 1);

        int need = t.length();
        int have = 0;
        int current_characterfrequency = 0, needed_characterfrequency = 0;

        int left = 0, right = 0;

        while (right < s.length()) {

            // take a character, update it's frequency in the hashmap
            char ch = s.charAt(right);
            smap.put(ch, smap.getOrDefault(ch, 0) + 1);

            // suppose we have t="ABC" and s="XGH"
            // so current_characterfrequency ie frequency of X = 1
            // and needed_characterfrequency ie frequency of X = 0
            // as needed is 0, it is useless.

            current_characterfrequency = smap.getOrDefault(ch, 0);
            needed_characterfrequency = tmap.getOrDefault(ch, 0);

            // if it is not useless, then we update the value
            // if we have s=AAABC t=ABC
            // even if we get 2 A, we won't increase the value of have

            if (current_characterfrequency <= needed_characterfrequency)
                have++;

            // now we come here meaning that we have found a large string
            // which contains the potential answer
            // time to remove extra elements WHILE we have what we need

            while (left <= right && have == need) {

                potentialAnswer = s.substring(left, right + 1);

                // we store the minimum string as answer
                if (finalAnswer.equals("") || potentialAnswer.length() < finalAnswer.length())
                    finalAnswer = potentialAnswer;

                // start removing the left element
                // update it's frequency too
                ch = s.charAt(left);
                smap.put(ch, smap.getOrDefault(ch, 0) - 1);

                // if we remove useless character ----------------------------------------> good
                // if we remove a character with FREQ 3 and needed was 2 -----------------> good
                // if we remove a character with FREQ 2 and needed was 2 -----------------> bad

                current_characterfrequency = smap.getOrDefault(ch, 0);
                needed_characterfrequency = tmap.getOrDefault(ch, 0);

                // so if we have done a bad, we generally will reduce what we have
                // if what we have is not equals to what we need we will break this while
                if (current_characterfrequency < needed_characterfrequency)
                    have--;

                left++;
            }

            right++;
        }

        return finalAnswer;

    }

    public static void main(String[] args) {

        String s = "ADOBECODEBANC", t = "ABC";
        System.out.println(minWindow(s, t));
    }
}