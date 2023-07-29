class Solution {
public:
    int arithmeticTriplets(vector<int>& nums, int diff) {
        
        set<int>s(nums.begin(), nums.end());
        int ans = 0;
        
        for(int i = 0; i<nums.size(); i++)
        {
            if(s.find(nums[i]-diff)!=s.end() && s.find(nums[i]-2*diff)!=s.end())
                ans ++;
        }
        
        return ans;
        
    }
};

// brute force 1 : run 3 loops

// brute force 2 : run 2 loops lets say the array is [ 0 4 6 7 10], dif = 3
// if we iterate over 7 we can say je 7-3=4
// then we iterate over 4 and say 4-3=1 and so on !

// Set : so we are gonna convert the whole thing to a set and just check if there are 1,4 if there is then good !