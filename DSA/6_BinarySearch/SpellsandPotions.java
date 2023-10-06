import java.util.Arrays;

public class SpellsandPotions {

    public static int calculatePairs(int[] potions, long success, int spell) {
        int left = 0, right = potions.length - 1;
        int mid = 0, min_mid = Integer.MAX_VALUE;

        while (left <= right) {
            mid = (left + right) / 2;
            long product = (long) spell * potions[mid];

            if (product >= success) {
                right = mid - 1;
                min_mid = Math.min(min_mid, mid);
            } else {
                left = mid + 1;
            }

        }

        return min_mid != Integer.MAX_VALUE ? potions.length - min_mid : 0;
    }

    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] result = new int[spells.length];
        Arrays.sort(potions);

        for (int i = 0; i < spells.length; i++)
            result[i] = calculatePairs(potions, success, spells[i]);

        return result;
    }

    public static void main(String[] args) {
        int[] potions = { 1, 2, 3, 4, 5 };
        int[] spells = { 5, 1, 3 };
        int success = 7;

        successfulPairs(spells, potions, success);
    }
}
