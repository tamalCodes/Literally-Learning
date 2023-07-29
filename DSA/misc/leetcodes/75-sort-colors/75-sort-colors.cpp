class Solution {
public:
    void sortColors(vector<int>& nums) {
        
        int low=0,mid=0,high=nums.size()-1;
        
        while(mid<=high)
        {
            if(nums[mid]==0)
            {
                swap(nums[mid++],nums[low++]);
            }
            else if(nums[mid]==2)
            {
                swap(nums[high--],nums[mid]);
            }
            else
            {
                mid++;
            }
            
        }
        
    }
};

// very naive : use sort()
// another BF : sorting the algo
// best : 3 pointers 
