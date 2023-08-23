// ! Question: https://leetcode.com/problems/unique-email-addresses/
// * EASY */

import java.util.HashSet;
import java.util.Set;

public class UniqueEmail {
    public int numUniqueEmails(String[] emails) {

        Set<String> set = new HashSet<>();

        for (String s : emails) {

            // format that email
            String formattedEmail = "";

            // split email in two parts (tamalcodes@gmail.com)
            // tamalcodes
            // gmail.com
            String[] parts = s.split("@");

            parts[0] = parts[0].replace(".", "");

            if (parts[0].indexOf('+') != -1)
                parts[0] = parts[0].substring(0, parts[0].indexOf('+'));

            // int plusIndex = parts[0].indexOf('+');
            // if (plusIndex != -1) {
            // parts[0] = parts[0].substring(0, plusIndex);
            // }

            formattedEmail = parts[0] + "@" + parts[1];

            if (!set.contains(formattedEmail))
                set.add(formattedEmail);

        }

        return set.size();
    }
}
