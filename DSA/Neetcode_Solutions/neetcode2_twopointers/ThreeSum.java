//! Question: https://leetcode.com/problems/3sum/description/
//& Description: Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that
//& i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//& Notice that the solution set must not contain duplicate triplets.

// The approach is really easy
// We take one number , and then do 2 sum with the other 2 number.

// We sort the array at first. Let it be : [0,-2,-2,-2,-1,1,2,2,2]
// Then we will start the traversal.

// value of i = 0
// low is -2, high is 2
// Therefore we PRINT 🎉 [ 0, -2, 2]

// After printing
// But notice the thing : 
//  [0,-2,-2,-2,-1,1,2,2,2]
//   |     |           |

// We again get [0, -2, 2], and then again [0, -2, 2]
// That is the reason we did   while ((low < high) && (nums[low] == nums[low + 1]))
// And  while ((low < high) && (nums[high] == nums[high - 1]))

// That way we will skip all duplicates and then end up here : 
//  [0,-2,-2,-2,-1,1,2,2,2]
//            |      |  

// After that we do low++ and high++ so that we can end up : 
//  [0,-2,-2,-2,-1,1,2,2,2]
//               | |   

// Now we get the array [0, -1, 1], which is not duplicate

// Also notice that if ((i > 0 && nums[i] != nums[i - 1]) || (i == 0)) 
// Why do we use this ? 
// If we have an array : [ -1 -1 -1 -1  0 1]

// First we get [-1,0,1] , Then i++
// Now we again get [-1, 0, 1]

// That is the reason why we did if we are not at the first index, always check
// If nums[i] == nums[i - 1], that means we have already covered that value of i
// no need to do it again.

import java.util.*;

public class ThreeSum {
    static void runBrute(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> output = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {

            if ((i > 0 && nums[i] != nums[i - 1]) || (i == 0)) {

                int low = i + 1, high = nums.length - 1;
                while (low < high) {

                    int neededSum = 0 - nums[i];
                    int sum = nums[low] + nums[high];

                    if (sum < neededSum)
                        low++;
                    else if (sum > neededSum)
                        high--;
                    else {
                        System.out.println(nums[i] + " " + nums[low] + " " + nums[high]);
                        output.add(Arrays.asList(nums[i], nums[low], nums[high]));

                        while ((low < high) && (nums[low] == nums[low + 1]))
                            low++;

                        while ((low < high) && (nums[high] == nums[high - 1]))
                            high--;

                        low++;
                        high--;
                    }
                }
            }

        }

        // return output;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 0, 0 };

        runBrute(nums);
    }
}