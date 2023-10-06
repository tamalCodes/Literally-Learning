// A conveyor belt has packages that must be shipped from one port to another

// The ith package on the conveyor belt has a weight of weights[i]. 
// Each day, we load the ship with packages on the conveyor belt (in the order given by weights). 
// We may not load more weight than the maximum weight capacity of the ship.

// Return the least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped
// using all the availableShips

public class CapacityToShipPackages {

    public static boolean willThisCapacityWork(int[] weights, int availableShips, int capacity) {
        int shipsWeNeed = 1, loadWeHave = 0;

        for (int i = 0; i < weights.length; i++) {
            loadWeHave += weights[i];

            if (loadWeHave > capacity) {
                shipsWeNeed += 1;
                loadWeHave = weights[i];
            }
        }

        if (shipsWeNeed > availableShips)
            return false;

        return true;
    }

    public static int shipWithinDays(int[] weights, int availableShips) {

        // minimum capactiy of the ship would be the max weight we even have
        // max capacity would be the sum of all the weights
        // imagine we just have 1 ship - so in that case the cap would be sum

        // so now that we have a search space, we need to keep searching for the
        // smallest cap that will be eligible with the number of availableShips

        int left = 0, right = 0, mid = 0;
        int minimumCap = Integer.MAX_VALUE;
        for (int i = 0; i < weights.length; i++) {
            left = Math.max(left, weights[i]);
            right += weights[i];
        }

        while (left <= right) {
            mid = left + (right - left) / 2;
            int capacity = mid;

            // so now if this capacity is enough for the ship to take all the loads within
            // the days
            // let's try looking for the minimum capacity
            // bee greedy, look to the left side

            // if the capacity won't work, we need to find a valid cap
            // let's look on the right side

            if (willThisCapacityWork(weights, availableShips, capacity)) {
                minimumCap = Math.min(minimumCap, capacity);
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return minimumCap;
    }

    public static void main(String[] args) {
        int[] weights = { 1, 2, 3, 1, 1 };
        System.out.println(shipWithinDays(weights, 4));
    }
}
