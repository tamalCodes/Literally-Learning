class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int curMax = 0, maxTillNow = INT_MIN;
        for(auto c : nums)
            curMax = max(c, curMax + c),
            maxTillNow = max(maxTillNow, curMax);
        return maxTillNow;
    }
};

  // int maxSubArray(int A[], int n) {
        // int ans=A[0],i,j,sum=0;
       // for(i=0;i<n;i++){
       //     sum+=A[i];
       //     ans=max(sum,ans);
       //     sum=max(sum,0);
     //   }
     //   return ans;
    //}