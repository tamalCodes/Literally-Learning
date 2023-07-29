class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        
        unordered_map<int,int>mp;
        int n =  nums.size();
        
        for(int i=0;i<nums.size();i++)
        {
            // hey have we seen this element before
            if(mp.count(nums[i])){
                // yes we have seen this element
                return true;
            }
            
            // no we have not seen this element before
            mp[nums[i]] = i;
        }
        
        return false;
        
    }
};
// naive : for loops
// naive : sort 
// map