public class KokoEatingBananas {

    public static boolean isValidMin(int[] piles, int hoursAvailable, int mid) {

        double currentHoursNeeded = 0.0;

        for (int i = 0; i < piles.length; i++)
            currentHoursNeeded += Math.ceil((double) (piles[i]) / (double) (mid));

        if ((int) currentHoursNeeded <= hoursAvailable)
            return true;
        else
            return false;
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = 0, mid = 0;
        int minimumHours = Integer.MAX_VALUE;

        // find the max value
        // suppose the max is 11
        // range will be 1 to 11

        for (int i = 0; i < piles.length; i++)
            right = Math.max(right, piles[i]);

        // Now that we have a range it is time to do a binary search
        // we get a MID, suppose we get 6
        // if 6 is VALID, then there might be chance that we have something smaller
        // SO we look at left and this continues.

        System.out.println(right);

        while (left <= right) {
            mid = (right + left) / 2;

            if (isValidMin(piles, h, mid)) {
                minimumHours = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return minimumHours;

    }

    public static void main(String[] args) {
        int[] piles = { 3, 6, 7, 11 };

        System.out.println(minEatingSpeed(piles, 8));
    }
}