class ReorganizeStrings {
    public static String reorganizeString(String s) {

        // things to keep in mind
        // if a character's frequency is more than half of the length of the string
        // that means it is an invalid string

        int[] frequency = new int[26];
        int asciivalueofletter = 0, asciivalueofa = 97;

        // adding all the frequency of the characters inside the array
        for (char ch : s.toCharArray()) {
            asciivalueofletter = (int) ch;
            frequency[asciivalueofletter - asciivalueofa] += 1;
        }

        int maxFrequency = 0, maxLetter = 0;
        for (int i = 0; i < 26; i++) {
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
                maxLetter = i;
            }
        }

        // pigeon hole principle
        if (maxFrequency > (s.length() + 1) / 2)
            return "";

        // time to alternate and find the answer
        char[] answer = new char[s.length()];
        int j = 0;

        // first of all we put the max character in the array
        // frequency[maxLetter] = 5
        // maxLetter = 3 which is basically c
        // therefore we do the + a, which is to get the ascii value of 100
        // 3+97
        while (frequency[maxLetter] > 0) {
            answer[j] = (char) (maxLetter + asciivalueofa);
            j += 2;
            frequency[maxLetter] -= 1;
        }

        // now maxletter is done we need to put the other letters
        // WRT the frequency array

        for (int i = 0; i < 26; i++) {
            while (frequency[i] > 0) {

                // making sure that index or the place where we want to
                // put the character is not out of bounds
                // if it is the case we set the value as 1 because we want the odd case

                if (j > answer.length - 1)
                    j = 1;

                asciivalueofletter = i;
                answer[j] = (char) (asciivalueofletter + asciivalueofa);

                j += 2;
                frequency[i] -= 1;
            }
        }

        return new String(answer);

    }

    public static void main(String[] args) {
        System.out.println(reorganizeString("aabba"));
    }
}