class Solution {
public:
    
    bool even(int n)
    {
        int count = 0;
         while(n>0)
         {
             count ++;
             n=n/10;
         }
        if(count%2==0)
            return true;
        else
            return false;
    }
    
    int findNumbers(vector<int>& nums) {
        int count = 0;
        
        for(int i=0;i<nums.size();i++)
        {
            if(even(nums[i]))
                count++;
        }
        
        return count;
    }
};