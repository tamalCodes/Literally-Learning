// The intuition here is simple 
// suppose our total is 23, mod 6 is 5
// then after adding some more stuffs now our total is 29, mod 6 is again 5

// so if the remainder is same, that means whatever we added in between is exactly the subarray 
// the sum of that subarray % 6 would be 0

// So then we check if the index of the current element MINUS the index of the remainder is > 1
// because we need simply 2 OR MORE elements

import java.util.HashMap;

public class ContinuosSubarraySum {
    public boolean checkSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int total = 0, remainder = 0;

        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            remainder = total % k;

            if (map.containsKey(remainder)) {

                if (i - map.get(remainder) > 1)
                    return true;
            } else {
                map.put(remainder, i);
            }
        }

        return false;
    }
}
