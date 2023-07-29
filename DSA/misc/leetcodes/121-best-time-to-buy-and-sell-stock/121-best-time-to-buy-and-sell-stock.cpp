class Solution {
public:
    int maxProfit(vector<int>& prices) {
        
        int m = 10001;
        int profit = 0;
        
        for(int i=0;i<prices.size();i++)
        {
          
            
            m = min(m,prices[i]);
            
            profit = max(profit, prices[i]-m);
            
            
        }
        
        return profit;
        
    }
};

// Naive : Sort()
// BF : 2 for loops
// Better soln  = linear traverse and 2 var 1 for max profit, another for min cost price