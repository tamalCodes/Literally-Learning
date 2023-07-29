class Solution {
public:
    vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
       
        //sort
        sort(nums1.begin(), nums1.end());
        sort(nums2.begin(), nums2.end());
        vector<int> result;
        
        // 2 pointers
        int x = 0, y = 0;

    while (x < nums1.size() && y < nums2.size())
    {
        if (nums1[x] < nums2[y])
        {
            x += 1;
        }
        else if (nums1[x] > nums2[y])
        {
            y += 1;
        }
        else
        {
            result.push_back(nums1[x]);
            x += 1;
            y += 1;
        }
    }
        
        return result;
  
    }
};