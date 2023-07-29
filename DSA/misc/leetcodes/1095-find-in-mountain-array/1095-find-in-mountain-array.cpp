 int peakIndexInMountainArray(vector<int>& arr) {
        
        int start = 0, end = arr.size()-1;
        
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(arr[mid-1]<arr[mid] && arr[mid]<arr[mid+1])
                start = mid + 1;
            
            if(arr[mid-1]>arr[mid] && arr[mid]>arr[mid+1])
                end = mid - 1;
            
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
                return mid;
        }
        
        return 0;
    }

int main() {
    vector<int> arr={0,1,2,3,4,5,6,2,1};
    int target = 4;
    
    int peak = peakIndexInMountainArray(arr);
    
     int start = 0,end = peak,mid=0;
        while(start<=end)
        {
            mid = (start + end)/2;
            
            if(arr[mid] == target)
            {
                cout<<mid;
                return 0;
            }
              
            
            if(arr[mid]<target)
                start = mid + 1;
            else 
                end = mid - 1;
        }
        
        start = peak + 1, end = arr.size()-1;
        
        while(start<=end)
        {
             mid = (start + end)/2;
            if(arr[mid] == target)
               {
                cout<<mid;
                return 0;
            }
            
            if(arr[mid]<target)
                end = mid - 1;
            else 
               start = mid + 1;
        }
    return 0;
    
}
