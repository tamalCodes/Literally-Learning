class Solution {
public:
    bool containsNearbyDuplicate(vector<int>& nums, int k) {
        unordered_map<int,int>mp;
        int n =  nums.size();
        
        for(int i=0;i<nums.size();i++)
        {
            // hey have we seen this element before
            if(mp.count(nums[i])){
                // yes we have seen this element
                // let us check if <=k 
                if(abs(i-mp[nums[i]])<=k)
                    return true;
            }
            
            // no we have not seen this element before
            mp[nums[i]] = i;
        }
        
        return false;
        
        
        
    }
};

// naive soln will be to use 2 loops
// define a map
// then we traverse the whole array. and remember/store the value
// 
