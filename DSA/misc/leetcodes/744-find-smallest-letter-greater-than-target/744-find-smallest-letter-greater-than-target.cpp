class Solution {
public:
    char nextGreatestLetter(vector<char>& letters, char target) {
        
        int start = 0, end = letters.size()-1;
        
        while(start<=end)
        {
            int mid = (start+end)/2;
            
            if(letters[mid]>target)
                end = mid - 1;
            else
                start = mid + 1;
           
        }
        
        return letters[start % letters.size()];
        
    }
};

// BF : check every letter
// Nahole do ceiling approach ! 