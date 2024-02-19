import java.util.HashSet;
import java.util.Set;

class PushDominoes {
    public static String pushDominoes(String dominoes) {

        StringBuilder currentSb = new StringBuilder(dominoes);
        Set<String> set = new HashSet();
        set.add(dominoes);

        do {
            StringBuilder newSb = new StringBuilder();

            for (int i = 0; i < currentSb.length(); i++) {

                if (currentSb.charAt(i) == 'L') {
                    newSb.append('L');

                    if (i == 1 && currentSb.charAt(0) == '.')
                        newSb.replace(i - 1, i, "L");
                    else if (i > 1 && currentSb.charAt(i - 1) == '.' && currentSb.charAt(i - 2) != 'R')
                        newSb.replace(i - 1, i, "L");

                } else if (currentSb.charAt(i) == 'R') {
                    newSb.append('R');

                    if (i == currentSb.length() - 2 && currentSb.charAt(currentSb.length() - 1) == '.') {
                        newSb.replace(i + 1, i + 2, "R");
                        i++;
                    } else if (i < currentSb.length() - 2 && currentSb.charAt(i + 1) == '.'
                            && currentSb.charAt(i + 2) != 'L') {
                        newSb.replace(i + 1, i + 2, "R");
                        i++;
                    }

                } else {
                    newSb.append('.');
                }
            }

            currentSb.setLength(0);
            currentSb = newSb;

        } while (set.add(currentSb.toString()));

        return currentSb.toString();
    }

    public static void main(String[] args) {
        System.out.println("The new dominoes are: " + pushDominoes(".L.R...LR..L.."));
    }
}
