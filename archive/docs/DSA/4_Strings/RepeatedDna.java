import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RepeatedDna {

    public static List<String> findRepeatedDnaSequences(String s) {

        // we will maintain 2 different hashsets
        // allstrings --> keep all the substrings that i have came acroess
        // duplicates --> keep the strings that appears more than once

        HashSet<String> allstrings = new HashSet<String>();
        HashSet<String> duplicates = new HashSet<String>();

        // we run a for loop and then we keep doing the substrings
        // i + 9 < s.length() --> to maintain boundary

        for (int i = 0; i + 9 < s.length(); i++) {

            String temp = s.substring(i, i + 10);

            // if i have seen this string once already, add it to duplicate
            if (allstrings.contains(temp))
                duplicates.add(temp);

            // else normalyy keep adding strings
            allstrings.add(temp);
        }

        // now that we have a hashset of the duplicates
        // we make it an arraylist and send it back

        return new ArrayList<>(duplicates);

    }

    public static void main(String[] args) {
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        for (String str : findRepeatedDnaSequences(s)) {
            System.out.println(str);
        }
    }

}
