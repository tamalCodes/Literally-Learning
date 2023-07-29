class Solution {
public:
    
   int leftSearch(vector<int>& nums, int target)
{   
    int start = 0, end = nums.size()-1;
    
    while(start<=end)
    {
        int mid = (start + end)/2;
        
         if(nums[mid]>target)
             end = mid - 1;
        else if (nums[mid]<target)
            start = mid + 1;
        else
        {
            
            if(nums[mid-1]==target)
                end = mid - 1;
            
            if(nums[mid-1]<target)
            return mid;
        }
    }
    return -1;
}

int rightSearch(vector<int>& nums, int target)
{   
    int start = 0, end = nums.size()-1;
    
    while(start<=end)
    {
        int mid = (start + end)/2;
        
         if(nums[mid]>target)
             end = mid - 1;
        else if (nums[mid]<target)
            start = mid + 1;
        else
        {
            
            if(nums[mid+1]==target)
               start = mid + 1;
            
            if(nums[mid+1]>target)
                return mid;
        }
    }
    return -1;
}
    
    vector<int> searchRange(vector<int>& nums, int target) {
        
        vector<int> a {};
        
        a.push_back(leftSearch(nums, target));
        a.push_back(rightSearch(nums, target));
      
        
        return a;
    }
};

// BF will be to use 2 loops 
//  like say we have 1 2  7 7 7 7 7  8 so if target is 7 i will be at 7 start and j will be another loop

// Opt : divide the array in 2 parts, find left half , find right half
